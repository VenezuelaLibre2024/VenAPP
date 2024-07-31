package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;

/* loaded from: classes2.dex */
public final class zzabj {
    private final Handler zza;
    private final zzabk zzb;

    public zzabj(Handler handler, zzabk zzabkVar) {
        this.zza = zzabkVar == null ? null : handler;
        this.zzb = zzabkVar;
    }

    public final void zza(final String str, final long j10, final long j11) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaaz
                @Override // java.lang.Runnable
                public final void run() {
                    zzabj.this.zzg(str, j10, j11);
                }
            });
        }
    }

    public final void zzb(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabi
                @Override // java.lang.Runnable
                public final void run() {
                    zzabj.this.zzh(str);
                }
            });
        }
    }

    public final void zzc(final zzir zzirVar) {
        zzirVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabh
                @Override // java.lang.Runnable
                public final void run() {
                    zzabj.this.zzi(zzirVar);
                }
            });
        }
    }

    public final void zzd(final int i10, final long j10) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabb
                @Override // java.lang.Runnable
                public final void run() {
                    zzabj.this.zzj(i10, j10);
                }
            });
        }
    }

    public final void zze(final zzir zzirVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabf
                @Override // java.lang.Runnable
                public final void run() {
                    zzabj.this.zzk(zzirVar);
                }
            });
        }
    }

    public final void zzf(final zzam zzamVar, final zzis zzisVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabg
                @Override // java.lang.Runnable
                public final void run() {
                    zzabj.this.zzl(zzamVar, zzisVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzg(String str, long j10, long j11) {
        int i10 = zzfy.zza;
        this.zzb.zzp(str, j10, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzh(String str) {
        int i10 = zzfy.zza;
        this.zzb.zzq(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzi(zzir zzirVar) {
        zzirVar.zza();
        int i10 = zzfy.zza;
        this.zzb.zzr(zzirVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzj(int i10, long j10) {
        int i11 = zzfy.zza;
        this.zzb.zzl(i10, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzk(zzir zzirVar) {
        int i10 = zzfy.zza;
        this.zzb.zzs(zzirVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzl(zzam zzamVar, zzis zzisVar) {
        int i10 = zzfy.zza;
        this.zzb.zzu(zzamVar, zzisVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzm(Object obj, long j10) {
        int i10 = zzfy.zza;
        this.zzb.zzm(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzn(long j10, int i10) {
        int i11 = zzfy.zza;
        this.zzb.zzt(j10, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzo(Exception exc) {
        int i10 = zzfy.zza;
        this.zzb.zzo(exc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzp(zzdp zzdpVar) {
        int i10 = zzfy.zza;
        this.zzb.zzv(zzdpVar);
    }

    public final void zzq(final Object obj) {
        Handler handler = this.zza;
        if (handler != null) {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabc
                @Override // java.lang.Runnable
                public final void run() {
                    zzabj.this.zzm(obj, elapsedRealtime);
                }
            });
        }
    }

    public final void zzr(final long j10, final int i10) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabd
                @Override // java.lang.Runnable
                public final void run() {
                    zzabj.this.zzn(j10, i10);
                }
            });
        }
    }

    public final void zzs(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabe
                @Override // java.lang.Runnable
                public final void run() {
                    zzabj.this.zzo(exc);
                }
            });
        }
    }

    public final void zzt(final zzdp zzdpVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaba
                @Override // java.lang.Runnable
                public final void run() {
                    zzabj.this.zzp(zzdpVar);
                }
            });
        }
    }
}
