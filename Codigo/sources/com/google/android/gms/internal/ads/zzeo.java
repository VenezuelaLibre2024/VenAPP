package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzeo {
    private final zzel zza;
    private boolean zzb;

    public zzeo() {
        throw null;
    }

    public zzeo(zzel zzelVar) {
        this.zza = zzelVar;
    }

    public final synchronized void zza() {
        while (!this.zzb) {
            wait();
        }
    }

    public final synchronized void zzb() {
        boolean z10 = false;
        while (!this.zzb) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z10 = true;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean zzc() {
        boolean z10;
        z10 = this.zzb;
        this.zzb = false;
        return z10;
    }

    public final synchronized boolean zzd() {
        return this.zzb;
    }

    public final synchronized boolean zze() {
        if (this.zzb) {
            return false;
        }
        this.zzb = true;
        notifyAll();
        return true;
    }
}