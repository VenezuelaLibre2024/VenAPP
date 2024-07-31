package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class zzgoe {
    private static final zzgoe zza = (zzgoe) zzgpl.zza(zzgoc.zza);
    private final AtomicReference zzb = new AtomicReference(new zzgpj(new zzgpd(), null));

    public static zzgoe zzd() {
        return zza;
    }

    public final zzggc zza(zzgpc zzgpcVar, zzghc zzghcVar) {
        return ((zzgpj) this.zzb.get()).zza(zzgpcVar, zzghcVar);
    }

    public final zzggc zzb(zzgox zzgoxVar, zzghc zzghcVar) {
        return !((zzgpj) this.zzb.get()).zzi(zzgoxVar) ? new zzgno(zzgoxVar, zzghcVar) : zza(zzgoxVar, zzghcVar);
    }

    public final zzggq zzc(zzgpc zzgpcVar) {
        return ((zzgpj) this.zzb.get()).zzb(zzgpcVar);
    }

    public final zzgpc zze(zzggc zzggcVar, Class cls, zzghc zzghcVar) {
        return ((zzgpj) this.zzb.get()).zzc(zzggcVar, cls, zzghcVar);
    }

    public final zzgpc zzf(zzggq zzggqVar, Class cls) {
        return ((zzgpj) this.zzb.get()).zzd(zzggqVar, cls);
    }

    public final synchronized void zzg(zzgnh zzgnhVar) {
        zzgpd zzgpdVar = new zzgpd((zzgpj) this.zzb.get());
        zzgpdVar.zza(zzgnhVar);
        this.zzb.set(new zzgpj(zzgpdVar, null));
    }

    public final synchronized void zzh(zzgnl zzgnlVar) {
        zzgpd zzgpdVar = new zzgpd((zzgpj) this.zzb.get());
        zzgpdVar.zzb(zzgnlVar);
        this.zzb.set(new zzgpj(zzgpdVar, null));
    }

    public final synchronized void zzi(zzgoi zzgoiVar) {
        zzgpd zzgpdVar = new zzgpd((zzgpj) this.zzb.get());
        zzgpdVar.zzc(zzgoiVar);
        this.zzb.set(new zzgpj(zzgpdVar, null));
    }

    public final synchronized void zzj(zzgom zzgomVar) {
        zzgpd zzgpdVar = new zzgpd((zzgpj) this.zzb.get());
        zzgpdVar.zzd(zzgomVar);
        this.zzb.set(new zzgpj(zzgpdVar, null));
    }

    public final boolean zzk(zzgpc zzgpcVar) {
        return ((zzgpj) this.zzb.get()).zzj(zzgpcVar);
    }
}
