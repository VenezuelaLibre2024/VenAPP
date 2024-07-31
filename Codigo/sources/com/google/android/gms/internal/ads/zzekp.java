package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.j2;
import g9.v;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzekp implements zzdkw {
    private final Context zza;
    private final zzcei zzb;
    private final com.google.common.util.concurrent.f zzc;
    private final zzfgm zzd;
    private final zzcjk zze;
    private final zzfhh zzf;
    private final zzbni zzg;
    private final boolean zzh;
    private final zzehs zzi;

    public zzekp(Context context, zzcei zzceiVar, com.google.common.util.concurrent.f fVar, zzfgm zzfgmVar, zzcjk zzcjkVar, zzfhh zzfhhVar, boolean z10, zzbni zzbniVar, zzehs zzehsVar) {
        this.zza = context;
        this.zzb = zzceiVar;
        this.zzc = fVar;
        this.zzd = zzfgmVar;
        this.zze = zzcjkVar;
        this.zzf = zzfhhVar;
        this.zzg = zzbniVar;
        this.zzh = z10;
        this.zzi = zzehsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdkw
    public final void zza(boolean z10, Context context, zzdbk zzdbkVar) {
        zzdjo zzdjoVar = (zzdjo) zzgen.zzq(this.zzc);
        this.zze.zzao(true);
        boolean zze = this.zzh ? this.zzg.zze(false) : false;
        t.r();
        com.google.android.gms.ads.internal.j jVar = new com.google.android.gms.ads.internal.j(zze, j2.h(this.zza), this.zzh ? this.zzg.zzd() : false, this.zzh ? this.zzg.zza() : 0.0f, -1, z10, this.zzd.zzP, false);
        if (zzdbkVar != null) {
            zzdbkVar.zzf();
        }
        t.k();
        zzdkl zzh = zzdjoVar.zzh();
        zzcjk zzcjkVar = this.zze;
        zzfgm zzfgmVar = this.zzd;
        zzcei zzceiVar = this.zzb;
        int i10 = zzfgmVar.zzR;
        String str = zzfgmVar.zzC;
        zzfgr zzfgrVar = zzfgmVar.zzt;
        v.a(context, new AdOverlayInfoParcel((com.google.android.gms.ads.internal.client.a) null, zzh, (g9.b) null, zzcjkVar, i10, zzceiVar, str, jVar, zzfgrVar.zzb, zzfgrVar.zza, this.zzf.zzf, zzdbkVar, zzfgmVar.zzaj ? this.zzi : null), true);
    }
}
