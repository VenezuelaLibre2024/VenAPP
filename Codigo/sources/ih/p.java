package ih;

/* loaded from: classes3.dex */
public class p implements Comparable<p> {

    /* renamed from: a, reason: collision with root package name */
    public final int f17804a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17805b;

    public p(int i10, int i11) {
        this.f17804a = i10;
        this.f17805b = i11;
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(p pVar) {
        int i10 = this.f17805b * this.f17804a;
        int i11 = pVar.f17805b * pVar.f17804a;
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
        p pVar = (p) obj;
        return this.f17804a == pVar.f17804a && this.f17805b == pVar.f17805b;
    }

    public p h() {
        return new p(this.f17805b, this.f17804a);
    }

    public int hashCode() {
        return (this.f17804a * 31) + this.f17805b;
    }

    public p i(p pVar) {
        int i10 = this.f17804a;
        int i11 = pVar.f17805b;
        int i12 = i10 * i11;
        int i13 = pVar.f17804a;
        int i14 = this.f17805b;
        return i12 <= i13 * i14 ? new p(i13, (i14 * i13) / i10) : new p((i10 * i11) / i14, i11);
    }

    public p l(p pVar) {
        int i10 = this.f17804a;
        int i11 = pVar.f17805b;
        int i12 = i10 * i11;
        int i13 = pVar.f17804a;
        int i14 = this.f17805b;
        return i12 >= i13 * i14 ? new p(i13, (i14 * i13) / i10) : new p((i10 * i11) / i14, i11);
    }

    public String toString() {
        return this.f17804a + "x" + this.f17805b;
    }
}
