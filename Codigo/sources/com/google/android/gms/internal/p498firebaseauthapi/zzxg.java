package com.google.android.gms.internal.p498firebaseauthapi;

import java.security.Provider;
import java.security.Signature;

/* loaded from: classes2.dex */
public final class zzxg implements zzxb<Signature> {
    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzxb
    public final /* synthetic */ Signature zza(String str, Provider provider) {
        return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
    }
}
