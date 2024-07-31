package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C5276s;
import p418wa.InterfaceC12109i;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.a9 */
/* loaded from: classes2.dex */
public final class RunnableC5431a9 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C5576lb f11088a;

    /* renamed from: b */
    private final /* synthetic */ C5703v8 f11089b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5431a9(C5703v8 c5703v8, C5576lb c5576lb) {
        this.f11089b = c5703v8;
        this.f11088a = c5576lb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC12109i interfaceC12109i;
        interfaceC12109i = this.f11089b.f11907d;
        if (interfaceC12109i == null) {
            this.f11089b.zzj().m14182B().m14218a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            C5276s.m13324j(this.f11088a);
            interfaceC12109i.mo13622t0(this.f11088a);
        } catch (RemoteException e10) {
            this.f11089b.zzj().m14182B().m14219b("Failed to reset data on the service: remote exception", e10);
        }
        this.f11089b.m14379b0();
    }
}
