package com.example.unittesting.ui

import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

class HelperTest {

    lateinit var helper: Helper

    @Before
    fun setup() {
        helper = Helper()
    }
    @Test
    fun `test_isPalindrome`() {
        assertTrue(helper.isPalindrome("racecar"))
        assertTrue(helper.isPalindrome("redivider"))
        assertFalse(helper.isPalindrome("palindrome"))
        assertFalse(helper.isPalindrome("sever"))
        assertTrue(helper.isPalindrome("3553"))
        assertTrue(helper.isPalindrome("tattarrattat"))
    }
}