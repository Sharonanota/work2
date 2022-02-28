fun main(){
    val x=" I am  "
    val y=" 23 years old"
    println(x + " " + y)
   // var fruit= "Banana"
   // println(fruit[0])
   // println(fruit[1])
    //println(fruit[3])
    //println(fruit[4])
    //println(fruit[5])
    var sum=add(43,13,12)
    println(sum)
    var total=multiple(2,2,2)
    println(total)
    var u=subract(2022, 1999)
    println(u)

}
fun add(a:Int ,b:Int ,c:Int){
     println(a+b+c)
}
fun multiple(d:Int, e:Int, f:Int){
    println(d+e+f)
}
fun subract(g:Int, h:Int){
    println(g-h)
}