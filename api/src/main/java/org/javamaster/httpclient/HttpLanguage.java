package org.javamaster.httpclient;

import consulo.language.Language;

import static org.javamaster.httpclient.HttpFileType.DEFAULT_EXTENSION;

/**
 * @author yudong
 */
public class HttpLanguage extends Language {

    public static final HttpLanguage INSTANCE = new HttpLanguage();

    private HttpLanguage() {
        super(DEFAULT_EXTENSION);
    }
}
