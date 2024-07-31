package t;

import android.hardware.camera2.CaptureRequest;
import q.a;

/* loaded from: classes.dex */
public class k {
    public void a(int i10, a.C0388a c0388a) {
        CaptureRequest.Key key;
        Boolean bool;
        if (((s.v) s.l.a(s.v.class)) == null) {
            return;
        }
        if (i10 == 0) {
            key = CaptureRequest.CONTROL_ENABLE_ZSL;
            bool = Boolean.TRUE;
        } else {
            if (i10 != 1) {
                return;
            }
            key = CaptureRequest.CONTROL_ENABLE_ZSL;
            bool = Boolean.FALSE;
        }
        c0388a.e(key, bool);
    }
}
