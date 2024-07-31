package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzvg;
import java.security.GeneralSecurityException;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class zzcb {
    private final zzvg.zza zza;

    private zzcb(zzvg.zza zzaVar) {
        this.zza = zzaVar;
    }

    private final synchronized int zza(zzvb zzvbVar, boolean z10) {
        zzvg.zzb zza;
        zza = zza(zzvbVar);
        this.zza.zza(zza);
        return zza.zza();
    }

    public static zzcb zza(zzbx zzbxVar) {
        return new zzcb(zzbxVar.zzb().zzn());
    }

    private final synchronized zzvg.zzb zza(zzuy zzuyVar, zzvs zzvsVar) {
        int zzc;
        zzc = zzc();
        if (zzvsVar == zzvs.UNKNOWN_PREFIX) {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        return (zzvg.zzb) ((zzajc) zzvg.zzb.zzd().zza(zzuyVar).zza(zzc).zza(zzuz.ENABLED).zza(zzvsVar).zzf());
    }

    private final synchronized zzvg.zzb zza(zzvb zzvbVar) {
        return zza(zzct.zza(zzvbVar), zzvbVar.zzd());
    }

    public static zzcb zzb() {
        return new zzcb(zzvg.zzc());
    }

    private final synchronized boolean zzb(int i10) {
        Iterator<zzvg.zzb> it = this.zza.zzb().iterator();
        while (it.hasNext()) {
            if (it.next().zza() == i10) {
                return true;
            }
        }
        return false;
    }

    private final synchronized int zzc() {
        int zza;
        do {
            zza = zzpf.zza();
        } while (zzb(zza));
        return zza;
    }

    public final synchronized zzbx zza() {
        return zzbx.zza((zzvg) ((zzajc) this.zza.zzf()));
    }

    public final synchronized zzcb zza(int i10) {
        for (int i11 = 0; i11 < this.zza.zza(); i11++) {
            zzvg.zzb zzb = this.zza.zzb(i11);
            if (zzb.zza() == i10) {
                if (!zzb.zzc().equals(zzuz.ENABLED)) {
                    throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + i10);
                }
                this.zza.zza(i10);
            }
        }
        throw new GeneralSecurityException("key not found: " + i10);
        return this;
    }

    public final synchronized zzcb zza(zzbu zzbuVar) {
        zza(zzbuVar.zza(), false);
        return this;
    }
}
