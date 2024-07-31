package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class zzhcp {
    public abstract int zza(Object obj);

    public abstract int zzb(Object obj);

    public abstract Object zzc(Object obj);

    public abstract Object zzd(Object obj);

    public abstract Object zze(Object obj, Object obj2);

    abstract Object zzf();

    abstract Object zzg(Object obj);

    abstract void zzh(Object obj, int i10, int i11);

    abstract void zzi(Object obj, int i10, long j10);

    abstract void zzj(Object obj, int i10, Object obj2);

    public abstract void zzk(Object obj, int i10, zzgyl zzgylVar);

    public abstract void zzl(Object obj, int i10, long j10);

    public abstract void zzm(Object obj);

    public abstract void zzn(Object obj, Object obj2);

    public abstract void zzo(Object obj, Object obj2);

    public final boolean zzp(Object obj, zzhbq zzhbqVar) {
        int zzd = zzhbqVar.zzd();
        int i10 = zzd >>> 3;
        int i11 = zzd & 7;
        if (i11 == 0) {
            zzl(obj, i10, zzhbqVar.zzl());
            return true;
        }
        if (i11 == 1) {
            zzi(obj, i10, zzhbqVar.zzk());
            return true;
        }
        if (i11 == 2) {
            zzk(obj, i10, zzhbqVar.zzp());
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw zzhag.zza();
            }
            zzh(obj, i10, zzhbqVar.zzf());
            return true;
        }
        Object zzf = zzf();
        int i12 = i10 << 3;
        while (zzhbqVar.zzc() != Integer.MAX_VALUE && zzp(zzf, zzhbqVar)) {
        }
        if ((4 | i12) != zzhbqVar.zzd()) {
            throw zzhag.zzb();
        }
        zzg(zzf);
        zzj(obj, i10, zzf);
        return true;
    }

    public abstract boolean zzq(zzhbq zzhbqVar);

    public abstract void zzr(Object obj, zzgzb zzgzbVar);
}
