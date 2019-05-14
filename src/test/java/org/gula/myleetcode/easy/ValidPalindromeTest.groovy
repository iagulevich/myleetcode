package org.gula.myleetcode.easy

import spock.lang.Specification

class ValidPalindromeTest extends Specification {
    def "IsPalindrome"() {
        expect:
        new ValidPalindrome().isPalindrome(str) == result
        where:
        str                              | result
        "A man, a plan, a canal: Panama" | true
        "race a car"                     | false
        "0P"                             | false
    }
}
