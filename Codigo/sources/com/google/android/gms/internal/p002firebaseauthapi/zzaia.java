package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.a;

/* loaded from: classes2.dex */
public abstract class zzaia {
    private static volatile int zze = 100;
    int zza;
    int zzb;
    int zzc;
    zzaij zzd;
    private boolean zzf;

    /* JADX INFO: Access modifiers changed from: private */
    public zzaia() {
        this.zzb = zze;
        this.zzc = a.e.API_PRIORITY_OTHER;
        this.zzf = false;
    }

    public /* synthetic */ zzaia(zzaig zzaigVar) {
        this();
    }

    public static int zza(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long zza(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static zzaia zza(byte[] bArr, int i10, int i11, boolean z10) {
        zzaid zzaidVar = new zzaid(bArr, i10, i11, z10);
        try {
            zzaidVar.zzb(i11);
            return zzaidVar;
        } catch (zzaji e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract double zza();

    public abstract float zzb();

    public abstract int zzb(int i10);

    public abstract int zzc();

    public abstract void zzc(int i10);

    public abstract int zzd();

    public abstract void zzd(int i10);

    public abstract int zze();

    public abstract boolean zze(int i10);

    public abstract int zzf();

    public abstract int zzg();

    public abstract int zzh();

    public abstract int zzi();

    public abstract int zzj();

    public abstract long zzk();

    public abstract long zzl();

    public abstract long zzm();

    public abstract long zzn();

    public abstract long zzo();

    public abstract long zzp();

    public abstract zzahp zzq();

    public abstract String zzr();

    public abstract String zzs();

    public abstract boolean zzt();

    public abstract boolean zzu();
}
