fun main(args:Array<String>){
    //image1.png ~ image9.png 까지 출력
    for(idx in 1 .. 9 step 2){
       println("image${idx}.png")
    }

    //배열과 List 생성
    var ar = arrayOf<String>(
        "프로그래밍 언어", "자료구조와 알고리즘", "데이터베이스")
    var list = listOf<String>(
        "기본문법", "SDK에 대한 이해", "프레임워크" )

    //인덱스를 idx에 대입
    for(idx in ar.indices){
        println(idx)
    }
    //인덱스와 값을 idx에 대입
    for(idx in list.withIndex()){
        println(idx)
    }
}