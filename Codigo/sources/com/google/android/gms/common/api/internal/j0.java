package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;

/* loaded from: classes.dex */
final class j0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ k0 f9383a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j0(k0 k0Var) {
        this.f9383a = k0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a.f fVar;
        a.f fVar2;
        l0 l0Var = this.f9383a.f9393a;
        fVar = l0Var.f9401b;
        fVar2 = l0Var.f9401b;
        fVar.disconnect(fVar2.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
