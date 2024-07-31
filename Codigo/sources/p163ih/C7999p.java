package p163ih;

/* renamed from: ih.p */
/* loaded from: classes3.dex */
public class C7999p implements Comparable<C7999p> {

    /* renamed from: a */
    public final int f19467a;

    /* renamed from: b */
    public final int f19468b;

    public C7999p(int i10, int i11) {
        this.f19467a = i10;
        this.f19468b = i11;
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(C7999p c7999p) {
        int i10 = this.f19468b * this.f19467a;
        int i11 = c7999p.f19468b * c7999p.f19467a;
        if (i11 < i10) {
            return 1;
        }
        return i11 > i10 ? -1 : 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C7999p c7999p = (C7999p) obj;
        return this.f19467a == c7999p.f19467a && this.f19468b == c7999p.f19468b;
    }

    /* renamed from: h */
    public C7999p m24569h() {
        return new C7999p(this.f19468b, this.f19467a);
    }

    public int hashCode() {
        return (this.f19467a * 31) + this.f19468b;
    }

    /* renamed from: i */
    public C7999p m24570i(C7999p c7999p) {
        int i10 = this.f19467a;
        int i11 = c7999p.f19468b;
        int i12 = i10 * i11;
        int i13 = c7999p.f19467a;
        int i14 = this.f19468b;
        return i12 <= i13 * i14 ? new C7999p(i13, (i14 * i13) / i10) : new C7999p((i10 * i11) / i14, i11);
    }

    /* renamed from: l */
    public C7999p m24571l(C7999p c7999p) {
        int i10 = this.f19467a;
        int i11 = c7999p.f19468b;
        int i12 = i10 * i11;
        int i13 = c7999p.f19467a;
        int i14 = this.f19468b;
        return i12 >= i13 * i14 ? new C7999p(i13, (i14 * i13) / i10) : new C7999p((i10 * i11) / i14, i11);
    }

    public String toString() {
        return this.f19467a + "x" + this.f19468b;
    }
}
