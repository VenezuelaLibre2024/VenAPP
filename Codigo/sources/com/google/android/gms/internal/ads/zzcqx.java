package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.w1;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzcqx implements zzcqv {
    private final w1 zza;

    public zzcqx(w1 w1Var) {
        this.zza = w1Var;
    }

    @Override // com.google.android.gms.internal.ads.zzcqv
    public final void zza(Map map) {
        this.zza.zzx(Boolean.parseBoolean((String) map.get("content_url_opted_out")));
    }
}
