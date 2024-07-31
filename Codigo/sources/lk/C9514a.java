package lk;

import p206kk.C9288a;
import sk.AbstractC10933c;
import tk.C11290a;

/* renamed from: lk.a */
/* loaded from: classes3.dex */
public class C9514a extends C9288a {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lk.a$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        public static final a f23130a = new a();

        /* renamed from: b */
        public static final Integer f23131b;

        /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
        static {
            /*
                lk.a$a r0 = new lk.a$a
                r0.<init>()
                lk.C9514a.a.f23130a = r0
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
                lk.C9514a.a.f23131b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: lk.C9514a.a.<clinit>():void");
        }

        private a() {
        }
    }

    /* renamed from: c */
    private final boolean m28326c(int i10) {
        Integer num = a.f23131b;
        return num == null || num.intValue() >= i10;
    }

    @Override // p187jk.C9080a
    /* renamed from: b */
    public AbstractC10933c mo26684b() {
        return m28326c(34) ? new C11290a() : super.mo26684b();
    }
}
