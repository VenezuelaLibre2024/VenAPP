package com.facebook.appevents;

import java.util.Arrays;

/* renamed from: com.facebook.appevents.f0 */
/* loaded from: classes.dex */
public enum EnumC4574f0 {
    SUCCESS,
    SERVER_ERROR,
    NO_CONNECTIVITY,
    UNKNOWN_ERROR;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC4574f0[] valuesCustom() {
        EnumC4574f0[] valuesCustom = values();
        return (EnumC4574f0[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
