package el;

import zk.c1;
import zk.h2;
import zk.t0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class y extends h2 implements t0 {

    /* renamed from: c, reason: collision with root package name */
    private final Throwable f14824c;

    /* renamed from: d, reason: collision with root package name */
    private final String f14825d;

    public y(Throwable th2, String str) {
        this.f14824c = th2;
        this.f14825d = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        if (r1 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Void R0() {
        /*
            r4 = this;
            java.lang.Throwable r0 = r4.f14824c
            if (r0 == 0) goto L36
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Module with the Main dispatcher had failed to initialize"
            r0.append(r1)
            java.lang.String r1 = r4.f14825d
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
            java.lang.Throwable r2 = r4.f14824c
            r1.<init>(r0, r2)
            throw r1
        L36:
            el.x.d()
            ck.e r0 = new ck.e
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: el.y.R0():java.lang.Void");
    }

    @Override // zk.h0
    public boolean F0(gk.f fVar) {
        R0();
        throw new ck.e();
    }

    @Override // zk.h2
    public h2 I0() {
        return this;
    }

    @Override // zk.h0
    /* renamed from: L0, reason: merged with bridge method [inline-methods] */
    public Void D0(gk.f fVar, Runnable runnable) {
        R0();
        throw new ck.e();
    }

    @Override // zk.t0
    public c1 o(long j10, Runnable runnable, gk.f fVar) {
        R0();
        throw new ck.e();
    }

    @Override // zk.h2, zk.h0
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Dispatchers.Main[missing");
        if (this.f14824c != null) {
            str = ", cause=" + this.f14824c;
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append(']');
        return sb2.toString();
    }
}
