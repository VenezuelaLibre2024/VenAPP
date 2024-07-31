package m7;

import eb.e;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import l7.d;
import l7.g;
import t8.d0;

/* loaded from: classes.dex */
public final class b extends g {
    private static l7.a c(d0 d0Var) {
        d0Var.r(12);
        int d10 = (d0Var.d() + d0Var.h(12)) - 4;
        d0Var.r(44);
        d0Var.s(d0Var.h(12));
        d0Var.r(16);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String str = null;
            if (d0Var.d() >= d10) {
                break;
            }
            d0Var.r(48);
            int h10 = d0Var.h(8);
            d0Var.r(4);
            int d11 = d0Var.d() + d0Var.h(12);
            String str2 = null;
            while (d0Var.d() < d11) {
                int h11 = d0Var.h(8);
                int h12 = d0Var.h(8);
                int d12 = d0Var.d() + h12;
                if (h11 == 2) {
                    int h13 = d0Var.h(16);
                    d0Var.r(8);
                    if (h13 != 3) {
                    }
                    while (d0Var.d() < d12) {
                        str = d0Var.l(d0Var.h(8), e.f14594a);
                        int h14 = d0Var.h(8);
                        for (int i10 = 0; i10 < h14; i10++) {
                            d0Var.s(d0Var.h(8));
                        }
                    }
                } else if (h11 == 21) {
                    str2 = d0Var.l(h12, e.f14594a);
                }
                d0Var.p(d12 * 8);
            }
            d0Var.p(d11 * 8);
            if (str != null && str2 != null) {
                arrayList.add(new a(h10, str + str2));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new l7.a(arrayList);
    }

    @Override // l7.g
    protected l7.a b(d dVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return c(new d0(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }
}
