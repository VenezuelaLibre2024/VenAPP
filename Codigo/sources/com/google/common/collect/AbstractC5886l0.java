package com.google.common.collect;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import p082eb.C7159o;
import p082eb.InterfaceC7166v;

/* renamed from: com.google.common.collect.l0 */
/* loaded from: classes2.dex */
public abstract class AbstractC5886l0<K0, V0> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.common.collect.l0$a */
    /* loaded from: classes2.dex */
    public class a extends e<Object> {

        /* renamed from: a */
        final /* synthetic */ int f12354a;

        a(int i10) {
            this.f12354a = i10;
        }

        @Override // com.google.common.collect.AbstractC5886l0.e
        /* renamed from: c */
        <K, V> Map<K, Collection<V>> mo14996c() {
            return C5900s0.m15046c(this.f12354a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.common.collect.l0$b */
    /* loaded from: classes2.dex */
    public class b extends e<K0> {

        /* renamed from: a */
        final /* synthetic */ Comparator f12355a;

        b(Comparator comparator) {
            this.f12355a = comparator;
        }

        @Override // com.google.common.collect.AbstractC5886l0.e
        /* renamed from: c */
        <K extends K0, V> Map<K, Collection<V>> mo14996c() {
            return new TreeMap(this.f12355a);
        }
    }

    /* renamed from: com.google.common.collect.l0$c */
    /* loaded from: classes2.dex */
    private static final class c<V> implements InterfaceC7166v<List<V>>, Serializable {

        /* renamed from: a */
        private final int f12356a;

        c(int i10) {
            this.f12356a = C5878i.m14883b(i10, "expectedValuesPerKey");
        }

        @Override // p082eb.InterfaceC7166v
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<V> get() {
            return new ArrayList(this.f12356a);
        }
    }

    /* renamed from: com.google.common.collect.l0$d */
    /* loaded from: classes2.dex */
    public static abstract class d<K0, V0> extends AbstractC5886l0<K0, V0> {
        d() {
            super(null);
        }

        /* renamed from: e */
        public abstract <K extends K0, V extends V0> InterfaceC5873g0<K, V> mo14998e();
    }

    /* renamed from: com.google.common.collect.l0$e */
    /* loaded from: classes2.dex */
    public static abstract class e<K0> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.google.common.collect.l0$e$a */
        /* loaded from: classes2.dex */
        public class a extends d<K0, Object> {

            /* renamed from: a */
            final /* synthetic */ int f12357a;

            a(int i10) {
                this.f12357a = i10;
            }

            @Override // com.google.common.collect.AbstractC5886l0.d
            /* renamed from: e */
            public <K extends K0, V> InterfaceC5873g0<K, V> mo14998e() {
                return C5888m0.m15012b(e.this.mo14996c(), new c(this.f12357a));
            }
        }

        e() {
        }

        /* renamed from: a */
        public d<K0, Object> m14999a() {
            return m15000b(2);
        }

        /* renamed from: b */
        public d<K0, Object> m15000b(int i10) {
            C5878i.m14883b(i10, "expectedValuesPerKey");
            return new a(i10);
        }

        /* renamed from: c */
        abstract <K extends K0, V> Map<K, Collection<V>> mo14996c();
    }

    private AbstractC5886l0() {
    }

    /* synthetic */ AbstractC5886l0(a aVar) {
        this();
    }

    /* renamed from: a */
    public static e<Object> m14992a() {
        return m14993b(8);
    }

    /* renamed from: b */
    public static e<Object> m14993b(int i10) {
        C5878i.m14883b(i10, "expectedKeys");
        return new a(i10);
    }

    /* renamed from: c */
    public static e<Comparable> m14994c() {
        return m14995d(AbstractC5898r0.m15040c());
    }

    /* renamed from: d */
    public static <K0> e<K0> m14995d(Comparator<K0> comparator) {
        C7159o.m21312o(comparator);
        return new b(comparator);
    }
}
