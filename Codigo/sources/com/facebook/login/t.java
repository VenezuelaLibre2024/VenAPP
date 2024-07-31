package com.facebook.login;

import java.util.Arrays;

/* loaded from: classes.dex */
public enum t {
    NATIVE_WITH_FALLBACK(true, true, true, false, true, true, true),
    NATIVE_ONLY(true, true, false, false, false, true, true),
    KATANA_ONLY(false, true, false, false, false, false, false),
    WEB_ONLY(false, false, true, false, true, false, false),
    DIALOG_ONLY(false, true, true, false, true, true, true),
    DEVICE_AUTH(false, false, false, true, false, false, false);

    private final boolean allowsCustomTabAuth;
    private final boolean allowsDeviceAuth;
    private final boolean allowsFacebookLiteAuth;
    private final boolean allowsGetTokenAuth;
    private final boolean allowsInstagramAppAuth;
    private final boolean allowsKatanaAuth;
    private final boolean allowsWebViewAuth;

    t(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.allowsGetTokenAuth = z10;
        this.allowsKatanaAuth = z11;
        this.allowsWebViewAuth = z12;
        this.allowsDeviceAuth = z13;
        this.allowsCustomTabAuth = z14;
        this.allowsFacebookLiteAuth = z15;
        this.allowsInstagramAppAuth = z16;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static t[] valuesCustom() {
        t[] valuesCustom = values();
        return (t[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    public final boolean h() {
        return this.allowsCustomTabAuth;
    }

    public final boolean i() {
        return this.allowsDeviceAuth;
    }

    public final boolean l() {
        return this.allowsGetTokenAuth;
    }

    public final boolean m() {
        return this.allowsInstagramAppAuth;
    }

    public final boolean n() {
        return this.allowsKatanaAuth;
    }

    public final boolean o() {
        return this.allowsWebViewAuth;
    }
}
