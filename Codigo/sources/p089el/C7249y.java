package p089el;

import ck.C2020e;
import p124gk.InterfaceC7587f;
import p494zk.AbstractC13066h2;
import p494zk.InterfaceC13044c1;
import p494zk.InterfaceC13112t0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: el.y */
/* loaded from: classes3.dex */
public final class C7249y extends AbstractC13066h2 implements InterfaceC13112t0 {

    /* renamed from: c */
    private final Throwable f16247c;

    /* renamed from: d */
    private final String f16248d;

    public C7249y(Throwable th2, String str) {
        this.f16247c = th2;
        this.f16248d = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        if (r1 == null) goto L8;
     */
    /* renamed from: R0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Void m21685R0() {
        /*
            r4 = this;
            java.lang.Throwable r0 = r4.f16247c
            if (r0 == 0) goto L36
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Module with the Main dispatcher had failed to initialize"
            r0.append(r1)
            java.lang.String r1 = r4.f16248d
            if (r1 == 0) goto L25
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ". "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            if (r1 != 0) goto L27
        L25:
            java.lang.String r1 = ""
        L27:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Throwable r2 = r4.f16247c
            r1.<init>(r0, r2)
            throw r1
        L36:
            p089el.C7248x.m21683d()
            ck.e r0 = new ck.e
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p089el.C7249y.m21685R0():java.lang.Void");
    }

    @Override // p494zk.AbstractC13064h0
    /* renamed from: F0 */
    public boolean mo626F0(InterfaceC7587f interfaceC7587f) {
        m21685R0();
        throw new C2020e();
    }

    @Override // p494zk.AbstractC13066h2
    /* renamed from: I0 */
    public AbstractC13066h2 mo627I0() {
        return this;
    }

    @Override // p494zk.AbstractC13064h0
    /* renamed from: L0, reason: merged with bridge method [inline-methods] */
    public Void mo625D0(InterfaceC7587f interfaceC7587f, Runnable runnable) {
        m21685R0();
        throw new C2020e();
    }

    @Override // p494zk.InterfaceC13112t0
    /* renamed from: o */
    public InterfaceC13044c1 mo629o(long j10, Runnable runnable, InterfaceC7587f interfaceC7587f) {
        m21685R0();
        throw new C2020e();
    }

    @Override // p494zk.AbstractC13066h2, p494zk.AbstractC13064h0
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Dispatchers.Main[missing");
        if (this.f16247c != null) {
            str = ", cause=" + this.f16247c;
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append(']');
        return sb2.toString();
    }
}
