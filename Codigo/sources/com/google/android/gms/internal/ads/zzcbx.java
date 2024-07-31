package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.i4;

/* loaded from: classes2.dex */
public final class zzcbx {
    private final la.f zza;
    private final zzcbv zzb;

    public zzcbx(la.f fVar, zzcbv zzcbvVar) {
        this.zza = fVar;
        this.zzb = zzcbvVar;
    }

    public static zzcbx zza(Context context) {
        return zzcci.zzd(context).zzb();
    }

    public final void zzb(int i10, long j10) {
        this.zzb.zza(i10, j10);
    }

    public final void zzc(i4 i4Var) {
        this.zzb.zza(-1, this.zza.a());
    }

    public final void zzd() {
        this.zzb.zza(-1, this.zza.a());
    }
}
