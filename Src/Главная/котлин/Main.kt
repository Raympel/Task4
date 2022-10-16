open class Animals(var weight: Int, var age: Int){
}

class Herbivores(var favoritePlant: String, var habitat: String, weight: Int, age: Int) :Animals(weight, age) {
    fun listH(): ArrayList<Any> {
        return arrayListOf(favoritePlant, habitat, weight, age)
    }
}

class Carnivores(var favoriteFood: String, var habitat: String, weight: Int, age: Int) : Animals(weight, age) {
    fun listC(): ArrayList<Any> {
        return arrayListOf(favoriteFood, habitat, weight, age)
    }
}


fun  printSome (collection: List<Any>) {
    collection.forEach{el -> println("$el")}
}

fun main() {

    val wolf = Herbivores("meat", "forest", 40,7)
    val owl = Herbivores("mouse", "forest",15, 9)

    val sheep = Carnivores("grass", "meadow", 50, 9)
    val rabbit = Carnivores("grass", "forest", 7, 3)

    val collection: ArrayList<Any> = arrayListOf()

    collection.add(wolf.listH())
    collection.add(owl.listH())
    collection.add(sheep.listC())
    collection.add(rabbit.listC())

    printSome(collection)
}
