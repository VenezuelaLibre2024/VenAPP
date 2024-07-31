package p396v6;

import java.nio.ByteBuffer;
import p363t8.C11172r0;
import p396v6.InterfaceC11647i;

/* renamed from: v6.q0 */
/* loaded from: classes.dex */
final class C11664q0 extends AbstractC11681z {

    /* renamed from: i */
    private static final int f30446i = Float.floatToIntBits(Float.NaN);

    /* renamed from: m */
    private static void m36651m(int i10, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i10 * 4.656612875245797E-10d));
        if (floatToIntBits == f30446i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // p396v6.InterfaceC11647i
    /* renamed from: d */
    public void mo36464d(ByteBuffer byteBuffer) {
        ByteBuffer m36798l;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        int i11 = this.f30598b.f30413c;
        if (i11 == 536870912) {
            m36798l = m36798l((i10 / 3) * 4);
            while (position < limit) {
                m36651m(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), m36798l);
                position += 3;
            }
        } else {
            if (i11 != 805306368) {
                throw new IllegalStateException();
            }
            m36798l = m36798l(i10);
            while (position < limit) {
                m36651m((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), m36798l);
                position += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        m36798l.flip();
    }

    @Override // p396v6.AbstractC11681z
    /* renamed from: h */
    public InterfaceC11647i.a mo36465h(InterfaceC11647i.a aVar) {
        int i10 = aVar.f30413c;
        if (C11172r0.m34949t0(i10)) {
            return i10 != 4 ? new InterfaceC11647i.a(aVar.f30411a, aVar.f30412b, 4) : InterfaceC11647i.a.f30410e;
        }
        throw new InterfaceC11647i.b(aVar);
    }
}
