package p039c7;

import p361t6.C11005b3;
import p363t8.C11146e0;
import p459y6.InterfaceC12609b0;

/* renamed from: c7.e */
/* loaded from: classes.dex */
abstract class AbstractC1883e {

    /* renamed from: a */
    protected final InterfaceC12609b0 f7844a;

    /* renamed from: c7.e$a */
    /* loaded from: classes.dex */
    public static final class a extends C11005b3 {
        public a(String str) {
            super(str, null, false, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1883e(InterfaceC12609b0 interfaceC12609b0) {
        this.f7844a = interfaceC12609b0;
    }

    /* renamed from: a */
    public final boolean m10008a(C11146e0 c11146e0, long j10) {
        return mo9985b(c11146e0) && mo9986c(c11146e0, j10);
    }

    /* renamed from: b */
    protected abstract boolean mo9985b(C11146e0 c11146e0);

    /* renamed from: c */
    protected abstract boolean mo9986c(C11146e0 c11146e0, long j10);
}
