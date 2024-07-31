package com.google.android.gms.internal.p498firebaseauthapi;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class zznn {
    private static final zznn zza = new zznn();
    private static final zznq zzb = new zznq();
    private final AtomicReference<zzro> zzc = new AtomicReference<>();

    public static zznn zza() {
        return zza;
    }

    public final zzro zzb() {
        zzro zzroVar = this.zzc.get();
        return zzroVar == null ? zzb : zzroVar;
    }
}
