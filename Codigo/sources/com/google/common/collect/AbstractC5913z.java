package com.google.common.collect;

import com.google.common.collect.C5914z0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: com.google.common.collect.z */
/* loaded from: classes2.dex */
public abstract class AbstractC5913z<K, V> extends AbstractC5872g<K, V> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: e */
    final transient AbstractC5911y<K, ? extends AbstractC5903u<V>> f12423e;

    /* renamed from: f */
    final transient int f12424f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.common.collect.z$a */
    /* loaded from: classes2.dex */
    public class a extends AbstractC5877h1<Map.Entry<K, V>> {

        /* renamed from: a */
        final Iterator<? extends Map.Entry<K, ? extends AbstractC5903u<V>>> f12425a;

        /* renamed from: b */
        K f12426b = null;

        /* renamed from: c */
        Iterator<V> f12427c = C5870f0.m14855f();

        a() {
            this.f12425a = AbstractC5913z.this.f12423e.entrySet().iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (!this.f12427c.hasNext()) {
                Map.Entry<K, ? extends AbstractC5903u<V>> next = this.f12425a.next();
                this.f12426b = next.getKey();
                this.f12427c = next.getValue().iterator();
            }
            K k10 = this.f12426b;
            Objects.requireNonNull(k10);
            return C5882j0.m14891d(k10, this.f12427c.next());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f12427c.hasNext() || this.f12425a.hasNext();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.common.collect.z$b */
    /* loaded from: classes2.dex */
    public class b extends AbstractC5877h1<V> {

        /* renamed from: a */
        Iterator<? extends AbstractC5903u<V>> f12429a;

        /* renamed from: b */
        Iterator<V> f12430b = C5870f0.m14855f();

        b() {
            this.f12429a = AbstractC5913z.this.f12423e.values().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f12430b.hasNext() || this.f12429a.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            if (!this.f12430b.hasNext()) {
                this.f12430b = this.f12429a.next().iterator();
            }
            return this.f12430b.next();
        }
    }

    /* renamed from: com.google.common.collect.z$c */
    /* loaded from: classes2.dex */
    public static class c<K, V> {

        /* renamed from: a */
        final Map<K, Collection<V>> f12432a = C5900s0.m15048e();

        /* renamed from: b */
        Comparator<? super K> f12433b;

        /* renamed from: c */
        Comparator<? super V> f12434c;

        /* renamed from: a */
        public AbstractC5913z<K, V> m15135a() {
            Collection entrySet = this.f12432a.entrySet();
            Comparator<? super K> comparator = this.f12433b;
            if (comparator != null) {
                entrySet = AbstractC5898r0.m15039a(comparator).m15042d().m15041b(entrySet);
            }
            return C5909x.m15102t(entrySet, this.f12434c);
        }

        /* renamed from: b */
        Collection<V> mo14743b() {
            return new ArrayList();
        }

        /* renamed from: c */
        public c<K, V> m15136c(K k10, V v10) {
            C5878i.m14882a(k10, v10);
            Collection<V> collection = this.f12432a.get(k10);
            if (collection == null) {
                Map<K, Collection<V>> map = this.f12432a;
                Collection<V> mo14743b = mo14743b();
                map.put(k10, mo14743b);
                collection = mo14743b;
            }
            collection.add(v10);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.common.collect.z$d */
    /* loaded from: classes2.dex */
    public static class d<K, V> extends AbstractC5903u<Map.Entry<K, V>> {
        private static final long serialVersionUID = 0;

        /* renamed from: b */
        final AbstractC5913z<K, V> f12435b;

        d(AbstractC5913z<K, V> abstractC5913z) {
            this.f12435b = abstractC5913z;
        }

        @Override // com.google.common.collect.AbstractC5903u, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f12435b.mo14845c(entry.getKey(), entry.getValue());
        }

        @Override // com.google.common.collect.AbstractC5903u, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: m */
        public AbstractC5877h1<Map.Entry<K, V>> iterator() {
            return this.f12435b.mo14794i();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f12435b.size();
        }
    }

    /* renamed from: com.google.common.collect.z$e */
    /* loaded from: classes2.dex */
    static class e {

        /* renamed from: a */
        static final C5914z0.b<AbstractC5913z> f12436a = C5914z0.m15137a(AbstractC5913z.class, "map");

        /* renamed from: b */
        static final C5914z0.b<AbstractC5913z> f12437b = C5914z0.m15137a(AbstractC5913z.class, "size");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.common.collect.z$f */
    /* loaded from: classes2.dex */
    public static final class f<K, V> extends AbstractC5903u<V> {
        private static final long serialVersionUID = 0;

        /* renamed from: b */
        private final transient AbstractC5913z<K, V> f12438b;

        f(AbstractC5913z<K, V> abstractC5913z) {
            this.f12438b = abstractC5913z;
        }

        @Override // com.google.common.collect.AbstractC5903u, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f12438b.mo14846d(obj);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractC5903u
        /* renamed from: d */
        public int mo14834d(Object[] objArr, int i10) {
            AbstractC5877h1<? extends AbstractC5903u<V>> it = this.f12438b.f12423e.values().iterator();
            while (it.hasNext()) {
                i10 = it.next().mo14834d(objArr, i10);
            }
            return i10;
        }

        @Override // com.google.common.collect.AbstractC5903u, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: m */
        public AbstractC5877h1<V> iterator() {
            return this.f12438b.mo14795j();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f12438b.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC5913z(AbstractC5911y<K, ? extends AbstractC5903u<V>> abstractC5911y, int i10) {
        this.f12423e = abstractC5911y;
        this.f12424f = i10;
    }

    @Override // com.google.common.collect.AbstractC5869f, com.google.common.collect.InterfaceC5884k0
    /* renamed from: c */
    public /* bridge */ /* synthetic */ boolean mo14845c(Object obj, Object obj2) {
        return super.mo14845c(obj, obj2);
    }

    @Override // com.google.common.collect.InterfaceC5884k0
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractC5869f
    /* renamed from: d */
    public boolean mo14846d(Object obj) {
        return obj != null && super.mo14846d(obj);
    }

    @Override // com.google.common.collect.AbstractC5869f
    /* renamed from: e */
    Map<K, Collection<V>> mo14847e() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.AbstractC5869f
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.AbstractC5869f
    /* renamed from: g */
    Set<K> mo14848g() {
        throw new AssertionError("unreachable");
    }

    @Override // com.google.common.collect.AbstractC5869f
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.AbstractC5869f, com.google.common.collect.InterfaceC5884k0
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public AbstractC5911y<K, Collection<V>> mo14748b() {
        return this.f12423e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractC5869f
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public AbstractC5903u<Map.Entry<K, V>> mo14792f() {
        return new d(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractC5869f
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public AbstractC5903u<V> mo14793h() {
        return new f(this);
    }

    @Override // com.google.common.collect.AbstractC5869f, com.google.common.collect.InterfaceC5884k0
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public AbstractC5903u<Map.Entry<K, V>> mo14737a() {
        return (AbstractC5903u) super.mo14737a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractC5869f
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public AbstractC5877h1<Map.Entry<K, V>> mo14794i() {
        return new a();
    }

    @Override // com.google.common.collect.InterfaceC5884k0
    /* renamed from: p */
    public abstract AbstractC5903u<V> mo14739p(K k10);

    @Override // com.google.common.collect.InterfaceC5884k0
    @Deprecated
    public final boolean put(K k10, V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractC5869f, com.google.common.collect.InterfaceC5884k0
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public AbstractC5855a0<K> keySet() {
        return this.f12423e.keySet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractC5869f
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public AbstractC5877h1<V> mo14795j() {
        return new b();
    }

    @Override // com.google.common.collect.AbstractC5869f, com.google.common.collect.InterfaceC5884k0
    @Deprecated
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractC5869f, com.google.common.collect.InterfaceC5884k0
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public AbstractC5903u<V> values() {
        return (AbstractC5903u) super.values();
    }

    @Override // com.google.common.collect.InterfaceC5884k0
    public int size() {
        return this.f12424f;
    }

    @Override // com.google.common.collect.AbstractC5869f
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
