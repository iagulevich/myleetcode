package org.gula.myleetcode.medium

import spock.lang.Specification

class LongestSubstringWithoutRepeatingCharactersTest extends Specification {
    def "Length of longest substring"() {
        expect:
        new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring(input) == result
        where:
        input      || result
        null       || 0
        ""         || 0
        "a"        || 1
        "ab"       || 2
        "abcabcbb" || 3
        "bbbbb"    || 1
        "pwwkew"   || 3
        "aab"      || 2
        "dvdf"     || 3
    }
}
