package p149i1;

import androidx.lifecycle.AbstractC1303g0;
import androidx.lifecycle.C1305h0;
import kotlin.jvm.internal.C9322n;

/* renamed from: i1.b */
/* loaded from: classes.dex */
public final class C7769b implements C1305h0.b {

    /* renamed from: b */
    private final C7773f<?>[] f18524b;

    public C7769b(C7773f<?>... initializers) {
        C9322n.m27781e(initializers, "initializers");
        this.f18524b = initializers;
    }

    @Override // androidx.lifecycle.C1305h0.b
    /* renamed from: a */
    public <T extends AbstractC1303g0> T mo7307a(Class<T> modelClass, AbstractC7768a extras) {
        C9322n.m27781e(modelClass, "modelClass");
        C9322n.m27781e(extras, "extras");
        T t10 = null;
        for (C7773f<?> c7773f : this.f18524b) {
            if (C9322n.m27777a(c7773f.m23724a(), modelClass)) {
                Object invoke = c7773f.m23725b().invoke(extras);
                t10 = invoke instanceof AbstractC1303g0 ? (T) invoke : null;
            }
        }
        if (t10 != null) {
            return t10;
        }
        throw new IllegalArgumentException("No initializer set for given class " + modelClass.getName());
    }
}
