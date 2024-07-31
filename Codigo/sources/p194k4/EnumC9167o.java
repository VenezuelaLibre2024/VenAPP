package p194k4;

import java.util.Arrays;

/* renamed from: k4.o */
/* loaded from: classes.dex */
public enum EnumC9167o {
    URL("endpoint"),
    ENABLED("is_enabled"),
    DATASETID("dataset_id"),
    ACCESSKEY("access_key");

    private final String rawValue;

    EnumC9167o(String str) {
        this.rawValue = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC9167o[] valuesCustom() {
        EnumC9167o[] valuesCustom = values();
        return (EnumC9167o[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    /* renamed from: h */
    public final String m27077h() {
        return this.rawValue;
    }
}
