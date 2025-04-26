package com.example.bootcamphw

class Harf {

    fun kelimeAdeti(kelime:String,harfs:Char){
        var sonuc = 0

        for (k in kelime){

            if (k == harfs){
                sonuc = sonuc + 1
            }

        }

        println("Harf adeti : $sonuc")
    }

}