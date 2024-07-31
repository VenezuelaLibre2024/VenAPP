package com.facebook.login;

import java.util.Arrays;

/* renamed from: com.facebook.login.a */
/* loaded from: classes.dex */
public enum EnumC4653a {
    S256("S256"),
    PLAIN("plain");

    EnumC4653a(String str) {
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC4653a[] valuesCustom() {
        EnumC4653a[] valuesCustom = values();
        return (EnumC4653a[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
