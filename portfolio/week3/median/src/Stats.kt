fun median(values: List<Float>): Float {
    require(values.isNotEmpty()) { "Cannot compute median of an empty list" }
    val sorted = values.sorted()
    val middle = sorted.size / 2
    return if (sorted.size % 2 == 1) {
        sorted[middle]
    } else {
        (sorted[middle - 1] + sorted[middle]) / 2
    }
}
