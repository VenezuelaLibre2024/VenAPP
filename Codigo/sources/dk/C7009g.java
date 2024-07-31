package dk;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.C9309b;
import kotlin.jvm.internal.C9314f;
import kotlin.jvm.internal.C9322n;
import pk.InterfaceC10201a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: dk.g */
/* loaded from: classes3.dex */
public final class C7009g<T> implements Collection<T>, InterfaceC10201a {

    /* renamed from: a */
    private final T[] f15578a;

    /* renamed from: b */
    private final boolean f15579b;

    public C7009g(T[] values, boolean z10) {
        C9322n.m27781e(values, "values");
        this.f15578a = values;
        this.f15579b = z10;
    }

    @Override // java.util.Collection
    public boolean add(T t10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: c */
    public int m20348c() {
        return this.f15578a.length;
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        boolean m20488p;
        m20488p = C7021m.m20488p(this.f15578a, obj);
        return m20488p;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        C9322n.m27781e(elements, "elements");
        Collection<? extends Object> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f15578a.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return C9309b.m27756a(this.f15578a);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return m20348c();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return C7029q.m20569b(this.f15578a, this.f15579b);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        C9322n.m27781e(array, "array");
        return (T[]) C9314f.m27774b(this, array);
    }
}
