package p425wi;

import io.grpc.internal.C8872l2;
import java.util.List;
import java.util.logging.Logger;
import p448xi.C12491d;
import vi.C11926k0;
import vi.C11953w0;

/* renamed from: wi.r */
/* loaded from: classes3.dex */
class C12217r {

    /* renamed from: a */
    private static final Logger f32682a = Logger.getLogger(C12217r.class.getName());

    private C12217r() {
    }

    /* renamed from: a */
    public static C11953w0 m39342a(List<C12491d> list) {
        return C11926k0.m38190c(m39343b(list));
    }

    /* renamed from: b */
    private static byte[][] m39343b(List<C12491d> list) {
        byte[][] bArr = new byte[list.size() * 2];
        int i10 = 0;
        for (C12491d c12491d : list) {
            int i11 = i10 + 1;
            bArr[i10] = c12491d.f33844a.mo20759E();
            i10 = i11 + 1;
            bArr[i11] = c12491d.f33845b.mo20759E();
        }
        return C8872l2.m25668e(bArr);
    }

    /* renamed from: c */
    public static C11953w0 m39344c(List<C12491d> list) {
        return C11926k0.m38190c(m39343b(list));
    }
}
