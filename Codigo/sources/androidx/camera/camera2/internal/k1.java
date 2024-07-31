package androidx.camera.camera2.internal;

import android.content.Context;
import androidx.camera.core.impl.l0;
import androidx.camera.core.impl.l2;
import androidx.camera.core.impl.y1;

/* loaded from: classes.dex */
public final class k1 implements androidx.camera.core.impl.l2 {

    /* renamed from: b, reason: collision with root package name */
    final c2 f2097b;

    public k1(Context context) {
        this.f2097b = c2.c(context);
    }

    @Override // androidx.camera.core.impl.l2
    public androidx.camera.core.impl.n0 a(l2.b bVar, int i10) {
        androidx.camera.core.impl.m1 a02 = androidx.camera.core.impl.m1.a0();
        y1.b bVar2 = new y1.b();
        bVar2.t(l3.b(bVar, i10));
        a02.r(androidx.camera.core.impl.k2.f2526r, bVar2.o());
        a02.r(androidx.camera.core.impl.k2.f2528t, j1.f2082a);
        l0.a aVar = new l0.a();
        aVar.r(l3.a(bVar, i10));
        a02.r(androidx.camera.core.impl.k2.f2527s, aVar.h());
        a02.r(androidx.camera.core.impl.k2.f2529u, bVar == l2.b.IMAGE_CAPTURE ? j2.f2083c : p0.f2148a);
        if (bVar == l2.b.PREVIEW) {
            a02.r(androidx.camera.core.impl.f1.f2468n, this.f2097b.f());
        }
        a02.r(androidx.camera.core.impl.f1.f2463i, Integer.valueOf(this.f2097b.d(true).getRotation()));
        if (bVar == l2.b.VIDEO_CAPTURE || bVar == l2.b.STREAM_SHARING) {
            a02.r(androidx.camera.core.impl.k2.f2533y, Boolean.TRUE);
        }
        return androidx.camera.core.impl.p1.Y(a02);
    }
}
