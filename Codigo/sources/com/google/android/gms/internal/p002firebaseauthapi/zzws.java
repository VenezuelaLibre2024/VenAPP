package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.Provider;
import java.util.Iterator;

/* loaded from: classes2.dex */
final class zzws<JcePrimitiveT> implements zzwy<JcePrimitiveT> {
    private final zzxb<JcePrimitiveT> zza;

    private zzws(zzxb<JcePrimitiveT> zzxbVar) {
        this.zza = zzxbVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzwy
    public final JcePrimitiveT zza(String str) {
        Iterator<Provider> it = zzwt.zza("GmsCore_OpenSSL", "AndroidOpenSSL").iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return this.zza.zza(str, it.next());
            } catch (Exception e10) {
                if (exc == null) {
                    exc = e10;
                }
            }
        }
        return this.zza.zza(str, null);
    }
}
