package com.zackmon99.android.libLifeConnect
import com.google.gson.annotations.SerializedName

data class ModifyPartnerCommanderRequest (
        @SerializedName("gameId")
        val gameId: String,
        @SerializedName("playerId")
        val playerId: String,
        @SerializedName("partnerCommander")
        val partnerCommander: Boolean
)