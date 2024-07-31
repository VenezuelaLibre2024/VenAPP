package com.facebook.login;

import java.util.Arrays;

/* loaded from: classes.dex */
public enum a {
    S256("S256"),
    PLAIN("plain");

    a(String str) {
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static a[] valuesCustom() {
        a[] valuesCustom = values();
        return (a[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
