package com.google.android.gms.internal.p002firebaseauthapi;

import oc.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzzl implements zzadk<zzagj> {
    private final /* synthetic */ zzagg zza;
    private final /* synthetic */ zzacd zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzzl(zzyj zzyjVar, zzagg zzaggVar, zzacd zzacdVar) {
        this.zza = zzaggVar;
        this.zzb = zzacdVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadk
    public final /* synthetic */ void zza(zzagj zzagjVar) {
        zzagj zzagjVar2 = zzagjVar;
        zzagg zzaggVar = this.zza;
        if (zzaggVar instanceof zzagk) {
            this.zzb.zzb(zzagjVar2.zza());
            return;
        }
        if (zzaggVar instanceof zzagm) {
            this.zzb.zza(zzagjVar2);
            return;
        }
        throw new IllegalArgumentException("startMfaEnrollmentRequest must be an instance of either StartPhoneMfaEnrollmentRequest or StartTotpMfaEnrollmentRequest but was " + this.zza.getClass().getName() + ".");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadl
    public final void zza(String str) {
        this.zzb.zza(q.a(str));
    }
}
