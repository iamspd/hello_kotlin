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

    println(""+ i + "\n"+ j +"\n"+ k)

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
}








