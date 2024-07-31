package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
final class zzqk extends zzoh<zzce, zzuc> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzqk(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzoh
    public final /* synthetic */ zzce zza(zzuc zzucVar) {
        zzuc zzucVar2 = zzucVar;
        zzub zzb = zzucVar2.zze().zzb();
        SecretKeySpec secretKeySpec = new SecretKeySpec(zzucVar2.zzf().zzg(), "HMAC");
        int zza = zzucVar2.zze().zza();
        int i10 = zzqm.zza[zzb.ordinal()];
        if (i10 == 1) {
            return new zzxm(new zzxk("HMACSHA1", secretKeySpec), zza);
        }
        if (i10 == 2) {
            return new zzxm(new zzxk("HMACSHA224", secretKeySpec), zza);
        }
        if (i10 == 3) {
            return new zzxm(new zzxk("HMACSHA256", secretKeySpec), zza);
        }
        if (i10 == 4) {
            return new zzxm(new zzxk("HMACSHA384", secretKeySpec), zza);
        }
        if (i10 == 5) {
            return new zzxm(new zzxk("HMACSHA512", secretKeySpec), zza);
        }
        throw new GeneralSecurityException("unknown hash");
    }
}
