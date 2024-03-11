package com.example.cryptoapp.fragment.models


import com.google.gson.annotations.SerializedName

data class MarketModel(
    @SerializedName("data")
    val `data`: Data,
    @SerializedName("status")
    val status: Status
)