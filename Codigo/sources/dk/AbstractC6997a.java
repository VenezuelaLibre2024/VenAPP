package dk;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9323o;
import kotlin.jvm.internal.C9314f;
import kotlin.jvm.internal.C9322n;
import p280ok.InterfaceC9998l;
import pk.InterfaceC10201a;

/* renamed from: dk.a */
/* loaded from: classes3.dex */
public abstract class AbstractC6997a<E> implements Collection<E>, InterfaceC10201a {

    /* renamed from: dk.a$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC9323o implements InterfaceC9998l<E, CharSequence> {

        /* renamed from: a */
        final /* synthetic */ AbstractC6997a<E> f15563a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(AbstractC6997a<? extends E> abstractC6997a) {
            super(1);
            this.f15563a = abstractC6997a;
        }

        @Override // p280ok.InterfaceC9998l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(E e10) {
            return e10 == this.f15563a ? "(this Collection)" : String.valueOf(e10);
        }
    }

    @Override // java.util.Collection
    public boolean add(E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: c */
    public abstract int mo20314c();

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(E e10) {
        if (isEmpty()) {
            return false;
        }
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (C9322n.m27777a(it.next(), e10)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
        return size() == 0;
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
        return mo20314c();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return C9314f.m27773a(this);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        C9322n.m27781e(array, "array");
        return (T[]) C9314f.m27774b(this, array);
    }

    public String toString() {
        String m20611M;
        m20611M = C7042z.m20611M(this, ", ", "[", "]", 0, null, new a(this), 24, null);
        return m20611M;
    }
}
