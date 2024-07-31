package p488ze;

import com.google.firebase.remoteconfig.internal.C6357m;

/* renamed from: ze.m */
/* loaded from: classes2.dex */
public class C13016m {

    /* renamed from: a */
    private final long f35349a;

    /* renamed from: b */
    private final long f35350b;

    /* renamed from: ze.m$b */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a */
        private long f35351a = 60;

        /* renamed from: b */
        private long f35352b = C6357m.f13709j;

        /* renamed from: c */
        public C13016m m42987c() {
            return new C13016m(this);
        }

        /* renamed from: d */
        public b m42988d(long j10) {
            if (j10 < 0) {
                throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j10)));
            }
            this.f35351a = j10;
            return this;
        }

        /* renamed from: e */
        public b m42989e(long j10) {
            if (j10 >= 0) {
                this.f35352b = j10;
                return this;
            }
            throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j10 + " is an invalid argument");
        }
    }

    private C13016m(b bVar) {
        this.f35349a = bVar.f35351a;
        this.f35350b = bVar.f35352b;
    }
}
