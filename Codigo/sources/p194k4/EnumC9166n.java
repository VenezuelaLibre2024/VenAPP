package p194k4;

import java.util.Arrays;

/* renamed from: k4.n */
/* loaded from: classes.dex */
public enum EnumC9166n {
    EVENT("event"),
    ACTION_SOURCE("action_source"),
    APP("app"),
    MOBILE_APP_INSTALL("MobileAppInstall"),
    INSTALL_EVENT_TIME("install_timestamp");

    private final String rawValue;

    EnumC9166n(String str) {
        this.rawValue = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC9166n[] valuesCustom() {
        EnumC9166n[] valuesCustom = values();
        return (EnumC9166n[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    /* renamed from: h */
    public final String m27075h() {
        return this.rawValue;
    }
}
