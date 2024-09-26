package jeu

import personnage.Personnage



class Jeu(monstres: List<Personnage>) {
    //Le personage du joueur
    lateinit var joueur: Personnage
    //La liste des monstre a combatre
     var combats: MutableList<Combat> = mutableListOf()
    //Le score
    var score: Int = 0

    // Corps du constructeur
    init {
        // Lancement de la création du personage du joueur
        this.creerPersonnage()
        // Pour chaque monstre dans la liste de monstres
        for (unMonstre in monstres){
            // On créer un combat
            val unCombat= Combat(this,unMonstre)
            combats.add(unCombat)
        }
    }

    fun lancerCombat() {
        for (unCombat in this.combats) {
            unCombat.executerCombat()
            // Mettre à jour le score en fonction du nombre de tours
            val tours = unCombat.nombreTours
            score += calculerScore(tours)
        }
        println("Score final du joueur: $score")
    }

    private fun calculerScore(tours: Int): Int {
        // Par exemple, vous pouvez attribuer plus de points pour moins de tours
        return 500 - tours * 10
    }

    /**
     *  Méthode pour créer le personnage du joueur en demandant les informations à l'utilisateur
     *
     */
    fun creerPersonnage(): Personnage {
        println("Création de votre personnage:")
        val nom = readln().toString()

        println("Vous avez 40 points d'attributs à répartir :")
        var total: Int = 0
        var attaque = 0
        var defense = 0
        var endurance = 0
        var vitesse = 0
        var pointDeVieMax = 0

        while (total > 40 || total < 40) {
            attaque = readln().toInt()
            defense = readln().toInt()
            endurance = readln().toInt()
            vitesse = readln().toInt()
            pointDeVieMax = 50 + (10 * endurance)
            total = attaque + defense + endurance + vitesse
            if (total > 40 )
                println("Vous avez distribué $total points , ce qui est supérieur à 40 . VEUILLEZ RÉESSAYER")
            else if (total < 40)
                println("Vous avez seulement attribué $total points, veuillez réessayer en attribuant tout vos points.")
            else
                println("Attribution de $total points RÉUSSI ! ")
        }

        // TODO Mission 1.1
        val hero = Personnage(nom,pointDeVieMax,pointDeVieMax,attaque,defense,endurance,vitesse)
        this.joueur = hero
        return hero
    }

}