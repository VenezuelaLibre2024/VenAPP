package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class u8 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ long f10677a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ o8 f10678b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u8(o8 o8Var, long j10) {
        this.f10678b = o8Var;
        this.f10677a = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10678b.j().q(this.f10677a);
        this.f10678b.f10470e = null;
    }
}
