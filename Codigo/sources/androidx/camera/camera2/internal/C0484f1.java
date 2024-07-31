package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.camera.core.impl.AbstractC0604b2;
import androidx.camera.core.impl.AbstractC0661r0;
import androidx.camera.core.impl.C0642l0;
import androidx.camera.core.impl.InterfaceC0649n0;
import androidx.camera.core.impl.InterfaceC0663s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p298q.C10214a;
import p389v.C11600j;
import p407w.C12029o0;

/* renamed from: androidx.camera.camera2.internal.f1 */
/* loaded from: classes.dex */
class C0484f1 {

    /* renamed from: androidx.camera.camera2.internal.f1$a */
    /* loaded from: classes.dex */
    static class a {
        /* renamed from: a */
        static CaptureRequest.Builder m2375a(CameraDevice cameraDevice, TotalCaptureResult totalCaptureResult) {
            return cameraDevice.createReprocessCaptureRequest(totalCaptureResult);
        }
    }

    /* renamed from: a */
    private static void m2370a(C0642l0 c0642l0, CaptureRequest.Builder builder) {
        if (C11600j.a.m36367e(c0642l0.m3153e()).m36369d().mo3192b(C10214a.m30559W(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE)) || c0642l0.m3152d().equals(AbstractC0604b2.f2766a)) {
            return;
        }
        builder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, c0642l0.m3152d());
    }

    /* renamed from: b */
    private static void m2371b(CaptureRequest.Builder builder, InterfaceC0649n0 interfaceC0649n0) {
        C11600j m36369d = C11600j.a.m36367e(interfaceC0649n0).m36369d();
        for (InterfaceC0649n0.a<?> aVar : m36369d.mo3195e()) {
            CaptureRequest.Key key = (CaptureRequest.Key) aVar.mo3016d();
            try {
                builder.set(key, m36369d.mo3191a(aVar));
            } catch (IllegalArgumentException unused) {
                C12029o0.m38640c("Camera2CaptureRequestBuilder", "CaptureRequest.Key is not supported: " + key);
            }
        }
    }

    /* renamed from: c */
    public static CaptureRequest m2372c(C0642l0 c0642l0, CameraDevice cameraDevice, Map<AbstractC0661r0, Surface> map) {
        CaptureRequest.Builder createCaptureRequest;
        if (cameraDevice == null) {
            return null;
        }
        List<Surface> m2374e = m2374e(c0642l0.m3154f(), map);
        if (m2374e.isEmpty()) {
            return null;
        }
        InterfaceC0663s m3151c = c0642l0.m3151c();
        if (c0642l0.m3156h() == 5 && m3151c != null && (m3151c.mo2382e() instanceof TotalCaptureResult)) {
            C12029o0.m38638a("Camera2CaptureRequestBuilder", "createReprocessCaptureRequest");
            createCaptureRequest = a.m2375a(cameraDevice, (TotalCaptureResult) m3151c.mo2382e());
        } else {
            C12029o0.m38638a("Camera2CaptureRequestBuilder", "createCaptureRequest");
            createCaptureRequest = cameraDevice.createCaptureRequest(c0642l0.m3156h());
        }
        m2371b(createCaptureRequest, c0642l0.m3153e());
        m2370a(c0642l0, createCaptureRequest);
        InterfaceC0649n0 m3153e = c0642l0.m3153e();
        InterfaceC0649n0.a<Integer> aVar = C0642l0.f2875i;
        if (m3153e.mo3192b(aVar)) {
            createCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, (Integer) c0642l0.m3153e().mo3191a(aVar));
        }
        InterfaceC0649n0 m3153e2 = c0642l0.m3153e();
        InterfaceC0649n0.a<Integer> aVar2 = C0642l0.f2876j;
        if (m3153e2.mo3192b(aVar2)) {
            createCaptureRequest.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) c0642l0.m3153e().mo3191a(aVar2)).byteValue()));
        }
        Iterator<Surface> it = m2374e.iterator();
        while (it.hasNext()) {
            createCaptureRequest.addTarget(it.next());
        }
        createCaptureRequest.setTag(c0642l0.m3155g());
        return createCaptureRequest.build();
    }

    /* renamed from: d */
    public static CaptureRequest m2373d(C0642l0 c0642l0, CameraDevice cameraDevice) {
        if (cameraDevice == null) {
            return null;
        }
        CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(c0642l0.m3156h());
        m2371b(createCaptureRequest, c0642l0.m3153e());
        return createCaptureRequest.build();
    }

    /* renamed from: e */
    private static List<Surface> m2374e(List<AbstractC0661r0> list, Map<AbstractC0661r0, Surface> map) {
        ArrayList arrayList = new ArrayList();
        Iterator<AbstractC0661r0> it = list.iterator();
        while (it.hasNext()) {
            Surface surface = map.get(it.next());
            if (surface == null) {
                throw new IllegalArgumentException("DeferrableSurface not in configuredSurfaceMap");
            }
            arrayList.add(surface);
        }
        return arrayList;
    }
}
