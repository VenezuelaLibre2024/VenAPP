package com.google.android.gms.internal.p498firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import com.facebook.ads.AdError;
import com.google.android.gms.common.internal.C5264o;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzacr {
    private final int zza;

    private zzacr(String str) {
        this.zza = zza(str);
    }

    private static int zza(String str) {
        try {
            List<String> zza = zzab.zza("[.-]").zza((CharSequence) str);
            if (zza.size() == 1) {
                return Integer.parseInt(str);
            }
            if (zza.size() >= 3) {
                return (Integer.parseInt(zza.get(0)) * 1000000) + (Integer.parseInt(zza.get(1)) * AdError.NETWORK_ERROR_CODE) + Integer.parseInt(zza.get(2));
            }
            return -1;
        } catch (IllegalArgumentException e10) {
            if (!Log.isLoggable("LibraryVersionContainer", 3)) {
                return -1;
            }
            Log.d("LibraryVersionContainer", String.format("Version code parsing failed for: %s with exception %s.", str, e10));
            return -1;
        }
    }

    public static zzacr zza() {
        String m13301b = C5264o.m13300a().m13301b("firebase-auth");
        if (TextUtils.isEmpty(m13301b) || m13301b.equals("UNKNOWN")) {
            m13301b = "-1";
        }
        return new zzacr(m13301b);
    }

    public final String zzb() {
        return String.format("X%s", Integer.toString(this.zza));
    }
}
