package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C5276s;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p418wa.InterfaceC12109i;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.n9 */
/* loaded from: classes2.dex */
public final class RunnableC5600n9 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f11628a;

    /* renamed from: b */
    private final /* synthetic */ String f11629b;

    /* renamed from: c */
    private final /* synthetic */ String f11630c;

    /* renamed from: d */
    private final /* synthetic */ String f11631d;

    /* renamed from: e */
    private final /* synthetic */ C5576lb f11632e;

    /* renamed from: f */
    private final /* synthetic */ C5703v8 f11633f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5600n9(C5703v8 c5703v8, AtomicReference atomicReference, String str, String str2, String str3, C5576lb c5576lb) {
        this.f11633f = c5703v8;
        this.f11628a = atomicReference;
        this.f11629b = str;
        this.f11630c = str2;
        this.f11631d = str3;
        this.f11632e = c5576lb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        InterfaceC12109i interfaceC12109i;
        AtomicReference atomicReference2;
        List<C5460d> mo13605K;
        synchronized (this.f11628a) {
            try {
                try {
                    interfaceC12109i = this.f11633f.f11907d;
                } catch (RemoteException e10) {
                    this.f11633f.zzj().m14182B().m14221d("(legacy) Failed to get conditional properties; remote exception", C5595n4.m14174q(this.f11629b), this.f11630c, e10);
                    this.f11628a.set(Collections.emptyList());
                    atomicReference = this.f11628a;
                }
                if (interfaceC12109i == null) {
                    this.f11633f.zzj().m14182B().m14221d("(legacy) Failed to get conditional properties; not connected to service", C5595n4.m14174q(this.f11629b), this.f11630c, this.f11631d);
                    this.f11628a.set(Collections.emptyList());
                    return;
                }
                if (TextUtils.isEmpty(this.f11629b)) {
                    C5276s.m13324j(this.f11632e);
                    atomicReference2 = this.f11628a;
                    mo13605K = interfaceC12109i.mo13614d(this.f11630c, this.f11631d, this.f11632e);
                } else {
                    atomicReference2 = this.f11628a;
                    mo13605K = interfaceC12109i.mo13605K(this.f11629b, this.f11630c, this.f11631d);
                }
                atomicReference2.set(mo13605K);
                this.f11633f.m14379b0();
                atomicReference = this.f11628a;
                atomicReference.notify();
            } finally {
                this.f11628a.notify();
            }
        }
    }
}
