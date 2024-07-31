package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.g0;
import com.google.android.gms.ads.internal.util.h0;
import com.google.android.gms.ads.internal.util.j0;
import com.google.android.gms.ads.internal.util.u1;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzcgm {
    private final Context zza;
    private final String zzb;
    private final zzcei zzc;
    private final zzbgr zzd;
    private final zzbgu zze;
    private final j0 zzf;
    private final long[] zzg;
    private final String[] zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private zzcfr zzn;
    private boolean zzo;
    private boolean zzp;
    private long zzq;

    public zzcgm(Context context, zzcei zzceiVar, String str, zzbgu zzbguVar, zzbgr zzbgrVar) {
        h0 h0Var = new h0();
        h0Var.a("min_1", Double.MIN_VALUE, 1.0d);
        h0Var.a("1_5", 1.0d, 5.0d);
        h0Var.a("5_10", 5.0d, 10.0d);
        h0Var.a("10_20", 10.0d, 20.0d);
        h0Var.a("20_30", 20.0d, 30.0d);
        h0Var.a("30_max", 30.0d, Double.MAX_VALUE);
        this.zzf = h0Var.b();
        this.zzi = false;
        this.zzj = false;
        this.zzk = false;
        this.zzl = false;
        this.zzq = -1L;
        this.zza = context;
        this.zzc = zzceiVar;
        this.zzb = str;
        this.zze = zzbguVar;
        this.zzd = zzbgrVar;
        String str2 = (String) a0.c().zza(zzbgc.zzA);
        if (str2 == null) {
            this.zzh = new String[0];
            this.zzg = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ",");
        int length = split.length;
        this.zzh = new String[length];
        this.zzg = new long[length];
        for (int i10 = 0; i10 < split.length; i10++) {
            try {
                this.zzg[i10] = Long.parseLong(split[i10]);
            } catch (NumberFormatException e10) {
                zzcec.zzk("Unable to parse frame hash target time number.", e10);
                this.zzg[i10] = -1;
            }
        }
    }

    public final void zza(zzcfr zzcfrVar) {
        zzbgm.zza(this.zze, this.zzd, "vpc2");
        this.zzi = true;
        this.zze.zzd("vpn", zzcfrVar.zzj());
        this.zzn = zzcfrVar;
    }

    public final void zzb() {
        if (!this.zzi || this.zzj) {
            return;
        }
        zzbgm.zza(this.zze, this.zzd, "vfr2");
        this.zzj = true;
    }

    public final void zzc() {
        this.zzm = true;
        if (!this.zzj || this.zzk) {
            return;
        }
        zzbgm.zza(this.zze, this.zzd, "vfp2");
        this.zzk = true;
    }

    public final void zzd() {
        if (!((Boolean) zzbip.zza.zze()).booleanValue() || this.zzo) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("type", "native-player-metrics");
        bundle.putString("request", this.zzb);
        bundle.putString("player", this.zzn.zzj());
        for (g0 g0Var : this.zzf.a()) {
            String valueOf = String.valueOf(g0Var.f8969a);
            bundle.putString("fps_c_".concat(valueOf), Integer.toString(g0Var.f8973e));
            String valueOf2 = String.valueOf(g0Var.f8969a);
            bundle.putString("fps_p_".concat(valueOf2), Double.toString(g0Var.f8972d));
        }
        int i10 = 0;
        while (true) {
            long[] jArr = this.zzg;
            if (i10 >= jArr.length) {
                t.r().J(this.zza, this.zzc.zza, "gmob-apps", bundle, true);
                this.zzo = true;
                return;
            }
            String str = this.zzh[i10];
            if (str != null) {
                bundle.putString("fh_".concat(Long.valueOf(jArr[i10]).toString()), str);
            }
            i10++;
        }
    }

    public final void zze() {
        this.zzm = false;
    }

    public final void zzf(zzcfr zzcfrVar) {
        if (this.zzk && !this.zzl) {
            if (u1.c() && !this.zzl) {
                u1.a("VideoMetricsMixin first frame");
            }
            zzbgm.zza(this.zze, this.zzd, "vff2");
            this.zzl = true;
        }
        long c10 = t.b().c();
        if (this.zzm && this.zzp && this.zzq != -1) {
            this.zzf.b(TimeUnit.SECONDS.toNanos(1L) / (c10 - this.zzq));
        }
        this.zzp = this.zzm;
        this.zzq = c10;
        long longValue = ((Long) a0.c().zza(zzbgc.zzB)).longValue();
        long zza = zzcfrVar.zza();
        int i10 = 0;
        while (true) {
            String[] strArr = this.zzh;
            if (i10 >= strArr.length) {
                return;
            }
            if (strArr[i10] == null && longValue > Math.abs(zza - this.zzg[i10])) {
                String[] strArr2 = this.zzh;
                int i11 = 8;
                Bitmap bitmap = zzcfrVar.getBitmap(8, 8);
                long j10 = 63;
                int i12 = 0;
                long j11 = 0;
                while (i12 < i11) {
                    int i13 = 0;
                    while (i13 < i11) {
                        int pixel = bitmap.getPixel(i13, i12);
                        j11 |= ((Color.blue(pixel) + Color.red(pixel)) + Color.green(pixel) > 128 ? 1L : 0L) << ((int) j10);
                        j10--;
                        i13++;
                        i11 = 8;
                    }
                    i12++;
                    i11 = 8;
                }
                strArr2[i10] = String.format("%016X", Long.valueOf(j11));
                return;
            }
            i10++;
        }
    }
}
