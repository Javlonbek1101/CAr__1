import java.time.Year

open class Car {
    open fun show(name: String, year: Int, color: String, module: String, weght: String, state: String) {
        println("Car name is $name")
        println("Car name is $year")
        println("Car name is$color")
        println("Car name is$module")
        println("Car name is$weght")
        println("Car name is$state")
    }
}