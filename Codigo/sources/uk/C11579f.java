package uk;

import kotlin.jvm.internal.C9315g;

/* renamed from: uk.f */
/* loaded from: classes3.dex */
public final class C11579f extends C11577d {

    /* renamed from: e */
    public static final a f30118e = new a(null);

    /* renamed from: f */
    private static final C11579f f30119f = new C11579f(1, 0);

    /* renamed from: uk.f$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final C11579f m36277a() {
            return C11579f.f30119f;
        }
    }

    public C11579f(int i10, int i11) {
        super(i10, i11, 1);
    }

    @Override // uk.C11577d
    public boolean equals(Object obj) {
        if (obj instanceof C11579f) {
            if (!isEmpty() || !((C11579f) obj).isEmpty()) {
                C11579f c11579f = (C11579f) obj;
                if (m36268c() != c11579f.m36268c() || m36269d() != c11579f.m36269d()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // uk.C11577d
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (m36268c() * 31) + m36269d();
    }

    @Override // uk.C11577d
    public boolean isEmpty() {
        return m36268c() > m36269d();
    }

    /* renamed from: m */
    public boolean m36274m(int i10) {
        return m36268c() <= i10 && i10 <= m36269d();
    }

    /* renamed from: n */
    public Integer m36275n() {
        return Integer.valueOf(m36269d());
    }

    /* renamed from: o */
    public Integer m36276o() {
        return Integer.valueOf(m36268c());
    }

    @Override // uk.C11577d
    public String toString() {
        return m36268c() + ".." + m36269d();
    }
}
