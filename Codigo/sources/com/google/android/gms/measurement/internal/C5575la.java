package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zznv;
import com.google.android.gms.internal.measurement.zzps;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.la */
/* loaded from: classes2.dex */
public final class C5575la {

    /* renamed from: a */
    final /* synthetic */ C5471da f11537a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5575la(C5471da c5471da) {
        this.f11537a = c5471da;
    }

    /* renamed from: c */
    private final void m14083c(long j10, boolean z10) {
        this.f11537a.mo13687i();
        if (this.f11537a.f11899a.m14512k()) {
            this.f11537a.mo13679e().f12065p.m13721b(j10);
            this.f11537a.zzj().m14186F().m14219b("Session started, time", Long.valueOf(this.f11537a.zzb().mo28131b()));
            Long valueOf = Long.valueOf(j10 / 1000);
            this.f11537a.mo13695m().m13665T("auto", "_sid", valueOf, j10);
            this.f11537a.mo13679e().f12066q.m13721b(valueOf.longValue());
            this.f11537a.mo13679e().f12061l.m13639a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", valueOf.longValue());
            if (this.f11537a.mo13672a().m13900n(C5474e0.f11286m0) && z10) {
                bundle.putLong("_aib", 1L);
            }
            this.f11537a.mo13695m().m13660N("auto", "_s", j10, bundle);
            if (zznv.zza() && this.f11537a.mo13672a().m13900n(C5474e0.f11292p0)) {
                String m13877a = this.f11537a.mo13679e().f12071v.m13877a();
                if (TextUtils.isEmpty(m13877a)) {
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", m13877a);
                this.f11537a.mo13695m().m13660N("auto", "_ssr", j10, bundle2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m14084a() {
        this.f11537a.mo13687i();
        if (this.f11537a.mo13679e().m14565t(this.f11537a.zzb().mo28130a())) {
            this.f11537a.mo13679e().f12061l.m13639a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.f11537a.zzj().m14186F().m14218a("Detected application was in foreground");
                m14083c(this.f11537a.zzb().mo28130a(), false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m14085b(long j10, boolean z10) {
        this.f11537a.mo13687i();
        this.f11537a.m13722B();
        if (this.f11537a.mo13679e().m14565t(j10)) {
            this.f11537a.mo13679e().f12061l.m13639a(true);
            if (zzps.zza() && this.f11537a.mo13672a().m13900n(C5474e0.f11308x0)) {
                this.f11537a.mo13691k().m13926D();
            }
        }
        this.f11537a.mo13679e().f12065p.m13721b(j10);
        if (this.f11537a.mo13679e().f12061l.m13640b()) {
            m14083c(j10, z10);
        }
    }
}
