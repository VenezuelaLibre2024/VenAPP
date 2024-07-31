package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.q1 */
/* loaded from: classes.dex */
public class C1196q1 extends AbstractList<String> implements InterfaceC1165g0, RandomAccess {

    /* renamed from: a */
    private final InterfaceC1165g0 f4954a;

    /* renamed from: androidx.datastore.preferences.protobuf.q1$a */
    /* loaded from: classes.dex */
    class a implements ListIterator<String> {

        /* renamed from: a */
        ListIterator<String> f4955a;

        /* renamed from: b */
        final /* synthetic */ int f4956b;

        a(int i10) {
            this.f4956b = i10;
            this.f4955a = C1196q1.this.f4954a.listIterator(i10);
        }

        @Override // java.util.ListIterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f4955a.next();
        }

        @Override // java.util.ListIterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return this.f4955a.previous();
        }

        @Override // java.util.ListIterator
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f4955a.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f4955a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f4955a.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f4955a.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.q1$b */
    /* loaded from: classes.dex */
    class b implements Iterator<String> {

        /* renamed from: a */
        Iterator<String> f4958a;

        b() {
            this.f4958a = C1196q1.this.f4954a.iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f4958a.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f4958a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C1196q1(InterfaceC1165g0 interfaceC1165g0) {
        this.f4954a = interfaceC1165g0;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1165g0
    /* renamed from: J0 */
    public void mo5782J0(AbstractC1167h abstractC1167h) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public String get(int i10) {
        return (String) this.f4954a.get(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1165g0
    /* renamed from: e */
    public List<?> mo5784e() {
        return this.f4954a.mo5784e();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1165g0
    /* renamed from: i */
    public InterfaceC1165g0 mo5786i() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new b();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1165g0
    /* renamed from: j */
    public Object mo5787j(int i10) {
        return this.f4954a.mo5787j(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i10) {
        return new a(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f4954a.size();
    }
}
