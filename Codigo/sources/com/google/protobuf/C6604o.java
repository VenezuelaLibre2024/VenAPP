package com.google.protobuf;

import com.google.protobuf.AbstractC6629x;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.protobuf.o */
/* loaded from: classes2.dex */
public class C6604o {

    /* renamed from: b */
    private static boolean f14568b = true;

    /* renamed from: c */
    private static volatile C6604o f14569c;

    /* renamed from: d */
    static final C6604o f14570d = new C6604o(true);

    /* renamed from: a */
    private final Map<a, AbstractC6629x.e<?, ?>> f14571a;

    /* renamed from: com.google.protobuf.o$a */
    /* loaded from: classes2.dex */
    private static final class a {

        /* renamed from: a */
        private final Object f14572a;

        /* renamed from: b */
        private final int f14573b;

        a(Object obj, int i10) {
            this.f14572a = obj;
            this.f14573b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f14572a == aVar.f14572a && this.f14573b == aVar.f14573b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f14572a) * 65535) + this.f14573b;
        }
    }

    C6604o() {
        this.f14571a = new HashMap();
    }

    C6604o(boolean z10) {
        this.f14571a = Collections.emptyMap();
    }

    /* renamed from: b */
    public static C6604o m18973b() {
        C6604o c6604o = f14569c;
        if (c6604o == null) {
            synchronized (C6604o.class) {
                c6604o = f14569c;
                if (c6604o == null) {
                    c6604o = f14568b ? C6601n.m18948a() : f14570d;
                    f14569c = c6604o;
                }
            }
        }
        return c6604o;
    }

    /* renamed from: a */
    public <ContainingType extends InterfaceC6614r0> AbstractC6629x.e<ContainingType, ?> m18974a(ContainingType containingtype, int i10) {
        return (AbstractC6629x.e) this.f14571a.get(new a(containingtype, i10));
    }
}
