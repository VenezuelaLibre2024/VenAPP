package com.google.android.gms.measurement;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.internal.aa;
import wa.e0;

/* loaded from: classes2.dex */
public final class AppMeasurementJobService extends JobService implements e0 {

    /* renamed from: a, reason: collision with root package name */
    private aa<AppMeasurementJobService> f9919a;

    private final aa<AppMeasurementJobService> c() {
        if (this.f9919a == null) {
            this.f9919a = new aa<>(this);
        }
        return this.f9919a;
    }

    @Override // wa.e0
    public final void a(Intent intent) {
    }

    @Override // wa.e0
    public final void b(JobParameters jobParameters, boolean z10) {
        jobFinished(jobParameters, false);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        c().c();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        c().h();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        c().i(intent);
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        return c().g(jobParameters);
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        return c().k(intent);
    }

    @Override // wa.e0
    public final boolean zza(int i10) {
        throw new UnsupportedOperationException();
    }
}
