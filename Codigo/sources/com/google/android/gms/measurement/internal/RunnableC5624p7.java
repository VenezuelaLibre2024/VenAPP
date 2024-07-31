package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.p7 */
/* loaded from: classes2.dex */
public final class RunnableC5624p7 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f11687a;

    /* renamed from: b */
    private final /* synthetic */ String f11688b;

    /* renamed from: c */
    private final /* synthetic */ long f11689c;

    /* renamed from: d */
    private final /* synthetic */ Bundle f11690d;

    /* renamed from: e */
    private final /* synthetic */ boolean f11691e;

    /* renamed from: f */
    private final /* synthetic */ boolean f11692f;

    /* renamed from: r */
    private final /* synthetic */ boolean f11693r;

    /* renamed from: s */
    private final /* synthetic */ String f11694s;

    /* renamed from: t */
    private final /* synthetic */ C5442b7 f11695t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5624p7(C5442b7 c5442b7, String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        this.f11695t = c5442b7;
        this.f11687a = str;
        this.f11688b = str2;
        this.f11689c = j10;
        this.f11690d = bundle;
        this.f11691e = z10;
        this.f11692f = z11;
        this.f11693r = z12;
        this.f11694s = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11695t.m13661O(this.f11687a, this.f11688b, this.f11689c, this.f11690d, this.f11691e, this.f11692f, this.f11693r, this.f11694s);
    }
}
