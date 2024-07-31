package com.google.android.gms.internal.consent_sdk;

import android.util.Log;
import cb.e;

/* loaded from: classes2.dex */
public final class zzg extends Exception {
    private final int zza;

    public zzg(int i10, String str) {
        super(str);
        this.zza = i10;
    }

    public zzg(int i10, String str, Throwable th2) {
        super(str, th2);
        this.zza = i10;
    }

    public final e zza() {
        if (getCause() == null) {
            Log.w("UserMessagingPlatform", getMessage());
        } else {
            Log.w("UserMessagingPlatform", getMessage(), getCause());
        }
        return new e(this.zza, getMessage());
    }
}
