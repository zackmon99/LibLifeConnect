package com.zackmon99.android.libLifeConnect
import com.google.gson.annotations.SerializedName

data class ModifyPlayerNameRequest (
        @SerializedName("gameId")
        val gameId: String,
        @SerializedName("playerId")
        val playerId: String,
        @SerializedName("name")
        val name: String
)