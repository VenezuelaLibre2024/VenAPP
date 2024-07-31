package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class g2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth.b f11690a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f11691b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g2(FirebaseAuth firebaseAuth, FirebaseAuth.b bVar) {
        this.f11691b = firebaseAuth;
        this.f11690a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11690a.a(this.f11691b);
    }
}
