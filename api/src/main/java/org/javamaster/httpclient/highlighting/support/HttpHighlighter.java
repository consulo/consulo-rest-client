package org.javamaster.httpclient.highlighting.support;

import consulo.colorScheme.EditorColorsScheme;
import consulo.language.editor.highlight.LayeredLexerEditorHighlighter;
import org.jetbrains.annotations.NotNull;

public class HttpHighlighter extends LayeredLexerEditorHighlighter {

    public HttpHighlighter(@NotNull EditorColorsScheme scheme) {
        super(new HttpSyntaxHighlighter(), scheme);
    }

}
