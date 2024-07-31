package p148i0;

import android.util.Size;
import androidx.camera.core.impl.InterfaceC0619f1;
import androidx.camera.core.impl.InterfaceC0640k2;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: i0.a */
/* loaded from: classes.dex */
class C7759a {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static List<Size> m23680a(List<Size> list, Size size, Set<InterfaceC0640k2<?>> set) {
        Iterator<InterfaceC0640k2<?>> it = set.iterator();
        while (it.hasNext()) {
            List<Size> list2 = (List) it.next().mo3197g(InterfaceC0619f1.f2809q, null);
            if (list2 != null) {
                return list2;
            }
        }
        return list;
    }
}
