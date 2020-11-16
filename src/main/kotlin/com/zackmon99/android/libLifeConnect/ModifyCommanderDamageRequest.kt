package com.zackmon99.android.libLifeConnect
import com.google.gson.annotations.SerializedName

data class ModifyCommanderDamageRequest (
        @SerializedName("gameId")
        val gameId: String,
        @SerializedName("playerId")
        val playerId: String,
        @SerializedName("amount")
        val amount: Int,
        @SerializedName("fromPlayerNum")
        val fromPlayerNum: Int,
        @SerializedName("commanderNum")
        val commanderNum: Int
)