package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.a0;

/* loaded from: classes2.dex */
public final class zzeyh implements zzexp {
    final String zza;
    final int zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzeyh(String str, int i10, zzeyg zzeygVar) {
        this.zza = str;
        this.zzb = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzexp
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (((Boolean) a0.c().zza(zzbgc.zzjU)).booleanValue()) {
            if (!TextUtils.isEmpty(this.zza)) {
                bundle.putString("topics", this.zza);
            }
            int i10 = this.zzb;
            if (i10 != -1) {
                bundle.putInt("atps", i10);
            }
        }
    }
}
