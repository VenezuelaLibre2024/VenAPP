package ek;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.n;

/* loaded from: classes3.dex */
public final class j<E> extends dk.f<E> implements Serializable {

    /* renamed from: b */
    private static final a f14753b = new a(null);

    /* renamed from: c */
    private static final j f14754c = new j(d.f14726x.e());

    /* renamed from: a */
    private final d<E, ?> f14755a;

    /* loaded from: classes3.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public j() {
        this(new d());
    }

    public j(int i10) {
        this(new d(i10));
    }

    public j(d<E, ?> backing) {
        n.e(backing, "backing");
        this.f14755a = backing;
    }

    private final Object writeReplace() {
        if (this.f14755a.C()) {
            return new h(this, 1);
        }
        throw new NotSerializableException("The set cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e10) {
        return this.f14755a.i(e10) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> elements) {
        n.e(elements, "elements");
        this.f14755a.l();
        return super.addAll(elements);
    }

    @Override // dk.f
    public int c() {
        return this.f14755a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f14755a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f14755a.containsKey(obj);
    }

    public final Set<E> d() {
        this.f14755a.k();
        return size() > 0 ? this : f14754c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f14755a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return this.f14755a.D();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.f14755a.K(obj) >= 0;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<? extends Object> elements) {
        n.e(elements, "elements");
        this.f14755a.l();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<? extends Object> elements) {
        n.e(elements, "elements");
        this.f14755a.l();
        return super.retainAll(elements);
    }
}
