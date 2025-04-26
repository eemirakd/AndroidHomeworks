package com.example.bootcamphw

class faktoriyel {
     fun hesapla(sayi:Int):Int{
        var sonuc = 1

        for (i in 1..sayi ){
            sonuc = sonuc * i
        }
        return sonuc
     }
}