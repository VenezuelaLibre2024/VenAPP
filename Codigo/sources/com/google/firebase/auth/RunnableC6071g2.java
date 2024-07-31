package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.auth.g2 */
/* loaded from: classes.dex */
public final class RunnableC6071g2 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ FirebaseAuth.InterfaceC6041b f12905a;

    /* renamed from: b */
    private final /* synthetic */ FirebaseAuth f12906b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC6071g2(FirebaseAuth firebaseAuth, FirebaseAuth.InterfaceC6041b interfaceC6041b) {
        this.f12906b = firebaseAuth;
        this.f12905a = interfaceC6041b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12905a.mo16426a(this.f12906b);
    }
}
