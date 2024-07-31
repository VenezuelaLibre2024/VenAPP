package com.google.common.collect;

import com.google.common.collect.a0;
import com.google.common.collect.c0;
import com.google.common.collect.y;
import com.google.common.collect.z;
import com.google.common.collect.z0;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;

/* loaded from: classes2.dex */
public class b0<K, V> extends z<K, V> implements a1<K, V> {
    private static final long serialVersionUID = 0;

    /* renamed from: r, reason: collision with root package name */
    private final transient a0<V> f11039r;

    /* renamed from: s, reason: collision with root package name */
    private transient a0<Map.Entry<K, V>> f11040s;

    /* loaded from: classes2.dex */
    public static final class a<K, V> extends z.c<K, V> {
        @Override // com.google.common.collect.z.c
        Collection<V> b() {
            return s0.d();
        }

        public b0<K, V> d() {
            Collection entrySet = this.f11217a.entrySet();
            Comparator<? super K> comparator = this.f11218b;
            if (comparator != null) {
                entrySet = r0.a(comparator).d().b(entrySet);
            }
            return b0.v(entrySet, this.f11219c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class b<K, V> extends a0<Map.Entry<K, V>> {

        /* renamed from: c, reason: collision with root package name */
        private final transient b0<K, V> f11041c;

        b(b0<K, V> b0Var) {
            this.f11041c = b0Var;
        }

        @Override // com.google.common.collect.u, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f11041c.c(entry.getKey(), entry.getValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.u
        public boolean l() {
            return false;
        }

        @Override // com.google.common.collect.a0, com.google.common.collect.u, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: m */
        public h1<Map.Entry<K, V>> iterator() {
            return this.f11041c.i();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f11041c.size();
        }
    }

    /* loaded from: classes2.dex */
    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        static final z0.b<b0> f11042a = z0.a(b0.class, "emptySet");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b0(y<K, a0<V>> yVar, int i10, Comparator<? super V> comparator) {
        super(yVar, i10);
        this.f11039r = t(comparator);
    }

    private static <V> a0.a<V> A(Comparator<? super V> comparator) {
        return comparator == null ? new a0.a<>() : new c0.a(comparator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        int readInt = objectInputStream.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException("Invalid key count " + readInt);
        }
        y.a a10 = y.a();
        int i10 = 0;
        for (int i11 = 0; i11 < readInt; i11++) {
            Object readObject = objectInputStream.readObject();
            int readInt2 = objectInputStream.readInt();
            if (readInt2 <= 0) {
                throw new InvalidObjectException("Invalid value count " + readInt2);
            }
            a0.a A = A(comparator);
            for (int i12 = 0; i12 < readInt2; i12++) {
                A.a(objectInputStream.readObject());
            }
            a0 k10 = A.k();
            if (k10.size() != readInt2) {
                throw new InvalidObjectException("Duplicate key-value pairs exist for key " + readObject);
            }
            a10.f(readObject, k10);
            i10 += readInt2;
        }
        try {
            z.e.f11221a.b(this, a10.c());
            z.e.f11222b.a(this, i10);
            c.f11042a.b(this, t(comparator));
        } catch (IllegalArgumentException e10) {
            throw ((InvalidObjectException) new InvalidObjectException(e10.getMessage()).initCause(e10));
        }
    }

    private static <V> a0<V> t(Comparator<? super V> comparator) {
        return comparator == null ? a0.v() : c0.J(comparator);
    }

    static <K, V> b0<K, V> v(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> collection, Comparator<? super V> comparator) {
        if (collection.isEmpty()) {
            return x();
        }
        y.a aVar = new y.a(collection.size());
        int i10 = 0;
        for (Map.Entry<? extends K, ? extends Collection<? extends V>> entry : collection) {
            K key = entry.getKey();
            a0 z10 = z(comparator, entry.getValue());
            if (!z10.isEmpty()) {
                aVar.f(key, z10);
                i10 += z10.size();
            }
        }
        return new b0<>(aVar.c(), i10, comparator);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(y());
        z0.b(this, objectOutputStream);
    }

    public static <K, V> b0<K, V> x() {
        return q.f11152t;
    }

    private static <V> a0<V> z(Comparator<? super V> comparator, Collection<? extends V> collection) {
        return comparator == null ? a0.r(collection) : c0.F(comparator, collection);
    }

    @Override // com.google.common.collect.z
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public a0<Map.Entry<K, V>> a() {
        a0<Map.Entry<K, V>> a0Var = this.f11040s;
        if (a0Var != null) {
            return a0Var;
        }
        b bVar = new b(this);
        this.f11040s = bVar;
        return bVar;
    }

    @Override // com.google.common.collect.z
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public a0<V> p(K k10) {
        return (a0) eb.i.a((a0) this.f11208e.get(k10), this.f11039r);
    }

    Comparator<? super V> y() {
        a0<V> a0Var = this.f11039r;
        if (a0Var instanceof c0) {
            return ((c0) a0Var).comparator();
        }
        return null;
    }
}
