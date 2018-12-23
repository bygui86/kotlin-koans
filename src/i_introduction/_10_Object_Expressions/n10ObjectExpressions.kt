package i_introduction._10_Object_Expressions

import util.TODO
import util.doc10
import java.util.Collections

fun todoTask10(): Nothing = TODO(
    """
        Task 10.
        Read about object expressions that play the same role in Kotlin as anonymous classes in Java.

        Add an object expression that provides a comparator to sort a list in a descending order using 'java.util.Collections' class.
        In Kotlin you use Kotlin library extensions instead of java.util.Collections,
        but this example is still a good demonstration of mixing Kotlin and Java code.
    """,
    documentation = doc10()
)

fun task10(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)

    // Doc
    // https://kotlinlang.org/docs/reference/object-declarations.html

    // STEP 1: java-kotlin mix - first verbose solution
//    Collections.sort(arrayList, object : Comparator<Int> {
//            override fun compare(o1: Int, o2: Int): Int {
//                return o2.compareTo(o1)
//            }
//        }
//    )

    // STEP 2: java-kotlin mix - lambda verbose solution
//    Collections.sort(arrayList, Comparator<Int> { o1, o2 -> o2.compareTo(o1) })

    // STEP 3: java-kotlin mix - lambda optimal solution
//    Collections.sort(arrayList, { o1, o2 -> o2.compareTo(o1) })

    // STEP 4: kotlin optimal solution with custom comparator
    arrayList.sortWith(Comparator { o1, o2 -> o2.compareTo(o1) })

    // kotlin standard optimal solution
//    arrayList.sortDescending()

    return arrayList
}