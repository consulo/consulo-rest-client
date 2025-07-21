package org.javamaster.httpclient.psi;

import consulo.language.ast.IElementType;
import consulo.language.psi.NavigatablePsiElement;

public interface HttpCompositeElement extends NavigatablePsiElement {
    IElementType getTokenType();
}
