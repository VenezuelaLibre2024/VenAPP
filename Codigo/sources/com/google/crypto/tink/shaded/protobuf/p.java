package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.y;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class p {

    /* renamed from: b, reason: collision with root package name */
    private static boolean f11480b = true;

    /* renamed from: c, reason: collision with root package name */
    private static volatile p f11481c;

    /* renamed from: d, reason: collision with root package name */
    static final p f11482d = new p(true);

    /* renamed from: a, reason: collision with root package name */
    private final Map<a, y.e<?, ?>> f11483a;

    /* loaded from: classes2.dex */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Object f11484a;

        /* renamed from: b, reason: collision with root package name */
        private final int f11485b;

        a(Object obj, int i10) {
            this.f11484a = obj;
            this.f11485b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f11484a == aVar.f11484a && this.f11485b == aVar.f11485b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f11484a) * 65535) + this.f11485b;
        }
    }

    p() {
        this.f11483a = new HashMap();
    }

    p(boolean z10) {
        this.f11483a = Collections.emptyMap();
    }

    public static p b() {
        p pVar = f11481c;
        if (pVar == null) {
            synchronized (p.class) {
                pVar = f11481c;
                if (pVar == null) {
                    pVar = f11480b ? o.a() : f11482d;
                    f11481c = pVar;
                }
            }
        }
        return pVar;
    }

    public <ContainingType extends r0> y.e<ContainingType, ?> a(ContainingType containingtype, int i10) {
        return (y.e) this.f11483a.get(new a(containingtype, i10));
    }
}
