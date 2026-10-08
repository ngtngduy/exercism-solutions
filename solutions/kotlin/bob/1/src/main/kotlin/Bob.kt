object Bob {
    fun hey(input: String): String {
        val newInput = input.trim()
        val isQuestion = newInput.endsWith('?')
        val hasLetter = newInput.any { it.isLetter() }
        val noLowerCase = newInput.none { it.isLowerCase() }
        val isYelling = noLowerCase && hasLetter
        
        return when {
            newInput.isEmpty() -> "Fine. Be that way!"
            isYelling && isQuestion -> "Calm down, I know what I'm doing!"
            isQuestion -> "Sure."
            isYelling -> "Whoa, chill out!"
            else -> "Whatever."
        }
    }
}
