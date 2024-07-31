package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzuk extends zzuf {
    public static final Object zzd = new Object();
    private final Object zze;
    private final Object zzf;

    private zzuk(zzcx zzcxVar, Object obj, Object obj2) {
        super(zzcxVar);
        this.zze = obj;
        this.zzf = obj2;
    }

    public static zzuk zzq(zzbp zzbpVar) {
        return new zzuk(new zzul(zzbpVar), zzcw.zza, zzd);
    }

    public static zzuk zzr(zzcx zzcxVar, Object obj, Object obj2) {
        return new zzuk(zzcxVar, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzuf, com.google.android.gms.internal.ads.zzcx
    public final int zza(Object obj) {
        Object obj2;
        if (zzd.equals(obj) && (obj2 = this.zzf) != null) {
            obj = obj2;
        }
        return this.zzc.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzuf, com.google.android.gms.internal.ads.zzcx
    public final zzcu zzd(int i10, zzcu zzcuVar, boolean z10) {
        this.zzc.zzd(i10, zzcuVar, z10);
        if (zzfy.zzF(zzcuVar.zzc, this.zzf) && z10) {
            zzcuVar.zzc = zzd;
        }
        return zzcuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzuf, com.google.android.gms.internal.ads.zzcx
    public final zzcw zze(int i10, zzcw zzcwVar, long j10) {
        this.zzc.zze(i10, zzcwVar, j10);
        if (zzfy.zzF(zzcwVar.zzc, this.zze)) {
            zzcwVar.zzc = zzcw.zza;
        }
        return zzcwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzuf, com.google.android.gms.internal.ads.zzcx
    public final Object zzf(int i10) {
        Object zzf = this.zzc.zzf(i10);
        return zzfy.zzF(zzf, this.zzf) ? zzd : zzf;
    }

    public final zzuk zzp(zzcx zzcxVar) {
        return new zzuk(zzcxVar, this.zze, this.zzf);
    }
}
