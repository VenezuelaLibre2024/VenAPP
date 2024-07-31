package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.Bundle;
import android.os.ext.SdkExtensions;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;

/* loaded from: classes2.dex */
public final class zzetc implements zzexp {
    private final Integer zza;

    private zzetc(Integer num) {
        this.zza = num;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzetc zzb() {
        if (!((Boolean) a0.c().zza(zzbgc.zzjL)).booleanValue()) {
            return new zzetc(null);
        }
        t.r();
        int i10 = 0;
        if (Build.VERSION.SDK_INT >= 30 && SdkExtensions.getExtensionVersion(30) > 3) {
            i10 = SdkExtensions.getExtensionVersion(1000000);
        }
        return new zzetc(Integer.valueOf(i10));
    }

    @Override // com.google.android.gms.internal.ads.zzexp
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Integer num = this.zza;
        Bundle bundle = (Bundle) obj;
        if (num != null) {
            bundle.putInt("aos", num.intValue());
        }
    }
}
