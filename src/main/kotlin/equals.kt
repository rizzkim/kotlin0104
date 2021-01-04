
fun main(args:Array<String>){
    class Person

    //Person 클래스의 인스턴스 생성
    val person1 : Person = Person()
    val person2 : Person = Person()

    //기존 인스턴스를 이용해서 생성
    val person3 : Person = person1

    //숫자 데이터가 아닌 인스턴스를 == 나 ===로 비교하면
    //연산자의 결과는 동일

    //person1 과 person2는 서로 다른 인스턴스이므로
    //결과는 false
    println(person1 == person2)
    println(person1 === person2)

    //person1 과 person2 가 동일한 인스턴스이므로 true
    println(person1 == person3)
    println(person1 === person3)

    //숫자 데이터의 경우는
    //== 저장하고 있는 데이터가 같은지 비교
    //=== 동일한 참조인지 비교
    //숫자 데이터를 생성자를 이용해서 생성하면
    //동일한 숫자라면 == 는 true를 리턴하고
    //===는 false를 리턴

    val n1 = Integer(500)
    val n2 = Integer(500)
    val n3 = n1
    println(n1 == n2) //저장하고 있는 값을 비교 : true
    println(n1 === n2) //참조를 비교 : false

    println(n1 == n3)
    println(n1 === n3)
    //이 경우는 생성자를 호출하지 않았으므로 동일한 인스턴스
    val n4 = 500
    val n5 = 500
    println(n4 === n5) //참조를 비교 : false


}