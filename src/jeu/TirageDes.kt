package jeu

class TirageDes(val nbDe:Int, val maxDe:Int) {

    fun lance():Int{
        // Si on lance 3d8
        // nbDe = 3 correspond au nombre de dés que l'on souhaite lancer
        // maxDe = 8 correspond au nombre de face du dé et aussi a la valeur maximum du dé
        // resultat =0
        // on lance le premier dé on fait un 4
        // resultat =4
        // on lance le deuxième dé on fait un 3
        // resultat =7
        // on lance le troisème dé on fait un 8
        // resultat = 15
        // la méthode retourne 15
        var resultat=0
        repeat(this.nbDe){
            resultat+=(1..this.maxDe).random()
        }
        return resultat
    }
}