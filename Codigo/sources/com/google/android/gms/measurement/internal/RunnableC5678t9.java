package com.google.android.gms.measurement.internal;

import p418wa.InterfaceC12109i;

/* renamed from: com.google.android.gms.measurement.internal.t9 */
/* loaded from: classes2.dex */
final class RunnableC5678t9 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ InterfaceC12109i f11854a;

    /* renamed from: b */
    private final /* synthetic */ ServiceConnectionC5665s9 f11855b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5678t9(ServiceConnectionC5665s9 serviceConnectionC5665s9, InterfaceC12109i interfaceC12109i) {
        this.f11855b = serviceConnectionC5665s9;
        this.f11854a = interfaceC12109i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f11855b) {
            this.f11855b.f11830a = false;
            if (!this.f11855b.f11832c.m14407X()) {
                this.f11855b.f11832c.zzj().m14181A().m14218a("Connected to remote service");
                this.f11855b.f11832c.m14397N(this.f11854a);
            }
        }
    }
}
