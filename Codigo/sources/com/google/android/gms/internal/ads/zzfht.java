package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.ads.internal.t;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzfht {
    private final zzfgm zza;
    private final zzfgp zzb;
    private final zzehh zzc;
    private final zzfny zzd;
    private final zzfmz zze;
    private final zzcse zzf;

    public zzfht(zzehh zzehhVar, zzfny zzfnyVar, zzfgm zzfgmVar, zzfgp zzfgpVar, zzcse zzcseVar, zzfmz zzfmzVar) {
        this.zza = zzfgmVar;
        this.zzb = zzfgpVar;
        this.zzc = zzehhVar;
        this.zzd = zzfnyVar;
        this.zzf = zzcseVar;
        this.zze = zzfmzVar;
    }

    public final void zza(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzb((String) it.next(), 2);
        }
    }

    public final void zzb(String str, int i10) {
        if (!this.zza.zzaj) {
            this.zzd.zzc(str, this.zze);
        } else {
            this.zzc.zzd(new zzehj(t.b().a(), this.zzb.zzb, str, i10));
        }
    }

    public final void zzc(List list, int i10) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            zzgen.zzr((((Boolean) a0.c().zza(zzbgc.zzjL)).booleanValue() && zzcse.zzh(str)) ? this.zzf.zzb(str, x.e()) : zzgen.zzh(str), new zzfhs(this, i10), zzcep.zza);
        }
    }
}
