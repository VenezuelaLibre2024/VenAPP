package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* loaded from: classes2.dex */
public final class zzji {
    final Context zza;
    zzel zzb;
    zzfxu zzc;
    zzfxu zzd;
    zzfxu zze;
    zzfxu zzf;
    zzfxu zzg;
    zzfws zzh;
    Looper zzi;
    zzk zzj;
    int zzk;
    boolean zzl;
    zzmj zzm;
    long zzn;
    long zzo;
    boolean zzp;
    boolean zzq;
    zziu zzr;

    public zzji(Context context, zzciu zzciuVar) {
        zzjb zzjbVar = new zzjb(zzciuVar);
        zzjc zzjcVar = new zzjc(context);
        zzjd zzjdVar = new zzfxu() { // from class: com.google.android.gms.internal.ads.zzjd
            public final /* synthetic */ Context zza;

            public /* synthetic */ zzjd(Context context2) {
                r1 = context2;
            }

            @Override // com.google.android.gms.internal.ads.zzfxu
            public final Object zza() {
                return new zzyg(r1);
            }
        };
        zzje zzjeVar = zzje.zza;
        zzjf zzjfVar = new zzjf(context2);
        zzjg zzjgVar = zzjg.zza;
        context2.getClass();
        this.zza = context2;
        this.zzc = zzjbVar;
        this.zzd = zzjcVar;
        this.zze = zzjdVar;
        this.zzf = zzjeVar;
        this.zzg = zzjfVar;
        this.zzh = zzjgVar;
        this.zzi = zzfy.zzx();
        this.zzj = zzk.zza;
        this.zzk = 1;
        this.zzl = true;
        this.zzm = zzmj.zze;
        this.zzr = new zziu(0.97f, 1.03f, 1000L, 1.0E-7f, zzfy.zzq(20L), zzfy.zzq(500L), 0.999f, null);
        this.zzb = zzel.zza;
        this.zzn = 500L;
        this.zzo = 2000L;
        this.zzp = true;
    }

    public static /* synthetic */ zzuq zza(Context context) {
        return new zzue(context, new zzacp());
    }
}
