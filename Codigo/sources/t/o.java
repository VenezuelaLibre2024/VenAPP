package t;

import androidx.camera.core.impl.t1;

/* loaded from: classes.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f25704a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f25705b = false;

    public o(t1 t1Var) {
        this.f25704a = t1Var.b(s.d.class) != null;
    }

    public void a() {
        this.f25705b = false;
    }

    public void b() {
        this.f25705b = true;
    }

    public boolean c(int i10) {
        return this.f25705b && i10 == 0 && this.f25704a;
    }
}
