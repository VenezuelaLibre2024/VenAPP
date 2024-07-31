package ef;

import kotlin.jvm.internal.n;

/* loaded from: classes2.dex */
public interface b {

    /* loaded from: classes2.dex */
    public enum a {
        CRASHLYTICS,
        PERFORMANCE,
        MATT_SAYS_HI
    }

    /* renamed from: ef.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0229b {

        /* renamed from: a, reason: collision with root package name */
        private final String f14657a;

        public C0229b(String sessionId) {
            n.e(sessionId, "sessionId");
            this.f14657a = sessionId;
        }

        public final String a() {
            return this.f14657a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0229b) && n.a(this.f14657a, ((C0229b) obj).f14657a);
        }

        public int hashCode() {
            return this.f14657a.hashCode();
        }

        public String toString() {
            return "SessionDetails(sessionId=" + this.f14657a + ')';
        }
    }

    boolean a();

    void b(C0229b c0229b);

    a c();
}
