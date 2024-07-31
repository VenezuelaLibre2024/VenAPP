package com.google.gson;

import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class m extends j {

    /* renamed from: a */
    private final com.google.gson.internal.g<String, j> f13007a = new com.google.gson.internal.g<>();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof m) && ((m) obj).f13007a.equals(this.f13007a));
    }

    public int hashCode() {
        return this.f13007a.hashCode();
    }

    public void p(String str, j jVar) {
        com.google.gson.internal.g<String, j> gVar = this.f13007a;
        if (jVar == null) {
            jVar = l.f13006a;
        }
        gVar.put(str, jVar);
    }

    public Set<Map.Entry<String, j>> q() {
        return this.f13007a.entrySet();
    }

    public j r(String str) {
        return this.f13007a.get(str);
    }

    public boolean s(String str) {
        return this.f13007a.containsKey(str);
    }

    public j t(String str) {
        return this.f13007a.remove(str);
    }
}
