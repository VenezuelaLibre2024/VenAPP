package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
interface y1 {
    void a(List<androidx.camera.core.impl.l0> list);

    void b();

    com.google.common.util.concurrent.f<Void> c(boolean z10);

    void close();

    List<androidx.camera.core.impl.l0> d();

    androidx.camera.core.impl.y1 e();

    void f(androidx.camera.core.impl.y1 y1Var);

    com.google.common.util.concurrent.f<Void> g(androidx.camera.core.impl.y1 y1Var, CameraDevice cameraDevice, j3 j3Var);

    void h(Map<androidx.camera.core.impl.r0, Long> map);
}
