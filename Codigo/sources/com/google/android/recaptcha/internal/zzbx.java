package com.google.android.recaptcha.internal;

import ck.s;

/* loaded from: classes2.dex */
public final /* synthetic */ class zzbx {
    public static String zza(zzby zzbyVar, String str, byte b10) {
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            sb2.append((char) s.b(s.b(str.charAt(i10)) ^ s.b(b10)));
        }
        return sb2.toString();
    }

    public static void zzb(zzby zzbyVar, int i10, int i11) {
        if (i10 != i11) {
            throw new zzt(4, 24, null);
        }
    }
}
