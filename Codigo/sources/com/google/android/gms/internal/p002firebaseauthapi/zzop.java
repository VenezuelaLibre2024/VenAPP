package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzakn;

/* loaded from: classes2.dex */
public abstract class zzop<KeyProtoT extends zzakn, PublicKeyProtoT extends zzakn> extends zznb<KeyProtoT> {
    private final Class<PublicKeyProtoT> zza;

    /* JADX INFO: Access modifiers changed from: protected */
    @SafeVarargs
    public zzop(Class<KeyProtoT> cls, Class<PublicKeyProtoT> cls2, zzoh<?, KeyProtoT>... zzohVarArr) {
        super(cls, zzohVarArr);
        this.zza = cls2;
    }

    public abstract PublicKeyProtoT zzb(KeyProtoT keyprotot);
}
