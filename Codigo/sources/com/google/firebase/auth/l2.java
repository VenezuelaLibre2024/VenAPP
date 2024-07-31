package com.google.firebase.auth;

import com.google.firebase.auth.q0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class l2 extends q0.b {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ q0.b f11728a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f11729b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l2(FirebaseAuth firebaseAuth, q0.b bVar) {
        this.f11729b = firebaseAuth;
        this.f11728a = bVar;
    }

    @Override // com.google.firebase.auth.q0.b
    public final void onCodeAutoRetrievalTimeOut(String str) {
    }

    @Override // com.google.firebase.auth.q0.b
    public final void onCodeSent(String str, q0.a aVar) {
        oc.e eVar;
        q0.b bVar = this.f11728a;
        eVar = this.f11729b.f11611g;
        bVar.onVerificationCompleted(q0.a(str, (String) com.google.android.gms.common.internal.s.j(eVar.e())));
    }

    @Override // com.google.firebase.auth.q0.b
    public final void onVerificationCompleted(o0 o0Var) {
        this.f11728a.onVerificationCompleted(o0Var);
    }

    @Override // com.google.firebase.auth.q0.b
    public final void onVerificationFailed(zb.m mVar) {
        this.f11728a.onVerificationFailed(mVar);
    }
}
