package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class w2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f11798a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w2(FirebaseAuth firebaseAuth) {
        this.f11798a = firebaseAuth;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list;
        list = this.f11798a.f11608d;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((FirebaseAuth.a) it.next()).a(this.f11798a);
        }
    }
}
