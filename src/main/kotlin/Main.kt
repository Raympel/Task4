class Herbivores(var favoriteFood: String, var habitat: String)  {
    fun listH(): ArrayList<String> {
        return arrayListOf(favoriteFood, habitat)
    }

}
class Carnivores(var favoritePlant: String, var habitat: String) {
    fun listC(): ArrayList<String> {
        return arrayListOf(favoritePlant, habitat)
    }
}

fun  printSome (collection: List<Any>) {
    collection.forEach{el -> println("$el")}
}

fun main() {

    val wolf = Herbivores("meat", "forest")
    val owl = Herbivores("mouse", "forest")

    val sheep = Carnivores("grass", "meadow")
    val rabbit = Carnivores("grass", "forest")

    val collection: ArrayList<Any> = arrayListOf()

    collection.add(wolf.listH())
    collection.add(owl.listH())
    collection.add(sheep.listC())
    collection.add(rabbit.listC())

    printSome(collection)
}