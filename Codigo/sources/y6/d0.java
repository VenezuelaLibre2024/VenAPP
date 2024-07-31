package y6;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f31713a;

    /* renamed from: b, reason: collision with root package name */
    private final int f31714b;

    /* renamed from: c, reason: collision with root package name */
    private int f31715c;

    /* renamed from: d, reason: collision with root package name */
    private int f31716d;

    public d0(byte[] bArr) {
        this.f31713a = bArr;
        this.f31714b = bArr.length;
    }

    private void a() {
        int i10;
        int i11 = this.f31715c;
        t8.a.g(i11 >= 0 && (i11 < (i10 = this.f31714b) || (i11 == i10 && this.f31716d == 0)));
    }

    public int b() {
        return (this.f31715c * 8) + this.f31716d;
    }

    public boolean c() {
        boolean z10 = (((this.f31713a[this.f31715c] & 255) >> this.f31716d) & 1) == 1;
        e(1);
        return z10;
    }

    public int d(int i10) {
        int i11 = this.f31715c;
        int min = Math.min(i10, 8 - this.f31716d);
        int i12 = i11 + 1;
        int i13 = ((this.f31713a[i11] & 255) >> this.f31716d) & (255 >> (8 - min));
        while (min < i10) {
            i13 |= (this.f31713a[i12] & 255) << min;
            min += 8;
            i12++;
        }
        int i14 = i13 & ((-1) >>> (32 - i10));
        e(i10);
        return i14;
    }

    public void e(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f31715c + i11;
        this.f31715c = i12;
        int i13 = this.f31716d + (i10 - (i11 * 8));
        this.f31716d = i13;
        if (i13 > 7) {
            this.f31715c = i12 + 1;
            this.f31716d = i13 - 8;
        }
        a();
    }
}
