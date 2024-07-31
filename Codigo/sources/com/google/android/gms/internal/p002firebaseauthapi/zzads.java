package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.o0;
import com.google.firebase.auth.q0;
import zb.m;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzads extends q0.b {
    private final /* synthetic */ q0.b zza;
    private final /* synthetic */ String zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzads(q0.b bVar, String str) {
        this.zza = bVar;
        this.zzb = str;
    }

    @Override // com.google.firebase.auth.q0.b
    public final void onCodeAutoRetrievalTimeOut(String str) {
        zzadt.zza.remove(this.zzb);
        this.zza.onCodeAutoRetrievalTimeOut(str);
    }

    @Override // com.google.firebase.auth.q0.b
    public final void onCodeSent(String str, q0.a aVar) {
        this.zza.onCodeSent(str, aVar);
    }

    @Override // com.google.firebase.auth.q0.b
    public final void onVerificationCompleted(o0 o0Var) {
        zzadt.zza.remove(this.zzb);
        this.zza.onVerificationCompleted(o0Var);
    }

    @Override // com.google.firebase.auth.q0.b
    public final void onVerificationFailed(m mVar) {
        zzadt.zza.remove(this.zzb);
        this.zza.onVerificationFailed(mVar);
    }
}
