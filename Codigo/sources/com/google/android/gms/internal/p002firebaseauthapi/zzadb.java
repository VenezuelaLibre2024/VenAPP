package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.o0;
import com.google.firebase.auth.q0;

/* loaded from: classes2.dex */
final class zzadb implements zzadf {
    private final /* synthetic */ o0 zza;

    public zzadb(zzacz zzaczVar, o0 o0Var) {
        this.zza = o0Var;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zza(q0.b bVar, Object... objArr) {
        bVar.onVerificationCompleted(this.zza);
    }
}
