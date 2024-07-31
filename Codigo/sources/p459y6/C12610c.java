package p459y6;

import java.util.Arrays;
import p363t8.C11172r0;
import p459y6.InterfaceC12636z;

/* renamed from: y6.c */
/* loaded from: classes.dex */
public final class C12610c implements InterfaceC12636z {

    /* renamed from: a */
    public final int f34229a;

    /* renamed from: b */
    public final int[] f34230b;

    /* renamed from: c */
    public final long[] f34231c;

    /* renamed from: d */
    public final long[] f34232d;

    /* renamed from: e */
    public final long[] f34233e;

    /* renamed from: f */
    private final long f34234f;

    public C12610c(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f34230b = iArr;
        this.f34231c = jArr;
        this.f34232d = jArr2;
        this.f34233e = jArr3;
        int length = iArr.length;
        this.f34229a = length;
        if (length > 0) {
            this.f34234f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f34234f = 0L;
        }
    }

    /* renamed from: a */
    public int m41513a(long j10) {
        return C11172r0.m34926i(this.f34233e, j10, true, true);
    }

    @Override // p459y6.InterfaceC12636z
    /* renamed from: d */
    public InterfaceC12636z.a mo125d(long j10) {
        int m41513a = m41513a(j10);
        C12607a0 c12607a0 = new C12607a0(this.f34233e[m41513a], this.f34231c[m41513a]);
        if (c12607a0.f34223a >= j10 || m41513a == this.f34229a - 1) {
            return new InterfaceC12636z.a(c12607a0);
        }
        int i10 = m41513a + 1;
        return new InterfaceC12636z.a(c12607a0, new C12607a0(this.f34233e[i10], this.f34231c[i10]));
    }

    @Override // p459y6.InterfaceC12636z
    /* renamed from: h */
    public boolean mo126h() {
        return true;
    }

    @Override // p459y6.InterfaceC12636z
    /* renamed from: i */
    public long mo127i() {
        return this.f34234f;
    }

    public String toString() {
        return "ChunkIndex(length=" + this.f34229a + ", sizes=" + Arrays.toString(this.f34230b) + ", offsets=" + Arrays.toString(this.f34231c) + ", timeUs=" + Arrays.toString(this.f34233e) + ", durationsUs=" + Arrays.toString(this.f34232d) + ")";
    }
}
