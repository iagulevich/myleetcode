package org.gula.myleetcode.easy

import spock.lang.Specification

class PalindromeNumberTest extends Specification {

    def "Palindrome number"() {
        expect:
        new PalindromeNumber().isPalindrome(input) == result
        where:
        input     || result
        121       || true
        -121      || false
        10        || false
        5         || true
        123454321 || true
        23455432 || true
    }
}
