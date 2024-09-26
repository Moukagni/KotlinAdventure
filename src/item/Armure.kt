package item

import personnage.Personnage

class Armure(
    nom: String ,
    description: String ,
    val typeArmure: TypeArmure,
    val qualite: Qualite
) : Item(description,nom) {
    override fun utiliser(cible: Personnage) {

        fun calculProtection(): Int {
            val totalProtection = this.qualite.bonusQualite + this.typeArmure.bonusType
            return totalProtection
        }

        fun utiliser(cible: Personnage) {

        }
    }
}