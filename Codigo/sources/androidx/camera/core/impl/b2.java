package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.h;

/* loaded from: classes.dex */
public abstract class b2 {

    /* renamed from: a */
    public static final Range<Integer> f2445a = new Range<>(0, 0);

    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract b2 a();

        public abstract a b(w.y yVar);

        public abstract a c(Range<Integer> range);

        public abstract a d(n0 n0Var);

        public abstract a e(Size size);
    }

    public static a a(Size size) {
        return new h.b().e(size).c(f2445a).b(w.y.f29577d);
    }

    public abstract w.y b();

    public abstract Range<Integer> c();

    public abstract n0 d();

    public abstract Size e();

    public abstract a f();
}
