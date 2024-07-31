package p494zk;

import ck.C2027l;
import p110fl.C7373a;
import p110fl.C7374b;
import p124gk.C7586e;
import p124gk.Continuation;
import p280ok.InterfaceC10002p;

/* renamed from: zk.m0 */
/* loaded from: classes3.dex */
public enum EnumC13084m0 {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    /* renamed from: zk.m0$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f35458a;

        static {
            int[] iArr = new int[EnumC13084m0.values().length];
            try {
                iArr[EnumC13084m0.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC13084m0.ATOMIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC13084m0.UNDISPATCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC13084m0.LAZY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f35458a = iArr;
        }
    }

    /* renamed from: h */
    public final <R, T> void m43237h(InterfaceC10002p<? super R, ? super Continuation<? super T>, ? extends Object> interfaceC10002p, R r10, Continuation<? super T> continuation) {
        int i10 = a.f35458a[ordinal()];
        if (i10 == 1) {
            C7373a.m22243d(interfaceC10002p, r10, continuation, null, 4, null);
            return;
        }
        if (i10 == 2) {
            C7586e.m23040a(interfaceC10002p, r10, continuation);
        } else if (i10 == 3) {
            C7374b.m22244a(interfaceC10002p, r10, continuation);
        } else if (i10 != 4) {
            throw new C2027l();
        }
    }

    /* renamed from: i */
    public final boolean m43238i() {
        return this == LAZY;
    }
}
