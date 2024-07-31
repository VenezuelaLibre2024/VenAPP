package com.google.android.gms.internal.p498firebaseauthapi;

import com.google.android.gms.internal.p498firebaseauthapi.zzakn;

/* loaded from: classes2.dex */
public abstract class zzoh<PrimitiveT, KeyProtoT extends zzakn> {
    private final Class<PrimitiveT> zza;

    public zzoh(Class<PrimitiveT> cls) {
        this.zza = cls;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Class<PrimitiveT> zza() {
        return this.zza;
    }

    public abstract PrimitiveT zza(KeyProtoT keyprotot);
}
