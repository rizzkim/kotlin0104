fun main(args:Array<String>){
    val score : Int = 90
    //score 가 90이상이면 합격 그렇지 않으면 불합격이라고 출력
    if(score >= 90) println("합격") else println("불합격")
    println("실행"); println("실행")

    var food:String = "짬뽕"
    when(food){
        "짜장면", "짬뽕" -> println("중식")
        "김치찌개" -> println("한식")
        "규동" -> println("일식")
        else -> println("분식")
    }
    //값에 Boolean 식을 사용하는 것도 가능
    when{
        food is String -> println("food는 문자열")
        else -> println("food는 문자열이 아님")
    }

    val jumsu : Int = 50
    when{
        jumsu in 60..100 -> println("합격")
        else -> println("불합격")
    }

}