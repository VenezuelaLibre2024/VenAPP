package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzgpj {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    public /* synthetic */ zzgpj(zzgpd zzgpdVar, zzgpi zzgpiVar) {
        Map map;
        Map map2;
        Map map3;
        Map map4;
        map = zzgpdVar.zza;
        this.zza = new HashMap(map);
        map2 = zzgpdVar.zzb;
        this.zzb = new HashMap(map2);
        map3 = zzgpdVar.zzc;
        this.zzc = new HashMap(map3);
        map4 = zzgpdVar.zzd;
        this.zzd = new HashMap(map4);
    }

    public final zzggc zza(zzgpc zzgpcVar, zzghc zzghcVar) {
        zzgpf zzgpfVar = new zzgpf(zzgpcVar.getClass(), zzgpcVar.zzd(), null);
        if (this.zzb.containsKey(zzgpfVar)) {
            return ((zzgnh) this.zzb.get(zzgpfVar)).zza(zzgpcVar, zzghcVar);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + zzgpfVar.toString() + " available");
    }

    public final zzggq zzb(zzgpc zzgpcVar) {
        zzgpf zzgpfVar = new zzgpf(zzgpcVar.getClass(), zzgpcVar.zzd(), null);
        if (this.zzd.containsKey(zzgpfVar)) {
            return ((zzgoi) this.zzd.get(zzgpfVar)).zza(zzgpcVar);
        }
        throw new GeneralSecurityException("No Parameters Parser for requested key type " + zzgpfVar.toString() + " available");
    }

    public final zzgpc zzc(zzggc zzggcVar, Class cls, zzghc zzghcVar) {
        zzgph zzgphVar = new zzgph(zzggcVar.getClass(), cls, null);
        if (this.zza.containsKey(zzgphVar)) {
            return ((zzgnl) this.zza.get(zzgphVar)).zza(zzggcVar, zzghcVar);
        }
        throw new GeneralSecurityException("No Key serializer for " + zzgphVar.toString() + " available");
    }

    public final zzgpc zzd(zzggq zzggqVar, Class cls) {
        zzgph zzgphVar = new zzgph(zzggqVar.getClass(), cls, null);
        if (this.zzc.containsKey(zzgphVar)) {
            return ((zzgom) this.zzc.get(zzgphVar)).zza(zzggqVar);
        }
        throw new GeneralSecurityException("No Key Format serializer for " + zzgphVar.toString() + " available");
    }

    public final boolean zzi(zzgpc zzgpcVar) {
        return this.zzb.containsKey(new zzgpf(zzgpcVar.getClass(), zzgpcVar.zzd(), null));
    }

    public final boolean zzj(zzgpc zzgpcVar) {
        return this.zzd.containsKey(new zzgpf(zzgpcVar.getClass(), zzgpcVar.zzd(), null));
    }
}
