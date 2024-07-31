package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.b2;
import androidx.camera.core.impl.l2;
import java.util.List;

/* loaded from: classes.dex */
public abstract class a {
    public static a a(d2 d2Var, int i10, Size size, w.y yVar, List<l2.b> list, n0 n0Var, Range<Integer> range) {
        return new b(d2Var, i10, size, yVar, list, n0Var, range);
    }

    public abstract List<l2.b> b();

    public abstract w.y c();

    public abstract int d();

    public abstract n0 e();

    public abstract Size f();

    public abstract d2 g();

    public abstract Range<Integer> h();

    public b2 i(n0 n0Var) {
        b2.a d10 = b2.a(f()).b(c()).d(n0Var);
        if (h() != null) {
            d10.c(h());
        }
        return d10.a();
    }
}
