package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.t;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class zzclj {
    private final zzcei zza;
    private final Context zzb;
    private final WeakReference zzc;

    public /* synthetic */ zzclj(zzclh zzclhVar, zzcli zzcliVar) {
        zzcei zzceiVar;
        Context context;
        WeakReference weakReference;
        zzceiVar = zzclhVar.zza;
        this.zza = zzceiVar;
        context = zzclhVar.zzb;
        this.zzb = context;
        weakReference = zzclhVar.zzc;
        this.zzc = weakReference;
    }

    public final Context zza() {
        return this.zzb;
    }

    public final zzavi zzb() {
        return new zzavi(new com.google.android.gms.ads.internal.i(this.zzb, this.zza));
    }

    public final zzbiu zzc() {
        return new zzbiu(this.zzb);
    }

    public final zzcei zzd() {
        return this.zza;
    }

    public final String zze() {
        return t.r().E(this.zzb, this.zza.zza);
    }

    public final WeakReference zzf() {
        return this.zzc;
    }
}
