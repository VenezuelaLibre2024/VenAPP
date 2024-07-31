package ek;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.n;

/* loaded from: classes3.dex */
public final class e<K, V> extends a<Map.Entry<K, V>, K, V> {

    /* renamed from: a */
    private final d<K, V> f14745a;

    public e(d<K, V> backing) {
        n.e(backing, "backing");
        this.f14745a = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends Map.Entry<K, V>> elements) {
        n.e(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // dk.f
    public int c() {
        return this.f14745a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f14745a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<? extends Object> elements) {
        n.e(elements, "elements");
        return this.f14745a.n(elements);
    }

    @Override // ek.a
    public boolean f(Map.Entry<? extends K, ? extends V> element) {
        n.e(element, "element");
        return this.f14745a.o(element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f14745a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<K, V>> iterator() {
        return this.f14745a.s();
    }

    @Override // ek.a
    public boolean k(Map.Entry element) {
        n.e(element, "element");
        return this.f14745a.I(element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: l */
    public boolean add(Map.Entry<K, V> element) {
        n.e(element, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<? extends Object> elements) {
        n.e(elements, "elements");
        this.f14745a.l();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<? extends Object> elements) {
        n.e(elements, "elements");
        this.f14745a.l();
        return super.retainAll(elements);
    }
}
