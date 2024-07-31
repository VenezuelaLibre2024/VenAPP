package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public class q1 extends AbstractList<String> implements g0, RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    private final g0 f11486a;

    /* loaded from: classes2.dex */
    class a implements ListIterator<String> {

        /* renamed from: a, reason: collision with root package name */
        ListIterator<String> f11487a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f11488b;

        a(int i10) {
            this.f11488b = i10;
            this.f11487a = q1.this.f11486a.listIterator(i10);
        }

        @Override // java.util.ListIterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f11487a.next();
        }

        @Override // java.util.ListIterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return this.f11487a.previous();
        }

        @Override // java.util.ListIterator
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f11487a.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f11487a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f11487a.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f11487a.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes2.dex */
    class b implements Iterator<String> {

        /* renamed from: a, reason: collision with root package name */
        Iterator<String> f11490a;

        b() {
            this.f11490a = q1.this.f11486a.iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f11490a.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f11490a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public q1(g0 g0Var) {
        this.f11486a = g0Var;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public String get(int i10) {
        return (String) this.f11486a.get(i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g0
    public List<?> e() {
        return this.f11486a.e();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g0
    public g0 i() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new b();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g0
    public Object j(int i10) {
        return this.f11486a.j(i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g0
    public void j1(h hVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i10) {
        return new a(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f11486a.size();
    }
}
