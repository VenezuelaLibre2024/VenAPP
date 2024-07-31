package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.a */
/* loaded from: classes2.dex */
public final class RunnableC5421a implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f11051a;

    /* renamed from: b */
    private final /* synthetic */ long f11052b;

    /* renamed from: c */
    private final /* synthetic */ C5718x f11053c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5421a(C5718x c5718x, String str, long j10) {
        this.f11053c = c5718x;
        this.f11051a = str;
        this.f11052b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5718x.m14531t(this.f11053c, this.f11051a, this.f11052b);
    }
}
