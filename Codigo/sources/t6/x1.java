package t6;

import android.os.Bundle;
import t6.o;

/* loaded from: classes.dex */
public final class x1 extends p3 {

    /* renamed from: e, reason: collision with root package name */
    private static final String f26586e = t8.r0.r0(1);

    /* renamed from: f, reason: collision with root package name */
    private static final String f26587f = t8.r0.r0(2);

    /* renamed from: r, reason: collision with root package name */
    public static final o.a<x1> f26588r = new o.a() { // from class: t6.w1
        @Override // t6.o.a
        public final o a(Bundle bundle) {
            x1 e10;
            e10 = x1.e(bundle);
            return e10;
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private final boolean f26589c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f26590d;

    public x1() {
        this.f26589c = false;
        this.f26590d = false;
    }

    public x1(boolean z10) {
        this.f26589c = true;
        this.f26590d = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static x1 e(Bundle bundle) {
        t8.a.a(bundle.getInt(p3.f26354a, -1) == 0);
        return bundle.getBoolean(f26586e, false) ? new x1(bundle.getBoolean(f26587f, false)) : new x1();
    }

    @Override // t6.o
    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(p3.f26354a, 0);
        bundle.putBoolean(f26586e, this.f26589c);
        bundle.putBoolean(f26587f, this.f26590d);
        return bundle;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof x1)) {
            return false;
        }
        x1 x1Var = (x1) obj;
        return this.f26590d == x1Var.f26590d && this.f26589c == x1Var.f26589c;
    }

    public int hashCode() {
        return eb.k.b(Boolean.valueOf(this.f26589c), Boolean.valueOf(this.f26590d));
    }
}
