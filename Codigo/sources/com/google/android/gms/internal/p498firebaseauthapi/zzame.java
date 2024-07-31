package com.google.android.gms.internal.p498firebaseauthapi;

/* loaded from: classes2.dex */
abstract class zzame<T, B> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int zza(T t10);

    abstract B zza();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T zza(T t10, T t11);

    abstract void zza(B b10, int i10, int i11);

    abstract void zza(B b10, int i10, long j10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zza(B b10, int i10, zzahp zzahpVar);

    abstract void zza(B b10, int i10, T t10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zza(T t10, zzana zzanaVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean zza(zzalc zzalcVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zza(B b10, zzalc zzalcVar) {
        int zzd = zzalcVar.zzd();
        int i10 = zzd >>> 3;
        int i11 = zzd & 7;
        if (i11 == 0) {
            zzb(b10, i10, zzalcVar.zzl());
            return true;
        }
        if (i11 == 1) {
            zza((zzame<T, B>) b10, i10, zzalcVar.zzk());
            return true;
        }
        if (i11 == 2) {
            zza((zzame<T, B>) b10, i10, zzalcVar.zzp());
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw zzaji.zza();
            }
            zza((zzame<T, B>) b10, i10, zzalcVar.zzf());
            return true;
        }
        B zza = zza();
        int i12 = 4 | (i10 << 3);
        while (zzalcVar.zzc() != Integer.MAX_VALUE && zza((zzame<T, B>) zza, zzalcVar)) {
        }
        if (i12 != zzalcVar.zzd()) {
            throw zzaji.zzb();
        }
        zza((zzame<T, B>) b10, i10, (int) zze(zza));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int zzb(T t10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzb(B b10, int i10, long j10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzb(T t10, zzana zzanaVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzb(Object obj, B b10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract B zzc(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzc(Object obj, T t10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T zzd(Object obj);

    abstract T zze(B b10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzf(Object obj);
}
