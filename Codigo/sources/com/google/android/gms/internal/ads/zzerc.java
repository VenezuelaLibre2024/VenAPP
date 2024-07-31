package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.a0;

/* loaded from: classes2.dex */
public final class zzerc implements zzexq {
    private final Context zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzerc(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final int zza() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final com.google.common.util.concurrent.f zzb() {
        if (((Boolean) a0.c().zza(zzbgc.zzcJ)).booleanValue()) {
            return zzgen.zzh(new zzerd(androidx.core.content.a.checkSelfPermission(this.zza, "com.google.android.gms.permission.AD_ID") == 0));
        }
        return zzgen.zzh(null);
    }
}
