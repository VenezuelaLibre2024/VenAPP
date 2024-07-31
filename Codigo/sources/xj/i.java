package xj;

import dj.q;
import java.io.Serializable;

/* loaded from: classes3.dex */
public enum i {
    COMPLETE;

    /* loaded from: classes3.dex */
    static final class a implements Serializable {
        private static final long serialVersionUID = -8759979445933046293L;

        /* renamed from: a, reason: collision with root package name */
        final Throwable f31386a;

        a(Throwable th2) {
            this.f31386a = th2;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return lj.b.c(this.f31386a, ((a) obj).f31386a);
            }
            return false;
        }

        public int hashCode() {
            return this.f31386a.hashCode();
        }

        public String toString() {
            return "NotificationLite.Error[" + this.f31386a + "]";
        }
    }

    public static <T> boolean b(Object obj, q<? super T> qVar) {
        if (obj == COMPLETE) {
            qVar.a();
            return true;
        }
        if (obj instanceof a) {
            qVar.onError(((a) obj).f31386a);
            return true;
        }
        qVar.c(obj);
        return false;
    }

    public static Object h() {
        return COMPLETE;
    }

    public static Object i(Throwable th2) {
        return new a(th2);
    }

    public static Throwable l(Object obj) {
        return ((a) obj).f31386a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T m(Object obj) {
        return obj;
    }

    public static boolean n(Object obj) {
        return obj == COMPLETE;
    }

    public static <T> Object o(T t10) {
        return t10;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "NotificationLite.Complete";
    }
}
