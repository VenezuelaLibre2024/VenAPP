package io.flutter.plugins.webviewflutter;

import android.webkit.WebChromeClient;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class FileChooserParamsFlutterApiImpl extends GeneratedAndroidWebView.FileChooserParamsFlutterApi {
    private final InstanceManager instanceManager;

    public FileChooserParamsFlutterApiImpl(BinaryMessenger binaryMessenger, InstanceManager instanceManager) {
        super(binaryMessenger);
        this.instanceManager = instanceManager;
    }

    private static GeneratedAndroidWebView.FileChooserMode toFileChooserEnumData(int i10) {
        if (i10 == 0) {
            return GeneratedAndroidWebView.FileChooserMode.OPEN;
        }
        if (i10 == 1) {
            return GeneratedAndroidWebView.FileChooserMode.OPEN_MULTIPLE;
        }
        if (i10 == 3) {
            return GeneratedAndroidWebView.FileChooserMode.SAVE;
        }
        throw new IllegalArgumentException(String.format("Unsupported FileChooserMode: %d", Integer.valueOf(i10)));
    }

    public void create(WebChromeClient.FileChooserParams fileChooserParams, GeneratedAndroidWebView.FileChooserParamsFlutterApi.Reply<Void> reply) {
        if (this.instanceManager.containsInstance(fileChooserParams)) {
            return;
        }
        create(Long.valueOf(this.instanceManager.addHostCreatedInstance(fileChooserParams)), Boolean.valueOf(fileChooserParams.isCaptureEnabled()), Arrays.asList(fileChooserParams.getAcceptTypes()), toFileChooserEnumData(fileChooserParams.getMode()), fileChooserParams.getFilenameHint(), reply);
    }
}
