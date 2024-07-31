package p396v6;

import java.nio.ByteBuffer;
import p363t8.C11137a;
import p396v6.InterfaceC11647i;

/* renamed from: v6.a0 */
/* loaded from: classes.dex */
final class C11632a0 extends AbstractC11681z {

    /* renamed from: i */
    private int[] f30267i;

    /* renamed from: j */
    private int[] f30268j;

    @Override // p396v6.InterfaceC11647i
    /* renamed from: d */
    public void mo36464d(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) C11137a.m34603e(this.f30268j);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer m36798l = m36798l(((limit - position) / this.f30598b.f30414d) * this.f30599c.f30414d);
        while (position < limit) {
            for (int i10 : iArr) {
                m36798l.putShort(byteBuffer.getShort((i10 * 2) + position));
            }
            position += this.f30598b.f30414d;
        }
        byteBuffer.position(limit);
        m36798l.flip();
    }

    @Override // p396v6.AbstractC11681z
    /* renamed from: h */
    public InterfaceC11647i.a mo36465h(InterfaceC11647i.a aVar) {
        int[] iArr = this.f30267i;
        if (iArr == null) {
            return InterfaceC11647i.a.f30410e;
        }
        if (aVar.f30413c != 2) {
            throw new InterfaceC11647i.b(aVar);
        }
        boolean z10 = aVar.f30412b != iArr.length;
        int i10 = 0;
        while (i10 < iArr.length) {
            int i11 = iArr[i10];
            if (i11 >= aVar.f30412b) {
                throw new InterfaceC11647i.b(aVar);
            }
            z10 |= i11 != i10;
            i10++;
        }
        return z10 ? new InterfaceC11647i.a(aVar.f30411a, iArr.length, 2) : InterfaceC11647i.a.f30410e;
    }

    @Override // p396v6.AbstractC11681z
    /* renamed from: i */
    protected void mo36466i() {
        this.f30268j = this.f30267i;
    }

    @Override // p396v6.AbstractC11681z
    /* renamed from: k */
    protected void mo36467k() {
        this.f30268j = null;
        this.f30267i = null;
    }

    /* renamed from: m */
    public void m36468m(int[] iArr) {
        this.f30267i = iArr;
    }
}
