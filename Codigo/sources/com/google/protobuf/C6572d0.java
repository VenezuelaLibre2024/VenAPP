package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.protobuf.d0 */
/* loaded from: classes2.dex */
public class C6572d0 extends C6575e0 {

    /* renamed from: f */
    private final InterfaceC6614r0 f14438f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.protobuf.d0$b */
    /* loaded from: classes2.dex */
    public static class b<K> implements Map.Entry<K, Object> {

        /* renamed from: a */
        private Map.Entry<K, C6572d0> f14439a;

        private b(Map.Entry<K, C6572d0> entry) {
            this.f14439a = entry;
        }

        /* renamed from: a */
        public C6572d0 m18424a() {
            return this.f14439a.getValue();
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f14439a.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            C6572d0 value = this.f14439a.getValue();
            if (value == null) {
                return null;
            }
            return value.m18423f();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof InterfaceC6614r0) {
                return this.f14439a.getValue().m18447d((InterfaceC6614r0) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.protobuf.d0$c */
    /* loaded from: classes2.dex */
    public static class c<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: a */
        private Iterator<Map.Entry<K, Object>> f14440a;

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.f14440a = it;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f14440a.next();
            return next.getValue() instanceof C6572d0 ? new b(next) : next;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f14440a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f14440a.remove();
        }
    }

    @Override // com.google.protobuf.C6575e0
    public boolean equals(Object obj) {
        return m18423f().equals(obj);
    }

    /* renamed from: f */
    public InterfaceC6614r0 m18423f() {
        return m18446c(this.f14438f);
    }

    @Override // com.google.protobuf.C6575e0
    public int hashCode() {
        return m18423f().hashCode();
    }

    public String toString() {
        return m18423f().toString();
    }
}
