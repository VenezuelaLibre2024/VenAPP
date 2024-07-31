package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzov;

/* loaded from: classes2.dex */
public abstract class zzmu<SerializationT extends zzov> {
    private final zzxt zza;
    private final Class<SerializationT> zzb;

    private zzmu(zzxt zzxtVar, Class<SerializationT> cls) {
        this.zza = zzxtVar;
        this.zzb = cls;
    }

    public static <SerializationT extends zzov> zzmu<SerializationT> zza(zzmv<SerializationT> zzmvVar, zzxt zzxtVar, Class<SerializationT> cls) {
        return new zzmw(zzxtVar, cls, zzmvVar);
    }

    public abstract zzbt zza(SerializationT serializationt, zzcs zzcsVar);

    public final zzxt zza() {
        return this.zza;
    }

    public final Class<SerializationT> zzb() {
        return this.zzb;
    }
}
