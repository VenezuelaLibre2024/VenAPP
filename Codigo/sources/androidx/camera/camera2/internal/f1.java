package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.camera.core.impl.n0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import v.j;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class f1 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {
        static CaptureRequest.Builder a(CameraDevice cameraDevice, TotalCaptureResult totalCaptureResult) {
            return cameraDevice.createReprocessCaptureRequest(totalCaptureResult);
        }
    }

    private static void a(androidx.camera.core.impl.l0 l0Var, CaptureRequest.Builder builder) {
        if (j.a.e(l0Var.e()).d().b(q.a.W(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE)) || l0Var.d().equals(androidx.camera.core.impl.b2.f2445a)) {
            return;
        }
        builder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, l0Var.d());
    }

    private static void b(CaptureRequest.Builder builder, androidx.camera.core.impl.n0 n0Var) {
        v.j d10 = j.a.e(n0Var).d();
        for (n0.a<?> aVar : d10.e()) {
            CaptureRequest.Key key = (CaptureRequest.Key) aVar.d();
            try {
                builder.set(key, d10.a(aVar));
            } catch (IllegalArgumentException unused) {
                w.o0.c("Camera2CaptureRequestBuilder", "CaptureRequest.Key is not supported: " + key);
            }
        }
    }

    public static CaptureRequest c(androidx.camera.core.impl.l0 l0Var, CameraDevice cameraDevice, Map<androidx.camera.core.impl.r0, Surface> map) {
        CaptureRequest.Builder createCaptureRequest;
        if (cameraDevice == null) {
            return null;
        }
        List<Surface> e10 = e(l0Var.f(), map);
        if (e10.isEmpty()) {
            return null;
        }
        androidx.camera.core.impl.s c10 = l0Var.c();
        if (l0Var.h() == 5 && c10 != null && (c10.e() instanceof TotalCaptureResult)) {
            w.o0.a("Camera2CaptureRequestBuilder", "createReprocessCaptureRequest");
            createCaptureRequest = a.a(cameraDevice, (TotalCaptureResult) c10.e());
        } else {
            w.o0.a("Camera2CaptureRequestBuilder", "createCaptureRequest");
            createCaptureRequest = cameraDevice.createCaptureRequest(l0Var.h());
        }
        b(createCaptureRequest, l0Var.e());
        a(l0Var, createCaptureRequest);
        androidx.camera.core.impl.n0 e11 = l0Var.e();
        n0.a<Integer> aVar = androidx.camera.core.impl.l0.f2536i;
        if (e11.b(aVar)) {
            createCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, (Integer) l0Var.e().a(aVar));
        }
        androidx.camera.core.impl.n0 e12 = l0Var.e();
        n0.a<Integer> aVar2 = androidx.camera.core.impl.l0.f2537j;
        if (e12.b(aVar2)) {
            createCaptureRequest.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) l0Var.e().a(aVar2)).byteValue()));
        }
        Iterator<Surface> it = e10.iterator();
        while (it.hasNext()) {
            createCaptureRequest.addTarget(it.next());
        }
        createCaptureRequest.setTag(l0Var.g());
        return createCaptureRequest.build();
    }

    public static CaptureRequest d(androidx.camera.core.impl.l0 l0Var, CameraDevice cameraDevice) {
        if (cameraDevice == null) {
            return null;
        }
        CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(l0Var.h());
        b(createCaptureRequest, l0Var.e());
        return createCaptureRequest.build();
    }

    private static List<Surface> e(List<androidx.camera.core.impl.r0> list, Map<androidx.camera.core.impl.r0, Surface> map) {
        ArrayList arrayList = new ArrayList();
        Iterator<androidx.camera.core.impl.r0> it = list.iterator();
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
