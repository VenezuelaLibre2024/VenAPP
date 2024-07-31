package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class t1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static CameraCaptureSession.CaptureCallback a(androidx.camera.core.impl.k kVar) {
        if (kVar == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        b(kVar, arrayList);
        return arrayList.size() == 1 ? (CameraCaptureSession.CaptureCallback) arrayList.get(0) : o0.a(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(androidx.camera.core.impl.k kVar, List<CameraCaptureSession.CaptureCallback> list) {
        if (kVar instanceof androidx.camera.core.impl.l) {
            Iterator<androidx.camera.core.impl.k> it = ((androidx.camera.core.impl.l) kVar).d().iterator();
            while (it.hasNext()) {
                b(it.next(), list);
            }
        } else if (kVar instanceof s1) {
            list.add(((s1) kVar).e());
        } else {
            list.add(new r1(kVar));
        }
    }
}
