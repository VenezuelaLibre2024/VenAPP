package l7;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class g implements b {
    @Override // l7.b
    public final a a(d dVar) {
        ByteBuffer byteBuffer = (ByteBuffer) t8.a.e(dVar.f29679c);
        t8.a.a(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (dVar.r()) {
            return null;
        }
        return b(dVar, byteBuffer);
    }

    protected abstract a b(d dVar, ByteBuffer byteBuffer);
}
