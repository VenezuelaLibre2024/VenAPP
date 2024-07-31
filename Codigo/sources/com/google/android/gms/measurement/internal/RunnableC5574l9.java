package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C5276s;
import p418wa.InterfaceC12109i;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.l9 */
/* loaded from: classes2.dex */
public final class RunnableC5574l9 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ boolean f11531a;

    /* renamed from: b */
    private final /* synthetic */ C5576lb f11532b;

    /* renamed from: c */
    private final /* synthetic */ boolean f11533c;

    /* renamed from: d */
    private final /* synthetic */ C5461d0 f11534d;

    /* renamed from: e */
    private final /* synthetic */ String f11535e;

    /* renamed from: f */
    private final /* synthetic */ C5703v8 f11536f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5574l9(C5703v8 c5703v8, boolean z10, C5576lb c5576lb, boolean z11, C5461d0 c5461d0, String str) {
        this.f11536f = c5703v8;
        this.f11531a = z10;
        this.f11532b = c5576lb;
        this.f11533c = z11;
        this.f11534d = c5461d0;
        this.f11535e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC12109i interfaceC12109i;
        interfaceC12109i = this.f11536f.f11907d;
        if (interfaceC12109i == null) {
            this.f11536f.zzj().m14182B().m14218a("Discarding data. Failed to send event to service");
            return;
        }
        if (this.f11531a) {
            C5276s.m13324j(this.f11532b);
            this.f11536f.m14398O(interfaceC12109i, this.f11533c ? null : this.f11534d, this.f11532b);
        } else {
            try {
                if (TextUtils.isEmpty(this.f11535e)) {
                    C5276s.m13324j(this.f11532b);
                    interfaceC12109i.mo13609V0(this.f11534d, this.f11532b);
                } else {
                    interfaceC12109i.mo13607P1(this.f11534d, this.f11535e, this.f11536f.zzj().m14190J());
                }
            } catch (RemoteException e10) {
                this.f11536f.zzj().m14182B().m14219b("Failed to send event to the service", e10);
            }
        }
        this.f11536f.m14379b0();
    }
}
