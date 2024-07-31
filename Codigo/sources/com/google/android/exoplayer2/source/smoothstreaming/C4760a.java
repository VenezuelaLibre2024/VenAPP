package com.google.android.exoplayer2.source.smoothstreaming;

import android.net.Uri;
import com.google.android.exoplayer2.source.smoothstreaming.InterfaceC4761b;
import java.io.IOException;
import java.util.List;
import p100f8.C7314a;
import p119g7.C7471g;
import p119g7.C7479o;
import p119g7.C7480p;
import p307q8.C10320z;
import p307q8.InterfaceC10312r;
import p351s8.C10835n;
import p351s8.InterfaceC10816d0;
import p351s8.InterfaceC10820f0;
import p351s8.InterfaceC10827j;
import p351s8.InterfaceC10834m0;
import p361t6.C11108u1;
import p361t6.C11110u3;
import p363t8.C11137a;
import p397v7.C11686b;
import p437x7.AbstractC12336b;
import p437x7.AbstractC12340f;
import p437x7.AbstractC12348n;
import p437x7.C12339e;
import p437x7.C12342h;
import p437x7.C12345k;
import p437x7.InterfaceC12341g;
import p437x7.InterfaceC12349o;

/* renamed from: com.google.android.exoplayer2.source.smoothstreaming.a */
/* loaded from: classes.dex */
public class C4760a implements InterfaceC4761b {

    /* renamed from: a */
    private final InterfaceC10820f0 f9553a;

    /* renamed from: b */
    private final int f9554b;

    /* renamed from: c */
    private final InterfaceC12341g[] f9555c;

    /* renamed from: d */
    private final InterfaceC10827j f9556d;

    /* renamed from: e */
    private InterfaceC10312r f9557e;

    /* renamed from: f */
    private C7314a f9558f;

    /* renamed from: g */
    private int f9559g;

    /* renamed from: h */
    private IOException f9560h;

    /* renamed from: com.google.android.exoplayer2.source.smoothstreaming.a$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC4761b.a {

        /* renamed from: a */
        private final InterfaceC10827j.a f9561a;

        public a(InterfaceC10827j.a aVar) {
            this.f9561a = aVar;
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.InterfaceC4761b.a
        /* renamed from: a */
        public InterfaceC4761b mo12266a(InterfaceC10820f0 interfaceC10820f0, C7314a c7314a, int i10, InterfaceC10312r interfaceC10312r, InterfaceC10834m0 interfaceC10834m0) {
            InterfaceC10827j mo33002a = this.f9561a.mo33002a();
            if (interfaceC10834m0 != null) {
                mo33002a.mo161l(interfaceC10834m0);
            }
            return new C4760a(interfaceC10820f0, c7314a, i10, interfaceC10312r, mo33002a);
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.smoothstreaming.a$b */
    /* loaded from: classes.dex */
    private static final class b extends AbstractC12336b {

        /* renamed from: e */
        private final C7314a.b f9562e;

        /* renamed from: f */
        private final int f9563f;

        public b(C7314a.b bVar, int i10, int i11) {
            super(i11, bVar.f16441k - 1);
            this.f9562e = bVar;
            this.f9563f = i10;
        }

        @Override // p437x7.InterfaceC12349o
        /* renamed from: a */
        public long mo207a() {
            m39886c();
            return this.f9562e.m21921e((int) m39887d());
        }

        @Override // p437x7.InterfaceC12349o
        /* renamed from: b */
        public long mo208b() {
            return mo207a() + this.f9562e.m21919c((int) m39887d());
        }
    }

    public C4760a(InterfaceC10820f0 interfaceC10820f0, C7314a c7314a, int i10, InterfaceC10312r interfaceC10312r, InterfaceC10827j interfaceC10827j) {
        this.f9553a = interfaceC10820f0;
        this.f9558f = c7314a;
        this.f9554b = i10;
        this.f9557e = interfaceC10312r;
        this.f9556d = interfaceC10827j;
        C7314a.b bVar = c7314a.f16425f[i10];
        this.f9555c = new InterfaceC12341g[interfaceC10312r.length()];
        int i11 = 0;
        while (i11 < this.f9555c.length) {
            int mo30882b = interfaceC10312r.mo30882b(i11);
            C11108u1 c11108u1 = bVar.f16440j[mo30882b];
            C7480p[] c7480pArr = c11108u1.f28800z != null ? ((C7314a.a) C11137a.m34603e(c7314a.f16424e)).f16430c : null;
            int i12 = bVar.f16431a;
            int i13 = i11;
            this.f9555c[i13] = new C12339e(new C7471g(3, null, new C7479o(mo30882b, i12, bVar.f16433c, -9223372036854775807L, c7314a.f16426g, c11108u1, 0, c7480pArr, i12 == 2 ? 4 : 0, null, null)), bVar.f16431a, c11108u1);
            i11 = i13 + 1;
        }
    }

    /* renamed from: k */
    private static AbstractC12348n m12262k(C11108u1 c11108u1, InterfaceC10827j interfaceC10827j, Uri uri, int i10, long j10, long j11, long j12, int i11, Object obj, InterfaceC12341g interfaceC12341g) {
        return new C12345k(interfaceC10827j, new C10835n(uri), c11108u1, i11, obj, j10, j11, j12, -9223372036854775807L, i10, 1, j10, interfaceC12341g);
    }

    /* renamed from: l */
    private long m12263l(long j10) {
        C7314a c7314a = this.f9558f;
        if (!c7314a.f16423d) {
            return -9223372036854775807L;
        }
        C7314a.b bVar = c7314a.f16425f[this.f9554b];
        int i10 = bVar.f16441k - 1;
        return (bVar.m21921e(i10) + bVar.m21919c(i10)) - j10;
    }

    @Override // p437x7.InterfaceC12344j
    /* renamed from: a */
    public void mo11909a() {
        IOException iOException = this.f9560h;
        if (iOException != null) {
            throw iOException;
        }
        this.f9553a.mo11869a();
    }

    @Override // com.google.android.exoplayer2.source.smoothstreaming.InterfaceC4761b
    /* renamed from: b */
    public void mo12264b(InterfaceC10312r interfaceC10312r) {
        this.f9557e = interfaceC10312r;
    }

    @Override // p437x7.InterfaceC12344j
    /* renamed from: c */
    public long mo11910c(long j10, C11110u3 c11110u3) {
        C7314a.b bVar = this.f9558f.f16425f[this.f9554b];
        int m21920d = bVar.m21920d(j10);
        long m21921e = bVar.m21921e(m21920d);
        return c11110u3.m34560a(j10, m21921e, (m21921e >= j10 || m21920d >= bVar.f16441k + (-1)) ? m21921e : bVar.m21921e(m21920d + 1));
    }

    @Override // p437x7.InterfaceC12344j
    /* renamed from: d */
    public boolean mo11911d(long j10, AbstractC12340f abstractC12340f, List<? extends AbstractC12348n> list) {
        if (this.f9560h != null) {
            return false;
        }
        return this.f9557e.mo31033k(j10, abstractC12340f, list);
    }

    @Override // com.google.android.exoplayer2.source.smoothstreaming.InterfaceC4761b
    /* renamed from: f */
    public void mo12265f(C7314a c7314a) {
        C7314a.b[] bVarArr = this.f9558f.f16425f;
        int i10 = this.f9554b;
        C7314a.b bVar = bVarArr[i10];
        int i11 = bVar.f16441k;
        C7314a.b bVar2 = c7314a.f16425f[i10];
        if (i11 != 0 && bVar2.f16441k != 0) {
            int i12 = i11 - 1;
            long m21921e = bVar.m21921e(i12) + bVar.m21919c(i12);
            long m21921e2 = bVar2.m21921e(0);
            if (m21921e > m21921e2) {
                this.f9559g += bVar.m21920d(m21921e2);
                this.f9558f = c7314a;
            }
        }
        this.f9559g += i11;
        this.f9558f = c7314a;
    }

    @Override // p437x7.InterfaceC12344j
    /* renamed from: g */
    public boolean mo11912g(AbstractC12340f abstractC12340f, boolean z10, InterfaceC10816d0.c cVar, InterfaceC10816d0 interfaceC10816d0) {
        InterfaceC10816d0.b mo32953b = interfaceC10816d0.mo32953b(C10320z.m31110c(this.f9557e), cVar);
        if (z10 && mo32953b != null && mo32953b.f27327a == 2) {
            InterfaceC10312r interfaceC10312r = this.f9557e;
            if (interfaceC10312r.mo30886i(interfaceC10312r.mo30885e(abstractC12340f.f33116d), mo32953b.f27328b)) {
                return true;
            }
        }
        return false;
    }

    @Override // p437x7.InterfaceC12344j
    /* renamed from: h */
    public int mo11913h(long j10, List<? extends AbstractC12348n> list) {
        return (this.f9560h != null || this.f9557e.length() < 2) ? list.size() : this.f9557e.mo30863q(j10, list);
    }

    @Override // p437x7.InterfaceC12344j
    /* renamed from: i */
    public void mo11914i(AbstractC12340f abstractC12340f) {
    }

    @Override // p437x7.InterfaceC12344j
    /* renamed from: j */
    public final void mo11915j(long j10, long j11, List<? extends AbstractC12348n> list, C12342h c12342h) {
        int mo39935g;
        long j12 = j11;
        if (this.f9560h != null) {
            return;
        }
        C7314a.b bVar = this.f9558f.f16425f[this.f9554b];
        if (bVar.f16441k == 0) {
            c12342h.f33123b = !r4.f16423d;
            return;
        }
        if (list.isEmpty()) {
            mo39935g = bVar.m21920d(j12);
        } else {
            mo39935g = (int) (list.get(list.size() - 1).mo39935g() - this.f9559g);
            if (mo39935g < 0) {
                this.f9560h = new C11686b();
                return;
            }
        }
        if (mo39935g >= bVar.f16441k) {
            c12342h.f33123b = !this.f9558f.f16423d;
            return;
        }
        long j13 = j12 - j10;
        long m12263l = m12263l(j10);
        int length = this.f9557e.length();
        InterfaceC12349o[] interfaceC12349oArr = new InterfaceC12349o[length];
        for (int i10 = 0; i10 < length; i10++) {
            interfaceC12349oArr[i10] = new b(bVar, this.f9557e.mo30882b(i10), mo39935g);
        }
        this.f9557e.mo209g(j10, j13, m12263l, list, interfaceC12349oArr);
        long m21921e = bVar.m21921e(mo39935g);
        long m21919c = m21921e + bVar.m21919c(mo39935g);
        if (!list.isEmpty()) {
            j12 = -9223372036854775807L;
        }
        long j14 = j12;
        int i11 = mo39935g + this.f9559g;
        int mo210h = this.f9557e.mo210h();
        c12342h.f33122a = m12262k(this.f9557e.mo30889s(), this.f9556d, bVar.m21917a(this.f9557e.mo30882b(mo210h), mo39935g), i11, m21921e, m21919c, j14, this.f9557e.mo212t(), this.f9557e.mo211m(), this.f9555c[mo210h]);
    }

    @Override // p437x7.InterfaceC12344j
    public void release() {
        for (InterfaceC12341g interfaceC12341g : this.f9555c) {
            interfaceC12341g.release();
        }
    }
}
