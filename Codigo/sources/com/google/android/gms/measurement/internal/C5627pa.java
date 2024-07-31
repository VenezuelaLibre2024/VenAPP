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
import la.InterfaceC9461f;

/* renamed from: com.google.android.gms.measurement.internal.pa */
/* loaded from: classes2.dex */
public final class C5627pa extends AbstractC5692ua {

    /* renamed from: d */
    private final AlarmManager f11709d;

    /* renamed from: e */
    private AbstractC5681u f11710e;

    /* renamed from: f */
    private Integer f11711f;

    /* JADX INFO: Access modifiers changed from: protected */
    public C5627pa(C5705va c5705va) {
        super(c5705va);
        this.f11709d = (AlarmManager) zza().getSystemService("alarm");
    }

    /* renamed from: v */
    private final int m14222v() {
        if (this.f11711f == null) {
            this.f11711f = Integer.valueOf(("measurement" + zza().getPackageName()).hashCode());
        }
        return this.f11711f.intValue();
    }

    /* renamed from: w */
    private final PendingIntent m14223w() {
        Context zza = zza();
        return zzcc.zza(zza, 0, new Intent().setClassName(zza, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), zzcc.zza);
    }

    /* renamed from: x */
    private final AbstractC5681u m14224x() {
        if (this.f11710e == null) {
            this.f11710e = new C5666sa(this, this.f11804b.m14458d0());
        }
        return this.f11710e;
    }

    /* renamed from: y */
    private final void m14225y() {
        JobScheduler jobScheduler = (JobScheduler) zza().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(m14222v());
        }
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C5486f mo13672a() {
        return super.mo13672a();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C5730y mo13675c() {
        return super.mo13675c();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C5582m4 mo13677d() {
        return super.mo13677d();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C5735y4 mo13679e() {
        return super.mo13679e();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C5537ib mo13681f() {
        return super.mo13681f();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ void mo13683g() {
        super.mo13683g();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo13685h() {
        super.mo13685h();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ void mo13687i() {
        super.mo13687i();
    }

    @Override // com.google.android.gms.measurement.internal.C5653ra
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ C5472db mo13764j() {
        return super.mo13764j();
    }

    @Override // com.google.android.gms.measurement.internal.C5653ra
    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C5628pb mo13765k() {
        return super.mo13765k();
    }

    @Override // com.google.android.gms.measurement.internal.C5653ra
    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C5577m mo13766l() {
        return super.mo13766l();
    }

    @Override // com.google.android.gms.measurement.internal.C5653ra
    /* renamed from: m */
    public final /* bridge */ /* synthetic */ C5531i5 mo13767m() {
        return super.mo13767m();
    }

    @Override // com.google.android.gms.measurement.internal.C5653ra
    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C5740y9 mo13768n() {
        return super.mo13768n();
    }

    @Override // com.google.android.gms.measurement.internal.C5653ra
    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C5679ta mo13769o() {
        return super.mo13769o();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5692ua
    /* renamed from: s */
    protected final boolean mo13770s() {
        AlarmManager alarmManager = this.f11709d;
        if (alarmManager != null) {
            alarmManager.cancel(m14223w());
        }
        m14225y();
        return false;
    }

    /* renamed from: t */
    public final void m14226t(long j10) {
        m14360p();
        Context zza = zza();
        if (!C5537ib.m13987X(zza)) {
            zzj().m14181A().m14218a("Receiver not registered/enabled");
        }
        if (!C5537ib.m13988Y(zza, false)) {
            zzj().m14181A().m14218a("Service not registered/enabled");
        }
        m14227u();
        zzj().m14186F().m14219b("Scheduling upload, millis", Long.valueOf(j10));
        zzb().mo28131b();
        if (j10 < Math.max(0L, C5474e0.f11311z.m13918a(null).longValue()) && !m14224x().m14352e()) {
            m14224x().m14351b(j10);
        }
        Context zza2 = zza();
        ComponentName componentName = new ComponentName(zza2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int m14222v = m14222v();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        zzce.zza(zza2, new JobInfo.Builder(m14222v, componentName).setMinimumLatency(j10).setOverrideDeadline(j10 << 1).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }

    /* renamed from: u */
    public final void m14227u() {
        m14360p();
        zzj().m14186F().m14218a("Unscheduling upload");
        AlarmManager alarmManager = this.f11709d;
        if (alarmManager != null) {
            alarmManager.cancel(m14223w());
        }
        m14224x().m14350a();
        m14225y();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6, com.google.android.gms.measurement.internal.InterfaceC5713w6
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6, com.google.android.gms.measurement.internal.InterfaceC5713w6
    public final /* bridge */ /* synthetic */ InterfaceC9461f zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6, com.google.android.gms.measurement.internal.InterfaceC5713w6
    public final /* bridge */ /* synthetic */ C5473e zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6, com.google.android.gms.measurement.internal.InterfaceC5713w6
    public final /* bridge */ /* synthetic */ C5595n4 zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6, com.google.android.gms.measurement.internal.InterfaceC5713w6
    public final /* bridge */ /* synthetic */ C5635q5 zzl() {
        return super.zzl();
    }
}
