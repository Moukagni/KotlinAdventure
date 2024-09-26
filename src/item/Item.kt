package item

import jeu.TirageDes
import personnage.Personnage
import javax.management.Descriptor

open class Item (val nom: String, val description: String) {
    open fun utiliser(cible: Personnage) {
        println("$nom ne peut pas être utilisé .")
    }

    override fun toString(): String {
        return "${nom} (nom='$nom',description='$description')"
    }
}
