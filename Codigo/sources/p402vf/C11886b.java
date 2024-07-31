package p402vf;

import com.google.android.gms.common.internal.C5270q;
import java.util.concurrent.Executor;

/* renamed from: vf.b */
/* loaded from: classes2.dex */
public class C11886b {

    /* renamed from: a */
    private final int f31435a;

    /* renamed from: b */
    private final boolean f31436b;

    /* renamed from: c */
    private final Executor f31437c;

    /* renamed from: vf.b$a */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a */
        private int f31438a = 0;

        /* renamed from: b */
        private boolean f31439b;

        /* renamed from: c */
        private Executor f31440c;

        /* renamed from: a */
        public C11886b m38016a() {
            return new C11886b(this.f31438a, this.f31439b, this.f31440c, null, null);
        }

        /* renamed from: b */
        public a m38017b(int i10, int... iArr) {
            this.f31438a = i10;
            if (iArr != null) {
                for (int i11 : iArr) {
                    this.f31438a = i11 | this.f31438a;
                }
            }
            return this;
        }
    }

    /* synthetic */ C11886b(int i10, boolean z10, Executor executor, C11888d c11888d, C11889e c11889e) {
        this.f31435a = i10;
        this.f31436b = z10;
        this.f31437c = executor;
    }

    /* renamed from: a */
    public final int m38012a() {
        return this.f31435a;
    }

    /* renamed from: b */
    public final C11888d m38013b() {
        return null;
    }

    /* renamed from: c */
    public final Executor m38014c() {
        return this.f31437c;
    }

    /* renamed from: d */
    public final boolean m38015d() {
        return this.f31436b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11886b)) {
            return false;
        }
        C11886b c11886b = (C11886b) obj;
        return this.f31435a == c11886b.f31435a && this.f31436b == c11886b.f31436b && C5270q.m13304b(this.f31437c, c11886b.f31437c) && C5270q.m13304b(null, null);
    }

    public int hashCode() {
        return C5270q.m13305c(Integer.valueOf(this.f31435a), Boolean.valueOf(this.f31436b), this.f31437c, null);
    }
}
