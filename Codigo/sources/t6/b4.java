package t6;

import android.os.Bundle;
import t6.o;

/* loaded from: classes.dex */
public final class b4 extends p3 {

    /* renamed from: e */
    private static final String f25866e = t8.r0.r0(1);

    /* renamed from: f */
    private static final String f25867f = t8.r0.r0(2);

    /* renamed from: r */
    public static final o.a<b4> f25868r = new o.a() { // from class: t6.a4
        @Override // t6.o.a
        public final o a(Bundle bundle) {
            b4 e10;
            e10 = b4.e(bundle);
            return e10;
        }
    };

    /* renamed from: c */
    private final boolean f25869c;

    /* renamed from: d */
    private final boolean f25870d;

    public b4() {
        this.f25869c = false;
        this.f25870d = false;
    }

    public b4(boolean z10) {
        this.f25869c = true;
        this.f25870d = z10;
    }

    public static b4 e(Bundle bundle) {
        t8.a.a(bundle.getInt(p3.f26354a, -1) == 3);
        return bundle.getBoolean(f25866e, false) ? new b4(bundle.getBoolean(f25867f, false)) : new b4();
    }

    @Override // t6.o
    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(p3.f26354a, 3);
        bundle.putBoolean(f25866e, this.f25869c);
        bundle.putBoolean(f25867f, this.f25870d);
        return bundle;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b4)) {
            return false;
        }
        b4 b4Var = (b4) obj;
        return this.f25870d == b4Var.f25870d && this.f25869c == b4Var.f25869c;
    }

    public int hashCode() {
        return eb.k.b(Boolean.valueOf(this.f25869c), Boolean.valueOf(this.f25870d));
    }
}
