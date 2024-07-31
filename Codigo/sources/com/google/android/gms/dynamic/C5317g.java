package com.google.android.gms.dynamic;

import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.dynamic.g */
/* loaded from: classes.dex */
public final class C5317g implements InterfaceC5315e {

    /* renamed from: a */
    final /* synthetic */ AbstractC5311a f10826a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5317g(AbstractC5311a abstractC5311a) {
        this.f10826a = abstractC5311a;
    }

    @Override // com.google.android.gms.dynamic.InterfaceC5315e
    /* renamed from: a */
    public final void mo13413a(InterfaceC5313c interfaceC5313c) {
        LinkedList linkedList;
        LinkedList linkedList2;
        InterfaceC5313c interfaceC5313c2;
        this.f10826a.f10821a = interfaceC5313c;
        linkedList = this.f10826a.f10823c;
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            InterfaceC5322l interfaceC5322l = (InterfaceC5322l) it.next();
            interfaceC5313c2 = this.f10826a.f10821a;
            interfaceC5322l.mo13415b(interfaceC5313c2);
        }
        linkedList2 = this.f10826a.f10823c;
        linkedList2.clear();
        this.f10826a.f10822b = null;
    }
}
