package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import ca.g;
import ca.k;

/* loaded from: classes2.dex */
public final class zzacm {
    private static Boolean zza;

    public static boolean zza(Context context) {
        if (zza == null) {
            int h10 = g.f().h(context, k.f6983a);
            zza = Boolean.valueOf(h10 == 0 || h10 == 2);
        }
        return zza.booleanValue();
    }
}
