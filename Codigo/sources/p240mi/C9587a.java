package p240mi;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.Map;
import kotlin.jvm.internal.C9322n;

/* renamed from: mi.a */
/* loaded from: classes3.dex */
public final class C9587a implements MethodChannel.MethodCallHandler {

    /* renamed from: a */
    private final C9588b f23371a;

    /* renamed from: b */
    private final C9590d f23372b;

    public C9587a(C9588b share, C9590d manager) {
        C9322n.m27781e(share, "share");
        C9322n.m27781e(manager, "manager");
        this.f23371a = share;
        this.f23372b = manager;
    }

    /* renamed from: a */
    private final void m28561a(MethodCall methodCall) {
        if (!(methodCall.arguments instanceof Map)) {
            throw new IllegalArgumentException("Map arguments expected".toString());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x004d, code lost:
    
        m28561a(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0050, code lost:
    
        if (r2 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0058, code lost:
    
        if (r12.f23372b.m28584d(r14) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
    
        r1 = r12.f23371a;
        r3 = r13.argument("text");
        kotlin.jvm.internal.C9322n.m27779c(r3, "null cannot be cast to non-null type kotlin.String");
        r1.m28576n((java.lang.String) r3, (java.lang.String) r13.argument("subject"), r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0071, code lost:
    
        if (r2 != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0073, code lost:
    
        if (r0 == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0075, code lost:
    
        r14.success("dev.fluttercommunity.plus/share/unavailable");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0079, code lost:
    
        r14.success(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003f, code lost:
    
        if (r1.equals("shareFilesWithResult") == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0086, code lost:
    
        m28561a(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0089, code lost:
    
        if (r2 == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0091, code lost:
    
        if (r12.f23372b.m28584d(r14) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0093, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0094, code lost:
    
        r1 = r12.f23371a;
        r3 = r13.argument("paths");
        kotlin.jvm.internal.C9322n.m27778b(r3);
        r1.m28577o((java.util.List) r3, (java.util.List) r13.argument("mimeTypes"), (java.lang.String) r13.argument("text"), (java.lang.String) r13.argument("subject"), r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bd, code lost:
    
        if (r2 != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bf, code lost:
    
        if (r0 == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c1, code lost:
    
        r14.success("dev.fluttercommunity.plus/share/unavailable");
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c5, code lost:
    
        r14.success(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c9, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ca, code lost:
    
        r14.error("Share failed", r13.getMessage(), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0049, code lost:
    
        if (r1.equals("shareWithResult") == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0083, code lost:
    
        if (r1.equals("shareFiles") == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
    
        if (r1.equals("share") != false) goto L19;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x002b. Please report as an issue. */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00ca -> B:35:0x00d7). Please report as a decompilation issue!!! */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMethodCall(io.flutter.plugin.common.MethodCall r13, io.flutter.plugin.common.MethodChannel.Result r14) {
        /*
            r12 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.C9322n.m27781e(r13, r0)
            java.lang.String r0 = "result"
            kotlin.jvm.internal.C9322n.m27781e(r14, r0)
            java.lang.String r0 = r13.method
            java.lang.String r1 = "method"
            kotlin.jvm.internal.C9322n.m27780d(r0, r1)
            java.lang.String r1 = "WithResult"
            r2 = 0
            r3 = 2
            r4 = 0
            boolean r0 = p450xk.C12515g.m41004q(r0, r1, r2, r3, r4)
            if (r0 == 0) goto L1d
            r2 = 1
        L1d:
            java.lang.String r1 = r13.method
            if (r1 == 0) goto Ld4
            int r3 = r1.hashCode()
            java.lang.String r11 = "dev.fluttercommunity.plus/share/unavailable"
            java.lang.String r5 = "subject"
            java.lang.String r6 = "text"
            switch(r3) {
                case -1811378728: goto L7d;
                case -1594861118: goto L43;
                case -1212337029: goto L39;
                case 109400031: goto L30;
                default: goto L2e;
            }
        L2e:
            goto Ld4
        L30:
            java.lang.String r3 = "share"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Ld4
            goto L4d
        L39:
            java.lang.String r3 = "shareFilesWithResult"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L86
            goto Ld4
        L43:
            java.lang.String r3 = "shareWithResult"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L4d
            goto Ld4
        L4d:
            r12.m28561a(r13)
            if (r2 == 0) goto L5b
            mi.d r1 = r12.f23372b
            boolean r1 = r1.m28584d(r14)
            if (r1 != 0) goto L5b
            return
        L5b:
            mi.b r1 = r12.f23371a
            java.lang.Object r3 = r13.argument(r6)
            java.lang.String r6 = "null cannot be cast to non-null type kotlin.String"
            kotlin.jvm.internal.C9322n.m27779c(r3, r6)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r13 = r13.argument(r5)
            java.lang.String r13 = (java.lang.String) r13
            r1.m28576n(r3, r13, r2)
            if (r2 != 0) goto Ld7
            if (r0 == 0) goto L79
            r14.success(r11)
            goto Ld7
        L79:
            r14.success(r4)
            goto Ld7
        L7d:
            java.lang.String r3 = "shareFiles"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L86
            goto Ld4
        L86:
            r12.m28561a(r13)
            if (r2 == 0) goto L94
            mi.d r1 = r12.f23372b
            boolean r1 = r1.m28584d(r14)
            if (r1 != 0) goto L94
            return
        L94:
            mi.b r1 = r12.f23371a     // Catch: java.io.IOException -> Lc9
            java.lang.String r3 = "paths"
            java.lang.Object r3 = r13.argument(r3)     // Catch: java.io.IOException -> Lc9
            kotlin.jvm.internal.C9322n.m27778b(r3)     // Catch: java.io.IOException -> Lc9
            java.util.List r3 = (java.util.List) r3     // Catch: java.io.IOException -> Lc9
            java.lang.String r7 = "mimeTypes"
            java.lang.Object r7 = r13.argument(r7)     // Catch: java.io.IOException -> Lc9
            java.util.List r7 = (java.util.List) r7     // Catch: java.io.IOException -> Lc9
            java.lang.Object r6 = r13.argument(r6)     // Catch: java.io.IOException -> Lc9
            r8 = r6
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.io.IOException -> Lc9
            java.lang.Object r13 = r13.argument(r5)     // Catch: java.io.IOException -> Lc9
            r9 = r13
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.io.IOException -> Lc9
            r5 = r1
            r6 = r3
            r10 = r2
            r5.m28577o(r6, r7, r8, r9, r10)     // Catch: java.io.IOException -> Lc9
            if (r2 != 0) goto Ld7
            if (r0 == 0) goto Lc5
            r14.success(r11)     // Catch: java.io.IOException -> Lc9
            goto Ld7
        Lc5:
            r14.success(r4)     // Catch: java.io.IOException -> Lc9
            goto Ld7
        Lc9:
            r13 = move-exception
            java.lang.String r0 = "Share failed"
            java.lang.String r13 = r13.getMessage()
            r14.error(r0, r13, r4)
            goto Ld7
        Ld4:
            r14.notImplemented()
        Ld7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p240mi.C9587a.onMethodCall(io.flutter.plugin.common.MethodCall, io.flutter.plugin.common.MethodChannel$Result):void");
    }
}
