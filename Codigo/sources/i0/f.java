package i0;

import androidx.camera.core.impl.f1;
import androidx.camera.core.impl.k2;
import androidx.camera.core.impl.l2;
import androidx.camera.core.impl.n0;
import androidx.camera.core.impl.p1;
import b0.k;
import java.util.List;

/* loaded from: classes.dex */
public class f implements k2<d>, f1, k {
    static final n0.a<List<l2.b>> H = n0.a.a("camerax.core.streamSharing.captureTypes", List.class);
    private final p1 G;

    public f(p1 p1Var) {
        this.G = p1Var;
    }

    public List<l2.b> W() {
        return (List) a(H);
    }

    @Override // androidx.camera.core.impl.u1
    public n0 m() {
        return this.G;
    }
}
