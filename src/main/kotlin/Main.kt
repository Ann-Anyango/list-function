fun main() {
//immutable list
val classes= listOf("Ann", "Mwangome","hope","grace")
    println(classes)
//    mutable list
    var colorSpace= mutableListOf("red","pich","marune")
    println(colorSpace)
   println(numbers.count())
    println(numbers.max())
    println(numbers.sum())
    println(numbers.first())
    println(colour[0])
    println(colour[3])
    println(soaart)
    println(sot)
    println(Fruits.add("Watermelon"))
    var people= listOf(person("Jnae",23,"female"))
    listOf(person("Saumu",21,"female"))
    var list= listOf(1,2,3,"Annjela","peshy","loice")
    for (element in list){
        println(element)
    }


    for (index in 0..list.size-1){
        println(index)

    }


}
//inbulding the  varible in a list
var numbers= listOf(21,34,56,78,90,32)

//list index
var colour= mutableListOf("red","blue","pink","yellow")
//list sort
var num= listOf(11,5,3,8,1,9)
var soaart=num.sorted()
var sot=num.sortedDescending()
var Fruits= mutableListOf("Apple","Mangoes","Oranges","berry","Strerries")
//list filtering
data class person (var name:String, var age:Int,var gender:String )