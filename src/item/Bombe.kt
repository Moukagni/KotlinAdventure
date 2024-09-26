package item
import jeu.TirageDes
import personnage.Personnage

class Bombe(
    val nombreDeDes: Int,
    val maxDe: Int,
    nom: String,
    description: String
): Item(nom, description)
{
    override fun utiliser(cible: Personnage) {

        fun utiliser(cible: Personnage) {
            var degats = TirageDes(nombreDeDes, maxDe).lance() - cible.calculeDefense()
            if (degats < 1) degats = 1
            cible.pointDeVie - degats
            println("${cible.nom} a subi $degats point(s) de dégats.")
        }
    }
}
