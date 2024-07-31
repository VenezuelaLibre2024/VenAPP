package com.google.android.gms.internal.ads;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.InputStream;

/* loaded from: classes2.dex */
public abstract class zzgyt {
    public static final /* synthetic */ int zzd = 0;
    private static volatile int zze = 100;
    int zza;
    final int zzb = zze;
    zzgyu zzc;

    public /* synthetic */ zzgyt(zzgys zzgysVar) {
    }

    public static int zzF(int i10) {
        return (i10 >>> 1) ^ (-(i10 & 1));
    }

    public static long zzG(long j10) {
        return (j10 >>> 1) ^ (-(1 & j10));
    }

    public static zzgyt zzH(InputStream inputStream, int i10) {
        return new zzgyr(inputStream, RecognitionOptions.AZTEC, null);
    }

    public static zzgyt zzI(byte[] bArr, int i10, int i11, boolean z10) {
        zzgyn zzgynVar = new zzgyn(bArr, i10, i11, z10, null);
        try {
            zzgynVar.zze(i11);
            return zzgynVar;
        } catch (zzhag e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract void zzA(int i10);

    public abstract boolean zzC();

    public abstract boolean zzD();

    public abstract boolean zzE(int i10);

    public abstract double zzb();

    public abstract float zzc();

    public abstract int zzd();

    public abstract int zze(int i10);

    public abstract int zzf();

    public abstract int zzg();

    public abstract int zzh();

    public abstract int zzk();

    public abstract int zzl();

    public abstract int zzm();

    public abstract int zzn();

    public abstract long zzo();

    public abstract long zzp();

    public abstract long zzt();

    public abstract long zzu();

    public abstract long zzv();

    public abstract zzgyl zzw();

    public abstract String zzx();

    public abstract String zzy();

    public abstract void zzz(int i10);
}
