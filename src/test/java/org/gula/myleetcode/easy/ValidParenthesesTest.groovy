package org.gula.myleetcode.easy

import spock.lang.Specification

class ValidParenthesesTest extends Specification {

    def "Is valid?"() {
        expect:
        new ValidParentheses().isValid(input) == result
        where:
        input    || result
        "()"     || true
        "()[]{}" || true
        "(]"     || false
        "([)]"   || false
        "{[]}"   || true
        "(])"    || false
    }
}
