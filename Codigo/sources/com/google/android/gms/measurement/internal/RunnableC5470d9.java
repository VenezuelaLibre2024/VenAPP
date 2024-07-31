package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C5276s;
import java.util.concurrent.atomic.AtomicReference;
import p418wa.InterfaceC12109i;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.d9 */
/* loaded from: classes2.dex */
public final class RunnableC5470d9 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f11198a;

    /* renamed from: b */
    private final /* synthetic */ C5576lb f11199b;

    /* renamed from: c */
    private final /* synthetic */ C5703v8 f11200c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5470d9(C5703v8 c5703v8, AtomicReference atomicReference, C5576lb c5576lb) {
        this.f11200c = c5703v8;
        this.f11198a = atomicReference;
        this.f11199b = c5576lb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        InterfaceC12109i interfaceC12109i;
        synchronized (this.f11198a) {
            try {
                try {
                } finally {
                    this.f11198a.notify();
                }
            } catch (RemoteException e10) {
                this.f11200c.zzj().m14182B().m14219b("Failed to get app instance id", e10);
                atomicReference = this.f11198a;
            }
            if (!this.f11200c.mo13679e().m14553E().m14596y()) {
                this.f11200c.zzj().m14188H().m14218a("Analytics storage consent denied; will not get app instance id");
                this.f11200c.mo13695m().m13659M(null);
                this.f11200c.mo13679e().f12056g.m13878b(null);
                this.f11198a.set(null);
                return;
            }
            interfaceC12109i = this.f11200c.f11907d;
            if (interfaceC12109i == null) {
                this.f11200c.zzj().m14182B().m14218a("Failed to get app instance id");
                return;
            }
            C5276s.m13324j(this.f11199b);
            this.f11198a.set(interfaceC12109i.mo13606N0(this.f11199b));
            String str = (String) this.f11198a.get();
            if (str != null) {
                this.f11200c.mo13695m().m13659M(str);
                this.f11200c.mo13679e().f12056g.m13878b(str);
            }
            this.f11200c.m14379b0();
            atomicReference = this.f11198a;
            atomicReference.notify();
        }
    }
}
