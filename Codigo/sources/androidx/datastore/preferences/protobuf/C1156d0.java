package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.d0 */
/* loaded from: classes.dex */
public class C1156d0 extends C1159e0 {

    /* renamed from: f */
    private final InterfaceC1198r0 f4802f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.datastore.preferences.protobuf.d0$b */
    /* loaded from: classes.dex */
    public static class b<K> implements Map.Entry<K, Object> {

        /* renamed from: a */
        private Map.Entry<K, C1156d0> f4803a;

        private b(Map.Entry<K, C1156d0> entry) {
            this.f4803a = entry;
        }

        /* renamed from: a */
        public C1156d0 m5686a() {
            return this.f4803a.getValue();
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f4803a.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            C1156d0 value = this.f4803a.getValue();
            if (value == null) {
                return null;
            }
            return value.m5685f();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof InterfaceC1198r0) {
                return this.f4803a.getValue().m5762d((InterfaceC1198r0) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.datastore.preferences.protobuf.d0$c */
    /* loaded from: classes.dex */
    public static class c<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: a */
        private Iterator<Map.Entry<K, Object>> f4804a;

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.f4804a = it;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f4804a.next();
            return next.getValue() instanceof C1156d0 ? new b(next) : next;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f4804a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f4804a.remove();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.C1159e0
    public boolean equals(Object obj) {
        return m5685f().equals(obj);
    }

    /* renamed from: f */
    public InterfaceC1198r0 m5685f() {
        return m5761c(this.f4802f);
    }

    @Override // androidx.datastore.preferences.protobuf.C1159e0
    public int hashCode() {
        return m5685f().hashCode();
    }

    public String toString() {
        return m5685f().toString();
    }
}
