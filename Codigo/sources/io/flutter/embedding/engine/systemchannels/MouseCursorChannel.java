package io.flutter.embedding.engine.systemchannels;

import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.StandardMethodCodec;

/* loaded from: classes3.dex */
public class MouseCursorChannel {
    private static final String TAG = "MouseCursorChannel";
    public final MethodChannel channel;
    private MouseCursorMethodHandler mouseCursorMethodHandler;
    private final MethodChannel.MethodCallHandler parsingMethodCallHandler;

    /* loaded from: classes3.dex */
    public interface MouseCursorMethodHandler {
        void activateSystemCursor(String str);
    }

    public MouseCursorChannel(DartExecutor dartExecutor) {
        MethodChannel.MethodCallHandler methodCallHandler = new MethodChannel.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.MouseCursorChannel.1
            /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0041 A[Catch: Exception -> 0x0076, TRY_LEAVE, TryCatch #1 {Exception -> 0x0076, blocks: (B:7:0x0029, B:14:0x0041, B:17:0x0056, B:21:0x005d, B:23:0x0033, B:16:0x004d), top: B:6:0x0029, inners: #0 }] */
            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void onMethodCall(io.flutter.plugin.common.MethodCall r6, io.flutter.plugin.common.MethodChannel.Result r7) {
                /*
                    r5 = this;
                    java.lang.String r0 = "error"
                    io.flutter.embedding.engine.systemchannels.MouseCursorChannel r1 = io.flutter.embedding.engine.systemchannels.MouseCursorChannel.this
                    io.flutter.embedding.engine.systemchannels.MouseCursorChannel$MouseCursorMethodHandler r1 = io.flutter.embedding.engine.systemchannels.MouseCursorChannel.access$000(r1)
                    if (r1 != 0) goto Lb
                    return
                Lb:
                    java.lang.String r1 = r6.method
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r3 = "Received '"
                    r2.append(r3)
                    r2.append(r1)
                    java.lang.String r3 = "' message."
                    r2.append(r3)
                    java.lang.String r2 = r2.toString()
                    java.lang.String r3 = "MouseCursorChannel"
                    io.flutter.Log.v(r3, r2)
                    r2 = 0
                    int r3 = r1.hashCode()     // Catch: java.lang.Exception -> L76
                    r4 = -1307105544(0xffffffffb21726f8, float:-8.798217E-9)
                    if (r3 == r4) goto L33
                    goto L3d
                L33:
                    java.lang.String r3 = "activateSystemCursor"
                    boolean r1 = r1.equals(r3)     // Catch: java.lang.Exception -> L76
                    if (r1 == 0) goto L3d
                    r1 = 0
                    goto L3e
                L3d:
                    r1 = -1
                L3e:
                    if (r1 == 0) goto L41
                    goto L8f
                L41:
                    java.lang.Object r6 = r6.arguments     // Catch: java.lang.Exception -> L76
                    java.util.HashMap r6 = (java.util.HashMap) r6     // Catch: java.lang.Exception -> L76
                    java.lang.String r1 = "kind"
                    java.lang.Object r6 = r6.get(r1)     // Catch: java.lang.Exception -> L76
                    java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L76
                    io.flutter.embedding.engine.systemchannels.MouseCursorChannel r1 = io.flutter.embedding.engine.systemchannels.MouseCursorChannel.this     // Catch: java.lang.Exception -> L5c
                    io.flutter.embedding.engine.systemchannels.MouseCursorChannel$MouseCursorMethodHandler r1 = io.flutter.embedding.engine.systemchannels.MouseCursorChannel.access$000(r1)     // Catch: java.lang.Exception -> L5c
                    r1.activateSystemCursor(r6)     // Catch: java.lang.Exception -> L5c
                    java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L76
                    r7.success(r6)     // Catch: java.lang.Exception -> L76
                    goto L8f
                L5c:
                    r6 = move-exception
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L76
                    r1.<init>()     // Catch: java.lang.Exception -> L76
                    java.lang.String r3 = "Error when setting cursors: "
                    r1.append(r3)     // Catch: java.lang.Exception -> L76
                    java.lang.String r6 = r6.getMessage()     // Catch: java.lang.Exception -> L76
                    r1.append(r6)     // Catch: java.lang.Exception -> L76
                    java.lang.String r6 = r1.toString()     // Catch: java.lang.Exception -> L76
                    r7.error(r0, r6, r2)     // Catch: java.lang.Exception -> L76
                    goto L8f
                L76:
                    r6 = move-exception
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r3 = "Unhandled error: "
                    r1.append(r3)
                    java.lang.String r6 = r6.getMessage()
                    r1.append(r6)
                    java.lang.String r6 = r1.toString()
                    r7.error(r0, r6, r2)
                L8f:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.engine.systemchannels.MouseCursorChannel.AnonymousClass1.onMethodCall(io.flutter.plugin.common.MethodCall, io.flutter.plugin.common.MethodChannel$Result):void");
            }
        };
        this.parsingMethodCallHandler = methodCallHandler;
        MethodChannel methodChannel = new MethodChannel(dartExecutor, "flutter/mousecursor", StandardMethodCodec.INSTANCE);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(methodCallHandler);
    }

    public void setMethodHandler(MouseCursorMethodHandler mouseCursorMethodHandler) {
        this.mouseCursorMethodHandler = mouseCursorMethodHandler;
    }

    public void synthesizeMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        this.parsingMethodCallHandler.onMethodCall(methodCall, result);
    }
}
