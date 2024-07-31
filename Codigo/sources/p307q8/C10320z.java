package p307q8;

import android.os.SystemClock;
import com.google.common.collect.AbstractC5907w;
import java.util.Arrays;
import java.util.List;
import p307q8.AbstractC10314t;
import p351s8.InterfaceC10816d0;
import p361t6.C11048i4;
import p397v7.C11694d1;
import p397v7.C11700f1;

/* renamed from: q8.z */
/* loaded from: classes.dex */
public final class C10320z {
    /* renamed from: a */
    public static C11048i4 m31108a(AbstractC10314t.a aVar, List<? extends InterfaceC10315u>[] listArr) {
        boolean z10;
        AbstractC5907w.a aVar2 = new AbstractC5907w.a();
        for (int i10 = 0; i10 < aVar.m31043d(); i10++) {
            C11700f1 m31045f = aVar.m31045f(i10);
            List<? extends InterfaceC10315u> list = listArr[i10];
            for (int i11 = 0; i11 < m31045f.f30692a; i11++) {
                C11694d1 m36857c = m31045f.m36857c(i11);
                boolean z11 = aVar.m31040a(i10, i11, false) != 0;
                int i12 = m36857c.f30658a;
                int[] iArr = new int[i12];
                boolean[] zArr = new boolean[i12];
                for (int i13 = 0; i13 < m36857c.f30658a; i13++) {
                    iArr[i13] = aVar.m31046g(i10, i11, i13);
                    int i14 = 0;
                    while (true) {
                        if (i14 >= list.size()) {
                            z10 = false;
                            break;
                        }
                        InterfaceC10315u interfaceC10315u = list.get(i14);
                        if (interfaceC10315u.mo30884d().equals(m36857c) && interfaceC10315u.mo30883c(i13) != -1) {
                            z10 = true;
                            break;
                        }
                        i14++;
                    }
                    zArr[i13] = z10;
                }
                aVar2.mo14724a(new C11048i4.a(m36857c, z11, iArr, zArr));
            }
        }
        C11700f1 m31047h = aVar.m31047h();
        for (int i15 = 0; i15 < m31047h.f30692a; i15++) {
            C11694d1 m36857c2 = m31047h.m36857c(i15);
            int[] iArr2 = new int[m36857c2.f30658a];
            Arrays.fill(iArr2, 0);
            aVar2.mo14724a(new C11048i4.a(m36857c2, false, iArr2, new boolean[m36857c2.f30658a]));
        }
        return new C11048i4(aVar2.m15094k());
    }

    /* renamed from: b */
    public static C11048i4 m31109b(AbstractC10314t.a aVar, InterfaceC10315u[] interfaceC10315uArr) {
        List[] listArr = new List[interfaceC10315uArr.length];
        for (int i10 = 0; i10 < interfaceC10315uArr.length; i10++) {
            InterfaceC10315u interfaceC10315u = interfaceC10315uArr[i10];
            listArr[i10] = interfaceC10315u != null ? AbstractC5907w.m15082w(interfaceC10315u) : AbstractC5907w.m15081v();
        }
        return m31108a(aVar, listArr);
    }

    /* renamed from: c */
    public static InterfaceC10816d0.a m31110c(InterfaceC10312r interfaceC10312r) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = interfaceC10312r.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (interfaceC10312r.mo30887j(i11, elapsedRealtime)) {
                i10++;
            }
        }
        return new InterfaceC10816d0.a(1, 0, length, i10);
    }
}
