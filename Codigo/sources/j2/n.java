package j2;

import android.content.Context;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a */
    private final h<Boolean> f19541a;

    /* renamed from: b */
    private final c f19542b;

    /* renamed from: c */
    private final h<h2.b> f19543c;

    /* renamed from: d */
    private final h<Boolean> f19544d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(Context context, m2.b taskExecutor) {
        this(context, taskExecutor, null, null, null, null, 60, null);
        kotlin.jvm.internal.n.e(context, "context");
        kotlin.jvm.internal.n.e(taskExecutor, "taskExecutor");
    }

    public n(Context context, m2.b taskExecutor, h<Boolean> batteryChargingTracker, c batteryNotLowTracker, h<h2.b> networkStateTracker, h<Boolean> storageNotLowTracker) {
        kotlin.jvm.internal.n.e(context, "context");
        kotlin.jvm.internal.n.e(taskExecutor, "taskExecutor");
        kotlin.jvm.internal.n.e(batteryChargingTracker, "batteryChargingTracker");
        kotlin.jvm.internal.n.e(batteryNotLowTracker, "batteryNotLowTracker");
        kotlin.jvm.internal.n.e(networkStateTracker, "networkStateTracker");
        kotlin.jvm.internal.n.e(storageNotLowTracker, "storageNotLowTracker");
        this.f19541a = batteryChargingTracker;
        this.f19542b = batteryNotLowTracker;
        this.f19543c = networkStateTracker;
        this.f19544d = storageNotLowTracker;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ n(android.content.Context r8, m2.b r9, j2.h r10, j2.c r11, j2.h r12, j2.h r13, int r14, kotlin.jvm.internal.g r15) {
        /*
            r7 = this;
            r0 = r14 & 4
            java.lang.String r1 = "context.applicationContext"
            if (r0 == 0) goto L14
            j2.a r0 = new j2.a
            android.content.Context r3 = r8.getApplicationContext()
            kotlin.jvm.internal.n.d(r3, r1)
            r0.<init>(r3, r9)
            r3 = r0
            goto L15
        L14:
            r3 = r10
        L15:
            r0 = r14 & 8
            if (r0 == 0) goto L27
            j2.c r0 = new j2.c
            android.content.Context r4 = r8.getApplicationContext()
            kotlin.jvm.internal.n.d(r4, r1)
            r0.<init>(r4, r9)
            r4 = r0
            goto L28
        L27:
            r4 = r11
        L28:
            r0 = r14 & 16
            if (r0 == 0) goto L39
            android.content.Context r0 = r8.getApplicationContext()
            kotlin.jvm.internal.n.d(r0, r1)
            j2.h r0 = j2.k.a(r0, r9)
            r5 = r0
            goto L3a
        L39:
            r5 = r12
        L3a:
            r0 = r14 & 32
            if (r0 == 0) goto L4c
            j2.l r0 = new j2.l
            android.content.Context r6 = r8.getApplicationContext()
            kotlin.jvm.internal.n.d(r6, r1)
            r0.<init>(r6, r9)
            r6 = r0
            goto L4d
        L4c:
            r6 = r13
        L4d:
            r0 = r7
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.n.<init>(android.content.Context, m2.b, j2.h, j2.c, j2.h, j2.h, int, kotlin.jvm.internal.g):void");
    }

    public final h<Boolean> a() {
        return this.f19541a;
    }

    public final c b() {
        return this.f19542b;
    }

    public final h<h2.b> c() {
        return this.f19543c;
    }

    public final h<Boolean> d() {
        return this.f19544d;
    }
}
