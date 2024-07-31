package com.google.android.gms.internal.p498firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzpy implements zzcp<zzpz, zzpz> {
    private static final zzpy zza = new zzpy();

    private zzpy() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzc() {
        zzct.zza(zza);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzcp
    public final Class<zzpz> zza() {
        return zzpz.class;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzcp
    public final /* synthetic */ zzpz zza(zzcg<zzpz> zzcgVar) {
        if (zzcgVar == null) {
            throw new GeneralSecurityException("primitive set must be non-null");
        }
        if (zzcgVar.zza() == null) {
            throw new GeneralSecurityException("no primary in primitive set");
        }
        Iterator<List<zzcl<zzpz>>> it = zzcgVar.zzd().iterator();
        while (it.hasNext()) {
            Iterator<zzcl<zzpz>> it2 = it.next().iterator();
            while (it2.hasNext()) {
                it2.next().zze();
            }
        }
        return new zzqb(zzcgVar);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzcp
    public final Class<zzpz> zzb() {
        return zzpz.class;
    }
}
