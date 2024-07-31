package io.flutter.plugins.webviewflutter;

import android.util.Log;
import com.google.android.libraries.barhopper.RecognitionOptions;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class GeneratedAndroidWebView {

    /* loaded from: classes3.dex */
    public static final class ConsoleMessage {
        private ConsoleMessageLevel level;
        private Long lineNumber;
        private String message;
        private String sourceId;

        /* loaded from: classes3.dex */
        public static final class Builder {
            private ConsoleMessageLevel level;
            private Long lineNumber;
            private String message;
            private String sourceId;

            public ConsoleMessage build() {
                ConsoleMessage consoleMessage = new ConsoleMessage();
                consoleMessage.setLineNumber(this.lineNumber);
                consoleMessage.setMessage(this.message);
                consoleMessage.setLevel(this.level);
                consoleMessage.setSourceId(this.sourceId);
                return consoleMessage;
            }

            public Builder setLevel(ConsoleMessageLevel consoleMessageLevel) {
                this.level = consoleMessageLevel;
                return this;
            }

            public Builder setLineNumber(Long l10) {
                this.lineNumber = l10;
                return this;
            }

            public Builder setMessage(String str) {
                this.message = str;
                return this;
            }

            public Builder setSourceId(String str) {
                this.sourceId = str;
                return this;
            }
        }

        ConsoleMessage() {
        }

        static ConsoleMessage fromList(ArrayList<Object> arrayList) {
            Long valueOf;
            ConsoleMessage consoleMessage = new ConsoleMessage();
            Object obj = arrayList.get(0);
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            consoleMessage.setLineNumber(valueOf);
            consoleMessage.setMessage((String) arrayList.get(1));
            consoleMessage.setLevel(ConsoleMessageLevel.values()[((Integer) arrayList.get(2)).intValue()]);
            consoleMessage.setSourceId((String) arrayList.get(3));
            return consoleMessage;
        }

        public ConsoleMessageLevel getLevel() {
            return this.level;
        }

        public Long getLineNumber() {
            return this.lineNumber;
        }

        public String getMessage() {
            return this.message;
        }

        public String getSourceId() {
            return this.sourceId;
        }

        public void setLevel(ConsoleMessageLevel consoleMessageLevel) {
            if (consoleMessageLevel == null) {
                throw new IllegalStateException("Nonnull field \"level\" is null.");
            }
            this.level = consoleMessageLevel;
        }

        public void setLineNumber(Long l10) {
            if (l10 == null) {
                throw new IllegalStateException("Nonnull field \"lineNumber\" is null.");
            }
            this.lineNumber = l10;
        }

        public void setMessage(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"message\" is null.");
            }
            this.message = str;
        }

        public void setSourceId(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"sourceId\" is null.");
            }
            this.sourceId = str;
        }

        ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(4);
            arrayList.add(this.lineNumber);
            arrayList.add(this.message);
            ConsoleMessageLevel consoleMessageLevel = this.level;
            arrayList.add(consoleMessageLevel == null ? null : Integer.valueOf(consoleMessageLevel.index));
            arrayList.add(this.sourceId);
            return arrayList;
        }
    }

    /* loaded from: classes3.dex */
    public enum ConsoleMessageLevel {
        DEBUG(0),
        ERROR(1),
        LOG(2),
        TIP(3),
        WARNING(4),
        UNKNOWN(5);

        final int index;

        ConsoleMessageLevel(int i10) {
            this.index = i10;
        }
    }

    /* loaded from: classes3.dex */
    public interface CookieManagerHostApi {
        static MessageCodec<Object> getCodec() {
            return new StandardMessageCodec();
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$0(CookieManagerHostApi cookieManagerHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long valueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            cookieManagerHostApi.attachInstance(valueOf);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$1(CookieManagerHostApi cookieManagerHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long valueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            String str = (String) arrayList2.get(1);
            String str2 = (String) arrayList2.get(2);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            cookieManagerHostApi.setCookie(valueOf, str, str2);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$2(CookieManagerHostApi cookieManagerHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            Number number = (Number) ((ArrayList) obj).get(0);
            cookieManagerHostApi.removeAllCookies(number == null ? null : Long.valueOf(number.longValue()), new Result<Boolean>() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.CookieManagerHostApi.1
                @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.Result
                public void error(Throwable th2) {
                    reply.reply(GeneratedAndroidWebView.wrapError(th2));
                }

                @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.Result
                public void success(Boolean bool) {
                    arrayList.add(0, bool);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$3(CookieManagerHostApi cookieManagerHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long valueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            Number number2 = (Number) arrayList2.get(1);
            Boolean bool = (Boolean) arrayList2.get(2);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            cookieManagerHostApi.setAcceptThirdPartyCookies(valueOf, number2 == null ? null : Long.valueOf(number2.longValue()), bool);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        static void setup(BinaryMessenger binaryMessenger, final CookieManagerHostApi cookieManagerHostApi) {
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.CookieManagerHostApi.attachInstance", getCodec());
            if (cookieManagerHostApi != null) {
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.d
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.CookieManagerHostApi.lambda$setup$0(GeneratedAndroidWebView.CookieManagerHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.CookieManagerHostApi.setCookie", getCodec());
            if (cookieManagerHostApi != null) {
                basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.e
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.CookieManagerHostApi.lambda$setup$1(GeneratedAndroidWebView.CookieManagerHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.CookieManagerHostApi.removeAllCookies", getCodec());
            if (cookieManagerHostApi != null) {
                basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.f
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.CookieManagerHostApi.lambda$setup$2(GeneratedAndroidWebView.CookieManagerHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.CookieManagerHostApi.setAcceptThirdPartyCookies", getCodec());
            if (cookieManagerHostApi != null) {
                basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.g
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.CookieManagerHostApi.lambda$setup$3(GeneratedAndroidWebView.CookieManagerHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel4.setMessageHandler(null);
            }
        }

        void attachInstance(Long l10);

        void removeAllCookies(Long l10, Result<Boolean> result);

        void setAcceptThirdPartyCookies(Long l10, Long l11, Boolean bool);

        void setCookie(Long l10, String str, String str2);
    }

    /* loaded from: classes3.dex */
    public static class CustomViewCallbackFlutterApi {
        private final BinaryMessenger binaryMessenger;

        /* loaded from: classes3.dex */
        public interface Reply<T> {
            void reply(T t10);
        }

        public CustomViewCallbackFlutterApi(BinaryMessenger binaryMessenger) {
            this.binaryMessenger = binaryMessenger;
        }

        static MessageCodec<Object> getCodec() {
            return new StandardMessageCodec();
        }

        public void create(Long l10, final Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.CustomViewCallbackFlutterApi.create", getCodec()).send(new ArrayList(Collections.singletonList(l10)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.h
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    GeneratedAndroidWebView.CustomViewCallbackFlutterApi.Reply.this.reply(null);
                }
            });
        }
    }

    /* loaded from: classes3.dex */
    public interface CustomViewCallbackHostApi {
        static MessageCodec<Object> getCodec() {
            return new StandardMessageCodec();
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$0(CustomViewCallbackHostApi customViewCallbackHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long valueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            customViewCallbackHostApi.onCustomViewHidden(valueOf);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        static void setup(BinaryMessenger binaryMessenger, final CustomViewCallbackHostApi customViewCallbackHostApi) {
            new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.CustomViewCallbackHostApi.onCustomViewHidden", getCodec()).setMessageHandler(customViewCallbackHostApi != null ? new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.i
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    GeneratedAndroidWebView.CustomViewCallbackHostApi.lambda$setup$0(GeneratedAndroidWebView.CustomViewCallbackHostApi.this, obj, reply);
                }
            } : null);
        }

        void onCustomViewHidden(Long l10);
    }

    /* loaded from: classes3.dex */
    public static class DownloadListenerFlutterApi {
        private final BinaryMessenger binaryMessenger;

        /* loaded from: classes3.dex */
        public interface Reply<T> {
            void reply(T t10);
        }

        public DownloadListenerFlutterApi(BinaryMessenger binaryMessenger) {
            this.binaryMessenger = binaryMessenger;
        }

        static MessageCodec<Object> getCodec() {
            return new StandardMessageCodec();
        }

        public void onDownloadStart(Long l10, String str, String str2, String str3, String str4, Long l11, final Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.DownloadListenerFlutterApi.onDownloadStart", getCodec()).send(new ArrayList(Arrays.asList(l10, str, str2, str3, str4, l11)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.j
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    GeneratedAndroidWebView.DownloadListenerFlutterApi.Reply.this.reply(null);
                }
            });
        }
    }

    /* loaded from: classes3.dex */
    public interface DownloadListenerHostApi {
        static MessageCodec<Object> getCodec() {
            return new StandardMessageCodec();
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$0(DownloadListenerHostApi downloadListenerHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long valueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            downloadListenerHostApi.create(valueOf);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        static void setup(BinaryMessenger binaryMessenger, final DownloadListenerHostApi downloadListenerHostApi) {
            new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.DownloadListenerHostApi.create", getCodec()).setMessageHandler(downloadListenerHostApi != null ? new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.k
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    GeneratedAndroidWebView.DownloadListenerHostApi.lambda$setup$0(GeneratedAndroidWebView.DownloadListenerHostApi.this, obj, reply);
                }
            } : null);
        }

        void create(Long l10);
    }

    /* loaded from: classes3.dex */
    public enum FileChooserMode {
        OPEN(0),
        OPEN_MULTIPLE(1),
        SAVE(2);

        final int index;

        FileChooserMode(int i10) {
            this.index = i10;
        }
    }

    /* loaded from: classes3.dex */
    public static class FileChooserParamsFlutterApi {
        private final BinaryMessenger binaryMessenger;

        /* loaded from: classes3.dex */
        public interface Reply<T> {
            void reply(T t10);
        }

        public FileChooserParamsFlutterApi(BinaryMessenger binaryMessenger) {
            this.binaryMessenger = binaryMessenger;
        }

        static MessageCodec<Object> getCodec() {
            return new StandardMessageCodec();
        }

        public void create(Long l10, Boolean bool, List<String> list, FileChooserMode fileChooserMode, String str, final Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.FileChooserParamsFlutterApi.create", getCodec()).send(new ArrayList(Arrays.asList(l10, bool, list, Integer.valueOf(fileChooserMode.index), str)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.l
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    GeneratedAndroidWebView.FileChooserParamsFlutterApi.Reply.this.reply(null);
                }
            });
        }
    }

    /* loaded from: classes3.dex */
    public interface FlutterAssetManagerHostApi {
        static MessageCodec<Object> getCodec() {
            return new StandardMessageCodec();
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$0(FlutterAssetManagerHostApi flutterAssetManagerHostApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, flutterAssetManagerHostApi.list((String) ((ArrayList) obj).get(0)));
            } catch (Throwable th2) {
                arrayList = GeneratedAndroidWebView.wrapError(th2);
            }
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$1(FlutterAssetManagerHostApi flutterAssetManagerHostApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, flutterAssetManagerHostApi.getAssetFilePathByName((String) ((ArrayList) obj).get(0)));
            } catch (Throwable th2) {
                arrayList = GeneratedAndroidWebView.wrapError(th2);
            }
            reply.reply(arrayList);
        }

        static void setup(BinaryMessenger binaryMessenger, final FlutterAssetManagerHostApi flutterAssetManagerHostApi) {
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManagerHostApi.list", getCodec());
            if (flutterAssetManagerHostApi != null) {
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.m
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.FlutterAssetManagerHostApi.lambda$setup$0(GeneratedAndroidWebView.FlutterAssetManagerHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManagerHostApi.getAssetFilePathByName", getCodec());
            if (flutterAssetManagerHostApi != null) {
                basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.n
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.FlutterAssetManagerHostApi.lambda$setup$1(GeneratedAndroidWebView.FlutterAssetManagerHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
        }

        String getAssetFilePathByName(String str);

        List<String> list(String str);
    }

    /* loaded from: classes3.dex */
    public static class FlutterError extends RuntimeException {
        public final String code;
        public final Object details;

        public FlutterError(String str, String str2, Object obj) {
            super(str2);
            this.code = str;
            this.details = obj;
        }
    }

    /* loaded from: classes3.dex */
    public static class GeolocationPermissionsCallbackFlutterApi {
        private final BinaryMessenger binaryMessenger;

        /* loaded from: classes3.dex */
        public interface Reply<T> {
            void reply(T t10);
        }

        public GeolocationPermissionsCallbackFlutterApi(BinaryMessenger binaryMessenger) {
            this.binaryMessenger = binaryMessenger;
        }

        static MessageCodec<Object> getCodec() {
            return new StandardMessageCodec();
        }

        public void create(Long l10, final Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallbackFlutterApi.create", getCodec()).send(new ArrayList(Collections.singletonList(l10)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.o
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    GeneratedAndroidWebView.GeolocationPermissionsCallbackFlutterApi.Reply.this.reply(null);
                }
            });
        }
    }

    /* loaded from: classes3.dex */
    public interface GeolocationPermissionsCallbackHostApi {
        static MessageCodec<Object> getCodec() {
            return new StandardMessageCodec();
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$0(GeolocationPermissionsCallbackHostApi geolocationPermissionsCallbackHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long valueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            String str = (String) arrayList2.get(1);
            Boolean bool = (Boolean) arrayList2.get(2);
            Boolean bool2 = (Boolean) arrayList2.get(3);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            geolocationPermissionsCallbackHostApi.invoke(valueOf, str, bool, bool2);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        static void setup(BinaryMessenger binaryMessenger, final GeolocationPermissionsCallbackHostApi geolocationPermissionsCallbackHostApi) {
            new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallbackHostApi.invoke", getCodec()).setMessageHandler(geolocationPermissionsCallbackHostApi != null ? new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.p
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    GeneratedAndroidWebView.GeolocationPermissionsCallbackHostApi.lambda$setup$0(GeneratedAndroidWebView.GeolocationPermissionsCallbackHostApi.this, obj, reply);
                }
            } : null);
        }

        void invoke(Long l10, String str, Boolean bool, Boolean bool2);
    }

    /* loaded from: classes3.dex */
    public static class HttpAuthHandlerFlutterApi {
        private final BinaryMessenger binaryMessenger;

        /* loaded from: classes3.dex */
        public interface Reply<T> {
            void reply(T t10);
        }

        public HttpAuthHandlerFlutterApi(BinaryMessenger binaryMessenger) {
            this.binaryMessenger = binaryMessenger;
        }

        static MessageCodec<Object> getCodec() {
            return new StandardMessageCodec();
        }

        public void create(Long l10, final Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandlerFlutterApi.create", getCodec()).send(new ArrayList(Collections.singletonList(l10)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.q
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    GeneratedAndroidWebView.HttpAuthHandlerFlutterApi.Reply.this.reply(null);
                }
            });
        }
    }

    /* loaded from: classes3.dex */
    public interface HttpAuthHandlerHostApi {
        static MessageCodec<Object> getCodec() {
            return new StandardMessageCodec();
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$0(HttpAuthHandlerHostApi httpAuthHandlerHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long valueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            arrayList.add(0, httpAuthHandlerHostApi.useHttpAuthUsernamePassword(valueOf));
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$1(HttpAuthHandlerHostApi httpAuthHandlerHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long valueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            httpAuthHandlerHostApi.cancel(valueOf);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$2(HttpAuthHandlerHostApi httpAuthHandlerHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long valueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            String str = (String) arrayList2.get(1);
            String str2 = (String) arrayList2.get(2);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            httpAuthHandlerHostApi.proceed(valueOf, str, str2);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        static void setup(BinaryMessenger binaryMessenger, final HttpAuthHandlerHostApi httpAuthHandlerHostApi) {
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandlerHostApi.useHttpAuthUsernamePassword", getCodec());
            if (httpAuthHandlerHostApi != null) {
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.s
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.HttpAuthHandlerHostApi.lambda$setup$0(GeneratedAndroidWebView.HttpAuthHandlerHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandlerHostApi.cancel", getCodec());
            if (httpAuthHandlerHostApi != null) {
                basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.t
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.HttpAuthHandlerHostApi.lambda$setup$1(GeneratedAndroidWebView.HttpAuthHandlerHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandlerHostApi.proceed", getCodec());
            if (httpAuthHandlerHostApi != null) {
                basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.u
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.HttpAuthHandlerHostApi.lambda$setup$2(GeneratedAndroidWebView.HttpAuthHandlerHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
        }

        void cancel(Long l10);

        void proceed(Long l10, String str, String str2);

        Boolean useHttpAuthUsernamePassword(Long l10);
    }

    /* loaded from: classes3.dex */
    public interface InstanceManagerHostApi {
        static MessageCodec<Object> getCodec() {
            return new StandardMessageCodec();
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$0(InstanceManagerHostApi instanceManagerHostApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                instanceManagerHostApi.clear();
                arrayList.add(0, null);
            } catch (Throwable th2) {
                arrayList = GeneratedAndroidWebView.wrapError(th2);
            }
            reply.reply(arrayList);
        }

        static void setup(BinaryMessenger binaryMessenger, final InstanceManagerHostApi instanceManagerHostApi) {
            new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.InstanceManagerHostApi.clear", getCodec()).setMessageHandler(instanceManagerHostApi != null ? new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.v
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    GeneratedAndroidWebView.InstanceManagerHostApi.lambda$setup$0(GeneratedAndroidWebView.InstanceManagerHostApi.this, obj, reply);
                }
            } : null);
        }

        void clear();
    }

    /* loaded from: classes3.dex */
    public static class JavaObjectFlutterApi {
        private final BinaryMessenger binaryMessenger;

        /* loaded from: classes3.dex */
        public interface Reply<T> {
            void reply(T t10);
        }

        public JavaObjectFlutterApi(BinaryMessenger binaryMessenger) {
            this.binaryMessenger = binaryMessenger;
        }

        static MessageCodec<Object> getCodec() {
            return new StandardMessageCodec();
        }

        public void dispose(Long l10, final Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.JavaObjectFlutterApi.dispose", getCodec()).send(new ArrayList(Collections.singletonList(l10)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.w
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    GeneratedAndroidWebView.JavaObjectFlutterApi.Reply.this.reply(null);
                }
            });
        }
    }

    /* loaded from: classes3.dex */
    public interface JavaObjectHostApi {
        static MessageCodec<Object> getCodec() {
            return new StandardMessageCodec();
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$0(JavaObjectHostApi javaObjectHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long valueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            javaObjectHostApi.dispose(valueOf);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        static void setup(BinaryMessenger binaryMessenger, final JavaObjectHostApi javaObjectHostApi) {
            new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.JavaObjectHostApi.dispose", getCodec()).setMessageHandler(javaObjectHostApi != null ? new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.x
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    GeneratedAndroidWebView.JavaObjectHostApi.lambda$setup$0(GeneratedAndroidWebView.JavaObjectHostApi.this, obj, reply);
                }
            } : null);
        }

        void dispose(Long l10);
    }

    /* loaded from: classes3.dex */
    public static class JavaScriptChannelFlutterApi {
        private final BinaryMessenger binaryMessenger;

        /* loaded from: classes3.dex */
        public interface Reply<T> {
            void reply(T t10);
        }

        public JavaScriptChannelFlutterApi(BinaryMessenger binaryMessenger) {
            this.binaryMessenger = binaryMessenger;
        }

        static MessageCodec<Object> getCodec() {
            return new StandardMessageCodec();
        }

        public void postMessage(Long l10, String str, final Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.JavaScriptChannelFlutterApi.postMessage", getCodec()).send(new ArrayList(Arrays.asList(l10, str)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.y
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    GeneratedAndroidWebView.JavaScriptChannelFlutterApi.Reply.this.reply(null);
                }
            });
        }
    }

    /* loaded from: classes3.dex */
    public interface JavaScriptChannelHostApi {
        static MessageCodec<Object> getCodec() {
            return new StandardMessageCodec();
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$0(JavaScriptChannelHostApi javaScriptChannelHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long valueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            String str = (String) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            javaScriptChannelHostApi.create(valueOf, str);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        static void setup(BinaryMessenger binaryMessenger, final JavaScriptChannelHostApi javaScriptChannelHostApi) {
            new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.JavaScriptChannelHostApi.create", getCodec()).setMessageHandler(javaScriptChannelHostApi != null ? new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.z
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    GeneratedAndroidWebView.JavaScriptChannelHostApi.lambda$setup$0(GeneratedAndroidWebView.JavaScriptChannelHostApi.this, obj, reply);
                }
            } : null);
        }

        void create(Long l10, String str);
    }

    /* loaded from: classes3.dex */
    public static class PermissionRequestFlutterApi {
        private final BinaryMessenger binaryMessenger;

        /* loaded from: classes3.dex */
        public interface Reply<T> {
            void reply(T t10);
        }

        public PermissionRequestFlutterApi(BinaryMessenger binaryMessenger) {
            this.binaryMessenger = binaryMessenger;
        }

        static MessageCodec<Object> getCodec() {
            return new StandardMessageCodec();
        }

        public void create(Long l10, List<String> list, final Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.PermissionRequestFlutterApi.create", getCodec()).send(new ArrayList(Arrays.asList(l10, list)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.a0
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    GeneratedAndroidWebView.PermissionRequestFlutterApi.Reply.this.reply(null);
                }
            });
        }
    }

    /* loaded from: classes3.dex */
    public interface PermissionRequestHostApi {
        static MessageCodec<Object> getCodec() {
            return new StandardMessageCodec();
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$0(PermissionRequestHostApi permissionRequestHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long valueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            List<String> list = (List) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            permissionRequestHostApi.grant(valueOf, list);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$1(PermissionRequestHostApi permissionRequestHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long valueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            permissionRequestHostApi.deny(valueOf);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        static void setup(BinaryMessenger binaryMessenger, final PermissionRequestHostApi permissionRequestHostApi) {
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.PermissionRequestHostApi.grant", getCodec());
            if (permissionRequestHostApi != null) {
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.b0
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.PermissionRequestHostApi.lambda$setup$0(GeneratedAndroidWebView.PermissionRequestHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.PermissionRequestHostApi.deny", getCodec());
            if (permissionRequestHostApi != null) {
                basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.c0
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.PermissionRequestHostApi.lambda$setup$1(GeneratedAndroidWebView.PermissionRequestHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
        }

        void deny(Long l10);

        void grant(Long l10, List<String> list);
    }

    /* loaded from: classes3.dex */
    public interface Result<T> {
        void error(Throwable th2);

        void success(T t10);
    }

    /* loaded from: classes3.dex */
    public static class ViewFlutterApi {
        private final BinaryMessenger binaryMessenger;

        /* loaded from: classes3.dex */
        public interface Reply<T> {
            void reply(T t10);
        }

        public ViewFlutterApi(BinaryMessenger binaryMessenger) {
            this.binaryMessenger = binaryMessenger;
        }

        static MessageCodec<Object> getCodec() {
            return new StandardMessageCodec();
        }

        public void create(Long l10, final Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.ViewFlutterApi.create", getCodec()).send(new ArrayList(Collections.singletonList(l10)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.d0
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    GeneratedAndroidWebView.ViewFlutterApi.Reply.this.reply(null);
                }
            });
        }
    }

    /* loaded from: classes3.dex */
    public static class WebChromeClientFlutterApi {
        private final BinaryMessenger binaryMessenger;

        /* loaded from: classes3.dex */
        public interface Reply<T> {
            void reply(T t10);
        }

        public WebChromeClientFlutterApi(BinaryMessenger binaryMessenger) {
            this.binaryMessenger = binaryMessenger;
        }

        static MessageCodec<Object> getCodec() {
            return WebChromeClientFlutterApiCodec.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onJsConfirm$9(Reply reply, Object obj) {
            reply.reply((Boolean) obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onJsPrompt$10(Reply reply, Object obj) {
            reply.reply((String) obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onShowFileChooser$1(Reply reply, Object obj) {
            reply.reply((List) obj);
        }

        public void onConsoleMessage(Long l10, ConsoleMessage consoleMessage, final Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientFlutterApi.onConsoleMessage", getCodec()).send(new ArrayList(Arrays.asList(l10, consoleMessage)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.o0
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply.this.reply(null);
                }
            });
        }

        public void onGeolocationPermissionsHidePrompt(Long l10, final Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientFlutterApi.onGeolocationPermissionsHidePrompt", getCodec()).send(new ArrayList(Collections.singletonList(l10)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.k0
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply.this.reply(null);
                }
            });
        }

        public void onGeolocationPermissionsShowPrompt(Long l10, Long l11, String str, final Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientFlutterApi.onGeolocationPermissionsShowPrompt", getCodec()).send(new ArrayList(Arrays.asList(l10, l11, str)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.i0
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply.this.reply(null);
                }
            });
        }

        public void onHideCustomView(Long l10, final Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientFlutterApi.onHideCustomView", getCodec()).send(new ArrayList(Collections.singletonList(l10)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.j0
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply.this.reply(null);
                }
            });
        }

        public void onJsAlert(Long l10, String str, String str2, final Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientFlutterApi.onJsAlert", getCodec()).send(new ArrayList(Arrays.asList(l10, str, str2)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.f0
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply.this.reply(null);
                }
            });
        }

        public void onJsConfirm(Long l10, String str, String str2, final Reply<Boolean> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientFlutterApi.onJsConfirm", getCodec()).send(new ArrayList(Arrays.asList(l10, str, str2)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.h0
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    GeneratedAndroidWebView.WebChromeClientFlutterApi.lambda$onJsConfirm$9(GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply.this, obj);
                }
            });
        }

        public void onJsPrompt(Long l10, String str, String str2, String str3, final Reply<String> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientFlutterApi.onJsPrompt", getCodec()).send(new ArrayList(Arrays.asList(l10, str, str2, str3)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.g0
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    GeneratedAndroidWebView.WebChromeClientFlutterApi.lambda$onJsPrompt$10(GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply.this, obj);
                }
            });
        }

        public void onPermissionRequest(Long l10, Long l11, final Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientFlutterApi.onPermissionRequest", getCodec()).send(new ArrayList(Arrays.asList(l10, l11)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.e0
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply.this.reply(null);
                }
            });
        }

        public void onProgressChanged(Long l10, Long l11, Long l12, final Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientFlutterApi.onProgressChanged", getCodec()).send(new ArrayList(Arrays.asList(l10, l11, l12)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.l0
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply.this.reply(null);
                }
            });
        }

        public void onShowCustomView(Long l10, Long l11, Long l12, final Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientFlutterApi.onShowCustomView", getCodec()).send(new ArrayList(Arrays.asList(l10, l11, l12)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.n0
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply.this.reply(null);
                }
            });
        }

        public void onShowFileChooser(Long l10, Long l11, Long l12, final Reply<List<String>> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientFlutterApi.onShowFileChooser", getCodec()).send(new ArrayList(Arrays.asList(l10, l11, l12)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.m0
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    GeneratedAndroidWebView.WebChromeClientFlutterApi.lambda$onShowFileChooser$1(GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply.this, obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class WebChromeClientFlutterApiCodec extends StandardMessageCodec {
        public static final WebChromeClientFlutterApiCodec INSTANCE = new WebChromeClientFlutterApiCodec();

        private WebChromeClientFlutterApiCodec() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.flutter.plugin.common.StandardMessageCodec
        public Object readValueOfType(byte b10, ByteBuffer byteBuffer) {
            return b10 != Byte.MIN_VALUE ? super.readValueOfType(b10, byteBuffer) : ConsoleMessage.fromList((ArrayList) readValue(byteBuffer));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.flutter.plugin.common.StandardMessageCodec
        public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (!(obj instanceof ConsoleMessage)) {
                super.writeValue(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(RecognitionOptions.ITF);
                writeValue(byteArrayOutputStream, ((ConsoleMessage) obj).toList());
            }
        }
    }

    /* loaded from: classes3.dex */
    public interface WebChromeClientHostApi {
        static MessageCodec<Object> getCodec() {
            return new StandardMessageCodec();
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$0(WebChromeClientHostApi webChromeClientHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long valueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webChromeClientHostApi.create(valueOf);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$1(WebChromeClientHostApi webChromeClientHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long valueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            Boolean bool = (Boolean) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webChromeClientHostApi.setSynchronousReturnValueForOnShowFileChooser(valueOf, bool);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$2(WebChromeClientHostApi webChromeClientHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long valueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            Boolean bool = (Boolean) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webChromeClientHostApi.setSynchronousReturnValueForOnConsoleMessage(valueOf, bool);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$3(WebChromeClientHostApi webChromeClientHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long valueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            Boolean bool = (Boolean) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webChromeClientHostApi.setSynchronousReturnValueForOnJsAlert(valueOf, bool);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$4(WebChromeClientHostApi webChromeClientHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long valueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            Boolean bool = (Boolean) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webChromeClientHostApi.setSynchronousReturnValueForOnJsConfirm(valueOf, bool);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$5(WebChromeClientHostApi webChromeClientHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long valueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            Boolean bool = (Boolean) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webChromeClientHostApi.setSynchronousReturnValueForOnJsPrompt(valueOf, bool);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        static void setup(BinaryMessenger binaryMessenger, final WebChromeClientHostApi webChromeClientHostApi) {
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientHostApi.create", getCodec());
            if (webChromeClientHostApi != null) {
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.p0
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebChromeClientHostApi.lambda$setup$0(GeneratedAndroidWebView.WebChromeClientHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientHostApi.setSynchronousReturnValueForOnShowFileChooser", getCodec());
            if (webChromeClientHostApi != null) {
                basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.q0
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebChromeClientHostApi.lambda$setup$1(GeneratedAndroidWebView.WebChromeClientHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientHostApi.setSynchronousReturnValueForOnConsoleMessage", getCodec());
            if (webChromeClientHostApi != null) {
                basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.r0
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebChromeClientHostApi.lambda$setup$2(GeneratedAndroidWebView.WebChromeClientHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientHostApi.setSynchronousReturnValueForOnJsAlert", getCodec());
            if (webChromeClientHostApi != null) {
                basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.s0
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebChromeClientHostApi.lambda$setup$3(GeneratedAndroidWebView.WebChromeClientHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel4.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientHostApi.setSynchronousReturnValueForOnJsConfirm", getCodec());
            if (webChromeClientHostApi != null) {
                basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.t0
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebChromeClientHostApi.lambda$setup$4(GeneratedAndroidWebView.WebChromeClientHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel5.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientHostApi.setSynchronousReturnValueForOnJsPrompt", getCodec());
            if (webChromeClientHostApi != null) {
                basicMessageChannel6.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.u0
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebChromeClientHostApi.lambda$setup$5(GeneratedAndroidWebView.WebChromeClientHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel6.setMessageHandler(null);
            }
        }

        void create(Long l10);

        void setSynchronousReturnValueForOnConsoleMessage(Long l10, Boolean bool);

        void setSynchronousReturnValueForOnJsAlert(Long l10, Boolean bool);

        void setSynchronousReturnValueForOnJsConfirm(Long l10, Boolean bool);

        void setSynchronousReturnValueForOnJsPrompt(Long l10, Boolean bool);

        void setSynchronousReturnValueForOnShowFileChooser(Long l10, Boolean bool);
    }

    /* loaded from: classes3.dex */
    public static final class WebResourceErrorData {
        private String description;
        private Long errorCode;

        /* loaded from: classes3.dex */
        public static final class Builder {
            private String description;
            private Long errorCode;

            public WebResourceErrorData build() {
                WebResourceErrorData webResourceErrorData = new WebResourceErrorData();
                webResourceErrorData.setErrorCode(this.errorCode);
                webResourceErrorData.setDescription(this.description);
                return webResourceErrorData;
            }

            public Builder setDescription(String str) {
                this.description = str;
                return this;
            }

            public Builder setErrorCode(Long l10) {
                this.errorCode = l10;
                return this;
            }
        }

        WebResourceErrorData() {
        }

        static WebResourceErrorData fromList(ArrayList<Object> arrayList) {
            Long valueOf;
            WebResourceErrorData webResourceErrorData = new WebResourceErrorData();
            Object obj = arrayList.get(0);
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            webResourceErrorData.setErrorCode(valueOf);
            webResourceErrorData.setDescription((String) arrayList.get(1));
            return webResourceErrorData;
        }

        public String getDescription() {
            return this.description;
        }

        public Long getErrorCode() {
            return this.errorCode;
        }

        public void setDescription(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"description\" is null.");
            }
            this.description = str;
        }

        public void setErrorCode(Long l10) {
            if (l10 == null) {
                throw new IllegalStateException("Nonnull field \"errorCode\" is null.");
            }
            this.errorCode = l10;
        }

        ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.errorCode);
            arrayList.add(this.description);
            return arrayList;
        }
    }

    /* loaded from: classes3.dex */
    public static final class WebResourceRequestData {
        private Boolean hasGesture;
        private Boolean isForMainFrame;
        private Boolean isRedirect;
        private String method;
        private Map<String, String> requestHeaders;
        private String url;

        /* loaded from: classes3.dex */
        public static final class Builder {
            private Boolean hasGesture;
            private Boolean isForMainFrame;
            private Boolean isRedirect;
            private String method;
            private Map<String, String> requestHeaders;
            private String url;

            public WebResourceRequestData build() {
                WebResourceRequestData webResourceRequestData = new WebResourceRequestData();
                webResourceRequestData.setUrl(this.url);
                webResourceRequestData.setIsForMainFrame(this.isForMainFrame);
                webResourceRequestData.setIsRedirect(this.isRedirect);
                webResourceRequestData.setHasGesture(this.hasGesture);
                webResourceRequestData.setMethod(this.method);
                webResourceRequestData.setRequestHeaders(this.requestHeaders);
                return webResourceRequestData;
            }

            public Builder setHasGesture(Boolean bool) {
                this.hasGesture = bool;
                return this;
            }

            public Builder setIsForMainFrame(Boolean bool) {
                this.isForMainFrame = bool;
                return this;
            }

            public Builder setIsRedirect(Boolean bool) {
                this.isRedirect = bool;
                return this;
            }

            public Builder setMethod(String str) {
                this.method = str;
                return this;
            }

            public Builder setRequestHeaders(Map<String, String> map) {
                this.requestHeaders = map;
                return this;
            }

            public Builder setUrl(String str) {
                this.url = str;
                return this;
            }
        }

        WebResourceRequestData() {
        }

        static WebResourceRequestData fromList(ArrayList<Object> arrayList) {
            WebResourceRequestData webResourceRequestData = new WebResourceRequestData();
            webResourceRequestData.setUrl((String) arrayList.get(0));
            webResourceRequestData.setIsForMainFrame((Boolean) arrayList.get(1));
            webResourceRequestData.setIsRedirect((Boolean) arrayList.get(2));
            webResourceRequestData.setHasGesture((Boolean) arrayList.get(3));
            webResourceRequestData.setMethod((String) arrayList.get(4));
            webResourceRequestData.setRequestHeaders((Map) arrayList.get(5));
            return webResourceRequestData;
        }

        public Boolean getHasGesture() {
            return this.hasGesture;
        }

        public Boolean getIsForMainFrame() {
            return this.isForMainFrame;
        }

        public Boolean getIsRedirect() {
            return this.isRedirect;
        }

        public String getMethod() {
            return this.method;
        }

        public Map<String, String> getRequestHeaders() {
            return this.requestHeaders;
        }

        public String getUrl() {
            return this.url;
        }

        public void setHasGesture(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"hasGesture\" is null.");
            }
            this.hasGesture = bool;
        }

        public void setIsForMainFrame(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"isForMainFrame\" is null.");
            }
            this.isForMainFrame = bool;
        }

        public void setIsRedirect(Boolean bool) {
            this.isRedirect = bool;
        }

        public void setMethod(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"method\" is null.");
            }
            this.method = str;
        }

        public void setRequestHeaders(Map<String, String> map) {
            if (map == null) {
                throw new IllegalStateException("Nonnull field \"requestHeaders\" is null.");
            }
            this.requestHeaders = map;
        }

        public void setUrl(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"url\" is null.");
            }
            this.url = str;
        }

        ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(6);
            arrayList.add(this.url);
            arrayList.add(this.isForMainFrame);
            arrayList.add(this.isRedirect);
            arrayList.add(this.hasGesture);
            arrayList.add(this.method);
            arrayList.add(this.requestHeaders);
            return arrayList;
        }
    }

    /* loaded from: classes3.dex */
    public interface WebSettingsHostApi {
        static MessageCodec<Object> getCodec() {
            return new StandardMessageCodec();
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$0(WebSettingsHostApi webSettingsHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long valueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            Number number2 = (Number) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webSettingsHostApi.create(valueOf, number2 == null ? null : Long.valueOf(number2.longValue()));
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$1(WebSettingsHostApi webSettingsHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long valueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            Boolean bool = (Boolean) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webSettingsHostApi.setDomStorageEnabled(valueOf, bool);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$10(WebSettingsHostApi webSettingsHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long valueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            Boolean bool = (Boolean) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webSettingsHostApi.setDisplayZoomControls(valueOf, bool);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$11(WebSettingsHostApi webSettingsHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long valueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            Boolean bool = (Boolean) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webSettingsHostApi.setBuiltInZoomControls(valueOf, bool);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$12(WebSettingsHostApi webSettingsHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long valueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            Boolean bool = (Boolean) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webSettingsHostApi.setAllowFileAccess(valueOf, bool);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$13(WebSettingsHostApi webSettingsHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long valueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            Number number2 = (Number) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webSettingsHostApi.setTextZoom(valueOf, number2 == null ? null : Long.valueOf(number2.longValue()));
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$14(WebSettingsHostApi webSettingsHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long valueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            arrayList.add(0, webSettingsHostApi.getUserAgentString(valueOf));
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$2(WebSettingsHostApi webSettingsHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long valueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            Boolean bool = (Boolean) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webSettingsHostApi.setJavaScriptCanOpenWindowsAutomatically(valueOf, bool);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$3(WebSettingsHostApi webSettingsHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long valueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            Boolean bool = (Boolean) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webSettingsHostApi.setSupportMultipleWindows(valueOf, bool);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$4(WebSettingsHostApi webSettingsHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long valueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            Boolean bool = (Boolean) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webSettingsHostApi.setJavaScriptEnabled(valueOf, bool);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$5(WebSettingsHostApi webSettingsHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long valueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            String str = (String) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webSettingsHostApi.setUserAgentString(valueOf, str);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$6(WebSettingsHostApi webSettingsHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long valueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            Boolean bool = (Boolean) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webSettingsHostApi.setMediaPlaybackRequiresUserGesture(valueOf, bool);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$7(WebSettingsHostApi webSettingsHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long valueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            Boolean bool = (Boolean) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webSettingsHostApi.setSupportZoom(valueOf, bool);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$8(WebSettingsHostApi webSettingsHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long valueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            Boolean bool = (Boolean) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webSettingsHostApi.setLoadWithOverviewMode(valueOf, bool);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$9(WebSettingsHostApi webSettingsHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long valueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            Boolean bool = (Boolean) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webSettingsHostApi.setUseWideViewPort(valueOf, bool);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        static void setup(BinaryMessenger binaryMessenger, final WebSettingsHostApi webSettingsHostApi) {
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.create", getCodec());
            if (webSettingsHostApi != null) {
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.v0
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebSettingsHostApi.lambda$setup$0(GeneratedAndroidWebView.WebSettingsHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.setDomStorageEnabled", getCodec());
            if (webSettingsHostApi != null) {
                basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.g1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebSettingsHostApi.lambda$setup$1(GeneratedAndroidWebView.WebSettingsHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.setJavaScriptCanOpenWindowsAutomatically", getCodec());
            if (webSettingsHostApi != null) {
                basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.h1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebSettingsHostApi.lambda$setup$2(GeneratedAndroidWebView.WebSettingsHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.setSupportMultipleWindows", getCodec());
            if (webSettingsHostApi != null) {
                basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.i1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebSettingsHostApi.lambda$setup$3(GeneratedAndroidWebView.WebSettingsHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel4.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.setJavaScriptEnabled", getCodec());
            if (webSettingsHostApi != null) {
                basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.j1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebSettingsHostApi.lambda$setup$4(GeneratedAndroidWebView.WebSettingsHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel5.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.setUserAgentString", getCodec());
            if (webSettingsHostApi != null) {
                basicMessageChannel6.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.w0
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebSettingsHostApi.lambda$setup$5(GeneratedAndroidWebView.WebSettingsHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel6.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.setMediaPlaybackRequiresUserGesture", getCodec());
            if (webSettingsHostApi != null) {
                basicMessageChannel7.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.x0
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebSettingsHostApi.lambda$setup$6(GeneratedAndroidWebView.WebSettingsHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel7.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel8 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.setSupportZoom", getCodec());
            if (webSettingsHostApi != null) {
                basicMessageChannel8.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.y0
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebSettingsHostApi.lambda$setup$7(GeneratedAndroidWebView.WebSettingsHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel8.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel9 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.setLoadWithOverviewMode", getCodec());
            if (webSettingsHostApi != null) {
                basicMessageChannel9.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.z0
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebSettingsHostApi.lambda$setup$8(GeneratedAndroidWebView.WebSettingsHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel9.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel10 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.setUseWideViewPort", getCodec());
            if (webSettingsHostApi != null) {
                basicMessageChannel10.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.a1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebSettingsHostApi.lambda$setup$9(GeneratedAndroidWebView.WebSettingsHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel10.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel11 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.setDisplayZoomControls", getCodec());
            if (webSettingsHostApi != null) {
                basicMessageChannel11.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.b1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebSettingsHostApi.lambda$setup$10(GeneratedAndroidWebView.WebSettingsHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel11.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel12 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.setBuiltInZoomControls", getCodec());
            if (webSettingsHostApi != null) {
                basicMessageChannel12.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.c1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebSettingsHostApi.lambda$setup$11(GeneratedAndroidWebView.WebSettingsHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel12.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel13 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.setAllowFileAccess", getCodec());
            if (webSettingsHostApi != null) {
                basicMessageChannel13.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.d1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebSettingsHostApi.lambda$setup$12(GeneratedAndroidWebView.WebSettingsHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel13.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel14 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.setTextZoom", getCodec());
            if (webSettingsHostApi != null) {
                basicMessageChannel14.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.e1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebSettingsHostApi.lambda$setup$13(GeneratedAndroidWebView.WebSettingsHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel14.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel15 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.getUserAgentString", getCodec());
            if (webSettingsHostApi != null) {
                basicMessageChannel15.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.f1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebSettingsHostApi.lambda$setup$14(GeneratedAndroidWebView.WebSettingsHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel15.setMessageHandler(null);
            }
        }

        void create(Long l10, Long l11);

        String getUserAgentString(Long l10);

        void setAllowFileAccess(Long l10, Boolean bool);

        void setBuiltInZoomControls(Long l10, Boolean bool);

        void setDisplayZoomControls(Long l10, Boolean bool);

        void setDomStorageEnabled(Long l10, Boolean bool);

        void setJavaScriptCanOpenWindowsAutomatically(Long l10, Boolean bool);

        void setJavaScriptEnabled(Long l10, Boolean bool);

        void setLoadWithOverviewMode(Long l10, Boolean bool);

        void setMediaPlaybackRequiresUserGesture(Long l10, Boolean bool);

        void setSupportMultipleWindows(Long l10, Boolean bool);

        void setSupportZoom(Long l10, Boolean bool);

        void setTextZoom(Long l10, Long l11);

        void setUseWideViewPort(Long l10, Boolean bool);

        void setUserAgentString(Long l10, String str);
    }

    /* loaded from: classes3.dex */
    public interface WebStorageHostApi {
        static MessageCodec<Object> getCodec() {
            return new StandardMessageCodec();
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$0(WebStorageHostApi webStorageHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long valueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webStorageHostApi.create(valueOf);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$1(WebStorageHostApi webStorageHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long valueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webStorageHostApi.deleteAllData(valueOf);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        static void setup(BinaryMessenger binaryMessenger, final WebStorageHostApi webStorageHostApi) {
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebStorageHostApi.create", getCodec());
            if (webStorageHostApi != null) {
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.k1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebStorageHostApi.lambda$setup$0(GeneratedAndroidWebView.WebStorageHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebStorageHostApi.deleteAllData", getCodec());
            if (webStorageHostApi != null) {
                basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.l1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebStorageHostApi.lambda$setup$1(GeneratedAndroidWebView.WebStorageHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
        }

        void create(Long l10);

        void deleteAllData(Long l10);
    }

    /* loaded from: classes3.dex */
    public static class WebViewClientFlutterApi {
        private final BinaryMessenger binaryMessenger;

        /* loaded from: classes3.dex */
        public interface Reply<T> {
            void reply(T t10);
        }

        public WebViewClientFlutterApi(BinaryMessenger binaryMessenger) {
            this.binaryMessenger = binaryMessenger;
        }

        static MessageCodec<Object> getCodec() {
            return WebViewClientFlutterApiCodec.INSTANCE;
        }

        public void doUpdateVisitedHistory(Long l10, Long l11, String str, Boolean bool, final Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewClientFlutterApi.doUpdateVisitedHistory", getCodec()).send(new ArrayList(Arrays.asList(l10, l11, str, bool)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.r1
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    GeneratedAndroidWebView.WebViewClientFlutterApi.Reply.this.reply(null);
                }
            });
        }

        public void onPageFinished(Long l10, Long l11, String str, final Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewClientFlutterApi.onPageFinished", getCodec()).send(new ArrayList(Arrays.asList(l10, l11, str)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.q1
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    GeneratedAndroidWebView.WebViewClientFlutterApi.Reply.this.reply(null);
                }
            });
        }

        public void onPageStarted(Long l10, Long l11, String str, final Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewClientFlutterApi.onPageStarted", getCodec()).send(new ArrayList(Arrays.asList(l10, l11, str)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.o1
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    GeneratedAndroidWebView.WebViewClientFlutterApi.Reply.this.reply(null);
                }
            });
        }

        public void onReceivedError(Long l10, Long l11, Long l12, String str, String str2, final Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewClientFlutterApi.onReceivedError", getCodec()).send(new ArrayList(Arrays.asList(l10, l11, l12, str, str2)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.s1
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    GeneratedAndroidWebView.WebViewClientFlutterApi.Reply.this.reply(null);
                }
            });
        }

        public void onReceivedHttpAuthRequest(Long l10, Long l11, Long l12, String str, String str2, final Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewClientFlutterApi.onReceivedHttpAuthRequest", getCodec()).send(new ArrayList(Arrays.asList(l10, l11, l12, str, str2)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.t1
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    GeneratedAndroidWebView.WebViewClientFlutterApi.Reply.this.reply(null);
                }
            });
        }

        public void onReceivedRequestError(Long l10, Long l11, WebResourceRequestData webResourceRequestData, WebResourceErrorData webResourceErrorData, final Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewClientFlutterApi.onReceivedRequestError", getCodec()).send(new ArrayList(Arrays.asList(l10, l11, webResourceRequestData, webResourceErrorData)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.m1
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    GeneratedAndroidWebView.WebViewClientFlutterApi.Reply.this.reply(null);
                }
            });
        }

        public void requestLoading(Long l10, Long l11, WebResourceRequestData webResourceRequestData, final Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewClientFlutterApi.requestLoading", getCodec()).send(new ArrayList(Arrays.asList(l10, l11, webResourceRequestData)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.n1
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    GeneratedAndroidWebView.WebViewClientFlutterApi.Reply.this.reply(null);
                }
            });
        }

        public void urlLoading(Long l10, Long l11, String str, final Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewClientFlutterApi.urlLoading", getCodec()).send(new ArrayList(Arrays.asList(l10, l11, str)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.p1
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    GeneratedAndroidWebView.WebViewClientFlutterApi.Reply.this.reply(null);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class WebViewClientFlutterApiCodec extends StandardMessageCodec {
        public static final WebViewClientFlutterApiCodec INSTANCE = new WebViewClientFlutterApiCodec();

        private WebViewClientFlutterApiCodec() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.flutter.plugin.common.StandardMessageCodec
        public Object readValueOfType(byte b10, ByteBuffer byteBuffer) {
            return b10 != Byte.MIN_VALUE ? b10 != -127 ? super.readValueOfType(b10, byteBuffer) : WebResourceRequestData.fromList((ArrayList) readValue(byteBuffer)) : WebResourceErrorData.fromList((ArrayList) readValue(byteBuffer));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.flutter.plugin.common.StandardMessageCodec
        public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            ArrayList<Object> list;
            if (obj instanceof WebResourceErrorData) {
                byteArrayOutputStream.write(RecognitionOptions.ITF);
                list = ((WebResourceErrorData) obj).toList();
            } else if (!(obj instanceof WebResourceRequestData)) {
                super.writeValue(byteArrayOutputStream, obj);
                return;
            } else {
                byteArrayOutputStream.write(129);
                list = ((WebResourceRequestData) obj).toList();
            }
            writeValue(byteArrayOutputStream, list);
        }
    }

    /* loaded from: classes3.dex */
    public interface WebViewClientHostApi {
        static MessageCodec<Object> getCodec() {
            return new StandardMessageCodec();
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$0(WebViewClientHostApi webViewClientHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long valueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webViewClientHostApi.create(valueOf);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$1(WebViewClientHostApi webViewClientHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long valueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            Boolean bool = (Boolean) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webViewClientHostApi.setSynchronousReturnValueForShouldOverrideUrlLoading(valueOf, bool);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        static void setup(BinaryMessenger binaryMessenger, final WebViewClientHostApi webViewClientHostApi) {
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewClientHostApi.create", getCodec());
            if (webViewClientHostApi != null) {
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.u1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebViewClientHostApi.lambda$setup$0(GeneratedAndroidWebView.WebViewClientHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewClientHostApi.setSynchronousReturnValueForShouldOverrideUrlLoading", getCodec());
            if (webViewClientHostApi != null) {
                basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.v1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebViewClientHostApi.lambda$setup$1(GeneratedAndroidWebView.WebViewClientHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
        }

        void create(Long l10);

        void setSynchronousReturnValueForShouldOverrideUrlLoading(Long l10, Boolean bool);
    }

    /* loaded from: classes3.dex */
    public static class WebViewFlutterApi {
        private final BinaryMessenger binaryMessenger;

        /* loaded from: classes3.dex */
        public interface Reply<T> {
            void reply(T t10);
        }

        public WebViewFlutterApi(BinaryMessenger binaryMessenger) {
            this.binaryMessenger = binaryMessenger;
        }

        static MessageCodec<Object> getCodec() {
            return new StandardMessageCodec();
        }

        public void create(Long l10, final Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewFlutterApi.create", getCodec()).send(new ArrayList(Collections.singletonList(l10)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.x1
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    GeneratedAndroidWebView.WebViewFlutterApi.Reply.this.reply(null);
                }
            });
        }

        public void onScrollChanged(Long l10, Long l11, Long l12, Long l13, Long l14, final Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewFlutterApi.onScrollChanged", getCodec()).send(new ArrayList(Arrays.asList(l10, l11, l12, l13, l14)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.w1
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    GeneratedAndroidWebView.WebViewFlutterApi.Reply.this.reply(null);
                }
            });
        }
    }

    /* loaded from: classes3.dex */
    public interface WebViewHostApi {
        static MessageCodec<Object> getCodec() {
            return WebViewHostApiCodec.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$0(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long valueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webViewHostApi.create(valueOf);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$1(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long valueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            String str = (String) arrayList2.get(1);
            String str2 = (String) arrayList2.get(2);
            String str3 = (String) arrayList2.get(3);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webViewHostApi.loadData(valueOf, str, str2, str3);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$10(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long valueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webViewHostApi.reload(valueOf);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$11(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long valueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            Boolean bool = (Boolean) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webViewHostApi.clearCache(valueOf, bool);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$12(WebViewHostApi webViewHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            webViewHostApi.evaluateJavascript(number == null ? null : Long.valueOf(number.longValue()), (String) arrayList2.get(1), new Result<String>() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi.1
                @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.Result
                public void error(Throwable th2) {
                    reply.reply(GeneratedAndroidWebView.wrapError(th2));
                }

                @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.Result
                public void success(String str) {
                    arrayList.add(0, str);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$13(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long valueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            arrayList.add(0, webViewHostApi.getTitle(valueOf));
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$14(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long valueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            Number number2 = (Number) arrayList2.get(1);
            Number number3 = (Number) arrayList2.get(2);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webViewHostApi.scrollTo(valueOf, number2 == null ? null : Long.valueOf(number2.longValue()), number3 == null ? null : Long.valueOf(number3.longValue()));
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$15(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long valueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            Number number2 = (Number) arrayList2.get(1);
            Number number3 = (Number) arrayList2.get(2);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webViewHostApi.scrollBy(valueOf, number2 == null ? null : Long.valueOf(number2.longValue()), number3 == null ? null : Long.valueOf(number3.longValue()));
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$16(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long valueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            arrayList.add(0, webViewHostApi.getScrollX(valueOf));
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$17(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long valueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            arrayList.add(0, webViewHostApi.getScrollY(valueOf));
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$18(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long valueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            arrayList.add(0, webViewHostApi.getScrollPosition(valueOf));
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$19(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                webViewHostApi.setWebContentsDebuggingEnabled((Boolean) ((ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (Throwable th2) {
                arrayList = GeneratedAndroidWebView.wrapError(th2);
            }
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$2(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long valueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            String str = (String) arrayList2.get(1);
            String str2 = (String) arrayList2.get(2);
            String str3 = (String) arrayList2.get(3);
            String str4 = (String) arrayList2.get(4);
            String str5 = (String) arrayList2.get(5);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webViewHostApi.loadDataWithBaseUrl(valueOf, str, str2, str3, str4, str5);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$20(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long valueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            Number number2 = (Number) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webViewHostApi.setWebViewClient(valueOf, number2 == null ? null : Long.valueOf(number2.longValue()));
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$21(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long valueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            Number number2 = (Number) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webViewHostApi.addJavaScriptChannel(valueOf, number2 == null ? null : Long.valueOf(number2.longValue()));
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$22(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long valueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            Number number2 = (Number) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webViewHostApi.removeJavaScriptChannel(valueOf, number2 == null ? null : Long.valueOf(number2.longValue()));
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$23(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long valueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            Number number2 = (Number) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webViewHostApi.setDownloadListener(valueOf, number2 == null ? null : Long.valueOf(number2.longValue()));
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$24(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long valueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            Number number2 = (Number) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webViewHostApi.setWebChromeClient(valueOf, number2 == null ? null : Long.valueOf(number2.longValue()));
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$25(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long valueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            Number number2 = (Number) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webViewHostApi.setBackgroundColor(valueOf, number2 == null ? null : Long.valueOf(number2.longValue()));
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$3(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long valueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            String str = (String) arrayList2.get(1);
            Map<String, String> map = (Map) arrayList2.get(2);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webViewHostApi.loadUrl(valueOf, str, map);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$4(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long valueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            String str = (String) arrayList2.get(1);
            byte[] bArr = (byte[]) arrayList2.get(2);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webViewHostApi.postUrl(valueOf, str, bArr);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$5(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long valueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            arrayList.add(0, webViewHostApi.getUrl(valueOf));
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$6(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long valueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            arrayList.add(0, webViewHostApi.canGoBack(valueOf));
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$7(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long valueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            arrayList.add(0, webViewHostApi.canGoForward(valueOf));
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$8(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long valueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webViewHostApi.goBack(valueOf);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$9(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long valueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webViewHostApi.goForward(valueOf);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        static void setup(BinaryMessenger binaryMessenger, final WebViewHostApi webViewHostApi) {
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.create", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.y1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebViewHostApi.lambda$setup$0(GeneratedAndroidWebView.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.loadData", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.a2
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebViewHostApi.lambda$setup$1(GeneratedAndroidWebView.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.loadDataWithBaseUrl", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.h2
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebViewHostApi.lambda$setup$2(GeneratedAndroidWebView.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.loadUrl", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.i2
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebViewHostApi.lambda$setup$3(GeneratedAndroidWebView.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel4.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.postUrl", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.k2
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebViewHostApi.lambda$setup$4(GeneratedAndroidWebView.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel5.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.getUrl", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel6.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.l2
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebViewHostApi.lambda$setup$5(GeneratedAndroidWebView.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel6.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.canGoBack", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel7.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.m2
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebViewHostApi.lambda$setup$6(GeneratedAndroidWebView.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel7.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel8 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.canGoForward", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel8.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.n2
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebViewHostApi.lambda$setup$7(GeneratedAndroidWebView.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel8.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel9 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.goBack", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel9.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.o2
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebViewHostApi.lambda$setup$8(GeneratedAndroidWebView.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel9.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel10 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.goForward", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel10.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.p2
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebViewHostApi.lambda$setup$9(GeneratedAndroidWebView.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel10.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel11 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.reload", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel11.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.j2
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebViewHostApi.lambda$setup$10(GeneratedAndroidWebView.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel11.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel12 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.clearCache", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel12.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.q2
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebViewHostApi.lambda$setup$11(GeneratedAndroidWebView.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel12.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel13 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.evaluateJavascript", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel13.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.r2
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebViewHostApi.lambda$setup$12(GeneratedAndroidWebView.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel13.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel14 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.getTitle", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel14.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.s2
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebViewHostApi.lambda$setup$13(GeneratedAndroidWebView.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel14.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel15 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.scrollTo", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel15.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.t2
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebViewHostApi.lambda$setup$14(GeneratedAndroidWebView.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel15.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel16 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.scrollBy", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel16.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.u2
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebViewHostApi.lambda$setup$15(GeneratedAndroidWebView.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel16.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel17 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.getScrollX", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel17.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.v2
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebViewHostApi.lambda$setup$16(GeneratedAndroidWebView.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel17.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel18 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.getScrollY", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel18.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.w2
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebViewHostApi.lambda$setup$17(GeneratedAndroidWebView.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel18.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel19 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.getScrollPosition", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel19.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.x2
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebViewHostApi.lambda$setup$18(GeneratedAndroidWebView.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel19.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel20 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.setWebContentsDebuggingEnabled", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel20.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.z1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebViewHostApi.lambda$setup$19(GeneratedAndroidWebView.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel20.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel21 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.setWebViewClient", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel21.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.b2
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebViewHostApi.lambda$setup$20(GeneratedAndroidWebView.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel21.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel22 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.addJavaScriptChannel", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel22.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.c2
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebViewHostApi.lambda$setup$21(GeneratedAndroidWebView.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel22.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel23 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.removeJavaScriptChannel", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel23.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.d2
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebViewHostApi.lambda$setup$22(GeneratedAndroidWebView.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel23.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel24 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.setDownloadListener", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel24.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.e2
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebViewHostApi.lambda$setup$23(GeneratedAndroidWebView.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel24.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel25 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.setWebChromeClient", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel25.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.f2
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebViewHostApi.lambda$setup$24(GeneratedAndroidWebView.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel25.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel26 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.setBackgroundColor", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel26.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.g2
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebViewHostApi.lambda$setup$25(GeneratedAndroidWebView.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel26.setMessageHandler(null);
            }
        }

        void addJavaScriptChannel(Long l10, Long l11);

        Boolean canGoBack(Long l10);

        Boolean canGoForward(Long l10);

        void clearCache(Long l10, Boolean bool);

        void create(Long l10);

        void evaluateJavascript(Long l10, String str, Result<String> result);

        WebViewPoint getScrollPosition(Long l10);

        Long getScrollX(Long l10);

        Long getScrollY(Long l10);

        String getTitle(Long l10);

        String getUrl(Long l10);

        void goBack(Long l10);

        void goForward(Long l10);

        void loadData(Long l10, String str, String str2, String str3);

        void loadDataWithBaseUrl(Long l10, String str, String str2, String str3, String str4, String str5);

        void loadUrl(Long l10, String str, Map<String, String> map);

        void postUrl(Long l10, String str, byte[] bArr);

        void reload(Long l10);

        void removeJavaScriptChannel(Long l10, Long l11);

        void scrollBy(Long l10, Long l11, Long l12);

        void scrollTo(Long l10, Long l11, Long l12);

        void setBackgroundColor(Long l10, Long l11);

        void setDownloadListener(Long l10, Long l11);

        void setWebChromeClient(Long l10, Long l11);

        void setWebContentsDebuggingEnabled(Boolean bool);

        void setWebViewClient(Long l10, Long l11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class WebViewHostApiCodec extends StandardMessageCodec {
        public static final WebViewHostApiCodec INSTANCE = new WebViewHostApiCodec();

        private WebViewHostApiCodec() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.flutter.plugin.common.StandardMessageCodec
        public Object readValueOfType(byte b10, ByteBuffer byteBuffer) {
            return b10 != Byte.MIN_VALUE ? super.readValueOfType(b10, byteBuffer) : WebViewPoint.fromList((ArrayList) readValue(byteBuffer));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.flutter.plugin.common.StandardMessageCodec
        public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (!(obj instanceof WebViewPoint)) {
                super.writeValue(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(RecognitionOptions.ITF);
                writeValue(byteArrayOutputStream, ((WebViewPoint) obj).toList());
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class WebViewPoint {

        /* renamed from: x, reason: collision with root package name */
        private Long f18388x;

        /* renamed from: y, reason: collision with root package name */
        private Long f18389y;

        /* loaded from: classes3.dex */
        public static final class Builder {

            /* renamed from: x, reason: collision with root package name */
            private Long f18390x;

            /* renamed from: y, reason: collision with root package name */
            private Long f18391y;

            public WebViewPoint build() {
                WebViewPoint webViewPoint = new WebViewPoint();
                webViewPoint.setX(this.f18390x);
                webViewPoint.setY(this.f18391y);
                return webViewPoint;
            }

            public Builder setX(Long l10) {
                this.f18390x = l10;
                return this;
            }

            public Builder setY(Long l10) {
                this.f18391y = l10;
                return this;
            }
        }

        WebViewPoint() {
        }

        static WebViewPoint fromList(ArrayList<Object> arrayList) {
            Long valueOf;
            WebViewPoint webViewPoint = new WebViewPoint();
            Object obj = arrayList.get(0);
            Long l10 = null;
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            webViewPoint.setX(valueOf);
            Object obj2 = arrayList.get(1);
            if (obj2 != null) {
                l10 = Long.valueOf(obj2 instanceof Integer ? ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            webViewPoint.setY(l10);
            return webViewPoint;
        }

        public Long getX() {
            return this.f18388x;
        }

        public Long getY() {
            return this.f18389y;
        }

        public void setX(Long l10) {
            if (l10 == null) {
                throw new IllegalStateException("Nonnull field \"x\" is null.");
            }
            this.f18388x = l10;
        }

        public void setY(Long l10) {
            if (l10 == null) {
                throw new IllegalStateException("Nonnull field \"y\" is null.");
            }
            this.f18389y = l10;
        }

        ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.f18388x);
            arrayList.add(this.f18389y);
            return arrayList;
        }
    }

    protected static ArrayList<Object> wrapError(Throwable th2) {
        Object obj;
        ArrayList<Object> arrayList = new ArrayList<>(3);
        if (th2 instanceof FlutterError) {
            FlutterError flutterError = (FlutterError) th2;
            arrayList.add(flutterError.code);
            arrayList.add(flutterError.getMessage());
            obj = flutterError.details;
        } else {
            arrayList.add(th2.toString());
            arrayList.add(th2.getClass().getSimpleName());
            obj = "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2);
        }
        arrayList.add(obj);
        return arrayList;
    }
}
