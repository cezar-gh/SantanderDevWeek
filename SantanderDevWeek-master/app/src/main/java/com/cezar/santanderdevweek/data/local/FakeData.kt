package com.cezar.santanderdevweek.data.local

import com.cezar.santanderdevweek.data.Cartao
import com.cezar.santanderdevweek.data.Cliente
import com.cezar.santanderdevweek.data.Conta

class FakeData {

    fun getLocalData(): Conta {
        val cliente = Cliente("Cezar")
        val cartao =  Cartao ("0033")
        return Conta("445655-4",
            "6552-4",
            "R$ 2.450,80",
            "R$ 4.120,00",
            cliente,
            cartao
            )
    }
}