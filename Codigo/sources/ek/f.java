package ek;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.n;

/* loaded from: classes3.dex */
public final class f<E> extends dk.f<E> {

    /* renamed from: a */
    private final d<E, ?> f14746a;

    public f(d<E, ?> backing) {
        n.e(backing, "backing");
        this.f14746a = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> elements) {
        n.e(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // dk.f
    public int c() {
        return this.f14746a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f14746a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f14746a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f14746a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return this.f14746a.D();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.f14746a.K(obj) >= 0;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<? extends Object> elements) {
        n.e(elements, "elements");
        this.f14746a.l();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<? extends Object> elements) {
        n.e(elements, "elements");
        this.f14746a.l();
        return super.retainAll(elements);
    }
}
