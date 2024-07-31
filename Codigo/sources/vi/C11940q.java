package vi;

import p082eb.C7159o;

/* renamed from: vi.q */
/* loaded from: classes3.dex */
public final class C11940q {

    /* renamed from: a */
    private final EnumC11938p f31628a;

    /* renamed from: b */
    private final C11915g1 f31629b;

    private C11940q(EnumC11938p enumC11938p, C11915g1 c11915g1) {
        this.f31628a = (EnumC11938p) C7159o.m21313p(enumC11938p, "state is null");
        this.f31629b = (C11915g1) C7159o.m21313p(c11915g1, "status is null");
    }

    /* renamed from: a */
    public static C11940q m38237a(EnumC11938p enumC11938p) {
        C7159o.m21302e(enumC11938p != EnumC11938p.TRANSIENT_FAILURE, "state is TRANSIENT_ERROR. Use forError() instead");
        return new C11940q(enumC11938p, C11915g1.f31534f);
    }

    /* renamed from: b */
    public static C11940q m38238b(C11915g1 c11915g1) {
        C7159o.m21302e(!c11915g1.m38145p(), "The error status must not be OK");
        return new C11940q(EnumC11938p.TRANSIENT_FAILURE, c11915g1);
    }

    /* renamed from: c */
    public EnumC11938p m38239c() {
        return this.f31628a;
    }

    /* renamed from: d */
    public C11915g1 m38240d() {
        return this.f31629b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C11940q)) {
            return false;
        }
        C11940q c11940q = (C11940q) obj;
        return this.f31628a.equals(c11940q.f31628a) && this.f31629b.equals(c11940q.f31629b);
    }

    public int hashCode() {
        return this.f31628a.hashCode() ^ this.f31629b.hashCode();
    }

    public String toString() {
        if (this.f31629b.m38145p()) {
            return this.f31628a.toString();
        }
        return this.f31628a + "(" + this.f31629b + ")";
    }
}
