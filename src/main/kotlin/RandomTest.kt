import java.util.*

class RandomTest {
    fun testRandom(a: Int) {
        println("test start")
        var xx: Int
        do {
            xx = (0..a).random()
            print("$xx\t")
        } while (xx != a)
        println("test over")
    }

    fun arrayRandom(x: Int, range: Int) {
        val testArray = arrayOfNulls<Int>(x)
        // for 迴圈 賦予值
        for (i in testArray.indices) {
            testArray[i] = (0..range).random()
        }
        println("取出陣列為:${testArray.toList()}")
        // for 迴圈 列印值
//        for (d in testArray.withIndex()) {
//            println("idx: ${d.index}, value: ${d.value}")
//        }
        testArray.sort() //重新排序 Array 從小到大
        println("重新排列後:"+testArray.toList())
//        for (i in 0..(testArray.size - 1)) {
//            print("[$i]：${testArray[i]}  ")
//        }
    }
}

fun main() {
    val randomTest = RandomTest()
    val scanner = Scanner(System.`in`)
    println("優先測試Random讀取範圍是否出現異常")
    println("請輸入一個數字(此為範圍上限):")
    val a = scanner.nextInt()  //random 範圍值
    randomTest.testRandom(a)
    println("正式開始範圍中 隨機亂數取號")
    println("請輸入要取出的數量:")
    val x = scanner.nextInt() // 設定取出數量
    println("請輸入要取出的範圍上限:")
    val range = scanner.nextInt() // 設定取出範圍
    if (x < range) {
        randomTest.arrayRandom(x, range)
    } else println("取出數量大於 取出範圍 Error 請重新輸入")
}