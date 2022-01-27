package com.example.diceroll2

import org.junit.Assert.*
import org.junit.Test

class MainActivityKtTest {
    @Test
    fun calculationBonusTest() {
        val result = calculationBonus(150)
        val expected = 60000
        assertEquals("El resultado es: ", result, expected)
    }

    @Test
    fun calculationHealthTest() {
        val result = calculationHealth(150, 5000)
        val expected = 65625.0
        assertEquals("El resultado es:", result, expected, 0.0)
    }

    @Test
    fun calculationPensionFundManagerTest() {
        val result = calculationPensionFundManager(150, 5000)
        val expected = 105468.75
        assertEquals("El resultado es:", result, expected, 0.0)
    }
    @Test
    fun calculationAssetsTest(){
        val result = calculationAssets(150, 5000)
        val expected = 937500.0
        assertEquals("Es igual a : ", result, expected, 0.0)
    }
}