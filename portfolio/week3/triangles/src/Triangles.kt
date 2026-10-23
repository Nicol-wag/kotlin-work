// COMP2850 Portfolio: Week 3
// Functions for working with triangle geometry

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

fun isValidTriangle(triangle: Triangle): Boolean {
    val (a, b, c) = triangle
    return a < b + c && b < a + c && c < a + b
}

fun triangleArea(triangle: Triangle): Double {
    require(isValidTriangle(triangle)) { "Invalid triangle: $triangle" }
    val (a, b, c) = triangle
    val s = (a + b + c) / 2
    return sqrt(s * (s - a) * (s - b) * (s - c))
}
