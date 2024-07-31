package com.pichillilorenzo.flutter_inappwebview_android.print_job;

import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.PrintJobInfoExt;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.Map;

/* loaded from: classes3.dex */
public class PrintJobChannelDelegate extends ChannelDelegateImpl {
    private PrintJobController printJobController;

    public PrintJobChannelDelegate(PrintJobController printJobController, MethodChannel methodChannel) {
        super(methodChannel);
        this.printJobController = printJobController;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.printJobController = null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x0039. Please report as an issue. */
    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        PrintJobInfoExt info;
        Boolean bool;
        String str = methodCall.method;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1367724422:
                if (str.equals("cancel")) {
                    c10 = 0;
                    break;
                }
                break;
            case -75444956:
                if (str.equals("getInfo")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1097506319:
                if (str.equals("restart")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1671767583:
                if (str.equals("dispose")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                PrintJobController printJobController = this.printJobController;
                if (printJobController != null) {
                    printJobController.cancel();
                    bool = Boolean.TRUE;
                    result.success(bool);
                    return;
                }
                bool = Boolean.FALSE;
                result.success(bool);
                return;
            case 1:
                PrintJobController printJobController2 = this.printJobController;
                Map<String, Object> map = null;
                if (printJobController2 != null && (info = printJobController2.getInfo()) != null) {
                    map = info.toMap();
                }
                result.success(map);
                return;
            case 2:
                PrintJobController printJobController3 = this.printJobController;
                if (printJobController3 != null) {
                    printJobController3.restart();
                    bool = Boolean.TRUE;
                    result.success(bool);
                    return;
                }
                bool = Boolean.FALSE;
                result.success(bool);
                return;
            case 3:
                PrintJobController printJobController4 = this.printJobController;
                if (printJobController4 != null) {
                    printJobController4.dispose();
                    bool = Boolean.TRUE;
                    result.success(bool);
                    return;
                }
                bool = Boolean.FALSE;
                result.success(bool);
                return;
            default:
                result.notImplemented();
                return;
        }
    }
}
