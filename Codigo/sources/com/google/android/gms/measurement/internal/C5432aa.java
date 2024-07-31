package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.common.internal.C5276s;
import p418wa.InterfaceC12102e0;

/* renamed from: com.google.android.gms.measurement.internal.aa */
/* loaded from: classes2.dex */
public final class C5432aa<T extends Context & InterfaceC12102e0> {

    /* renamed from: a */
    private final T f11090a;

    public C5432aa(T t10) {
        C5276s.m13324j(t10);
        this.f11090a = t10;
    }

    /* renamed from: f */
    private final void m13623f(Runnable runnable) {
        C5705va m14432g = C5705va.m14432g(this.f11090a);
        m14432g.zzl().m14248y(new RunnableC5445ba(this, m14432g, runnable));
    }

    /* renamed from: j */
    private final C5595n4 m13624j() {
        return C5712w5.m14488a(this.f11090a, null, null).zzj();
    }

    /* renamed from: a */
    public final int m13625a(final Intent intent, int i10, final int i11) {
        final C5595n4 zzj = C5712w5.m14488a(this.f11090a, null, null).zzj();
        if (intent == null) {
            zzj.m14187G().m14218a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        zzj.m14186F().m14220c("Local AppMeasurementService called. startId, action", Integer.valueOf(i11), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            m13623f(new Runnable() { // from class: com.google.android.gms.measurement.internal.ca
                @Override // java.lang.Runnable
                public final void run() {
                    C5432aa.this.m13628d(i11, zzj, intent);
                }
            });
        }
        return 2;
    }

    /* renamed from: b */
    public final IBinder m13626b(Intent intent) {
        if (intent == null) {
            m13624j().m14182B().m14218a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new BinderC5428a6(C5705va.m14432g(this.f11090a));
        }
        m13624j().m14187G().m14219b("onBind received unknown action", action);
        return null;
    }

    /* renamed from: c */
    public final void m13627c() {
        C5712w5.m14488a(this.f11090a, null, null).zzj().m14186F().m14218a("Local AppMeasurementService is starting up");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void m13628d(int i10, C5595n4 c5595n4, Intent intent) {
        if (this.f11090a.zza(i10)) {
            c5595n4.m14186F().m14219b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i10));
            m13624j().m14186F().m14218a("Completed wakeful intent.");
            this.f11090a.mo13578a(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void m13629e(C5595n4 c5595n4, JobParameters jobParameters) {
        c5595n4.m14186F().m14218a("AppMeasurementJobService processed last upload request.");
        this.f11090a.mo13579b(jobParameters, false);
    }

    /* renamed from: g */
    public final boolean m13630g(final JobParameters jobParameters) {
        final C5595n4 zzj = C5712w5.m14488a(this.f11090a, null, null).zzj();
        String string = jobParameters.getExtras().getString("action");
        zzj.m14186F().m14219b("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        m13623f(new Runnable() { // from class: com.google.android.gms.measurement.internal.z9
            @Override // java.lang.Runnable
            public final void run() {
                C5432aa.this.m13629e(zzj, jobParameters);
            }
        });
        return true;
    }

    /* renamed from: h */
    public final void m13631h() {
        C5712w5.m14488a(this.f11090a, null, null).zzj().m14186F().m14218a("Local AppMeasurementService is shutting down");
    }

    /* renamed from: i */
    public final void m13632i(Intent intent) {
        if (intent == null) {
            m13624j().m14182B().m14218a("onRebind called with null intent");
        } else {
            m13624j().m14186F().m14219b("onRebind called. action", intent.getAction());
        }
    }

    /* renamed from: k */
    public final boolean m13633k(Intent intent) {
        if (intent == null) {
            m13624j().m14182B().m14218a("onUnbind called with null intent");
            return true;
        }
        m13624j().m14186F().m14219b("onUnbind called for intent. action", intent.getAction());
        return true;
    }
}
