package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.C0574x1;
import androidx.camera.core.impl.C0600a2;
import androidx.camera.core.impl.C0701y1;
import androidx.camera.core.impl.InterfaceC0692v1;
import androidx.core.util.C0984h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.camera.camera2.internal.i1 */
/* loaded from: classes.dex */
public class C0499i1 implements InterfaceC0692v1 {

    /* renamed from: a */
    private final C0574x1 f2340a;

    /* renamed from: b */
    private final List<C0600a2> f2341b;

    /* renamed from: c */
    private volatile boolean f2342c = false;

    /* renamed from: d */
    private volatile C0701y1 f2343d;

    public C0499i1(C0574x1 c0574x1, List<C0600a2> list) {
        C0984h.m4824b(c0574x1.f2670l == C0574x1.e.OPENED, "CaptureSession state must be OPENED. Current state:" + c0574x1.f2670l);
        this.f2340a = c0574x1;
        this.f2341b = Collections.unmodifiableList(new ArrayList(list));
    }

    /* renamed from: a */
    public void m2414a() {
        this.f2342c = true;
    }

    /* renamed from: b */
    public void m2415b(C0701y1 c0701y1) {
        this.f2343d = c0701y1;
    }
}
