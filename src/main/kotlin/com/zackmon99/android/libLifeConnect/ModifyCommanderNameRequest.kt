package com.zackmon99.android.libLifeConnect
import com.google.gson.annotations.SerializedName

data class ModifyCommanderNameRequest (
        @SerializedName("gameId")
        val gameId: String,
        @SerializedName("playerId")
        val playerId: String,
        @SerializedName("commanderNum")
        val commanderNum: Int,
        @SerializedName("amount")
        val name: String
)