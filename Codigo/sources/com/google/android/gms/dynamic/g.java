package com.google.android.gms.dynamic;

import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class g implements e {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ a f9711a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(a aVar) {
        this.f9711a = aVar;
    }

    @Override // com.google.android.gms.dynamic.e
    public final void a(c cVar) {
        LinkedList linkedList;
        LinkedList linkedList2;
        c cVar2;
        this.f9711a.f9706a = cVar;
        linkedList = this.f9711a.f9708c;
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            l lVar = (l) it.next();
            cVar2 = this.f9711a.f9706a;
            lVar.b(cVar2);
        }
        linkedList2 = this.f9711a.f9708c;
        linkedList2.clear();
        this.f9711a.f9707b = null;
    }
}
