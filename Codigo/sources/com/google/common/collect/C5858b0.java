package com.google.common.collect;

import com.google.common.collect.AbstractC5855a0;
import com.google.common.collect.AbstractC5861c0;
import com.google.common.collect.AbstractC5911y;
import com.google.common.collect.AbstractC5913z;
import com.google.common.collect.C5914z0;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import p082eb.C7153i;

/* renamed from: com.google.common.collect.b0 */
/* loaded from: classes2.dex */
public class C5858b0<K, V> extends AbstractC5913z<K, V> implements InterfaceC5856a1<K, V> {
    private static final long serialVersionUID = 0;

    /* renamed from: r */
    private final transient AbstractC5855a0<V> f12254r;

    /* renamed from: s */
    private transient AbstractC5855a0<Map.Entry<K, V>> f12255s;

    /* renamed from: com.google.common.collect.b0$a */
    /* loaded from: classes2.dex */
    public static final class a<K, V> extends AbstractC5913z.c<K, V> {
        @Override // com.google.common.collect.AbstractC5913z.c
        /* renamed from: b */
        Collection<V> mo14743b() {
            return C5900s0.m15047d();
        }

        /* renamed from: d */
        public C5858b0<K, V> m14744d() {
            Collection entrySet = this.f12432a.entrySet();
            Comparator<? super K> comparator = this.f12433b;
            if (comparator != null) {
                entrySet = AbstractC5898r0.m15039a(comparator).m15042d().m15041b(entrySet);
            }
            return C5858b0.m14734v(entrySet, this.f12434c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.common.collect.b0$b */
    /* loaded from: classes2.dex */
    public static final class b<K, V> extends AbstractC5855a0<Map.Entry<K, V>> {

        /* renamed from: c */
        private final transient C5858b0<K, V> f12256c;

        b(C5858b0<K, V> c5858b0) {
            this.f12256c = c5858b0;
        }

        @Override // com.google.common.collect.AbstractC5903u, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f12256c.mo14845c(entry.getKey(), entry.getValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractC5903u
        /* renamed from: l */
        public boolean mo14745l() {
            return false;
        }

        @Override // com.google.common.collect.AbstractC5855a0, com.google.common.collect.AbstractC5903u, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: m */
        public AbstractC5877h1<Map.Entry<K, V>> iterator() {
            return this.f12256c.mo14794i();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f12256c.size();
        }
    }

    /* renamed from: com.google.common.collect.b0$c */
    /* loaded from: classes2.dex */
    private static final class c {

        /* renamed from: a */
        static final C5914z0.b<C5858b0> f12257a = C5914z0.m15137a(C5858b0.class, "emptySet");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5858b0(AbstractC5911y<K, AbstractC5855a0<V>> abstractC5911y, int i10, Comparator<? super V> comparator) {
        super(abstractC5911y, i10);
        this.f12254r = m14733t(comparator);
    }

    /* renamed from: A */
    private static <V> AbstractC5855a0.a<V> m14732A(Comparator<? super V> comparator) {
        return comparator == null ? new AbstractC5855a0.a<>() : new AbstractC5861c0.a(comparator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
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
            AbstractC5855a0.a m14732A = m14732A(comparator);
            for (int i12 = 0; i12 < readInt2; i12++) {
                m14732A.mo14724a(objectInputStream.readObject());
            }
            AbstractC5855a0 mo14727k = m14732A.mo14727k();
            if (mo14727k.size() != readInt2) {
                throw new InvalidObjectException("Duplicate key-value pairs exist for key " + readObject);
            }
            m15108a.m15122f(readObject, mo14727k);
            i10 += readInt2;
        }
        try {
            AbstractC5913z.e.f12436a.m15140b(this, m15108a.m15121c());
            AbstractC5913z.e.f12437b.m15139a(this, i10);
            c.f12257a.m15140b(this, m14733t(comparator));
        } catch (IllegalArgumentException e10) {
            throw ((InvalidObjectException) new InvalidObjectException(e10.getMessage()).initCause(e10));
        }
    }

    /* renamed from: t */
    private static <V> AbstractC5855a0<V> m14733t(Comparator<? super V> comparator) {
        return comparator == null ? AbstractC5855a0.m14714v() : AbstractC5861c0.m14753J(comparator);
    }

    /* renamed from: v */
    static <K, V> C5858b0<K, V> m14734v(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> collection, Comparator<? super V> comparator) {
        if (collection.isEmpty()) {
            return m14735x();
        }
        AbstractC5911y.a aVar = new AbstractC5911y.a(collection.size());
        int i10 = 0;
        for (Map.Entry<? extends K, ? extends Collection<? extends V>> entry : collection) {
            K key = entry.getKey();
            AbstractC5855a0 m14736z = m14736z(comparator, entry.getValue());
            if (!m14736z.isEmpty()) {
                aVar.m15122f(key, m14736z);
                i10 += m14736z.size();
            }
        }
        return new C5858b0<>(aVar.m15121c(), i10, comparator);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(m14742y());
        C5914z0.m15138b(this, objectOutputStream);
    }

    /* renamed from: x */
    public static <K, V> C5858b0<K, V> m14735x() {
        return C5895q.f12367t;
    }

    /* renamed from: z */
    private static <V> AbstractC5855a0<V> m14736z(Comparator<? super V> comparator, Collection<? extends V> collection) {
        return comparator == null ? AbstractC5855a0.m14712r(collection) : AbstractC5861c0.m14752F(comparator, collection);
    }

    @Override // com.google.common.collect.AbstractC5913z
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public AbstractC5855a0<Map.Entry<K, V>> mo14737a() {
        AbstractC5855a0<Map.Entry<K, V>> abstractC5855a0 = this.f12255s;
        if (abstractC5855a0 != null) {
            return abstractC5855a0;
        }
        b bVar = new b(this);
        this.f12255s = bVar;
        return bVar;
    }

    @Override // com.google.common.collect.AbstractC5913z
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public AbstractC5855a0<V> mo14739p(K k10) {
        return (AbstractC5855a0) C7153i.m21272a((AbstractC5855a0) this.f12423e.get(k10), this.f12254r);
    }

    /* renamed from: y */
    Comparator<? super V> m14742y() {
        AbstractC5855a0<V> abstractC5855a0 = this.f12254r;
        if (abstractC5855a0 instanceof AbstractC5861c0) {
            return ((AbstractC5861c0) abstractC5855a0).comparator();
        }
        return null;
    }
}
