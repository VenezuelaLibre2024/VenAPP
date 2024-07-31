package com.google.android.gms.internal.p498firebaseauthapi;

import com.google.android.gms.internal.p498firebaseauthapi.zzmq;
import java.security.GeneralSecurityException;
import java.util.Set;

/* loaded from: classes2.dex */
final class zzmt implements zzmq.zza {
    private final /* synthetic */ zznb zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzmt(zznb zznbVar) {
        this.zza = zznbVar;
    }

    @Override // com.google.android.gms.internal.firebase-auth-api.zzmq.zza
    public final zzbs<?> zza() {
        zznb zznbVar = this.zza;
        return new zzmo(zznbVar, zznbVar.zzf());
    }

    @Override // com.google.android.gms.internal.firebase-auth-api.zzmq.zza
    public final <Q> zzbs<Q> zza(Class<Q> cls) {
        try {
            return new zzmo(this.zza, cls);
        } catch (IllegalArgumentException e10) {
            throw new GeneralSecurityException("Primitive type not supported", e10);
        }
    }

    @Override // com.google.android.gms.internal.firebase-auth-api.zzmq.zza
    public final Class<?> zzb() {
        return this.zza.getClass();
    }

    @Override // com.google.android.gms.internal.firebase-auth-api.zzmq.zza
    public final Set<Class<?>> zzc() {
        return this.zza.zzh();
    }
}
