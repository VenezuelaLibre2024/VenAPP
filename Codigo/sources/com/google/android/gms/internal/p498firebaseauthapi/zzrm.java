package com.google.android.gms.internal.p498firebaseauthapi;

import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzrm {
    private HashMap<String, String> zza = new HashMap<>();

    public final zzrn zza() {
        if (this.zza == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        zzrn zzrnVar = new zzrn(Collections.unmodifiableMap(this.zza));
        this.zza = null;
        return zzrnVar;
    }
}
