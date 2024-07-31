package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* renamed from: com.google.android.gms.measurement.internal.w9 */
/* loaded from: classes2.dex */
final class RunnableC5716w9 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ ServiceConnectionC5665s9 f12010a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5716w9(ServiceConnectionC5665s9 serviceConnectionC5665s9) {
        this.f12010a = serviceConnectionC5665s9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5703v8.m14375F(this.f12010a.f11832c, new ComponentName(this.f12010a.f11832c.zza(), "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
