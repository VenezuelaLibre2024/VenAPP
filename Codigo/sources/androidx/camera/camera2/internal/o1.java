package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class o1 {
    private static String a(androidx.camera.camera2.internal.compat.r0 r0Var, Integer num, List<String> list) {
        if (num == null || !list.contains("0") || !list.contains("1")) {
            return null;
        }
        if (num.intValue() == 1) {
            if (((Integer) r0Var.c("0").a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                return "1";
            }
            return null;
        }
        if (num.intValue() == 0 && ((Integer) r0Var.c("1").a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
            return "0";
        }
        return null;
    }

    public static List<String> b(w wVar, w.p pVar) {
        String str;
        try {
            ArrayList arrayList = new ArrayList();
            List<String> asList = Arrays.asList(wVar.c().d());
            if (pVar == null) {
                Iterator it = asList.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) it.next());
                }
                return arrayList;
            }
            try {
                str = a(wVar.c(), pVar.d(), asList);
            } catch (IllegalStateException unused) {
                str = null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (String str2 : asList) {
                if (!str2.equals(str)) {
                    arrayList2.add(wVar.f(str2));
                }
            }
            Iterator<w.o> it2 = pVar.b(arrayList2).iterator();
            while (it2.hasNext()) {
                arrayList.add(((androidx.camera.core.impl.b0) it2.next()).b());
            }
            return arrayList;
        } catch (androidx.camera.camera2.internal.compat.h e10) {
            throw new w.n0(q1.a(e10));
        } catch (w.r e11) {
            throw new w.n0(e11);
        }
    }
}
