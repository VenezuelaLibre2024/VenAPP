package io.flutter.plugins.webviewflutter;

import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public class FlutterAssetManagerHostApiImpl implements GeneratedAndroidWebView.FlutterAssetManagerHostApi {
    final FlutterAssetManager flutterAssetManager;

    public FlutterAssetManagerHostApiImpl(FlutterAssetManager flutterAssetManager) {
        this.flutterAssetManager = flutterAssetManager;
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.FlutterAssetManagerHostApi
    public String getAssetFilePathByName(String str) {
        return this.flutterAssetManager.getAssetFilePathByName(str);
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.FlutterAssetManagerHostApi
    public List<String> list(String str) {
        try {
            String[] list = this.flutterAssetManager.list(str);
            return list == null ? new ArrayList() : Arrays.asList(list);
        } catch (IOException e10) {
            throw new RuntimeException(e10.getMessage());
        }
    }
}
