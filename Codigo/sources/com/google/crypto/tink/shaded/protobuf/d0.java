package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public class d0 extends e0 {

    /* renamed from: f */
    private final r0 f11350f;

    /* loaded from: classes2.dex */
    public static class b<K> implements Map.Entry<K, Object> {

        /* renamed from: a */
        private Map.Entry<K, d0> f11351a;

        private b(Map.Entry<K, d0> entry) {
            this.f11351a = entry;
        }

        /* synthetic */ b(Map.Entry entry, a aVar) {
            this(entry);
        }

        public d0 a() {
            return this.f11351a.getValue();
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f11351a.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            d0 value = this.f11351a.getValue();
            if (value == null) {
                return null;
            }
            return value.f();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof r0) {
                return this.f11351a.getValue().d((r0) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class c<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: a */
        private Iterator<Map.Entry<K, Object>> f11352a;

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.f11352a = it;
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f11352a.next();
            return next.getValue() instanceof d0 ? new b(next) : next;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f11352a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f11352a.remove();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public boolean equals(Object obj) {
        return f().equals(obj);
    }

    public r0 f() {
        return c(this.f11350f);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public int hashCode() {
        return f().hashCode();
    }

    public String toString() {
        return f().toString();
    }
}
