package zk;

import gk.Continuation;

/* loaded from: classes3.dex */
public enum m0 {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f32907a;

        static {
            int[] iArr = new int[m0.values().length];
            try {
                iArr[m0.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m0.ATOMIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m0.UNDISPATCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[m0.LAZY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f32907a = iArr;
        }
    }

    public final <R, T> void h(ok.p<? super R, ? super Continuation<? super T>, ? extends Object> pVar, R r10, Continuation<? super T> continuation) {
        int i10 = a.f32907a[ordinal()];
        if (i10 == 1) {
            fl.a.d(pVar, r10, continuation, null, 4, null);
            return;
        }
        if (i10 == 2) {
            gk.e.a(pVar, r10, continuation);
        } else if (i10 == 3) {
            fl.b.a(pVar, r10, continuation);
        } else if (i10 != 4) {
            throw new ck.l();
        }
    }

    public final boolean i() {
        return this == LAZY;
    }
}
