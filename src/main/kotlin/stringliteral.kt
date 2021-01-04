//String 대신에 str을 사용하는 것이 가능. (Top Level에 작성해야한다.)
typealias str = String

fun main(args:Array<String>){
    //raw String
    var msg = "Hello\nKotlin"
    println(msg)
    msg="""Hello
        Kotlin
    """.trimMargin()
    println(msg)

    var n1 = 10
    var n2 = 20
    //n1+n2=30 이런 형태로 출력
    msg = "${n1}+${n2}=${n1+n2}"
    println(msg)

    var ch : Char = 65.toChar()
    println(ch)     //A
    ch = '\uD55C'   //한이라는 글자를 유니코드로 삽입
    println(ch)
    ch = '\\'
    println(ch)

    var x : Int = 20
    var y : Int = 3
    x %= y
    println("결과는 : ${x}")
}