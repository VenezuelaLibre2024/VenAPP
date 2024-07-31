package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.w7 */
/* loaded from: classes2.dex */
public final class RunnableC5714w7 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f12004a;

    /* renamed from: b */
    private final /* synthetic */ String f12005b = null;

    /* renamed from: c */
    private final /* synthetic */ String f12006c;

    /* renamed from: d */
    private final /* synthetic */ String f12007d;

    /* renamed from: e */
    private final /* synthetic */ C5442b7 f12008e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5714w7(C5442b7 c5442b7, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f12008e = c5442b7;
        this.f12004a = atomicReference;
        this.f12006c = str2;
        this.f12007d = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12008e.f11899a.m14498E().m14395L(this.f12004a, null, this.f12006c, this.f12007d);
    }
}
