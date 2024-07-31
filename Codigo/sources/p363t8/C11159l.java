package p363t8;

import android.util.SparseBooleanArray;

/* renamed from: t8.l */
/* loaded from: classes.dex */
public final class C11159l {

    /* renamed from: a */
    private final SparseBooleanArray f28992a;

    /* renamed from: t8.l$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private final SparseBooleanArray f28993a = new SparseBooleanArray();

        /* renamed from: b */
        private boolean f28994b;

        /* renamed from: a */
        public b m34763a(int i10) {
            C11137a.m34605g(!this.f28994b);
            this.f28993a.append(i10, true);
            return this;
        }

        /* renamed from: b */
        public b m34764b(C11159l c11159l) {
            for (int i10 = 0; i10 < c11159l.m34762c(); i10++) {
                m34763a(c11159l.m34761b(i10));
            }
            return this;
        }

        /* renamed from: c */
        public b m34765c(int... iArr) {
            for (int i10 : iArr) {
                m34763a(i10);
            }
            return this;
        }

        /* renamed from: d */
        public b m34766d(int i10, boolean z10) {
            return z10 ? m34763a(i10) : this;
        }

        /* renamed from: e */
        public C11159l m34767e() {
            C11137a.m34605g(!this.f28994b);
            this.f28994b = true;
            return new C11159l(this.f28993a);
        }
    }

    private C11159l(SparseBooleanArray sparseBooleanArray) {
        this.f28992a = sparseBooleanArray;
    }

    /* renamed from: a */
    public boolean m34760a(int i10) {
        return this.f28992a.get(i10);
    }

    /* renamed from: b */
    public int m34761b(int i10) {
        C11137a.m34601c(i10, 0, m34762c());
        return this.f28992a.keyAt(i10);
    }

    /* renamed from: c */
    public int m34762c() {
        return this.f28992a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11159l)) {
            return false;
        }
        C11159l c11159l = (C11159l) obj;
        if (C11172r0.f29040a >= 24) {
            return this.f28992a.equals(c11159l.f28992a);
        }
        if (m34762c() != c11159l.m34762c()) {
            return false;
        }
        for (int i10 = 0; i10 < m34762c(); i10++) {
            if (m34761b(i10) != c11159l.m34761b(i10)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (C11172r0.f29040a >= 24) {
            return this.f28992a.hashCode();
        }
        int m34762c = m34762c();
        for (int i10 = 0; i10 < m34762c(); i10++) {
            m34762c = (m34762c * 31) + m34761b(i10);
        }
        return m34762c;
    }
}
