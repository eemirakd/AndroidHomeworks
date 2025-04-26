package com.example.bootcamphw

class kotaUcreti {

    fun hesapla(kota:Int):Int{

        var ucret = 0

        if (kota <= 50){
            ucret = 100
        }else{
            val asim = kota - 50
            ucret = 100 + (asim * 4)
        }


        return ucret

    }

}