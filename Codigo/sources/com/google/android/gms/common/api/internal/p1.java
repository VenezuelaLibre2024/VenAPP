package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class p1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.common.api.n f9448a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ s1 f9449b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p1(s1 s1Var, com.google.android.gms.common.api.n nVar) {
        this.f9449b = s1Var;
        this.f9448a = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WeakReference weakReference;
        q1 q1Var;
        q1 q1Var2;
        WeakReference weakReference2;
        com.google.android.gms.common.api.f fVar;
        com.google.android.gms.common.api.q qVar;
        q1 q1Var3;
        q1 q1Var4;
        WeakReference weakReference3;
        try {
            try {
                ThreadLocal threadLocal = BasePendingResult.zaa;
                threadLocal.set(Boolean.TRUE);
                qVar = this.f9449b.f9465a;
                com.google.android.gms.common.api.i b10 = ((com.google.android.gms.common.api.q) com.google.android.gms.common.internal.s.j(qVar)).b(this.f9448a);
                s1 s1Var = this.f9449b;
                q1Var3 = s1Var.f9472h;
                q1Var4 = s1Var.f9472h;
                q1Var3.sendMessage(q1Var4.obtainMessage(0, b10));
                threadLocal.set(Boolean.FALSE);
                s1 s1Var2 = this.f9449b;
                s1.o(this.f9448a);
                weakReference3 = this.f9449b.f9471g;
                fVar = (com.google.android.gms.common.api.f) weakReference3.get();
                if (fVar == null) {
                    return;
                }
            } catch (RuntimeException e10) {
                s1 s1Var3 = this.f9449b;
                q1Var = s1Var3.f9472h;
                q1Var2 = s1Var3.f9472h;
                q1Var.sendMessage(q1Var2.obtainMessage(1, e10));
                BasePendingResult.zaa.set(Boolean.FALSE);
                s1 s1Var4 = this.f9449b;
                s1.o(this.f9448a);
                weakReference2 = this.f9449b.f9471g;
                fVar = (com.google.android.gms.common.api.f) weakReference2.get();
                if (fVar == null) {
                    return;
                }
            }
            fVar.j(this.f9449b);
        } catch (Throwable th2) {
            BasePendingResult.zaa.set(Boolean.FALSE);
            s1 s1Var5 = this.f9449b;
            s1.o(this.f9448a);
            weakReference = this.f9449b.f9471g;
            com.google.android.gms.common.api.f fVar2 = (com.google.android.gms.common.api.f) weakReference.get();
            if (fVar2 != null) {
                fVar2.j(this.f9449b);
            }
            throw th2;
        }
    }
}
