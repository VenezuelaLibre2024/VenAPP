package sk;

import java.io.Serializable;
import kotlin.jvm.internal.g;

/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a */
    public static final a f25684a = new a(null);

    /* renamed from: b */
    private static final c f25685b = jk.b.f19988a.b();

    /* loaded from: classes3.dex */
    public static final class a extends c implements Serializable {

        /* renamed from: sk.c$a$a */
        /* loaded from: classes3.dex */
        private static final class C0431a implements Serializable {

            /* renamed from: a */
            public static final C0431a f25686a = new C0431a();
            private static final long serialVersionUID = 0;

            private C0431a() {
            }

            private final Object readResolve() {
                return c.f25684a;
            }
        }

        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        private final Object writeReplace() {
            return C0431a.f25686a;
        }

        @Override // sk.c
        public int b(int i10) {
            return c.f25685b.b(i10);
        }

        @Override // sk.c
        public int c() {
            return c.f25685b.c();
        }

        @Override // sk.c
        public int d(int i10) {
            return c.f25685b.d(i10);
        }

        @Override // sk.c
        public int e(int i10, int i11) {
            return c.f25685b.e(i10, i11);
        }
    }

    public abstract int b(int i10);

    public abstract int c();

    public abstract int d(int i10);

    public int e(int i10, int i11) {
        int c10;
        int i12;
        int i13;
        int c11;
        boolean z10;
        d.b(i10, i11);
        int i14 = i11 - i10;
        if (i14 > 0 || i14 == Integer.MIN_VALUE) {
            if (((-i14) & i14) == i14) {
                i13 = b(d.c(i14));
                return i10 + i13;
            }
            do {
                c10 = c() >>> 1;
                i12 = c10 % i14;
            } while ((c10 - i12) + (i14 - 1) < 0);
            i13 = i12;
            return i10 + i13;
        }
        do {
            c11 = c();
            z10 = false;
            if (i10 <= c11 && c11 < i11) {
                z10 = true;
            }
        } while (!z10);
        return c11;
    }
}
