package p473yl;

import com.google.android.gms.common.api.C5101a;
import com.google.android.libraries.barhopper.RecognitionOptions;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;

/* renamed from: yl.m */
/* loaded from: classes3.dex */
public final class C12745m {

    /* renamed from: c */
    public static final a f34757c = new a(null);

    /* renamed from: a */
    private int f34758a;

    /* renamed from: b */
    private final int[] f34759b = new int[10];

    /* renamed from: yl.m$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    /* renamed from: a */
    public final int m42271a(int i10) {
        return this.f34759b[i10];
    }

    /* renamed from: b */
    public final int m42272b() {
        if ((this.f34758a & 2) != 0) {
            return this.f34759b[1];
        }
        return -1;
    }

    /* renamed from: c */
    public final int m42273c() {
        if ((this.f34758a & RecognitionOptions.ITF) != 0) {
            return this.f34759b[7];
        }
        return 65535;
    }

    /* renamed from: d */
    public final int m42274d() {
        return (this.f34758a & 16) != 0 ? this.f34759b[4] : C5101a.e.API_PRIORITY_OTHER;
    }

    /* renamed from: e */
    public final int m42275e(int i10) {
        return (this.f34758a & 32) != 0 ? this.f34759b[5] : i10;
    }

    /* renamed from: f */
    public final boolean m42276f(int i10) {
        return ((1 << i10) & this.f34758a) != 0;
    }

    /* renamed from: g */
    public final void m42277g(C12745m other) {
        C9322n.m27781e(other, "other");
        int i10 = 0;
        while (i10 < 10) {
            int i11 = i10 + 1;
            if (other.m42276f(i10)) {
                m42278h(i10, other.m42271a(i10));
            }
            i10 = i11;
        }
    }

    /* renamed from: h */
    public final C12745m m42278h(int i10, int i11) {
        if (i10 >= 0) {
            int[] iArr = this.f34759b;
            if (i10 < iArr.length) {
                this.f34758a = (1 << i10) | this.f34758a;
                iArr[i10] = i11;
            }
        }
        return this;
    }

    /* renamed from: i */
    public final int m42279i() {
        return Integer.bitCount(this.f34758a);
    }
}
