package v6;

import java.nio.ByteBuffer;
import v6.i;

/* loaded from: classes.dex */
final class a0 extends z {

    /* renamed from: i, reason: collision with root package name */
    private int[] f27943i;

    /* renamed from: j, reason: collision with root package name */
    private int[] f27944j;

    @Override // v6.i
    public void d(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) t8.a.e(this.f27944j);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer l10 = l(((limit - position) / this.f28229b.f28064d) * this.f28230c.f28064d);
        while (position < limit) {
            for (int i10 : iArr) {
                l10.putShort(byteBuffer.getShort((i10 * 2) + position));
            }
            position += this.f28229b.f28064d;
        }
        byteBuffer.position(limit);
        l10.flip();
    }

    @Override // v6.z
    public i.a h(i.a aVar) {
        int[] iArr = this.f27943i;
        if (iArr == null) {
            return i.a.f28060e;
        }
        if (aVar.f28063c != 2) {
            throw new i.b(aVar);
        }
        boolean z10 = aVar.f28062b != iArr.length;
        int i10 = 0;
        while (i10 < iArr.length) {
            int i11 = iArr[i10];
            if (i11 >= aVar.f28062b) {
                throw new i.b(aVar);
            }
            z10 |= i11 != i10;
            i10++;
        }
        return z10 ? new i.a(aVar.f28061a, iArr.length, 2) : i.a.f28060e;
    }

    @Override // v6.z
    protected void i() {
        this.f27944j = this.f27943i;
    }

    @Override // v6.z
    protected void k() {
        this.f27944j = null;
        this.f27943i = null;
    }

    public void m(int[] iArr) {
        this.f27943i = iArr;
    }
}
