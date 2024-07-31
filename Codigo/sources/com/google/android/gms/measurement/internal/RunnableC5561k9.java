package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzcv;
import p418wa.InterfaceC12109i;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.k9 */
/* loaded from: classes2.dex */
public final class RunnableC5561k9 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C5461d0 f11509a;

    /* renamed from: b */
    private final /* synthetic */ String f11510b;

    /* renamed from: c */
    private final /* synthetic */ zzcv f11511c;

    /* renamed from: d */
    private final /* synthetic */ C5703v8 f11512d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5561k9(C5703v8 c5703v8, C5461d0 c5461d0, String str, zzcv zzcvVar) {
        this.f11512d = c5703v8;
        this.f11509a = c5461d0;
        this.f11510b = str;
        this.f11511c = zzcvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC12109i interfaceC12109i;
        byte[] bArr = null;
        try {
            try {
                interfaceC12109i = this.f11512d.f11907d;
                if (interfaceC12109i == null) {
                    this.f11512d.zzj().m14182B().m14218a("Discarding data. Failed to send event to service to bundle");
                } else {
                    bArr = interfaceC12109i.mo13611a1(this.f11509a, this.f11510b);
                    this.f11512d.m14379b0();
                }
            } catch (RemoteException e10) {
                this.f11512d.zzj().m14182B().m14219b("Failed to send event to the service to bundle", e10);
            }
        } finally {
            this.f11512d.mo13681f().m14025P(this.f11511c, bArr);
        }
    }
}
