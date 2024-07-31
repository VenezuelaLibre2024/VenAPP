package com.google.android.gms.internal.p498firebaseauthapi;

import com.google.android.gms.internal.p498firebaseauthapi.zzov;

/* loaded from: classes2.dex */
public abstract class zznv<SerializationT extends zzov> {
    private final zzxt zza;
    private final Class<SerializationT> zzb;

    private zznv(zzxt zzxtVar, Class<SerializationT> cls) {
        this.zza = zzxtVar;
        this.zzb = cls;
    }

    public static <SerializationT extends zzov> zznv<SerializationT> zza(zznx<SerializationT> zznxVar, zzxt zzxtVar, Class<SerializationT> cls) {
        return new zzny(zzxtVar, cls, zznxVar);
    }

    public abstract zzch zza(SerializationT serializationt);

    public final zzxt zza() {
        return this.zza;
    }

    public final Class<SerializationT> zzb() {
        return this.zzb;
    }
}
