package p133h7;

import com.google.common.collect.AbstractC5907w;
import java.util.Arrays;
import java.util.List;
import p133h7.AbstractC7662i;
import p216l7.C9400a;
import p361t6.C11108u1;
import p363t8.C11137a;
import p363t8.C11146e0;
import p396v6.C11670t0;
import p459y6.C12615e0;

/* renamed from: h7.h */
/* loaded from: classes.dex */
final class C7661h extends AbstractC7662i {

    /* renamed from: o */
    private static final byte[] f18146o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: p */
    private static final byte[] f18147p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: n */
    private boolean f18148n;

    /* renamed from: n */
    private static boolean m23273n(C11146e0 c11146e0, byte[] bArr) {
        if (c11146e0.m34679a() < bArr.length) {
            return false;
        }
        int m34683f = c11146e0.m34683f();
        byte[] bArr2 = new byte[bArr.length];
        c11146e0.m34688l(bArr2, 0, bArr.length);
        c11146e0.m34677U(m34683f);
        return Arrays.equals(bArr2, bArr);
    }

    /* renamed from: o */
    public static boolean m23274o(C11146e0 c11146e0) {
        return m23273n(c11146e0, f18146o);
    }

    @Override // p133h7.AbstractC7662i
    /* renamed from: f */
    protected long mo23255f(C11146e0 c11146e0) {
        return m23280c(C11670t0.m36687e(c11146e0.m34682e()));
    }

    @Override // p133h7.AbstractC7662i
    /* renamed from: h */
    protected boolean mo23256h(C11146e0 c11146e0, long j10, AbstractC7662i.b bVar) {
        C11108u1.b m34545Z;
        if (m23273n(c11146e0, f18146o)) {
            byte[] copyOf = Arrays.copyOf(c11146e0.m34682e(), c11146e0.m34684g());
            int m36685c = C11670t0.m36685c(copyOf);
            List<byte[]> m36683a = C11670t0.m36683a(copyOf);
            if (bVar.f18162a != null) {
                return true;
            }
            m34545Z = new C11108u1.b().m34552g0("audio/opus").m34529J(m36685c).m34553h0(48000).m34541V(m36683a);
        } else {
            byte[] bArr = f18147p;
            if (!m23273n(c11146e0, bArr)) {
                C11137a.m34607i(bVar.f18162a);
                return false;
            }
            C11137a.m34607i(bVar.f18162a);
            if (this.f18148n) {
                return true;
            }
            this.f18148n = true;
            c11146e0.m34678V(bArr.length);
            C9400a m41544c = C12615e0.m41544c(AbstractC5907w.m15080s(C12615e0.m41551j(c11146e0, false, false).f34266b));
            if (m41544c == null) {
                return true;
            }
            m34545Z = bVar.f18162a.m34488c().m34545Z(m41544c.m27996b(bVar.f18162a.f28795u));
        }
        bVar.f18162a = m34545Z.m34526G();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p133h7.AbstractC7662i
    /* renamed from: l */
    public void mo23257l(boolean z10) {
        super.mo23257l(z10);
        if (z10) {
            this.f18148n = false;
        }
    }
}
