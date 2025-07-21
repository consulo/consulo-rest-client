package org.javamaster.httpclient.parser;

import consulo.language.ast.ASTNode;
import consulo.language.ast.IFileElementType;
import consulo.language.ast.TokenSet;
import consulo.language.file.FileViewProvider;
import consulo.language.lexer.Lexer;
import consulo.language.parser.ParserDefinition;
import consulo.language.parser.PsiParser;
import consulo.language.psi.PsiElement;
import consulo.language.psi.PsiFile;
import consulo.language.version.LanguageVersion;
import consulo.project.Project;
import org.javamaster.httpclient.HttpLanguage;
import org.javamaster.httpclient.psi.HttpTypes;
import org.jetbrains.annotations.NotNull;

/**
 * @author yudong
 */
public class HttpParserDefinition implements ParserDefinition {
    public static final IFileElementType FILE = new IFileElementType(HttpLanguage.INSTANCE);

    @Override
    public @NotNull Lexer createLexer(LanguageVersion languageVersion) {
        return new HttpAdapter();
    }

    @Override
    public @NotNull PsiParser createParser(LanguageVersion languageVersion) {
        return new HttpParser();
    }

    @Override
    public @NotNull IFileElementType getFileNodeType() {
        return FILE;
    }

    @Override
    public @NotNull TokenSet getCommentTokens(LanguageVersion languageVersion) {
        return TokenSet.create(HttpTypes.LINE_COMMENT, HttpTypes.BLOCK_COMMENT);
    }

    @Override
    public @NotNull TokenSet getStringLiteralElements(LanguageVersion languageVersion) {
        return TokenSet.EMPTY;
    }

    @Override
    public @NotNull PsiElement createElement(ASTNode node) {
        return HttpTypes.Factory.createElement(node);
    }

    @Override
    public @NotNull PsiFile createFile(@NotNull FileViewProvider viewProvider) {
        return new HttpFile(viewProvider);
    }
}
