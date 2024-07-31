package androidx.camera.core.impl;

import androidx.lifecycle.C1320r;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.camera.core.impl.j1 */
/* loaded from: classes.dex */
public final class C0635j1<T> {

    /* renamed from: a */
    final C1320r<a<T>> f2853a = new C1320r<>();

    /* renamed from: b */
    private final Map<Object, Object> f2854b = new HashMap();

    /* renamed from: androidx.camera.core.impl.j1$a */
    /* loaded from: classes.dex */
    public static final class a<T> {

        /* renamed from: a */
        private final T f2855a;

        /* renamed from: b */
        private final Throwable f2856b;

        private a(T t10, Throwable th2) {
            this.f2855a = t10;
            this.f2856b = th2;
        }

        /* renamed from: b */
        static <T> a<T> m3105b(T t10) {
            return new a<>(t10, null);
        }

        /* renamed from: a */
        public boolean m3106a() {
            return this.f2856b == null;
        }

        public String toString() {
            StringBuilder sb2;
            Object obj;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("[Result: <");
            if (m3106a()) {
                sb2 = new StringBuilder();
                sb2.append("Value: ");
                obj = this.f2855a;
            } else {
                sb2 = new StringBuilder();
                sb2.append("Error: ");
                obj = this.f2856b;
            }
            sb2.append(obj);
            sb3.append(sb2.toString());
            sb3.append(">]");
            return sb3.toString();
        }
    }

    /* renamed from: a */
    public void m3104a(T t10) {
        this.f2853a.postValue(a.m3105b(t10));
    }
}
