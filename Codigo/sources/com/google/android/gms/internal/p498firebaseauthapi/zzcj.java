package com.google.android.gms.internal.p498firebaseauthapi;

import com.google.android.gms.internal.p498firebaseauthapi.zzvg;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes2.dex */
public final class zzcj<P> {
    private final Class<P> zza;
    private ConcurrentMap<zzck, List<zzcl<P>>> zzb;
    private final List<zzcl<P>> zzc;
    private zzcl<P> zzd;
    private zzrn zze;

    private zzcj(Class<P> cls) {
        this.zzb = new ConcurrentHashMap();
        this.zzc = new ArrayList();
        this.zza = cls;
        this.zze = zzrn.zza;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.google.android.gms.internal.p498firebaseauthapi.zzcj<P> zza(P r13, P r14, com.google.android.gms.internal.firebase-auth-api.zzvg.zzb r15, boolean r16) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p498firebaseauthapi.zzcj.zza(java.lang.Object, java.lang.Object, com.google.android.gms.internal.firebase-auth-api.zzvg$zzb, boolean):com.google.android.gms.internal.firebase-auth-api.zzcj");
    }

    public final zzcg<P> zza() {
        ConcurrentMap<zzck, List<zzcl<P>>> concurrentMap = this.zzb;
        if (concurrentMap == null) {
            throw new IllegalStateException("build cannot be called twice");
        }
        zzcg<P> zzcgVar = new zzcg<>(concurrentMap, this.zzc, this.zzd, this.zze, this.zza);
        this.zzb = null;
        return zzcgVar;
    }

    public final zzcj<P> zza(zzrn zzrnVar) {
        if (this.zzb == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build");
        }
        this.zze = zzrnVar;
        return this;
    }

    public final zzcj<P> zza(P p10, P p11, zzvg.zzb zzbVar) {
        return zza(p10, p11, zzbVar, false);
    }

    public final zzcj<P> zzb(P p10, P p11, zzvg.zzb zzbVar) {
        return zza(p10, p11, zzbVar, true);
    }
}
