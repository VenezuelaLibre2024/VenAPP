package com.facebook.appevents;

import java.util.Arrays;

/* loaded from: classes.dex */
public enum f0 {
    SUCCESS,
    SERVER_ERROR,
    NO_CONNECTIVITY,
    UNKNOWN_ERROR;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static f0[] valuesCustom() {
        f0[] valuesCustom = values();
        return (f0[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
