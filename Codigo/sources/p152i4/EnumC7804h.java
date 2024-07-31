package p152i4;

import java.util.Arrays;

/* renamed from: i4.h */
/* loaded from: classes.dex */
public enum EnumC7804h {
    NONE(false),
    FACEBOOK_APPLICATION_WEB(true),
    FACEBOOK_APPLICATION_NATIVE(true),
    FACEBOOK_APPLICATION_SERVICE(true),
    WEB_VIEW(true),
    CHROME_CUSTOM_TAB(true),
    TEST_USER(true),
    CLIENT_TOKEN(true),
    DEVICE_AUTH(true),
    INSTAGRAM_APPLICATION_WEB(true),
    INSTAGRAM_CUSTOM_CHROME_TAB(true),
    INSTAGRAM_WEB_VIEW(true);

    private final boolean canExtendToken;

    EnumC7804h(boolean z10) {
        this.canExtendToken = z10;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC7804h[] valuesCustom() {
        EnumC7804h[] valuesCustom = values();
        return (EnumC7804h[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    /* renamed from: h */
    public final boolean m23918h() {
        return this.canExtendToken;
    }
}
