package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.measurement.zzcv;
import p418wa.InterfaceC12109i;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.c9 */
/* loaded from: classes2.dex */
public final class RunnableC5457c9 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C5576lb f11155a;

    /* renamed from: b */
    private final /* synthetic */ zzcv f11156b;

    /* renamed from: c */
    private final /* synthetic */ C5703v8 f11157c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5457c9(C5703v8 c5703v8, C5576lb c5576lb, zzcv zzcvVar) {
        this.f11157c = c5703v8;
        this.f11155a = c5576lb;
        this.f11156b = zzcvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC12109i interfaceC12109i;
        String str = null;
        try {
            try {
                if (this.f11157c.mo13679e().m14553E().m14596y()) {
                    interfaceC12109i = this.f11157c.f11907d;
                    if (interfaceC12109i == null) {
                        this.f11157c.zzj().m14182B().m14218a("Failed to get app instance id");
                    } else {
                        C5276s.m13324j(this.f11155a);
                        str = interfaceC12109i.mo13606N0(this.f11155a);
                        if (str != null) {
                            this.f11157c.mo13695m().m13659M(str);
                            this.f11157c.mo13679e().f12056g.m13878b(str);
                        }
                        this.f11157c.m14379b0();
                    }
                } else {
                    this.f11157c.zzj().m14188H().m14218a("Analytics storage consent denied; will not get app instance id");
                    this.f11157c.mo13695m().m13659M(null);
                    this.f11157c.mo13679e().f12056g.m13878b(null);
                }
            } catch (RemoteException e10) {
                this.f11157c.zzj().m14182B().m14219b("Failed to get app instance id", e10);
            }
        } finally {
            this.f11157c.mo13681f().m14021M(this.f11156b, null);
        }
    }
}
