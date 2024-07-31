package k4;

import java.util.Arrays;

/* loaded from: classes.dex */
public enum l {
    ANON_ID("anon_id"),
    FB_LOGIN_ID("fb_login_id"),
    MAD_ID("madid"),
    PAGE_ID("page_id"),
    PAGE_SCOPED_USER_ID("page_scoped_user_id"),
    USER_DATA("ud"),
    ADV_TE("advertiser_tracking_enabled"),
    APP_TE("application_tracking_enabled"),
    CONSIDER_VIEWS("consider_views"),
    DEVICE_TOKEN("device_token"),
    EXT_INFO("extInfo"),
    INCLUDE_DWELL_DATA("include_dwell_data"),
    INCLUDE_VIDEO_DATA("include_video_data"),
    INSTALL_REFERRER("install_referrer"),
    INSTALLER_PACKAGE("installer_package"),
    RECEIPT_DATA("receipt_data"),
    URL_SCHEMES("url_schemes");

    private final String rawValue;

    l(String str) {
        this.rawValue = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static l[] valuesCustom() {
        l[] valuesCustom = values();
        return (l[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    public final String h() {
        return this.rawValue;
    }
}