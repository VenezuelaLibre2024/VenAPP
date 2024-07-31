package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzakn;

/* loaded from: classes2.dex */
public abstract class zzne<KeyFormatProtoT extends zzakn, KeyProtoT extends zzakn> {
    private final Class<KeyFormatProtoT> zza;

    public zzne(Class<KeyFormatProtoT> cls) {
        this.zza = cls;
    }

    public abstract KeyFormatProtoT zza(zzahp zzahpVar);

    public abstract KeyProtoT zza(KeyFormatProtoT keyformatprotot);

    public abstract void zzb(KeyFormatProtoT keyformatprotot);
}
