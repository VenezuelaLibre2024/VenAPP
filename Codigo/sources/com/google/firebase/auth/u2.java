package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class u2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f11792a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ ke.b f11793b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u2(FirebaseAuth firebaseAuth, ke.b bVar) {
        this.f11792a = firebaseAuth;
        this.f11793b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list;
        List list2;
        list = this.f11792a.f11607c;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((oc.a) it.next()).a(this.f11793b);
        }
        list2 = this.f11792a.f11606b;
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            ((FirebaseAuth.b) it2.next()).a(this.f11792a);
        }
    }
}
