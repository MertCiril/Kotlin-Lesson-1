package com.mertciril.kotlin1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("onCreate")

        var integer : Int // int tanımlama bu şekilde yapılır
        //var sonradan değişirken val sabittir

        val list = ArrayList<String>() // ArrayList tanımlama
        list.add("Mert")

        println("-------------------Set-------------------") //aynı değere ait verileri tutmaz örneğin iki tane 10 varsa bir tanesini atar
        val mySet = setOf<Int>(1,2,3,4,4,4,4)
        println("set size: ${mySet.size} \n\n\n")
        mySet.forEach {
            println(it)
        }

        println("-------------------Map-------------------") //değer ve anahtar kelime eşleşmesi olur
        val yemekDizisi = arrayOf("Kebap","Pilav","Tavuk","Köfte")
        val kaloriDizisi = arrayOf(100,200,300,400)

        //yukarıdaki gibi tutmak yerine map kullanılır ve olası hataları önler
        val yemekKaloriMap = hashMapOf<String,Int>("Kebap" to 100,"Pilav" to 200,"Tavuk" to 300,"Köfte" to 400)
        yemekKaloriMap.put("İskender",500) //yeni bir değer eklemek için
        println(yemekKaloriMap.get("Kebap")) //değer almak için



    }
    fun exampleFun(x:Int,y:Int,z:String){//fonk. girdi alma
        println("x: $x y: $y z: $z")
    }

    fun exampleFunWithReturn(x:Int,y:Int):Int{ //fonk. çıktı alma :Int çıktı tipi
        return x+y
    }

    fun change(view: View){
        if(textView.text == "Çiril"){
            textView.text = "Mert"
        }else{
            textView.text = "Çiril"
        }
    }
}