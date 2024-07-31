package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.f5;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.t;
import g9.v;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzeja implements zzdkw {
    private final zzcei zza;
    private final com.google.common.util.concurrent.f zzb;
    private final zzfgm zzc;
    private final zzcjk zzd;
    private final zzfhh zze;
    private final zzbni zzf;
    private final boolean zzg;
    private final zzehs zzh;

    public zzeja(zzcei zzceiVar, com.google.common.util.concurrent.f fVar, zzfgm zzfgmVar, zzcjk zzcjkVar, zzfhh zzfhhVar, boolean z10, zzbni zzbniVar, zzehs zzehsVar) {
        this.zza = zzceiVar;
        this.zzb = fVar;
        this.zzc = zzfgmVar;
        this.zzd = zzcjkVar;
        this.zze = zzfhhVar;
        this.zzg = z10;
        this.zzf = zzbniVar;
        this.zzh = zzehsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdkw
    public final void zza(boolean z10, Context context, zzdbk zzdbkVar) {
        zzctq zzctqVar = (zzctq) zzgen.zzq(this.zzb);
        this.zzd.zzao(true);
        boolean zze = this.zzg ? this.zzf.zze(true) : true;
        boolean z11 = this.zzg;
        com.google.android.gms.ads.internal.j jVar = new com.google.android.gms.ads.internal.j(zze, true, z11 ? this.zzf.zzd() : false, z11 ? this.zzf.zza() : 0.0f, -1, z10, this.zzc.zzP, false);
        if (zzdbkVar != null) {
            zzdbkVar.zzf();
        }
        t.k();
        zzdkl zzg = zzctqVar.zzg();
        zzcjk zzcjkVar = this.zzd;
        int i10 = this.zzc.zzR;
        if (i10 == -1) {
            f5 f5Var = this.zze.zzj;
            if (f5Var != null) {
                int i11 = f5Var.f8664a;
                if (i11 == 1) {
                    i10 = 7;
                } else if (i11 == 2) {
                    i10 = 6;
                }
            }
            zzcec.zze("Error setting app open orientation; no targeting orientation available.");
            i10 = this.zzc.zzR;
        }
        int i12 = i10;
        zzcei zzceiVar = this.zza;
        zzfgm zzfgmVar = this.zzc;
        String str = zzfgmVar.zzC;
        zzfgr zzfgrVar = zzfgmVar.zzt;
        v.a(context, new AdOverlayInfoParcel((com.google.android.gms.ads.internal.client.a) null, zzg, (g9.b) null, zzcjkVar, i12, zzceiVar, str, jVar, zzfgrVar.zzb, zzfgrVar.zza, this.zze.zzf, zzdbkVar, zzfgmVar.zzaj ? this.zzh : null), true);
    }
}
