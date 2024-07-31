package ze;

/* loaded from: classes2.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    private final long f32798a;

    /* renamed from: b, reason: collision with root package name */
    private final long f32799b;

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private long f32800a = 60;

        /* renamed from: b, reason: collision with root package name */
        private long f32801b = com.google.firebase.remoteconfig.internal.m.f12477j;

        public m c() {
            return new m(this);
        }

        public b d(long j10) {
            if (j10 < 0) {
                throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j10)));
            }
            this.f32800a = j10;
            return this;
        }

        public b e(long j10) {
            if (j10 >= 0) {
                this.f32801b = j10;
                return this;
            }
            throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j10 + " is an invalid argument");
        }
    }

    private m(b bVar) {
        this.f32798a = bVar.f32800a;
        this.f32799b = bVar.f32801b;
    }
}
