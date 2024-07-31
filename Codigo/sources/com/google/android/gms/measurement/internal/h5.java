package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzby;
import com.google.android.gms.internal.measurement.zzoi;
import com.google.android.gms.internal.measurement.zzpy;

/* loaded from: classes2.dex */
final class h5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ zzby f10220a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ ServiceConnection f10221b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ f5 f10222c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h5(f5 f5Var, zzby zzbyVar, ServiceConnection serviceConnection) {
        this.f10222c = f5Var;
        this.f10220a = zzbyVar;
        this.f10221b = serviceConnection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        p4 B;
        String str2;
        f5 f5Var = this.f10222c;
        g5 g5Var = f5Var.f10174b;
        str = f5Var.f10173a;
        zzby zzbyVar = this.f10220a;
        ServiceConnection serviceConnection = this.f10221b;
        Bundle a10 = g5Var.a(str, zzbyVar);
        g5Var.f10194a.zzl().i();
        g5Var.f10194a.L();
        if (a10 != null) {
            long j10 = a10.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j10 == 0) {
                B = g5Var.f10194a.zzj().G();
                str2 = "Service response is missing Install Referrer install timestamp";
            } else {
                String string = a10.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    B = g5Var.f10194a.zzj().B();
                    str2 = "No referrer defined in Install Referrer response";
                } else {
                    g5Var.f10194a.zzj().F().b("InstallReferrer API result", string);
                    Bundle x10 = g5Var.f10194a.G().x(Uri.parse("?" + string), zzpy.zza() && g5Var.f10194a.u().n(e0.F0), zzoi.zza() && g5Var.f10194a.u().n(e0.f10089a1));
                    if (x10 == null) {
                        B = g5Var.f10194a.zzj().B();
                        str2 = "No campaign params defined in Install Referrer result";
                    } else {
                        String string2 = x10.getString("medium");
                        if ((string2 == null || "(not set)".equalsIgnoreCase(string2) || "organic".equalsIgnoreCase(string2)) ? false : true) {
                            long j11 = a10.getLong("referrer_click_timestamp_seconds", 0L) * 1000;
                            if (j11 == 0) {
                                B = g5Var.f10194a.zzj().B();
                                str2 = "Install Referrer is missing click timestamp for ad campaign";
                            } else {
                                x10.putLong("click_timestamp", j11);
                            }
                        }
                        if (j10 == g5Var.f10194a.A().f10840f.a()) {
                            g5Var.f10194a.zzj().F().a("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (g5Var.f10194a.k()) {
                            g5Var.f10194a.A().f10840f.b(j10);
                            g5Var.f10194a.zzj().F().b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            x10.putString("_cis", "referrer API v2");
                            g5Var.f10194a.C().R("auto", "_cmp", x10, str);
                        }
                    }
                }
            }
            B.a(str2);
        }
        if (serviceConnection != null) {
            ka.b.b().c(g5Var.f10194a.zza(), serviceConnection);
        }
    }
}
