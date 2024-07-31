package com.google.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public class q1 extends AbstractList<String> implements g0, RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    private final g0 f13309a;

    /* loaded from: classes2.dex */
    class a implements ListIterator<String> {

        /* renamed from: a, reason: collision with root package name */
        ListIterator<String> f13310a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f13311b;

        a(int i10) {
            this.f13311b = i10;
            this.f13310a = q1.this.f13309a.listIterator(i10);
        }

        @Override // java.util.ListIterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f13310a.next();
        }

        @Override // java.util.ListIterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return this.f13310a.previous();
        }

        @Override // java.util.ListIterator
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f13310a.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f13310a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f13310a.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f13310a.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes2.dex */
    class b implements Iterator<String> {

        /* renamed from: a, reason: collision with root package name */
        Iterator<String> f13313a;

        b() {
            this.f13313a = q1.this.f13309a.iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f13313a.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f13313a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public q1(g0 g0Var) {
        this.f13309a = g0Var;
    }

    @Override // com.google.protobuf.g0
    public void B(g gVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public String get(int i10) {
        return (String) this.f13309a.get(i10);
    }

    @Override // com.google.protobuf.g0
    public List<?> e() {
        return this.f13309a.e();
    }

    @Override // com.google.protobuf.g0
    public g0 i() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new b();
    }

    @Override // com.google.protobuf.g0
    public Object j(int i10) {
        return this.f13309a.j(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i10) {
        return new a(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f13309a.size();
    }
}
