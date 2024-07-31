package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.w1;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzcrl implements zzcqv {
    private final Context zza;
    private final w1 zzb = t.q().zzi();

    public zzcrl(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzcqv
    public final void zza(Map map) {
        String str;
        if (map.isEmpty() || (str = (String) map.get("gad_idless")) == null) {
            return;
        }
        w1 w1Var = this.zzb;
        boolean parseBoolean = Boolean.parseBoolean(str);
        w1Var.h(parseBoolean);
        if (parseBoolean) {
            com.google.android.gms.ads.internal.util.e.c(this.zza);
        }
    }
}
