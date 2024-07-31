package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class zznr {
    private static zznr zza = new zznr();
    private final AtomicReference<zzok> zzb = new AtomicReference<>(new zzoj().zza());

    zznr() {
    }

    public static zznr zza() {
        return zza;
    }

    public final <WrapperPrimitiveT> Class<?> zza(Class<WrapperPrimitiveT> cls) {
        return this.zzb.get().zza((Class<?>) cls);
    }

    public final <KeyT extends zzbt, PrimitiveT> PrimitiveT zza(KeyT keyt, Class<PrimitiveT> cls) {
        return (PrimitiveT) this.zzb.get().zza((zzok) keyt, (Class) cls);
    }

    public final <InputPrimitiveT, WrapperPrimitiveT> WrapperPrimitiveT zza(zzcg<InputPrimitiveT> zzcgVar, Class<WrapperPrimitiveT> cls) {
        return (WrapperPrimitiveT) this.zzb.get().zza(zzcgVar, cls);
    }

    public final synchronized <InputPrimitiveT, WrapperPrimitiveT> void zza(zzcp<InputPrimitiveT, WrapperPrimitiveT> zzcpVar) {
        this.zzb.set(zzok.zza(this.zzb.get()).zza(zzcpVar).zza());
    }

    public final synchronized <KeyT extends zzbt, PrimitiveT> void zza(zzod<KeyT, PrimitiveT> zzodVar) {
        this.zzb.set(zzok.zza(this.zzb.get()).zza(zzodVar).zza());
    }
}
