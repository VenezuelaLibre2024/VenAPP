package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C5276s;
import p418wa.InterfaceC12109i;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.i9 */
/* loaded from: classes2.dex */
public final class RunnableC5535i9 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C5576lb f11461a;

    /* renamed from: b */
    private final /* synthetic */ Bundle f11462b;

    /* renamed from: c */
    private final /* synthetic */ C5703v8 f11463c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5535i9(C5703v8 c5703v8, C5576lb c5576lb, Bundle bundle) {
        this.f11463c = c5703v8;
        this.f11461a = c5576lb;
        this.f11462b = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC12109i interfaceC12109i;
        interfaceC12109i = this.f11463c.f11907d;
        if (interfaceC12109i == null) {
            this.f11463c.zzj().m14182B().m14218a("Failed to send default event parameters to service");
            return;
        }
        try {
            C5276s.m13324j(this.f11461a);
            interfaceC12109i.mo13601C0(this.f11462b, this.f11461a);
        } catch (RemoteException e10) {
            this.f11463c.zzj().m14182B().m14219b("Failed to send default event parameters to service", e10);
        }
    }
}
