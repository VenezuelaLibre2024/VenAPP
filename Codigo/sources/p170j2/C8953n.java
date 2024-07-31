package p170j2;

import android.content.Context;
import kotlin.jvm.internal.C9322n;
import p128h2.C7612b;
import p230m2.InterfaceC9536b;

/* renamed from: j2.n */
/* loaded from: classes.dex */
public final class C8953n {

    /* renamed from: a */
    private final AbstractC8947h<Boolean> f21292a;

    /* renamed from: b */
    private final C8942c f21293b;

    /* renamed from: c */
    private final AbstractC8947h<C7612b> f21294c;

    /* renamed from: d */
    private final AbstractC8947h<Boolean> f21295d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C8953n(Context context, InterfaceC9536b taskExecutor) {
        this(context, taskExecutor, null, null, null, null, 60, null);
        C9322n.m27781e(context, "context");
        C9322n.m27781e(taskExecutor, "taskExecutor");
    }

    public C8953n(Context context, InterfaceC9536b taskExecutor, AbstractC8947h<Boolean> batteryChargingTracker, C8942c batteryNotLowTracker, AbstractC8947h<C7612b> networkStateTracker, AbstractC8947h<Boolean> storageNotLowTracker) {
        C9322n.m27781e(context, "context");
        C9322n.m27781e(taskExecutor, "taskExecutor");
        C9322n.m27781e(batteryChargingTracker, "batteryChargingTracker");
        C9322n.m27781e(batteryNotLowTracker, "batteryNotLowTracker");
        C9322n.m27781e(networkStateTracker, "networkStateTracker");
        C9322n.m27781e(storageNotLowTracker, "storageNotLowTracker");
        this.f21292a = batteryChargingTracker;
        this.f21293b = batteryNotLowTracker;
        this.f21294c = networkStateTracker;
        this.f21295d = storageNotLowTracker;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C8953n(android.content.Context r8, p230m2.InterfaceC9536b r9, p170j2.AbstractC8947h r10, p170j2.C8942c r11, p170j2.AbstractC8947h r12, p170j2.AbstractC8947h r13, int r14, kotlin.jvm.internal.C9315g r15) {
        /*
            r7 = this;
            r0 = r14 & 4
            java.lang.String r1 = "context.applicationContext"
            if (r0 == 0) goto L14
            j2.a r0 = new j2.a
            android.content.Context r3 = r8.getApplicationContext()
            kotlin.jvm.internal.C9322n.m27780d(r3, r1)
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
            kotlin.jvm.internal.C9322n.m27780d(r4, r1)
            r0.<init>(r4, r9)
            r4 = r0
            goto L28
        L27:
            r4 = r11
        L28:
            r0 = r14 & 16
            if (r0 == 0) goto L39
            android.content.Context r0 = r8.getApplicationContext()
            kotlin.jvm.internal.C9322n.m27780d(r0, r1)
            j2.h r0 = p170j2.C8950k.m26170a(r0, r9)
            r5 = r0
            goto L3a
        L39:
            r5 = r12
        L3a:
            r0 = r14 & 32
            if (r0 == 0) goto L4c
            j2.l r0 = new j2.l
            android.content.Context r6 = r8.getApplicationContext()
            kotlin.jvm.internal.C9322n.m27780d(r6, r1)
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
        throw new UnsupportedOperationException("Method not decompiled: p170j2.C8953n.<init>(android.content.Context, m2.b, j2.h, j2.c, j2.h, j2.h, int, kotlin.jvm.internal.g):void");
    }

    /* renamed from: a */
    public final AbstractC8947h<Boolean> m26176a() {
        return this.f21292a;
    }

    /* renamed from: b */
    public final C8942c m26177b() {
        return this.f21293b;
    }

    /* renamed from: c */
    public final AbstractC8947h<C7612b> m26178c() {
        return this.f21294c;
    }

    /* renamed from: d */
    public final AbstractC8947h<Boolean> m26179d() {
        return this.f21295d;
    }
}
