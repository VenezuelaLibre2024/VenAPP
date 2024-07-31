package eb;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes2.dex */
public final class i {

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f14601a;

        /* renamed from: b, reason: collision with root package name */
        private final C0225b f14602b;

        /* renamed from: c, reason: collision with root package name */
        private C0225b f14603c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f14604d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f14605e;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes2.dex */
        public static final class a extends C0225b {
            private a() {
                super();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: eb.i$b$b, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static class C0225b {

            /* renamed from: a, reason: collision with root package name */
            String f14606a;

            /* renamed from: b, reason: collision with root package name */
            Object f14607b;

            /* renamed from: c, reason: collision with root package name */
            C0225b f14608c;

            private C0225b() {
            }
        }

        private b(String str) {
            C0225b c0225b = new C0225b();
            this.f14602b = c0225b;
            this.f14603c = c0225b;
            this.f14604d = false;
            this.f14605e = false;
            this.f14601a = (String) o.o(str);
        }

        private C0225b f() {
            C0225b c0225b = new C0225b();
            this.f14603c.f14608c = c0225b;
            this.f14603c = c0225b;
            return c0225b;
        }

        private b g(Object obj) {
            f().f14607b = obj;
            return this;
        }

        private b h(String str, Object obj) {
            C0225b f10 = f();
            f10.f14607b = obj;
            f10.f14606a = (String) o.o(str);
            return this;
        }

        private a i() {
            a aVar = new a();
            this.f14603c.f14608c = aVar;
            this.f14603c = aVar;
            return aVar;
        }

        private b j(String str, Object obj) {
            a i10 = i();
            i10.f14607b = obj;
            i10.f14606a = (String) o.o(str);
            return this;
        }

        private static boolean l(Object obj) {
            return obj instanceof CharSequence ? ((CharSequence) obj).length() == 0 : obj instanceof Collection ? ((Collection) obj).isEmpty() : obj instanceof Map ? ((Map) obj).isEmpty() : obj instanceof l ? !((l) obj).c() : obj.getClass().isArray() && Array.getLength(obj) == 0;
        }

        public b a(String str, double d10) {
            return j(str, String.valueOf(d10));
        }

        public b b(String str, int i10) {
            return j(str, String.valueOf(i10));
        }

        public b c(String str, long j10) {
            return j(str, String.valueOf(j10));
        }

        public b d(String str, Object obj) {
            return h(str, obj);
        }

        public b e(String str, boolean z10) {
            return j(str, String.valueOf(z10));
        }

        public b k(Object obj) {
            return g(obj);
        }

        public b m() {
            this.f14604d = true;
            return this;
        }

        public String toString() {
            boolean z10 = this.f14604d;
            boolean z11 = this.f14605e;
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append(this.f14601a);
            sb2.append('{');
            String str = "";
            for (C0225b c0225b = this.f14602b.f14608c; c0225b != null; c0225b = c0225b.f14608c) {
                Object obj = c0225b.f14607b;
                if (!(c0225b instanceof a)) {
                    if (obj == null) {
                        if (z10) {
                        }
                    } else if (z11 && l(obj)) {
                    }
                }
                sb2.append(str);
                String str2 = c0225b.f14606a;
                if (str2 != null) {
                    sb2.append(str2);
                    sb2.append('=');
                }
                if (obj == null || !obj.getClass().isArray()) {
                    sb2.append(obj);
                } else {
                    String deepToString = Arrays.deepToString(new Object[]{obj});
                    sb2.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                }
                str = ", ";
            }
            sb2.append('}');
            return sb2.toString();
        }
    }

    public static <T> T a(T t10, T t11) {
        if (t10 != null) {
            return t10;
        }
        if (t11 != null) {
            return t11;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static b b(Class<?> cls) {
        return new b(cls.getSimpleName());
    }

    public static b c(Object obj) {
        return new b(obj.getClass().getSimpleName());
    }
}
