package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.b1;

/* loaded from: classes2.dex */
public final class zzaze extends b1 {
    private final y8.e zza;

    public zzaze(y8.e eVar) {
        this.zza = eVar;
    }

    public final y8.e zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.internal.client.c1
    public final void zzc(String str, String str2) {
        this.zza.onAppEvent(str, str2);
    }
}
