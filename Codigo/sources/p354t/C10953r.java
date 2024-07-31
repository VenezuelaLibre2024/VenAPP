package p354t;

import android.hardware.camera2.CaptureRequest;
import java.util.Iterator;
import java.util.List;
import p342s.C10739f0;
import p342s.C10750l;

/* renamed from: t.r */
/* loaded from: classes.dex */
public class C10953r {

    /* renamed from: a */
    private final boolean f27852a;

    public C10953r() {
        this.f27852a = ((C10739f0) C10750l.m32699a(C10739f0.class)) != null;
    }

    /* renamed from: a */
    public boolean m33434a(List<CaptureRequest> list, boolean z10) {
        if (this.f27852a && z10) {
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
