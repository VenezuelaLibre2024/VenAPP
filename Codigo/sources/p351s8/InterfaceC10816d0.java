package p351s8;

import java.io.IOException;
import p363t8.C11137a;
import p397v7.C11731u;
import p397v7.C11737x;

/* renamed from: s8.d0 */
/* loaded from: classes.dex */
public interface InterfaceC10816d0 {

    /* renamed from: s8.d0$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final int f27323a;

        /* renamed from: b */
        public final int f27324b;

        /* renamed from: c */
        public final int f27325c;

        /* renamed from: d */
        public final int f27326d;

        public a(int i10, int i11, int i12, int i13) {
            this.f27323a = i10;
            this.f27324b = i11;
            this.f27325c = i12;
            this.f27326d = i13;
        }

        /* renamed from: a */
        public boolean m32956a(int i10) {
            if (i10 == 1) {
                if (this.f27323a - this.f27324b <= 1) {
                    return false;
                }
            } else if (this.f27325c - this.f27326d <= 1) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: s8.d0$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final int f27327a;

        /* renamed from: b */
        public final long f27328b;

        public b(int i10, long j10) {
            C11137a.m34599a(j10 >= 0);
            this.f27327a = i10;
            this.f27328b = j10;
        }
    }

    /* renamed from: s8.d0$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public final C11731u f27329a;

        /* renamed from: b */
        public final C11737x f27330b;

        /* renamed from: c */
        public final IOException f27331c;

        /* renamed from: d */
        public final int f27332d;

        public c(C11731u c11731u, C11737x c11737x, IOException iOException, int i10) {
            this.f27329a = c11731u;
            this.f27330b = c11737x;
            this.f27331c = iOException;
            this.f27332d = i10;
        }
    }

    /* renamed from: a */
    int mo32952a(int i10);

    /* renamed from: b */
    b mo32953b(a aVar, c cVar);

    /* renamed from: c */
    default void m32954c(long j10) {
    }

    /* renamed from: d */
    long mo32955d(c cVar);
}
