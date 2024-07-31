package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzok {
    private final Map<zzol, zzod<?, ?>> zza;
    private final Map<Class<?>, zzcp<?, ?>> zzb;

    /* JADX INFO: Access modifiers changed from: private */
    public zzok(zzoj zzojVar) {
        Map map;
        Map map2;
        map = zzojVar.zza;
        this.zza = new HashMap(map);
        map2 = zzojVar.zzb;
        this.zzb = new HashMap(map2);
    }

    public /* synthetic */ zzok(zzoj zzojVar, zzon zzonVar) {
        this(zzojVar);
    }

    public static zzoj zza(zzok zzokVar) {
        return new zzoj(zzokVar);
    }

    public final Class<?> zza(Class<?> cls) {
        if (this.zzb.containsKey(cls)) {
            return this.zzb.get(cls).zza();
        }
        throw new GeneralSecurityException("No input primitive class for " + String.valueOf(cls) + " available");
    }

    public final <KeyT extends zzbt, PrimitiveT> PrimitiveT zza(KeyT keyt, Class<PrimitiveT> cls) {
        zzol zzolVar = new zzol(keyt.getClass(), cls);
        if (this.zza.containsKey(zzolVar)) {
            return (PrimitiveT) this.zza.get(zzolVar).zza(keyt);
        }
        throw new GeneralSecurityException("No PrimitiveConstructor for " + String.valueOf(zzolVar) + " available");
    }

    public final <InputPrimitiveT, WrapperPrimitiveT> WrapperPrimitiveT zza(zzcg<InputPrimitiveT> zzcgVar, Class<WrapperPrimitiveT> cls) {
        if (!this.zzb.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for " + String.valueOf(cls));
        }
        zzcp<?, ?> zzcpVar = this.zzb.get(cls);
        if (zzcgVar.zzc().equals(zzcpVar.zza()) && zzcpVar.zza().equals(zzcgVar.zzc())) {
            return (WrapperPrimitiveT) zzcpVar.zza(zzcgVar);
        }
        throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
    }
}
