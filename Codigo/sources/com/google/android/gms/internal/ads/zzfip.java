package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.c3;
import java.util.HashSet;

/* loaded from: classes2.dex */
public final class zzfip implements zzdba {
    private final HashSet zza = new HashSet();
    private final Context zzb;
    private final zzcdp zzc;

    public zzfip(Context context, zzcdp zzcdpVar) {
        this.zzb = context;
        this.zzc = zzcdpVar;
    }

    public final Bundle zzb() {
        return this.zzc.zzn(this.zzb, this);
    }

    @Override // com.google.android.gms.internal.ads.zzdba
    public final synchronized void zzbK(c3 c3Var) {
        if (c3Var.f8626a != 3) {
            this.zzc.zzl(this.zza);
        }
    }

    public final synchronized void zzc(HashSet hashSet) {
        this.zza.clear();
        this.zza.addAll(hashSet);
    }
}
