package be;

import java.util.concurrent.Executor;
import zd.q2;

/* loaded from: classes.dex */
public class v0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] c(byte[] bArr) {
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(f6.f fVar, byte[] bArr) {
        fVar.b(f6.c.d(bArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static q2 e(zb.g gVar, f6.g gVar2, cc.a aVar, fe.f fVar, ce.a aVar2, zd.s sVar, @dc.b Executor executor) {
        final f6.f a10 = gVar2.a("FIREBASE_INAPPMESSAGING", byte[].class, new f6.e() { // from class: be.t0
            @Override // f6.e
            public final Object apply(Object obj) {
                byte[] c10;
                c10 = v0.c((byte[]) obj);
                return c10;
            }
        });
        return new q2(new q2.b() { // from class: be.u0
            @Override // zd.q2.b
            public final void a(byte[] bArr) {
                v0.d(f6.f.this, bArr);
            }
        }, aVar, gVar, fVar, aVar2, sVar, executor);
    }
}
