package p155i7;

import android.util.SparseArray;
import com.google.android.libraries.barhopper.RecognitionOptions;
import p363t8.C11144d0;
import p363t8.C11146e0;
import p363t8.C11164n0;
import p459y6.InterfaceC12621k;
import p459y6.InterfaceC12622l;
import p459y6.InterfaceC12623m;
import p459y6.InterfaceC12626p;
import p459y6.InterfaceC12636z;

/* renamed from: i7.a0 */
/* loaded from: classes.dex */
public final class C7863a0 implements InterfaceC12621k {

    /* renamed from: l */
    public static final InterfaceC12626p f18843l = new InterfaceC12626p() { // from class: i7.z
        @Override // p459y6.InterfaceC12626p
        /* renamed from: c */
        public final InterfaceC12621k[] mo9153c() {
            InterfaceC12621k[] m24173d;
            m24173d = C7863a0.m24173d();
            return m24173d;
        }
    };

    /* renamed from: a */
    private final C11164n0 f18844a;

    /* renamed from: b */
    private final SparseArray<a> f18845b;

    /* renamed from: c */
    private final C11146e0 f18846c;

    /* renamed from: d */
    private final C7897y f18847d;

    /* renamed from: e */
    private boolean f18848e;

    /* renamed from: f */
    private boolean f18849f;

    /* renamed from: g */
    private boolean f18850g;

    /* renamed from: h */
    private long f18851h;

    /* renamed from: i */
    private C7896x f18852i;

    /* renamed from: j */
    private InterfaceC12623m f18853j;

    /* renamed from: k */
    private boolean f18854k;

    /* renamed from: i7.a0$a */
    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a */
        private final InterfaceC7885m f18855a;

        /* renamed from: b */
        private final C11164n0 f18856b;

        /* renamed from: c */
        private final C11144d0 f18857c = new C11144d0(new byte[64]);

        /* renamed from: d */
        private boolean f18858d;

        /* renamed from: e */
        private boolean f18859e;

        /* renamed from: f */
        private boolean f18860f;

        /* renamed from: g */
        private int f18861g;

        /* renamed from: h */
        private long f18862h;

        public a(InterfaceC7885m interfaceC7885m, C11164n0 c11164n0) {
            this.f18855a = interfaceC7885m;
            this.f18856b = c11164n0;
        }

        /* renamed from: b */
        private void m24175b() {
            this.f18857c.m34642r(8);
            this.f18858d = this.f18857c.m34631g();
            this.f18859e = this.f18857c.m34631g();
            this.f18857c.m34642r(6);
            this.f18861g = this.f18857c.m34632h(8);
        }

        /* renamed from: c */
        private void m24176c() {
            this.f18862h = 0L;
            if (this.f18858d) {
                this.f18857c.m34642r(4);
                this.f18857c.m34642r(1);
                this.f18857c.m34642r(1);
                long m34632h = (this.f18857c.m34632h(3) << 30) | (this.f18857c.m34632h(15) << 15) | this.f18857c.m34632h(15);
                this.f18857c.m34642r(1);
                if (!this.f18860f && this.f18859e) {
                    this.f18857c.m34642r(4);
                    this.f18857c.m34642r(1);
                    this.f18857c.m34642r(1);
                    this.f18857c.m34642r(1);
                    this.f18856b.m34825b((this.f18857c.m34632h(3) << 30) | (this.f18857c.m34632h(15) << 15) | this.f18857c.m34632h(15));
                    this.f18860f = true;
                }
                this.f18862h = this.f18856b.m34825b(m34632h);
            }
        }

        /* renamed from: a */
        public void m24177a(C11146e0 c11146e0) {
            c11146e0.m34688l(this.f18857c.f28941a, 0, 3);
            this.f18857c.m34640p(0);
            m24175b();
            c11146e0.m34688l(this.f18857c.f28941a, 0, this.f18861g);
            this.f18857c.m34640p(0);
            m24176c();
            this.f18855a.mo24190f(this.f18862h, 4);
            this.f18855a.mo24186b(c11146e0);
            this.f18855a.mo24189e();
        }

        /* renamed from: d */
        public void m24178d() {
            this.f18860f = false;
            this.f18855a.mo24187c();
        }
    }

    public C7863a0() {
        this(new C11164n0(0L));
    }

    public C7863a0(C11164n0 c11164n0) {
        this.f18844a = c11164n0;
        this.f18846c = new C11146e0(RecognitionOptions.AZTEC);
        this.f18845b = new SparseArray<>();
        this.f18847d = new C7897y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ InterfaceC12621k[] m24173d() {
        return new InterfaceC12621k[]{new C7863a0()};
    }

    /* renamed from: g */
    private void m24174g(long j10) {
        InterfaceC12623m interfaceC12623m;
        InterfaceC12636z bVar;
        if (this.f18854k) {
            return;
        }
        this.f18854k = true;
        if (this.f18847d.m24356c() != -9223372036854775807L) {
            C7896x c7896x = new C7896x(this.f18847d.m24357d(), this.f18847d.m24356c(), j10);
            this.f18852i = c7896x;
            interfaceC12623m = this.f18853j;
            bVar = c7896x.m41472b();
        } else {
            interfaceC12623m = this.f18853j;
            bVar = new InterfaceC12636z.b(this.f18847d.m24356c());
        }
        interfaceC12623m.mo323p(bVar);
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: a */
    public void mo121a(long j10, long j11) {
        boolean z10 = this.f18844a.m34828e() == -9223372036854775807L;
        if (!z10) {
            long m34826c = this.f18844a.m34826c();
            z10 = (m34826c == -9223372036854775807L || m34826c == 0 || m34826c == j11) ? false : true;
        }
        if (z10) {
            this.f18844a.m34829g(j11);
        }
        C7896x c7896x = this.f18852i;
        if (c7896x != null) {
            c7896x.m41478h(j11);
        }
        for (int i10 = 0; i10 < this.f18845b.size(); i10++) {
            this.f18845b.valueAt(i10).m24178d();
        }
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: b */
    public void mo122b(InterfaceC12623m interfaceC12623m) {
        this.f18853j = interfaceC12623m;
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: e */
    public boolean mo123e(InterfaceC12622l interfaceC12622l) {
        byte[] bArr = new byte[14];
        interfaceC12622l.mo41540q(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        interfaceC12622l.mo41536k(bArr[13] & 7);
        interfaceC12622l.mo41540q(bArr, 0, 3);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00f8  */
    @Override // p459y6.InterfaceC12621k
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int mo124f(p459y6.InterfaceC12622l r10, p459y6.C12635y r11) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p155i7.C7863a0.mo124f(y6.l, y6.y):int");
    }

    @Override // p459y6.InterfaceC12621k
    public void release() {
    }
}
