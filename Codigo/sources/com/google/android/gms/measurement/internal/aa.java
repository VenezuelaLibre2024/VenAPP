package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import wa.e0;

/* loaded from: classes2.dex */
public final class aa<T extends Context & wa.e0> {

    /* renamed from: a, reason: collision with root package name */
    private final T f9970a;

    public aa(T t10) {
        com.google.android.gms.common.internal.s.j(t10);
        this.f9970a = t10;
    }

    private final void f(Runnable runnable) {
        va g10 = va.g(this.f9970a);
        g10.zzl().y(new ba(this, g10, runnable));
    }

    private final n4 j() {
        return w5.a(this.f9970a, null, null).zzj();
    }

    public final int a(final Intent intent, int i10, final int i11) {
        final n4 zzj = w5.a(this.f9970a, null, null).zzj();
        if (intent == null) {
            zzj.G().a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        zzj.F().c("Local AppMeasurementService called. startId, action", Integer.valueOf(i11), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            f(new Runnable() { // from class: com.google.android.gms.measurement.internal.ca
                @Override // java.lang.Runnable
                public final void run() {
                    aa.this.d(i11, zzj, intent);
                }
            });
        }
        return 2;
    }

    public final IBinder b(Intent intent) {
        if (intent == null) {
            j().B().a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new a6(va.g(this.f9970a));
        }
        j().G().b("onBind received unknown action", action);
        return null;
    }

    public final void c() {
        w5.a(this.f9970a, null, null).zzj().F().a("Local AppMeasurementService is starting up");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void d(int i10, n4 n4Var, Intent intent) {
        if (this.f9970a.zza(i10)) {
            n4Var.F().b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i10));
            j().F().a("Completed wakeful intent.");
            this.f9970a.a(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void e(n4 n4Var, JobParameters jobParameters) {
        n4Var.F().a("AppMeasurementJobService processed last upload request.");
        this.f9970a.b(jobParameters, false);
    }

    public final boolean g(final JobParameters jobParameters) {
        final n4 zzj = w5.a(this.f9970a, null, null).zzj();
        String string = jobParameters.getExtras().getString("action");
        zzj.F().b("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        f(new Runnable() { // from class: com.google.android.gms.measurement.internal.z9
            @Override // java.lang.Runnable
            public final void run() {
                aa.this.e(zzj, jobParameters);
            }
        });
        return true;
    }

    public final void h() {
        w5.a(this.f9970a, null, null).zzj().F().a("Local AppMeasurementService is shutting down");
    }

    public final void i(Intent intent) {
        if (intent == null) {
            j().B().a("onRebind called with null intent");
        } else {
            j().F().b("onRebind called. action", intent.getAction());
        }
    }

    public final boolean k(Intent intent) {
        if (intent == null) {
            j().B().a("onUnbind called with null intent");
            return true;
        }
        j().F().b("onUnbind called for intent. action", intent.getAction());
        return true;
    }
}
