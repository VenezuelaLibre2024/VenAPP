package com.google.android.gms.internal.p498firebaseauthapi;

import com.google.android.gms.internal.p498firebaseauthapi.zzajc;

/* loaded from: classes2.dex */
final class zzaja implements zzakk {
    private static final zzaja zza = new zzaja();

    private zzaja() {
    }

    public static zzaja zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzakk
    public final zzakl zza(Class<?> cls) {
        if (!zzajc.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (zzakl) zzajc.zza(cls.asSubclass(zzajc.class)).zza(zzajc.zzf.zzc, (Object) null, (Object) null);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e10);
        }
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzakk
    public final boolean zzb(Class<?> cls) {
        return zzajc.class.isAssignableFrom(cls);
    }
}
