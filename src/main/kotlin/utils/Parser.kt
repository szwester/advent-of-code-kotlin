package utils

fun String.getInts(): List<Int> = """\d+""".toRegex().findAll(this).map(MatchResult::value).map(String::toInt).toList()
fun String.getInt(): Int? = """\d+""".toRegex().find(this)?.value?.toInt()
fun String.getChars(start: Int, interval: Int): List<Char?> = this.filterIndexed { index, _ -> index == start || (index - start) % interval == 0 }
    .map { if(it.isLetter()) it else null }.toList()