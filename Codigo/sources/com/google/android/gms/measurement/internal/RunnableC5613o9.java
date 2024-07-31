package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C5276s;
import p418wa.InterfaceC12109i;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.o9 */
/* loaded from: classes2.dex */
public final class RunnableC5613o9 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ boolean f11665a = true;

    /* renamed from: b */
    private final /* synthetic */ C5576lb f11666b;

    /* renamed from: c */
    private final /* synthetic */ boolean f11667c;

    /* renamed from: d */
    private final /* synthetic */ C5460d f11668d;

    /* renamed from: e */
    private final /* synthetic */ C5460d f11669e;

    /* renamed from: f */
    private final /* synthetic */ C5703v8 f11670f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5613o9(C5703v8 c5703v8, boolean z10, C5576lb c5576lb, boolean z11, C5460d c5460d, C5460d c5460d2) {
        this.f11670f = c5703v8;
        this.f11666b = c5576lb;
        this.f11667c = z11;
        this.f11668d = c5460d;
        this.f11669e = c5460d2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC12109i interfaceC12109i;
        interfaceC12109i = this.f11670f.f11907d;
        if (interfaceC12109i == null) {
            this.f11670f.zzj().m14182B().m14218a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (this.f11665a) {
            C5276s.m13324j(this.f11666b);
            this.f11670f.m14398O(interfaceC12109i, this.f11667c ? null : this.f11668d, this.f11666b);
        } else {
            try {
                if (TextUtils.isEmpty(this.f11669e.f11163a)) {
                    C5276s.m13324j(this.f11666b);
                    interfaceC12109i.mo13612b2(this.f11668d, this.f11666b);
                } else {
                    interfaceC12109i.mo13608T(this.f11668d);
                }
            } catch (RemoteException e10) {
                this.f11670f.zzj().m14182B().m14219b("Failed to send conditional user property to the service", e10);
            }
        }
        this.f11670f.m14379b0();
    }
}
