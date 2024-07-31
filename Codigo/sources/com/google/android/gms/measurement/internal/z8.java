package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class z8 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f10887a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ lb f10888b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ Bundle f10889c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ v8 f10890d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z8(v8 v8Var, AtomicReference atomicReference, lb lbVar, Bundle bundle) {
        this.f10890d = v8Var;
        this.f10887a = atomicReference;
        this.f10888b = lbVar;
        this.f10889c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        wa.i iVar;
        synchronized (this.f10887a) {
            try {
                try {
                    iVar = this.f10890d.f10709d;
                } finally {
                    this.f10887a.notify();
                }
            } catch (RemoteException e10) {
                this.f10890d.zzj().B().b("Failed to get trigger URIs; remote exception", e10);
                atomicReference = this.f10887a;
            }
            if (iVar == null) {
                this.f10890d.zzj().B().a("Failed to get trigger URIs; not connected to service");
                return;
            }
            com.google.android.gms.common.internal.s.j(this.f10888b);
            this.f10887a.set(iVar.j0(this.f10888b, this.f10889c));
            this.f10890d.b0();
            atomicReference = this.f10887a;
            atomicReference.notify();
        }
    }
}
