package p482z7;

import android.net.Uri;
import p363t8.C11168p0;

/* renamed from: z7.i */
/* loaded from: classes.dex */
public final class C12817i {

    /* renamed from: a */
    public final long f34955a;

    /* renamed from: b */
    public final long f34956b;

    /* renamed from: c */
    private final String f34957c;

    /* renamed from: d */
    private int f34958d;

    public C12817i(String str, long j10, long j11) {
        this.f34957c = str == null ? "" : str;
        this.f34955a = j10;
        this.f34956b = j11;
    }

    /* renamed from: a */
    public C12817i m42539a(C12817i c12817i, String str) {
        String m42541c = m42541c(str);
        if (c12817i != null && m42541c.equals(c12817i.m42541c(str))) {
            long j10 = this.f34956b;
            if (j10 != -1) {
                long j11 = this.f34955a;
                if (j11 + j10 == c12817i.f34955a) {
                    long j12 = c12817i.f34956b;
                    return new C12817i(m42541c, j11, j12 != -1 ? j10 + j12 : -1L);
                }
            }
            long j13 = c12817i.f34956b;
            if (j13 != -1) {
                long j14 = c12817i.f34955a;
                if (j14 + j13 == this.f34955a) {
                    return new C12817i(m42541c, j14, j10 != -1 ? j13 + j10 : -1L);
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public Uri m42540b(String str) {
        return C11168p0.m34839e(str, this.f34957c);
    }

    /* renamed from: c */
    public String m42541c(String str) {
        return C11168p0.m34838d(str, this.f34957c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12817i.class != obj.getClass()) {
            return false;
        }
        C12817i c12817i = (C12817i) obj;
        return this.f34955a == c12817i.f34955a && this.f34956b == c12817i.f34956b && this.f34957c.equals(c12817i.f34957c);
    }

    public int hashCode() {
        if (this.f34958d == 0) {
            this.f34958d = ((((527 + ((int) this.f34955a)) * 31) + ((int) this.f34956b)) * 31) + this.f34957c.hashCode();
        }
        return this.f34958d;
    }

    public String toString() {
        return "RangedUri(referenceUri=" + this.f34957c + ", start=" + this.f34955a + ", length=" + this.f34956b + ")";
    }
}
