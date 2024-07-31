package ek;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.n;

/* loaded from: classes3.dex */
public final class g<V> extends dk.d<V> {

    /* renamed from: a, reason: collision with root package name */
    private final d<?, V> f14747a;

    public g(d<?, V> backing) {
        n.e(backing, "backing");
        this.f14747a = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection<? extends V> elements) {
        n.e(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // dk.d
    public int c() {
        return this.f14747a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f14747a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f14747a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f14747a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<V> iterator() {
        return this.f14747a.O();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        return this.f14747a.M(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection<? extends Object> elements) {
        n.e(elements, "elements");
        this.f14747a.l();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection<? extends Object> elements) {
        n.e(elements, "elements");
        this.f14747a.l();
        return super.retainAll(elements);
    }
}
