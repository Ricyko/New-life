package model

import kotlinx.serialization.Serializable

@Serializable
class Credit(
    val id: Int,
    var sumCredit: Int,
    var balance: Int,
    val name : String,
    val userId: Int
)