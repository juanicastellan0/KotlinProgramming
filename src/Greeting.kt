import java.util.*

/**...*/
fun main(args: Array<String>){
    println("Hiiiiii")
    println(plus(1, 2))

    val scan = Scanner(System.`in`)
    println("Write two numbers")
    println("Number one: ")
    val numberOne = scan.nextInt()
    println("Number two: ")
    val numberTwo = scan.nextInt()

    greaterThan(numberOne, numberTwo)
}

fun plus(a : Int, b : Int) = a + b

fun greaterThan(a : Int, b : Int) = if (a > b) print("$a is greater than $b") else print("$a is less than $b")