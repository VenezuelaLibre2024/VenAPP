package com.google.android.gms.internal.p498firebaseauthapi;

import com.google.android.gms.common.internal.C5276s;
import java.io.UnsupportedEncodingException;
import java.util.List;
import la.C9458c;

/* loaded from: classes2.dex */
public final class zzafp {
    public static long zza(String str) {
        zzafo zzb = zzb(str);
        return zzb.zza().longValue() - zzb.zzb().longValue();
    }

    private static zzafo zzb(String str) {
        C5276s.m13320f(str);
        List<String> zza = zzab.zza('.').zza((CharSequence) str);
        if (zza.size() >= 2) {
            try {
                return zzafo.zza(new String(C9458c.m28125b(zza.get(1)), "UTF-8"));
            } catch (UnsupportedEncodingException e10) {
                throw new RuntimeException("Unable to decode token", e10);
            }
        }
        throw new RuntimeException("Invalid idToken " + str);
    }
}