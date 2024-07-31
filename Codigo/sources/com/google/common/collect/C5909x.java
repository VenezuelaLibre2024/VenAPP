package com.google.common.collect;

import com.google.common.collect.AbstractC5907w;
import com.google.common.collect.AbstractC5911y;
import com.google.common.collect.AbstractC5913z;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;

/* renamed from: com.google.common.collect.x */
/* loaded from: classes2.dex */
public class C5909x<K, V> extends AbstractC5913z<K, V> implements InterfaceC5873g0<K, V> {
    private static final long serialVersionUID = 0;

    /* renamed from: com.google.common.collect.x$a */
    /* loaded from: classes2.dex */
    public static final class a<K, V> extends AbstractC5913z.c<K, V> {
        /* renamed from: d */
        public C5909x<K, V> m15105d() {
            return (C5909x) super.m15135a();
        }

        /* renamed from: e */
        public a<K, V> m15106e(K k10, V v10) {
            super.m15136c(k10, v10);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5909x(AbstractC5911y<K, AbstractC5907w<V>> abstractC5911y, int i10) {
        super(abstractC5911y, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException("Invalid key count " + readInt);
        }
        AbstractC5911y.a m15108a = AbstractC5911y.m15108a();
        int i10 = 0;
        for (int i11 = 0; i11 < readInt; i11++) {
            Object readObject = objectInputStream.readObject();
            int readInt2 = objectInputStream.readInt();
            if (readInt2 <= 0) {
                throw new InvalidObjectException("Invalid value count " + readInt2);
            }
            AbstractC5907w.a m15077p = AbstractC5907w.m15077p();
            for (int i12 = 0; i12 < readInt2; i12++) {
                m15077p.mo14724a(objectInputStream.readObject());
            }
            m15108a.m15122f(readObject, m15077p.m15094k());
            i10 += readInt2;
        }
        try {
            AbstractC5913z.e.f12436a.m15140b(this, m15108a.m15121c());
            AbstractC5913z.e.f12437b.m15139a(this, i10);
        } catch (IllegalArgumentException e10) {
            throw ((InvalidObjectException) new InvalidObjectException(e10.getMessage()).initCause(e10));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public static <K, V> C5909x<K, V> m15102t(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> collection, Comparator<? super V> comparator) {
        if (collection.isEmpty()) {
            return m15103v();
        }
        AbstractC5911y.a aVar = new AbstractC5911y.a(collection.size());
        int i10 = 0;
        for (Map.Entry<? extends K, ? extends Collection<? extends V>> entry : collection) {
            K key = entry.getKey();
            Collection<? extends V> value = entry.getValue();
            AbstractC5907w m15079r = comparator == null ? AbstractC5907w.m15079r(value) : AbstractC5907w.m15074D(comparator, value);
            if (!m15079r.isEmpty()) {
                aVar.m15122f(key, m15079r);
                i10 += m15079r.size();
            }
        }
        return new C5909x<>(aVar.m15121c(), i10);
    }

    /* renamed from: v */
    public static <K, V> C5909x<K, V> m15103v() {
        return C5893p.f12366r;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        C5914z0.m15138b(this, objectOutputStream);
    }

    @Override // com.google.common.collect.AbstractC5913z
    /* renamed from: u, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AbstractC5907w<V> mo14739p(K k10) {
        AbstractC5907w<V> abstractC5907w = (AbstractC5907w) this.f12423e.get(k10);
        return abstractC5907w == null ? AbstractC5907w.m15081v() : abstractC5907w;
    }
}
