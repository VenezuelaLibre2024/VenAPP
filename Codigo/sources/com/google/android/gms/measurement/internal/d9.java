package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class d9 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f10078a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ lb f10079b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ v8 f10080c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d9(v8 v8Var, AtomicReference atomicReference, lb lbVar) {
        this.f10080c = v8Var;
        this.f10078a = atomicReference;
        this.f10079b = lbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        wa.i iVar;
        synchronized (this.f10078a) {
            try {
                try {
                } finally {
                    this.f10078a.notify();
                }
            } catch (RemoteException e10) {
                this.f10080c.zzj().B().b("Failed to get app instance id", e10);
                atomicReference = this.f10078a;
            }
            if (!this.f10080c.e().E().y()) {
                this.f10080c.zzj().H().a("Analytics storage consent denied; will not get app instance id");
                this.f10080c.m().M(null);
                this.f10080c.e().f10841g.b(null);
                this.f10078a.set(null);
                return;
            }
            iVar = this.f10080c.f10709d;
            if (iVar == null) {
                this.f10080c.zzj().B().a("Failed to get app instance id");
                return;
            }
            com.google.android.gms.common.internal.s.j(this.f10079b);
            this.f10078a.set(iVar.N0(this.f10079b));
            String str = (String) this.f10078a.get();
            if (str != null) {
                this.f10080c.m().M(str);
                this.f10080c.e().f10841g.b(str);
            }
            this.f10080c.b0();
            atomicReference = this.f10078a;
            atomicReference.notify();
        }
    }
}
