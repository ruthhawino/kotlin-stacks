fun main() {
  var myStack =Stack()
    println(myStack.peek())
    println(myStack.pop())
    println(myStack.isEmpty())
    println(myStack.push(34))
    println(myStack.push(12))
    println(myStack.peek())
    println(myStack.push(3))
    println(myStack.push(7))
    println(myStack.pop())
    println(myStack.peek())

    var x = myStack.pop()
    var y = myStack.pop()
    var z = x!!+y!!
    println(x)


}
class Stack{
    var data = mutableListOf<Int>()

    fun push(value:Int){
        data.add(value)//adding data to our function
    }
    fun pop():Int?{
        if(data.isEmpty()){
            return null
        }
        val top = data[data.lastIndex]
        data.removeAt(data.lastIndex)
        return top
    }

    fun peek():Int?{
        if(data.isEmpty()){
            return null
        }

       return data[data.lastIndex]
    }

    fun isEmpty():Boolean{
        if(data.isEmpty()){
            return true
        }

       return false
    }

    fun reversestring(){
        
    }
}