package com.pichillilorenzo.flutter_inappwebview_android.tracing;

import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import e2.l;
import e2.t;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public class TracingControllerChannelDelegate extends ChannelDelegateImpl {
    private TracingControllerManager tracingControllerManager;

    public TracingControllerChannelDelegate(TracingControllerManager tracingControllerManager, MethodChannel methodChannel) {
        super(methodChannel);
        this.tracingControllerManager = tracingControllerManager;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.tracingControllerManager = null;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        Boolean valueOf;
        FileOutputStream fileOutputStream;
        TracingControllerManager.init();
        l lVar = TracingControllerManager.tracingController;
        String str = methodCall.method;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1647175624:
                if (str.equals("isTracing")) {
                    c10 = 0;
                    break;
                }
                break;
            case 3540994:
                if (str.equals("stop")) {
                    c10 = 1;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                if (lVar != null) {
                    valueOf = Boolean.valueOf(lVar.b());
                    result.success(valueOf);
                }
                break;
            case 1:
                if (lVar != null && t.a("TRACING_CONTROLLER_BASIC_USAGE")) {
                    String str2 = (String) methodCall.argument("filePath");
                    if (str2 != null) {
                        try {
                            fileOutputStream = new FileOutputStream(str2);
                        } catch (FileNotFoundException e10) {
                            e10.printStackTrace();
                            break;
                        }
                    } else {
                        fileOutputStream = null;
                    }
                    result.success(Boolean.valueOf(lVar.d(fileOutputStream, Executors.newSingleThreadExecutor())));
                    return;
                }
                break;
            case 2:
                if (lVar != null && t.a("TRACING_CONTROLLER_BASIC_USAGE")) {
                    Map<String, Object> map = (Map) methodCall.argument("settings");
                    TracingSettings tracingSettings = new TracingSettings();
                    tracingSettings.parse2(map);
                    lVar.c(TracingControllerManager.buildTracingConfig(tracingSettings));
                    valueOf = Boolean.TRUE;
                    result.success(valueOf);
                }
                break;
            default:
                result.notImplemented();
                return;
        }
        valueOf = Boolean.FALSE;
        result.success(valueOf);
    }
}
