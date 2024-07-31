package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.camera2.internal.compat.C0434h;
import androidx.camera.camera2.internal.compat.C0455r0;
import androidx.camera.core.impl.InterfaceC0602b0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p407w.C12027n0;
import p407w.C12030p;
import p407w.C12034r;
import p407w.InterfaceC12028o;

/* renamed from: androidx.camera.camera2.internal.o1 */
/* loaded from: classes.dex */
class C0529o1 {
    /* renamed from: a */
    private static String m2594a(C0455r0 c0455r0, Integer num, List<String> list) {
        if (num == null || !list.contains("0") || !list.contains("1")) {
            return null;
        }
        if (num.intValue() == 1) {
            if (((Integer) c0455r0.m2276c("0").m2215a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                return "1";
            }
            return null;
        }
        if (num.intValue() == 0 && ((Integer) c0455r0.m2276c("1").m2215a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
            return "0";
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static List<String> m2595b(C0567w c0567w, C12030p c12030p) {
        String str;
        try {
            ArrayList arrayList = new ArrayList();
            List<String> asList = Arrays.asList(c0567w.mo2801c().m2277d());
            if (c12030p == null) {
                Iterator it = asList.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) it.next());
                }
                return arrayList;
            }
            try {
                str = m2594a(c0567w.mo2801c(), c12030p.m38653d(), asList);
            } catch (IllegalStateException unused) {
                str = null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (String str2 : asList) {
                if (!str2.equals(str)) {
                    arrayList2.add(c0567w.m2803f(str2));
                }
            }
            Iterator<InterfaceC12028o> it2 = c12030p.m38651b(arrayList2).iterator();
            while (it2.hasNext()) {
                arrayList.add(((InterfaceC0602b0) it2.next()).mo2559b());
            }
            return arrayList;
        } catch (C0434h e10) {
            throw new C12027n0(C0539q1.m2610a(e10));
        } catch (C12034r e11) {
            throw new C12027n0(e11);
        }
    }
}
