package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzoj {
    private final Map<zzol, zzod<?, ?>> zza;
    private final Map<Class<?>, zzcp<?, ?>> zzb;

    private zzoj() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    private zzoj(zzok zzokVar) {
        this.zza = new HashMap(zzok.zzb(zzokVar));
        this.zzb = new HashMap(zzok.zzc(zzokVar));
    }

    public final <InputPrimitiveT, WrapperPrimitiveT> zzoj zza(zzcp<InputPrimitiveT, WrapperPrimitiveT> zzcpVar) {
        if (zzcpVar == null) {
            throw new NullPointerException("wrapper must be non-null");
        }
        Class<WrapperPrimitiveT> zzb = zzcpVar.zzb();
        if (this.zzb.containsKey(zzb)) {
            zzcp<?, ?> zzcpVar2 = this.zzb.get(zzb);
            if (!zzcpVar2.equals(zzcpVar) || !zzcpVar.equals(zzcpVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type" + String.valueOf(zzb));
            }
        } else {
            this.zzb.put(zzb, zzcpVar);
        }
        return this;
    }

    public final <KeyT extends zzbt, PrimitiveT> zzoj zza(zzod<KeyT, PrimitiveT> zzodVar) {
        if (zzodVar == null) {
            throw new NullPointerException("primitive constructor must be non-null");
        }
        zzol zzolVar = new zzol(zzodVar.zza(), zzodVar.zzb());
        if (this.zza.containsKey(zzolVar)) {
            zzod<?, ?> zzodVar2 = this.zza.get(zzolVar);
            if (!zzodVar2.equals(zzodVar) || !zzodVar.equals(zzodVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: " + String.valueOf(zzolVar));
            }
        } else {
            this.zza.put(zzolVar, zzodVar);
        }
        return this;
    }

    public final zzok zza() {
        return new zzok(this);
    }
}
