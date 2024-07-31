package com.google.android.recaptcha.internal;

import ck.s;

/* loaded from: classes2.dex */
public final /* synthetic */ class zzbh {
    public static String zza(zzbi zzbiVar, String str, byte b10) {
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            sb2.append((char) s.b(s.b(str.charAt(i10)) ^ s.b(b10)));
        }
        return sb2.toString();
    }
}
