package com.google.android.gms.internal.p498firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzoy {
    private final Map<zzpc, zzmx<?, ?>> zza;
    private final Map<zzpa, zzmu<?>> zzb;
    private final Map<zzpc, zznz<?, ?>> zzc;
    private final Map<zzpa, zznv<?>> zzd;

    /* JADX INFO: Access modifiers changed from: private */
    public zzoy(zzox zzoxVar) {
        Map map;
        Map map2;
        Map map3;
        Map map4;
        map = zzoxVar.zza;
        this.zza = new HashMap(map);
        map2 = zzoxVar.zzb;
        this.zzb = new HashMap(map2);
        map3 = zzoxVar.zzc;
        this.zzc = new HashMap(map3);
        map4 = zzoxVar.zzd;
        this.zzd = new HashMap(map4);
    }

    public /* synthetic */ zzoy(zzox zzoxVar, zzpe zzpeVar) {
        this(zzoxVar);
    }

    public final <SerializationT extends zzov> zzbt zza(SerializationT serializationt, zzcs zzcsVar) {
        zzpa zzpaVar = new zzpa(serializationt.getClass(), serializationt.zzb());
        if (this.zzb.containsKey(zzpaVar)) {
            return this.zzb.get(zzpaVar).zza(serializationt, zzcsVar);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + String.valueOf(zzpaVar) + " available");
    }

    public final <SerializationT extends zzov> zzch zza(SerializationT serializationt) {
        zzpa zzpaVar = new zzpa(serializationt.getClass(), serializationt.zzb());
        if (this.zzd.containsKey(zzpaVar)) {
            return this.zzd.get(zzpaVar).zza(serializationt);
        }
        throw new GeneralSecurityException("No Parameters Parser for requested key type " + String.valueOf(zzpaVar) + " available");
    }

    public final <ParametersT extends zzch, SerializationT extends zzov> SerializationT zza(ParametersT parameterst, Class<SerializationT> cls) {
        zzpc zzpcVar = new zzpc(parameterst.getClass(), cls);
        if (this.zzc.containsKey(zzpcVar)) {
            return (SerializationT) this.zzc.get(zzpcVar).zza(parameterst);
        }
        throw new GeneralSecurityException("No Key Format serializer for " + String.valueOf(zzpcVar) + " available");
    }

    public final <SerializationT extends zzov> boolean zzb(SerializationT serializationt) {
        return this.zzb.containsKey(new zzpa(serializationt.getClass(), serializationt.zzb()));
    }

    public final <SerializationT extends zzov> boolean zzc(SerializationT serializationt) {
        return this.zzd.containsKey(new zzpa(serializationt.getClass(), serializationt.zzb()));
    }
}
