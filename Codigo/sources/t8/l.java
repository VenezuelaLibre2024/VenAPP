package t8;

import android.util.SparseBooleanArray;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final SparseBooleanArray f26696a;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final SparseBooleanArray f26697a = new SparseBooleanArray();

        /* renamed from: b, reason: collision with root package name */
        private boolean f26698b;

        public b a(int i10) {
            t8.a.g(!this.f26698b);
            this.f26697a.append(i10, true);
            return this;
        }

        public b b(l lVar) {
            for (int i10 = 0; i10 < lVar.c(); i10++) {
                a(lVar.b(i10));
            }
            return this;
        }

        public b c(int... iArr) {
            for (int i10 : iArr) {
                a(i10);
            }
            return this;
        }

        public b d(int i10, boolean z10) {
            return z10 ? a(i10) : this;
        }

        public l e() {
            t8.a.g(!this.f26698b);
            this.f26698b = true;
            return new l(this.f26697a);
        }
    }

    private l(SparseBooleanArray sparseBooleanArray) {
        this.f26696a = sparseBooleanArray;
    }

    public boolean a(int i10) {
        return this.f26696a.get(i10);
    }

    public int b(int i10) {
        t8.a.c(i10, 0, c());
        return this.f26696a.keyAt(i10);
    }

    public int c() {
        return this.f26696a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (r0.f26744a >= 24) {
            return this.f26696a.equals(lVar.f26696a);
        }
        if (c() != lVar.c()) {
            return false;
        }
        for (int i10 = 0; i10 < c(); i10++) {
            if (b(i10) != lVar.b(i10)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (r0.f26744a >= 24) {
            return this.f26696a.hashCode();
        }
        int c10 = c();
        for (int i10 = 0; i10 < c(); i10++) {
            c10 = (c10 * 31) + b(i10);
        }
        return c10;
    }
}
