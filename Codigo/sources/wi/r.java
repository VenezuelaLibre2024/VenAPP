package wi;

import io.grpc.internal.l2;
import java.util.List;
import java.util.logging.Logger;
import vi.k0;
import vi.w0;

/* loaded from: classes3.dex */
class r {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f30170a = Logger.getLogger(r.class.getName());

    private r() {
    }

    public static w0 a(List<xi.d> list) {
        return k0.c(b(list));
    }

    private static byte[][] b(List<xi.d> list) {
        byte[][] bArr = new byte[list.size() * 2];
        int i10 = 0;
        for (xi.d dVar : list) {
            int i11 = i10 + 1;
            bArr[i10] = dVar.f31324a.E();
            i10 = i11 + 1;
            bArr[i11] = dVar.f31325b.E();
        }
        return l2.e(bArr);
    }

    public static w0 c(List<xi.d> list) {
        return k0.c(b(list));
    }
}
