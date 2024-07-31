package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.w1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzccc extends zzcci {
    private final la.f zzb;
    private final zzccc zzc = this;
    private final zzhhm zzd;
    private final zzhhm zze;
    private final zzhhm zzf;
    private final zzhhm zzg;
    private final zzhhm zzh;
    private final zzhhm zzi;
    private final zzhhm zzj;
    private final zzhhm zzk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzccc(Context context, la.f fVar, w1 w1Var, zzcch zzcchVar, zzccb zzccbVar) {
        this.zzb = fVar;
        zzhhd zza = zzhhe.zza(context);
        this.zzd = zza;
        zzhhd zza2 = zzhhe.zza(w1Var);
        this.zze = zza2;
        zzhhd zza3 = zzhhe.zza(zzcchVar);
        this.zzf = zza3;
        this.zzg = zzhhc.zzc(new zzcbu(zza, zza2, zza3));
        zzhhd zza4 = zzhhe.zza(fVar);
        this.zzh = zza4;
        zzhhm zzc = zzhhc.zzc(new zzcbw(zza4, zza2, zza3));
        this.zzi = zzc;
        zzcby zzcbyVar = new zzcby(zza4, zzc);
        this.zzj = zzcbyVar;
        this.zzk = zzhhc.zzc(new zzccn(zza, zzcbyVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    final zzcbt zza() {
        return (zzcbt) this.zzg.zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzcci
    public final zzcbx zzb() {
        return new zzcbx(this.zzb, (zzcbv) this.zzi.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    final zzccm zzc() {
        return (zzccm) this.zzk.zzb();
    }
}
