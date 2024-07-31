package p088ek;

import dk.AbstractC7007f;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.C9322n;

/* renamed from: ek.f */
/* loaded from: classes3.dex */
public final class C7203f<E> extends AbstractC7007f<E> {

    /* renamed from: a */
    private final C7201d<E, ?> f16169a;

    public C7203f(C7201d<E, ?> backing) {
        C9322n.m27781e(backing, "backing");
        this.f16169a = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> elements) {
        C9322n.m27781e(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // dk.AbstractC7007f
    /* renamed from: c */
    public int mo20347c() {
        return this.f16169a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f16169a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f16169a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f16169a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return this.f16169a.m21508D();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.f16169a.m21510K(obj) >= 0;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<? extends Object> elements) {
        C9322n.m27781e(elements, "elements");
        this.f16169a.m21515l();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<? extends Object> elements) {
        C9322n.m27781e(elements, "elements");
        this.f16169a.m21515l();
        return super.retainAll(elements);
    }
}
