package item

import jeu.TirageDes
import kotlin.random.Random
import personnage.Personnage

class Arme ( nom:String = "" ,
             description:String = "" ,
             var typeArme:TypeArme ,
             var qualite: Qualite ): Item(description,nom) {

    override fun utiliser(cible: Personnage) {
        fun calculDegat() {
            var degat = TirageDes(this.typeArme.nombreDes, this.typeArme.valeurDeMax).lance()
            val tirageDeCritique = TirageDes(1, 20)
            val resultatCritique = tirageDeCritique.lance()
            if (resultatCritique >= this.typeArme.activationCritique) {
                println("Coup Critique")
                degat *= this.typeArme.multiplicateurCritique
            }
            degat += qualite.bonusQualite
            return calculDegat()
        }
    }
}