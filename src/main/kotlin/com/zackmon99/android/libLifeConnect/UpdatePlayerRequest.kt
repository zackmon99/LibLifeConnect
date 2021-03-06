package com.zackmon99.android.libLifeConnect
import com.google.gson.annotations.SerializedName

data class UpdatePlayerRequest (
        @SerializedName("gameId")
        val gameId: String,
        @SerializedName("Player")
        val player: PlayerData
)