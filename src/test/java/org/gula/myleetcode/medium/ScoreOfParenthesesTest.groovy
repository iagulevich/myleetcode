package org.gula.myleetcode.medium

import spock.lang.Specification

class ScoreOfParenthesesTest extends Specification {
    def "ScoreOfParentheses"() {
        expect:
        new ScoreOfParentheses().scoreOfParentheses(str as String) == result
        where:
        str        | result
        "()"       | 1
        "()()"     | 2
        "(())"     | 2
        "(()(()))" | 6
        "(())()"   | 3
        "((())())" | 6
    }
}
