package com.google.android.gms.internal.p498firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.Iterator;

/* loaded from: classes2.dex */
final class zzww<JcePrimitiveT> implements zzwy<JcePrimitiveT> {
    private final zzxb<JcePrimitiveT> zza;

    private zzww(zzxb<JcePrimitiveT> zzxbVar) {
        this.zza = zzxbVar;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzwy
    public final JcePrimitiveT zza(String str) {
        Iterator<Provider> it = zzwt.zza("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt").iterator();
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
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
