package vg;

import java.util.List;
import kg.C9263a;

/* renamed from: vg.a */
/* loaded from: classes2.dex */
final class C11890a {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C9263a m38020a(List<C11891b> list) {
        int size = (list.size() * 2) - 1;
        if (list.get(list.size() - 1).m38023c() == null) {
            size--;
        }
        C9263a c9263a = new C9263a(size * 12);
        int i10 = 0;
        int m36218b = list.get(0).m38023c().m36218b();
        for (int i11 = 11; i11 >= 0; i11--) {
            if (((1 << i11) & m36218b) != 0) {
                c9263a.m27594s(i10);
            }
            i10++;
        }
        for (int i12 = 1; i12 < list.size(); i12++) {
            C11891b c11891b = list.get(i12);
            int m36218b2 = c11891b.m38022b().m36218b();
            for (int i13 = 11; i13 >= 0; i13--) {
                if (((1 << i13) & m36218b2) != 0) {
                    c9263a.m27594s(i10);
                }
                i10++;
            }
            if (c11891b.m38023c() != null) {
                int m36218b3 = c11891b.m38023c().m36218b();
                for (int i14 = 11; i14 >= 0; i14--) {
                    if (((1 << i14) & m36218b3) != 0) {
                        c9263a.m27594s(i10);
                    }
                    i10++;
                }
            }
        }
        return c9263a;
    }
}
