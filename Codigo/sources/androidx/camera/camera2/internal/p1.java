package androidx.camera.camera2.internal;

import androidx.camera.core.impl.c0;
import androidx.lifecycle.LiveData;
import w.q;

/* loaded from: classes.dex */
class p1 {

    /* renamed from: a, reason: collision with root package name */
    private final androidx.camera.core.impl.h0 f2149a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.lifecycle.r<w.q> f2150b;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2151a;

        static {
            int[] iArr = new int[c0.a.values().length];
            f2151a = iArr;
            try {
                iArr[c0.a.PENDING_OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2151a[c0.a.OPENING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2151a[c0.a.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2151a[c0.a.CONFIGURED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2151a[c0.a.CLOSING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2151a[c0.a.RELEASING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2151a[c0.a.CLOSED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2151a[c0.a.RELEASED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p1(androidx.camera.core.impl.h0 h0Var) {
        this.f2149a = h0Var;
        androidx.lifecycle.r<w.q> rVar = new androidx.lifecycle.r<>();
        this.f2150b = rVar;
        rVar.postValue(w.q.a(q.b.CLOSED));
    }

    private w.q b() {
        return w.q.a(this.f2149a.c() ? q.b.OPENING : q.b.PENDING_OPEN);
    }

    public LiveData<w.q> a() {
        return this.f2150b;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(androidx.camera.core.impl.c0.a r4, w.q.a r5) {
        /*
            r3 = this;
            int[] r0 = androidx.camera.camera2.internal.p1.a.f2151a
            int r1 = r4.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L32;
                case 2: goto L2b;
                case 3: goto L28;
                case 4: goto L28;
                case 5: goto L25;
                case 6: goto L25;
                case 7: goto L22;
                case 8: goto L22;
                default: goto Lb;
            }
        Lb:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown internal camera state: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5.<init>(r4)
            throw r5
        L22:
            w.q$b r0 = w.q.b.CLOSED
            goto L2d
        L25:
            w.q$b r0 = w.q.b.CLOSING
            goto L2d
        L28:
            w.q$b r0 = w.q.b.OPEN
            goto L2d
        L2b:
            w.q$b r0 = w.q.b.OPENING
        L2d:
            w.q r0 = w.q.b(r0, r5)
            goto L36
        L32:
            w.q r0 = r3.b()
        L36:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "New public camera state "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r2 = " from "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " and "
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = r1.toString()
            java.lang.String r5 = "CameraStateMachine"
            w.o0.a(r5, r4)
            androidx.lifecycle.r<w.q> r4 = r3.f2150b
            java.lang.Object r4 = r4.getValue()
            w.q r4 = (w.q) r4
            boolean r4 = java.util.Objects.equals(r4, r0)
            if (r4 != 0) goto L83
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = "Publishing new public camera state "
            r4.append(r1)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            w.o0.a(r5, r4)
            androidx.lifecycle.r<w.q> r4 = r3.f2150b
            r4.postValue(r0)
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.p1.c(androidx.camera.core.impl.c0$a, w.q$a):void");
    }
}
