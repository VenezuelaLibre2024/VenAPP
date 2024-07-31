package io.flutter.plugins.webviewflutter;

import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public class WebChromeClientFlutterApiImpl extends GeneratedAndroidWebView.WebChromeClientFlutterApi {
    private final BinaryMessenger binaryMessenger;
    private final InstanceManager instanceManager;
    private final WebViewFlutterApiImpl webViewFlutterApi;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.flutter.plugins.webviewflutter.WebChromeClientFlutterApiImpl$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$android$webkit$ConsoleMessage$MessageLevel;

        static {
            int[] iArr = new int[ConsoleMessage.MessageLevel.values().length];
            $SwitchMap$android$webkit$ConsoleMessage$MessageLevel = iArr;
            try {
                iArr[ConsoleMessage.MessageLevel.TIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$webkit$ConsoleMessage$MessageLevel[ConsoleMessage.MessageLevel.LOG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$webkit$ConsoleMessage$MessageLevel[ConsoleMessage.MessageLevel.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$android$webkit$ConsoleMessage$MessageLevel[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$android$webkit$ConsoleMessage$MessageLevel[ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public WebChromeClientFlutterApiImpl(BinaryMessenger binaryMessenger, InstanceManager instanceManager) {
        super(binaryMessenger);
        this.binaryMessenger = binaryMessenger;
        this.instanceManager = instanceManager;
        this.webViewFlutterApi = new WebViewFlutterApiImpl(binaryMessenger, instanceManager);
    }

    private long getIdentifierForClient(WebChromeClient webChromeClient) {
        Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webChromeClient);
        if (identifierForStrongReference != null) {
            return identifierForStrongReference.longValue();
        }
        throw new IllegalStateException("Could not find identifier for WebChromeClient.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onGeolocationPermissionsShowPrompt$3(Void r02) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onPermissionRequest$4(Void r02) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onProgressChanged$0(Void r02) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onShowCustomView$5(Void r02) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onShowCustomView$6(Void r02) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onShowFileChooser$1(Void r02) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onShowFileChooser$2(Void r02) {
    }

    private static GeneratedAndroidWebView.ConsoleMessageLevel toConsoleMessageLevel(ConsoleMessage.MessageLevel messageLevel) {
        int i10 = AnonymousClass1.$SwitchMap$android$webkit$ConsoleMessage$MessageLevel[messageLevel.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? GeneratedAndroidWebView.ConsoleMessageLevel.UNKNOWN : GeneratedAndroidWebView.ConsoleMessageLevel.DEBUG : GeneratedAndroidWebView.ConsoleMessageLevel.ERROR : GeneratedAndroidWebView.ConsoleMessageLevel.WARNING : GeneratedAndroidWebView.ConsoleMessageLevel.LOG : GeneratedAndroidWebView.ConsoleMessageLevel.TIP;
    }

    public void onConsoleMessage(WebChromeClient webChromeClient, ConsoleMessage consoleMessage, GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply<Void> reply) {
        Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webChromeClient);
        Objects.requireNonNull(identifierForStrongReference);
        super.onConsoleMessage(identifierForStrongReference, new GeneratedAndroidWebView.ConsoleMessage.Builder().setLineNumber(Long.valueOf(consoleMessage.lineNumber())).setMessage(consoleMessage.message()).setLevel(toConsoleMessageLevel(consoleMessage.messageLevel())).setSourceId(consoleMessage.sourceId()).build(), reply);
    }

    public void onGeolocationPermissionsHidePrompt(WebChromeClient webChromeClient, GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply<Void> reply) {
        Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webChromeClient);
        Objects.requireNonNull(identifierForStrongReference);
        super.onGeolocationPermissionsHidePrompt(identifierForStrongReference, reply);
    }

    public void onGeolocationPermissionsShowPrompt(WebChromeClient webChromeClient, String str, GeolocationPermissions.Callback callback, GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply<Void> reply) {
        new GeolocationPermissionsCallbackFlutterApiImpl(this.binaryMessenger, this.instanceManager).create(callback, new GeneratedAndroidWebView.GeolocationPermissionsCallbackFlutterApi.Reply() { // from class: io.flutter.plugins.webviewflutter.d3
            @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.GeolocationPermissionsCallbackFlutterApi.Reply
            public final void reply(Object obj) {
                WebChromeClientFlutterApiImpl.lambda$onGeolocationPermissionsShowPrompt$3((Void) obj);
            }
        });
        Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webChromeClient);
        Objects.requireNonNull(identifierForStrongReference);
        Long identifierForStrongReference2 = this.instanceManager.getIdentifierForStrongReference(callback);
        Objects.requireNonNull(identifierForStrongReference2);
        onGeolocationPermissionsShowPrompt(identifierForStrongReference, identifierForStrongReference2, str, reply);
    }

    public void onHideCustomView(WebChromeClient webChromeClient, GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply<Void> reply) {
        Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webChromeClient);
        Objects.requireNonNull(identifierForStrongReference);
        super.onHideCustomView(identifierForStrongReference, reply);
    }

    public void onJsAlert(WebChromeClient webChromeClient, String str, String str2, GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply<Void> reply) {
        Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webChromeClient);
        Objects.requireNonNull(identifierForStrongReference);
        super.onJsAlert(identifierForStrongReference, str, str2, reply);
    }

    public void onJsConfirm(WebChromeClient webChromeClient, String str, String str2, GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply<Boolean> reply) {
        Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webChromeClient);
        Objects.requireNonNull(identifierForStrongReference);
        super.onJsConfirm(identifierForStrongReference, str, str2, reply);
    }

    public void onJsPrompt(WebChromeClient webChromeClient, String str, String str2, String str3, GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply<String> reply) {
        Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webChromeClient);
        Objects.requireNonNull(identifierForStrongReference);
        super.onJsPrompt(identifierForStrongReference, str, str2, str3, reply);
    }

    public void onPermissionRequest(WebChromeClient webChromeClient, PermissionRequest permissionRequest, GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply<Void> reply) {
        new PermissionRequestFlutterApiImpl(this.binaryMessenger, this.instanceManager).create(permissionRequest, permissionRequest.getResources(), new GeneratedAndroidWebView.PermissionRequestFlutterApi.Reply() { // from class: io.flutter.plugins.webviewflutter.h3
            @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.PermissionRequestFlutterApi.Reply
            public final void reply(Object obj) {
                WebChromeClientFlutterApiImpl.lambda$onPermissionRequest$4((Void) obj);
            }
        });
        Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webChromeClient);
        Objects.requireNonNull(identifierForStrongReference);
        Long identifierForStrongReference2 = this.instanceManager.getIdentifierForStrongReference(permissionRequest);
        Objects.requireNonNull(identifierForStrongReference2);
        super.onPermissionRequest(identifierForStrongReference, identifierForStrongReference2, reply);
    }

    public void onProgressChanged(WebChromeClient webChromeClient, WebView webView, Long l10, GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply<Void> reply) {
        this.webViewFlutterApi.create(webView, new GeneratedAndroidWebView.WebViewFlutterApi.Reply() { // from class: io.flutter.plugins.webviewflutter.e3
            @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewFlutterApi.Reply
            public final void reply(Object obj) {
                WebChromeClientFlutterApiImpl.lambda$onProgressChanged$0((Void) obj);
            }
        });
        Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webView);
        Objects.requireNonNull(identifierForStrongReference);
        super.onProgressChanged(Long.valueOf(getIdentifierForClient(webChromeClient)), identifierForStrongReference, l10, reply);
    }

    public void onShowCustomView(WebChromeClient webChromeClient, View view, WebChromeClient.CustomViewCallback customViewCallback, GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply<Void> reply) {
        new ViewFlutterApiImpl(this.binaryMessenger, this.instanceManager).create(view, new GeneratedAndroidWebView.ViewFlutterApi.Reply() { // from class: io.flutter.plugins.webviewflutter.b3
            @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.ViewFlutterApi.Reply
            public final void reply(Object obj) {
                WebChromeClientFlutterApiImpl.lambda$onShowCustomView$5((Void) obj);
            }
        });
        new CustomViewCallbackFlutterApiImpl(this.binaryMessenger, this.instanceManager).create(customViewCallback, new GeneratedAndroidWebView.CustomViewCallbackFlutterApi.Reply() { // from class: io.flutter.plugins.webviewflutter.c3
            @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.CustomViewCallbackFlutterApi.Reply
            public final void reply(Object obj) {
                WebChromeClientFlutterApiImpl.lambda$onShowCustomView$6((Void) obj);
            }
        });
        Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webChromeClient);
        Objects.requireNonNull(identifierForStrongReference);
        Long identifierForStrongReference2 = this.instanceManager.getIdentifierForStrongReference(view);
        Objects.requireNonNull(identifierForStrongReference2);
        Long identifierForStrongReference3 = this.instanceManager.getIdentifierForStrongReference(customViewCallback);
        Objects.requireNonNull(identifierForStrongReference3);
        onShowCustomView(identifierForStrongReference, identifierForStrongReference2, identifierForStrongReference3, reply);
    }

    public void onShowFileChooser(WebChromeClient webChromeClient, WebView webView, WebChromeClient.FileChooserParams fileChooserParams, GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply<List<String>> reply) {
        this.webViewFlutterApi.create(webView, new GeneratedAndroidWebView.WebViewFlutterApi.Reply() { // from class: io.flutter.plugins.webviewflutter.f3
            @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewFlutterApi.Reply
            public final void reply(Object obj) {
                WebChromeClientFlutterApiImpl.lambda$onShowFileChooser$1((Void) obj);
            }
        });
        new FileChooserParamsFlutterApiImpl(this.binaryMessenger, this.instanceManager).create(fileChooserParams, new GeneratedAndroidWebView.FileChooserParamsFlutterApi.Reply() { // from class: io.flutter.plugins.webviewflutter.g3
            @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.FileChooserParamsFlutterApi.Reply
            public final void reply(Object obj) {
                WebChromeClientFlutterApiImpl.lambda$onShowFileChooser$2((Void) obj);
            }
        });
        Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webChromeClient);
        Objects.requireNonNull(identifierForStrongReference);
        Long identifierForStrongReference2 = this.instanceManager.getIdentifierForStrongReference(webView);
        Objects.requireNonNull(identifierForStrongReference2);
        Long identifierForStrongReference3 = this.instanceManager.getIdentifierForStrongReference(fileChooserParams);
        Objects.requireNonNull(identifierForStrongReference3);
        onShowFileChooser(identifierForStrongReference, identifierForStrongReference2, identifierForStrongReference3, reply);
    }
}
