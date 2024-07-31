package com.google.android.gms.internal.p498firebaseauthapi;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes2.dex */
public final class zzcg<P> {
    private final ConcurrentMap<zzck, List<zzcl<P>>> zza;
    private final List<zzcl<P>> zzb;
    private zzcl<P> zzc;
    private final Class<P> zzd;
    private final zzrn zze;
    private final boolean zzf;

    private zzcg(ConcurrentMap<zzck, List<zzcl<P>>> concurrentMap, List<zzcl<P>> list, zzcl<P> zzclVar, zzrn zzrnVar, Class<P> cls) {
        this.zza = concurrentMap;
        this.zzb = list;
        this.zzc = zzclVar;
        this.zzd = cls;
        this.zze = zzrnVar;
        this.zzf = false;
    }

    public final zzcl<P> zza() {
        return this.zzc;
    }

    public final List<zzcl<P>> zza(byte[] bArr) {
        List<zzcl<P>> list = this.zza.get(new zzck(bArr));
        return list != null ? list : Collections.emptyList();
    }

    public final zzrn zzb() {
        return this.zze;
    }

    public final Class<P> zzc() {
        return this.zzd;
    }

    public final Collection<List<zzcl<P>>> zzd() {
        return this.zza.values();
    }

    public final List<zzcl<P>> zze() {
        return zza(zzbn.zza);
    }

    public final boolean zzf() {
        return !this.zze.zza().isEmpty();
    }
}
