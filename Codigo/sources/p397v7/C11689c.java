package p397v7;

import p099f7.C7310f;
import p363t8.C11137a;
import p459y6.C12635y;
import p459y6.InterfaceC12621k;
import p459y6.InterfaceC12622l;
import p459y6.InterfaceC12626p;

/* renamed from: v7.c */
/* loaded from: classes.dex */
public final class C11689c implements InterfaceC11712k0 {

    /* renamed from: a */
    private final InterfaceC12626p f30633a;

    /* renamed from: b */
    private InterfaceC12621k f30634b;

    /* renamed from: c */
    private InterfaceC12622l f30635c;

    public C11689c(InterfaceC12626p interfaceC12626p) {
        this.f30633a = interfaceC12626p;
    }

    @Override // p397v7.InterfaceC11712k0
    /* renamed from: a */
    public void mo36830a(long j10, long j11) {
        ((InterfaceC12621k) C11137a.m34603e(this.f30634b)).mo121a(j10, j11);
    }

    @Override // p397v7.InterfaceC11712k0
    /* renamed from: b */
    public void mo36831b() {
        InterfaceC12621k interfaceC12621k = this.f30634b;
        if (interfaceC12621k instanceof C7310f) {
            ((C7310f) interfaceC12621k).m21912j();
        }
    }

    @Override // p397v7.InterfaceC11712k0
    /* renamed from: c */
    public int mo36832c(C12635y c12635y) {
        return ((InterfaceC12621k) C11137a.m34603e(this.f30634b)).mo124f((InterfaceC12622l) C11137a.m34603e(this.f30635c), c12635y);
    }

    @Override // p397v7.InterfaceC11712k0
    /* renamed from: d */
    public long mo36833d() {
        InterfaceC12622l interfaceC12622l = this.f30635c;
        if (interfaceC12622l != null) {
            return interfaceC12622l.getPosition();
        }
        return -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x003f, code lost:
    
        if (r6.getPosition() != r11) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0061, code lost:
    
        if (r6.getPosition() != r11) goto L33;
     */
    @Override // p397v7.InterfaceC11712k0
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo36834e(p351s8.InterfaceC10823h r8, android.net.Uri r9, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r10, long r11, long r13, p459y6.InterfaceC12623m r15) {
        /*
            r7 = this;
            y6.e r6 = new y6.e
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.f30635c = r6
            y6.k r8 = r7.f30634b
            if (r8 == 0) goto L10
            return
        L10:
            y6.p r8 = r7.f30633a
            y6.k[] r8 = r8.mo41561b(r9, r10)
            int r10 = r8.length
            r13 = 0
            r14 = 1
            if (r10 != r14) goto L20
            r8 = r8[r13]
            r7.f30634b = r8
            goto L74
        L20:
            int r10 = r8.length
            r0 = r13
        L22:
            if (r0 >= r10) goto L70
            r1 = r8[r0]
            boolean r2 = r1.mo123e(r6)     // Catch: java.lang.Throwable -> L42 java.io.EOFException -> L57
            if (r2 == 0) goto L35
            r7.f30634b = r1     // Catch: java.lang.Throwable -> L42 java.io.EOFException -> L57
            p363t8.C11137a.m34605g(r14)
            r6.mo41534f()
            goto L70
        L35:
            y6.k r1 = r7.f30634b
            if (r1 != 0) goto L66
            long r1 = r6.getPosition()
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 != 0) goto L64
            goto L66
        L42:
            r8 = move-exception
            y6.k r9 = r7.f30634b
            if (r9 != 0) goto L4f
            long r9 = r6.getPosition()
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L50
        L4f:
            r13 = r14
        L50:
            p363t8.C11137a.m34605g(r13)
            r6.mo41534f()
            throw r8
        L57:
            y6.k r1 = r7.f30634b
            if (r1 != 0) goto L66
            long r1 = r6.getPosition()
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 != 0) goto L64
            goto L66
        L64:
            r1 = r13
            goto L67
        L66:
            r1 = r14
        L67:
            p363t8.C11137a.m34605g(r1)
            r6.mo41534f()
            int r0 = r0 + 1
            goto L22
        L70:
            y6.k r10 = r7.f30634b
            if (r10 == 0) goto L7a
        L74:
            y6.k r8 = r7.f30634b
            r8.mo122b(r15)
            return
        L7a:
            v7.g1 r10 = new v7.g1
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "None of the available extractors ("
            r11.append(r12)
            java.lang.String r8 = p363t8.C11172r0.m34880M(r8)
            r11.append(r8)
            java.lang.String r8 = ") could read the stream."
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            java.lang.Object r9 = p363t8.C11137a.m34603e(r9)
            android.net.Uri r9 = (android.net.Uri) r9
            r10.<init>(r8, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p397v7.C11689c.mo36834e(s8.h, android.net.Uri, java.util.Map, long, long, y6.m):void");
    }

    @Override // p397v7.InterfaceC11712k0
    public void release() {
        InterfaceC12621k interfaceC12621k = this.f30634b;
        if (interfaceC12621k != null) {
            interfaceC12621k.release();
            this.f30634b = null;
        }
        this.f30635c = null;
    }
}
