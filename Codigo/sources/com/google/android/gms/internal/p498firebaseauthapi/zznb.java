package com.google.android.gms.internal.p498firebaseauthapi;

import com.google.android.gms.internal.p498firebaseauthapi.zzakn;
import com.google.android.gms.internal.p498firebaseauthapi.zzif;
import com.google.android.gms.internal.p498firebaseauthapi.zzuy;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class zznb<KeyProtoT extends zzakn> {
    private final Class<KeyProtoT> zza;
    private final Map<Class<?>, zzoh<?, KeyProtoT>> zzb;
    private final Class<?> zzc;

    /* JADX INFO: Access modifiers changed from: protected */
    @SafeVarargs
    public zznb(Class<KeyProtoT> cls, zzoh<?, KeyProtoT>... zzohVarArr) {
        this.zza = cls;
        HashMap hashMap = new HashMap();
        for (zzoh<?, KeyProtoT> zzohVar : zzohVarArr) {
            if (hashMap.containsKey(zzohVar.zza())) {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + zzohVar.zza().getCanonicalName());
            }
            hashMap.put(zzohVar.zza(), zzohVar);
        }
        this.zzc = zzohVarArr.length > 0 ? zzohVarArr[0].zza() : Void.class;
        this.zzb = Collections.unmodifiableMap(hashMap);
    }

    public abstract KeyProtoT zza(zzahp zzahpVar);

    public final <P> P zza(KeyProtoT keyprotot, Class<P> cls) {
        zzoh<?, KeyProtoT> zzohVar = this.zzb.get(cls);
        if (zzohVar != null) {
            return (P) zzohVar.zza(keyprotot);
        }
        throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
    }

    public abstract void zza(KeyProtoT keyprotot);

    public abstract zzif.zza zzb();

    public zzne<?, KeyProtoT> zzc() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    public abstract zzuy.zza zzd();

    public abstract String zze();

    public final Class<?> zzf() {
        return this.zzc;
    }

    public final Class<KeyProtoT> zzg() {
        return this.zza;
    }

    public final Set<Class<?>> zzh() {
        return this.zzb.keySet();
    }
}
