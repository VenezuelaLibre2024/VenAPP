package com.google.android.gms.common.api.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class j1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ m1 f9384a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j1(m1 m1Var) {
        this.f9384a = m1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l1 l1Var;
        l1Var = this.f9384a.f9431r;
        l1Var.a(new ca.b(4));
    }
}
