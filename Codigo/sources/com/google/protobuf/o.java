package com.google.protobuf;

import com.google.protobuf.x;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class o {

    /* renamed from: b */
    private static boolean f13294b = true;

    /* renamed from: c */
    private static volatile o f13295c;

    /* renamed from: d */
    static final o f13296d = new o(true);

    /* renamed from: a */
    private final Map<a, x.e<?, ?>> f13297a;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        private final Object f13298a;

        /* renamed from: b */
        private final int f13299b;

        a(Object obj, int i10) {
            this.f13298a = obj;
            this.f13299b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f13298a == aVar.f13298a && this.f13299b == aVar.f13299b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f13298a) * 65535) + this.f13299b;
        }
    }

    o() {
        this.f13297a = new HashMap();
    }

    o(boolean z10) {
        this.f13297a = Collections.emptyMap();
    }

    public static o b() {
        o oVar = f13295c;
        if (oVar == null) {
            synchronized (o.class) {
                oVar = f13295c;
                if (oVar == null) {
                    oVar = f13294b ? n.a() : f13296d;
                    f13295c = oVar;
                }
            }
        }
        return oVar;
    }

    public <ContainingType extends r0> x.e<ContainingType, ?> a(ContainingType containingtype, int i10) {
        return (x.e) this.f13297a.get(new a(containingtype, i10));
    }
}
