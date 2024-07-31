package b0;

import androidx.camera.core.impl.n0;
import androidx.camera.core.impl.u1;

/* loaded from: classes.dex */
public interface j<T> extends u1 {
    public static final n0.a<String> C = n0.a.a("camerax.core.target.name", String.class);
    public static final n0.a<Class<?>> D = n0.a.a("camerax.core.target.class", Class.class);

    default String P() {
        return (String) a(C);
    }

    default String u(String str) {
        return (String) g(C, str);
    }
}
