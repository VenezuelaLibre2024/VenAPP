package p235m7;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import p082eb.C7149e;
import p216l7.AbstractC9406g;
import p216l7.C9400a;
import p216l7.C9403d;
import p363t8.C11144d0;

/* renamed from: m7.b */
/* loaded from: classes.dex */
public final class C9551b extends AbstractC9406g {
    /* renamed from: c */
    private static C9400a m28438c(C11144d0 c11144d0) {
        c11144d0.m34642r(12);
        int m34628d = (c11144d0.m34628d() + c11144d0.m34632h(12)) - 4;
        c11144d0.m34642r(44);
        c11144d0.m34643s(c11144d0.m34632h(12));
        c11144d0.m34642r(16);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String str = null;
            if (c11144d0.m34628d() >= m34628d) {
                break;
            }
            c11144d0.m34642r(48);
            int m34632h = c11144d0.m34632h(8);
            c11144d0.m34642r(4);
            int m34628d2 = c11144d0.m34628d() + c11144d0.m34632h(12);
            String str2 = null;
            while (c11144d0.m34628d() < m34628d2) {
                int m34632h2 = c11144d0.m34632h(8);
                int m34632h3 = c11144d0.m34632h(8);
                int m34628d3 = c11144d0.m34628d() + m34632h3;
                if (m34632h2 == 2) {
                    int m34632h4 = c11144d0.m34632h(16);
                    c11144d0.m34642r(8);
                    if (m34632h4 != 3) {
                    }
                    while (c11144d0.m34628d() < m34628d3) {
                        str = c11144d0.m34636l(c11144d0.m34632h(8), C7149e.f16017a);
                        int m34632h5 = c11144d0.m34632h(8);
                        for (int i10 = 0; i10 < m34632h5; i10++) {
                            c11144d0.m34643s(c11144d0.m34632h(8));
                        }
                    }
                } else if (m34632h2 == 21) {
                    str2 = c11144d0.m34636l(m34632h3, C7149e.f16017a);
                }
                c11144d0.m34640p(m34628d3 * 8);
            }
            c11144d0.m34640p(m34628d2 * 8);
            if (str != null && str2 != null) {
                arrayList.add(new C9550a(m34632h, str + str2));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C9400a(arrayList);
    }

    @Override // p216l7.AbstractC9406g
    /* renamed from: b */
    protected C9400a mo28014b(C9403d c9403d, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return m28438c(new C11144d0(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }
}
