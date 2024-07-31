package io.flutter.plugins.googlemobileads;

import android.view.View;
import io.flutter.plugin.platform.PlatformView;

/* loaded from: classes3.dex */
class FlutterPlatformView implements PlatformView {
    private View view;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FlutterPlatformView(View view) {
        this.view = view;
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public void dispose() {
        this.view = null;
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public View getView() {
        return this.view;
    }
}
