package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.o7 */
/* loaded from: classes2.dex */
public final class RunnableC5611o7 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f11650a;

    /* renamed from: b */
    private final /* synthetic */ String f11651b;

    /* renamed from: c */
    private final /* synthetic */ Object f11652c;

    /* renamed from: d */
    private final /* synthetic */ long f11653d;

    /* renamed from: e */
    private final /* synthetic */ C5442b7 f11654e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5611o7(C5442b7 c5442b7, String str, String str2, Object obj, long j10) {
        this.f11654e = c5442b7;
        this.f11650a = str;
        this.f11651b = str2;
        this.f11652c = obj;
        this.f11653d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11654e.m13665T(this.f11650a, this.f11651b, this.f11652c, this.f11653d);
    }
}
