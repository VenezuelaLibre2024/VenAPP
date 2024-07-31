package n7;

import java.nio.ByteBuffer;
import java.util.Arrays;
import l7.d;
import l7.g;
import t8.e0;

/* loaded from: classes.dex */
public final class b extends g {
    @Override // l7.g
    protected l7.a b(d dVar, ByteBuffer byteBuffer) {
        return new l7.a(c(new e0(byteBuffer.array(), byteBuffer.limit())));
    }

    public a c(e0 e0Var) {
        return new a((String) t8.a.e(e0Var.B()), (String) t8.a.e(e0Var.B()), e0Var.A(), e0Var.A(), Arrays.copyOfRange(e0Var.e(), e0Var.f(), e0Var.g()));
    }
}
