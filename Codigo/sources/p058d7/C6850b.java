package p058d7;

import java.util.List;
import p328r7.C10632b;

/* renamed from: d7.b */
/* loaded from: classes.dex */
final class C6850b {

    /* renamed from: a */
    public final long f15166a;

    /* renamed from: b */
    public final List<a> f15167b;

    /* renamed from: d7.b$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final String f15168a;

        /* renamed from: b */
        public final String f15169b;

        /* renamed from: c */
        public final long f15170c;

        /* renamed from: d */
        public final long f15171d;

        public a(String str, String str2, long j10, long j11) {
            this.f15168a = str;
            this.f15169b = str2;
            this.f15170c = j10;
            this.f15171d = j11;
        }
    }

    public C6850b(long j10, List<a> list) {
        this.f15166a = j10;
        this.f15167b = list;
    }

    /* renamed from: a */
    public C10632b m19806a(long j10) {
        long j11;
        if (this.f15167b.size() < 2) {
            return null;
        }
        long j12 = j10;
        long j13 = -1;
        long j14 = -1;
        long j15 = -1;
        long j16 = -1;
        boolean z10 = false;
        for (int size = this.f15167b.size() - 1; size >= 0; size--) {
            a aVar = this.f15167b.get(size);
            boolean equals = "video/mp4".equals(aVar.f15168a) | z10;
            if (size == 0) {
                j12 -= aVar.f15171d;
                j11 = 0;
            } else {
                j11 = j12 - aVar.f15170c;
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
        return new C10632b(j13, j14, this.f15166a, j15, j16);
    }
}
