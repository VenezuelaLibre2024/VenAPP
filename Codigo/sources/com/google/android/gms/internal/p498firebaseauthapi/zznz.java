package com.google.android.gms.internal.p498firebaseauthapi;

import com.google.android.gms.internal.p498firebaseauthapi.zzch;
import com.google.android.gms.internal.p498firebaseauthapi.zzov;

/* loaded from: classes2.dex */
public abstract class zznz<ParametersT extends zzch, SerializationT extends zzov> {
    private final Class<ParametersT> zza;
    private final Class<SerializationT> zzb;

    private zznz(Class<ParametersT> cls, Class<SerializationT> cls2) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static <ParametersT extends zzch, SerializationT extends zzov> zznz<ParametersT, SerializationT> zza(zzob<ParametersT, SerializationT> zzobVar, Class<ParametersT> cls, Class<SerializationT> cls2) {
        return new zzoc(cls, cls2, zzobVar);
    }

    public abstract SerializationT zza(ParametersT parameterst);

    public final Class<ParametersT> zza() {
        return this.zza;
    }

    public final Class<SerializationT> zzb() {
        return this.zzb;
    }
}
