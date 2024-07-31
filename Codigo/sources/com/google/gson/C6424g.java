package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.gson.g */
/* loaded from: classes2.dex */
public final class C6424g extends AbstractC6494j implements Iterable<AbstractC6494j> {

    /* renamed from: a */
    private final List<AbstractC6494j> f14042a = new ArrayList();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof C6424g) && ((C6424g) obj).f14042a.equals(this.f14042a));
    }

    @Override // com.google.gson.AbstractC6494j
    /* renamed from: h */
    public long mo18058h() {
        if (this.f14042a.size() == 1) {
            return this.f14042a.get(0).mo18058h();
        }
        throw new IllegalStateException();
    }

    public int hashCode() {
        return this.f14042a.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<AbstractC6494j> iterator() {
        return this.f14042a.iterator();
    }

    @Override // com.google.gson.AbstractC6494j
    /* renamed from: k */
    public String mo18059k() {
        if (this.f14042a.size() == 1) {
            return this.f14042a.get(0).mo18059k();
        }
        throw new IllegalStateException();
    }

    /* renamed from: p */
    public void m18060p(AbstractC6494j abstractC6494j) {
        if (abstractC6494j == null) {
            abstractC6494j = C6496l.f14280a;
        }
        this.f14042a.add(abstractC6494j);
    }

    /* renamed from: q */
    public AbstractC6494j m18061q(int i10) {
        return this.f14042a.get(i10);
    }

    public int size() {
        return this.f14042a.size();
    }
}
