package com.zackmon99.android.libLifeConnect
import com.google.gson.annotations.SerializedName

data class ModifyPoisonRequest (
        @SerializedName("gameId")
        val gameId: String,
        @SerializedName("playerId")
        val playerId: String,
        @SerializedName("amount")
        val amount: Int
)