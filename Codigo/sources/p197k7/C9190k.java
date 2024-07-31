package p197k7;

import java.util.NoSuchElementException;

/* renamed from: k7.k */
/* loaded from: classes.dex */
final class C9190k {

    /* renamed from: a */
    private int f22228a = 0;

    /* renamed from: b */
    private int f22229b = -1;

    /* renamed from: c */
    private int f22230c = 0;

    /* renamed from: d */
    private int[] f22231d = new int[16];

    /* renamed from: e */
    private int f22232e;

    public C9190k() {
        this.f22232e = r0.length - 1;
    }

    /* renamed from: c */
    private void m27253c() {
        int[] iArr = this.f22231d;
        int length = iArr.length << 1;
        if (length < 0) {
            throw new IllegalStateException();
        }
        int[] iArr2 = new int[length];
        int length2 = iArr.length;
        int i10 = this.f22228a;
        int i11 = length2 - i10;
        System.arraycopy(iArr, i10, iArr2, 0, i11);
        System.arraycopy(this.f22231d, 0, iArr2, i11, i10);
        this.f22228a = 0;
        this.f22229b = this.f22230c - 1;
        this.f22231d = iArr2;
        this.f22232e = iArr2.length - 1;
    }

    /* renamed from: a */
    public void m27254a(int i10) {
        if (this.f22230c == this.f22231d.length) {
            m27253c();
        }
        int i11 = (this.f22229b + 1) & this.f22232e;
        this.f22229b = i11;
        this.f22231d[i11] = i10;
        this.f22230c++;
    }

    /* renamed from: b */
    public void m27255b() {
        this.f22228a = 0;
        this.f22229b = -1;
        this.f22230c = 0;
    }

    /* renamed from: d */
    public boolean m27256d() {
        return this.f22230c == 0;
    }

    /* renamed from: e */
    public int m27257e() {
        int i10 = this.f22230c;
        if (i10 == 0) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.f22231d;
        int i11 = this.f22228a;
        int i12 = iArr[i11];
        this.f22228a = (i11 + 1) & this.f22232e;
        this.f22230c = i10 - 1;
        return i12;
    }
}
