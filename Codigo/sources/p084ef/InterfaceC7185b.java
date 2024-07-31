package p084ef;

import kotlin.jvm.internal.C9322n;

/* renamed from: ef.b */
/* loaded from: classes2.dex */
public interface InterfaceC7185b {

    /* renamed from: ef.b$a */
    /* loaded from: classes2.dex */
    public enum a {
        CRASHLYTICS,
        PERFORMANCE,
        MATT_SAYS_HI
    }

    /* renamed from: ef.b$b */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a */
        private final String f16080a;

        public b(String sessionId) {
            C9322n.m27781e(sessionId, "sessionId");
            this.f16080a = sessionId;
        }

        /* renamed from: a */
        public final String m21393a() {
            return this.f16080a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C9322n.m27777a(this.f16080a, ((b) obj).f16080a);
        }

        public int hashCode() {
            return this.f16080a.hashCode();
        }

        public String toString() {
            return "SessionDetails(sessionId=" + this.f16080a + ')';
        }
    }

    /* renamed from: a */
    boolean mo21389a();

    /* renamed from: b */
    void mo21390b(b bVar);

    /* renamed from: c */
    a mo21391c();
}
