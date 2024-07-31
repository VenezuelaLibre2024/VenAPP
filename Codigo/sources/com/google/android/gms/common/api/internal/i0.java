package com.google.android.gms.common.api.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class i0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f9376a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ l0 f9377b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i0(l0 l0Var, int i10) {
        this.f9377b = l0Var;
        this.f9376a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9377b.h(this.f9376a);
    }
}
