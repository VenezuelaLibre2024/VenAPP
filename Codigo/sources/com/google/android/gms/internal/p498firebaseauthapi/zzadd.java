package com.google.android.gms.internal.p498firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.C6112q0;

/* loaded from: classes2.dex */
final class zzadd implements zzadf {
    private final /* synthetic */ Status zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzadd(zzacz zzaczVar, Status status) {
        this.zza = status;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadf
    public final void zza(C6112q0.b bVar, Object... objArr) {
        bVar.onVerificationFailed(zzacf.zza(this.zza));
    }
}
