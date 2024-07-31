package com.google.android.play.integrity.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.IInterface;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class h0 extends d0 {

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ d f11018r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h0(d dVar) {
        this.f11018r = dVar;
    }

    @Override // com.google.android.play.integrity.internal.d0
    public final void b() {
        Object obj;
        AtomicInteger atomicInteger;
        IInterface iInterface;
        c0 c0Var;
        Context context;
        ServiceConnection serviceConnection;
        AtomicInteger atomicInteger2;
        c0 c0Var2;
        obj = this.f11018r.f11001f;
        synchronized (obj) {
            atomicInteger = this.f11018r.f11007l;
            if (atomicInteger.get() > 0) {
                atomicInteger2 = this.f11018r.f11007l;
                if (atomicInteger2.decrementAndGet() > 0) {
                    c0Var2 = this.f11018r.f10997b;
                    c0Var2.c("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
            }
            d dVar = this.f11018r;
            iInterface = dVar.f11009n;
            if (iInterface != null) {
                c0Var = dVar.f10997b;
                c0Var.c("Unbind from service.", new Object[0]);
                d dVar2 = this.f11018r;
                context = dVar2.f10996a;
                serviceConnection = dVar2.f11008m;
                context.unbindService(serviceConnection);
                this.f11018r.f11002g = false;
                this.f11018r.f11009n = null;
                this.f11018r.f11008m = null;
            }
            this.f11018r.x();
        }
    }
}
