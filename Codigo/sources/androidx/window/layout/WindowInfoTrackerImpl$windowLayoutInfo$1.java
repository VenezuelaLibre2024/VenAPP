package androidx.window.layout;

import android.app.Activity;
import ck.v;
import gk.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.n;
import ok.p;

@f(c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1", f = "WindowInfoTrackerImpl.kt", l = {54, 55}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class WindowInfoTrackerImpl$windowLayoutInfo$1 extends l implements p<cl.c<? super WindowLayoutInfo>, Continuation<? super v>, Object> {
    final /* synthetic */ Activity $activity;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ WindowInfoTrackerImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInfoTrackerImpl$windowLayoutInfo$1(WindowInfoTrackerImpl windowInfoTrackerImpl, Activity activity, Continuation<? super WindowInfoTrackerImpl$windowLayoutInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = windowInfoTrackerImpl;
        this.$activity = activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invokeSuspend$lambda-0, reason: not valid java name */
    public static final void m7invokeSuspend$lambda0(bl.d dVar, WindowLayoutInfo info) {
        n.d(info, "info");
        dVar.a(info);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<v> create(Object obj, Continuation<?> continuation) {
        WindowInfoTrackerImpl$windowLayoutInfo$1 windowInfoTrackerImpl$windowLayoutInfo$1 = new WindowInfoTrackerImpl$windowLayoutInfo$1(this.this$0, this.$activity, continuation);
        windowInfoTrackerImpl$windowLayoutInfo$1.L$0 = obj;
        return windowInfoTrackerImpl$windowLayoutInfo$1;
    }

    @Override // ok.p
    public final Object invoke(cl.c<? super WindowLayoutInfo> cVar, Continuation<? super v> continuation) {
        return ((WindowInfoTrackerImpl$windowLayoutInfo$1) create(cVar, continuation)).invokeSuspend(v.f7137a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e A[Catch: all -> 0x00a1, TRY_LEAVE, TryCatch #0 {all -> 0x00a1, blocks: (B:11:0x0064, B:16:0x0076, B:18:0x007e), top: B:10:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0095  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0093 -> B:10:0x0064). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = hk.b.c()
            int r1 = r9.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L39
            if (r1 == r3) goto L27
            if (r1 != r2) goto L1f
            java.lang.Object r1 = r9.L$2
            bl.e r1 = (bl.e) r1
            java.lang.Object r4 = r9.L$1
            androidx.core.util.a r4 = (androidx.core.util.a) r4
            java.lang.Object r5 = r9.L$0
            cl.c r5 = (cl.c) r5
            ck.o.b(r10)     // Catch: java.lang.Throwable -> La3
            r10 = r5
            goto L63
        L1f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L27:
            java.lang.Object r1 = r9.L$2
            bl.e r1 = (bl.e) r1
            java.lang.Object r4 = r9.L$1
            androidx.core.util.a r4 = (androidx.core.util.a) r4
            java.lang.Object r5 = r9.L$0
            cl.c r5 = (cl.c) r5
            ck.o.b(r10)     // Catch: java.lang.Throwable -> La3
            r6 = r5
            r5 = r9
            goto L76
        L39:
            ck.o.b(r10)
            java.lang.Object r10 = r9.L$0
            cl.c r10 = (cl.c) r10
            bl.a r1 = bl.a.DROP_OLDEST
            r4 = 4
            r5 = 10
            r6 = 0
            bl.d r1 = bl.f.b(r5, r1, r6, r4, r6)
            androidx.window.layout.d r4 = new androidx.window.layout.d
            r4.<init>()
            androidx.window.layout.WindowInfoTrackerImpl r5 = r9.this$0
            androidx.window.layout.WindowBackend r5 = androidx.window.layout.WindowInfoTrackerImpl.access$getWindowBackend$p(r5)
            android.app.Activity r6 = r9.$activity
            p1.b r7 = new p1.b
            r7.<init>()
            r5.registerLayoutChangeCallback(r6, r7, r4)
            bl.e r1 = r1.iterator()     // Catch: java.lang.Throwable -> La3
        L63:
            r5 = r9
        L64:
            r5.L$0 = r10     // Catch: java.lang.Throwable -> La1
            r5.L$1 = r4     // Catch: java.lang.Throwable -> La1
            r5.L$2 = r1     // Catch: java.lang.Throwable -> La1
            r5.label = r3     // Catch: java.lang.Throwable -> La1
            java.lang.Object r6 = r1.a(r5)     // Catch: java.lang.Throwable -> La1
            if (r6 != r0) goto L73
            return r0
        L73:
            r8 = r6
            r6 = r10
            r10 = r8
        L76:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> La1
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> La1
            if (r10 == 0) goto L95
            java.lang.Object r10 = r1.next()     // Catch: java.lang.Throwable -> La1
            androidx.window.layout.WindowLayoutInfo r10 = (androidx.window.layout.WindowLayoutInfo) r10     // Catch: java.lang.Throwable -> La1
            r5.L$0 = r6     // Catch: java.lang.Throwable -> La1
            r5.L$1 = r4     // Catch: java.lang.Throwable -> La1
            r5.L$2 = r1     // Catch: java.lang.Throwable -> La1
            r5.label = r2     // Catch: java.lang.Throwable -> La1
            java.lang.Object r10 = r6.emit(r10, r5)     // Catch: java.lang.Throwable -> La1
            if (r10 != r0) goto L93
            return r0
        L93:
            r10 = r6
            goto L64
        L95:
            androidx.window.layout.WindowInfoTrackerImpl r10 = r5.this$0
            androidx.window.layout.WindowBackend r10 = androidx.window.layout.WindowInfoTrackerImpl.access$getWindowBackend$p(r10)
            r10.unregisterLayoutChangeCallback(r4)
            ck.v r10 = ck.v.f7137a
            return r10
        La1:
            r10 = move-exception
            goto La5
        La3:
            r10 = move-exception
            r5 = r9
        La5:
            androidx.window.layout.WindowInfoTrackerImpl r0 = r5.this$0
            androidx.window.layout.WindowBackend r0 = androidx.window.layout.WindowInfoTrackerImpl.access$getWindowBackend$p(r0)
            r0.unregisterLayoutChangeCallback(r4)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
