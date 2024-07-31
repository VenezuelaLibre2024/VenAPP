package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.measurement.internal.aa;
import wa.e0;

/* loaded from: classes2.dex */
public final class AppMeasurementService extends Service implements e0 {

    /* renamed from: a, reason: collision with root package name */
    private aa<AppMeasurementService> f9921a;

    private final aa<AppMeasurementService> c() {
        if (this.f9921a == null) {
            this.f9921a = new aa<>(this);
        }
        return this.f9921a;
    }

    @Override // wa.e0
    public final void a(Intent intent) {
        g1.a.b(intent);
    }

    @Override // wa.e0
    public final void b(JobParameters jobParameters, boolean z10) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return c().b(intent);
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

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        return c().a(intent, i10, i11);
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        return c().k(intent);
    }

    @Override // wa.e0
    public final boolean zza(int i10) {
        return stopSelfResult(i10);
    }
}
