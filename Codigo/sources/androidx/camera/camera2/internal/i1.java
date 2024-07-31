package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.x1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class i1 implements androidx.camera.core.impl.v1 {

    /* renamed from: a, reason: collision with root package name */
    private final x1 f2037a;

    /* renamed from: b, reason: collision with root package name */
    private final List<androidx.camera.core.impl.a2> f2038b;

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f2039c = false;

    /* renamed from: d, reason: collision with root package name */
    private volatile androidx.camera.core.impl.y1 f2040d;

    public i1(x1 x1Var, List<androidx.camera.core.impl.a2> list) {
        androidx.core.util.h.b(x1Var.f2349l == x1.e.OPENED, "CaptureSession state must be OPENED. Current state:" + x1Var.f2349l);
        this.f2037a = x1Var;
        this.f2038b = Collections.unmodifiableList(new ArrayList(list));
    }

    public void a() {
        this.f2039c = true;
    }

    public void b(androidx.camera.core.impl.y1 y1Var) {
        this.f2040d = y1Var;
    }
}
