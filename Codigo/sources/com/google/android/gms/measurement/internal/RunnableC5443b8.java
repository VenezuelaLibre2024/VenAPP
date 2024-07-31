package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.b8 */
/* loaded from: classes2.dex */
public final class RunnableC5443b8 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ Boolean f11120a;

    /* renamed from: b */
    private final /* synthetic */ C5442b7 f11121b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5443b8(C5442b7 c5442b7, Boolean bool) {
        this.f11121b = c5442b7;
        this.f11120a = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11121b.m13645L(this.f11120a, true);
    }
}
