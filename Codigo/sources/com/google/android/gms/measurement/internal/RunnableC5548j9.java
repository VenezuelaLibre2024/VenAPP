package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C5276s;
import p418wa.InterfaceC12109i;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.j9 */
/* loaded from: classes2.dex */
public final class RunnableC5548j9 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C5576lb f11484a;

    /* renamed from: b */
    private final /* synthetic */ C5703v8 f11485b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5548j9(C5703v8 c5703v8, C5576lb c5576lb) {
        this.f11485b = c5703v8;
        this.f11484a = c5576lb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC12109i interfaceC12109i;
        interfaceC12109i = this.f11485b.f11907d;
        if (interfaceC12109i == null) {
            this.f11485b.zzj().m14182B().m14218a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            C5276s.m13324j(this.f11484a);
            interfaceC12109i.mo13602D0(this.f11484a);
            this.f11485b.m14379b0();
        } catch (RemoteException e10) {
            this.f11485b.zzj().m14182B().m14219b("Failed to send measurementEnabled to the service", e10);
        }
    }
}
