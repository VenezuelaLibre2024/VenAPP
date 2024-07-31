package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C5276s;
import p418wa.InterfaceC12109i;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.g9 */
/* loaded from: classes2.dex */
public final class RunnableC5509g9 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C5576lb f11376a;

    /* renamed from: b */
    private final /* synthetic */ C5703v8 f11377b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5509g9(C5703v8 c5703v8, C5576lb c5576lb) {
        this.f11377b = c5703v8;
        this.f11376a = c5576lb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC12109i interfaceC12109i;
        interfaceC12109i = this.f11377b.f11907d;
        if (interfaceC12109i == null) {
            this.f11377b.zzj().m14182B().m14218a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            C5276s.m13324j(this.f11376a);
            interfaceC12109i.mo13615d1(this.f11376a);
            this.f11377b.mo13693l().m14079E();
            this.f11377b.m14398O(interfaceC12109i, null, this.f11376a);
            this.f11377b.m14379b0();
        } catch (RemoteException e10) {
            this.f11377b.zzj().m14182B().m14219b("Failed to send app launch to the service", e10);
        }
    }
}
