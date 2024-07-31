package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzby;
import com.google.android.gms.internal.measurement.zzoi;
import com.google.android.gms.internal.measurement.zzpy;
import p200ka.C9214b;

/* renamed from: com.google.android.gms.measurement.internal.h5 */
/* loaded from: classes2.dex */
final class RunnableC5518h5 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzby f11392a;

    /* renamed from: b */
    private final /* synthetic */ ServiceConnection f11393b;

    /* renamed from: c */
    private final /* synthetic */ ServiceConnectionC5492f5 f11394c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5518h5(ServiceConnectionC5492f5 serviceConnectionC5492f5, zzby zzbyVar, ServiceConnection serviceConnection) {
        this.f11394c = serviceConnectionC5492f5;
        this.f11392a = zzbyVar;
        this.f11393b = serviceConnection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        C5621p4 m14182B;
        String str2;
        ServiceConnectionC5492f5 serviceConnectionC5492f5 = this.f11394c;
        C5505g5 c5505g5 = serviceConnectionC5492f5.f11346b;
        str = serviceConnectionC5492f5.f11345a;
        zzby zzbyVar = this.f11392a;
        ServiceConnection serviceConnection = this.f11393b;
        Bundle m13915a = c5505g5.m13915a(str, zzbyVar);
        c5505g5.f11366a.zzl().mo13687i();
        c5505g5.f11366a.m14505L();
        if (m13915a != null) {
            long j10 = m13915a.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j10 == 0) {
                m14182B = c5505g5.f11366a.zzj().m14187G();
                str2 = "Service response is missing Install Referrer install timestamp";
            } else {
                String string = m13915a.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    m14182B = c5505g5.f11366a.zzj().m14182B();
                    str2 = "No referrer defined in Install Referrer response";
                } else {
                    c5505g5.f11366a.zzj().m14186F().m14219b("InstallReferrer API result", string);
                    Bundle m14050x = c5505g5.f11366a.m14500G().m14050x(Uri.parse("?" + string), zzpy.zza() && c5505g5.f11366a.m14521u().m13900n(C5474e0.f11218F0), zzoi.zza() && c5505g5.f11366a.m14521u().m13900n(C5474e0.f11261a1));
                    if (m14050x == null) {
                        m14182B = c5505g5.f11366a.zzj().m14182B();
                        str2 = "No campaign params defined in Install Referrer result";
                    } else {
                        String string2 = m14050x.getString("medium");
                        if ((string2 == null || "(not set)".equalsIgnoreCase(string2) || "organic".equalsIgnoreCase(string2)) ? false : true) {
                            long j11 = m13915a.getLong("referrer_click_timestamp_seconds", 0L) * 1000;
                            if (j11 == 0) {
                                m14182B = c5505g5.f11366a.zzj().m14182B();
                                str2 = "Install Referrer is missing click timestamp for ad campaign";
                            } else {
                                m14050x.putLong("click_timestamp", j11);
                            }
                        }
                        if (j10 == c5505g5.f11366a.m14494A().f12055f.m13720a()) {
                            c5505g5.f11366a.zzj().m14186F().m14218a("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (c5505g5.f11366a.m14512k()) {
                            c5505g5.f11366a.m14494A().f12055f.m13721b(j10);
                            c5505g5.f11366a.zzj().m14186F().m14219b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            m14050x.putString("_cis", "referrer API v2");
                            c5505g5.f11366a.m14496C().m13663R("auto", "_cmp", m14050x, str);
                        }
                    }
                }
            }
            m14182B.m14218a(str2);
        }
        if (serviceConnection != null) {
            C9214b.m27395b().m27401c(c5505g5.f11366a.zza(), serviceConnection);
        }
    }
}
