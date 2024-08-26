class Box (val width: Int, val height: Int, val depth: Int) {

    fun volume (): Int{
        return width * height * depth
    }
}