package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.auth.t2 */
/* loaded from: classes.dex */
public final class RunnableC6126t2 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ FirebaseAuth.InterfaceC6040a f13003a;

    /* renamed from: b */
    private final /* synthetic */ FirebaseAuth f13004b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC6126t2(FirebaseAuth firebaseAuth, FirebaseAuth.InterfaceC6040a interfaceC6040a) {
        this.f13004b = firebaseAuth;
        this.f13003a = interfaceC6040a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13003a.mo16425a(this.f13004b);
    }
}
