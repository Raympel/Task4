class Herbivores(var favoritePlant: String, var habitat: String)  {
    fun listH(): ArrayList<String> {
        return arrayListOf(favoritePlant, habitat)
    }

}
class Carnivores(var favoriteFood: String, var habitat: String) {
    fun listC(): ArrayList<String> {
        return arrayListOf(favoriteFood, habitat)
    }
}

fun  printSome (collection: List<Any>) {
    collection.forEach{el -> println("$el")}
}

fun main() {

    val wolf = Carnivores("meat", "forest")
    val owl = Carnivores("mouse", "forest")

    val sheep = Herbivores("grass", "meadow")
    val rabbit = Herbivores("grass", "forest")

    val collection: ArrayList<Any> = arrayListOf()

    collection.add(wolf.listH())
    collection.add(owl.listH())
    collection.add(sheep.listC())
    collection.add(rabbit.listC())

    printSome(collection)
}
