package com.google.common.collect;

import com.google.common.collect.w;
import com.google.common.collect.y;
import com.google.common.collect.z;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;

/* loaded from: classes2.dex */
public class x<K, V> extends z<K, V> implements g0<K, V> {
    private static final long serialVersionUID = 0;

    /* loaded from: classes2.dex */
    public static final class a<K, V> extends z.c<K, V> {
        public x<K, V> d() {
            return (x) super.a();
        }

        public a<K, V> e(K k10, V v10) {
            super.c(k10, v10);
            return this;
        }
    }

    public x(y<K, w<V>> yVar, int i10) {
        super(yVar, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
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
            w.a p10 = w.p();
            for (int i12 = 0; i12 < readInt2; i12++) {
                p10.a(objectInputStream.readObject());
            }
            a10.f(readObject, p10.k());
            i10 += readInt2;
        }
        try {
            z.e.f11221a.b(this, a10.c());
            z.e.f11222b.a(this, i10);
        } catch (IllegalArgumentException e10) {
            throw ((InvalidObjectException) new InvalidObjectException(e10.getMessage()).initCause(e10));
        }
    }

    public static <K, V> x<K, V> t(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> collection, Comparator<? super V> comparator) {
        if (collection.isEmpty()) {
            return v();
        }
        y.a aVar = new y.a(collection.size());
        int i10 = 0;
        for (Map.Entry<? extends K, ? extends Collection<? extends V>> entry : collection) {
            K key = entry.getKey();
            Collection<? extends V> value = entry.getValue();
            w r10 = comparator == null ? w.r(value) : w.D(comparator, value);
            if (!r10.isEmpty()) {
                aVar.f(key, r10);
                i10 += r10.size();
            }
        }
        return new x<>(aVar.c(), i10);
    }

    public static <K, V> x<K, V> v() {
        return p.f11151r;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        z0.b(this, objectOutputStream);
    }

    @Override // com.google.common.collect.z
    /* renamed from: u, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public w<V> p(K k10) {
        w<V> wVar = (w) this.f11208e.get(k10);
        return wVar == null ? w.v() : wVar;
    }
}
