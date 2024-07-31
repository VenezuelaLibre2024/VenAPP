package com.google.android.gms.internal.p498firebaseauthapi;

import com.google.firebase.auth.C6104o0;
import com.google.firebase.auth.C6112q0;
import p485zb.C12873m;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzads extends C6112q0.b {
    private final /* synthetic */ C6112q0.b zza;
    private final /* synthetic */ String zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzads(C6112q0.b bVar, String str) {
        this.zza = bVar;
        this.zzb = str;
    }

    @Override // com.google.firebase.auth.C6112q0.b
    public final void onCodeAutoRetrievalTimeOut(String str) {
        zzadt.zza.remove(this.zzb);
        this.zza.onCodeAutoRetrievalTimeOut(str);
    }

    @Override // com.google.firebase.auth.C6112q0.b
    public final void onCodeSent(String str, C6112q0.a aVar) {
        this.zza.onCodeSent(str, aVar);
    }

    @Override // com.google.firebase.auth.C6112q0.b
    public final void onVerificationCompleted(C6104o0 c6104o0) {
        zzadt.zza.remove(this.zzb);
        this.zza.onVerificationCompleted(c6104o0);
    }

    @Override // com.google.firebase.auth.C6112q0.b
    public final void onVerificationFailed(C12873m c12873m) {
        zzadt.zza.remove(this.zzb);
        this.zza.onVerificationFailed(c12873m);
    }
}
