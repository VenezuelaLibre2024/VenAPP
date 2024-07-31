package kg;

/* renamed from: kg.c */
/* loaded from: classes2.dex */
public final class C9265c {

    /* renamed from: a */
    private final byte[] f22487a;

    /* renamed from: b */
    private int f22488b;

    /* renamed from: c */
    private int f22489c;

    public C9265c(byte[] bArr) {
        this.f22487a = bArr;
    }

    /* renamed from: a */
    public int m27616a() {
        return ((this.f22487a.length - this.f22488b) * 8) - this.f22489c;
    }

    /* renamed from: b */
    public int m27617b() {
        return this.f22489c;
    }

    /* renamed from: c */
    public int m27618c() {
        return this.f22488b;
    }

    /* renamed from: d */
    public int m27619d(int i10) {
        if (i10 < 1 || i10 > 32 || i10 > m27616a()) {
            throw new IllegalArgumentException(String.valueOf(i10));
        }
        int i11 = this.f22489c;
        int i12 = 0;
        if (i11 > 0) {
            int i13 = 8 - i11;
            int min = Math.min(i10, i13);
            int i14 = i13 - min;
            byte[] bArr = this.f22487a;
            int i15 = this.f22488b;
            int i16 = (((255 >> (8 - min)) << i14) & bArr[i15]) >> i14;
            i10 -= min;
            int i17 = this.f22489c + min;
            this.f22489c = i17;
            if (i17 == 8) {
                this.f22489c = 0;
                this.f22488b = i15 + 1;
            }
            i12 = i16;
        }
        if (i10 <= 0) {
            return i12;
        }
        while (i10 >= 8) {
            int i18 = i12 << 8;
            byte[] bArr2 = this.f22487a;
            int i19 = this.f22488b;
            i12 = (bArr2[i19] & 255) | i18;
            this.f22488b = i19 + 1;
            i10 -= 8;
        }
        if (i10 <= 0) {
            return i12;
        }
        int i20 = 8 - i10;
        int i21 = (i12 << i10) | ((((255 >> i20) << i20) & this.f22487a[this.f22488b]) >> i20);
        this.f22489c += i10;
        return i21;
    }
}
