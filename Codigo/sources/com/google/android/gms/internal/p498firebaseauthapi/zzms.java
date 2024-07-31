package com.google.android.gms.internal.p498firebaseauthapi;

import com.google.android.gms.internal.p498firebaseauthapi.zzmq;
import java.security.GeneralSecurityException;
import java.util.Set;

/* loaded from: classes2.dex */
final class zzms implements zzmq.zza {
    private final /* synthetic */ zzop zza;
    private final /* synthetic */ zznb zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzms(zzop zzopVar, zznb zznbVar) {
        this.zza = zzopVar;
        this.zzb = zznbVar;
    }

    @Override // com.google.android.gms.internal.firebase-auth-api.zzmq.zza
    public final zzbs<?> zza() {
        zzop zzopVar = this.zza;
        return new zzoq(zzopVar, this.zzb, zzopVar.zzf());
    }

    @Override // com.google.android.gms.internal.firebase-auth-api.zzmq.zza
    public final <Q> zzbs<Q> zza(Class<Q> cls) {
        try {
            return new zzoq(this.zza, this.zzb, cls);
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
