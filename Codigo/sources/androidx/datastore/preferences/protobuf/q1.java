package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public class q1 extends AbstractList<String> implements g0, RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    private final g0 f4243a;

    /* loaded from: classes.dex */
    class a implements ListIterator<String> {

        /* renamed from: a, reason: collision with root package name */
        ListIterator<String> f4244a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f4245b;

        a(int i10) {
            this.f4245b = i10;
            this.f4244a = q1.this.f4243a.listIterator(i10);
        }

        @Override // java.util.ListIterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f4244a.next();
        }

        @Override // java.util.ListIterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return this.f4244a.previous();
        }

        @Override // java.util.ListIterator
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f4244a.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f4244a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f4244a.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f4244a.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes.dex */
    class b implements Iterator<String> {

        /* renamed from: a, reason: collision with root package name */
        Iterator<String> f4247a;

        b() {
            this.f4247a = q1.this.f4243a.iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f4247a.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f4247a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public q1(g0 g0Var) {
        this.f4243a = g0Var;
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    public void J0(h hVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public String get(int i10) {
        return (String) this.f4243a.get(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    public List<?> e() {
        return this.f4243a.e();
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    public g0 i() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new b();
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    public Object j(int i10) {
        return this.f4243a.j(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i10) {
        return new a(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f4243a.size();
    }
}
