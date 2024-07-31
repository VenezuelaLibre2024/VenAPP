package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.w1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcca {
    private Context zza;
    private la.f zzb;
    private w1 zzc;
    private zzcch zzd;

    private zzcca() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcca(zzcbz zzcbzVar) {
    }

    public final zzcca zza(w1 w1Var) {
        this.zzc = w1Var;
        return this;
    }

    public final zzcca zzb(Context context) {
        context.getClass();
        this.zza = context;
        return this;
    }

    public final zzcca zzc(la.f fVar) {
        fVar.getClass();
        this.zzb = fVar;
        return this;
    }

    public final zzcca zzd(zzcch zzcchVar) {
        this.zzd = zzcchVar;
        return this;
    }

    public final zzcci zze() {
        zzhhl.zzc(this.zza, Context.class);
        zzhhl.zzc(this.zzb, la.f.class);
        zzhhl.zzc(this.zzc, w1.class);
        zzhhl.zzc(this.zzd, zzcch.class);
        return new zzccc(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
