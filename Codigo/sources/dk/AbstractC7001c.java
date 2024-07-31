package dk;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import pk.InterfaceC10201a;

/* renamed from: dk.c */
/* loaded from: classes3.dex */
public abstract class AbstractC7001c<E> extends AbstractC6997a<E> implements List<E> {

    /* renamed from: a */
    public static final a f15569a = new a(null);

    /* renamed from: dk.c$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final void m20327a(int i10, int i11, int i12) {
            if (i10 < 0 || i11 > i12) {
                throw new IndexOutOfBoundsException("startIndex: " + i10 + ", endIndex: " + i11 + ", size: " + i12);
            }
            if (i10 <= i11) {
                return;
            }
            throw new IllegalArgumentException("startIndex: " + i10 + " > endIndex: " + i11);
        }

        /* renamed from: b */
        public final void m20328b(int i10, int i11) {
            if (i10 < 0 || i10 >= i11) {
                throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + i11);
            }
        }

        /* renamed from: c */
        public final void m20329c(int i10, int i11) {
            if (i10 < 0 || i10 > i11) {
                throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + i11);
            }
        }

        /* renamed from: d */
        public final void m20330d(int i10, int i11, int i12) {
            if (i10 < 0 || i11 > i12) {
                throw new IndexOutOfBoundsException("fromIndex: " + i10 + ", toIndex: " + i11 + ", size: " + i12);
            }
            if (i10 <= i11) {
                return;
            }
            throw new IllegalArgumentException("fromIndex: " + i10 + " > toIndex: " + i11);
        }

        /* renamed from: e */
        public final boolean m20331e(Collection<?> c10, Collection<?> other) {
            C9322n.m27781e(c10, "c");
            C9322n.m27781e(other, "other");
            if (c10.size() != other.size()) {
                return false;
            }
            Iterator<?> it = other.iterator();
            Iterator<?> it2 = c10.iterator();
            while (it2.hasNext()) {
                if (!C9322n.m27777a(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: f */
        public final int m20332f(Collection<?> c10) {
            C9322n.m27781e(c10, "c");
            Iterator<?> it = c10.iterator();
            int i10 = 1;
            while (it.hasNext()) {
                Object next = it.next();
                i10 = (i10 * 31) + (next != null ? next.hashCode() : 0);
            }
            return i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dk.c$b */
    /* loaded from: classes3.dex */
    public class b implements Iterator<E>, InterfaceC10201a {

        /* renamed from: a */
        private int f15570a;

        public b() {
        }

        /* renamed from: a */
        protected final int m20333a() {
            return this.f15570a;
        }

        /* renamed from: c */
        protected final void m20334c(int i10) {
            this.f15570a = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f15570a < AbstractC7001c.this.size();
        }

        @Override // java.util.Iterator
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            AbstractC7001c<E> abstractC7001c = AbstractC7001c.this;
            int i10 = this.f15570a;
            this.f15570a = i10 + 1;
            return abstractC7001c.get(i10);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: dk.c$c */
    /* loaded from: classes3.dex */
    private class c extends AbstractC7001c<E>.b implements ListIterator<E> {
        public c(int i10) {
            super();
            AbstractC7001c.f15569a.m20329c(i10, AbstractC7001c.this.size());
            m20334c(i10);
        }

        @Override // java.util.ListIterator
        public void add(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return m20333a() > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return m20333a();
        }

        @Override // java.util.ListIterator
        public E previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            AbstractC7001c<E> abstractC7001c = AbstractC7001c.this;
            m20334c(m20333a() - 1);
            return abstractC7001c.get(m20333a());
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return m20333a() - 1;
        }

        @Override // java.util.ListIterator
        public void set(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: dk.c$d */
    /* loaded from: classes3.dex */
    private static final class d<E> extends AbstractC7001c<E> implements RandomAccess {

        /* renamed from: b */
        private final AbstractC7001c<E> f15573b;

        /* renamed from: c */
        private final int f15574c;

        /* renamed from: d */
        private int f15575d;

        /* JADX WARN: Multi-variable type inference failed */
        public d(AbstractC7001c<? extends E> list, int i10, int i11) {
            C9322n.m27781e(list, "list");
            this.f15573b = list;
            this.f15574c = i10;
            AbstractC7001c.f15569a.m20330d(i10, i11, list.size());
            this.f15575d = i11 - i10;
        }

        @Override // dk.AbstractC6997a
        /* renamed from: c */
        public int mo20314c() {
            return this.f15575d;
        }

        @Override // dk.AbstractC7001c, java.util.List
        public E get(int i10) {
            AbstractC7001c.f15569a.m20328b(i10, this.f15575d);
            return this.f15573b.get(this.f15574c + i10);
        }
    }

    @Override // java.util.List
    public void add(int i10, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return f15569a.m20331e(this, (Collection) obj);
        }
        return false;
    }

    @Override // java.util.List
    public abstract E get(int i10);

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return f15569a.m20332f(this);
    }

    @Override // java.util.List
    public int indexOf(E e10) {
        Iterator<E> it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (C9322n.m27777a(it.next(), e10)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new b();
    }

    @Override // java.util.List
    public int lastIndexOf(E e10) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (C9322n.m27777a(listIterator.previous(), e10)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return new c(0);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i10) {
        return new c(i10);
    }

    @Override // java.util.List
    public E remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public E set(int i10, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<E> subList(int i10, int i11) {
        return new d(this, i10, i11);
    }
}
