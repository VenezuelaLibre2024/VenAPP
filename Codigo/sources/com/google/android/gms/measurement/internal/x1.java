package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class x1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f10802a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ long f10803b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ x f10804c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x1(x xVar, String str, long j10) {
        this.f10804c = xVar;
        this.f10802a = str;
        this.f10803b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x.x(this.f10804c, this.f10802a, this.f10803b);
    }
}
