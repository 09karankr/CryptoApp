package com.example.cryptoapp.fragment.models


import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class CryptoCurrency(
    @SerializedName("auditInfoList")
    val auditInfoList: List<AuditInfo>,
    @SerializedName("badges")
    val badges: List<Int>,
    @SerializedName("circulatingSupply")
    val circulatingSupply: Double,
    @SerializedName("cmcRank")
    val cmcRank: Double,
    @SerializedName("dateAdded")
    val dateAdded: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("isActive")
    val isActive: Double,
    @SerializedName("isAudited")
    val isAudited: Boolean,
    @SerializedName("lastUpdated")
    val lastUpdated: String,
    @SerializedName("marketPairCount")
    val marketPairCount: Double,
    @SerializedName("maxSupply")
    val maxSupply: Double,
    @SerializedName("name")
    val name: String,
    @SerializedName("platform")
    val platform: Platform,
    @SerializedName("quotes")
    val quotes: List<Quote>,
    @SerializedName("selfReportedCirculatingSupply")
    val selfReportedCirculatingSupply: Double,
    @SerializedName("slug")
    val slug: String,
    @SerializedName("symbol")
    val symbol: String,
    @SerializedName("tags")
    val tags: List<String>,
    @SerializedName("totalSupply")
    val totalSupply: Double
) : Serializable{
    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }

    override fun toString(): String {
        return super.toString()
    }
}