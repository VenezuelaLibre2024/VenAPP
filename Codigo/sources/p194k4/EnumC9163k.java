package p194k4;

import java.util.Arrays;

/* renamed from: k4.k */
/* loaded from: classes.dex */
public enum EnumC9163k {
    USER_DATA("user_data"),
    APP_DATA("app_data"),
    CUSTOM_DATA("custom_data"),
    CUSTOM_EVENTS("custom_events");

    private final String rawValue;

    EnumC9163k(String str) {
        this.rawValue = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC9163k[] valuesCustom() {
        EnumC9163k[] valuesCustom = values();
        return (EnumC9163k[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    /* renamed from: h */
    public final String m27068h() {
        return this.rawValue;
    }
}
