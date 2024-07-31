package com.google.firebase.auth;

import com.google.android.gms.common.internal.C5276s;
import com.google.firebase.auth.C6112q0;
import p272oc.C9845e;
import p485zb.C12873m;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.auth.l2 */
/* loaded from: classes.dex */
public final class C6094l2 extends C6112q0.b {

    /* renamed from: a */
    private final /* synthetic */ C6112q0.b f12943a;

    /* renamed from: b */
    private final /* synthetic */ FirebaseAuth f12944b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6094l2(FirebaseAuth firebaseAuth, C6112q0.b bVar) {
        this.f12944b = firebaseAuth;
        this.f12943a = bVar;
    }

    @Override // com.google.firebase.auth.C6112q0.b
    public final void onCodeAutoRetrievalTimeOut(String str) {
    }

    @Override // com.google.firebase.auth.C6112q0.b
    public final void onCodeSent(String str, C6112q0.a aVar) {
        C9845e c9845e;
        C6112q0.b bVar = this.f12943a;
        c9845e = this.f12944b.f12826g;
        bVar.onVerificationCompleted(C6112q0.m16604a(str, (String) C5276s.m13324j(c9845e.m29524e())));
    }

    @Override // com.google.firebase.auth.C6112q0.b
    public final void onVerificationCompleted(C6104o0 c6104o0) {
        this.f12943a.onVerificationCompleted(c6104o0);
    }

    @Override // com.google.firebase.auth.C6112q0.b
    public final void onVerificationFailed(C12873m c12873m) {
        this.f12943a.onVerificationFailed(c12873m);
    }
}
