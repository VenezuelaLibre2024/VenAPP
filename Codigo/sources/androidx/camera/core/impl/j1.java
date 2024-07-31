package androidx.camera.core.impl;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class j1<T> {

    /* renamed from: a, reason: collision with root package name */
    final androidx.lifecycle.r<a<T>> f2515a = new androidx.lifecycle.r<>();

    /* renamed from: b, reason: collision with root package name */
    private final Map<Object, Object> f2516b = new HashMap();

    /* loaded from: classes.dex */
    public static final class a<T> {

        /* renamed from: a, reason: collision with root package name */
        private final T f2517a;

        /* renamed from: b, reason: collision with root package name */
        private final Throwable f2518b;

        private a(T t10, Throwable th2) {
            this.f2517a = t10;
            this.f2518b = th2;
        }

        static <T> a<T> b(T t10) {
            return new a<>(t10, null);
        }

        public boolean a() {
            return this.f2518b == null;
        }

        public String toString() {
            StringBuilder sb2;
            Object obj;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("[Result: <");
            if (a()) {
                sb2 = new StringBuilder();
                sb2.append("Value: ");
                obj = this.f2517a;
            } else {
                sb2 = new StringBuilder();
                sb2.append("Error: ");
                obj = this.f2518b;
            }
            sb2.append(obj);
            sb3.append(sb2.toString());
            sb3.append(">]");
            return sb3.toString();
        }
    }

    public void a(T t10) {
        this.f2515a.postValue(a.b(t10));
    }
}
