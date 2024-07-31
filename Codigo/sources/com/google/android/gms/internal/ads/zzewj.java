package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.a0;

/* loaded from: classes2.dex */
public final class zzewj implements zzexp {
    private final String zza;
    private final String zzb;

    public zzewj(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzexp
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        ((Bundle) obj).putString("request_id", ((Boolean) a0.c().zza(zzbgc.zzgW)).booleanValue() ? this.zzb : this.zza);
    }
}
