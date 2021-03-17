import java.util.*

fun main() {
  materArray("laptop","book","pen","whiteboard")
  countryArray()
  numbers()
    var name=nameArray("chantal","Gerardine","sophie")
    println(Arrays.toString(name))

}
fun materArray(laptop:String,book:String,pen:String,whiteboard:String){
    var mater= arrayOf(laptop,book,pen,whiteboard)
   println(Arrays.toString(mater))
}
fun countryArray(){
    var cities = arrayOf("harare", "mumbai", "dodoma", "jakarta")
    println(cities[0].capitalize()+"  "+cities[1].capitalize()+"  "+cities[2].capitalize()+"  "+cities[3].capitalize())

}
fun numbers(){
    var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    val total=numbers[1]+numbers[4]
    println(total)
    println(numbers.indexOf(158))
    var num=numbers.sortedArray()
    num.forEach { number -> println(number)}


}
fun nameArray(name1:String,name2:String,name3:String):Array<String>{
    var name= arrayOf(name1,name2,name3)
    return name
}