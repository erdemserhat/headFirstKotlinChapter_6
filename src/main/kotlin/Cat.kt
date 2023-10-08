class Cat(override var name: String, override var age: Int) : Animal() {
    override fun roam() {
        println("cat is roaming")
    }
    fun go(){
        println("going")
    }



}