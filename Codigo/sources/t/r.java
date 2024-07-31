package t;

import android.hardware.camera2.CaptureRequest;
import java.util.Iterator;
import java.util.List;
import s.f0;

/* loaded from: classes.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f25708a;

    public r() {
        this.f25708a = ((f0) s.l.a(f0.class)) != null;
    }

    public boolean a(List<CaptureRequest> list, boolean z10) {
        if (this.f25708a && z10) {
            Iterator<CaptureRequest> it = list.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next().get(CaptureRequest.CONTROL_AE_MODE)).intValue();
                if (intValue == 2 || intValue == 3) {
                    return true;
                }
            }
        }
        return false;
    }
}
