package y;

import java.util.List;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final List<androidx.camera.core.impl.l0> f31512a;

    /* renamed from: b, reason: collision with root package name */
    private final n0 f31513b;

    public j(List<androidx.camera.core.impl.l0> list, n0 n0Var) {
        this.f31512a = list;
        this.f31513b = n0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<androidx.camera.core.impl.l0> a() {
        return this.f31512a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b() {
        return this.f31513b.isAborted();
    }
}
