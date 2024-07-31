package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.C0429e0;
import androidx.core.util.C0984h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p320r.C10557f;
import p320r.C10574w;
import p407w.C12029o0;

/* renamed from: androidx.camera.camera2.internal.compat.n0 */
/* loaded from: classes.dex */
class C0447n0 implements C0429e0.a {

    /* renamed from: a */
    final CameraDevice f2197a;

    /* renamed from: b */
    final Object f2198b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.camera2.internal.compat.n0$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        final Handler f2199a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(Handler handler) {
            this.f2199a = handler;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0447n0(CameraDevice cameraDevice, Object obj) {
        this.f2197a = (CameraDevice) C0984h.m4833k(cameraDevice);
        this.f2198b = obj;
    }

    /* renamed from: b */
    private static void m2271b(CameraDevice cameraDevice, List<C10557f> list) {
        String id2 = cameraDevice.getId();
        Iterator<C10557f> it = list.iterator();
        while (it.hasNext()) {
            String m32055c = it.next().m32055c();
            if (m32055c != null && !m32055c.isEmpty()) {
                C12029o0.m38648k("CameraDeviceCompat", "Camera " + id2 + ": Camera doesn't support physicalCameraId " + m32055c + ". Ignoring.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m2272c(CameraDevice cameraDevice, C10574w c10574w) {
        C0984h.m4833k(cameraDevice);
        C0984h.m4833k(c10574w);
        C0984h.m4833k(c10574w.m32090e());
        List<C10557f> m32088c = c10574w.m32088c();
        if (m32088c == null) {
            throw new IllegalArgumentException("Invalid output configurations");
        }
        if (c10574w.m32086a() == null) {
            throw new IllegalArgumentException("Invalid executor");
        }
        m2271b(cameraDevice, m32088c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static List<Surface> m2273d(List<C10557f> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<C10557f> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().m32056d());
        }
        return arrayList;
    }
}
