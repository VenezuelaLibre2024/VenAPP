package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
final class zzqt implements zzcp<zzce, zzce> {
    private static final zzqt zza = new zzqt();
    private static final zzod<zznd, zzce> zzb = zzod.zza(new zzof() { // from class: com.google.android.gms.internal.firebase-auth-api.zzqs
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzof
        public final Object zza(zzbt zzbtVar) {
            return zzrl.zza((zznd) zzbtVar);
        }
    }, zznd.class, zzce.class);

    zzqt() {
    }

    public static void zzc() {
        zzct.zza(zza);
        zznr.zza().zza(zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcp
    public final Class<zzce> zza() {
        return zzce.class;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcp
    public final /* synthetic */ zzce zza(zzcg<zzce> zzcgVar) {
        Iterator<List<zzcl<zzce>>> it = zzcgVar.zzd().iterator();
        while (it.hasNext()) {
            for (zzcl<zzce> zzclVar : it.next()) {
                if (zzclVar.zzb() instanceof zzqr) {
                    zzqr zzqrVar = (zzqr) zzclVar.zzb();
                    zzxt zza2 = zzxt.zza(zzclVar.zzh());
                    if (!zza2.equals(zzqrVar.zzb())) {
                        throw new GeneralSecurityException("Mac Key with parameters " + String.valueOf(zzqrVar.zza()) + " has wrong output prefix (" + String.valueOf(zzqrVar.zzb()) + ") instead of (" + String.valueOf(zza2) + ")");
                    }
                }
            }
        }
        return new zzqv(zzcgVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcp
    public final Class<zzce> zzb() {
        return zzce.class;
    }
}
