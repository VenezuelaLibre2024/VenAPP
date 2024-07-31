package p155i7;

import android.util.SparseArray;
import java.util.Collections;
import java.util.List;
import p363t8.C11146e0;
import p363t8.C11164n0;
import p459y6.InterfaceC12623m;

/* renamed from: i7.i0 */
/* loaded from: classes.dex */
public interface InterfaceC7879i0 {

    /* renamed from: i7.i0$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final String f18979a;

        /* renamed from: b */
        public final int f18980b;

        /* renamed from: c */
        public final byte[] f18981c;

        public a(String str, int i10, byte[] bArr) {
            this.f18979a = str;
            this.f18980b = i10;
            this.f18981c = bArr;
        }
    }

    /* renamed from: i7.i0$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final int f18982a;

        /* renamed from: b */
        public final String f18983b;

        /* renamed from: c */
        public final List<a> f18984c;

        /* renamed from: d */
        public final byte[] f18985d;

        public b(int i10, String str, List<a> list, byte[] bArr) {
            this.f18982a = i10;
            this.f18983b = str;
            this.f18984c = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
            this.f18985d = bArr;
        }
    }

    /* renamed from: i7.i0$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        SparseArray<InterfaceC7879i0> mo24260a();

        /* renamed from: b */
        InterfaceC7879i0 mo24261b(int i10, b bVar);
    }

    /* renamed from: i7.i0$d */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        private final String f18986a;

        /* renamed from: b */
        private final int f18987b;

        /* renamed from: c */
        private final int f18988c;

        /* renamed from: d */
        private int f18989d;

        /* renamed from: e */
        private String f18990e;

        public d(int i10, int i11) {
            this(Integer.MIN_VALUE, i10, i11);
        }

        public d(int i10, int i11, int i12) {
            String str;
            if (i10 != Integer.MIN_VALUE) {
                str = i10 + "/";
            } else {
                str = "";
            }
            this.f18986a = str;
            this.f18987b = i11;
            this.f18988c = i12;
            this.f18989d = Integer.MIN_VALUE;
            this.f18990e = "";
        }

        /* renamed from: d */
        private void m24262d() {
            if (this.f18989d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        /* renamed from: a */
        public void m24263a() {
            int i10 = this.f18989d;
            this.f18989d = i10 == Integer.MIN_VALUE ? this.f18987b : i10 + this.f18988c;
            this.f18990e = this.f18986a + this.f18989d;
        }

        /* renamed from: b */
        public String m24264b() {
            m24262d();
            return this.f18990e;
        }

        /* renamed from: c */
        public int m24265c() {
            m24262d();
            return this.f18989d;
        }
    }

    /* renamed from: a */
    void mo24191a(C11164n0 c11164n0, InterfaceC12623m interfaceC12623m, d dVar);

    /* renamed from: b */
    void mo24192b(C11146e0 c11146e0, int i10);

    /* renamed from: c */
    void mo24193c();
}
