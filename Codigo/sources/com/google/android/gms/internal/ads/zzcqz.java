package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.w1;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzcqz implements zzcqv {
    private final w1 zza;

    public zzcqz(w1 w1Var) {
        this.zza = w1Var;
    }

    @Override // com.google.android.gms.internal.ads.zzcqv
    public final void zza(Map map) {
        this.zza.zzz(Boolean.parseBoolean((String) map.get("content_vertical_opted_out")));
    }
}
