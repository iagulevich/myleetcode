package org.gula.myleetcode.medium

import spock.lang.Specification

class LongestWordInDictionaryThroughDeletingTest extends Specification {
    def "FindLongestWord"() {
        expect:
        new LongestWordInDictionaryThroughDeleting().findLongestWord(s, d) == result
        where:
        s                           | d                                                                  | result
        "abpcplea"                  | ["ale", "apple", "monkey", "plea"]                                 | "apple"
        "aewfafwafjlwajflwajflwafj" | ["apple", "ewaf", "awefawfwaf", "awef", "awefe", "ewafeffewafewf"] | "ewaf"
    }
}
