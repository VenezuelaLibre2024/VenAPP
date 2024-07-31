package com.google.android.exoplayer2.source.dash;

import android.os.SystemClock;
import com.google.android.exoplayer2.source.dash.C4719e;
import com.google.android.exoplayer2.source.dash.InterfaceC4715a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p307q8.InterfaceC10312r;
import p351s8.C10810a0;
import p351s8.InterfaceC10816d0;
import p351s8.InterfaceC10820f0;
import p351s8.InterfaceC10827j;
import p351s8.InterfaceC10834m0;
import p361t6.C11108u1;
import p361t6.C11110u3;
import p363t8.C11172r0;
import p376u6.C11391m3;
import p397v7.C11686b;
import p437x7.AbstractC12336b;
import p437x7.AbstractC12340f;
import p437x7.AbstractC12348n;
import p437x7.C12339e;
import p437x7.C12342h;
import p437x7.C12345k;
import p437x7.C12347m;
import p437x7.C12350p;
import p437x7.InterfaceC12341g;
import p437x7.InterfaceC12349o;
import p459y6.C12610c;
import p460y7.C12638b;
import p460y7.C12643g;
import p460y7.C12644h;
import p460y7.InterfaceC12642f;
import p482z7.AbstractC12818j;
import p482z7.C12809a;
import p482z7.C12810b;
import p482z7.C12811c;
import p482z7.C12817i;

/* renamed from: com.google.android.exoplayer2.source.dash.c */
/* loaded from: classes.dex */
public class C4717c implements InterfaceC4715a {

    /* renamed from: a */
    private final InterfaceC10820f0 f9203a;

    /* renamed from: b */
    private final C12638b f9204b;

    /* renamed from: c */
    private final int[] f9205c;

    /* renamed from: d */
    private final int f9206d;

    /* renamed from: e */
    private final InterfaceC10827j f9207e;

    /* renamed from: f */
    private final long f9208f;

    /* renamed from: g */
    private final int f9209g;

    /* renamed from: h */
    private final C4719e.c f9210h;

    /* renamed from: i */
    protected final b[] f9211i;

    /* renamed from: j */
    private InterfaceC10312r f9212j;

    /* renamed from: k */
    private C12811c f9213k;

    /* renamed from: l */
    private int f9214l;

    /* renamed from: m */
    private IOException f9215m;

    /* renamed from: n */
    private boolean f9216n;

    /* renamed from: com.google.android.exoplayer2.source.dash.c$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC4715a.a {

        /* renamed from: a */
        private final InterfaceC10827j.a f9217a;

        /* renamed from: b */
        private final int f9218b;

        /* renamed from: c */
        private final InterfaceC12341g.a f9219c;

        public a(InterfaceC10827j.a aVar) {
            this(aVar, 1);
        }

        public a(InterfaceC10827j.a aVar, int i10) {
            this(C12339e.f33095u, aVar, i10);
        }

        public a(InterfaceC12341g.a aVar, InterfaceC10827j.a aVar2, int i10) {
            this.f9219c = aVar;
            this.f9217a = aVar2;
            this.f9218b = i10;
        }

        @Override // com.google.android.exoplayer2.source.dash.InterfaceC4715a.a
        /* renamed from: a */
        public InterfaceC4715a mo11876a(InterfaceC10820f0 interfaceC10820f0, C12811c c12811c, C12638b c12638b, int i10, int[] iArr, InterfaceC10312r interfaceC10312r, int i11, long j10, boolean z10, List<C11108u1> list, C4719e.c cVar, InterfaceC10834m0 interfaceC10834m0, C11391m3 c11391m3) {
            InterfaceC10827j mo33002a = this.f9217a.mo33002a();
            if (interfaceC10834m0 != null) {
                mo33002a.mo161l(interfaceC10834m0);
            }
            return new C4717c(this.f9219c, interfaceC10820f0, c12811c, c12638b, i10, iArr, interfaceC10312r, i11, mo33002a, j10, this.f9218b, z10, list, cVar, c11391m3);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.google.android.exoplayer2.source.dash.c$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        final InterfaceC12341g f9220a;

        /* renamed from: b */
        public final AbstractC12818j f9221b;

        /* renamed from: c */
        public final C12810b f9222c;

        /* renamed from: d */
        public final InterfaceC12642f f9223d;

        /* renamed from: e */
        private final long f9224e;

        /* renamed from: f */
        private final long f9225f;

        b(long j10, AbstractC12818j abstractC12818j, C12810b c12810b, InterfaceC12341g interfaceC12341g, long j11, InterfaceC12642f interfaceC12642f) {
            this.f9224e = j10;
            this.f9221b = abstractC12818j;
            this.f9222c = c12810b;
            this.f9225f = j11;
            this.f9220a = interfaceC12341g;
            this.f9223d = interfaceC12642f;
        }

        /* renamed from: b */
        b m11919b(long j10, AbstractC12818j abstractC12818j) {
            long mo41623f;
            long mo41623f2;
            InterfaceC12642f mo42544l = this.f9221b.mo42544l();
            InterfaceC12642f mo42544l2 = abstractC12818j.mo42544l();
            if (mo42544l == null) {
                return new b(j10, abstractC12818j, this.f9222c, this.f9220a, this.f9225f, mo42544l);
            }
            if (!mo42544l.mo41625h()) {
                return new b(j10, abstractC12818j, this.f9222c, this.f9220a, this.f9225f, mo42544l2);
            }
            long mo41624g = mo42544l.mo41624g(j10);
            if (mo41624g == 0) {
                return new b(j10, abstractC12818j, this.f9222c, this.f9220a, this.f9225f, mo42544l2);
            }
            long mo41626i = mo42544l.mo41626i();
            long mo41620c = mo42544l.mo41620c(mo41626i);
            long j11 = (mo41624g + mo41626i) - 1;
            long mo41620c2 = mo42544l.mo41620c(j11) + mo42544l.mo41618a(j11, j10);
            long mo41626i2 = mo42544l2.mo41626i();
            long mo41620c3 = mo42544l2.mo41620c(mo41626i2);
            long j12 = this.f9225f;
            if (mo41620c2 == mo41620c3) {
                mo41623f = j11 + 1;
            } else {
                if (mo41620c2 < mo41620c3) {
                    throw new C11686b();
                }
                if (mo41620c3 < mo41620c) {
                    mo41623f2 = j12 - (mo42544l2.mo41623f(mo41620c, j10) - mo41626i);
                    return new b(j10, abstractC12818j, this.f9222c, this.f9220a, mo41623f2, mo42544l2);
                }
                mo41623f = mo42544l.mo41623f(mo41620c3, j10);
            }
            mo41623f2 = j12 + (mo41623f - mo41626i2);
            return new b(j10, abstractC12818j, this.f9222c, this.f9220a, mo41623f2, mo42544l2);
        }

        /* renamed from: c */
        b m11920c(InterfaceC12642f interfaceC12642f) {
            return new b(this.f9224e, this.f9221b, this.f9222c, this.f9220a, this.f9225f, interfaceC12642f);
        }

        /* renamed from: d */
        b m11921d(C12810b c12810b) {
            return new b(this.f9224e, this.f9221b, c12810b, this.f9220a, this.f9225f, this.f9223d);
        }

        /* renamed from: e */
        public long m11922e(long j10) {
            return this.f9223d.mo41619b(this.f9224e, j10) + this.f9225f;
        }

        /* renamed from: f */
        public long m11923f() {
            return this.f9223d.mo41626i() + this.f9225f;
        }

        /* renamed from: g */
        public long m11924g(long j10) {
            return (m11922e(j10) + this.f9223d.mo41627j(this.f9224e, j10)) - 1;
        }

        /* renamed from: h */
        public long m11925h() {
            return this.f9223d.mo41624g(this.f9224e);
        }

        /* renamed from: i */
        public long m11926i(long j10) {
            return m11928k(j10) + this.f9223d.mo41618a(j10 - this.f9225f, this.f9224e);
        }

        /* renamed from: j */
        public long m11927j(long j10) {
            return this.f9223d.mo41623f(j10, this.f9224e) + this.f9225f;
        }

        /* renamed from: k */
        public long m11928k(long j10) {
            return this.f9223d.mo41620c(j10 - this.f9225f);
        }

        /* renamed from: l */
        public C12817i m11929l(long j10) {
            return this.f9223d.mo41622e(j10 - this.f9225f);
        }

        /* renamed from: m */
        public boolean m11930m(long j10, long j11) {
            return this.f9223d.mo41625h() || j11 == -9223372036854775807L || m11926i(j10) <= j11;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.dash.c$c */
    /* loaded from: classes.dex */
    protected static final class c extends AbstractC12336b {

        /* renamed from: e */
        private final b f9226e;

        /* renamed from: f */
        private final long f9227f;

        public c(b bVar, long j10, long j11, long j12) {
            super(j10, j11);
            this.f9226e = bVar;
            this.f9227f = j12;
        }

        @Override // p437x7.InterfaceC12349o
        /* renamed from: a */
        public long mo207a() {
            m39886c();
            return this.f9226e.m11928k(m39887d());
        }

        @Override // p437x7.InterfaceC12349o
        /* renamed from: b */
        public long mo208b() {
            m39886c();
            return this.f9226e.m11926i(m39887d());
        }
    }

    public C4717c(InterfaceC12341g.a aVar, InterfaceC10820f0 interfaceC10820f0, C12811c c12811c, C12638b c12638b, int i10, int[] iArr, InterfaceC10312r interfaceC10312r, int i11, InterfaceC10827j interfaceC10827j, long j10, int i12, boolean z10, List<C11108u1> list, C4719e.c cVar, C11391m3 c11391m3) {
        this.f9203a = interfaceC10820f0;
        this.f9213k = c12811c;
        this.f9204b = c12638b;
        this.f9205c = iArr;
        this.f9212j = interfaceC10312r;
        this.f9206d = i11;
        this.f9207e = interfaceC10827j;
        this.f9214l = i10;
        this.f9208f = j10;
        this.f9209g = i12;
        this.f9210h = cVar;
        long m42462g = c12811c.m42462g(i10);
        ArrayList<AbstractC12818j> m11906n = m11906n();
        this.f9211i = new b[interfaceC10312r.length()];
        int i13 = 0;
        while (i13 < this.f9211i.length) {
            AbstractC12818j abstractC12818j = m11906n.get(interfaceC10312r.mo30882b(i13));
            C12810b m41617j = c12638b.m41617j(abstractC12818j.f34961c);
            b[] bVarArr = this.f9211i;
            if (m41617j == null) {
                m41617j = abstractC12818j.f34961c.get(0);
            }
            int i14 = i13;
            bVarArr[i14] = new b(m42462g, abstractC12818j, m41617j, aVar.mo39893a(i11, abstractC12818j.f34960b, z10, list, cVar, c11391m3), 0L, abstractC12818j.mo42544l());
            i13 = i14 + 1;
        }
    }

    /* renamed from: k */
    private InterfaceC10816d0.a m11903k(InterfaceC10312r interfaceC10312r, List<C12810b> list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = interfaceC10312r.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (interfaceC10312r.mo30887j(i11, elapsedRealtime)) {
                i10++;
            }
        }
        int m41611f = C12638b.m41611f(list);
        return new InterfaceC10816d0.a(m41611f, m41611f - this.f9204b.m41615g(list), length, i10);
    }

    /* renamed from: l */
    private long m11904l(long j10, long j11) {
        if (!this.f9213k.f34913d || this.f9211i[0].m11925h() == 0) {
            return -9223372036854775807L;
        }
        return Math.max(0L, Math.min(m11905m(j10), this.f9211i[0].m11926i(this.f9211i[0].m11924g(j10))) - j11);
    }

    /* renamed from: m */
    private long m11905m(long j10) {
        C12811c c12811c = this.f9213k;
        long j11 = c12811c.f34910a;
        if (j11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j10 - C11172r0.m34861C0(j11 + c12811c.m42459d(this.f9214l).f34946b);
    }

    /* renamed from: n */
    private ArrayList<AbstractC12818j> m11906n() {
        List<C12809a> list = this.f9213k.m42459d(this.f9214l).f34947c;
        ArrayList<AbstractC12818j> arrayList = new ArrayList<>();
        for (int i10 : this.f9205c) {
            arrayList.addAll(list.get(i10).f34902c);
        }
        return arrayList;
    }

    /* renamed from: o */
    private long m11907o(b bVar, AbstractC12348n abstractC12348n, long j10, long j11, long j12) {
        return abstractC12348n != null ? abstractC12348n.mo39935g() : C11172r0.m34944r(bVar.m11927j(j10), j11, j12);
    }

    /* renamed from: r */
    private b m11908r(int i10) {
        b bVar = this.f9211i[i10];
        C12810b m41617j = this.f9204b.m41617j(bVar.f9221b.f34961c);
        if (m41617j == null || m41617j.equals(bVar.f9222c)) {
            return bVar;
        }
        b m11921d = bVar.m11921d(m41617j);
        this.f9211i[i10] = m11921d;
        return m11921d;
    }

    @Override // p437x7.InterfaceC12344j
    /* renamed from: a */
    public void mo11909a() {
        IOException iOException = this.f9215m;
        if (iOException != null) {
            throw iOException;
        }
        this.f9203a.mo11869a();
    }

    @Override // com.google.android.exoplayer2.source.dash.InterfaceC4715a
    /* renamed from: b */
    public void mo11874b(InterfaceC10312r interfaceC10312r) {
        this.f9212j = interfaceC10312r;
    }

    @Override // p437x7.InterfaceC12344j
    /* renamed from: c */
    public long mo11910c(long j10, C11110u3 c11110u3) {
        for (b bVar : this.f9211i) {
            if (bVar.f9223d != null) {
                long m11925h = bVar.m11925h();
                if (m11925h != 0) {
                    long m11927j = bVar.m11927j(j10);
                    long m11928k = bVar.m11928k(m11927j);
                    return c11110u3.m34560a(j10, m11928k, (m11928k >= j10 || (m11925h != -1 && m11927j >= (bVar.m11923f() + m11925h) - 1)) ? m11928k : bVar.m11928k(m11927j + 1));
                }
            }
        }
        return j10;
    }

    @Override // p437x7.InterfaceC12344j
    /* renamed from: d */
    public boolean mo11911d(long j10, AbstractC12340f abstractC12340f, List<? extends AbstractC12348n> list) {
        if (this.f9215m != null) {
            return false;
        }
        return this.f9212j.mo31033k(j10, abstractC12340f, list);
    }

    @Override // com.google.android.exoplayer2.source.dash.InterfaceC4715a
    /* renamed from: e */
    public void mo11875e(C12811c c12811c, int i10) {
        try {
            this.f9213k = c12811c;
            this.f9214l = i10;
            long m42462g = c12811c.m42462g(i10);
            ArrayList<AbstractC12818j> m11906n = m11906n();
            for (int i11 = 0; i11 < this.f9211i.length; i11++) {
                AbstractC12818j abstractC12818j = m11906n.get(this.f9212j.mo30882b(i11));
                b[] bVarArr = this.f9211i;
                bVarArr[i11] = bVarArr[i11].m11919b(m42462g, abstractC12818j);
            }
        } catch (C11686b e10) {
            this.f9215m = e10;
        }
    }

    @Override // p437x7.InterfaceC12344j
    /* renamed from: g */
    public boolean mo11912g(AbstractC12340f abstractC12340f, boolean z10, InterfaceC10816d0.c cVar, InterfaceC10816d0 interfaceC10816d0) {
        InterfaceC10816d0.b mo32953b;
        if (!z10) {
            return false;
        }
        C4719e.c cVar2 = this.f9210h;
        if (cVar2 != null && cVar2.m11957j(abstractC12340f)) {
            return true;
        }
        if (!this.f9213k.f34913d && (abstractC12340f instanceof AbstractC12348n)) {
            IOException iOException = cVar.f27331c;
            if ((iOException instanceof C10810a0) && ((C10810a0) iOException).f27306d == 404) {
                b bVar = this.f9211i[this.f9212j.mo30885e(abstractC12340f.f33116d)];
                long m11925h = bVar.m11925h();
                if (m11925h != -1 && m11925h != 0) {
                    if (((AbstractC12348n) abstractC12340f).mo39935g() > (bVar.m11923f() + m11925h) - 1) {
                        this.f9216n = true;
                        return true;
                    }
                }
            }
        }
        b bVar2 = this.f9211i[this.f9212j.mo30885e(abstractC12340f.f33116d)];
        C12810b m41617j = this.f9204b.m41617j(bVar2.f9221b.f34961c);
        if (m41617j != null && !bVar2.f9222c.equals(m41617j)) {
            return true;
        }
        InterfaceC10816d0.a m11903k = m11903k(this.f9212j, bVar2.f9221b.f34961c);
        if ((!m11903k.m32956a(2) && !m11903k.m32956a(1)) || (mo32953b = interfaceC10816d0.mo32953b(m11903k, cVar)) == null || !m11903k.m32956a(mo32953b.f27327a)) {
            return false;
        }
        int i10 = mo32953b.f27327a;
        if (i10 == 2) {
            InterfaceC10312r interfaceC10312r = this.f9212j;
            return interfaceC10312r.mo30886i(interfaceC10312r.mo30885e(abstractC12340f.f33116d), mo32953b.f27328b);
        }
        if (i10 != 1) {
            return false;
        }
        this.f9204b.m41614e(bVar2.f9222c, mo32953b.f27328b);
        return true;
    }

    @Override // p437x7.InterfaceC12344j
    /* renamed from: h */
    public int mo11913h(long j10, List<? extends AbstractC12348n> list) {
        return (this.f9215m != null || this.f9212j.length() < 2) ? list.size() : this.f9212j.mo30863q(j10, list);
    }

    @Override // p437x7.InterfaceC12344j
    /* renamed from: i */
    public void mo11914i(AbstractC12340f abstractC12340f) {
        C12610c mo39897b;
        if (abstractC12340f instanceof C12347m) {
            int mo30885e = this.f9212j.mo30885e(((C12347m) abstractC12340f).f33116d);
            b bVar = this.f9211i[mo30885e];
            if (bVar.f9223d == null && (mo39897b = bVar.f9220a.mo39897b()) != null) {
                this.f9211i[mo30885e] = bVar.m11920c(new C12644h(mo39897b, bVar.f9221b.f34962d));
            }
        }
        C4719e.c cVar = this.f9210h;
        if (cVar != null) {
            cVar.m11956i(abstractC12340f);
        }
    }

    @Override // p437x7.InterfaceC12344j
    /* renamed from: j */
    public void mo11915j(long j10, long j11, List<? extends AbstractC12348n> list, C12342h c12342h) {
        int i10;
        int i11;
        InterfaceC12349o[] interfaceC12349oArr;
        long j12;
        long j13;
        if (this.f9215m != null) {
            return;
        }
        long j14 = j11 - j10;
        long m34861C0 = C11172r0.m34861C0(this.f9213k.f34910a) + C11172r0.m34861C0(this.f9213k.m42459d(this.f9214l).f34946b) + j11;
        C4719e.c cVar = this.f9210h;
        if (cVar == null || !cVar.m11955h(m34861C0)) {
            long m34861C02 = C11172r0.m34861C0(C11172r0.m34912b0(this.f9208f));
            long m11905m = m11905m(m34861C02);
            AbstractC12348n abstractC12348n = list.isEmpty() ? null : list.get(list.size() - 1);
            int length = this.f9212j.length();
            InterfaceC12349o[] interfaceC12349oArr2 = new InterfaceC12349o[length];
            int i12 = 0;
            while (i12 < length) {
                b bVar = this.f9211i[i12];
                if (bVar.f9223d == null) {
                    interfaceC12349oArr2[i12] = InterfaceC12349o.f33165a;
                    i10 = i12;
                    i11 = length;
                    interfaceC12349oArr = interfaceC12349oArr2;
                    j12 = j14;
                    j13 = m34861C02;
                } else {
                    long m11922e = bVar.m11922e(m34861C02);
                    long m11924g = bVar.m11924g(m34861C02);
                    i10 = i12;
                    i11 = length;
                    interfaceC12349oArr = interfaceC12349oArr2;
                    j12 = j14;
                    j13 = m34861C02;
                    long m11907o = m11907o(bVar, abstractC12348n, j11, m11922e, m11924g);
                    if (m11907o < m11922e) {
                        interfaceC12349oArr[i10] = InterfaceC12349o.f33165a;
                    } else {
                        interfaceC12349oArr[i10] = new c(m11908r(i10), m11907o, m11924g, m11905m);
                    }
                }
                i12 = i10 + 1;
                m34861C02 = j13;
                interfaceC12349oArr2 = interfaceC12349oArr;
                length = i11;
                j14 = j12;
            }
            long j15 = j14;
            long j16 = m34861C02;
            this.f9212j.mo209g(j10, j15, m11904l(j16, j10), list, interfaceC12349oArr2);
            b m11908r = m11908r(this.f9212j.mo210h());
            InterfaceC12341g interfaceC12341g = m11908r.f9220a;
            if (interfaceC12341g != null) {
                AbstractC12818j abstractC12818j = m11908r.f9221b;
                C12817i m42546n = interfaceC12341g.mo39899e() == null ? abstractC12818j.m42546n() : null;
                C12817i mo42545m = m11908r.f9223d == null ? abstractC12818j.mo42545m() : null;
                if (m42546n != null || mo42545m != null) {
                    c12342h.f33122a = m11916p(m11908r, this.f9207e, this.f9212j.mo30889s(), this.f9212j.mo212t(), this.f9212j.mo211m(), m42546n, mo42545m);
                    return;
                }
            }
            long j17 = m11908r.f9224e;
            boolean z10 = j17 != -9223372036854775807L;
            if (m11908r.m11925h() == 0) {
                c12342h.f33123b = z10;
                return;
            }
            long m11922e2 = m11908r.m11922e(j16);
            long m11924g2 = m11908r.m11924g(j16);
            long m11907o2 = m11907o(m11908r, abstractC12348n, j11, m11922e2, m11924g2);
            if (m11907o2 < m11922e2) {
                this.f9215m = new C11686b();
                return;
            }
            if (m11907o2 > m11924g2 || (this.f9216n && m11907o2 >= m11924g2)) {
                c12342h.f33123b = z10;
                return;
            }
            if (z10 && m11908r.m11928k(m11907o2) >= j17) {
                c12342h.f33123b = true;
                return;
            }
            int min = (int) Math.min(this.f9209g, (m11924g2 - m11907o2) + 1);
            if (j17 != -9223372036854775807L) {
                while (min > 1 && m11908r.m11928k((min + m11907o2) - 1) >= j17) {
                    min--;
                }
            }
            c12342h.f33122a = m11917q(m11908r, this.f9207e, this.f9206d, this.f9212j.mo30889s(), this.f9212j.mo212t(), this.f9212j.mo211m(), m11907o2, min, list.isEmpty() ? j11 : -9223372036854775807L, m11905m);
        }
    }

    /* renamed from: p */
    protected AbstractC12340f m11916p(b bVar, InterfaceC10827j interfaceC10827j, C11108u1 c11108u1, int i10, Object obj, C12817i c12817i, C12817i c12817i2) {
        C12817i c12817i3 = c12817i;
        AbstractC12818j abstractC12818j = bVar.f9221b;
        if (c12817i3 != null) {
            C12817i m42539a = c12817i3.m42539a(c12817i2, bVar.f9222c.f34906a);
            if (m42539a != null) {
                c12817i3 = m42539a;
            }
        } else {
            c12817i3 = c12817i2;
        }
        return new C12347m(interfaceC10827j, C12643g.m41628a(abstractC12818j, bVar.f9222c.f34906a, c12817i3, 0), c11108u1, i10, obj, bVar.f9220a);
    }

    /* renamed from: q */
    protected AbstractC12340f m11917q(b bVar, InterfaceC10827j interfaceC10827j, int i10, C11108u1 c11108u1, int i11, Object obj, long j10, int i12, long j11, long j12) {
        AbstractC12818j abstractC12818j = bVar.f9221b;
        long m11928k = bVar.m11928k(j10);
        C12817i m11929l = bVar.m11929l(j10);
        if (bVar.f9220a == null) {
            return new C12350p(interfaceC10827j, C12643g.m41628a(abstractC12818j, bVar.f9222c.f34906a, m11929l, bVar.m11930m(j10, j12) ? 0 : 8), c11108u1, i11, obj, m11928k, bVar.m11926i(j10), j10, i10, c11108u1);
        }
        int i13 = 1;
        int i14 = 1;
        while (i13 < i12) {
            C12817i m42539a = m11929l.m42539a(bVar.m11929l(i13 + j10), bVar.f9222c.f34906a);
            if (m42539a == null) {
                break;
            }
            i14++;
            i13++;
            m11929l = m42539a;
        }
        long j13 = (i14 + j10) - 1;
        long m11926i = bVar.m11926i(j13);
        long j14 = bVar.f9224e;
        return new C12345k(interfaceC10827j, C12643g.m41628a(abstractC12818j, bVar.f9222c.f34906a, m11929l, bVar.m11930m(j13, j12) ? 0 : 8), c11108u1, i11, obj, m11928k, m11926i, j11, (j14 == -9223372036854775807L || j14 > m11926i) ? -9223372036854775807L : j14, j10, i14, -abstractC12818j.f34962d, bVar.f9220a);
    }

    @Override // p437x7.InterfaceC12344j
    public void release() {
        for (b bVar : this.f9211i) {
            InterfaceC12341g interfaceC12341g = bVar.f9220a;
            if (interfaceC12341g != null) {
                interfaceC12341g.release();
            }
        }
    }
}
