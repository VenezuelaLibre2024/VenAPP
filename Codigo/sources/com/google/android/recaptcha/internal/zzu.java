package com.google.android.recaptcha.internal;

import android.content.Context;
import android.os.Build;
import ca.g;

/* loaded from: classes2.dex */
public final class zzu {
    public static final zzu zza = new zzu();
    private static final String zzb = String.valueOf(Build.VERSION.SDK_INT);
    private static final g zzc = g.f();

    private zzu() {
    }

    public static final String zza(Context context) {
        int g10 = zzc.g(context);
        return (g10 == 1 || g10 == 3 || g10 == 9) ? "ANDROID_OFFPLAY" : "ANDROID_ONPLAY";
    }

    public static final String zzb() {
        return zzb;
    }
}
