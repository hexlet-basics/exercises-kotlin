fun testSolution() {
    val original = Product("Notebook", 100)
    val reduced = discounted(original, 15)
    expectEquals(Product("Notebook", 85), reduced)
    expectEquals("Notebook", reduced.name)
    expectEquals(100, original.price)
    expectTrue(original !== reduced)
    expectEquals(Product("Notebook", 100), Product("Notebook", 100))
    expectEquals(Product("Notebook", 100).hashCode(), original.hashCode())
    val unchanged = discounted(original, 0)
    expectEquals(original, unchanged)
    expectTrue(original !== unchanged)
    expectEquals(Product("Notebook", 0), discounted(original, 100))
    expectEquals(Product("Free", 0), discounted(Product("Free", 0), 0))
    expectEquals(Product("Pen", 7), discounted(Product("Pen", 10), 3))
    expectEquals("Product(name=Notebook, price=100)", original.toString())
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}
