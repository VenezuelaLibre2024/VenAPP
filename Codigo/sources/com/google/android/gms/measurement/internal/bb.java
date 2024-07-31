package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* loaded from: classes2.dex */
final class bb implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f10008a;

    /* renamed from: b */
    private final /* synthetic */ String f10009b;

    /* renamed from: c */
    private final /* synthetic */ Bundle f10010c;

    /* renamed from: d */
    private final /* synthetic */ cb f10011d;

    public bb(cb cbVar, String str, String str2, Bundle bundle) {
        this.f10011d = cbVar;
        this.f10008a = str;
        this.f10009b = str2;
        this.f10010c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10011d.f10042a.p((d0) com.google.android.gms.common.internal.s.j(this.f10011d.f10042a.i0().B(this.f10008a, this.f10009b, this.f10010c, "auto", this.f10011d.f10042a.zzb().a(), false, true)), this.f10008a);
    }
}
