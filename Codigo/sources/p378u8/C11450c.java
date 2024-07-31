package p378u8;

import android.os.Bundle;
import java.util.Arrays;
import p361t6.InterfaceC11076o;
import p363t8.C11172r0;

/* renamed from: u8.c */
/* loaded from: classes.dex */
public final class C11450c implements InterfaceC11076o {

    /* renamed from: f */
    public static final C11450c f29653f = new C11450c(1, 2, 3, null);

    /* renamed from: r */
    private static final String f29654r = C11172r0.m34945r0(0);

    /* renamed from: s */
    private static final String f29655s = C11172r0.m34945r0(1);

    /* renamed from: t */
    private static final String f29656t = C11172r0.m34945r0(2);

    /* renamed from: u */
    private static final String f29657u = C11172r0.m34945r0(3);

    /* renamed from: v */
    public static final InterfaceC11076o.a<C11450c> f29658v = new InterfaceC11076o.a() { // from class: u8.b
        @Override // p361t6.InterfaceC11076o.a
        /* renamed from: a */
        public final InterfaceC11076o mo22759a(Bundle bundle) {
            C11450c m35775e;
            m35775e = C11450c.m35775e(bundle);
            return m35775e;
        }
    };

    /* renamed from: a */
    public final int f29659a;

    /* renamed from: b */
    public final int f29660b;

    /* renamed from: c */
    public final int f29661c;

    /* renamed from: d */
    public final byte[] f29662d;

    /* renamed from: e */
    private int f29663e;

    public C11450c(int i10, int i11, int i12, byte[] bArr) {
        this.f29659a = i10;
        this.f29660b = i11;
        this.f29661c = i12;
        this.f29662d = bArr;
    }

    /* renamed from: c */
    public static int m35773c(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 != 9) {
            return (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : -1;
        }
        return 6;
    }

    /* renamed from: d */
    public static int m35774d(int i10) {
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
    /* renamed from: e */
    public static /* synthetic */ C11450c m35775e(Bundle bundle) {
        return new C11450c(bundle.getInt(f29654r, -1), bundle.getInt(f29655s, -1), bundle.getInt(f29656t, -1), bundle.getByteArray(f29657u));
    }

    @Override // p361t6.InterfaceC11076o
    /* renamed from: a */
    public Bundle mo22762a() {
        Bundle bundle = new Bundle();
        bundle.putInt(f29654r, this.f29659a);
        bundle.putInt(f29655s, this.f29660b);
        bundle.putInt(f29656t, this.f29661c);
        bundle.putByteArray(f29657u, this.f29662d);
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11450c.class != obj.getClass()) {
            return false;
        }
        C11450c c11450c = (C11450c) obj;
        return this.f29659a == c11450c.f29659a && this.f29660b == c11450c.f29660b && this.f29661c == c11450c.f29661c && Arrays.equals(this.f29662d, c11450c.f29662d);
    }

    public int hashCode() {
        if (this.f29663e == 0) {
            this.f29663e = ((((((527 + this.f29659a) * 31) + this.f29660b) * 31) + this.f29661c) * 31) + Arrays.hashCode(this.f29662d);
        }
        return this.f29663e;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ColorInfo(");
        sb2.append(this.f29659a);
        sb2.append(", ");
        sb2.append(this.f29660b);
        sb2.append(", ");
        sb2.append(this.f29661c);
        sb2.append(", ");
        sb2.append(this.f29662d != null);
        sb2.append(")");
        return sb2.toString();
    }
}
