package p216l7;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p216l7.C9400a;
import p361t6.AbstractC11061l;
import p361t6.C11108u1;
import p361t6.C11113v1;
import p361t6.InterfaceC11095r3;
import p363t8.C11137a;
import p363t8.C11172r0;

/* renamed from: l7.f */
/* loaded from: classes.dex */
public final class C9405f extends AbstractC11061l implements Handler.Callback {

    /* renamed from: A */
    private final Handler f22807A;

    /* renamed from: B */
    private final C9403d f22808B;

    /* renamed from: C */
    private final boolean f22809C;

    /* renamed from: D */
    private InterfaceC9401b f22810D;

    /* renamed from: E */
    private boolean f22811E;

    /* renamed from: F */
    private boolean f22812F;

    /* renamed from: G */
    private long f22813G;

    /* renamed from: H */
    private C9400a f22814H;

    /* renamed from: I */
    private long f22815I;

    /* renamed from: y */
    private final InterfaceC9402c f22816y;

    /* renamed from: z */
    private final InterfaceC9404e f22817z;

    public C9405f(InterfaceC9404e interfaceC9404e, Looper looper) {
        this(interfaceC9404e, looper, InterfaceC9402c.f22805a);
    }

    public C9405f(InterfaceC9404e interfaceC9404e, Looper looper, InterfaceC9402c interfaceC9402c) {
        this(interfaceC9404e, looper, interfaceC9402c, false);
    }

    public C9405f(InterfaceC9404e interfaceC9404e, Looper looper, InterfaceC9402c interfaceC9402c, boolean z10) {
        super(5);
        this.f22817z = (InterfaceC9404e) C11137a.m34603e(interfaceC9404e);
        this.f22807A = looper == null ? null : C11172r0.m34952v(looper, this);
        this.f22816y = (InterfaceC9402c) C11137a.m34603e(interfaceC9402c);
        this.f22809C = z10;
        this.f22808B = new C9403d();
        this.f22815I = -9223372036854775807L;
    }

    /* renamed from: Y */
    private void m28008Y(C9400a c9400a, List<C9400a.b> list) {
        for (int i10 = 0; i10 < c9400a.m27999e(); i10++) {
            C11108u1 mo28002H = c9400a.m27998d(i10).mo28002H();
            if (mo28002H == null || !this.f22816y.mo28006a(mo28002H)) {
                list.add(c9400a.m27998d(i10));
            } else {
                InterfaceC9401b mo28007b = this.f22816y.mo28007b(mo28002H);
                byte[] bArr = (byte[]) C11137a.m34603e(c9400a.m27998d(i10).mo28004q1());
                this.f22808B.mo22818n();
                this.f22808B.m38811y(bArr.length);
                ((ByteBuffer) C11172r0.m34928j(this.f22808B.f32142c)).put(bArr);
                this.f22808B.m38812z();
                C9400a mo28005a = mo28007b.mo28005a(this.f22808B);
                if (mo28005a != null) {
                    m28008Y(mo28005a, list);
                }
            }
        }
    }

    /* renamed from: Z */
    private long m28009Z(long j10) {
        C11137a.m34605g(j10 != -9223372036854775807L);
        C11137a.m34605g(this.f22815I != -9223372036854775807L);
        return j10 - this.f22815I;
    }

    /* renamed from: a0 */
    private void m28010a0(C9400a c9400a) {
        Handler handler = this.f22807A;
        if (handler != null) {
            handler.obtainMessage(0, c9400a).sendToTarget();
        } else {
            m28011b0(c9400a);
        }
    }

    /* renamed from: b0 */
    private void m28011b0(C9400a c9400a) {
        this.f22817z.onMetadata(c9400a);
    }

    /* renamed from: c0 */
    private boolean m28012c0(long j10) {
        boolean z10;
        C9400a c9400a = this.f22814H;
        if (c9400a == null || (!this.f22809C && c9400a.f22804b > m28009Z(j10))) {
            z10 = false;
        } else {
            m28010a0(this.f22814H);
            this.f22814H = null;
            z10 = true;
        }
        if (this.f22811E && this.f22814H == null) {
            this.f22812F = true;
        }
        return z10;
    }

    /* renamed from: d0 */
    private void m28013d0() {
        if (this.f22811E || this.f22814H != null) {
            return;
        }
        this.f22808B.mo22818n();
        C11113v1 m34237J = m34237J();
        int m34242V = m34242V(m34237J, this.f22808B, 0);
        if (m34242V != -4) {
            if (m34242V == -5) {
                this.f22813G = ((C11108u1) C11137a.m34603e(m34237J.f28853b)).f28767A;
            }
        } else {
            if (this.f22808B.m38794s()) {
                this.f22811E = true;
                return;
            }
            C9403d c9403d = this.f22808B;
            c9403d.f22806t = this.f22813G;
            c9403d.m38812z();
            C9400a mo28005a = ((InterfaceC9401b) C11172r0.m34928j(this.f22810D)).mo28005a(this.f22808B);
            if (mo28005a != null) {
                ArrayList arrayList = new ArrayList(mo28005a.m27999e());
                m28008Y(mo28005a, arrayList);
                if (arrayList.isEmpty()) {
                    return;
                }
                this.f22814H = new C9400a(m28009Z(this.f22808B.f32144e), arrayList);
            }
        }
    }

    @Override // p361t6.AbstractC11061l
    /* renamed from: O */
    protected void mo22831O() {
        this.f22814H = null;
        this.f22810D = null;
        this.f22815I = -9223372036854775807L;
    }

    @Override // p361t6.AbstractC11061l
    /* renamed from: Q */
    protected void mo22832Q(long j10, boolean z10) {
        this.f22814H = null;
        this.f22811E = false;
        this.f22812F = false;
    }

    @Override // p361t6.AbstractC11061l
    /* renamed from: U */
    protected void mo22833U(C11108u1[] c11108u1Arr, long j10, long j11) {
        this.f22810D = this.f22816y.mo28007b(c11108u1Arr[0]);
        C9400a c9400a = this.f22814H;
        if (c9400a != null) {
            this.f22814H = c9400a.m27997c((c9400a.f22804b + this.f22815I) - j11);
        }
        this.f22815I = j11;
    }

    @Override // p361t6.InterfaceC11095r3
    /* renamed from: a */
    public int mo22834a(C11108u1 c11108u1) {
        if (this.f22816y.mo28006a(c11108u1)) {
            return InterfaceC11095r3.m34459o(c11108u1.f28784R == 0 ? 4 : 2);
        }
        return InterfaceC11095r3.m34459o(0);
    }

    @Override // p361t6.InterfaceC11090q3
    /* renamed from: d */
    public boolean mo22835d() {
        return true;
    }

    @Override // p361t6.InterfaceC11090q3
    /* renamed from: e */
    public boolean mo22836e() {
        return this.f22812F;
    }

    @Override // p361t6.InterfaceC11090q3, p361t6.InterfaceC11095r3
    public String getName() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        m28011b0((C9400a) message.obj);
        return true;
    }

    @Override // p361t6.InterfaceC11090q3
    /* renamed from: z */
    public void mo22838z(long j10, long j11) {
        boolean z10 = true;
        while (z10) {
            m28013d0();
            z10 = m28012c0(j10);
        }
    }
}
