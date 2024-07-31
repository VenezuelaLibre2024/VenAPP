package com.google.android.gms.internal.ads;

import android.util.Log;

/* loaded from: classes2.dex */
public final class zzhgq extends zzhgv {
    final String zza;

    public zzhgq(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzhgv
    public final void zza(String str) {
        String str2 = this.zza;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str).length());
        sb2.append(str2);
        sb2.append(":");
        sb2.append(str);
        Log.d("isoparser", sb2.toString());
    }
}
