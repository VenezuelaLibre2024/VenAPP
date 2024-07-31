package p066dg;

/* renamed from: dg.j */
/* loaded from: classes2.dex */
public abstract class AbstractC6949j {

    /* renamed from: a */
    private final int f15488a;

    /* renamed from: b */
    private final int f15489b;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC6949j(int i10, int i11) {
        this.f15488a = i10;
        this.f15489b = i11;
    }

    /* renamed from: a */
    public final int m20101a() {
        return this.f15489b;
    }

    /* renamed from: b */
    public abstract byte[] mo20096b();

    /* renamed from: c */
    public abstract byte[] mo20097c(int i10, byte[] bArr);

    /* renamed from: d */
    public final int m20102d() {
        return this.f15488a;
    }

    /* renamed from: e */
    public AbstractC6949j mo20098e() {
        return new C6948i(this);
    }

    /* renamed from: f */
    public boolean mo20099f() {
        return false;
    }

    /* renamed from: g */
    public AbstractC6949j mo20100g() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    public final String toString() {
        int i10 = this.f15488a;
        byte[] bArr = new byte[i10];
        StringBuilder sb2 = new StringBuilder(this.f15489b * (i10 + 1));
        for (int i11 = 0; i11 < this.f15489b; i11++) {
            bArr = mo20097c(i11, bArr);
            for (int i12 = 0; i12 < this.f15488a; i12++) {
                int i13 = bArr[i12] & 255;
                sb2.append(i13 < 64 ? '#' : i13 < 128 ? '+' : i13 < 192 ? '.' : ' ');
            }
            sb2.append('\n');
        }
        return sb2.toString();
    }
}
