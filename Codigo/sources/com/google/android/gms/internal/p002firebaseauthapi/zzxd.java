package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.Provider;
import javax.crypto.KeyAgreement;

/* loaded from: classes2.dex */
public final class zzxd implements zzxb<KeyAgreement> {
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzxb
    public final /* synthetic */ KeyAgreement zza(String str, Provider provider) {
        return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
    }
}
