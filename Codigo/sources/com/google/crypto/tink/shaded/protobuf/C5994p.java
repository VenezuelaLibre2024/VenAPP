package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC6018y;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.crypto.tink.shaded.protobuf.p */
/* loaded from: classes2.dex */
public class C5994p {

    /* renamed from: b */
    private static boolean f12695b = true;

    /* renamed from: c */
    private static volatile C5994p f12696c;

    /* renamed from: d */
    static final C5994p f12697d = new C5994p(true);

    /* renamed from: a */
    private final Map<a, AbstractC6018y.e<?, ?>> f12698a;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.p$a */
    /* loaded from: classes2.dex */
    private static final class a {

        /* renamed from: a */
        private final Object f12699a;

        /* renamed from: b */
        private final int f12700b;

        a(Object obj, int i10) {
            this.f12699a = obj;
            this.f12700b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f12699a == aVar.f12699a && this.f12700b == aVar.f12700b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f12699a) * 65535) + this.f12700b;
        }
    }

    C5994p() {
        this.f12698a = new HashMap();
    }

    C5994p(boolean z10) {
        this.f12698a = Collections.emptyMap();
    }

    /* renamed from: b */
    public static C5994p m15932b() {
        C5994p c5994p = f12696c;
        if (c5994p == null) {
            synchronized (C5994p.class) {
                c5994p = f12696c;
                if (c5994p == null) {
                    c5994p = f12695b ? C5991o.m15908a() : f12697d;
                    f12696c = c5994p;
                }
            }
        }
        return c5994p;
    }

    /* renamed from: a */
    public <ContainingType extends InterfaceC6001r0> AbstractC6018y.e<ContainingType, ?> m15933a(ContainingType containingtype, int i10) {
        return (AbstractC6018y.e) this.f12698a.get(new a(containingtype, i10));
    }
}
