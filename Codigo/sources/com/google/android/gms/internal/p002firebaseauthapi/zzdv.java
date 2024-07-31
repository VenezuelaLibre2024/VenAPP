package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzif;
import com.google.android.gms.internal.p002firebaseauthapi.zzuy;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzdv extends zznb<zzsi> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdv() {
        super(zzsi.class, new zzdu(zzxi.class));
    }

    /* renamed from: zza, reason: avoid collision after fix types in other method */
    public static void zza2(zzsi zzsiVar) {
        zzxo.zza(zzsiVar.zza(), 0);
        zzxo.zza(zzsiVar.zzf().zzb());
        zza(zzsiVar.zze());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zza(zzsm zzsmVar) {
        if (zzsmVar.zza() < 12 || zzsmVar.zza() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznb
    public final /* synthetic */ zzsi zza(zzahp zzahpVar) {
        return zzsi.zza(zzahpVar, zzaio.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznb
    public final /* bridge */ /* synthetic */ void zza(zzsi zzsiVar) {
        zza2(zzsiVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznb
    public final zzif.zza zzb() {
        return zzif.zza.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznb
    public final zzne<?, zzsi> zzc() {
        return new zzdx(this, zzsj.class);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznb
    public final zzuy.zza zzd() {
        return zzuy.zza.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznb
    public final String zze() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }
}
