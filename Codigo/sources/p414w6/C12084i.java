package p414w6;

import p361t6.C11108u1;
import p363t8.C11137a;

/* renamed from: w6.i */
/* loaded from: classes.dex */
public final class C12084i {

    /* renamed from: a */
    public final String f32152a;

    /* renamed from: b */
    public final C11108u1 f32153b;

    /* renamed from: c */
    public final C11108u1 f32154c;

    /* renamed from: d */
    public final int f32155d;

    /* renamed from: e */
    public final int f32156e;

    public C12084i(String str, C11108u1 c11108u1, C11108u1 c11108u12, int i10, int i11) {
        C11137a.m34599a(i10 == 0 || i11 == 0);
        this.f32152a = C11137a.m34602d(str);
        this.f32153b = (C11108u1) C11137a.m34603e(c11108u1);
        this.f32154c = (C11108u1) C11137a.m34603e(c11108u12);
        this.f32155d = i10;
        this.f32156e = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12084i.class != obj.getClass()) {
            return false;
        }
        C12084i c12084i = (C12084i) obj;
        return this.f32155d == c12084i.f32155d && this.f32156e == c12084i.f32156e && this.f32152a.equals(c12084i.f32152a) && this.f32153b.equals(c12084i.f32153b) && this.f32154c.equals(c12084i.f32154c);
    }

    public int hashCode() {
        return ((((((((527 + this.f32155d) * 31) + this.f32156e) * 31) + this.f32152a.hashCode()) * 31) + this.f32153b.hashCode()) * 31) + this.f32154c.hashCode();
    }
}
