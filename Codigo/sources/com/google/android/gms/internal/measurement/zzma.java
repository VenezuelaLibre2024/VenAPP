package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class zzma<T, B> {
    public abstract int zza(T t10);

    abstract B zza();

    public abstract T zza(T t10, T t11);

    abstract void zza(B b10, int i10, int i11);

    abstract void zza(B b10, int i10, long j10);

    public abstract void zza(B b10, int i10, zzhm zzhmVar);

    abstract void zza(B b10, int i10, T t10);

    public abstract void zza(T t10, zzmw zzmwVar);

    public abstract boolean zza(zzlc zzlcVar);

    public final boolean zza(B b10, zzlc zzlcVar) {
        int zzd = zzlcVar.zzd();
        int i10 = zzd >>> 3;
        int i11 = zzd & 7;
        if (i11 == 0) {
            zzb(b10, i10, zzlcVar.zzl());
            return true;
        }
        if (i11 == 1) {
            zza((zzma<T, B>) b10, i10, zzlcVar.zzk());
            return true;
        }
        if (i11 == 2) {
            zza((zzma<T, B>) b10, i10, zzlcVar.zzp());
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw zzji.zza();
            }
            zza((zzma<T, B>) b10, i10, zzlcVar.zzf());
            return true;
        }
        B zza = zza();
        int i12 = 4 | (i10 << 3);
        while (zzlcVar.zzc() != Integer.MAX_VALUE && zza((zzma<T, B>) zza, zzlcVar)) {
        }
        if (i12 != zzlcVar.zzd()) {
            throw zzji.zzb();
        }
        zza((zzma<T, B>) b10, i10, (int) zze(zza));
        return true;
    }

    public abstract int zzb(T t10);

    public abstract void zzb(B b10, int i10, long j10);

    public abstract void zzb(T t10, zzmw zzmwVar);

    public abstract void zzb(Object obj, B b10);

    public abstract B zzc(Object obj);

    public abstract void zzc(Object obj, T t10);

    public abstract T zzd(Object obj);

    abstract T zze(B b10);

    public abstract void zzf(Object obj);
}
