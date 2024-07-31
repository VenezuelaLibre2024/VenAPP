package io.flutter.embedding.engine.systemchannels;

import io.flutter.FlutterInjector;
import io.flutter.Log;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.StandardMethodCodec;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class DeferredComponentChannel {
    private static final String TAG = "DeferredComponentChannel";
    private final MethodChannel channel;
    private Map<String, List<MethodChannel.Result>> componentNameToResults;
    private DeferredComponentManager deferredComponentManager;
    final MethodChannel.MethodCallHandler parsingMethodHandler;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.flutter.embedding.engine.systemchannels.DeferredComponentChannel$1 */
    /* loaded from: classes3.dex */
    public class AnonymousClass1 implements MethodChannel.MethodCallHandler {
        AnonymousClass1() {
        }

        @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
        public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
            String str;
            if (DeferredComponentChannel.this.deferredComponentManager == null) {
                return;
            }
            String str2 = methodCall.method;
            Map map = (Map) methodCall.arguments();
            Log.v(DeferredComponentChannel.TAG, "Received '" + str2 + "' message.");
            int intValue = ((Integer) map.get("loadingUnitId")).intValue();
            String str3 = (String) map.get("componentName");
            str2.hashCode();
            char c10 = 65535;
            switch (str2.hashCode()) {
                case -1004447972:
                    if (str2.equals("uninstallDeferredComponent")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 399701758:
                    if (str2.equals("getDeferredComponentInstallState")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 520962947:
                    if (str2.equals("installDeferredComponent")) {
                        c10 = 2;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    DeferredComponentChannel.this.deferredComponentManager.uninstallDeferredComponent(intValue, str3);
                    str = null;
                    break;
                case 1:
                    str = DeferredComponentChannel.this.deferredComponentManager.getDeferredComponentInstallState(intValue, str3);
                    break;
                case 2:
                    DeferredComponentChannel.this.deferredComponentManager.installDeferredComponent(intValue, str3);
                    if (!DeferredComponentChannel.this.componentNameToResults.containsKey(str3)) {
                        DeferredComponentChannel.this.componentNameToResults.put(str3, new ArrayList());
                    }
                    ((List) DeferredComponentChannel.this.componentNameToResults.get(str3)).add(result);
                    return;
                default:
                    result.notImplemented();
                    return;
            }
            result.success(str);
        }
    }

    public DeferredComponentChannel(DartExecutor dartExecutor) {
        AnonymousClass1 anonymousClass1 = new MethodChannel.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.DeferredComponentChannel.1
            AnonymousClass1() {
            }

            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
                String str;
                if (DeferredComponentChannel.this.deferredComponentManager == null) {
                    return;
                }
                String str2 = methodCall.method;
                Map map = (Map) methodCall.arguments();
                Log.v(DeferredComponentChannel.TAG, "Received '" + str2 + "' message.");
                int intValue = ((Integer) map.get("loadingUnitId")).intValue();
                String str3 = (String) map.get("componentName");
                str2.hashCode();
                char c10 = 65535;
                switch (str2.hashCode()) {
                    case -1004447972:
                        if (str2.equals("uninstallDeferredComponent")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case 399701758:
                        if (str2.equals("getDeferredComponentInstallState")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case 520962947:
                        if (str2.equals("installDeferredComponent")) {
                            c10 = 2;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        DeferredComponentChannel.this.deferredComponentManager.uninstallDeferredComponent(intValue, str3);
                        str = null;
                        break;
                    case 1:
                        str = DeferredComponentChannel.this.deferredComponentManager.getDeferredComponentInstallState(intValue, str3);
                        break;
                    case 2:
                        DeferredComponentChannel.this.deferredComponentManager.installDeferredComponent(intValue, str3);
                        if (!DeferredComponentChannel.this.componentNameToResults.containsKey(str3)) {
                            DeferredComponentChannel.this.componentNameToResults.put(str3, new ArrayList());
                        }
                        ((List) DeferredComponentChannel.this.componentNameToResults.get(str3)).add(result);
                        return;
                    default:
                        result.notImplemented();
                        return;
                }
                result.success(str);
            }
        };
        this.parsingMethodHandler = anonymousClass1;
        MethodChannel methodChannel = new MethodChannel(dartExecutor, "flutter/deferredcomponent", StandardMethodCodec.INSTANCE);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(anonymousClass1);
        this.deferredComponentManager = FlutterInjector.instance().deferredComponentManager();
        this.componentNameToResults = new HashMap();
    }

    public void completeInstallError(String str, String str2) {
        if (this.componentNameToResults.containsKey(str)) {
            Iterator<MethodChannel.Result> it = this.componentNameToResults.get(str).iterator();
            while (it.hasNext()) {
                it.next().error("DeferredComponent Install failure", str2, null);
            }
            this.componentNameToResults.get(str).clear();
        }
    }

    public void completeInstallSuccess(String str) {
        if (this.componentNameToResults.containsKey(str)) {
            Iterator<MethodChannel.Result> it = this.componentNameToResults.get(str).iterator();
            while (it.hasNext()) {
                it.next().success(null);
            }
            this.componentNameToResults.get(str).clear();
        }
    }

    public void setDeferredComponentManager(DeferredComponentManager deferredComponentManager) {
        this.deferredComponentManager = deferredComponentManager;
    }
}
