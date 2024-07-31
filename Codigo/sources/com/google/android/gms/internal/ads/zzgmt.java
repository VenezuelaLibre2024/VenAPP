package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* loaded from: classes2.dex */
final class zzgmt extends ThreadLocal {
    protected static final Cipher zza() {
        boolean zze;
        try {
            Cipher cipher = (Cipher) zzgwz.zza.zza("AES/GCM-SIV/NoPadding");
            zze = zzgmu.zze(cipher);
            if (zze) {
                return cipher;
            }
            return null;
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        return zza();
    }
}
