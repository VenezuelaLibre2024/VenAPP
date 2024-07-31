package u8;

import android.os.Bundle;
import java.util.Arrays;
import t6.o;
import t8.r0;

/* loaded from: classes.dex */
public final class c implements t6.o {

    /* renamed from: f, reason: collision with root package name */
    public static final c f27350f = new c(1, 2, 3, null);

    /* renamed from: r, reason: collision with root package name */
    private static final String f27351r = r0.r0(0);

    /* renamed from: s, reason: collision with root package name */
    private static final String f27352s = r0.r0(1);

    /* renamed from: t, reason: collision with root package name */
    private static final String f27353t = r0.r0(2);

    /* renamed from: u, reason: collision with root package name */
    private static final String f27354u = r0.r0(3);

    /* renamed from: v, reason: collision with root package name */
    public static final o.a<c> f27355v = new o.a() { // from class: u8.b
        @Override // t6.o.a
        public final t6.o a(Bundle bundle) {
            c e10;
            e10 = c.e(bundle);
            return e10;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final int f27356a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27357b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27358c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f27359d;

    /* renamed from: e, reason: collision with root package name */
    private int f27360e;

    public c(int i10, int i11, int i12, byte[] bArr) {
        this.f27356a = i10;
        this.f27357b = i11;
        this.f27358c = i12;
        this.f27359d = bArr;
    }

    public static int c(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 != 9) {
            return (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int d(int i10) {
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 16) {
            return 6;
        }
        if (i10 != 18) {
            return (i10 == 6 || i10 == 7) ? 3 : -1;
        }
        return 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ c e(Bundle bundle) {
        return new c(bundle.getInt(f27351r, -1), bundle.getInt(f27352s, -1), bundle.getInt(f27353t, -1), bundle.getByteArray(f27354u));
    }

    @Override // t6.o
    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(f27351r, this.f27356a);
        bundle.putInt(f27352s, this.f27357b);
        bundle.putInt(f27353t, this.f27358c);
        bundle.putByteArray(f27354u, this.f27359d);
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f27356a == cVar.f27356a && this.f27357b == cVar.f27357b && this.f27358c == cVar.f27358c && Arrays.equals(this.f27359d, cVar.f27359d);
    }

    public int hashCode() {
        if (this.f27360e == 0) {
            this.f27360e = ((((((527 + this.f27356a) * 31) + this.f27357b) * 31) + this.f27358c) * 31) + Arrays.hashCode(this.f27359d);
        }
        return this.f27360e;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ColorInfo(");
        sb2.append(this.f27356a);
        sb2.append(", ");
        sb2.append(this.f27357b);
        sb2.append(", ");
        sb2.append(this.f27358c);
        sb2.append(", ");
        sb2.append(this.f27359d != null);
        sb2.append(")");
        return sb2.toString();
    }
}
