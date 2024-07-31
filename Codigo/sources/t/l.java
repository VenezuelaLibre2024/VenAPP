package t;

import android.util.Size;
import androidx.camera.core.impl.d2;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private final s.o f25699a;

    public l() {
        this((s.o) s.l.a(s.o.class));
    }

    l(s.o oVar) {
        this.f25699a = oVar;
    }

    public Size a(Size size) {
        Size a10;
        s.o oVar = this.f25699a;
        if (oVar == null || (a10 = oVar.a(d2.b.PRIV)) == null) {
            return size;
        }
        return a10.getWidth() * a10.getHeight() > size.getWidth() * size.getHeight() ? a10 : size;
    }
}
