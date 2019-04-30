package org.gula.myleetcode.easy

import spock.lang.Specification

class LengthOfLastWordTest extends Specification {
    def "LengthOfLastWord"() {
        expect:
        new LengthOfLastWord().lengthOfLastWord(input) == result

        where:
        input   || result
        "    "  || 0
        "as a"  || 1
        "abcdf" || 5
        "a "    || 1
    }
}
