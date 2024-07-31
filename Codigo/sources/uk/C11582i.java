package uk;

import kotlin.jvm.internal.C9315g;

/* renamed from: uk.i */
/* loaded from: classes3.dex */
public final class C11582i extends C11580g {

    /* renamed from: e */
    public static final a f30128e = new a(null);

    /* renamed from: f */
    private static final C11582i f30129f = new C11582i(1, 0);

    /* renamed from: uk.i$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    public C11582i(long j10, long j11) {
        super(j10, j11, 1L);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C11582i) {
            if (!isEmpty() || !((C11582i) obj).isEmpty()) {
                C11582i c11582i = (C11582i) obj;
                if (m36278c() != c11582i.m36278c() || m36279d() != c11582i.m36279d()) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (int) ((31 * (m36278c() ^ (m36278c() >>> 32))) + (m36279d() ^ (m36279d() >>> 32)));
    }

    public boolean isEmpty() {
        return m36278c() > m36279d();
    }

    /* renamed from: k */
    public boolean m36281k(long j10) {
        return m36278c() <= j10 && j10 <= m36279d();
    }

    public String toString() {
        return m36278c() + ".." + m36279d();
    }
}
