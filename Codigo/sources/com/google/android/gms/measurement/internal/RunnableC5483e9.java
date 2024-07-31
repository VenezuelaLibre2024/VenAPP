package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import p418wa.InterfaceC12109i;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.e9 */
/* loaded from: classes2.dex */
public final class RunnableC5483e9 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C5625p8 f11331a;

    /* renamed from: b */
    private final /* synthetic */ C5703v8 f11332b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5483e9(C5703v8 c5703v8, C5625p8 c5625p8) {
        this.f11332b = c5703v8;
        this.f11331a = c5625p8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC12109i interfaceC12109i;
        long j10;
        String str;
        String str2;
        String packageName;
        interfaceC12109i = this.f11332b.f11907d;
        if (interfaceC12109i == null) {
            this.f11332b.zzj().m14182B().m14218a("Failed to send current screen to service");
            return;
        }
        try {
            C5625p8 c5625p8 = this.f11331a;
            if (c5625p8 == null) {
                j10 = 0;
                str = null;
                str2 = null;
                packageName = this.f11332b.zza().getPackageName();
            } else {
                j10 = c5625p8.f11698c;
                str = c5625p8.f11696a;
                str2 = c5625p8.f11697b;
                packageName = this.f11332b.zza().getPackageName();
            }
            interfaceC12109i.mo13604J(j10, str, str2, packageName);
            this.f11332b.m14379b0();
        } catch (RemoteException e10) {
            this.f11332b.zzj().m14182B().m14219b("Failed to send current screen to the service", e10);
        }
    }
}
