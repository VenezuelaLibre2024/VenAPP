package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import java.util.Iterator;
import java.util.List;
import ke.C9257b;
import p272oc.InterfaceC9831a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.auth.u2 */
/* loaded from: classes.dex */
public final class RunnableC6130u2 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ FirebaseAuth f13007a;

    /* renamed from: b */
    private final /* synthetic */ C9257b f13008b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC6130u2(FirebaseAuth firebaseAuth, C9257b c9257b) {
        this.f13007a = firebaseAuth;
        this.f13008b = c9257b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list;
        List list2;
        list = this.f13007a.f12822c;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC9831a) it.next()).m29503a(this.f13008b);
        }
        list2 = this.f13007a.f12821b;
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            ((FirebaseAuth.InterfaceC6041b) it2.next()).mo16426a(this.f13007a);
        }
    }
}
