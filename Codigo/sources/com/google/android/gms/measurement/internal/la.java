package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zznv;
import com.google.android.gms.internal.measurement.zzps;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class la {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ da f10365a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public la(da daVar) {
        this.f10365a = daVar;
    }

    private final void c(long j10, boolean z10) {
        this.f10365a.i();
        if (this.f10365a.f10701a.k()) {
            this.f10365a.e().f10850p.b(j10);
            this.f10365a.zzj().F().b("Session started, time", Long.valueOf(this.f10365a.zzb().b()));
            Long valueOf = Long.valueOf(j10 / 1000);
            this.f10365a.m().T("auto", "_sid", valueOf, j10);
            this.f10365a.e().f10851q.b(valueOf.longValue());
            this.f10365a.e().f10846l.a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", valueOf.longValue());
            if (this.f10365a.a().n(e0.f10114m0) && z10) {
                bundle.putLong("_aib", 1L);
            }
            this.f10365a.m().N("auto", "_s", j10, bundle);
            if (zznv.zza() && this.f10365a.a().n(e0.f10120p0)) {
                String a10 = this.f10365a.e().f10856v.a();
                if (TextUtils.isEmpty(a10)) {
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", a10);
                this.f10365a.m().N("auto", "_ssr", j10, bundle2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.f10365a.i();
        if (this.f10365a.e().t(this.f10365a.zzb().a())) {
            this.f10365a.e().f10846l.a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.f10365a.zzj().F().a("Detected application was in foreground");
                c(this.f10365a.zzb().a(), false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(long j10, boolean z10) {
        this.f10365a.i();
        this.f10365a.B();
        if (this.f10365a.e().t(j10)) {
            this.f10365a.e().f10846l.a(true);
            if (zzps.zza() && this.f10365a.a().n(e0.f10136x0)) {
                this.f10365a.k().D();
            }
        }
        this.f10365a.e().f10850p.b(j10);
        if (this.f10365a.e().f10846l.b()) {
            c(j10, z10);
        }
    }
}
