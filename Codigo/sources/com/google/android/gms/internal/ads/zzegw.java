package com.google.android.gms.internal.ads;

import android.app.Activity;
import g9.u;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzegw extends zzeht {
    private Activity zza;
    private u zzb;
    private String zzc;
    private String zzd;

    @Override // com.google.android.gms.internal.ads.zzeht
    public final zzeht zza(Activity activity) {
        if (activity == null) {
            throw new NullPointerException("Null activity");
        }
        this.zza = activity;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeht
    public final zzeht zzb(u uVar) {
        this.zzb = uVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeht
    public final zzeht zzc(String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeht
    public final zzeht zzd(String str) {
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeht
    public final zzehu zze() {
        Activity activity = this.zza;
        if (activity != null) {
            return new zzegy(activity, this.zzb, this.zzc, this.zzd, null);
        }
        throw new IllegalStateException("Missing required properties: activity");
    }
}
