package p354t;

import android.util.Size;
import androidx.camera.core.impl.AbstractC0612d2;
import java.util.ArrayList;
import java.util.List;
import p342s.C10750l;
import p342s.C10753o;

/* renamed from: t.q */
/* loaded from: classes.dex */
public class C10952q {

    /* renamed from: a */
    private final C10753o f27851a;

    public C10952q() {
        this((C10753o) C10750l.m32699a(C10753o.class));
    }

    C10952q(C10753o c10753o) {
        this.f27851a = c10753o;
    }

    /* renamed from: a */
    public List<Size> m33433a(AbstractC0612d2.b bVar, List<Size> list) {
        Size m32716a;
        C10753o c10753o = this.f27851a;
        if (c10753o == null || (m32716a = c10753o.m32716a(bVar)) == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(m32716a);
        for (Size size : list) {
            if (!size.equals(m32716a)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }
}
