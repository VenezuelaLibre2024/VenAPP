package com.google.android.recaptcha.internal;

import fk.b;
import xk.q;

/* loaded from: classes2.dex */
public final class zzi implements Comparable {
    private int zza;
    private long zzb;
    private long zzc;

    public final String toString() {
        String f02;
        String f03;
        String f04;
        String f05;
        f02 = q.f0(String.valueOf(this.zzb / this.zza), 10, (char) 0, 2, null);
        f03 = q.f0(String.valueOf(this.zzc), 10, (char) 0, 2, null);
        f04 = q.f0(String.valueOf(this.zzb), 10, (char) 0, 2, null);
        f05 = q.f0(String.valueOf(this.zza), 5, (char) 0, 2, null);
        return "avgExecutionTime: " + f02 + " us| maxExecutionTime: " + f03 + " us| totalTime: " + f04 + " us| #Usages: " + f05;
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzi zziVar) {
        int a10;
        a10 = b.a(Long.valueOf(this.zzb), Long.valueOf(zziVar.zzb));
        return a10;
    }

    public final int zzb() {
        return this.zza;
    }

    public final long zzc() {
        return this.zzc;
    }

    public final long zzd() {
        return this.zzb;
    }

    public final void zze(long j10) {
        this.zzc = j10;
    }

    public final void zzf(long j10) {
        this.zzb = j10;
    }

    public final void zzg(int i10) {
        this.zza = i10;
    }
}
