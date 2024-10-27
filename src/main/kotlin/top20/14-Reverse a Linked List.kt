package top20

data class Node<T>(var value:T, var nextNode:Node<T>? = null){
    override fun toString(): String {
        return if (nextNode!=null){
            "$value -> ${nextNode.toString()}"
        }else{
            "$value"
        }
    }
}

class LinkedList<T>{
    private var head:Node<T>?= null
    private var tail:Node<T>?= null
    private var size = 0

    fun isEmpty():Boolean{
        return size == 0
    }

    override fun toString(): String {
        if(isEmpty()){
            return "Empty list"
        }else{
            return head.toString()
        }
    }

    fun push(value:T){
        head = Node(value = value, nextNode = head)
        if (tail == null){
            tail = head
        }
        size++
    }

    fun append(value: T){
        if (isEmpty()){
            push(value)
            return
        }
        tail?.nextNode = Node(value = value, nextNode = null)
        tail = tail?.nextNode
        size++
    }

    fun reverseLinkedList(){
        var prev:Node<T>? = null
        var current = head
        var next:Node<T>? = null
        var tail = head

        while (current!=null){
            next = current.nextNode
            current.nextNode = prev
            prev = current
            current = next
        }

        head = prev
    }

}

fun main(){
    val linkedList = LinkedList<Int>()

    val values = listOf(1,2,3,4,5)
    for (i in values){
        linkedList.append(i)
    }

    println("Original Linked List: $linkedList")

    linkedList.reverseLinkedList()

    println("Reversed Linked List: $linkedList")
}