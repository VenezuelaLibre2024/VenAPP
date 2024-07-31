package p155i7;

import p155i7.InterfaceC7879i0;
import p361t6.C11108u1;
import p363t8.C11137a;
import p363t8.C11146e0;
import p363t8.C11173s;
import p459y6.InterfaceC12609b0;
import p459y6.InterfaceC12623m;

/* renamed from: i7.r */
/* loaded from: classes.dex */
public final class C7890r implements InterfaceC7885m {

    /* renamed from: b */
    private InterfaceC12609b0 f19137b;

    /* renamed from: c */
    private boolean f19138c;

    /* renamed from: e */
    private int f19140e;

    /* renamed from: f */
    private int f19141f;

    /* renamed from: a */
    private final C11146e0 f19136a = new C11146e0(10);

    /* renamed from: d */
    private long f19139d = -9223372036854775807L;

    @Override // p155i7.InterfaceC7885m
    /* renamed from: b */
    public void mo24186b(C11146e0 c11146e0) {
        C11137a.m34607i(this.f19137b);
        if (this.f19138c) {
            int m34679a = c11146e0.m34679a();
            int i10 = this.f19141f;
            if (i10 < 10) {
                int min = Math.min(m34679a, 10 - i10);
                System.arraycopy(c11146e0.m34682e(), c11146e0.m34683f(), this.f19136a.m34682e(), this.f19141f, min);
                if (this.f19141f + min == 10) {
                    this.f19136a.m34677U(0);
                    if (73 != this.f19136a.m34664H() || 68 != this.f19136a.m34664H() || 51 != this.f19136a.m34664H()) {
                        C11173s.m34970i("Id3Reader", "Discarding invalid ID3 tag");
                        this.f19138c = false;
                        return;
                    } else {
                        this.f19136a.m34678V(3);
                        this.f19140e = this.f19136a.m34663G() + 10;
                    }
                }
            }
            int min2 = Math.min(m34679a, this.f19140e - this.f19141f);
            this.f19137b.m41511a(c11146e0, min2);
            this.f19141f += min2;
        }
    }

    @Override // p155i7.InterfaceC7885m
    /* renamed from: c */
    public void mo24187c() {
        this.f19138c = false;
        this.f19139d = -9223372036854775807L;
    }

    @Override // p155i7.InterfaceC7885m
    /* renamed from: d */
    public void mo24188d(InterfaceC12623m interfaceC12623m, InterfaceC7879i0.d dVar) {
        dVar.m24263a();
        InterfaceC12609b0 mo308d = interfaceC12623m.mo308d(dVar.m24265c(), 5);
        this.f19137b = mo308d;
        mo308d.mo332c(new C11108u1.b().m34540U(dVar.m24264b()).m34552g0("application/id3").m34526G());
    }

    @Override // p155i7.InterfaceC7885m
    /* renamed from: e */
    public void mo24189e() {
        int i10;
        C11137a.m34607i(this.f19137b);
        if (this.f19138c && (i10 = this.f19140e) != 0 && this.f19141f == i10) {
            long j10 = this.f19139d;
            if (j10 != -9223372036854775807L) {
                this.f19137b.mo331b(j10, 1, i10, 0, null);
            }
            this.f19138c = false;
        }
    }

    @Override // p155i7.InterfaceC7885m
    /* renamed from: f */
    public void mo24190f(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f19138c = true;
        if (j10 != -9223372036854775807L) {
            this.f19139d = j10;
        }
        this.f19140e = 0;
        this.f19141f = 0;
    }
}
