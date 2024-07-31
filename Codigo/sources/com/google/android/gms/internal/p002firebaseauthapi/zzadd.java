package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.q0;

/* loaded from: classes2.dex */
final class zzadd implements zzadf {
    private final /* synthetic */ Status zza;

    public zzadd(zzacz zzaczVar, Status status) {
        this.zza = status;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zza(q0.b bVar, Object... objArr) {
        bVar.onVerificationFailed(zzacf.zza(this.zza));
    }
}
