package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class zzhcy {
    final Unsafe zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhcy(Unsafe unsafe) {
        this.zza = unsafe;
    }

    public abstract byte zza(long j10);

    public abstract double zzb(Object obj, long j10);

    public abstract float zzc(Object obj, long j10);

    public abstract void zzd(long j10, byte[] bArr, long j11, long j12);

    public abstract void zze(Object obj, long j10, boolean z10);

    public abstract void zzf(Object obj, long j10, byte b10);

    public abstract void zzg(Object obj, long j10, double d10);

    public abstract void zzh(Object obj, long j10, float f10);

    public abstract boolean zzi(Object obj, long j10);
}