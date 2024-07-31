package io.flutter.plugins.webviewflutter;

import android.webkit.DownloadListener;
import io.flutter.plugins.webviewflutter.DownloadListenerHostApiImpl;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;

/* loaded from: classes3.dex */
public class DownloadListenerHostApiImpl implements GeneratedAndroidWebView.DownloadListenerHostApi {
    private final DownloadListenerCreator downloadListenerCreator;
    private final DownloadListenerFlutterApiImpl flutterApi;
    private final InstanceManager instanceManager;

    /* loaded from: classes3.dex */
    public static class DownloadListenerCreator {
        public DownloadListenerImpl createDownloadListener(DownloadListenerFlutterApiImpl downloadListenerFlutterApiImpl) {
            return new DownloadListenerImpl(downloadListenerFlutterApiImpl);
        }
    }

    /* loaded from: classes3.dex */
    public static class DownloadListenerImpl implements DownloadListener {
        private final DownloadListenerFlutterApiImpl flutterApi;

        public DownloadListenerImpl(DownloadListenerFlutterApiImpl downloadListenerFlutterApiImpl) {
            this.flutterApi = downloadListenerFlutterApiImpl;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onDownloadStart$0(Void r02) {
        }

        @Override // android.webkit.DownloadListener
        public void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
            this.flutterApi.onDownloadStart(this, str, str2, str3, str4, j10, new GeneratedAndroidWebView.DownloadListenerFlutterApi.Reply() { // from class: io.flutter.plugins.webviewflutter.c
                @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.DownloadListenerFlutterApi.Reply
                public final void reply(Object obj) {
                    DownloadListenerHostApiImpl.DownloadListenerImpl.lambda$onDownloadStart$0((Void) obj);
                }
            });
        }
    }

    public DownloadListenerHostApiImpl(InstanceManager instanceManager, DownloadListenerCreator downloadListenerCreator, DownloadListenerFlutterApiImpl downloadListenerFlutterApiImpl) {
        this.instanceManager = instanceManager;
        this.downloadListenerCreator = downloadListenerCreator;
        this.flutterApi = downloadListenerFlutterApiImpl;
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.DownloadListenerHostApi
    public void create(Long l10) {
        this.instanceManager.addDartCreatedInstance(this.downloadListenerCreator.createDownloadListener(this.flutterApi), l10.longValue());
    }
}
