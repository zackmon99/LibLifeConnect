import java.util.*
import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable


data class PlayerData (
    @SerializedName("gameId")
    val gameId: String = UUID.randomUUID().toString(),
    @SerializedName("playerId")
    val id: String = UUID.randomUUID().toString(),
    @SerializedName("playerNum")
    val playerNum: Int = 0,
    @SerializedName("name")
    var name: String = "",
    @SerializedName("currentLife")
    var currentLife: Int = 0,
    @SerializedName("currentPoison")
    var currentPoison: Int = 0,
    @SerializedName("commander1Name")
    var commander1Name: String = "",
    @SerializedName("commander2Name")
    var commander2Name: String = "",
    @SerializedName("partnerCommander")
    var partnerCommander: Boolean = false,
    @SerializedName("commanderDamage")
    var commanderDamage: MutableList<CommanderDamageData> = mutableListOf<CommanderDamageData>()
)