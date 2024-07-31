package p354t;

import android.hardware.camera2.CaptureRequest;
import p298q.C10214a;
import p342s.C10750l;
import p342s.C10760v;

/* renamed from: t.k */
/* loaded from: classes.dex */
public class C10946k {
    /* renamed from: a */
    public void m33423a(int i10, C10214a.a aVar) {
        CaptureRequest.Key key;
        Boolean bool;
        if (((C10760v) C10750l.m32699a(C10760v.class)) == null) {
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
        aVar.m30571e(key, bool);
    }
}
