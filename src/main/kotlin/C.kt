class C:A,B {
    override fun F() {
        super<A>.F();
        super<B>.F();
    }


}