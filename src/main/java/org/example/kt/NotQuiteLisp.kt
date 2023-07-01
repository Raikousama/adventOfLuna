package org.example.kt

fun main(vararg args:String) {
    var floorValue = 0;
    val strInput = args[0]
    for(c in strInput){
        if(c == '('){
            floorValue++;
        }else if(c == ')'){
            floorValue--;
        }
    }
    println("Floor for santa to reach is $floorValue")

}