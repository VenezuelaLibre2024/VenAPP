package com.google.android.gms.common.api.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.i0 */
/* loaded from: classes.dex */
public final class RunnableC5144i0 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f10490a;

    /* renamed from: b */
    final /* synthetic */ C5156l0 f10491b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5144i0(C5156l0 c5156l0, int i10) {
        this.f10491b = c5156l0;
        this.f10490a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10491b.m13100h(this.f10490a);
    }
}
