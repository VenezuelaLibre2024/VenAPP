package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;

/* loaded from: classes2.dex */
public final class zzamc extends RuntimeException {
    private final List<String> zza;

    public zzamc(zzakn zzaknVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.zza = null;
    }

    public final zzaji zza() {
        return new zzaji(getMessage());
    }
}
