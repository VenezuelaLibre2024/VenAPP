package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class n9 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f10441a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f10442b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f10443c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ String f10444d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ lb f10445e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ v8 f10446f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n9(v8 v8Var, AtomicReference atomicReference, String str, String str2, String str3, lb lbVar) {
        this.f10446f = v8Var;
        this.f10441a = atomicReference;
        this.f10442b = str;
        this.f10443c = str2;
        this.f10444d = str3;
        this.f10445e = lbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        wa.i iVar;
        AtomicReference atomicReference2;
        List<d> K;
        synchronized (this.f10441a) {
            try {
                try {
                    iVar = this.f10446f.f10709d;
                } catch (RemoteException e10) {
                    this.f10446f.zzj().B().d("(legacy) Failed to get conditional properties; remote exception", n4.q(this.f10442b), this.f10443c, e10);
                    this.f10441a.set(Collections.emptyList());
                    atomicReference = this.f10441a;
                }
                if (iVar == null) {
                    this.f10446f.zzj().B().d("(legacy) Failed to get conditional properties; not connected to service", n4.q(this.f10442b), this.f10443c, this.f10444d);
                    this.f10441a.set(Collections.emptyList());
                    return;
                }
                if (TextUtils.isEmpty(this.f10442b)) {
                    com.google.android.gms.common.internal.s.j(this.f10445e);
                    atomicReference2 = this.f10441a;
                    K = iVar.d(this.f10443c, this.f10444d, this.f10445e);
                } else {
                    atomicReference2 = this.f10441a;
                    K = iVar.K(this.f10442b, this.f10443c, this.f10444d);
                }
                atomicReference2.set(K);
                this.f10446f.b0();
                atomicReference = this.f10441a;
                atomicReference.notify();
            } finally {
                this.f10441a.notify();
            }
        }
    }
}
