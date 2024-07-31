package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.q8 */
/* loaded from: classes2.dex */
public final class RunnableC5638q8 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ Bundle f11741a;

    /* renamed from: b */
    private final /* synthetic */ C5625p8 f11742b;

    /* renamed from: c */
    private final /* synthetic */ C5625p8 f11743c;

    /* renamed from: d */
    private final /* synthetic */ long f11744d;

    /* renamed from: e */
    private final /* synthetic */ C5612o8 f11745e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5638q8(C5612o8 c5612o8, Bundle bundle, C5625p8 c5625p8, C5625p8 c5625p82, long j10) {
        this.f11745e = c5612o8;
        this.f11741a = bundle;
        this.f11742b = c5625p8;
        this.f11743c = c5625p82;
        this.f11744d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5612o8.m14197E(this.f11745e, this.f11741a, this.f11742b, this.f11743c, this.f11744d);
    }
}
