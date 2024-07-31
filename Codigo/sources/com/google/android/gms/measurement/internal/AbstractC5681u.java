package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.measurement.zzcp;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.u */
/* loaded from: classes2.dex */
public abstract class AbstractC5681u {

    /* renamed from: d */
    private static volatile Handler f11860d;

    /* renamed from: a */
    private final InterfaceC5713w6 f11861a;

    /* renamed from: b */
    private final Runnable f11862b;

    /* renamed from: c */
    private volatile long f11863c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC5681u(InterfaceC5713w6 interfaceC5713w6) {
        C5276s.m13324j(interfaceC5713w6);
        this.f11861a = interfaceC5713w6;
        this.f11862b = new RunnableC5668t(this, interfaceC5713w6);
    }

    /* renamed from: f */
    private final Handler m14349f() {
        Handler handler;
        if (f11860d != null) {
            return f11860d;
        }
        synchronized (AbstractC5681u.class) {
            if (f11860d == null) {
                f11860d = new zzcp(this.f11861a.zza().getMainLooper());
            }
            handler = f11860d;
        }
        return handler;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m14350a() {
        this.f11863c = 0L;
        m14349f().removeCallbacks(this.f11862b);
    }

    /* renamed from: b */
    public final void m14351b(long j10) {
        m14350a();
        if (j10 >= 0) {
            this.f11863c = this.f11861a.zzb().mo28130a();
            if (m14349f().postDelayed(this.f11862b, j10)) {
                return;
            }
            this.f11861a.zzj().m14182B().m14219b("Failed to schedule delayed post. time", Long.valueOf(j10));
        }
    }

    /* renamed from: d */
    public abstract void mo13920d();

    /* renamed from: e */
    public final boolean m14352e() {
        return this.f11863c != 0;
    }
}
