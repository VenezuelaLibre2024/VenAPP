package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class g extends j implements Iterable<j> {

    /* renamed from: a */
    private final List<j> f12800a = new ArrayList();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof g) && ((g) obj).f12800a.equals(this.f12800a));
    }

    @Override // com.google.gson.j
    public long h() {
        if (this.f12800a.size() == 1) {
            return this.f12800a.get(0).h();
        }
        throw new IllegalStateException();
    }

    public int hashCode() {
        return this.f12800a.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<j> iterator() {
        return this.f12800a.iterator();
    }

    @Override // com.google.gson.j
    public String k() {
        if (this.f12800a.size() == 1) {
            return this.f12800a.get(0).k();
        }
        throw new IllegalStateException();
    }

    public void p(j jVar) {
        if (jVar == null) {
            jVar = l.f13006a;
        }
        this.f12800a.add(jVar);
    }

    public j q(int i10) {
        return this.f12800a.get(i10);
    }

    public int size() {
        return this.f12800a.size();
    }
}
