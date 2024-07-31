package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.KeyFactory;
import java.security.Provider;

/* loaded from: classes2.dex */
public final class zzxc implements zzxb<KeyFactory> {
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzxb
    public final /* synthetic */ KeyFactory zza(String str, Provider provider) {
        return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
    }
}
