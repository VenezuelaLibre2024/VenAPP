package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
final class zzgi extends zzne<zzvr, zzvo> {
    private final /* synthetic */ zzgg zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgi(zzgg zzggVar, Class cls) {
        super(cls);
        this.zza = zzggVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzne
    public final /* synthetic */ zzvr zza(zzahp zzahpVar) {
        return zzvr.zza(zzahpVar, zzaio.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzne
    public final /* synthetic */ zzvo zza(zzvr zzvrVar) {
        return (zzvo) ((zzajc) zzvo.zzb().zza(zzvrVar).zza(0).zzf());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzne
    public final /* synthetic */ void zzb(zzvr zzvrVar) {
        zzvr zzvrVar2 = zzvrVar;
        if (zzgh.zza(zzvrVar2.zza().zzf())) {
            if (zzvrVar2.zze().isEmpty() || !zzvrVar2.zzf()) {
                throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
            }
        } else {
            throw new GeneralSecurityException("Unsupported DEK key type: " + zzvrVar2.zza().zzf() + ". Only Tink AEAD key types are supported.");
        }
    }
}
