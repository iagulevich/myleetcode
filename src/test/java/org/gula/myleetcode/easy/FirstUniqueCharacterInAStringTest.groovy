package org.gula.myleetcode.easy

import spock.lang.Specification

/**
 * Given a string, find the first non-repeating character in it and return it's index.
 * If it doesn't exist, return -1.
 *
 * Examples:
 * s = "leetcode"
 * return 0.
 *
 * s = "loveleetcode",
 * return 2.
 */
class FirstUniqueCharacterInAStringTest extends Specification {
    def "FirstUniqChar"() {
        expect:
        new FirstUniqueCharacterInAString().firstUniqChar(str) == result
        where:
        str            | result
        "leetcode"     | 0
        "loveleetcode" | 2
        "cc"           | -1
        "z"            | 0
        "aadadaad"     | -1
    }
}
