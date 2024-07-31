package p354t;

import android.hardware.camera2.CaptureRequest;
import android.util.Range;
import androidx.camera.core.impl.C0668t1;
import p298q.C10214a;
import p342s.C10728a;

/* renamed from: t.a */
/* loaded from: classes.dex */
public class C10936a {

    /* renamed from: a */
    private final Range<Integer> f27833a;

    public C10936a(C0668t1 c0668t1) {
        C10728a c10728a = (C10728a) c0668t1.m3238b(C10728a.class);
        this.f27833a = c10728a == null ? null : c10728a.m32670b();
    }

    /* renamed from: a */
    public void m33409a(C10214a.a aVar) {
        Range<Integer> range = this.f27833a;
        if (range != null) {
            aVar.m30571e(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range);
        }
    }
}
