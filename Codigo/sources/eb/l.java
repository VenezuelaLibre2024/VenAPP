package eb;

import java.io.Serializable;

/* loaded from: classes2.dex */
public abstract class l<T> implements Serializable {
    private static final long serialVersionUID = 0;

    public static <T> l<T> a() {
        return a.e();
    }

    public static <T> l<T> d(T t10) {
        return new r(o.o(t10));
    }

    public abstract T b();

    public abstract boolean c();
}
