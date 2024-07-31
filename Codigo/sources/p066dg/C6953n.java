package p066dg;

/* renamed from: dg.n */
/* loaded from: classes2.dex */
public final class C6953n extends AbstractC6949j {

    /* renamed from: c */
    private final byte[] f15495c;

    /* renamed from: d */
    private final int f15496d;

    /* renamed from: e */
    private final int f15497e;

    /* renamed from: f */
    private final int f15498f;

    /* renamed from: g */
    private final int f15499g;

    public C6953n(byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, boolean z10) {
        super(i14, i15);
        if (i12 + i14 > i10 || i13 + i15 > i11) {
            throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
        }
        this.f15495c = bArr;
        this.f15496d = i10;
        this.f15497e = i11;
        this.f15498f = i12;
        this.f15499g = i13;
        if (z10) {
            m20107h(i14, i15);
        }
    }

    /* renamed from: h */
    private void m20107h(int i10, int i11) {
        byte[] bArr = this.f15495c;
        int i12 = (this.f15499g * this.f15496d) + this.f15498f;
        int i13 = 0;
        while (i13 < i11) {
            int i14 = (i10 / 2) + i12;
            int i15 = (i12 + i10) - 1;
            int i16 = i12;
            while (i16 < i14) {
                byte b10 = bArr[i16];
                bArr[i16] = bArr[i15];
                bArr[i15] = b10;
                i16++;
                i15--;
            }
            i13++;
            i12 += this.f15496d;
        }
    }

    @Override // p066dg.AbstractC6949j
    /* renamed from: b */
    public byte[] mo20096b() {
        int m20102d = m20102d();
        int m20101a = m20101a();
        int i10 = this.f15496d;
        if (m20102d == i10 && m20101a == this.f15497e) {
            return this.f15495c;
        }
        int i11 = m20102d * m20101a;
        byte[] bArr = new byte[i11];
        int i12 = (this.f15499g * i10) + this.f15498f;
        if (m20102d == i10) {
            System.arraycopy(this.f15495c, i12, bArr, 0, i11);
            return bArr;
        }
        for (int i13 = 0; i13 < m20101a; i13++) {
            System.arraycopy(this.f15495c, i12, bArr, i13 * m20102d, m20102d);
            i12 += this.f15496d;
        }
        return bArr;
    }

    @Override // p066dg.AbstractC6949j
    /* renamed from: c */
    public byte[] mo20097c(int i10, byte[] bArr) {
        if (i10 < 0 || i10 >= m20101a()) {
            throw new IllegalArgumentException("Requested row is outside the image: " + i10);
        }
        int m20102d = m20102d();
        if (bArr == null || bArr.length < m20102d) {
            bArr = new byte[m20102d];
        }
        System.arraycopy(this.f15495c, ((i10 + this.f15499g) * this.f15496d) + this.f15498f, bArr, 0, m20102d);
        return bArr;
    }
}
