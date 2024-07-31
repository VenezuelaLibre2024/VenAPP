package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajc;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzaja implements zzakk {
    private static final zzaja zza = new zzaja();

    private zzaja() {
    }

    public static zzaja zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakk
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

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakk
    public final boolean zzb(Class<?> cls) {
        return zzajc.class.isAssignableFrom(cls);
    }
}
