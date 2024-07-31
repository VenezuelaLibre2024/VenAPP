package yl;

import com.google.android.gms.common.api.a;
import com.google.android.libraries.barhopper.RecognitionOptions;

/* loaded from: classes3.dex */
public final class m {

    /* renamed from: c, reason: collision with root package name */
    public static final a f32206c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private int f32207a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f32208b = new int[10];

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public final int a(int i10) {
        return this.f32208b[i10];
    }

    public final int b() {
        if ((this.f32207a & 2) != 0) {
            return this.f32208b[1];
        }
        return -1;
    }

    public final int c() {
        if ((this.f32207a & RecognitionOptions.ITF) != 0) {
            return this.f32208b[7];
        }
        return 65535;
    }

    public final int d() {
        return (this.f32207a & 16) != 0 ? this.f32208b[4] : a.e.API_PRIORITY_OTHER;
    }

    public final int e(int i10) {
        return (this.f32207a & 32) != 0 ? this.f32208b[5] : i10;
    }

    public final boolean f(int i10) {
        return ((1 << i10) & this.f32207a) != 0;
    }

    public final void g(m other) {
        kotlin.jvm.internal.n.e(other, "other");
        int i10 = 0;
        while (i10 < 10) {
            int i11 = i10 + 1;
            if (other.f(i10)) {
                h(i10, other.a(i10));
            }
            i10 = i11;
        }
    }

    public final m h(int i10, int i11) {
        if (i10 >= 0) {
            int[] iArr = this.f32208b;
            if (i10 < iArr.length) {
                this.f32207a = (1 << i10) | this.f32207a;
                iArr[i10] = i11;
            }
        }
        return this;
    }

    public final int i() {
        return Integer.bitCount(this.f32207a);
    }
}
