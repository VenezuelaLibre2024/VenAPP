package t;

import android.util.Size;
import androidx.camera.core.impl.d2;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    private final s.o f25707a;

    public q() {
        this((s.o) s.l.a(s.o.class));
    }

    q(s.o oVar) {
        this.f25707a = oVar;
    }

    public List<Size> a(d2.b bVar, List<Size> list) {
        Size a10;
        s.o oVar = this.f25707a;
        if (oVar == null || (a10 = oVar.a(bVar)) == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(a10);
        for (Size size : list) {
            if (!size.equals(a10)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }
}
