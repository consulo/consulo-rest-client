package org.javamaster.httpclient.psi.impl;

import consulo.language.ast.ASTNode;
import consulo.language.ast.IElementType;
import consulo.language.impl.psi.ASTWrapperPsiElement;
import org.javamaster.httpclient.psi.HttpCompositeElement;
import org.jetbrains.annotations.NotNull;

public class HttpCompositeElementImpl extends ASTWrapperPsiElement implements HttpCompositeElement {
    public HttpCompositeElementImpl(@NotNull ASTNode node) {
        super(node);
    }

    @Override
    public IElementType getTokenType() {
        return getNode().getElementType();
    }

    public String toString() {
        return this.getTokenType().toString();
    }
}
