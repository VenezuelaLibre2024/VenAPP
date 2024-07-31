package p361t6;

import p363t8.C11137a;
import p363t8.C11172r0;
import p397v7.InterfaceC11684a0;

/* renamed from: t6.j2 */
/* loaded from: classes.dex */
final class C11052j2 {

    /* renamed from: a */
    public final InterfaceC11684a0.b f28461a;

    /* renamed from: b */
    public final long f28462b;

    /* renamed from: c */
    public final long f28463c;

    /* renamed from: d */
    public final long f28464d;

    /* renamed from: e */
    public final long f28465e;

    /* renamed from: f */
    public final boolean f28466f;

    /* renamed from: g */
    public final boolean f28467g;

    /* renamed from: h */
    public final boolean f28468h;

    /* renamed from: i */
    public final boolean f28469i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11052j2(InterfaceC11684a0.b bVar, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14 = false;
        C11137a.m34599a(!z13 || z11);
        C11137a.m34599a(!z12 || z11);
        if (!z10 || (!z11 && !z12 && !z13)) {
            z14 = true;
        }
        C11137a.m34599a(z14);
        this.f28461a = bVar;
        this.f28462b = j10;
        this.f28463c = j11;
        this.f28464d = j12;
        this.f28465e = j13;
        this.f28466f = z10;
        this.f28467g = z11;
        this.f28468h = z12;
        this.f28469i = z13;
    }

    /* renamed from: a */
    public C11052j2 m34192a(long j10) {
        return j10 == this.f28463c ? this : new C11052j2(this.f28461a, this.f28462b, j10, this.f28464d, this.f28465e, this.f28466f, this.f28467g, this.f28468h, this.f28469i);
    }

    /* renamed from: b */
    public C11052j2 m34193b(long j10) {
        return j10 == this.f28462b ? this : new C11052j2(this.f28461a, j10, this.f28463c, this.f28464d, this.f28465e, this.f28466f, this.f28467g, this.f28468h, this.f28469i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11052j2.class != obj.getClass()) {
            return false;
        }
        C11052j2 c11052j2 = (C11052j2) obj;
        return this.f28462b == c11052j2.f28462b && this.f28463c == c11052j2.f28463c && this.f28464d == c11052j2.f28464d && this.f28465e == c11052j2.f28465e && this.f28466f == c11052j2.f28466f && this.f28467g == c11052j2.f28467g && this.f28468h == c11052j2.f28468h && this.f28469i == c11052j2.f28469i && C11172r0.m34914c(this.f28461a, c11052j2.f28461a);
    }

    public int hashCode() {
        return ((((((((((((((((527 + this.f28461a.hashCode()) * 31) + ((int) this.f28462b)) * 31) + ((int) this.f28463c)) * 31) + ((int) this.f28464d)) * 31) + ((int) this.f28465e)) * 31) + (this.f28466f ? 1 : 0)) * 31) + (this.f28467g ? 1 : 0)) * 31) + (this.f28468h ? 1 : 0)) * 31) + (this.f28469i ? 1 : 0);
    }
}
