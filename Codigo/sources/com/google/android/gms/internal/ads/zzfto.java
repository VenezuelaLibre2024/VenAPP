package com.google.android.gms.internal.ads;

import android.net.Network;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* loaded from: classes2.dex */
public final class zzfto extends zzftc {
    private zzfxu<Integer> zza;
    private zzfxu<Integer> zzb;
    private zzftn zzc;
    private HttpURLConnection zzd;

    public zzfto() {
        this(zzfte.zza, zzftf.zza, null);
    }

    public zzfto(zzfxu<Integer> zzfxuVar, zzfxu<Integer> zzfxuVar2, zzftn zzftnVar) {
        this.zza = zzfxuVar;
        this.zzb = zzfxuVar2;
        this.zzc = zzftnVar;
    }

    public static /* synthetic */ Integer zzf() {
        return -1;
    }

    public static /* synthetic */ Integer zzg() {
        return -1;
    }

    public static void zzs(HttpURLConnection httpURLConnection) {
        zzftd.zza();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        zzs(this.zzd);
    }

    public HttpURLConnection zzm() {
        zzftd.zzb(((Integer) this.zza.zza()).intValue(), ((Integer) this.zzb.zza()).intValue());
        zzftn zzftnVar = this.zzc;
        zzftnVar.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) zzftnVar.zza();
        this.zzd = httpURLConnection;
        return httpURLConnection;
    }

    public HttpURLConnection zzn(zzftn zzftnVar, int i10, int i11) {
        this.zza = new zzfxu() { // from class: com.google.android.gms.internal.ads.zzftg
            public final /* synthetic */ int zza;

            public /* synthetic */ zzftg(int i102) {
                r1 = i102;
            }

            @Override // com.google.android.gms.internal.ads.zzfxu
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(r1);
                return valueOf;
            }
        };
        this.zzb = new zzfxu() { // from class: com.google.android.gms.internal.ads.zzfth
            public final /* synthetic */ int zza;

            public /* synthetic */ zzfth(int i112) {
                r1 = i112;
            }

            @Override // com.google.android.gms.internal.ads.zzfxu
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(r1);
                return valueOf;
            }
        };
        this.zzc = zzftnVar;
        return zzm();
    }

    public HttpURLConnection zzo(Network network, URL url, int i10, int i11) {
        this.zza = new zzfxu() { // from class: com.google.android.gms.internal.ads.zzfti
            public final /* synthetic */ int zza;

            public /* synthetic */ zzfti(int i102) {
                r1 = i102;
            }

            @Override // com.google.android.gms.internal.ads.zzfxu
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(r1);
                return valueOf;
            }
        };
        this.zzb = new zzfxu() { // from class: com.google.android.gms.internal.ads.zzftj
            public final /* synthetic */ int zza;

            public /* synthetic */ zzftj(int i112) {
                r1 = i112;
            }

            @Override // com.google.android.gms.internal.ads.zzfxu
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(r1);
                return valueOf;
            }
        };
        this.zzc = new zzftn() { // from class: com.google.android.gms.internal.ads.zzftk
            public final /* synthetic */ Network zza;
            public final /* synthetic */ URL zzb;

            public /* synthetic */ zzftk(Network network2, URL url2) {
                r1 = network2;
                r2 = url2;
            }

            @Override // com.google.android.gms.internal.ads.zzftn
            public final URLConnection zza() {
                URLConnection openConnection;
                openConnection = r1.openConnection(r2);
                return openConnection;
            }
        };
        return zzm();
    }

    public URLConnection zzr(URL url, int i10) {
        this.zza = new zzfxu() { // from class: com.google.android.gms.internal.ads.zzftl
            public final /* synthetic */ int zza;

            public /* synthetic */ zzftl(int i102) {
                r1 = i102;
            }

            @Override // com.google.android.gms.internal.ads.zzfxu
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(r1);
                return valueOf;
            }
        };
        this.zzc = new zzftn() { // from class: com.google.android.gms.internal.ads.zzftm
            public final /* synthetic */ URL zza;

            public /* synthetic */ zzftm(URL url2) {
                r1 = url2;
            }

            @Override // com.google.android.gms.internal.ads.zzftn
            public final URLConnection zza() {
                URLConnection openConnection;
                openConnection = r1.openConnection();
                return openConnection;
            }
        };
        return zzm();
    }
}
