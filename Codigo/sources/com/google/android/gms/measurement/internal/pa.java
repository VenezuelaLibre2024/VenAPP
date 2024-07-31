package com.google.android.gms.measurement.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzce;

/* loaded from: classes2.dex */
public final class pa extends ua {

    /* renamed from: d, reason: collision with root package name */
    private final AlarmManager f10522d;

    /* renamed from: e, reason: collision with root package name */
    private u f10523e;

    /* renamed from: f, reason: collision with root package name */
    private Integer f10524f;

    /* JADX INFO: Access modifiers changed from: protected */
    public pa(va vaVar) {
        super(vaVar);
        this.f10522d = (AlarmManager) zza().getSystemService("alarm");
    }

    private final int v() {
        if (this.f10524f == null) {
            this.f10524f = Integer.valueOf(("measurement" + zza().getPackageName()).hashCode());
        }
        return this.f10524f.intValue();
    }

    private final PendingIntent w() {
        Context zza = zza();
        return zzcc.zza(zza, 0, new Intent().setClassName(zza, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), zzcc.zza);
    }

    private final u x() {
        if (this.f10523e == null) {
            this.f10523e = new sa(this, this.f10606b.d0());
        }
        return this.f10523e;
    }

    private final void y() {
        JobScheduler jobScheduler = (JobScheduler) zza().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(v());
        }
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ f a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ y c() {
        return super.c();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ m4 d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ y4 e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ ib f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void g() {
        super.g();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ db j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ pb k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ m l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ i5 m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ y9 n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ ta o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.ua
    protected final boolean s() {
        AlarmManager alarmManager = this.f10522d;
        if (alarmManager != null) {
            alarmManager.cancel(w());
        }
        y();
        return false;
    }

    public final void t(long j10) {
        p();
        Context zza = zza();
        if (!ib.X(zza)) {
            zzj().A().a("Receiver not registered/enabled");
        }
        if (!ib.Y(zza, false)) {
            zzj().A().a("Service not registered/enabled");
        }
        u();
        zzj().F().b("Scheduling upload, millis", Long.valueOf(j10));
        zzb().b();
        if (j10 < Math.max(0L, e0.f10139z.a(null).longValue()) && !x().e()) {
            x().b(j10);
        }
        Context zza2 = zza();
        ComponentName componentName = new ComponentName(zza2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int v10 = v();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        zzce.zza(zza2, new JobInfo.Builder(v10, componentName).setMinimumLatency(j10).setOverrideDeadline(j10 << 1).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }

    public final void u() {
        p();
        zzj().F().a("Unscheduling upload");
        AlarmManager alarmManager = this.f10522d;
        if (alarmManager != null) {
            alarmManager.cancel(w());
        }
        x().a();
        y();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ la.f zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ e zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ n4 zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ q5 zzl() {
        return super.zzl();
    }
}
