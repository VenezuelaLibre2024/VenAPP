package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class t2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth.a f11788a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f11789b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t2(FirebaseAuth firebaseAuth, FirebaseAuth.a aVar) {
        this.f11789b = firebaseAuth;
        this.f11788a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11788a.a(this.f11789b);
    }
}
