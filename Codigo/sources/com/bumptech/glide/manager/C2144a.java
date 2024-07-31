package com.bumptech.glide.manager;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import p036c4.C1871l;

/* renamed from: com.bumptech.glide.manager.a */
/* loaded from: classes.dex */
class C2144a implements InterfaceC2155l {

    /* renamed from: a */
    private final Set<InterfaceC2156m> f8444a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    private boolean f8445b;

    /* renamed from: c */
    private boolean f8446c;

    @Override // com.bumptech.glide.manager.InterfaceC2155l
    /* renamed from: a */
    public void mo10797a(InterfaceC2156m interfaceC2156m) {
        this.f8444a.remove(interfaceC2156m);
    }

    @Override // com.bumptech.glide.manager.InterfaceC2155l
    /* renamed from: b */
    public void mo10798b(InterfaceC2156m interfaceC2156m) {
        this.f8444a.add(interfaceC2156m);
        if (this.f8446c) {
            interfaceC2156m.onDestroy();
        } else if (this.f8445b) {
            interfaceC2156m.onStart();
        } else {
            interfaceC2156m.onStop();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m10799c() {
        this.f8446c = true;
        Iterator it = C1871l.m9961j(this.f8444a).iterator();
        while (it.hasNext()) {
            ((InterfaceC2156m) it.next()).onDestroy();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m10800d() {
        this.f8445b = true;
        Iterator it = C1871l.m9961j(this.f8444a).iterator();
        while (it.hasNext()) {
            ((InterfaceC2156m) it.next()).onStart();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m10801e() {
        this.f8445b = false;
        Iterator it = C1871l.m9961j(this.f8444a).iterator();
        while (it.hasNext()) {
            ((InterfaceC2156m) it.next()).onStop();
        }
    }
}
