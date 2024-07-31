package p206kk;

import kotlin.jvm.internal.C9322n;
import p187jk.C9080a;

/* renamed from: kk.a */
/* loaded from: classes3.dex */
public class C9288a extends C9080a {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kk.a$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        public static final a f22542a = new a();

        /* renamed from: b */
        public static final Integer f22543b;

        /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
        static {
            /*
                kk.a$a r0 = new kk.a$a
                r0.<init>()
                p206kk.C9288a.a.f22542a = r0
                r0 = 0
                java.lang.String r1 = "android.os.Build$VERSION"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L1f
                java.lang.String r2 = "SDK_INT"
                java.lang.reflect.Field r1 = r1.getField(r2)     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L1f
                boolean r2 = r1 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L1f
                if (r2 == 0) goto L1f
                java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L1f
                goto L20
            L1f:
                r1 = r0
            L20:
                if (r1 == 0) goto L2e
                int r2 = r1.intValue()
                if (r2 <= 0) goto L2a
                r2 = 1
                goto L2b
            L2a:
                r2 = 0
            L2b:
                if (r2 == 0) goto L2e
                r0 = r1
            L2e:
                p206kk.C9288a.a.f22543b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p206kk.C9288a.a.<clinit>():void");
        }

        private a() {
        }
    }

    /* renamed from: c */
    private final boolean m27710c(int i10) {
        Integer num = a.f22543b;
        return num == null || num.intValue() >= i10;
    }

    @Override // p187jk.C9080a
    /* renamed from: a */
    public void mo26683a(Throwable cause, Throwable exception) {
        C9322n.m27781e(cause, "cause");
        C9322n.m27781e(exception, "exception");
        if (m27710c(19)) {
            cause.addSuppressed(exception);
        } else {
            super.mo26683a(cause, exception);
        }
    }
}
