import item.Arme
import item.Qualite
import item.TypeArme
import item.TypeArmure
import item.Armure
import item.Bombe
import item.Potion
import jeu.Jeu
import personnage.Personnage

//Créattion des qualités des objets
val qualiteCommun = Qualite("commun", 0, "\u001B[32m")
val qualiteRare = Qualite("rare", 1, couleur = "\u001B[34m")
val qualiteEpic = Qualite("epic", 2, "\u001B[35m")
val qualiteLegendaire = Qualite("legendaire", 3, "\u001B[33m")

//TODO Sprint 1 Mission 2A et 2B Création des types d'armes/armures

//types armes
val typeEpeeLongue = TypeArme("Epee longue", 1, 8, 2, 20)
val typeEpee2Mains = TypeArme("Epee à 2 Mains", 1,11,4,25)
val typeKatana = TypeArme("Sabre Japonais",2,8,2,22)

//types armures
val typeRembourre = TypeArmure("Rembourré",1)
val typeCuir = TypeArmure("Cuir", 2)

//TODO Sprint 2 : Création de sorts
fun main(args: Array<String>) {
    // TODO Intemission 4 : Création des items ( armes, armures potions, bombes )

    //armes
    val epee = Arme("Épée Longue","Une épée longue tranchante",typeEpeeLongue, qualiteCommun)
    val zweihander = Arme("Zweihander", "Une lourde et longue épée à deux mains.", typeEpee2Mains, qualiteRare)
    val espasdonDeLaLuneObscure = Arme("Espasdon de la lune obscure", "Un espadon plus froid que la nuit", typeEpee2Mains, qualiteLegendaire)
    val rivers_of_blood = Arme("Rivers Of Blood","Katana tout provenant d'une pluie de sang",typeKatana,qualiteEpic)

    //armures
    val combinaison_spartan_117 = Armure("Combinaison spartan 117", "Combinaison de combat futuriste du spartan 177 (Master Chief).", typeRembourre, qualiteLegendaire)

    //potions
    val Blood_Heal = Potion("Revitalizing Blood","Permet de reprende des PV et échange d'un tour",15)

    //bombes
    val bombeExplosive = Bombe(2, 6, "Bombe explosive", "Bombre explosant en plusieurs morceaux et causant des dégats aux ennemis, les dégats sont aléatoires.")

    //Création des monstres
    val gobelin = Personnage(
        "Gob le gobelin",
        pointDeVie = 20,
        pointDeVieMax = 20,
        attaque = 5,
        defense = 4,
        vitesse = 11,
        endurance = 6)

    // TODO Intermission 1 : Ajouter d'autres monstres
    val slime = Personnage(
        "Le pauvre petit slime quasi inoffensif qui n'a rien demandé",
        pointDeVie = 5,
        pointDeVieMax = 5,
        attaque = 1,
        defense = 1,
        vitesse = 1,
        endurance = 1)


    val ombreDuCimetiere = Personnage(
        "Ombre du cimetière",
        pointDeVie = 150,
        pointDeVieMax = 150,
        attaque = 20,
        defense = 5,
        vitesse = 20,
        endurance = 7 )


    val godzilla = Personnage(
        "Godzilla",
        pointDeVie = 500,
        pointDeVieMax = 500,
        attaque = 30,
        defense = 30,
        vitesse = 5,
        endurance = 10)


    val kraken = Personnage(
        "Davy Jones",
        pointDeVie = 472,
        pointDeVieMax = 472,
        attaque = 22,
        defense = 15,
        vitesse = 14,
        endurance = 10)

    val satyre = Personnage(
        "Satyre",
        pointDeVie = 30,
        pointDeVieMax = 30,
        attaque = 10,
        defense = 8,
        vitesse = 15,
        endurance = 10)

    //TODO On ajoute les monstres a la liste de monstres du jeu
    val jeu = Jeu(listOf(gobelin, slime,  ombreDuCimetiere, godzilla, satyre, kraken))
    //Lancement du jeu
    jeu.lancerCombat()
}

