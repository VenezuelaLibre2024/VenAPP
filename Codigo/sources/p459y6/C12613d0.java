package p459y6;

import p363t8.C11137a;

/* renamed from: y6.d0 */
/* loaded from: classes.dex */
public final class C12613d0 {

    /* renamed from: a */
    private final byte[] f34249a;

    /* renamed from: b */
    private final int f34250b;

    /* renamed from: c */
    private int f34251c;

    /* renamed from: d */
    private int f34252d;

    public C12613d0(byte[] bArr) {
        this.f34249a = bArr;
        this.f34250b = bArr.length;
    }

    /* renamed from: a */
    private void m41521a() {
        int i10;
        int i11 = this.f34251c;
        C11137a.m34605g(i11 >= 0 && (i11 < (i10 = this.f34250b) || (i11 == i10 && this.f34252d == 0)));
    }

    /* renamed from: b */
    public int m41522b() {
        return (this.f34251c * 8) + this.f34252d;
    }

    /* renamed from: c */
    public boolean m41523c() {
        boolean z10 = (((this.f34249a[this.f34251c] & 255) >> this.f34252d) & 1) == 1;
        m41525e(1);
        return z10;
    }

    /* renamed from: d */
    public int m41524d(int i10) {
        int i11 = this.f34251c;
        int min = Math.min(i10, 8 - this.f34252d);
        int i12 = i11 + 1;
        int i13 = ((this.f34249a[i11] & 255) >> this.f34252d) & (255 >> (8 - min));
        while (min < i10) {
            i13 |= (this.f34249a[i12] & 255) << min;
            min += 8;
            i12++;
        }
        int i14 = i13 & ((-1) >>> (32 - i10));
        m41525e(i10);
        return i14;
    }

    /* renamed from: e */
    public void m41525e(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f34251c + i11;
        this.f34251c = i12;
        int i13 = this.f34252d + (i10 - (i11 * 8));
        this.f34252d = i13;
        if (i13 > 7) {
            this.f34251c = i12 + 1;
            this.f34252d = i13 - 8;
        }
        m41521a();
    }
}
