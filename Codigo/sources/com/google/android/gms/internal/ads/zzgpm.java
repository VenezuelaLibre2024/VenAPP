package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public final class zzgpm {
    public static final Charset zza = Charset.forName("UTF-8");

    public static final zzgxq zza(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt < '!' || charAt > '~') {
                throw new zzgpl("Not a printable ASCII character: " + charAt);
            }
            bArr[i10] = (byte) charAt;
        }
        return zzgxq.zzb(bArr);
    }

    public static boolean zzb(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            return false;
        }
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (bArr2[i10] != bArr[i10]) {
                return false;
            }
        }
        return true;
    }
}
