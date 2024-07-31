package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public abstract class zzaxx implements Callable {
    protected final String zza = getClass().getSimpleName();
    protected final zzawj zzb;
    protected final String zzc;
    protected final String zzd;
    protected final zzasg zze;
    protected Method zzf;
    protected final int zzg;
    protected final int zzh;

    public zzaxx(zzawj zzawjVar, String str, String str2, zzasg zzasgVar, int i10, int i11) {
        this.zzb = zzawjVar;
        this.zzc = str;
        this.zzd = str2;
        this.zze = zzasgVar;
        this.zzg = i10;
        this.zzh = i11;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        zzm();
        return null;
    }

    protected abstract void zza();

    public Void zzm() {
        int i10;
        try {
            long nanoTime = System.nanoTime();
            Method zzj = this.zzb.zzj(this.zzc, this.zzd);
            this.zzf = zzj;
            if (zzj == null) {
                return null;
            }
            zza();
            zzavd zzd = this.zzb.zzd();
            if (zzd == null || (i10 = this.zzg) == Integer.MIN_VALUE) {
                return null;
            }
            zzd.zzc(this.zzh, i10, (System.nanoTime() - nanoTime) / 1000, null, null);
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }
}
