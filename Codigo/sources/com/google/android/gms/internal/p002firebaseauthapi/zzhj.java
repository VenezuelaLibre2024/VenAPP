package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzhm;
import com.google.android.gms.internal.p002firebaseauthapi.zzif;
import com.google.android.gms.internal.p002firebaseauthapi.zzuy;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzhj extends zznb<zzvx> {
    private static final zzno<zzhm> zza = new zzno() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhi
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhj() {
        super(zzvx.class, new zzhl(zzbg.class));
    }

    public static int zza() {
        return 0;
    }

    public static void zza(boolean z10) {
        zzct.zza((zznb) new zzhj(), true);
        zzho.zza();
        zzns zza2 = zzns.zza();
        HashMap hashMap = new HashMap();
        hashMap.put("XCHACHA20_POLY1305", zzhm.zza(zzhm.zza.zza));
        hashMap.put("XCHACHA20_POLY1305_RAW", zzhm.zza(zzhm.zza.zzc));
        zza2.zza(Collections.unmodifiableMap(hashMap));
        zznl.zza().zza(zza, zzhm.class);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznb
    public final /* synthetic */ zzvx zza(zzahp zzahpVar) {
        return zzvx.zza(zzahpVar, zzaio.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznb
    public final /* synthetic */ void zza(zzvx zzvxVar) {
        zzvx zzvxVar2 = zzvxVar;
        zzxo.zza(zzvxVar2.zza(), 0);
        if (zzvxVar2.zzd().zzb() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznb
    public final zzif.zza zzb() {
        return zzif.zza.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznb
    public final zzne<?, zzvx> zzc() {
        return new zzhk(this, zzvy.class);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznb
    public final zzuy.zza zzd() {
        return zzuy.zza.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznb
    public final String zze() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }
}
