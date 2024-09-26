package item

import personnage.Personnage

class Potion(
    nom: String ="",
    description: String = "",
    val soin: Int = 0,
) {
    fun utiliser(cible: Personnage) {

    }
}