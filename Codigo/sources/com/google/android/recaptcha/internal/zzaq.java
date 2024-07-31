package com.google.android.recaptcha.internal;

import android.net.TrafficStats;
import android.webkit.URLUtil;
import dk.r;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.n;

/* loaded from: classes2.dex */
public final class zzaq implements zzap {
    private final String zza;

    public zzaq(String str) {
        this.zza = str;
    }

    private static final void zzb(byte[] bArr) {
        List l10;
        for (zzkx zzkxVar : zzla.zzi(bArr).zzj()) {
            l10 = r.l("INIT_TOTAL", "EXECUTE_TOTAL");
            if (l10.contains(zzkxVar.zzj().name()) && zzkxVar.zzS()) {
                zzkxVar.zzH();
                zzkxVar.zzI();
                zzkxVar.zzj().name();
                zzkxVar.zzg().zzk();
                zzkxVar.zzg().zzf();
            } else {
                zzkxVar.zzH();
                zzkxVar.zzI();
                zzkxVar.zzj().name();
            }
            zzkxVar.zzT();
        }
    }

    @Override // com.google.android.recaptcha.internal.zzap
    public final boolean zza(byte[] bArr) {
        HttpURLConnection httpURLConnection;
        try {
            TrafficStats.setThreadStatsTag((int) Thread.currentThread().getId());
            zzb(bArr);
            if (URLUtil.isHttpUrl(this.zza)) {
                URLConnection openConnection = new URL(this.zza).openConnection();
                n.c(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                httpURLConnection = (HttpURLConnection) openConnection;
            } else {
                if (!URLUtil.isHttpsUrl(this.zza)) {
                    throw new MalformedURLException("Recaptcha server url only allows using Http or Https.");
                }
                URLConnection openConnection2 = new URL(this.zza).openConnection();
                n.c(openConnection2, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                httpURLConnection = (HttpsURLConnection) openConnection2;
            }
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestProperty("Content-Type", "application/x-protobuffer");
            httpURLConnection.connect();
            httpURLConnection.getOutputStream().write(bArr);
            return httpURLConnection.getResponseCode() == 200;
        } catch (Exception e10) {
            e10.getMessage();
            return false;
        }
    }
}
