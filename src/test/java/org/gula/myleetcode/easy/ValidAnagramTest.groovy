package org.gula.myleetcode.easy

import spock.lang.Specification

class ValidAnagramTest extends Specification {
    def "IsAnagram"() {
        expect:
        new ValidAnagram().isAnagram(s, t) == result
        where:
        s         | t         | result
        "anagram" | "nagaram" | true
    }
}
