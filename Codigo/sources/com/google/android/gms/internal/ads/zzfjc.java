package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.a0;

/* loaded from: classes2.dex */
public final class zzfjc extends ea.a {
    public static final Parcelable.Creator<zzfjc> CREATOR = new zzfjd();
    public final Context zza;
    public final zzfiz zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final String zzf;
    public final int zzg;
    private final zzfiz[] zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int[] zzl;
    private final int[] zzm;

    public zzfjc(int i10, int i11, int i12, int i13, String str, int i14, int i15) {
        zzfiz[] values = zzfiz.values();
        this.zzh = values;
        int[] zza = zzfja.zza();
        this.zzl = zza;
        int[] zza2 = zzfjb.zza();
        this.zzm = zza2;
        this.zza = null;
        this.zzi = i10;
        this.zzb = values[i10];
        this.zzc = i11;
        this.zzd = i12;
        this.zze = i13;
        this.zzf = str;
        this.zzj = i14;
        this.zzg = zza[i14];
        this.zzk = i15;
        int i16 = zza2[i15];
    }

    private zzfjc(Context context, zzfiz zzfizVar, int i10, int i11, int i12, String str, String str2, String str3) {
        this.zzh = zzfiz.values();
        this.zzl = zzfja.zza();
        this.zzm = zzfjb.zza();
        this.zza = context;
        this.zzi = zzfizVar.ordinal();
        this.zzb = zzfizVar;
        this.zzc = i10;
        this.zzd = i11;
        this.zze = i12;
        this.zzf = str;
        int i13 = "oldest".equals(str2) ? 1 : (!"lru".equals(str2) && "lfu".equals(str2)) ? 3 : 2;
        this.zzg = i13;
        this.zzj = i13 - 1;
        "onAdClosed".equals(str3);
        this.zzk = 0;
    }

    public static zzfjc zza(zzfiz zzfizVar, Context context) {
        if (zzfizVar == zzfiz.Rewarded) {
            return new zzfjc(context, zzfizVar, ((Integer) a0.c().zza(zzbgc.zzgt)).intValue(), ((Integer) a0.c().zza(zzbgc.zzgz)).intValue(), ((Integer) a0.c().zza(zzbgc.zzgB)).intValue(), (String) a0.c().zza(zzbgc.zzgD), (String) a0.c().zza(zzbgc.zzgv), (String) a0.c().zza(zzbgc.zzgx));
        }
        if (zzfizVar == zzfiz.Interstitial) {
            return new zzfjc(context, zzfizVar, ((Integer) a0.c().zza(zzbgc.zzgu)).intValue(), ((Integer) a0.c().zza(zzbgc.zzgA)).intValue(), ((Integer) a0.c().zza(zzbgc.zzgC)).intValue(), (String) a0.c().zza(zzbgc.zzgE), (String) a0.c().zza(zzbgc.zzgw), (String) a0.c().zza(zzbgc.zzgy));
        }
        if (zzfizVar != zzfiz.AppOpen) {
            return null;
        }
        return new zzfjc(context, zzfizVar, ((Integer) a0.c().zza(zzbgc.zzgH)).intValue(), ((Integer) a0.c().zza(zzbgc.zzgJ)).intValue(), ((Integer) a0.c().zza(zzbgc.zzgK)).intValue(), (String) a0.c().zza(zzbgc.zzgF), (String) a0.c().zza(zzbgc.zzgG), (String) a0.c().zza(zzbgc.zzgI));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.zzi;
        int a10 = ea.c.a(parcel);
        ea.c.u(parcel, 1, i11);
        ea.c.u(parcel, 2, this.zzc);
        ea.c.u(parcel, 3, this.zzd);
        ea.c.u(parcel, 4, this.zze);
        ea.c.G(parcel, 5, this.zzf, false);
        ea.c.u(parcel, 6, this.zzj);
        ea.c.u(parcel, 7, this.zzk);
        ea.c.b(parcel, a10);
    }
}
