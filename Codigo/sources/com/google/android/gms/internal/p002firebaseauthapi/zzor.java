package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
public final class zzor implements zzov {
    private final zzxt zza;
    private final zzvb zzb;

    private zzor(zzvb zzvbVar, zzxt zzxtVar) {
        this.zzb = zzvbVar;
        this.zza = zzxtVar;
    }

    public static zzor zza(zzvb zzvbVar) {
        return new zzor(zzvbVar, zzpf.zza(zzvbVar.zzf()));
    }

    public static zzor zzb(zzvb zzvbVar) {
        return new zzor(zzvbVar, zzpf.zzb(zzvbVar.zzf()));
    }

    public final zzvb zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzov
    public final zzxt zzb() {
        return this.zza;
    }
}
