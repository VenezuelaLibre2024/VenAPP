package i4;

import java.util.Arrays;

/* loaded from: classes.dex */
public enum o0 {
    GET,
    POST,
    DELETE;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static o0[] valuesCustom() {
        o0[] valuesCustom = values();
        return (o0[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
