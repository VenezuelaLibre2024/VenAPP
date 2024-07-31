package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.d;

/* loaded from: classes2.dex */
public final class zzbwg {
    private final d.c zza;
    private final d.b zzb;
    private com.google.android.gms.ads.nativead.d zzc;

    public zzbwg(d.c cVar, d.b bVar) {
    }

    public static /* bridge */ /* synthetic */ d.b zzc(zzbwg zzbwgVar) {
        zzbwgVar.getClass();
        return null;
    }

    public static /* bridge */ /* synthetic */ d.c zzd(zzbwg zzbwgVar) {
        zzbwgVar.getClass();
        return null;
    }

    public final synchronized com.google.android.gms.ads.nativead.d zzf(zzbkg zzbkgVar) {
        com.google.android.gms.ads.nativead.d dVar = this.zzc;
        if (dVar != null) {
            return dVar;
        }
        zzbwh zzbwhVar = new zzbwh(zzbkgVar);
        this.zzc = zzbwhVar;
        return zzbwhVar;
    }

    public final zzbkq zza() {
        return null;
    }

    public final zzbkt zzb() {
        return new zzbwf(this, null);
    }
}
