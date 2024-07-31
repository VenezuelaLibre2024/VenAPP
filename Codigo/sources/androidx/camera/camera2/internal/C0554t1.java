package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import androidx.camera.core.impl.AbstractC0637k;
import androidx.camera.core.impl.C0641l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.camera.camera2.internal.t1 */
/* loaded from: classes.dex */
final class C0554t1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static CameraCaptureSession.CaptureCallback m2655a(AbstractC0637k abstractC0637k) {
        if (abstractC0637k == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        m2656b(abstractC0637k, arrayList);
        return arrayList.size() == 1 ? (CameraCaptureSession.CaptureCallback) arrayList.get(0) : C0528o0.m2591a(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m2656b(AbstractC0637k abstractC0637k, List<CameraCaptureSession.CaptureCallback> list) {
        if (abstractC0637k instanceof C0641l) {
            Iterator<AbstractC0637k> it = ((C0641l) abstractC0637k).m3148d().iterator();
            while (it.hasNext()) {
                m2656b(it.next(), list);
            }
        } else if (abstractC0637k instanceof C0549s1) {
            list.add(((C0549s1) abstractC0637k).m2654e());
        } else {
            list.add(new C0544r1(abstractC0637k));
        }
    }
}
