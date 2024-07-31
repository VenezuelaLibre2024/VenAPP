package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.Provider;
import javax.crypto.Mac;

/* loaded from: classes2.dex */
public final class zzxe implements zzxb<Mac> {
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzxb
    public final /* synthetic */ Mac zza(String str, Provider provider) {
        return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
    }
}
