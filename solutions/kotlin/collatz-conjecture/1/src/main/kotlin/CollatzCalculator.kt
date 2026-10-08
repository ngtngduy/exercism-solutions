object CollatzCalculator {
    fun computeStepCount(start: Int): Int {
        var count = 0
        var total = start 
        require(start > 0) { "Not allowed negative"}
        while (total > 1) {
            if (total % 2 == 0) {
                total = total / 2 
            } else {
                total = total * 3 + 1
            }
            count = count + 1
            }
        return count
    }
}
