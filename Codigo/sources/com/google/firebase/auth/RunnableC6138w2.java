package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.auth.w2 */
/* loaded from: classes.dex */
public final class RunnableC6138w2 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ FirebaseAuth f13013a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC6138w2(FirebaseAuth firebaseAuth) {
        this.f13013a = firebaseAuth;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list;
        list = this.f13013a.f12823d;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((FirebaseAuth.InterfaceC6040a) it.next()).mo16425a(this.f13013a);
        }
    }
}
