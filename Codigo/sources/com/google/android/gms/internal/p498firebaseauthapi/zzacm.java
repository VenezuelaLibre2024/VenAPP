package com.google.android.gms.internal.p498firebaseauthapi;

import android.content.Context;
import ca.C1904g;
import ca.C1912k;

/* loaded from: classes2.dex */
public final class zzacm {
    private static Boolean zza;

    public static boolean zza(Context context) {
        if (zza == null) {
            int mo10072h = C1904g.m10086f().mo10072h(context, C1912k.f7932a);
            zza = Boolean.valueOf(mo10072h == 0 || mo10072h == 2);
        }
        return zza.booleanValue();
    }
}
