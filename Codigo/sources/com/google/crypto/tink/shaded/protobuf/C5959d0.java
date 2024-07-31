package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.crypto.tink.shaded.protobuf.d0 */
/* loaded from: classes2.dex */
public class C5959d0 extends C5962e0 {

    /* renamed from: f */
    private final InterfaceC6001r0 f12565f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.d0$b */
    /* loaded from: classes2.dex */
    public static class b<K> implements Map.Entry<K, Object> {

        /* renamed from: a */
        private Map.Entry<K, C5959d0> f12566a;

        private b(Map.Entry<K, C5959d0> entry) {
            this.f12566a = entry;
        }

        /* renamed from: a */
        public C5959d0 m15346a() {
            return this.f12566a.getValue();
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f12566a.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            C5959d0 value = this.f12566a.getValue();
            if (value == null) {
                return null;
            }
            return value.m15345f();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof InterfaceC6001r0) {
                return this.f12566a.getValue().m15398d((InterfaceC6001r0) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.d0$c */
    /* loaded from: classes2.dex */
    static class c<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: a */
        private Iterator<Map.Entry<K, Object>> f12567a;

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.f12567a = it;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f12567a.next();
            return next.getValue() instanceof C5959d0 ? new b(next) : next;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f12567a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f12567a.remove();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C5962e0
    public boolean equals(Object obj) {
        return m15345f().equals(obj);
    }

    /* renamed from: f */
    public InterfaceC6001r0 m15345f() {
        return m15397c(this.f12565f);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C5962e0
    public int hashCode() {
        return m15345f().hashCode();
    }

    public String toString() {
        return m15345f().toString();
    }
}
