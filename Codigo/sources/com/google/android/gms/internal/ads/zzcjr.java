package com.google.android.gms.internal.ads;

import g9.w;

/* loaded from: classes2.dex */
final class zzcjr implements w {
    private final zzcjk zza;
    private final w zzb;

    public zzcjr(zzcjk zzcjkVar, w wVar) {
        this.zza = zzcjkVar;
        this.zzb = wVar;
    }

    @Override // g9.w
    public final void zzbA() {
        w wVar = this.zzb;
        if (wVar != null) {
            wVar.zzbA();
        }
        this.zza.zzY();
    }

    @Override // g9.w
    public final void zzbC() {
        w wVar = this.zzb;
        if (wVar != null) {
            wVar.zzbC();
        }
    }

    @Override // g9.w
    public final void zzbD(int i10) {
        w wVar = this.zzb;
        if (wVar != null) {
            wVar.zzbD(i10);
        }
        this.zza.zzW();
    }

    @Override // g9.w
    public final void zzbP() {
    }

    @Override // g9.w
    public final void zzbt() {
    }

    @Override // g9.w
    public final void zzbz() {
        w wVar = this.zzb;
        if (wVar != null) {
            wVar.zzbz();
        }
    }
}
