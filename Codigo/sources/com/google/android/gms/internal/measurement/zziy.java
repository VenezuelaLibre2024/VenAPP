package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzix;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zziy implements zzkk {
    private static final zziy zza = new zziy();

    private zziy() {
    }

    public static zziy zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzkk
    public final zzkh zza(Class<?> cls) {
        if (!zzix.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (zzkh) zzix.zza(cls.asSubclass(zzix.class)).zza(zzix.zze.zzc, (Object) null, (Object) null);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzkk
    public final boolean zzb(Class<?> cls) {
        return zzix.class.isAssignableFrom(cls);
    }
}
