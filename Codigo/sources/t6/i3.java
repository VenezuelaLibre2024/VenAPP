package t6;

import android.os.Bundle;
import t6.o;

/* loaded from: classes.dex */
public final class i3 implements o {

    /* renamed from: d, reason: collision with root package name */
    public static final i3 f26200d = new i3(1.0f);

    /* renamed from: e, reason: collision with root package name */
    private static final String f26201e = t8.r0.r0(0);

    /* renamed from: f, reason: collision with root package name */
    private static final String f26202f = t8.r0.r0(1);

    /* renamed from: r, reason: collision with root package name */
    public static final o.a<i3> f26203r = new o.a() { // from class: t6.h3
        @Override // t6.o.a
        public final o a(Bundle bundle) {
            i3 d10;
            d10 = i3.d(bundle);
            return d10;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final float f26204a;

    /* renamed from: b, reason: collision with root package name */
    public final float f26205b;

    /* renamed from: c, reason: collision with root package name */
    private final int f26206c;

    public i3(float f10) {
        this(f10, 1.0f);
    }

    public i3(float f10, float f11) {
        t8.a.a(f10 > 0.0f);
        t8.a.a(f11 > 0.0f);
        this.f26204a = f10;
        this.f26205b = f11;
        this.f26206c = Math.round(f10 * 1000.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i3 d(Bundle bundle) {
        return new i3(bundle.getFloat(f26201e, 1.0f), bundle.getFloat(f26202f, 1.0f));
    }

    @Override // t6.o
    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putFloat(f26201e, this.f26204a);
        bundle.putFloat(f26202f, this.f26205b);
        return bundle;
    }

    public long c(long j10) {
        return j10 * this.f26206c;
    }

    public i3 e(float f10) {
        return new i3(f10, this.f26205b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i3.class != obj.getClass()) {
            return false;
        }
        i3 i3Var = (i3) obj;
        return this.f26204a == i3Var.f26204a && this.f26205b == i3Var.f26205b;
    }

    public int hashCode() {
        return ((527 + Float.floatToRawIntBits(this.f26204a)) * 31) + Float.floatToRawIntBits(this.f26205b);
    }

    public String toString() {
        return t8.r0.C("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f26204a), Float.valueOf(this.f26205b));
    }
}
