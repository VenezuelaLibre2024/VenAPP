package com.pichillilorenzo.flutter_inappwebview_android.in_app_browser;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.InAppBrowserMenuItem;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class InAppBrowserChannelDelegate extends ChannelDelegateImpl {
    public InAppBrowserChannelDelegate(MethodChannel methodChannel) {
        super(methodChannel);
    }

    public void onBrowserCreated() {
        MethodChannel channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.invokeMethod("onBrowserCreated", new HashMap());
    }

    public void onExit() {
        MethodChannel channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.invokeMethod("onExit", new HashMap());
    }

    public void onMenuItemClicked(InAppBrowserMenuItem inAppBrowserMenuItem) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(FacebookMediationAdapter.KEY_ID, Integer.valueOf(inAppBrowserMenuItem.getId()));
        channel.invokeMethod("onMenuItemClicked", hashMap);
    }
}
