package d7;

import java.util.List;

/* loaded from: classes.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f13812a;

    /* renamed from: b, reason: collision with root package name */
    public final List<a> f13813b;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f13814a;

        /* renamed from: b, reason: collision with root package name */
        public final String f13815b;

        /* renamed from: c, reason: collision with root package name */
        public final long f13816c;

        /* renamed from: d, reason: collision with root package name */
        public final long f13817d;

        public a(String str, String str2, long j10, long j11) {
            this.f13814a = str;
            this.f13815b = str2;
            this.f13816c = j10;
            this.f13817d = j11;
        }
    }

    public b(long j10, List<a> list) {
        this.f13812a = j10;
        this.f13813b = list;
    }

    public r7.b a(long j10) {
        long j11;
        if (this.f13813b.size() < 2) {
            return null;
        }
        long j12 = j10;
        long j13 = -1;
        long j14 = -1;
        long j15 = -1;
        long j16 = -1;
        boolean z10 = false;
        for (int size = this.f13813b.size() - 1; size >= 0; size--) {
            a aVar = this.f13813b.get(size);
            boolean equals = "video/mp4".equals(aVar.f13814a) | z10;
            if (size == 0) {
                j12 -= aVar.f13817d;
                j11 = 0;
            } else {
                j11 = j12 - aVar.f13816c;
            }
            long j17 = j12;
            j12 = j11;
            if (!equals || j12 == j17) {
                z10 = equals;
            } else {
                j16 = j17 - j12;
                j15 = j12;
                z10 = false;
            }
            if (size == 0) {
                j13 = j12;
                j14 = j17;
            }
        }
        if (j15 == -1 || j16 == -1 || j13 == -1 || j14 == -1) {
            return null;
        }
        return new r7.b(j13, j14, this.f13812a, j15, j16);
    }
}
