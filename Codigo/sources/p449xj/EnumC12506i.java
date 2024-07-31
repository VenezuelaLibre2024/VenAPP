package p449xj;

import dj.InterfaceC6992q;
import java.io.Serializable;
import p224lj.C9513b;

/* renamed from: xj.i */
/* loaded from: classes3.dex */
public enum EnumC12506i {
    COMPLETE;

    /* renamed from: xj.i$a */
    /* loaded from: classes3.dex */
    static final class a implements Serializable {
        private static final long serialVersionUID = -8759979445933046293L;

        /* renamed from: a */
        final Throwable f33906a;

        a(Throwable th2) {
            this.f33906a = th2;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return C9513b.m28323c(this.f33906a, ((a) obj).f33906a);
            }
            return false;
        }

        public int hashCode() {
            return this.f33906a.hashCode();
        }

        public String toString() {
            return "NotificationLite.Error[" + this.f33906a + "]";
        }
    }

    /* renamed from: b */
    public static <T> boolean m40940b(Object obj, InterfaceC6992q<? super T> interfaceC6992q) {
        if (obj == COMPLETE) {
            interfaceC6992q.mo605a();
            return true;
        }
        if (obj instanceof a) {
            interfaceC6992q.onError(((a) obj).f33906a);
            return true;
        }
        interfaceC6992q.mo607c(obj);
        return false;
    }

    /* renamed from: h */
    public static Object m40941h() {
        return COMPLETE;
    }

    /* renamed from: i */
    public static Object m40942i(Throwable th2) {
        return new a(th2);
    }

    /* renamed from: l */
    public static Throwable m40943l(Object obj) {
        return ((a) obj).f33906a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: m */
    public static <T> T m40944m(Object obj) {
        return obj;
    }

    /* renamed from: n */
    public static boolean m40945n(Object obj) {
        return obj == COMPLETE;
    }

    /* renamed from: o */
    public static <T> Object m40946o(T t10) {
        return t10;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "NotificationLite.Complete";
    }
}
