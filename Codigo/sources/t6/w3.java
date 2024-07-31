package t6;

import android.os.Bundle;
import t6.o;

/* loaded from: classes.dex */
public final class w3 extends p3 {

    /* renamed from: e, reason: collision with root package name */
    private static final String f26574e = t8.r0.r0(1);

    /* renamed from: f, reason: collision with root package name */
    private static final String f26575f = t8.r0.r0(2);

    /* renamed from: r, reason: collision with root package name */
    public static final o.a<w3> f26576r = new o.a() { // from class: t6.v3
        @Override // t6.o.a
        public final o a(Bundle bundle) {
            w3 e10;
            e10 = w3.e(bundle);
            return e10;
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private final int f26577c;

    /* renamed from: d, reason: collision with root package name */
    private final float f26578d;

    public w3(int i10) {
        t8.a.b(i10 > 0, "maxStars must be a positive integer");
        this.f26577c = i10;
        this.f26578d = -1.0f;
    }

    public w3(int i10, float f10) {
        t8.a.b(i10 > 0, "maxStars must be a positive integer");
        t8.a.b(f10 >= 0.0f && f10 <= ((float) i10), "starRating is out of range [0, maxStars]");
        this.f26577c = i10;
        this.f26578d = f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static w3 e(Bundle bundle) {
        t8.a.a(bundle.getInt(p3.f26354a, -1) == 2);
        int i10 = bundle.getInt(f26574e, 5);
        float f10 = bundle.getFloat(f26575f, -1.0f);
        return f10 == -1.0f ? new w3(i10) : new w3(i10, f10);
    }

    @Override // t6.o
    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(p3.f26354a, 2);
        bundle.putInt(f26574e, this.f26577c);
        bundle.putFloat(f26575f, this.f26578d);
        return bundle;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof w3)) {
            return false;
        }
        w3 w3Var = (w3) obj;
        return this.f26577c == w3Var.f26577c && this.f26578d == w3Var.f26578d;
    }

    public int hashCode() {
        return eb.k.b(Integer.valueOf(this.f26577c), Float.valueOf(this.f26578d));
    }
}
