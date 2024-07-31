package p082eb;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* renamed from: eb.i */
/* loaded from: classes2.dex */
public final class C7153i {

    /* renamed from: eb.i$b */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a */
        private final String f16024a;

        /* renamed from: b */
        private final C13203b f16025b;

        /* renamed from: c */
        private C13203b f16026c;

        /* renamed from: d */
        private boolean f16027d;

        /* renamed from: e */
        private boolean f16028e;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: eb.i$b$a */
        /* loaded from: classes2.dex */
        public static final class a extends C13203b {
            private a() {
                super();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: eb.i$b$b, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static class C13203b {

            /* renamed from: a */
            String f16029a;

            /* renamed from: b */
            Object f16030b;

            /* renamed from: c */
            C13203b f16031c;

            private C13203b() {
            }
        }

        private b(String str) {
            C13203b c13203b = new C13203b();
            this.f16025b = c13203b;
            this.f16026c = c13203b;
            this.f16027d = false;
            this.f16028e = false;
            this.f16024a = (String) C7159o.m21312o(str);
        }

        /* renamed from: f */
        private C13203b m21275f() {
            C13203b c13203b = new C13203b();
            this.f16026c.f16031c = c13203b;
            this.f16026c = c13203b;
            return c13203b;
        }

        /* renamed from: g */
        private b m21276g(Object obj) {
            m21275f().f16030b = obj;
            return this;
        }

        /* renamed from: h */
        private b m21277h(String str, Object obj) {
            C13203b m21275f = m21275f();
            m21275f.f16030b = obj;
            m21275f.f16029a = (String) C7159o.m21312o(str);
            return this;
        }

        /* renamed from: i */
        private a m21278i() {
            a aVar = new a();
            this.f16026c.f16031c = aVar;
            this.f16026c = aVar;
            return aVar;
        }

        /* renamed from: j */
        private b m21279j(String str, Object obj) {
            a m21278i = m21278i();
            m21278i.f16030b = obj;
            m21278i.f16029a = (String) C7159o.m21312o(str);
            return this;
        }

        /* renamed from: l */
        private static boolean m21280l(Object obj) {
            return obj instanceof CharSequence ? ((CharSequence) obj).length() == 0 : obj instanceof Collection ? ((Collection) obj).isEmpty() : obj instanceof Map ? ((Map) obj).isEmpty() : obj instanceof AbstractC7156l ? !((AbstractC7156l) obj).mo21243c() : obj.getClass().isArray() && Array.getLength(obj) == 0;
        }

        /* renamed from: a */
        public b m21281a(String str, double d10) {
            return m21279j(str, String.valueOf(d10));
        }

        /* renamed from: b */
        public b m21282b(String str, int i10) {
            return m21279j(str, String.valueOf(i10));
        }

        /* renamed from: c */
        public b m21283c(String str, long j10) {
            return m21279j(str, String.valueOf(j10));
        }

        /* renamed from: d */
        public b m21284d(String str, Object obj) {
            return m21277h(str, obj);
        }

        /* renamed from: e */
        public b m21285e(String str, boolean z10) {
            return m21279j(str, String.valueOf(z10));
        }

        /* renamed from: k */
        public b m21286k(Object obj) {
            return m21276g(obj);
        }

        /* renamed from: m */
        public b m21287m() {
            this.f16027d = true;
            return this;
        }

        public String toString() {
            boolean z10 = this.f16027d;
            boolean z11 = this.f16028e;
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append(this.f16024a);
            sb2.append('{');
            String str = "";
            for (C13203b c13203b = this.f16025b.f16031c; c13203b != null; c13203b = c13203b.f16031c) {
                Object obj = c13203b.f16030b;
                if (!(c13203b instanceof a)) {
                    if (obj == null) {
                        if (z10) {
                        }
                    } else if (z11 && m21280l(obj)) {
                    }
                }
                sb2.append(str);
                String str2 = c13203b.f16029a;
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

    /* renamed from: a */
    public static <T> T m21272a(T t10, T t11) {
        if (t10 != null) {
            return t10;
        }
        if (t11 != null) {
            return t11;
        }
        throw new NullPointerException("Both parameters are null");
    }

    /* renamed from: b */
    public static b m21273b(Class<?> cls) {
        return new b(cls.getSimpleName());
    }

    /* renamed from: c */
    public static b m21274c(Object obj) {
        return new b(obj.getClass().getSimpleName());
    }
}
