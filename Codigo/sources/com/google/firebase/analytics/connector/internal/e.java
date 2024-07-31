package com.google.firebase.analytics.connector.internal;

import cc.a;
import com.google.android.gms.common.internal.s;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class e implements a {

    /* renamed from: a, reason: collision with root package name */
    Set<String> f11596a;

    /* renamed from: b, reason: collision with root package name */
    private a.b f11597b;

    /* renamed from: c, reason: collision with root package name */
    private va.a f11598c;

    /* renamed from: d, reason: collision with root package name */
    private d f11599d;

    public e(va.a aVar, a.b bVar) {
        this.f11597b = bVar;
        this.f11598c = aVar;
        d dVar = new d(this);
        this.f11599d = dVar;
        this.f11598c.q(dVar);
        this.f11596a = new HashSet();
    }

    @Override // com.google.firebase.analytics.connector.internal.a
    public final void a(Set<String> set) {
        this.f11596a.clear();
        Set<String> set2 = this.f11596a;
        HashSet hashSet = new HashSet();
        for (String str : set) {
            if (hashSet.size() >= 50) {
                break;
            }
            if (b.j(str) && b.k(str)) {
                String g10 = b.g(str);
                s.j(g10);
                hashSet.add(g10);
            }
        }
        set2.addAll(hashSet);
    }
}
