import java.util.*

/**
 * codeLab #1: fun printHello() {
 *                  println("Hello world!")
 *            }
 *
 * ----------- method or function call defined by 'fun' keyword
 *             function name 'printHello' - parenthesis are there for accepting parameters or arguments
 *             there is no need to write return type if function does not return anything
 *             no need to give semicolon at the end of the line, is ok otherwise!
 */

/** codeLab #2: 2.times(3)
 *
 * ------------ kotlin keeps numbers as primitive, but it lets
 *              you call methods on them as they were objects
 */

fun main() {

    // println("Hello world!")

    /** kotlin is strongly typed language, it does a lot to infer the type of variable
     *  however, no need to define dataType while initializing variables
     *  'val' states that the value of the variable will be fixed and can't be changed,
     *  use 'var' otherwise.
     */

    val i: Int = 8
    val a = 10

    /**
     * this is explicit type conversion in kotlin
     * to do this, use <variable>.to(datatype)
     * int i can't be parsed to double j, so converted i to double
     * and same for String k
     */
    val j: Double = i.toDouble()
    val k: String = i.toString()

    println("" + i + "\n" + j + "\n" + k)

    /**
     * kotlin allows to use underscore between the digits of long number
     * to encourage more readability
     */

    val longNumbers = 1_000_000
    println(longNumbers)

    /**
     * unlike Java, I can print the value of the variable using
     * String template '$variable' inside print statement
     * Is known as Variable Interpolation
     */
    println("make a $longNumbers lives easy!")

    // can directly define expression inside println function
    println("make ${longNumbers + 1_000_000} lives easy!!")

    if (a <= i) {
        println("$a is less than $i")
    } else {
        print("$a is greater than $i")
    }

    /**
     * to define range in a statement (1..1000)
     */
    if (a in 1..10) {
        println("$a is in range")
    }

    /**
     * replacement statement of switch
     * if/else.if/else --> use when
     */

    when (a) {
        0 -> println("the value is 0")
        in 1..10 -> println("the value of $a is in range")
        else -> println("Not a value!")
    }

    // -----------------------------------------------------------------------------------------------------

    /**
     * kotlin is a null-safe language, which means variable can't be null
     * unless specified to be
     * declare a null variable using '?' after the datatype
     */
    var n: Int? = null
    println("Nullable values $n")

    n = 9

    /**
     * if (n != null) --> n?
     * to check whether the variable is null or not
     * here, the variable is null then it gets the value after '?:' - the Elvis operator
     */
    n = n?.dec() ?: 0
    println("the updated value of $n")

    /**
     * double bang '!!' operator to assert that the value of the variable can't be null
     * otherwise gives NullPointerException
     * The language doesn't recommend it
     */
    val assertNotNull = n!!.dec()
    println(assertNotNull)

    /**
     * list declaration
     * the elements of the list are fixed and can't be changed
     */
    val goals = listOf("Alpha", "House", "Peace")
    println(goals)

    /**
     * mutable list where the list elements could be changed -> added or removed
     *
     * lists can have any type of element
     */
    val wishList = mutableListOf("Job", "Living", "Name - Priyank", "Investments", 0)
    println(wishList)

    // remove an element from a mutable list
    wishList.remove(0)
    // wishList.removeAt(4)
    println(wishList)

    /**
     * no type association in array, so they can be of any type
     * but of fixed size, there is no mutable array in kotlin -> neither element is removed nor added
     */

    val cars = arrayOf("Mercedes", "Audi", "Tesla", 4)
    println(cars.contentToString())

    // addition of arrays

    val numbers = intArrayOf(1, 2, 3)
    val numbers2 = intArrayOf(4, 5, 6)
    val addArrays = numbers + numbers2

    println(addArrays[4])

    /**
     * define arrays within lists and vice versa
     */

    val nestedList = listOf(cars, goals)
    println(nestedList)

    val nestedArrays = arrayOf(goals, cars)
    println(nestedArrays.contentToString())

    // initialize array using code
    // here, 'it' refers to array index starting from 0
    val initializedArray = Array (5) {it * 2}
    println(initializedArray.contentToString())

    for (car in cars) {
        print("for loop: $car \n")
    }

    /**
     * loop through elements while keeping track of index at same time
     */
    for ((index, element) in cars.withIndex()) {
        println("At index $index element is $element")
    }

    // using range function, you don't need to increment the index to move to next
    for (it in 1..5) print(it)

    // works for alphabets too
    for (it in 'a'..'c') print(it)

    // step 2 decides till which step the loop will iterate
    for (it in 1..5 step 2) print(it)

    print("\n")

    // iterate backwards in loop --> use downTo
    for (it in 5 downTo 1) print(it)


    // other loops ---------------------------------------
    var balls = 0

    // while loop
    while (balls < 50) balls++
    println("\nA person has $balls balls")

    // do..while loop
    do {
        balls --
    } while (balls > 50)
    println("now, balls are $balls")

    // repeat function that accepts the amount how many times a
    //  statement is going to repeat itself.
    repeat(2) { println("Keep going.") }

}








