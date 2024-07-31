package p066dg;

import kg.C9263a;
import kg.C9264b;

/* renamed from: dg.c */
/* loaded from: classes2.dex */
public final class C6942c {

    /* renamed from: a */
    private final AbstractC6941b f15481a;

    /* renamed from: b */
    private C9264b f15482b;

    public C6942c(AbstractC6941b abstractC6941b) {
        if (abstractC6941b == null) {
            throw new IllegalArgumentException("Binarizer must be non-null.");
        }
        this.f15481a = abstractC6941b;
    }

    /* renamed from: a */
    public C9264b m20084a() {
        if (this.f15482b == null) {
            this.f15482b = this.f15481a.mo20079b();
        }
        return this.f15482b;
    }

    /* renamed from: b */
    public C9263a m20085b(int i10, C9263a c9263a) {
        return this.f15481a.mo20080c(i10, c9263a);
    }

    /* renamed from: c */
    public int m20086c() {
        return this.f15481a.m20081d();
    }

    /* renamed from: d */
    public int m20087d() {
        return this.f15481a.m20083f();
    }

    /* renamed from: e */
    public boolean m20088e() {
        return this.f15481a.m20082e().mo20099f();
    }

    /* renamed from: f */
    public C6942c m20089f() {
        return new C6942c(this.f15481a.mo20078a(this.f15481a.m20082e().mo20100g()));
    }

    public String toString() {
        try {
            return m20084a().toString();
        } catch (C6952m unused) {
            return "";
        }
    }
}
