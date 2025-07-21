package org.javamaster.httpclient;

import consulo.language.file.LanguageFileType;
import consulo.localize.LocalizeValue;
import consulo.ui.image.Image;
import org.jetbrains.annotations.NotNull;

/**
 * @author yudong
 */
public class HttpFileType extends LanguageFileType {

    public static final HttpFileType INSTANCE = new HttpFileType();
    public static final String DEFAULT_EXTENSION = "http";

    private HttpFileType() {
        super(HttpLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getId() {
        return "HTTP";
    }

    @NotNull
    @Override
    public LocalizeValue getDescription() {
        return LocalizeValue.localizeTODO("HTTP request file");
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return DEFAULT_EXTENSION;
    }

    @Override
    public Image getIcon() {
        return HttpIcons.FILE;
    }

}
