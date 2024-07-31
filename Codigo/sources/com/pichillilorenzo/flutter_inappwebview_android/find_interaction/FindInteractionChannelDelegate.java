package com.pichillilorenzo.flutter_inappwebview_android.find_interaction;

import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.FindSession;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class FindInteractionChannelDelegate extends ChannelDelegateImpl {
    private FindInteractionController findInteractionController;

    public FindInteractionChannelDelegate(FindInteractionController findInteractionController, MethodChannel methodChannel) {
        super(methodChannel);
        this.findInteractionController = findInteractionController;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.findInteractionController = null;
    }

    public void onFindResultReceived(int i10, int i11, boolean z10) {
        FindInteractionController findInteractionController;
        MethodChannel channel = getChannel();
        if (channel == null) {
            return;
        }
        if (z10 && (findInteractionController = this.findInteractionController) != null && findInteractionController.webView != null) {
            findInteractionController.activeFindSession = new FindSession(i11, i10);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("activeMatchOrdinal", Integer.valueOf(i10));
        hashMap.put("numberOfMatches", Integer.valueOf(i11));
        hashMap.put("isDoneCounting", Boolean.valueOf(z10));
        channel.invokeMethod("onFindResultReceived", hashMap);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x004f. Please report as an issue. */
    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        Object obj;
        FindSession findSession;
        String str = methodCall.method;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1008221461:
                if (str.equals("getSearchText")) {
                    c10 = 0;
                    break;
                }
                break;
            case -853211864:
                if (str.equals("findAll")) {
                    c10 = 1;
                    break;
                }
                break;
            case -679382964:
                if (str.equals("findNext")) {
                    c10 = 2;
                    break;
                }
                break;
            case -234090249:
                if (str.equals("setSearchText")) {
                    c10 = 3;
                    break;
                }
                break;
            case 817048102:
                if (str.equals("clearMatches")) {
                    c10 = 4;
                    break;
                }
                break;
            case 2137531137:
                if (str.equals("getActiveFindSession")) {
                    c10 = 5;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                FindInteractionController findInteractionController = this.findInteractionController;
                if (findInteractionController != null) {
                    obj = findInteractionController.searchText;
                    result.success(obj);
                    return;
                }
                obj = Boolean.FALSE;
                result.success(obj);
                return;
            case 1:
                if (this.findInteractionController != null) {
                    this.findInteractionController.findAll((String) methodCall.argument("find"));
                }
                obj = Boolean.TRUE;
                result.success(obj);
                return;
            case 2:
                if (this.findInteractionController != null) {
                    this.findInteractionController.findNext(((Boolean) methodCall.argument("forward")).booleanValue());
                }
                obj = Boolean.TRUE;
                result.success(obj);
                return;
            case 3:
                FindInteractionController findInteractionController2 = this.findInteractionController;
                if (findInteractionController2 != null) {
                    findInteractionController2.searchText = (String) methodCall.argument("searchText");
                    obj = Boolean.TRUE;
                    result.success(obj);
                    return;
                }
                obj = Boolean.FALSE;
                result.success(obj);
                return;
            case 4:
                FindInteractionController findInteractionController3 = this.findInteractionController;
                if (findInteractionController3 != null) {
                    findInteractionController3.clearMatches();
                }
                obj = Boolean.TRUE;
                result.success(obj);
                return;
            case 5:
                FindInteractionController findInteractionController4 = this.findInteractionController;
                obj = (findInteractionController4 == null || (findSession = findInteractionController4.activeFindSession) == null) ? null : findSession.toMap();
                result.success(obj);
                return;
            default:
                result.notImplemented();
                return;
        }
    }
}
