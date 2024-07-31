package p216l7;

import java.nio.ByteBuffer;
import p363t8.C11137a;

/* renamed from: l7.g */
/* loaded from: classes.dex */
public abstract class AbstractC9406g implements InterfaceC9401b {
    @Override // p216l7.InterfaceC9401b
    /* renamed from: a */
    public final C9400a mo28005a(C9403d c9403d) {
        ByteBuffer byteBuffer = (ByteBuffer) C11137a.m34603e(c9403d.f32142c);
        C11137a.m34599a(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (c9403d.m38793r()) {
            return null;
        }
        return mo28014b(c9403d, byteBuffer);
    }

    /* renamed from: b */
    protected abstract C9400a mo28014b(C9403d c9403d, ByteBuffer byteBuffer);
}
