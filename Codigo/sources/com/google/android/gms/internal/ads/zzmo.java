package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.wifi.WifiManager;

/* loaded from: classes2.dex */
final class zzmo {
    private final WifiManager zza;

    public zzmo(Context context) {
        this.zza = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }
}
