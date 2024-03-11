package com.example.cryptoapp.fragment

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.LifecycleCoroutineScope
import androidx.lifecycle.lifecycleScope
import com.bumptech.glide.manager.Lifecycle
import com.example.cryptoapp.R
import com.example.cryptoapp.adapter.TopMarketAdapter
import com.example.cryptoapp.apis.ApiInterface
import com.example.cryptoapp.apis.ApiUtilities
import com.example.cryptoapp.databinding.FragmentHomeBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


class HomeFragment : Fragment() {

  private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(layoutInflater)
        getTopCurrencyList()
        return binding.root
    }

    private fun getTopCurrencyList(){
       lifecycleScope.launch(Dispatchers.IO) {
           val res = ApiUtilities.getInstance().create(ApiInterface::class.java).getMarketData()

           withContext(Dispatchers.Main){
               binding.topCurrencyRecyclerView.adapter = TopMarketAdapter(requireContext(),res.body()!!.data.cryptoCurrencyList)
           }
           Log.d("SHUBH","getTopCurrencyList: ${res.body()?.data?.cryptoCurrencyList}")
       }
    }
}

