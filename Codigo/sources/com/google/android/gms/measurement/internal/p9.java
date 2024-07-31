package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class p9 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f10515a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f10516b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f10517c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ String f10518d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ lb f10519e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ boolean f10520f;

    /* renamed from: r, reason: collision with root package name */
    private final /* synthetic */ v8 f10521r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p9(v8 v8Var, AtomicReference atomicReference, String str, String str2, String str3, lb lbVar, boolean z10) {
        this.f10521r = v8Var;
        this.f10515a = atomicReference;
        this.f10516b = str;
        this.f10517c = str2;
        this.f10518d = str3;
        this.f10519e = lbVar;
        this.f10520f = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        wa.i iVar;
        AtomicReference atomicReference2;
        List<hb> p10;
        synchronized (this.f10515a) {
            try {
                try {
                    iVar = this.f10521r.f10709d;
                } finally {
                    this.f10515a.notify();
                }
            } catch (RemoteException e10) {
                this.f10521r.zzj().B().d("(legacy) Failed to get user properties; remote exception", n4.q(this.f10516b), this.f10517c, e10);
                this.f10515a.set(Collections.emptyList());
                atomicReference = this.f10515a;
            }
            if (iVar == null) {
                this.f10521r.zzj().B().d("(legacy) Failed to get user properties; not connected to service", n4.q(this.f10516b), this.f10517c, this.f10518d);
                this.f10515a.set(Collections.emptyList());
                return;
            }
            if (TextUtils.isEmpty(this.f10516b)) {
                com.google.android.gms.common.internal.s.j(this.f10519e);
                atomicReference2 = this.f10515a;
                p10 = iVar.I1(this.f10517c, this.f10518d, this.f10520f, this.f10519e);
            } else {
                atomicReference2 = this.f10515a;
                p10 = iVar.p(this.f10516b, this.f10517c, this.f10518d, this.f10520f);
            }
            atomicReference2.set(p10);
            this.f10521r.b0();
            atomicReference = this.f10515a;
            atomicReference.notify();
        }
    }
}
