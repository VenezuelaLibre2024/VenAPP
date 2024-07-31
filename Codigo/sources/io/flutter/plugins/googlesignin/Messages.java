package io.flutter.plugins.googlesignin;

import android.util.Log;
import com.google.android.libraries.barhopper.RecognitionOptions;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugins.googlesignin.Messages;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class Messages {

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
    public interface GoogleSignInApi {
        static MessageCodec<Object> getCodec() {
            return GoogleSignInApiCodec.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$0(GoogleSignInApi googleSignInApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                googleSignInApi.init((InitParams) ((ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (Throwable th2) {
                arrayList = Messages.wrapError(th2);
            }
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$1(GoogleSignInApi googleSignInApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            googleSignInApi.signInSilently(new Result<UserData>() { // from class: io.flutter.plugins.googlesignin.Messages.GoogleSignInApi.1
                @Override // io.flutter.plugins.googlesignin.Messages.Result
                public void error(Throwable th2) {
                    reply.reply(Messages.wrapError(th2));
                }

                @Override // io.flutter.plugins.googlesignin.Messages.Result
                public void success(UserData userData) {
                    arrayList.add(0, userData);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$2(GoogleSignInApi googleSignInApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            googleSignInApi.signIn(new Result<UserData>() { // from class: io.flutter.plugins.googlesignin.Messages.GoogleSignInApi.2
                @Override // io.flutter.plugins.googlesignin.Messages.Result
                public void error(Throwable th2) {
                    reply.reply(Messages.wrapError(th2));
                }

                @Override // io.flutter.plugins.googlesignin.Messages.Result
                public void success(UserData userData) {
                    arrayList.add(0, userData);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$3(GoogleSignInApi googleSignInApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            googleSignInApi.getAccessToken((String) arrayList2.get(0), (Boolean) arrayList2.get(1), new Result<String>() { // from class: io.flutter.plugins.googlesignin.Messages.GoogleSignInApi.3
                @Override // io.flutter.plugins.googlesignin.Messages.Result
                public void error(Throwable th2) {
                    reply.reply(Messages.wrapError(th2));
                }

                @Override // io.flutter.plugins.googlesignin.Messages.Result
                public void success(String str) {
                    arrayList.add(0, str);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$4(GoogleSignInApi googleSignInApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            googleSignInApi.signOut(new Result<Void>() { // from class: io.flutter.plugins.googlesignin.Messages.GoogleSignInApi.4
                @Override // io.flutter.plugins.googlesignin.Messages.Result
                public void error(Throwable th2) {
                    reply.reply(Messages.wrapError(th2));
                }

                @Override // io.flutter.plugins.googlesignin.Messages.Result
                public void success(Void r32) {
                    arrayList.add(0, null);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$5(GoogleSignInApi googleSignInApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            googleSignInApi.disconnect(new Result<Void>() { // from class: io.flutter.plugins.googlesignin.Messages.GoogleSignInApi.5
                @Override // io.flutter.plugins.googlesignin.Messages.Result
                public void error(Throwable th2) {
                    reply.reply(Messages.wrapError(th2));
                }

                @Override // io.flutter.plugins.googlesignin.Messages.Result
                public void success(Void r32) {
                    arrayList.add(0, null);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$6(GoogleSignInApi googleSignInApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, googleSignInApi.isSignedIn());
            } catch (Throwable th2) {
                arrayList = Messages.wrapError(th2);
            }
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$7(GoogleSignInApi googleSignInApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            googleSignInApi.clearAuthCache((String) ((ArrayList) obj).get(0), new Result<Void>() { // from class: io.flutter.plugins.googlesignin.Messages.GoogleSignInApi.6
                @Override // io.flutter.plugins.googlesignin.Messages.Result
                public void error(Throwable th2) {
                    reply.reply(Messages.wrapError(th2));
                }

                @Override // io.flutter.plugins.googlesignin.Messages.Result
                public void success(Void r32) {
                    arrayList.add(0, null);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$8(GoogleSignInApi googleSignInApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            googleSignInApi.requestScopes((List) ((ArrayList) obj).get(0), new Result<Boolean>() { // from class: io.flutter.plugins.googlesignin.Messages.GoogleSignInApi.7
                @Override // io.flutter.plugins.googlesignin.Messages.Result
                public void error(Throwable th2) {
                    reply.reply(Messages.wrapError(th2));
                }

                @Override // io.flutter.plugins.googlesignin.Messages.Result
                public void success(Boolean bool) {
                    arrayList.add(0, bool);
                    reply.reply(arrayList);
                }
            });
        }

        static void setup(BinaryMessenger binaryMessenger, final GoogleSignInApi googleSignInApi) {
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.GoogleSignInApi.init", getCodec());
            if (googleSignInApi != null) {
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.googlesignin.j
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.GoogleSignInApi.lambda$setup$0(Messages.GoogleSignInApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.GoogleSignInApi.signInSilently", getCodec());
            if (googleSignInApi != null) {
                basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.googlesignin.k
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.GoogleSignInApi.lambda$setup$1(Messages.GoogleSignInApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.GoogleSignInApi.signIn", getCodec());
            if (googleSignInApi != null) {
                basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.googlesignin.l
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.GoogleSignInApi.lambda$setup$2(Messages.GoogleSignInApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.GoogleSignInApi.getAccessToken", getCodec());
            if (googleSignInApi != null) {
                basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.googlesignin.m
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.GoogleSignInApi.lambda$setup$3(Messages.GoogleSignInApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel4.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.GoogleSignInApi.signOut", getCodec());
            if (googleSignInApi != null) {
                basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.googlesignin.n
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.GoogleSignInApi.lambda$setup$4(Messages.GoogleSignInApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel5.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.GoogleSignInApi.disconnect", getCodec());
            if (googleSignInApi != null) {
                basicMessageChannel6.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.googlesignin.o
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.GoogleSignInApi.lambda$setup$5(Messages.GoogleSignInApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel6.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.GoogleSignInApi.isSignedIn", getCodec());
            if (googleSignInApi != null) {
                basicMessageChannel7.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.googlesignin.p
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.GoogleSignInApi.lambda$setup$6(Messages.GoogleSignInApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel7.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel8 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.GoogleSignInApi.clearAuthCache", getCodec());
            if (googleSignInApi != null) {
                basicMessageChannel8.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.googlesignin.q
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.GoogleSignInApi.lambda$setup$7(Messages.GoogleSignInApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel8.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel9 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.GoogleSignInApi.requestScopes", getCodec());
            if (googleSignInApi != null) {
                basicMessageChannel9.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.googlesignin.s
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.GoogleSignInApi.lambda$setup$8(Messages.GoogleSignInApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel9.setMessageHandler(null);
            }
        }

        void clearAuthCache(String str, Result<Void> result);

        void disconnect(Result<Void> result);

        void getAccessToken(String str, Boolean bool, Result<String> result);

        void init(InitParams initParams);

        Boolean isSignedIn();

        void requestScopes(List<String> list, Result<Boolean> result);

        void signIn(Result<UserData> result);

        void signInSilently(Result<UserData> result);

        void signOut(Result<Void> result);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class GoogleSignInApiCodec extends StandardMessageCodec {
        public static final GoogleSignInApiCodec INSTANCE = new GoogleSignInApiCodec();

        private GoogleSignInApiCodec() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.flutter.plugin.common.StandardMessageCodec
        public Object readValueOfType(byte b10, ByteBuffer byteBuffer) {
            return b10 != Byte.MIN_VALUE ? b10 != -127 ? super.readValueOfType(b10, byteBuffer) : UserData.fromList((ArrayList) readValue(byteBuffer)) : InitParams.fromList((ArrayList) readValue(byteBuffer));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.flutter.plugin.common.StandardMessageCodec
        public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            ArrayList<Object> list;
            if (obj instanceof InitParams) {
                byteArrayOutputStream.write(RecognitionOptions.ITF);
                list = ((InitParams) obj).toList();
            } else if (!(obj instanceof UserData)) {
                super.writeValue(byteArrayOutputStream, obj);
                return;
            } else {
                byteArrayOutputStream.write(129);
                list = ((UserData) obj).toList();
            }
            writeValue(byteArrayOutputStream, list);
        }
    }

    /* loaded from: classes3.dex */
    public static final class InitParams {
        private String clientId;
        private Boolean forceCodeForRefreshToken;
        private String hostedDomain;
        private List<String> scopes;
        private String serverClientId;
        private SignInType signInType;

        /* loaded from: classes3.dex */
        public static final class Builder {
            private String clientId;
            private Boolean forceCodeForRefreshToken;
            private String hostedDomain;
            private List<String> scopes;
            private String serverClientId;
            private SignInType signInType;

            public InitParams build() {
                InitParams initParams = new InitParams();
                initParams.setScopes(this.scopes);
                initParams.setSignInType(this.signInType);
                initParams.setHostedDomain(this.hostedDomain);
                initParams.setClientId(this.clientId);
                initParams.setServerClientId(this.serverClientId);
                initParams.setForceCodeForRefreshToken(this.forceCodeForRefreshToken);
                return initParams;
            }

            public Builder setClientId(String str) {
                this.clientId = str;
                return this;
            }

            public Builder setForceCodeForRefreshToken(Boolean bool) {
                this.forceCodeForRefreshToken = bool;
                return this;
            }

            public Builder setHostedDomain(String str) {
                this.hostedDomain = str;
                return this;
            }

            public Builder setScopes(List<String> list) {
                this.scopes = list;
                return this;
            }

            public Builder setServerClientId(String str) {
                this.serverClientId = str;
                return this;
            }

            public Builder setSignInType(SignInType signInType) {
                this.signInType = signInType;
                return this;
            }
        }

        InitParams() {
        }

        static InitParams fromList(ArrayList<Object> arrayList) {
            InitParams initParams = new InitParams();
            initParams.setScopes((List) arrayList.get(0));
            Object obj = arrayList.get(1);
            initParams.setSignInType(obj == null ? null : SignInType.values()[((Integer) obj).intValue()]);
            initParams.setHostedDomain((String) arrayList.get(2));
            initParams.setClientId((String) arrayList.get(3));
            initParams.setServerClientId((String) arrayList.get(4));
            initParams.setForceCodeForRefreshToken((Boolean) arrayList.get(5));
            return initParams;
        }

        public String getClientId() {
            return this.clientId;
        }

        public Boolean getForceCodeForRefreshToken() {
            return this.forceCodeForRefreshToken;
        }

        public String getHostedDomain() {
            return this.hostedDomain;
        }

        public List<String> getScopes() {
            return this.scopes;
        }

        public String getServerClientId() {
            return this.serverClientId;
        }

        public SignInType getSignInType() {
            return this.signInType;
        }

        public void setClientId(String str) {
            this.clientId = str;
        }

        public void setForceCodeForRefreshToken(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"forceCodeForRefreshToken\" is null.");
            }
            this.forceCodeForRefreshToken = bool;
        }

        public void setHostedDomain(String str) {
            this.hostedDomain = str;
        }

        public void setScopes(List<String> list) {
            if (list == null) {
                throw new IllegalStateException("Nonnull field \"scopes\" is null.");
            }
            this.scopes = list;
        }

        public void setServerClientId(String str) {
            this.serverClientId = str;
        }

        public void setSignInType(SignInType signInType) {
            if (signInType == null) {
                throw new IllegalStateException("Nonnull field \"signInType\" is null.");
            }
            this.signInType = signInType;
        }

        ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(6);
            arrayList.add(this.scopes);
            SignInType signInType = this.signInType;
            arrayList.add(signInType == null ? null : Integer.valueOf(signInType.index));
            arrayList.add(this.hostedDomain);
            arrayList.add(this.clientId);
            arrayList.add(this.serverClientId);
            arrayList.add(this.forceCodeForRefreshToken);
            return arrayList;
        }
    }

    /* loaded from: classes3.dex */
    public interface Result<T> {
        void error(Throwable th2);

        void success(T t10);
    }

    /* loaded from: classes3.dex */
    public enum SignInType {
        STANDARD(0),
        GAMES(1);

        final int index;

        SignInType(int i10) {
            this.index = i10;
        }
    }

    /* loaded from: classes3.dex */
    public static final class UserData {
        private String displayName;
        private String email;

        /* renamed from: id, reason: collision with root package name */
        private String f18301id;
        private String idToken;
        private String photoUrl;
        private String serverAuthCode;

        /* loaded from: classes3.dex */
        public static final class Builder {
            private String displayName;
            private String email;

            /* renamed from: id, reason: collision with root package name */
            private String f18302id;
            private String idToken;
            private String photoUrl;
            private String serverAuthCode;

            public UserData build() {
                UserData userData = new UserData();
                userData.setDisplayName(this.displayName);
                userData.setEmail(this.email);
                userData.setId(this.f18302id);
                userData.setPhotoUrl(this.photoUrl);
                userData.setIdToken(this.idToken);
                userData.setServerAuthCode(this.serverAuthCode);
                return userData;
            }

            public Builder setDisplayName(String str) {
                this.displayName = str;
                return this;
            }

            public Builder setEmail(String str) {
                this.email = str;
                return this;
            }

            public Builder setId(String str) {
                this.f18302id = str;
                return this;
            }

            public Builder setIdToken(String str) {
                this.idToken = str;
                return this;
            }

            public Builder setPhotoUrl(String str) {
                this.photoUrl = str;
                return this;
            }

            public Builder setServerAuthCode(String str) {
                this.serverAuthCode = str;
                return this;
            }
        }

        UserData() {
        }

        static UserData fromList(ArrayList<Object> arrayList) {
            UserData userData = new UserData();
            userData.setDisplayName((String) arrayList.get(0));
            userData.setEmail((String) arrayList.get(1));
            userData.setId((String) arrayList.get(2));
            userData.setPhotoUrl((String) arrayList.get(3));
            userData.setIdToken((String) arrayList.get(4));
            userData.setServerAuthCode((String) arrayList.get(5));
            return userData;
        }

        public String getDisplayName() {
            return this.displayName;
        }

        public String getEmail() {
            return this.email;
        }

        public String getId() {
            return this.f18301id;
        }

        public String getIdToken() {
            return this.idToken;
        }

        public String getPhotoUrl() {
            return this.photoUrl;
        }

        public String getServerAuthCode() {
            return this.serverAuthCode;
        }

        public void setDisplayName(String str) {
            this.displayName = str;
        }

        public void setEmail(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"email\" is null.");
            }
            this.email = str;
        }

        public void setId(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"id\" is null.");
            }
            this.f18301id = str;
        }

        public void setIdToken(String str) {
            this.idToken = str;
        }

        public void setPhotoUrl(String str) {
            this.photoUrl = str;
        }

        public void setServerAuthCode(String str) {
            this.serverAuthCode = str;
        }

        ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(6);
            arrayList.add(this.displayName);
            arrayList.add(this.email);
            arrayList.add(this.f18301id);
            arrayList.add(this.photoUrl);
            arrayList.add(this.idToken);
            arrayList.add(this.serverAuthCode);
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
