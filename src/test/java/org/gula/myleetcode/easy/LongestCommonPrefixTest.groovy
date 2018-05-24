package org.gula.myleetcode.easy

import spock.lang.Specification

class LongestCommonPrefixTest extends Specification {

    def "Longest common prefix"() {
        expect:
        new LongestCommonPrefix().longestCommonPrefix(input as String[]) == result
        where:
        input                        || result
        []                           || ""
        ["any"]                      || "any"
        ["dog", "racecar", "car"]    || ""
        ["flower", "flow", "flight"] || "fl"
    }
}
