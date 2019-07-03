package org.gula.myleetcode.easy

import spock.lang.Specification

class FindCommonCharactersTest extends Specification {
    def "CommonChars"() {
        expect:
        new FindCommonCharacters().commonChars(array as String[]) == result
        where:
        array                    | result
        ["cool", "lock", "cook"] | ["c", "o"]
    }
}
