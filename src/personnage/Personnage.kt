package personnage

import item.Arme
import item.Armure

class Personnage(
    val nom: String,
    var pointDeVie: Int,
    val pointDeVieMax: Int,
    var attaque: Int,
    var defense: Int,
    var endurance: Int,
    var vitesse: Int,
    var inventaire: MutableList<item.Item>? = null,
    var armePrincipal: Arme? = null,
    var armeSecondaire: Arme? = null,
    var armurePrinc: Armure? = null
) {
    fun equiperArmePrinc(arme: Arme){
        if (inventaire?.contains(arme) == true){
            armePrincipal = arme
            println("$nom à équipé l'arme ${arme.nom} comme arme principale")
        }else{
            println("L'arme ${arme.nom} n'est pas son arme Principale.")
        }
    }
    fun equiperArmurePrinc(armure: Armure){
        if (inventaire?.contains(armure) == true){
            armurePrinc = armure
            println("$nom à équipé l'arme ${armure.nom} comme arme principale")
        }
    }

     fun calculeDefense():Int{
         //TODO Mission 4.2
        return this.defense/2;
     }

     // Méthode pour attaquer un adversaire
     fun attaque(adversaire: Personnage) {
        //TODO Mission 4.1
       val degats= this.attaque/2
         adversaire.pointDeVie-=degats
        println("$nom attaque ${adversaire.nom} avec une attaque de base et inflige $degats points de dégâts.")
    }

    override fun toString(): String {
        return "$nom (PV: $pointDeVie/$pointDeVieMax, Attaque: $attaque, Défense: $defense, Endurance: $endurance, Vitesse: $vitesse)"
    }


}