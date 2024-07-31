package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class w0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ long f10755a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ x f10756b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w0(x xVar, long j10) {
        this.f10756b = xVar;
        this.f10755a = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10756b.w(this.f10755a);
    }
}
