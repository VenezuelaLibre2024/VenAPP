package u8;

import android.os.Bundle;
import t6.o;
import t8.r0;

/* loaded from: classes.dex */
public final class a0 implements t6.o {

    /* renamed from: e, reason: collision with root package name */
    public static final a0 f27340e = new a0(0, 0);

    /* renamed from: f, reason: collision with root package name */
    private static final String f27341f = r0.r0(0);

    /* renamed from: r, reason: collision with root package name */
    private static final String f27342r = r0.r0(1);

    /* renamed from: s, reason: collision with root package name */
    private static final String f27343s = r0.r0(2);

    /* renamed from: t, reason: collision with root package name */
    private static final String f27344t = r0.r0(3);

    /* renamed from: u, reason: collision with root package name */
    public static final o.a<a0> f27345u = new o.a() { // from class: u8.z
        @Override // t6.o.a
        public final t6.o a(Bundle bundle) {
            a0 c10;
            c10 = a0.c(bundle);
            return c10;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final int f27346a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27347b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27348c;

    /* renamed from: d, reason: collision with root package name */
    public final float f27349d;

    public a0(int i10, int i11) {
        this(i10, i11, 0, 1.0f);
    }

    public a0(int i10, int i11, int i12, float f10) {
        this.f27346a = i10;
        this.f27347b = i11;
        this.f27348c = i12;
        this.f27349d = f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ a0 c(Bundle bundle) {
        return new a0(bundle.getInt(f27341f, 0), bundle.getInt(f27342r, 0), bundle.getInt(f27343s, 0), bundle.getFloat(f27344t, 1.0f));
    }

    @Override // t6.o
    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(f27341f, this.f27346a);
        bundle.putInt(f27342r, this.f27347b);
        bundle.putInt(f27343s, this.f27348c);
        bundle.putFloat(f27344t, this.f27349d);
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f27346a == a0Var.f27346a && this.f27347b == a0Var.f27347b && this.f27348c == a0Var.f27348c && this.f27349d == a0Var.f27349d;
    }

    public int hashCode() {
        return ((((((217 + this.f27346a) * 31) + this.f27347b) * 31) + this.f27348c) * 31) + Float.floatToRawIntBits(this.f27349d);
    }
}
