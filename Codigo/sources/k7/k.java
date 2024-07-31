package k7;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class k {

    /* renamed from: a, reason: collision with root package name */
    private int f20446a = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f20447b = -1;

    /* renamed from: c, reason: collision with root package name */
    private int f20448c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int[] f20449d = new int[16];

    /* renamed from: e, reason: collision with root package name */
    private int f20450e;

    public k() {
        this.f20450e = r0.length - 1;
    }

    private void c() {
        int[] iArr = this.f20449d;
        int length = iArr.length << 1;
        if (length < 0) {
            throw new IllegalStateException();
        }
        int[] iArr2 = new int[length];
        int length2 = iArr.length;
        int i10 = this.f20446a;
        int i11 = length2 - i10;
        System.arraycopy(iArr, i10, iArr2, 0, i11);
        System.arraycopy(this.f20449d, 0, iArr2, i11, i10);
        this.f20446a = 0;
        this.f20447b = this.f20448c - 1;
        this.f20449d = iArr2;
        this.f20450e = iArr2.length - 1;
    }

    public void a(int i10) {
        if (this.f20448c == this.f20449d.length) {
            c();
        }
        int i11 = (this.f20447b + 1) & this.f20450e;
        this.f20447b = i11;
        this.f20449d[i11] = i10;
        this.f20448c++;
    }

    public void b() {
        this.f20446a = 0;
        this.f20447b = -1;
        this.f20448c = 0;
    }

    public boolean d() {
        return this.f20448c == 0;
    }

    public int e() {
        int i10 = this.f20448c;
        if (i10 == 0) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.f20449d;
        int i11 = this.f20446a;
        int i12 = iArr[i11];
        this.f20446a = (i11 + 1) & this.f20450e;
        this.f20448c = i10 - 1;
        return i12;
    }
}
