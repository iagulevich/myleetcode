package org.gula.myleetcode.medium

import spock.lang.Specification

class SimplifyPathTest extends Specification {
    def "SimplifyPath"() {
        expect:
        new SimplifyPath().simplifyPath(path) == simplifiedPath
        where:
        path                    | simplifiedPath
        "/home/"                | "/home"
        "/../"                  | "/"
        "/home//foo/"           | "/home/foo"
        "/a/./b/../../c/"       | "/c"
        "/a/../../b/../c//.//"  | "/c"
        "/a//b////c/d//././/.." | "/a/b/c"
    }
}
