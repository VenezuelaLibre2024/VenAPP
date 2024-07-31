package com.google.firebase.analytics.connector.internal;

import cc.InterfaceC1940a;
import com.google.android.gms.common.internal.C5276s;
import java.util.HashSet;
import java.util.Set;
import va.C11784a;

/* renamed from: com.google.firebase.analytics.connector.internal.e */
/* loaded from: classes.dex */
public final class C6036e implements InterfaceC6032a {

    /* renamed from: a */
    Set<String> f12811a;

    /* renamed from: b */
    private InterfaceC1940a.b f12812b;

    /* renamed from: c */
    private C11784a f12813c;

    /* renamed from: d */
    private C6035d f12814d;

    public C6036e(C11784a c11784a, InterfaceC1940a.b bVar) {
        this.f12812b = bVar;
        this.f12813c = c11784a;
        C6035d c6035d = new C6035d(this);
        this.f12814d = c6035d;
        this.f12813c.m37267q(c6035d);
        this.f12811a = new HashSet();
    }

    @Override // com.google.firebase.analytics.connector.internal.InterfaceC6032a
    /* renamed from: a */
    public final void mo16314a(Set<String> set) {
        this.f12811a.clear();
        Set<String> set2 = this.f12811a;
        HashSet hashSet = new HashSet();
        for (String str : set) {
            if (hashSet.size() >= 50) {
                break;
            }
            if (C6033b.m16324j(str) && C6033b.m16325k(str)) {
                String m16321g = C6033b.m16321g(str);
                C5276s.m13324j(m16321g);
                hashSet.add(m16321g);
            }
        }
        set2.addAll(hashSet);
    }
}
