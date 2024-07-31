package i0;

import androidx.camera.core.impl.k2;
import androidx.camera.core.impl.l1;
import androidx.camera.core.impl.m1;
import androidx.camera.core.impl.p1;
import b0.j;
import java.util.UUID;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class e implements k2.a<d, f, e> {

    /* renamed from: a */
    private final m1 f16857a;

    public e() {
        this(m1.a0());
    }

    public e(m1 m1Var) {
        this.f16857a = m1Var;
        Class cls = (Class) m1Var.g(j.D, null);
        if (cls == null || cls.equals(d.class)) {
            d(d.class);
            return;
        }
        throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
    }

    @Override // w.z
    public l1 a() {
        return this.f16857a;
    }

    @Override // androidx.camera.core.impl.k2.a
    /* renamed from: c */
    public f b() {
        return new f(p1.Y(this.f16857a));
    }

    public e d(Class<d> cls) {
        a().r(j.D, cls);
        if (a().g(j.C, null) == null) {
            e(cls.getCanonicalName() + "-" + UUID.randomUUID());
        }
        return this;
    }

    public e e(String str) {
        a().r(j.C, str);
        return this;
    }
}
