package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
class n0 implements e0.a {

    /* renamed from: a, reason: collision with root package name */
    final CameraDevice f1894a;

    /* renamed from: b, reason: collision with root package name */
    final Object f1895b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        final Handler f1896a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(Handler handler) {
            this.f1896a = handler;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n0(CameraDevice cameraDevice, Object obj) {
        this.f1894a = (CameraDevice) androidx.core.util.h.k(cameraDevice);
        this.f1895b = obj;
    }

    private static void b(CameraDevice cameraDevice, List<r.f> list) {
        String id2 = cameraDevice.getId();
        Iterator<r.f> it = list.iterator();
        while (it.hasNext()) {
            String c10 = it.next().c();
            if (c10 != null && !c10.isEmpty()) {
                w.o0.k("CameraDeviceCompat", "Camera " + id2 + ": Camera doesn't support physicalCameraId " + c10 + ". Ignoring.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(CameraDevice cameraDevice, r.w wVar) {
        androidx.core.util.h.k(cameraDevice);
        androidx.core.util.h.k(wVar);
        androidx.core.util.h.k(wVar.e());
        List<r.f> c10 = wVar.c();
        if (c10 == null) {
            throw new IllegalArgumentException("Invalid output configurations");
        }
        if (wVar.a() == null) {
            throw new IllegalArgumentException("Invalid executor");
        }
        b(cameraDevice, c10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<Surface> d(List<r.f> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<r.f> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().d());
        }
        return arrayList;
    }
}
