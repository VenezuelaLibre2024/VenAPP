package w;

import android.graphics.Matrix;
import androidx.camera.core.impl.f2;
import androidx.camera.core.impl.utils.j;

/* loaded from: classes.dex */
public abstract class m0 implements h0 {
    public static h0 e(f2 f2Var, long j10, int i10, Matrix matrix) {
        return new d(f2Var, j10, i10, matrix);
    }

    @Override // w.h0
    public void a(j.b bVar) {
        bVar.m(d());
    }

    @Override // w.h0
    public abstract f2 b();

    @Override // w.h0
    public abstract long c();

    @Override // w.h0
    public abstract int d();

    public abstract Matrix f();
}
