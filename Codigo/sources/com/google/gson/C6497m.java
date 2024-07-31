package com.google.gson;

import com.google.gson.internal.C6484g;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.gson.m */
/* loaded from: classes2.dex */
public final class C6497m extends AbstractC6494j {

    /* renamed from: a */
    private final C6484g<String, AbstractC6494j> f14281a = new C6484g<>();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof C6497m) && ((C6497m) obj).f14281a.equals(this.f14281a));
    }

    public int hashCode() {
        return this.f14281a.hashCode();
    }

    /* renamed from: p */
    public void m18283p(String str, AbstractC6494j abstractC6494j) {
        C6484g<String, AbstractC6494j> c6484g = this.f14281a;
        if (abstractC6494j == null) {
            abstractC6494j = C6496l.f14280a;
        }
        c6484g.put(str, abstractC6494j);
    }

    /* renamed from: q */
    public Set<Map.Entry<String, AbstractC6494j>> m18284q() {
        return this.f14281a.entrySet();
    }

    /* renamed from: r */
    public AbstractC6494j m18285r(String str) {
        return this.f14281a.get(str);
    }

    /* renamed from: s */
    public boolean m18286s(String str) {
        return this.f14281a.containsKey(str);
    }

    /* renamed from: t */
    public AbstractC6494j m18287t(String str) {
        return this.f14281a.remove(str);
    }
}
