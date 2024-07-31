package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzbt;
import com.google.android.gms.internal.p002firebaseauthapi.zzov;

/* loaded from: classes2.dex */
public class zzmx<KeyT extends zzbt, SerializationT extends zzov> {
    private final Class<KeyT> zza;
    private final Class<SerializationT> zzb;

    private zzmx(Class<KeyT> cls, Class<SerializationT> cls2) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static <KeyT extends zzbt, SerializationT extends zzov> zzmx<KeyT, SerializationT> zza(zzmz<KeyT, SerializationT> zzmzVar, Class<KeyT> cls, Class<SerializationT> cls2) {
        return new zzna(cls, cls2, zzmzVar);
    }

    public final Class<KeyT> zza() {
        return this.zza;
    }

    public final Class<SerializationT> zzb() {
        return this.zzb;
    }
}
