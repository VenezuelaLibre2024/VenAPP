package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.compat.C0434h;
import p407w.C12034r;

/* renamed from: androidx.camera.camera2.internal.q1 */
/* loaded from: classes.dex */
public final class C0539q1 {
    /* renamed from: a */
    public static C12034r m2610a(C0434h c0434h) {
        int m2236d = c0434h.m2236d();
        int i10 = 1;
        if (m2236d != 1) {
            i10 = 2;
            if (m2236d != 2) {
                i10 = 3;
                if (m2236d != 3) {
                    i10 = 4;
                    if (m2236d != 4) {
                        i10 = 5;
                        if (m2236d != 5) {
                            i10 = m2236d != 10001 ? 0 : 6;
                        }
                    }
                }
            }
        }
        return new C12034r(i10, c0434h);
    }
}
