package com.google.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.q1 */
/* loaded from: classes2.dex */
public class C6612q1 extends AbstractList<String> implements InterfaceC6581g0, RandomAccess {

    /* renamed from: a */
    private final InterfaceC6581g0 f14583a;

    /* renamed from: com.google.protobuf.q1$a */
    /* loaded from: classes2.dex */
    class a implements ListIterator<String> {

        /* renamed from: a */
        ListIterator<String> f14584a;

        /* renamed from: b */
        final /* synthetic */ int f14585b;

        a(int i10) {
            this.f14585b = i10;
            this.f14584a = C6612q1.this.f14583a.listIterator(i10);
        }

        @Override // java.util.ListIterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f14584a.next();
        }

        @Override // java.util.ListIterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return this.f14584a.previous();
        }

        @Override // java.util.ListIterator
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f14584a.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f14584a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f14584a.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f14584a.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.google.protobuf.q1$b */
    /* loaded from: classes2.dex */
    class b implements Iterator<String> {

        /* renamed from: a */
        Iterator<String> f14587a;

        b() {
            this.f14587a = C6612q1.this.f14583a.iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f14587a.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f14587a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C6612q1(InterfaceC6581g0 interfaceC6581g0) {
        this.f14583a = interfaceC6581g0;
    }

    @Override // com.google.protobuf.InterfaceC6581g0
    /* renamed from: B */
    public void mo18456B(AbstractC6580g abstractC6580g) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public String get(int i10) {
        return (String) this.f14583a.get(i10);
    }

    @Override // com.google.protobuf.InterfaceC6581g0
    /* renamed from: e */
    public List<?> mo18458e() {
        return this.f14583a.mo18458e();
    }

    @Override // com.google.protobuf.InterfaceC6581g0
    /* renamed from: i */
    public InterfaceC6581g0 mo18460i() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new b();
    }

    @Override // com.google.protobuf.InterfaceC6581g0
    /* renamed from: j */
    public Object mo18461j(int i10) {
        return this.f14583a.mo18461j(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i10) {
        return new a(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f14583a.size();
    }
}
