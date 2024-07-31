package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.Provider;
import javax.crypto.Cipher;

/* loaded from: classes2.dex */
public final class zzxa implements zzxb<Cipher> {
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzxb
    public final /* synthetic */ Cipher zza(String str, Provider provider) {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }
}
