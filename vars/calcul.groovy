#!/usr/bin/env groovy
import java.lang.*
import java.util.*
import java.io.*
import java.net.*
import groovy.lang.*
import groovy.util.* 

def add(x,y){
   echo "adding ${x} and ${y} results ${x+y}"
   }
   
 def mul(x,y){
    echo " multiplecation ${x} and ${y} results ${x*y}"
	}
	
 def makeList(list) {
    List created = new ArrayList()
    list.eachLine { line -> 
        created.add(line)
    }
    return created
} 

def string(input){
println string.length()
}
   