package androidx.camera.core.impl;

import android.util.Size;
import android.view.Surface;

/* loaded from: classes.dex */
public abstract class q1 {
    public static q1 a(Surface surface, Size size, int i10) {
        return new f(surface, size, i10);
    }

    public abstract int b();

    public abstract Size c();

    public abstract Surface d();
}
