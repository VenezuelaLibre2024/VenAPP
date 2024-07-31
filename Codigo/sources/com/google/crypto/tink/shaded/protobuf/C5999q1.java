package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.crypto.tink.shaded.protobuf.q1 */
/* loaded from: classes2.dex */
public class C5999q1 extends AbstractList<String> implements InterfaceC5968g0, RandomAccess {

    /* renamed from: a */
    private final InterfaceC5968g0 f12701a;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.q1$a */
    /* loaded from: classes2.dex */
    class a implements ListIterator<String> {

        /* renamed from: a */
        ListIterator<String> f12702a;

        /* renamed from: b */
        final /* synthetic */ int f12703b;

        a(int i10) {
            this.f12703b = i10;
            this.f12702a = C5999q1.this.f12701a.listIterator(i10);
        }

        @Override // java.util.ListIterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f12702a.next();
        }

        @Override // java.util.ListIterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return this.f12702a.previous();
        }

        @Override // java.util.ListIterator
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f12702a.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f12702a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f12702a.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f12702a.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.q1$b */
    /* loaded from: classes2.dex */
    class b implements Iterator<String> {

        /* renamed from: a */
        Iterator<String> f12705a;

        b() {
            this.f12705a = C5999q1.this.f12701a.iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f12705a.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f12705a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C5999q1(InterfaceC5968g0 interfaceC5968g0) {
        this.f12701a = interfaceC5968g0;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public String get(int i10) {
        return (String) this.f12701a.get(i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5968g0
    /* renamed from: e */
    public List<?> mo15419e() {
        return this.f12701a.mo15419e();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5968g0
    /* renamed from: i */
    public InterfaceC5968g0 mo15421i() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new b();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5968g0
    /* renamed from: j */
    public Object mo15422j(int i10) {
        return this.f12701a.mo15422j(i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5968g0
    /* renamed from: j1 */
    public void mo15423j1(AbstractC5970h abstractC5970h) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i10) {
        return new a(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f12701a.size();
    }
}
