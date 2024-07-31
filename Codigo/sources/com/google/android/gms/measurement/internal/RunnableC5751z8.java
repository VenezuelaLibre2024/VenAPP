package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C5276s;
import java.util.concurrent.atomic.AtomicReference;
import p418wa.InterfaceC12109i;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.z8 */
/* loaded from: classes2.dex */
public final class RunnableC5751z8 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f12102a;

    /* renamed from: b */
    private final /* synthetic */ C5576lb f12103b;

    /* renamed from: c */
    private final /* synthetic */ Bundle f12104c;

    /* renamed from: d */
    private final /* synthetic */ C5703v8 f12105d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5751z8(C5703v8 c5703v8, AtomicReference atomicReference, C5576lb c5576lb, Bundle bundle) {
        this.f12105d = c5703v8;
        this.f12102a = atomicReference;
        this.f12103b = c5576lb;
        this.f12104c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        InterfaceC12109i interfaceC12109i;
        synchronized (this.f12102a) {
            try {
                try {
                    interfaceC12109i = this.f12105d.f11907d;
                } finally {
                    this.f12102a.notify();
                }
            } catch (RemoteException e10) {
                this.f12105d.zzj().m14182B().m14219b("Failed to get trigger URIs; remote exception", e10);
                atomicReference = this.f12102a;
            }
            if (interfaceC12109i == null) {
                this.f12105d.zzj().m14182B().m14218a("Failed to get trigger URIs; not connected to service");
                return;
            }
            C5276s.m13324j(this.f12103b);
            this.f12102a.set(interfaceC12109i.mo13617j0(this.f12103b, this.f12104c));
            this.f12105d.m14379b0();
            atomicReference = this.f12102a;
            atomicReference.notify();
        }
    }
}
