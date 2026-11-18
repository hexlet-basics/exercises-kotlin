fun testSolution() {
    val original = Product("Notebook", 100)
    val reduced = discounted(original, 15)
    assert(reduced == Product("Notebook", 85))
    assert(reduced.name == "Notebook")
    assert(original.price == 100)
    assert(original !== reduced)
    assert(Product("Notebook", 100) == Product("Notebook", 100))
    assert(original.hashCode() == Product("Notebook", 100).hashCode())
    val unchanged = discounted(original, 0)
    assert(unchanged == original)
    assert(original !== unchanged)
    assert(discounted(original, 100) == Product("Notebook", 0))
    assert(discounted(Product("Free", 0), 0) == Product("Free", 0))
    assert(discounted(Product("Pen", 10), 3) == Product("Pen", 7))
    assert(original.toString() == "Product(name=Notebook, price=100)")
}

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        testSolution()
    }
}
