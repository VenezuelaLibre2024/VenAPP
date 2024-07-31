package t;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.impl.l0;
import androidx.camera.core.impl.r0;
import java.util.Iterator;
import java.util.List;
import q.a;
import s.h0;

/* loaded from: classes.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f25712a;

    public u() {
        this.f25712a = s.l.a(h0.class) != null;
    }

    public l0 a(l0 l0Var) {
        l0.a aVar = new l0.a();
        aVar.r(l0Var.h());
        Iterator<r0> it = l0Var.f().iterator();
        while (it.hasNext()) {
            aVar.f(it.next());
        }
        aVar.e(l0Var.e());
        a.C0388a c0388a = new a.C0388a();
        c0388a.e(CaptureRequest.FLASH_MODE, 0);
        aVar.e(c0388a.c());
        return aVar.h();
    }

    public boolean b(List<CaptureRequest> list, boolean z10) {
        if (!this.f25712a || !z10) {
            return false;
        }
        Iterator<CaptureRequest> it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next().get(CaptureRequest.FLASH_MODE);
            if (num != null && num.intValue() == 2) {
                return true;
            }
        }
        return false;
    }
}
