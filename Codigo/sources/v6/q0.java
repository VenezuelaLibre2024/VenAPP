package v6;

import java.nio.ByteBuffer;
import v6.i;

/* loaded from: classes.dex */
final class q0 extends z {

    /* renamed from: i, reason: collision with root package name */
    private static final int f28096i = Float.floatToIntBits(Float.NaN);

    private static void m(int i10, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i10 * 4.656612875245797E-10d));
        if (floatToIntBits == f28096i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // v6.i
    public void d(ByteBuffer byteBuffer) {
        ByteBuffer l10;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        int i11 = this.f28229b.f28063c;
        if (i11 == 536870912) {
            l10 = l((i10 / 3) * 4);
            while (position < limit) {
                m(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), l10);
                position += 3;
            }
        } else {
            if (i11 != 805306368) {
                throw new IllegalStateException();
            }
            l10 = l(i10);
            while (position < limit) {
                m((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), l10);
                position += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        l10.flip();
    }

    @Override // v6.z
    public i.a h(i.a aVar) {
        int i10 = aVar.f28063c;
        if (t8.r0.t0(i10)) {
            return i10 != 4 ? new i.a(aVar.f28061a, aVar.f28062b, 4) : i.a.f28060e;
        }
        throw new i.b(aVar);
    }
}
