package i0;

import androidx.camera.core.impl.l0;
import androidx.camera.core.impl.y;
import androidx.camera.core.impl.z0;
import i0.d;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class i extends z0 {

    /* renamed from: c, reason: collision with root package name */
    private final d.a f16869c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(y yVar, d.a aVar) {
        super(yVar);
        this.f16869c = aVar;
    }

    private int k(l0 l0Var) {
        Integer num = (Integer) l0Var.e().g(l0.f2537j, 100);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    private int l(l0 l0Var) {
        Integer num = (Integer) l0Var.e().g(l0.f2536i, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    @Override // androidx.camera.core.impl.z0, androidx.camera.core.impl.y
    public com.google.common.util.concurrent.f<List<Void>> c(List<l0> list, int i10, int i11) {
        androidx.core.util.h.b(list.size() == 1, "Only support one capture config.");
        return a0.f.c(Collections.singletonList(this.f16869c.a(k(list.get(0)), l(list.get(0)))));
    }
}
