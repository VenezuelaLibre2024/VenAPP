package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import androidx.camera.core.impl.AbstractC0661r0;
import androidx.camera.core.impl.C0642l0;
import androidx.camera.core.impl.C0701y1;
import com.google.common.util.concurrent.InterfaceFutureC5920f;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.camera2.internal.y1 */
/* loaded from: classes.dex */
public interface InterfaceC0579y1 {
    /* renamed from: a */
    void mo2671a(List<C0642l0> list);

    /* renamed from: b */
    void mo2672b();

    /* renamed from: c */
    InterfaceFutureC5920f<Void> mo2673c(boolean z10);

    void close();

    /* renamed from: d */
    List<C0642l0> mo2674d();

    /* renamed from: e */
    C0701y1 mo2675e();

    /* renamed from: f */
    void mo2676f(C0701y1 c0701y1);

    /* renamed from: g */
    InterfaceFutureC5920f<Void> mo2677g(C0701y1 c0701y1, CameraDevice cameraDevice, C0506j3 c0506j3);

    /* renamed from: h */
    void mo2678h(Map<AbstractC0661r0, Long> map);
}
