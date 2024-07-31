package p155i7;

import java.util.Arrays;
import p363t8.C11137a;

/* renamed from: i7.u */
/* loaded from: classes.dex */
final class C7893u {

    /* renamed from: a */
    private final int f19175a;

    /* renamed from: b */
    private boolean f19176b;

    /* renamed from: c */
    private boolean f19177c;

    /* renamed from: d */
    public byte[] f19178d;

    /* renamed from: e */
    public int f19179e;

    public C7893u(int i10, int i11) {
        this.f19175a = i10;
        byte[] bArr = new byte[i11 + 3];
        this.f19178d = bArr;
        bArr[2] = 1;
    }

    /* renamed from: a */
    public void m24333a(byte[] bArr, int i10, int i11) {
        if (this.f19176b) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f19178d;
            int length = bArr2.length;
            int i13 = this.f19179e;
            if (length < i13 + i12) {
                this.f19178d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
            }
            System.arraycopy(bArr, i10, this.f19178d, this.f19179e, i12);
            this.f19179e += i12;
        }
    }

    /* renamed from: b */
    public boolean m24334b(int i10) {
        if (!this.f19176b) {
            return false;
        }
        this.f19179e -= i10;
        this.f19176b = false;
        this.f19177c = true;
        return true;
    }

    /* renamed from: c */
    public boolean m24335c() {
        return this.f19177c;
    }

    /* renamed from: d */
    public void m24336d() {
        this.f19176b = false;
        this.f19177c = false;
    }

    /* renamed from: e */
    public void m24337e(int i10) {
        C11137a.m34605g(!this.f19176b);
        boolean z10 = i10 == this.f19175a;
        this.f19176b = z10;
        if (z10) {
            this.f19179e = 3;
            this.f19177c = false;
        }
    }
}
