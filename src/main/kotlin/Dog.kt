class Dog(override var name: String, override var age: Int) : Animal() {
    override fun roam() {
        println("the dog is roaming")
    }
}