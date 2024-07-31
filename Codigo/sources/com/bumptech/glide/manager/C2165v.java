package com.bumptech.glide.manager;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import p036c4.C1871l;
import p478z3.InterfaceC12798d;

/* renamed from: com.bumptech.glide.manager.v */
/* loaded from: classes.dex */
public final class C2165v implements InterfaceC2156m {

    /* renamed from: a */
    private final Set<InterfaceC12798d<?>> f8497a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: c */
    public void m10866c() {
        this.f8497a.clear();
    }

    /* renamed from: d */
    public List<InterfaceC12798d<?>> m10867d() {
        return C1871l.m9961j(this.f8497a);
    }

    /* renamed from: k */
    public void m10868k(InterfaceC12798d<?> interfaceC12798d) {
        this.f8497a.add(interfaceC12798d);
    }

    /* renamed from: l */
    public void m10869l(InterfaceC12798d<?> interfaceC12798d) {
        this.f8497a.remove(interfaceC12798d);
    }

    @Override // com.bumptech.glide.manager.InterfaceC2156m
    public void onDestroy() {
        Iterator it = C1871l.m9961j(this.f8497a).iterator();
        while (it.hasNext()) {
            ((InterfaceC12798d) it.next()).onDestroy();
        }
    }

    @Override // com.bumptech.glide.manager.InterfaceC2156m
    public void onStart() {
        Iterator it = C1871l.m9961j(this.f8497a).iterator();
        while (it.hasNext()) {
            ((InterfaceC12798d) it.next()).onStart();
        }
    }

    @Override // com.bumptech.glide.manager.InterfaceC2156m
    public void onStop() {
        Iterator it = C1871l.m9961j(this.f8497a).iterator();
        while (it.hasNext()) {
            ((InterfaceC12798d) it.next()).onStop();
        }
    }
}
