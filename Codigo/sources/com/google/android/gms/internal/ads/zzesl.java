package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.f5;

/* loaded from: classes2.dex */
public final class zzesl implements zzexp {
    private final f5 zza;
    private final zzcei zzb;
    private final boolean zzc;

    public zzesl(f5 f5Var, zzcei zzceiVar, boolean z10) {
        this.zza = f5Var;
        this.zzb = zzceiVar;
        this.zzc = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzexp
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        String str;
        Bundle bundle = (Bundle) obj;
        if (this.zzb.zzc >= ((Integer) a0.c().zza(zzbgc.zzfh)).intValue()) {
            bundle.putString("app_open_version", "2");
        }
        if (((Boolean) a0.c().zza(zzbgc.zzfi)).booleanValue()) {
            bundle.putBoolean("app_switched", this.zzc);
        }
        f5 f5Var = this.zza;
        if (f5Var != null) {
            int i10 = f5Var.f8664a;
            if (i10 == 1) {
                str = "p";
            } else if (i10 != 2) {
                return;
            } else {
                str = "l";
            }
            bundle.putString("avo", str);
        }
    }
}
