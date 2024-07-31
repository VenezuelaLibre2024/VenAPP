package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class p7 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f10500a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f10501b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ long f10502c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ Bundle f10503d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ boolean f10504e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ boolean f10505f;

    /* renamed from: r, reason: collision with root package name */
    private final /* synthetic */ boolean f10506r;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ String f10507s;

    /* renamed from: t, reason: collision with root package name */
    private final /* synthetic */ b7 f10508t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p7(b7 b7Var, String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        this.f10508t = b7Var;
        this.f10500a = str;
        this.f10501b = str2;
        this.f10502c = j10;
        this.f10503d = bundle;
        this.f10504e = z10;
        this.f10505f = z11;
        this.f10506r = z12;
        this.f10507s = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10508t.O(this.f10500a, this.f10501b, this.f10502c, this.f10503d, this.f10504e, this.f10505f, this.f10506r, this.f10507s);
    }
}
