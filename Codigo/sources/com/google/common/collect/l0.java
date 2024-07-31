package com.google.common.collect;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public abstract class l0<K0, V0> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a extends e<Object> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f11139a;

        a(int i10) {
            this.f11139a = i10;
        }

        @Override // com.google.common.collect.l0.e
        <K, V> Map<K, Collection<V>> c() {
            return s0.c(this.f11139a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b extends e<K0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator f11140a;

        b(Comparator comparator) {
            this.f11140a = comparator;
        }

        @Override // com.google.common.collect.l0.e
        <K extends K0, V> Map<K, Collection<V>> c() {
            return new TreeMap(this.f11140a);
        }
    }

    /* loaded from: classes2.dex */
    private static final class c<V> implements eb.v<List<V>>, Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final int f11141a;

        c(int i10) {
            this.f11141a = i.b(i10, "expectedValuesPerKey");
        }

        @Override // eb.v
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<V> get() {
            return new ArrayList(this.f11141a);
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class d<K0, V0> extends l0<K0, V0> {
        d() {
            super(null);
        }

        public abstract <K extends K0, V extends V0> g0<K, V> e();
    }

    /* loaded from: classes2.dex */
    public static abstract class e<K0> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public class a extends d<K0, Object> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f11142a;

            a(int i10) {
                this.f11142a = i10;
            }

            @Override // com.google.common.collect.l0.d
            public <K extends K0, V> g0<K, V> e() {
                return m0.b(e.this.c(), new c(this.f11142a));
            }
        }

        e() {
        }

        public d<K0, Object> a() {
            return b(2);
        }

        public d<K0, Object> b(int i10) {
            i.b(i10, "expectedValuesPerKey");
            return new a(i10);
        }

        abstract <K extends K0, V> Map<K, Collection<V>> c();
    }

    private l0() {
    }

    /* synthetic */ l0(a aVar) {
        this();
    }

    public static e<Object> a() {
        return b(8);
    }

    public static e<Object> b(int i10) {
        i.b(i10, "expectedKeys");
        return new a(i10);
    }

    public static e<Comparable> c() {
        return d(r0.c());
    }

    public static <K0> e<K0> d(Comparator<K0> comparator) {
        eb.o.o(comparator);
        return new b(comparator);
    }
}
