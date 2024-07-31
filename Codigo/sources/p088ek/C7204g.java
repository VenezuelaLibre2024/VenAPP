package p088ek;

import dk.AbstractC7003d;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.C9322n;

/* renamed from: ek.g */
/* loaded from: classes3.dex */
public final class C7204g<V> extends AbstractC7003d<V> {

    /* renamed from: a */
    private final C7201d<?, V> f16170a;

    public C7204g(C7201d<?, V> backing) {
        C9322n.m27781e(backing, "backing");
        this.f16170a = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection<? extends V> elements) {
        C9322n.m27781e(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // dk.AbstractC7003d
    /* renamed from: c */
    public int mo20342c() {
        return this.f16170a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f16170a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f16170a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f16170a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<V> iterator() {
        return this.f16170a.m21512O();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        return this.f16170a.m21511M(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection<? extends Object> elements) {
        C9322n.m27781e(elements, "elements");
        this.f16170a.m21515l();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection<? extends Object> elements) {
        C9322n.m27781e(elements, "elements");
        this.f16170a.m21515l();
        return super.retainAll(elements);
    }
}
