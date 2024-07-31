package i7;

import android.util.SparseArray;
import com.google.android.libraries.barhopper.RecognitionOptions;
import t8.n0;
import y6.z;

/* loaded from: classes.dex */
public final class a0 implements y6.k {

    /* renamed from: l, reason: collision with root package name */
    public static final y6.p f17182l = new y6.p() { // from class: i7.z
        @Override // y6.p
        public final y6.k[] c() {
            y6.k[] d10;
            d10 = a0.d();
            return d10;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final n0 f17183a;

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray<a> f17184b;

    /* renamed from: c, reason: collision with root package name */
    private final t8.e0 f17185c;

    /* renamed from: d, reason: collision with root package name */
    private final y f17186d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f17187e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f17188f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f17189g;

    /* renamed from: h, reason: collision with root package name */
    private long f17190h;

    /* renamed from: i, reason: collision with root package name */
    private x f17191i;

    /* renamed from: j, reason: collision with root package name */
    private y6.m f17192j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f17193k;

    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final m f17194a;

        /* renamed from: b, reason: collision with root package name */
        private final n0 f17195b;

        /* renamed from: c, reason: collision with root package name */
        private final t8.d0 f17196c = new t8.d0(new byte[64]);

        /* renamed from: d, reason: collision with root package name */
        private boolean f17197d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f17198e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f17199f;

        /* renamed from: g, reason: collision with root package name */
        private int f17200g;

        /* renamed from: h, reason: collision with root package name */
        private long f17201h;

        public a(m mVar, n0 n0Var) {
            this.f17194a = mVar;
            this.f17195b = n0Var;
        }

        private void b() {
            this.f17196c.r(8);
            this.f17197d = this.f17196c.g();
            this.f17198e = this.f17196c.g();
            this.f17196c.r(6);
            this.f17200g = this.f17196c.h(8);
        }

        private void c() {
            this.f17201h = 0L;
            if (this.f17197d) {
                this.f17196c.r(4);
                this.f17196c.r(1);
                this.f17196c.r(1);
                long h10 = (this.f17196c.h(3) << 30) | (this.f17196c.h(15) << 15) | this.f17196c.h(15);
                this.f17196c.r(1);
                if (!this.f17199f && this.f17198e) {
                    this.f17196c.r(4);
                    this.f17196c.r(1);
                    this.f17196c.r(1);
                    this.f17196c.r(1);
                    this.f17195b.b((this.f17196c.h(3) << 30) | (this.f17196c.h(15) << 15) | this.f17196c.h(15));
                    this.f17199f = true;
                }
                this.f17201h = this.f17195b.b(h10);
            }
        }

        public void a(t8.e0 e0Var) {
            e0Var.l(this.f17196c.f26645a, 0, 3);
            this.f17196c.p(0);
            b();
            e0Var.l(this.f17196c.f26645a, 0, this.f17200g);
            this.f17196c.p(0);
            c();
            this.f17194a.f(this.f17201h, 4);
            this.f17194a.b(e0Var);
            this.f17194a.e();
        }

        public void d() {
            this.f17199f = false;
            this.f17194a.c();
        }
    }

    public a0() {
        this(new n0(0L));
    }

    public a0(n0 n0Var) {
        this.f17183a = n0Var;
        this.f17185c = new t8.e0(RecognitionOptions.AZTEC);
        this.f17184b = new SparseArray<>();
        this.f17186d = new y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ y6.k[] d() {
        return new y6.k[]{new a0()};
    }

    private void g(long j10) {
        y6.m mVar;
        y6.z bVar;
        if (this.f17193k) {
            return;
        }
        this.f17193k = true;
        if (this.f17186d.c() != -9223372036854775807L) {
            x xVar = new x(this.f17186d.d(), this.f17186d.c(), j10);
            this.f17191i = xVar;
            mVar = this.f17192j;
            bVar = xVar.b();
        } else {
            mVar = this.f17192j;
            bVar = new z.b(this.f17186d.c());
        }
        mVar.p(bVar);
    }

    @Override // y6.k
    public void a(long j10, long j11) {
        boolean z10 = this.f17183a.e() == -9223372036854775807L;
        if (!z10) {
            long c10 = this.f17183a.c();
            z10 = (c10 == -9223372036854775807L || c10 == 0 || c10 == j11) ? false : true;
        }
        if (z10) {
            this.f17183a.g(j11);
        }
        x xVar = this.f17191i;
        if (xVar != null) {
            xVar.h(j11);
        }
        for (int i10 = 0; i10 < this.f17184b.size(); i10++) {
            this.f17184b.valueAt(i10).d();
        }
    }

    @Override // y6.k
    public void b(y6.m mVar) {
        this.f17192j = mVar;
    }

    @Override // y6.k
    public boolean e(y6.l lVar) {
        byte[] bArr = new byte[14];
        lVar.q(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        lVar.k(bArr[13] & 7);
        lVar.q(bArr, 0, 3);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00f8  */
    @Override // y6.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int f(y6.l r10, y6.y r11) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.a0.f(y6.l, y6.y):int");
    }

    @Override // y6.k
    public void release() {
    }
}
