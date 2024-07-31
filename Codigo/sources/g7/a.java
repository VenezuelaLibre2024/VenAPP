package g7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import t8.e0;

/* loaded from: classes.dex */
abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f15871a;

    /* renamed from: g7.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static final class C0260a extends a {

        /* renamed from: b, reason: collision with root package name */
        public final long f15872b;

        /* renamed from: c, reason: collision with root package name */
        public final List<b> f15873c;

        /* renamed from: d, reason: collision with root package name */
        public final List<C0260a> f15874d;

        public C0260a(int i10, long j10) {
            super(i10);
            this.f15872b = j10;
            this.f15873c = new ArrayList();
            this.f15874d = new ArrayList();
        }

        public void d(C0260a c0260a) {
            this.f15874d.add(c0260a);
        }

        public void e(b bVar) {
            this.f15873c.add(bVar);
        }

        public C0260a f(int i10) {
            int size = this.f15874d.size();
            for (int i11 = 0; i11 < size; i11++) {
                C0260a c0260a = this.f15874d.get(i11);
                if (c0260a.f15871a == i10) {
                    return c0260a;
                }
            }
            return null;
        }

        public b g(int i10) {
            int size = this.f15873c.size();
            for (int i11 = 0; i11 < size; i11++) {
                b bVar = this.f15873c.get(i11);
                if (bVar.f15871a == i10) {
                    return bVar;
                }
            }
            return null;
        }

        @Override // g7.a
        public String toString() {
            return a.a(this.f15871a) + " leaves: " + Arrays.toString(this.f15873c.toArray()) + " containers: " + Arrays.toString(this.f15874d.toArray());
        }
    }

    /* loaded from: classes.dex */
    static final class b extends a {

        /* renamed from: b, reason: collision with root package name */
        public final e0 f15875b;

        public b(int i10, e0 e0Var) {
            super(i10);
            this.f15875b = e0Var;
        }
    }

    public a(int i10) {
        this.f15871a = i10;
    }

    public static String a(int i10) {
        return "" + ((char) ((i10 >> 24) & 255)) + ((char) ((i10 >> 16) & 255)) + ((char) ((i10 >> 8) & 255)) + ((char) (i10 & 255));
    }

    public static int b(int i10) {
        return i10 & 16777215;
    }

    public static int c(int i10) {
        return (i10 >> 24) & 255;
    }

    public String toString() {
        return a(this.f15871a);
    }
}
