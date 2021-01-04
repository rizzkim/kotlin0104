var rw : Int = 10 //변경가능한 변수를 생성
    get() {
        println("rw의 getter 호출")
        return field //원래의 값을 리턴
    }
    set(value : Int){
        println("rw의 setter 호출")
        field = value
    }
//var은 setter가 없는 것입니다.
//getter를 재정의해서 원래의 값과 다른 값 사용이 가능
var b : Boolean = true
var r : String = "Hello World"
    get(){
        if(b == true){
            return field.toUpperCase()
        } else {
            return field.toLowerCase()
        }
    }

fun main(args:Array<String>){
    rw = 100    //rw의 setter를 호출
    println(rw) //rw의 getter를 호출

    //r에 값을 대입하는 것은 안됨
    //r = "Hi"

    //b값에 의해서  r의 값이 다른 내용을 출력
    b = false
    println(r)
    b = true
    println(r)
}
