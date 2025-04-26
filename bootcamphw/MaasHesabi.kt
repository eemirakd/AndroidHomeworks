package com.example.bootcamphw

class MaasHesabi {

    fun maas(gunSayisi:Int):Int{

        val calismaSaati = gunSayisi * 8
        println("çalışılan saat : $calismaSaati")

        var para = 0
        if (calismaSaati > 160){
            var mesai = calismaSaati - 160
            para = (160 * 10) + (mesai * 20)
        }else{
            para = calismaSaati * 10
        }

        return para
    }

}