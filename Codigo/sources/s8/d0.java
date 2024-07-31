package s8;

import java.io.IOException;

/* loaded from: classes.dex */
public interface d0 {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f25204a;

        /* renamed from: b, reason: collision with root package name */
        public final int f25205b;

        /* renamed from: c, reason: collision with root package name */
        public final int f25206c;

        /* renamed from: d, reason: collision with root package name */
        public final int f25207d;

        public a(int i10, int i11, int i12, int i13) {
            this.f25204a = i10;
            this.f25205b = i11;
            this.f25206c = i12;
            this.f25207d = i13;
        }

        public boolean a(int i10) {
            if (i10 == 1) {
                if (this.f25204a - this.f25205b <= 1) {
                    return false;
                }
            } else if (this.f25206c - this.f25207d <= 1) {
                return false;
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f25208a;

        /* renamed from: b, reason: collision with root package name */
        public final long f25209b;

        public b(int i10, long j10) {
            t8.a.a(j10 >= 0);
            this.f25208a = i10;
            this.f25209b = j10;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final v7.u f25210a;

        /* renamed from: b, reason: collision with root package name */
        public final v7.x f25211b;

        /* renamed from: c, reason: collision with root package name */
        public final IOException f25212c;

        /* renamed from: d, reason: collision with root package name */
        public final int f25213d;

        public c(v7.u uVar, v7.x xVar, IOException iOException, int i10) {
            this.f25210a = uVar;
            this.f25211b = xVar;
            this.f25212c = iOException;
            this.f25213d = i10;
        }
    }

    int a(int i10);

    b b(a aVar, c cVar);

    default void c(long j10) {
    }

    long d(c cVar);
}
