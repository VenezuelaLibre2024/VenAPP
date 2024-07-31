package com.facebook.login;

import java.util.Arrays;

/* renamed from: com.facebook.login.e */
/* loaded from: classes.dex */
public enum EnumC4661e {
    NONE(null),
    ONLY_ME("only_me"),
    FRIENDS("friends"),
    EVERYONE("everyone");

    private final String nativeProtocolAudience;

    EnumC4661e(String str) {
        this.nativeProtocolAudience = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC4661e[] valuesCustom() {
        EnumC4661e[] valuesCustom = values();
        return (EnumC4661e[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    /* renamed from: h */
    public final String m11512h() {
        return this.nativeProtocolAudience;
    }
}
