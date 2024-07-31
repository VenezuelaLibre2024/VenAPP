package t;

import androidx.camera.core.impl.t1;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f25690a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f25691b;

    public b(t1 t1Var) {
        this.f25690a = t1Var.a(s.t.class);
        this.f25691b = s.l.a(s.k.class) != null;
    }

    public int a(int i10) {
        if ((this.f25690a || this.f25691b) && i10 == 2) {
            return 1;
        }
        return i10;
    }
}
