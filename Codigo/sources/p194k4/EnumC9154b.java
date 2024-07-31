package p194k4;

import java.util.Arrays;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;

/* renamed from: k4.b */
/* loaded from: classes.dex */
public enum EnumC9154b {
    ANON_ID("anon_id"),
    APP_USER_ID("app_user_id"),
    ADVERTISER_ID("advertiser_id"),
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

    public static final a Companion = new a(null);
    private final String rawValue;

    /* renamed from: k4.b$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final EnumC9154b m27015a(String rawValue) {
            C9322n.m27781e(rawValue, "rawValue");
            for (EnumC9154b enumC9154b : EnumC9154b.valuesCustom()) {
                if (C9322n.m27777a(enumC9154b.m27014h(), rawValue)) {
                    return enumC9154b;
                }
            }
            return null;
        }
    }

    EnumC9154b(String str) {
        this.rawValue = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC9154b[] valuesCustom() {
        EnumC9154b[] valuesCustom = values();
        return (EnumC9154b[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    /* renamed from: h */
    public final String m27014h() {
        return this.rawValue;
    }
}
