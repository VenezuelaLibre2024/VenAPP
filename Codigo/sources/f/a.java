package f;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public abstract class a<I, O> {

    /* renamed from: f.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0232a<T> {

        /* renamed from: a, reason: collision with root package name */
        private final T f14832a;

        public C0232a(T t10) {
            this.f14832a = t10;
        }

        public final T a() {
            return this.f14832a;
        }
    }

    public abstract Intent a(Context context, I i10);

    public C0232a<O> b(Context context, I i10) {
        n.e(context, "context");
        return null;
    }

    public abstract O c(int i10, Intent intent);
}
