package io.flutter.plugins.googlemobileads.usermessagingplatform;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import cb.b;
import cb.c;
import cb.d;
import cb.e;
import cb.f;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.StandardMethodCodec;

/* loaded from: classes3.dex */
public class UserMessagingPlatformManager implements MethodChannel.MethodCallHandler {
    private static final String INTERNAL_ERROR_CODE = "0";
    private static final String METHOD_CHANNEL_NAME = "plugins.flutter.io/google_mobile_ads/ump";
    private Activity activity;
    private c consentInformation;
    private final Context context;
    private final MethodChannel methodChannel;
    private final UserMessagingCodec userMessagingCodec;

    /* renamed from: io.flutter.plugins.googlemobileads.usermessagingplatform.UserMessagingPlatformManager$6, reason: invalid class name */
    /* loaded from: classes3.dex */
    static /* synthetic */ class AnonymousClass6 {
        static final /* synthetic */ int[] $SwitchMap$com$google$android$ump$ConsentInformation$PrivacyOptionsRequirementStatus;

        static {
            int[] iArr = new int[c.EnumC0119c.values().length];
            $SwitchMap$com$google$android$ump$ConsentInformation$PrivacyOptionsRequirementStatus = iArr;
            try {
                iArr[c.EnumC0119c.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$android$ump$ConsentInformation$PrivacyOptionsRequirementStatus[c.EnumC0119c.REQUIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public UserMessagingPlatformManager(BinaryMessenger binaryMessenger, Context context) {
        UserMessagingCodec userMessagingCodec = new UserMessagingCodec();
        this.userMessagingCodec = userMessagingCodec;
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, METHOD_CHANNEL_NAME, new StandardMethodCodec(userMessagingCodec));
        this.methodChannel = methodChannel;
        methodChannel.setMethodCallHandler(this);
        this.context = context;
    }

    UserMessagingPlatformManager(BinaryMessenger binaryMessenger, Context context, UserMessagingCodec userMessagingCodec) {
        this.userMessagingCodec = userMessagingCodec;
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, METHOD_CHANNEL_NAME, new StandardMethodCodec(userMessagingCodec));
        this.methodChannel = methodChannel;
        methodChannel.setMethodCallHandler(this);
        this.context = context;
    }

    private c getConsentInformation() {
        c cVar = this.consentInformation;
        if (cVar != null) {
            return cVar;
        }
        c a10 = f.a(this.context);
        this.consentInformation = a10;
        return a10;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:37:0x0098. Please report as an issue. */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, final MethodChannel.Result result) {
        String str;
        boolean isConsentFormAvailable;
        Object obj;
        String str2 = methodCall.method;
        str2.hashCode();
        char c10 = 65535;
        switch (str2.hashCode()) {
            case -2068759970:
                if (str2.equals("ConsentInformation#reset")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1987766237:
                if (str2.equals("UserMessagingPlatform#loadAndShowConsentFormIfRequired")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1310145901:
                if (str2.equals("ConsentInformation#requestConsentInfoUpdate")) {
                    c10 = 2;
                    break;
                }
                break;
            case -971145086:
                if (str2.equals("ConsentForm#show")) {
                    c10 = 3;
                    break;
                }
                break;
            case -878979462:
                if (str2.equals("ConsentForm#dispose")) {
                    c10 = 4;
                    break;
                }
                break;
            case -689237714:
                if (str2.equals("UserMessagingPlatform#showPrivacyOptionsForm")) {
                    c10 = 5;
                    break;
                }
                break;
            case -585732218:
                if (str2.equals("ConsentInformation#isConsentFormAvailable")) {
                    c10 = 6;
                    break;
                }
                break;
            case -497439839:
                if (str2.equals("UserMessagingPlatform#loadConsentForm")) {
                    c10 = 7;
                    break;
                }
                break;
            case -309829158:
                if (str2.equals("ConsentInformation#getPrivacyOptionsRequirementStatus")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 504907168:
                if (str2.equals("ConsentInformation#canRequestAds")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 665104519:
                if (str2.equals("ConsentInformation#getConsentStatus")) {
                    c10 = '\n';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                getConsentInformation().reset();
                result.success(null);
                return;
            case 1:
                Activity activity = this.activity;
                if (activity != null) {
                    f.b(activity, new b.a() { // from class: io.flutter.plugins.googlemobileads.usermessagingplatform.a
                        @Override // cb.b.a
                        public final void onConsentFormDismissed(e eVar) {
                            MethodChannel.Result.this.success(eVar);
                        }
                    });
                    return;
                } else {
                    str = "UserMessagingPlatform#loadAndShowConsentFormIfRequired called before plugin has been registered to an activity.";
                    result.error(INTERNAL_ERROR_CODE, str, null);
                    return;
                }
            case 2:
                if (this.activity == null) {
                    str = "ConsentInformation#requestConsentInfoUpdate called before plugin has been registered to an activity.";
                    result.error(INTERNAL_ERROR_CODE, str, null);
                    return;
                } else {
                    ConsentRequestParametersWrapper consentRequestParametersWrapper = (ConsentRequestParametersWrapper) methodCall.argument("params");
                    getConsentInformation().requestConsentInfoUpdate(this.activity, consentRequestParametersWrapper == null ? new d.a().a() : consentRequestParametersWrapper.getAsConsentRequestParameters(this.activity), new c.b() { // from class: io.flutter.plugins.googlemobileads.usermessagingplatform.UserMessagingPlatformManager.1
                        @Override // cb.c.b
                        public void onConsentInfoUpdateSuccess() {
                            result.success(null);
                        }
                    }, new c.a() { // from class: io.flutter.plugins.googlemobileads.usermessagingplatform.UserMessagingPlatformManager.2
                        @Override // cb.c.a
                        public void onConsentInfoUpdateFailure(e eVar) {
                            result.error(Integer.toString(eVar.a()), eVar.b(), null);
                        }
                    });
                    return;
                }
            case 3:
                cb.b bVar = (cb.b) methodCall.argument("consentForm");
                if (bVar == null) {
                    result.error(INTERNAL_ERROR_CODE, "ConsentForm#show", null);
                    return;
                } else {
                    bVar.show(this.activity, new b.a() { // from class: io.flutter.plugins.googlemobileads.usermessagingplatform.UserMessagingPlatformManager.5
                        @Override // cb.b.a
                        public void onConsentFormDismissed(e eVar) {
                            if (eVar != null) {
                                result.error(Integer.toString(eVar.a()), eVar.b(), null);
                            } else {
                                result.success(null);
                            }
                        }
                    });
                    return;
                }
            case 4:
                cb.b bVar2 = (cb.b) methodCall.argument("consentForm");
                if (bVar2 == null) {
                    Log.w(INTERNAL_ERROR_CODE, "Called dispose on ad that has been freed");
                } else {
                    this.userMessagingCodec.disposeConsentForm(bVar2);
                }
                result.success(null);
                return;
            case 5:
                Activity activity2 = this.activity;
                if (activity2 != null) {
                    f.d(activity2, new b.a() { // from class: io.flutter.plugins.googlemobileads.usermessagingplatform.b
                        @Override // cb.b.a
                        public final void onConsentFormDismissed(e eVar) {
                            MethodChannel.Result.this.success(eVar);
                        }
                    });
                    return;
                } else {
                    str = "UserMessagingPlatform#showPrivacyOptionsForm called before plugin has been registered to an activity.";
                    result.error(INTERNAL_ERROR_CODE, str, null);
                    return;
                }
            case 6:
                isConsentFormAvailable = getConsentInformation().isConsentFormAvailable();
                obj = Boolean.valueOf(isConsentFormAvailable);
                result.success(obj);
                return;
            case 7:
                f.c(this.context, new f.b() { // from class: io.flutter.plugins.googlemobileads.usermessagingplatform.UserMessagingPlatformManager.3
                    @Override // cb.f.b
                    public void onConsentFormLoadSuccess(cb.b bVar3) {
                        UserMessagingPlatformManager.this.userMessagingCodec.trackConsentForm(bVar3);
                        result.success(bVar3);
                    }
                }, new f.a() { // from class: io.flutter.plugins.googlemobileads.usermessagingplatform.UserMessagingPlatformManager.4
                    @Override // cb.f.a
                    public void onConsentFormLoadFailure(e eVar) {
                        result.error(Integer.toString(eVar.a()), eVar.b(), null);
                    }
                });
                return;
            case '\b':
                int i10 = AnonymousClass6.$SwitchMap$com$google$android$ump$ConsentInformation$PrivacyOptionsRequirementStatus[getConsentInformation().getPrivacyOptionsRequirementStatus().ordinal()];
                obj = i10 != 1 ? i10 != 2 ? 2 : 1 : 0;
                result.success(obj);
                return;
            case '\t':
                isConsentFormAvailable = getConsentInformation().canRequestAds();
                obj = Boolean.valueOf(isConsentFormAvailable);
                result.success(obj);
                return;
            case '\n':
                obj = Integer.valueOf(getConsentInformation().getConsentStatus());
                result.success(obj);
                return;
            default:
                result.notImplemented();
                return;
        }
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }
}
