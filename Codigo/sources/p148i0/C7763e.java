package p148i0;

import androidx.camera.core.impl.C0647m1;
import androidx.camera.core.impl.C0656p1;
import androidx.camera.core.impl.InterfaceC0640k2;
import androidx.camera.core.impl.InterfaceC0643l1;
import java.util.UUID;
import p018b0.InterfaceC1602j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: i0.e */
/* loaded from: classes.dex */
public class C7763e implements InterfaceC0640k2.a<C7762d, C7764f, C7763e> {

    /* renamed from: a */
    private final C0647m1 f18507a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7763e() {
        this(C0647m1.m3184a0());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7763e(C0647m1 c0647m1) {
        this.f18507a = c0647m1;
        Class cls = (Class) c0647m1.mo3197g(InterfaceC1602j.f6864D, null);
        if (cls == null || cls.equals(C7762d.class)) {
            m23694d(C7762d.class);
            return;
        }
        throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
    }

    @Override // p407w.InterfaceC12050z
    /* renamed from: a */
    public InterfaceC0643l1 mo2932a() {
        return this.f18507a;
    }

    @Override // androidx.camera.core.impl.InterfaceC0640k2.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C7764f mo2933b() {
        return new C7764f(C0656p1.m3211Y(this.f18507a));
    }

    /* renamed from: d */
    public C7763e m23694d(Class<C7762d> cls) {
        mo2932a().mo3178r(InterfaceC1602j.f6864D, cls);
        if (mo2932a().mo3197g(InterfaceC1602j.f6863C, null) == null) {
            m23695e(cls.getCanonicalName() + "-" + UUID.randomUUID());
        }
        return this;
    }

    /* renamed from: e */
    public C7763e m23695e(String str) {
        mo2932a().mo3178r(InterfaceC1602j.f6863C, str);
        return this;
    }
}
