package com.google.android.gms.internal.ads;

import a9.m;
import a9.n;

/* loaded from: classes2.dex */
public final class zzblr {
    private final n zza;
    private final m zzb;
    private zzbkh zzc;

    public zzblr(n nVar, m mVar) {
        this.zza = nVar;
        this.zzb = mVar;
    }

    public final synchronized zzbkh zzf(zzbkg zzbkgVar) {
        zzbkh zzbkhVar = this.zzc;
        if (zzbkhVar != null) {
            return zzbkhVar;
        }
        zzbkh zzbkhVar2 = new zzbkh(zzbkgVar);
        this.zzc = zzbkhVar2;
        return zzbkhVar2;
    }

    public final zzbkq zzc() {
        if (this.zzb == null) {
            return null;
        }
        return new zzblo(this, null);
    }

    public final zzbkt zzd() {
        return new zzblq(this, null);
    }
}
