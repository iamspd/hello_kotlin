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
 *
 */

fun main() {

    // println("Hello world!")

    /** kotlin is strongly typed language, it does a lot to infer the type of variable
     *  however, no need to define dataType while initializing variables
     *  'val' states that the value of the variable will be fixed and can't be changed,
     *  use 'var' otherwise.
     */

    val i: Int = 8

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
}







