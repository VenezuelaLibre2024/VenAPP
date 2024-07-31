package com.google.android.recaptcha.internal;

/* loaded from: classes2.dex */
abstract class zzjf {
    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int zza(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int zzb(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Object zzc(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Object zzd(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Object zze(Object obj, Object obj2);

    abstract Object zzf();

    abstract Object zzg(Object obj);

    abstract void zzh(Object obj, int i10, int i11);

    abstract void zzi(Object obj, int i10, long j10);

    abstract void zzj(Object obj, int i10, Object obj2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzk(Object obj, int i10, zzez zzezVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzl(Object obj, int i10, long j10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzm(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzn(Object obj, Object obj2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzo(Object obj, Object obj2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzp(Object obj, zzjx zzjxVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzq(Object obj, zzjx zzjxVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzr(Object obj, zzik zzikVar) {
        int zzd = zzikVar.zzd();
        int i10 = zzd >>> 3;
        int i11 = zzd & 7;
        if (i11 == 0) {
            zzl(obj, i10, zzikVar.zzl());
            return true;
        }
        if (i11 == 1) {
            zzi(obj, i10, zzikVar.zzk());
            return true;
        }
        if (i11 == 2) {
            zzk(obj, i10, zzikVar.zzp());
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw zzgy.zza();
            }
            zzh(obj, i10, zzikVar.zzf());
            return true;
        }
        Object zzf = zzf();
        int i12 = i10 << 3;
        while (zzikVar.zzc() != Integer.MAX_VALUE && zzr(zzf, zzikVar)) {
        }
        if ((4 | i12) != zzikVar.zzd()) {
            throw zzgy.zzb();
        }
        zzg(zzf);
        zzj(obj, i10, zzf);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean zzs(zzik zzikVar);
}
