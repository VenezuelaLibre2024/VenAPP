package i0;

import android.util.Size;
import androidx.camera.core.impl.f1;
import androidx.camera.core.impl.k2;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
class a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<Size> a(List<Size> list, Size size, Set<k2<?>> set) {
        Iterator<k2<?>> it = set.iterator();
        while (it.hasNext()) {
            List<Size> list2 = (List) it.next().g(f1.f2471q, null);
            if (list2 != null) {
                return list2;
            }
        }
        return list;
    }
}
