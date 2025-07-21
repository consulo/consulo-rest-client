package org.javamaster.httpclient.psi;

import consulo.language.ast.TokenSet;

public class HttpTypeSets {
    public static TokenSet VARIABLE_BRACES = TokenSet.create(HttpTypes.START_VARIABLE_BRACE, HttpTypes.END_VARIABLE_BRACE);
}
