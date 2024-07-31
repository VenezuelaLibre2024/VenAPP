package vf;

import com.google.android.gms.common.internal.q;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final int f29001a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f29002b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f29003c;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private int f29004a = 0;

        /* renamed from: b, reason: collision with root package name */
        private boolean f29005b;

        /* renamed from: c, reason: collision with root package name */
        private Executor f29006c;

        public b a() {
            return new b(this.f29004a, this.f29005b, this.f29006c, null, null);
        }

        public a b(int i10, int... iArr) {
            this.f29004a = i10;
            if (iArr != null) {
                for (int i11 : iArr) {
                    this.f29004a = i11 | this.f29004a;
                }
            }
            return this;
        }
    }

    /* synthetic */ b(int i10, boolean z10, Executor executor, d dVar, e eVar) {
        this.f29001a = i10;
        this.f29002b = z10;
        this.f29003c = executor;
    }

    public final int a() {
        return this.f29001a;
    }

    public final d b() {
        return null;
    }

    public final Executor c() {
        return this.f29003c;
    }

    public final boolean d() {
        return this.f29002b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f29001a == bVar.f29001a && this.f29002b == bVar.f29002b && q.b(this.f29003c, bVar.f29003c) && q.b(null, null);
    }

    public int hashCode() {
        return q.c(Integer.valueOf(this.f29001a), Boolean.valueOf(this.f29002b), this.f29003c, null);
    }
}
