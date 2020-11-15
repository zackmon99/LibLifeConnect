import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable


data class CommanderDamageData(
    @SerializedName("playerNum")
    val playerNum: Int = 0,
    @SerializedName("commander1Damage")
    var commander1Damage: Int = 0,
    @SerializedName("commander2Damage")
    var commander2Damage: Int = 0
)