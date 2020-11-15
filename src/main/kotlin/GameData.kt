import com.google.gson.annotations.SerializedName
import java.util.*


data class GameData (
    @SerializedName("gameId")
    val gameId: String = UUID.randomUUID().toString(),
    @SerializedName("gameName")
    val gameName: String = "",
    @SerializedName("numberOfPlayers")
    val numberOfPlayers: Int = 0,
    @SerializedName("players")
    var players: MutableList<PlayerData> = mutableListOf<PlayerData>()
)