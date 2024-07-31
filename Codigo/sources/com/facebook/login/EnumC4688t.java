package com.facebook.login;

import java.util.Arrays;

/* renamed from: com.facebook.login.t */
/* loaded from: classes.dex */
public enum EnumC4688t {
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

    EnumC4688t(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.allowsGetTokenAuth = z10;
        this.allowsKatanaAuth = z11;
        this.allowsWebViewAuth = z12;
        this.allowsDeviceAuth = z13;
        this.allowsCustomTabAuth = z14;
        this.allowsFacebookLiteAuth = z15;
        this.allowsInstagramAppAuth = z16;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC4688t[] valuesCustom() {
        EnumC4688t[] valuesCustom = values();
        return (EnumC4688t[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    /* renamed from: h */
    public final boolean m11675h() {
        return this.allowsCustomTabAuth;
    }

    /* renamed from: i */
    public final boolean m11676i() {
        return this.allowsDeviceAuth;
    }

    /* renamed from: l */
    public final boolean m11677l() {
        return this.allowsGetTokenAuth;
    }

    /* renamed from: m */
    public final boolean m11678m() {
        return this.allowsInstagramAppAuth;
    }

    /* renamed from: n */
    public final boolean m11679n() {
        return this.allowsKatanaAuth;
    }

    /* renamed from: o */
    public final boolean m11680o() {
        return this.allowsWebViewAuth;
    }
}
