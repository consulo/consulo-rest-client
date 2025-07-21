package org.javamaster.httpclient;

import consulo.platform.base.icon.PlatformIconGroup;
import consulo.restClient.icon.RestClientIconGroup;
import consulo.ui.image.Image;

/**
 * @author yudong
 */
public class HttpIcons {

    public static final Image FILE = RestClientIconGroup.http();
    public static final Image GET = RestClientIconGroup.get();
    public static final Image POST = RestClientIconGroup.post();
    public static final Image PUT = RestClientIconGroup.put();
    public static final Image DELETE = RestClientIconGroup.delete();
    public static final Image IMAGE = RestClientIconGroup.image();
    public static final Image DUBBO = RestClientIconGroup.dubbo();
    public static final Image WS = RestClientIconGroup.ws();

    public static final Image RUN_ALL = RestClientIconGroup.runall();
    public static final Image STOP = RestClientIconGroup.stop();

    public static final Image SCROLL_UP = RestClientIconGroup.scrollup();
    public static final Image SCROLL_DOWN = RestClientIconGroup.scrolldown();

    public static final Image COPY = PlatformIconGroup.actionsCopy();
    public static final Image HISTORY = PlatformIconGroup.vcsHistory();
    public static final Image INSPECTIONS_EYE = PlatformIconGroup.generalInspectionseye();
    public static final Image BLANK = Image.empty(Image.DEFAULT_ICON_SIZE);
    public static final Image REQUEST_MAPPING = RestClientIconGroup.requestmapping();
}
