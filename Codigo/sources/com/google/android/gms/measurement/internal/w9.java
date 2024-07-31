package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* loaded from: classes2.dex */
final class w9 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ s9 f10795a;

    public w9(s9 s9Var) {
        this.f10795a = s9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v8.F(this.f10795a.f10634c, new ComponentName(this.f10795a.f10634c.zza(), "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
