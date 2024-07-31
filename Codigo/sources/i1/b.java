package i1;

import androidx.lifecycle.g0;
import androidx.lifecycle.h0;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public final class b implements h0.b {

    /* renamed from: b, reason: collision with root package name */
    private final f<?>[] f16872b;

    public b(f<?>... initializers) {
        n.e(initializers, "initializers");
        this.f16872b = initializers;
    }

    @Override // androidx.lifecycle.h0.b
    public <T extends g0> T a(Class<T> modelClass, a extras) {
        n.e(modelClass, "modelClass");
        n.e(extras, "extras");
        T t10 = null;
        for (f<?> fVar : this.f16872b) {
            if (n.a(fVar.a(), modelClass)) {
                Object invoke = fVar.b().invoke(extras);
                t10 = invoke instanceof g0 ? (T) invoke : null;
            }
        }
        if (t10 != null) {
            return t10;
        }
        throw new IllegalArgumentException("No initializer set for given class " + modelClass.getName());
    }
}
