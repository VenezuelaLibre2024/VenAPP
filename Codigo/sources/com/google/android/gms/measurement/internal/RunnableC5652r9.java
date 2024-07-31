package com.google.android.gms.measurement.internal;

import p418wa.InterfaceC12109i;

/* renamed from: com.google.android.gms.measurement.internal.r9 */
/* loaded from: classes2.dex */
final class RunnableC5652r9 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ InterfaceC12109i f11802a;

    /* renamed from: b */
    private final /* synthetic */ ServiceConnectionC5665s9 f11803b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5652r9(ServiceConnectionC5665s9 serviceConnectionC5665s9, InterfaceC12109i interfaceC12109i) {
        this.f11803b = serviceConnectionC5665s9;
        this.f11802a = interfaceC12109i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f11803b) {
            this.f11803b.f11830a = false;
            if (!this.f11803b.f11832c.m14407X()) {
                this.f11803b.f11832c.zzj().m14186F().m14218a("Connected to service");
                this.f11803b.f11832c.m14397N(this.f11802a);
            }
        }
    }
}
