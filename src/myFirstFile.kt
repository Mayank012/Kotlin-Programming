
fun main(args: Array<String>) {

  var rect = Rectangle()
  rect.length = 5
  rect.breadth = 6

  print("The length of rectangle is ${rect.length} & breadth is ${rect.breadth}. The Area is ${rect.length * rect.breadth}")
}
 class Rectangle {

   var length: Int = 0
   var breadth: Int = 0

 }
