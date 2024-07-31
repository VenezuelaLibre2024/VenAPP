package p354t;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.impl.AbstractC0661r0;
import androidx.camera.core.impl.C0642l0;
import java.util.Iterator;
import java.util.List;
import p298q.C10214a;
import p342s.C10743h0;
import p342s.C10750l;

/* renamed from: t.u */
/* loaded from: classes.dex */
public class C10956u {

    /* renamed from: a */
    private final boolean f27856a;

    public C10956u() {
        this.f27856a = C10750l.m32699a(C10743h0.class) != null;
    }

    /* renamed from: a */
    public C0642l0 m33437a(C0642l0 c0642l0) {
        C0642l0.a aVar = new C0642l0.a();
        aVar.m3175r(c0642l0.m3156h());
        Iterator<AbstractC0661r0> it = c0642l0.m3154f().iterator();
        while (it.hasNext()) {
            aVar.m3165f(it.next());
        }
        aVar.m3164e(c0642l0.m3153e());
        C10214a.a aVar2 = new C10214a.a();
        aVar2.m30571e(CaptureRequest.FLASH_MODE, 0);
        aVar.m3164e(aVar2.m30569c());
        return aVar.m3167h();
    }

    /* renamed from: b */
    public boolean m33438b(List<CaptureRequest> list, boolean z10) {
        if (!this.f27856a || !z10) {
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
