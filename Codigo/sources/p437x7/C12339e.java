package p437x7;

import android.util.SparseArray;
import java.util.List;
import p078e7.C7131e;
import p119g7.C7471g;
import p351s8.InterfaceC10823h;
import p361t6.C11108u1;
import p363t8.C11137a;
import p363t8.C11146e0;
import p363t8.C11172r0;
import p363t8.C11178w;
import p376u6.C11391m3;
import p437x7.InterfaceC12341g;
import p459y6.C12610c;
import p459y6.C12620j;
import p459y6.C12635y;
import p459y6.InterfaceC12609b0;
import p459y6.InterfaceC12621k;
import p459y6.InterfaceC12622l;
import p459y6.InterfaceC12623m;
import p459y6.InterfaceC12636z;

/* renamed from: x7.e */
/* loaded from: classes.dex */
public final class C12339e implements InterfaceC12623m, InterfaceC12341g {

    /* renamed from: u */
    public static final InterfaceC12341g.a f33095u = new InterfaceC12341g.a() { // from class: x7.d
        @Override // p437x7.InterfaceC12341g.a
        /* renamed from: a */
        public final InterfaceC12341g mo39893a(int i10, C11108u1 c11108u1, boolean z10, List list, InterfaceC12609b0 interfaceC12609b0, C11391m3 c11391m3) {
            InterfaceC12341g m39895g;
            m39895g = C12339e.m39895g(i10, c11108u1, z10, list, interfaceC12609b0, c11391m3);
            return m39895g;
        }
    };

    /* renamed from: v */
    private static final C12635y f33096v = new C12635y();

    /* renamed from: a */
    private final InterfaceC12621k f33097a;

    /* renamed from: b */
    private final int f33098b;

    /* renamed from: c */
    private final C11108u1 f33099c;

    /* renamed from: d */
    private final SparseArray<a> f33100d = new SparseArray<>();

    /* renamed from: e */
    private boolean f33101e;

    /* renamed from: f */
    private InterfaceC12341g.b f33102f;

    /* renamed from: r */
    private long f33103r;

    /* renamed from: s */
    private InterfaceC12636z f33104s;

    /* renamed from: t */
    private C11108u1[] f33105t;

    /* renamed from: x7.e$a */
    /* loaded from: classes.dex */
    private static final class a implements InterfaceC12609b0 {

        /* renamed from: a */
        private final int f33106a;

        /* renamed from: b */
        private final int f33107b;

        /* renamed from: c */
        private final C11108u1 f33108c;

        /* renamed from: d */
        private final C12620j f33109d = new C12620j();

        /* renamed from: e */
        public C11108u1 f33110e;

        /* renamed from: f */
        private InterfaceC12609b0 f33111f;

        /* renamed from: g */
        private long f33112g;

        public a(int i10, int i11, C11108u1 c11108u1) {
            this.f33106a = i10;
            this.f33107b = i11;
            this.f33108c = c11108u1;
        }

        @Override // p459y6.InterfaceC12609b0
        /* renamed from: b */
        public void mo331b(long j10, int i10, int i11, int i12, InterfaceC12609b0.a aVar) {
            long j11 = this.f33112g;
            if (j11 != -9223372036854775807L && j10 >= j11) {
                this.f33111f = this.f33109d;
            }
            ((InterfaceC12609b0) C11172r0.m34928j(this.f33111f)).mo331b(j10, i10, i11, i12, aVar);
        }

        @Override // p459y6.InterfaceC12609b0
        /* renamed from: c */
        public void mo332c(C11108u1 c11108u1) {
            C11108u1 c11108u12 = this.f33108c;
            if (c11108u12 != null) {
                c11108u1 = c11108u1.m34493l(c11108u12);
            }
            this.f33110e = c11108u1;
            ((InterfaceC12609b0) C11172r0.m34928j(this.f33111f)).mo332c(this.f33110e);
        }

        @Override // p459y6.InterfaceC12609b0
        /* renamed from: d */
        public void mo333d(C11146e0 c11146e0, int i10, int i11) {
            ((InterfaceC12609b0) C11172r0.m34928j(this.f33111f)).m41511a(c11146e0, i10);
        }

        @Override // p459y6.InterfaceC12609b0
        /* renamed from: e */
        public int mo334e(InterfaceC10823h interfaceC10823h, int i10, boolean z10, int i11) {
            return ((InterfaceC12609b0) C11172r0.m34928j(this.f33111f)).m41512f(interfaceC10823h, i10, z10);
        }

        /* renamed from: g */
        public void m39900g(InterfaceC12341g.b bVar, long j10) {
            if (bVar == null) {
                this.f33111f = this.f33109d;
                return;
            }
            this.f33112g = j10;
            InterfaceC12609b0 mo39892d = bVar.mo39892d(this.f33106a, this.f33107b);
            this.f33111f = mo39892d;
            C11108u1 c11108u1 = this.f33110e;
            if (c11108u1 != null) {
                mo39892d.mo332c(c11108u1);
            }
        }
    }

    public C12339e(InterfaceC12621k interfaceC12621k, int i10, C11108u1 c11108u1) {
        this.f33097a = interfaceC12621k;
        this.f33098b = i10;
        this.f33099c = c11108u1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ InterfaceC12341g m39895g(int i10, C11108u1 c11108u1, boolean z10, List list, InterfaceC12609b0 interfaceC12609b0, C11391m3 c11391m3) {
        InterfaceC12621k c7471g;
        String str = c11108u1.f28796v;
        if (C11178w.m35010r(str)) {
            return null;
        }
        if (C11178w.m35009q(str)) {
            c7471g = new C7131e(1);
        } else {
            c7471g = new C7471g(z10 ? 4 : 0, null, null, list, interfaceC12609b0);
        }
        return new C12339e(c7471g, i10, c11108u1);
    }

    @Override // p437x7.InterfaceC12341g
    /* renamed from: a */
    public boolean mo39896a(InterfaceC12622l interfaceC12622l) {
        int mo124f = this.f33097a.mo124f(interfaceC12622l, f33096v);
        C11137a.m34605g(mo124f != 1);
        return mo124f == 0;
    }

    @Override // p437x7.InterfaceC12341g
    /* renamed from: b */
    public C12610c mo39897b() {
        InterfaceC12636z interfaceC12636z = this.f33104s;
        if (interfaceC12636z instanceof C12610c) {
            return (C12610c) interfaceC12636z;
        }
        return null;
    }

    @Override // p437x7.InterfaceC12341g
    /* renamed from: c */
    public void mo39898c(InterfaceC12341g.b bVar, long j10, long j11) {
        this.f33102f = bVar;
        this.f33103r = j11;
        if (!this.f33101e) {
            this.f33097a.mo122b(this);
            if (j10 != -9223372036854775807L) {
                this.f33097a.mo121a(0L, j10);
            }
            this.f33101e = true;
            return;
        }
        InterfaceC12621k interfaceC12621k = this.f33097a;
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        interfaceC12621k.mo121a(0L, j10);
        for (int i10 = 0; i10 < this.f33100d.size(); i10++) {
            this.f33100d.valueAt(i10).m39900g(bVar, j11);
        }
    }

    @Override // p459y6.InterfaceC12623m
    /* renamed from: d */
    public InterfaceC12609b0 mo308d(int i10, int i11) {
        a aVar = this.f33100d.get(i10);
        if (aVar == null) {
            C11137a.m34605g(this.f33105t == null);
            aVar = new a(i10, i11, i11 == this.f33098b ? this.f33099c : null);
            aVar.m39900g(this.f33102f, this.f33103r);
            this.f33100d.put(i10, aVar);
        }
        return aVar;
    }

    @Override // p437x7.InterfaceC12341g
    /* renamed from: e */
    public C11108u1[] mo39899e() {
        return this.f33105t;
    }

    @Override // p459y6.InterfaceC12623m
    /* renamed from: p */
    public void mo323p(InterfaceC12636z interfaceC12636z) {
        this.f33104s = interfaceC12636z;
    }

    @Override // p459y6.InterfaceC12623m
    /* renamed from: q */
    public void mo324q() {
        C11108u1[] c11108u1Arr = new C11108u1[this.f33100d.size()];
        for (int i10 = 0; i10 < this.f33100d.size(); i10++) {
            c11108u1Arr[i10] = (C11108u1) C11137a.m34607i(this.f33100d.valueAt(i10).f33110e);
        }
        this.f33105t = c11108u1Arr;
    }

    @Override // p437x7.InterfaceC12341g
    public void release() {
        this.f33097a.release();
    }
}
