package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.f0;

/* loaded from: classes2.dex */
public final class zzbrx {
    static final f0 zza = new zzbrv();
    static final f0 zzb = new zzbrw();
    private final zzbrj zzc;

    public zzbrx(Context context, zzcei zzceiVar, String str, zzfnc zzfncVar) {
        this.zzc = new zzbrj(context, zzceiVar, str, zza, zzb, zzfncVar);
    }

    public final zzbrn zza(String str, zzbrq zzbrqVar, zzbrp zzbrpVar) {
        return new zzbsb(this.zzc, str, zzbrqVar, zzbrpVar);
    }

    public final zzbsg zzb() {
        return new zzbsg(this.zzc);
    }
}
