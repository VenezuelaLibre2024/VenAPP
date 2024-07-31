package p250n7;

import java.nio.ByteBuffer;
import java.util.Arrays;
import p216l7.AbstractC9406g;
import p216l7.C9400a;
import p216l7.C9403d;
import p363t8.C11137a;
import p363t8.C11146e0;

/* renamed from: n7.b */
/* loaded from: classes.dex */
public final class C9673b extends AbstractC9406g {
    @Override // p216l7.AbstractC9406g
    /* renamed from: b */
    protected C9400a mo28014b(C9403d c9403d, ByteBuffer byteBuffer) {
        return new C9400a(m28983c(new C11146e0(byteBuffer.array(), byteBuffer.limit())));
    }

    /* renamed from: c */
    public C9672a m28983c(C11146e0 c11146e0) {
        return new C9672a((String) C11137a.m34603e(c11146e0.m34658B()), (String) C11137a.m34603e(c11146e0.m34658B()), c11146e0.m34657A(), c11146e0.m34657A(), Arrays.copyOfRange(c11146e0.m34682e(), c11146e0.m34683f(), c11146e0.m34684g()));
    }
}
