package kg;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f20665a;

    /* renamed from: b, reason: collision with root package name */
    private int f20666b;

    /* renamed from: c, reason: collision with root package name */
    private int f20667c;

    public c(byte[] bArr) {
        this.f20665a = bArr;
    }

    public int a() {
        return ((this.f20665a.length - this.f20666b) * 8) - this.f20667c;
    }

    public int b() {
        return this.f20667c;
    }

    public int c() {
        return this.f20666b;
    }

    public int d(int i10) {
        if (i10 < 1 || i10 > 32 || i10 > a()) {
            throw new IllegalArgumentException(String.valueOf(i10));
        }
        int i11 = this.f20667c;
        int i12 = 0;
        if (i11 > 0) {
            int i13 = 8 - i11;
            int min = Math.min(i10, i13);
            int i14 = i13 - min;
            byte[] bArr = this.f20665a;
            int i15 = this.f20666b;
            int i16 = (((255 >> (8 - min)) << i14) & bArr[i15]) >> i14;
            i10 -= min;
            int i17 = this.f20667c + min;
            this.f20667c = i17;
            if (i17 == 8) {
                this.f20667c = 0;
                this.f20666b = i15 + 1;
            }
            i12 = i16;
        }
        if (i10 <= 0) {
            return i12;
        }
        while (i10 >= 8) {
            int i18 = i12 << 8;
            byte[] bArr2 = this.f20665a;
            int i19 = this.f20666b;
            i12 = (bArr2[i19] & 255) | i18;
            this.f20666b = i19 + 1;
            i10 -= 8;
        }
        if (i10 <= 0) {
            return i12;
        }
        int i20 = 8 - i10;
        int i21 = (i12 << i10) | ((((255 >> i20) << i20) & this.f20665a[this.f20666b]) >> i20);
        this.f20667c += i10;
        return i21;
    }
}
