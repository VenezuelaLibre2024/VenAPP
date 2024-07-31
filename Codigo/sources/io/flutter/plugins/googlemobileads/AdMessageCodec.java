package io.flutter.plugins.googlemobileads;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.util.Log;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugins.googlemobileads.FlutterAd;
import io.flutter.plugins.googlemobileads.FlutterAdManagerAdRequest;
import io.flutter.plugins.googlemobileads.FlutterAdRequest;
import io.flutter.plugins.googlemobileads.FlutterAdSize;
import io.flutter.plugins.googlemobileads.FlutterAdapterStatus;
import io.flutter.plugins.googlemobileads.FlutterRewardedAd;
import io.flutter.plugins.googlemobileads.nativetemplates.FlutterNativeTemplateFontStyle;
import io.flutter.plugins.googlemobileads.nativetemplates.FlutterNativeTemplateStyle;
import io.flutter.plugins.googlemobileads.nativetemplates.FlutterNativeTemplateTextStyle;
import io.flutter.plugins.googlemobileads.nativetemplates.FlutterNativeTemplateType;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import x8.y;

/* loaded from: classes3.dex */
class AdMessageCodec extends StandardMessageCodec {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final byte VALUE_ADAPTER_RESPONSE_INFO = -115;
    private static final byte VALUE_ADAPTER_STATUS = -120;
    private static final byte VALUE_ADMANAGER_AD_REQUEST = -122;
    private static final byte VALUE_AD_ERROR = -117;
    private static final byte VALUE_AD_REQUEST = -127;
    private static final byte VALUE_AD_SIZE = Byte.MIN_VALUE;
    private static final byte VALUE_ANCHORED_ADAPTIVE_BANNER_AD_SIZE = -114;
    private static final byte VALUE_COLOR = -103;
    private static final byte VALUE_FLUID_AD_SIZE = -126;
    private static final byte VALUE_INITIALIZATION_STATE = -121;
    private static final byte VALUE_INITIALIZATION_STATUS = -119;
    private static final byte VALUE_INLINE_ADAPTIVE_BANNER_AD_SIZE = -110;
    private static final byte VALUE_LOAD_AD_ERROR = -123;
    private static final byte VALUE_MEDIATION_EXTRAS = -102;
    private static final byte VALUE_NATIVE_AD_OPTIONS = -112;
    private static final byte VALUE_NATIVE_TEMPLATE_FONT_STYLE = -105;
    private static final byte VALUE_NATIVE_TEMPLATE_STYLE = -107;
    private static final byte VALUE_NATIVE_TEMPLATE_TEXT_STYLE = -106;
    private static final byte VALUE_NATIVE_TEMPLATE_TYPE = -104;
    private static final byte VALUE_REQUEST_CONFIGURATION_PARAMS = -108;
    private static final byte VALUE_RESPONSE_INFO = -116;
    private static final byte VALUE_REWARD_ITEM = -124;
    private static final byte VALUE_SERVER_SIDE_VERIFICATION_OPTIONS = -118;
    private static final byte VALUE_SMART_BANNER_AD_SIZE = -113;
    private static final byte VALUE_VIDEO_OPTIONS = -111;
    final FlutterAdSize.AdSizeFactory adSizeFactory;
    Context context;
    private MediationNetworkExtrasProvider mediationNetworkExtrasProvider;
    private final FlutterRequestAgentProvider requestAgentProvider;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.flutter.plugins.googlemobileads.AdMessageCodec$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$flutter$plugins$googlemobileads$FlutterAdapterStatus$AdapterInitializationState;

        static {
            int[] iArr = new int[FlutterAdapterStatus.AdapterInitializationState.values().length];
            $SwitchMap$io$flutter$plugins$googlemobileads$FlutterAdapterStatus$AdapterInitializationState = iArr;
            try {
                iArr[FlutterAdapterStatus.AdapterInitializationState.NOT_READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$flutter$plugins$googlemobileads$FlutterAdapterStatus$AdapterInitializationState[FlutterAdapterStatus.AdapterInitializationState.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    AdMessageCodec(Context context, FlutterAdSize.AdSizeFactory adSizeFactory, FlutterRequestAgentProvider flutterRequestAgentProvider) {
        this.context = context;
        this.adSizeFactory = adSizeFactory;
        this.requestAgentProvider = flutterRequestAgentProvider;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AdMessageCodec(Context context, FlutterRequestAgentProvider flutterRequestAgentProvider) {
        this.context = context;
        this.adSizeFactory = new FlutterAdSize.AdSizeFactory();
        this.requestAgentProvider = flutterRequestAgentProvider;
    }

    private static Boolean booleanValueOf(Object obj) {
        if (obj == null) {
            return null;
        }
        return (Boolean) obj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.flutter.plugin.common.StandardMessageCodec
    public Object readValueOfType(byte b10, ByteBuffer byteBuffer) {
        StringBuilder sb2;
        String str;
        switch (b10) {
            case Byte.MIN_VALUE:
                return new FlutterAdSize(((Integer) readValueOfType(byteBuffer.get(), byteBuffer)).intValue(), ((Integer) readValueOfType(byteBuffer.get(), byteBuffer)).intValue());
            case -127:
                return new FlutterAdRequest.Builder().setKeywords((List) readValueOfType(byteBuffer.get(), byteBuffer)).setContentUrl((String) readValueOfType(byteBuffer.get(), byteBuffer)).setNonPersonalizedAds(booleanValueOf(readValueOfType(byteBuffer.get(), byteBuffer))).setNeighboringContentUrls((List) readValueOfType(byteBuffer.get(), byteBuffer)).setHttpTimeoutMillis((Integer) readValueOfType(byteBuffer.get(), byteBuffer)).setMediationNetworkExtrasIdentifier((String) readValueOfType(byteBuffer.get(), byteBuffer)).setMediationNetworkExtrasProvider(this.mediationNetworkExtrasProvider).setAdMobExtras((Map) readValueOfType(byteBuffer.get(), byteBuffer)).setRequestAgent(this.requestAgentProvider.getRequestAgent()).setMediationExtras((List) readValueOfType(byteBuffer.get(), byteBuffer)).build();
            case -126:
                return new FlutterAdSize.FluidAdSize();
            case -125:
            case -109:
            default:
                return super.readValueOfType(b10, byteBuffer);
            case -124:
                return new FlutterRewardedAd.FlutterRewardItem((Integer) readValueOfType(byteBuffer.get(), byteBuffer), (String) readValueOfType(byteBuffer.get(), byteBuffer));
            case -123:
                return new FlutterAd.FlutterLoadAdError(((Integer) readValueOfType(byteBuffer.get(), byteBuffer)).intValue(), (String) readValueOfType(byteBuffer.get(), byteBuffer), (String) readValueOfType(byteBuffer.get(), byteBuffer), (FlutterAd.FlutterResponseInfo) readValueOfType(byteBuffer.get(), byteBuffer));
            case -122:
                FlutterAdManagerAdRequest.Builder builder = new FlutterAdManagerAdRequest.Builder();
                builder.setKeywords((List) readValueOfType(byteBuffer.get(), byteBuffer));
                builder.setContentUrl((String) readValueOfType(byteBuffer.get(), byteBuffer));
                builder.setCustomTargeting((Map) readValueOfType(byteBuffer.get(), byteBuffer));
                builder.setCustomTargetingLists((Map) readValueOfType(byteBuffer.get(), byteBuffer));
                builder.setNonPersonalizedAds((Boolean) readValueOfType(byteBuffer.get(), byteBuffer));
                builder.setNeighboringContentUrls((List) readValueOfType(byteBuffer.get(), byteBuffer));
                builder.setHttpTimeoutMillis((Integer) readValueOfType(byteBuffer.get(), byteBuffer));
                builder.setPublisherProvidedId((String) readValueOfType(byteBuffer.get(), byteBuffer));
                builder.setMediationNetworkExtrasIdentifier((String) readValueOfType(byteBuffer.get(), byteBuffer));
                builder.setMediationNetworkExtrasProvider(this.mediationNetworkExtrasProvider);
                builder.setAdMobExtras((Map) readValueOfType(byteBuffer.get(), byteBuffer));
                builder.setRequestAgent(this.requestAgentProvider.getRequestAgent());
                builder.setMediationExtras((List) readValueOfType(byteBuffer.get(), byteBuffer));
                return builder.build();
            case -121:
                String str2 = (String) readValueOfType(byteBuffer.get(), byteBuffer);
                str2.hashCode();
                if (str2.equals("ready")) {
                    return FlutterAdapterStatus.AdapterInitializationState.READY;
                }
                if (str2.equals("notReady")) {
                    return FlutterAdapterStatus.AdapterInitializationState.NOT_READY;
                }
                throw new IllegalArgumentException(String.format("Unable to handle state: %s", str2));
            case -120:
                return new FlutterAdapterStatus((FlutterAdapterStatus.AdapterInitializationState) readValueOfType(byteBuffer.get(), byteBuffer), (String) readValueOfType(byteBuffer.get(), byteBuffer), (Number) readValueOfType(byteBuffer.get(), byteBuffer));
            case -119:
                return new FlutterInitializationStatus((Map<String, FlutterAdapterStatus>) readValueOfType(byteBuffer.get(), byteBuffer));
            case -118:
                return new FlutterServerSideVerificationOptions((String) readValueOfType(byteBuffer.get(), byteBuffer), (String) readValueOfType(byteBuffer.get(), byteBuffer));
            case -117:
                return new FlutterAd.FlutterAdError(((Integer) readValueOfType(byteBuffer.get(), byteBuffer)).intValue(), (String) readValueOfType(byteBuffer.get(), byteBuffer), (String) readValueOfType(byteBuffer.get(), byteBuffer));
            case -116:
                return new FlutterAd.FlutterResponseInfo((String) readValueOfType(byteBuffer.get(), byteBuffer), (String) readValueOfType(byteBuffer.get(), byteBuffer), (List) readValueOfType(byteBuffer.get(), byteBuffer), (FlutterAd.FlutterAdapterResponseInfo) readValueOfType(byteBuffer.get(), byteBuffer), (Map) readValueOfType(byteBuffer.get(), byteBuffer));
            case -115:
                return new FlutterAd.FlutterAdapterResponseInfo((String) readValueOfType(byteBuffer.get(), byteBuffer), ((Long) readValueOfType(byteBuffer.get(), byteBuffer)).longValue(), (String) readValueOfType(byteBuffer.get(), byteBuffer), (Map) readValueOfType(byteBuffer.get(), byteBuffer), (FlutterAd.FlutterAdError) readValueOfType(byteBuffer.get(), byteBuffer), (String) readValueOfType(byteBuffer.get(), byteBuffer), (String) readValueOfType(byteBuffer.get(), byteBuffer), (String) readValueOfType(byteBuffer.get(), byteBuffer), (String) readValueOfType(byteBuffer.get(), byteBuffer));
            case -114:
                return new FlutterAdSize.AnchoredAdaptiveBannerAdSize(this.context, this.adSizeFactory, (String) readValueOfType(byteBuffer.get(), byteBuffer), ((Integer) readValueOfType(byteBuffer.get(), byteBuffer)).intValue());
            case -113:
                return new FlutterAdSize.SmartBannerAdSize();
            case -112:
                return new FlutterNativeAdOptions((Integer) readValueOfType(byteBuffer.get(), byteBuffer), (Integer) readValueOfType(byteBuffer.get(), byteBuffer), (FlutterVideoOptions) readValueOfType(byteBuffer.get(), byteBuffer), (Boolean) readValueOfType(byteBuffer.get(), byteBuffer), (Boolean) readValueOfType(byteBuffer.get(), byteBuffer), (Boolean) readValueOfType(byteBuffer.get(), byteBuffer));
            case -111:
                return new FlutterVideoOptions((Boolean) readValueOfType(byteBuffer.get(), byteBuffer), (Boolean) readValueOfType(byteBuffer.get(), byteBuffer), (Boolean) readValueOfType(byteBuffer.get(), byteBuffer));
            case -110:
                Integer num = (Integer) readValueOfType(byteBuffer.get(), byteBuffer);
                return new FlutterAdSize.InlineAdaptiveBannerAdSize(this.adSizeFactory, this.context, num.intValue(), (Integer) readValueOfType(byteBuffer.get(), byteBuffer), (Integer) readValueOfType(byteBuffer.get(), byteBuffer));
            case -108:
                y.a aVar = new y.a();
                aVar.b((String) readValueOfType(byteBuffer.get(), byteBuffer));
                aVar.c(((Integer) readValueOfType(byteBuffer.get(), byteBuffer)).intValue());
                aVar.d(((Integer) readValueOfType(byteBuffer.get(), byteBuffer)).intValue());
                aVar.e((List) readValueOfType(byteBuffer.get(), byteBuffer));
                return aVar.a();
            case -107:
                return new FlutterNativeTemplateStyle((FlutterNativeTemplateType) readValueOfType(byteBuffer.get(), byteBuffer), (ColorDrawable) readValueOfType(byteBuffer.get(), byteBuffer), (FlutterNativeTemplateTextStyle) readValueOfType(byteBuffer.get(), byteBuffer), (FlutterNativeTemplateTextStyle) readValueOfType(byteBuffer.get(), byteBuffer), (FlutterNativeTemplateTextStyle) readValueOfType(byteBuffer.get(), byteBuffer), (FlutterNativeTemplateTextStyle) readValueOfType(byteBuffer.get(), byteBuffer));
            case -106:
                return new FlutterNativeTemplateTextStyle((ColorDrawable) readValueOfType(byteBuffer.get(), byteBuffer), (ColorDrawable) readValueOfType(byteBuffer.get(), byteBuffer), (FlutterNativeTemplateFontStyle) readValueOfType(byteBuffer.get(), byteBuffer), (Double) readValueOfType(byteBuffer.get(), byteBuffer));
            case -105:
                return FlutterNativeTemplateFontStyle.fromIntValue(((Integer) readValueOfType(byteBuffer.get(), byteBuffer)).intValue());
            case -104:
                return FlutterNativeTemplateType.fromIntValue(((Integer) readValueOfType(byteBuffer.get(), byteBuffer)).intValue());
            case -103:
                return new ColorDrawable(Color.argb(((Integer) readValueOfType(byteBuffer.get(), byteBuffer)).intValue(), ((Integer) readValueOfType(byteBuffer.get(), byteBuffer)).intValue(), ((Integer) readValueOfType(byteBuffer.get(), byteBuffer)).intValue(), ((Integer) readValueOfType(byteBuffer.get(), byteBuffer)).intValue()));
            case -102:
                String str3 = (String) readValueOfType(byteBuffer.get(), byteBuffer);
                Map<String, Object> map = (Map) readValueOfType(byteBuffer.get(), byteBuffer);
                try {
                    FlutterMediationExtras flutterMediationExtras = (FlutterMediationExtras) Class.forName(str3).newInstance();
                    flutterMediationExtras.setMediationExtras(map);
                    return flutterMediationExtras;
                } catch (ClassNotFoundException unused) {
                    sb2 = new StringBuilder();
                    str = "Class not found: ";
                    sb2.append(str);
                    sb2.append(str3);
                    Log.e("FlutterMediationExtras", sb2.toString());
                    return null;
                } catch (IllegalAccessException unused2) {
                    sb2 = new StringBuilder();
                    str = "Illegal Access to ";
                    sb2.append(str);
                    sb2.append(str3);
                    Log.e("FlutterMediationExtras", sb2.toString());
                    return null;
                } catch (InstantiationException unused3) {
                    sb2 = new StringBuilder();
                    str = "Unable to instantiate class ";
                    sb2.append(str);
                    sb2.append(str3);
                    Log.e("FlutterMediationExtras", sb2.toString());
                    return null;
                }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setContext(Context context) {
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setMediationNetworkExtrasProvider(MediationNetworkExtrasProvider mediationNetworkExtrasProvider) {
        this.mediationNetworkExtrasProvider = mediationNetworkExtrasProvider;
    }

    protected void writeAdSize(ByteArrayOutputStream byteArrayOutputStream, FlutterAdSize flutterAdSize) {
        int i10;
        int i11;
        Integer valueOf;
        if (flutterAdSize instanceof FlutterAdSize.InlineAdaptiveBannerAdSize) {
            FlutterAdSize.InlineAdaptiveBannerAdSize inlineAdaptiveBannerAdSize = (FlutterAdSize.InlineAdaptiveBannerAdSize) flutterAdSize;
            byteArrayOutputStream.write(-110);
            writeValue(byteArrayOutputStream, Integer.valueOf(inlineAdaptiveBannerAdSize.width));
            writeValue(byteArrayOutputStream, inlineAdaptiveBannerAdSize.maxHeight);
            valueOf = inlineAdaptiveBannerAdSize.orientation;
        } else {
            if (!(flutterAdSize instanceof FlutterAdSize.AnchoredAdaptiveBannerAdSize)) {
                if (flutterAdSize instanceof FlutterAdSize.SmartBannerAdSize) {
                    i11 = -113;
                } else if (flutterAdSize instanceof FlutterAdSize.FluidAdSize) {
                    i11 = -126;
                } else {
                    byteArrayOutputStream.write(-128);
                    writeValue(byteArrayOutputStream, Integer.valueOf(flutterAdSize.width));
                    i10 = flutterAdSize.height;
                }
                byteArrayOutputStream.write(i11);
                return;
            }
            byteArrayOutputStream.write(-114);
            FlutterAdSize.AnchoredAdaptiveBannerAdSize anchoredAdaptiveBannerAdSize = (FlutterAdSize.AnchoredAdaptiveBannerAdSize) flutterAdSize;
            writeValue(byteArrayOutputStream, anchoredAdaptiveBannerAdSize.orientation);
            i10 = anchoredAdaptiveBannerAdSize.width;
            valueOf = Integer.valueOf(i10);
        }
        writeValue(byteArrayOutputStream, valueOf);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.flutter.plugin.common.StandardMessageCodec
    public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        int blue;
        Object size;
        Enum r52;
        String str;
        Object httpTimeoutMillis;
        FlutterAdRequest flutterAdRequest;
        if (obj instanceof FlutterAdSize) {
            writeAdSize(byteArrayOutputStream, (FlutterAdSize) obj);
            return;
        }
        if (obj instanceof FlutterAdManagerAdRequest) {
            byteArrayOutputStream.write(-122);
            FlutterAdManagerAdRequest flutterAdManagerAdRequest = (FlutterAdManagerAdRequest) obj;
            writeValue(byteArrayOutputStream, flutterAdManagerAdRequest.getKeywords());
            writeValue(byteArrayOutputStream, flutterAdManagerAdRequest.getContentUrl());
            writeValue(byteArrayOutputStream, flutterAdManagerAdRequest.getCustomTargeting());
            writeValue(byteArrayOutputStream, flutterAdManagerAdRequest.getCustomTargetingLists());
            writeValue(byteArrayOutputStream, flutterAdManagerAdRequest.getNonPersonalizedAds());
            writeValue(byteArrayOutputStream, flutterAdManagerAdRequest.getNeighboringContentUrls());
            writeValue(byteArrayOutputStream, flutterAdManagerAdRequest.getHttpTimeoutMillis());
            httpTimeoutMillis = flutterAdManagerAdRequest.getPublisherProvidedId();
            flutterAdRequest = flutterAdManagerAdRequest;
        } else {
            if (!(obj instanceof FlutterAdRequest)) {
                if (obj instanceof FlutterMediationExtras) {
                    byteArrayOutputStream.write(-102);
                    FlutterMediationExtras flutterMediationExtras = (FlutterMediationExtras) obj;
                    writeValue(byteArrayOutputStream, flutterMediationExtras.getClass().getCanonicalName());
                    size = flutterMediationExtras.extras;
                } else if (obj instanceof FlutterRewardedAd.FlutterRewardItem) {
                    byteArrayOutputStream.write(-124);
                    FlutterRewardedAd.FlutterRewardItem flutterRewardItem = (FlutterRewardedAd.FlutterRewardItem) obj;
                    writeValue(byteArrayOutputStream, flutterRewardItem.amount);
                    size = flutterRewardItem.type;
                } else if (obj instanceof FlutterAd.FlutterAdapterResponseInfo) {
                    byteArrayOutputStream.write(-115);
                    FlutterAd.FlutterAdapterResponseInfo flutterAdapterResponseInfo = (FlutterAd.FlutterAdapterResponseInfo) obj;
                    writeValue(byteArrayOutputStream, flutterAdapterResponseInfo.getAdapterClassName());
                    writeValue(byteArrayOutputStream, Long.valueOf(flutterAdapterResponseInfo.getLatencyMillis()));
                    writeValue(byteArrayOutputStream, flutterAdapterResponseInfo.getDescription());
                    writeValue(byteArrayOutputStream, flutterAdapterResponseInfo.getAdUnitMapping());
                    writeValue(byteArrayOutputStream, flutterAdapterResponseInfo.getError());
                    writeValue(byteArrayOutputStream, flutterAdapterResponseInfo.getAdSourceName());
                    writeValue(byteArrayOutputStream, flutterAdapterResponseInfo.getAdSourceId());
                    writeValue(byteArrayOutputStream, flutterAdapterResponseInfo.getAdSourceInstanceName());
                    size = flutterAdapterResponseInfo.getAdSourceInstanceId();
                } else if (obj instanceof FlutterAd.FlutterResponseInfo) {
                    byteArrayOutputStream.write(-116);
                    FlutterAd.FlutterResponseInfo flutterResponseInfo = (FlutterAd.FlutterResponseInfo) obj;
                    writeValue(byteArrayOutputStream, flutterResponseInfo.getResponseId());
                    writeValue(byteArrayOutputStream, flutterResponseInfo.getMediationAdapterClassName());
                    writeValue(byteArrayOutputStream, flutterResponseInfo.getAdapterResponses());
                    writeValue(byteArrayOutputStream, flutterResponseInfo.getLoadedAdapterResponseInfo());
                    size = flutterResponseInfo.getResponseExtras();
                } else if (obj instanceof FlutterAd.FlutterLoadAdError) {
                    byteArrayOutputStream.write(-123);
                    FlutterAd.FlutterLoadAdError flutterLoadAdError = (FlutterAd.FlutterLoadAdError) obj;
                    writeValue(byteArrayOutputStream, Integer.valueOf(flutterLoadAdError.code));
                    writeValue(byteArrayOutputStream, flutterLoadAdError.domain);
                    writeValue(byteArrayOutputStream, flutterLoadAdError.message);
                    size = flutterLoadAdError.responseInfo;
                } else if (obj instanceof FlutterAd.FlutterAdError) {
                    byteArrayOutputStream.write(-117);
                    FlutterAd.FlutterAdError flutterAdError = (FlutterAd.FlutterAdError) obj;
                    writeValue(byteArrayOutputStream, Integer.valueOf(flutterAdError.code));
                    writeValue(byteArrayOutputStream, flutterAdError.domain);
                    size = flutterAdError.message;
                } else {
                    if (obj instanceof FlutterAdapterStatus.AdapterInitializationState) {
                        byteArrayOutputStream.write(-121);
                        FlutterAdapterStatus.AdapterInitializationState adapterInitializationState = (FlutterAdapterStatus.AdapterInitializationState) obj;
                        int i10 = AnonymousClass1.$SwitchMap$io$flutter$plugins$googlemobileads$FlutterAdapterStatus$AdapterInitializationState[adapterInitializationState.ordinal()];
                        if (i10 == 1) {
                            str = "notReady";
                        } else {
                            if (i10 != 2) {
                                throw new IllegalArgumentException(String.format("Unable to handle state: %s", adapterInitializationState));
                            }
                            str = "ready";
                        }
                        writeValue(byteArrayOutputStream, str);
                        return;
                    }
                    if (obj instanceof FlutterAdapterStatus) {
                        byteArrayOutputStream.write(-120);
                        FlutterAdapterStatus flutterAdapterStatus = (FlutterAdapterStatus) obj;
                        writeValue(byteArrayOutputStream, flutterAdapterStatus.state);
                        writeValue(byteArrayOutputStream, flutterAdapterStatus.description);
                        size = flutterAdapterStatus.latency;
                    } else if (obj instanceof FlutterInitializationStatus) {
                        byteArrayOutputStream.write(-119);
                        size = ((FlutterInitializationStatus) obj).adapterStatuses;
                    } else if (obj instanceof FlutterServerSideVerificationOptions) {
                        byteArrayOutputStream.write(-118);
                        FlutterServerSideVerificationOptions flutterServerSideVerificationOptions = (FlutterServerSideVerificationOptions) obj;
                        writeValue(byteArrayOutputStream, flutterServerSideVerificationOptions.getUserId());
                        size = flutterServerSideVerificationOptions.getCustomData();
                    } else if (obj instanceof FlutterNativeAdOptions) {
                        byteArrayOutputStream.write(-112);
                        FlutterNativeAdOptions flutterNativeAdOptions = (FlutterNativeAdOptions) obj;
                        writeValue(byteArrayOutputStream, flutterNativeAdOptions.adChoicesPlacement);
                        writeValue(byteArrayOutputStream, flutterNativeAdOptions.mediaAspectRatio);
                        writeValue(byteArrayOutputStream, flutterNativeAdOptions.videoOptions);
                        writeValue(byteArrayOutputStream, flutterNativeAdOptions.requestCustomMuteThisAd);
                        writeValue(byteArrayOutputStream, flutterNativeAdOptions.shouldRequestMultipleImages);
                        size = flutterNativeAdOptions.shouldReturnUrlsForImageAssets;
                    } else if (obj instanceof y) {
                        byteArrayOutputStream.write(-108);
                        y yVar = (y) obj;
                        writeValue(byteArrayOutputStream, yVar.a());
                        writeValue(byteArrayOutputStream, Integer.valueOf(yVar.c()));
                        writeValue(byteArrayOutputStream, Integer.valueOf(yVar.d()));
                        size = yVar.e();
                    } else if (obj instanceof FlutterVideoOptions) {
                        byteArrayOutputStream.write(-111);
                        FlutterVideoOptions flutterVideoOptions = (FlutterVideoOptions) obj;
                        writeValue(byteArrayOutputStream, flutterVideoOptions.clickToExpandRequested);
                        writeValue(byteArrayOutputStream, flutterVideoOptions.customControlsRequested);
                        size = flutterVideoOptions.startMuted;
                    } else if (obj instanceof FlutterNativeTemplateStyle) {
                        byteArrayOutputStream.write(-107);
                        FlutterNativeTemplateStyle flutterNativeTemplateStyle = (FlutterNativeTemplateStyle) obj;
                        writeValue(byteArrayOutputStream, flutterNativeTemplateStyle.getTemplateType());
                        writeValue(byteArrayOutputStream, flutterNativeTemplateStyle.getMainBackgroundColor());
                        writeValue(byteArrayOutputStream, flutterNativeTemplateStyle.getCallToActionStyle());
                        writeValue(byteArrayOutputStream, flutterNativeTemplateStyle.getPrimaryTextStyle());
                        writeValue(byteArrayOutputStream, flutterNativeTemplateStyle.getSecondaryTextStyle());
                        size = flutterNativeTemplateStyle.getTertiaryTextStyle();
                    } else {
                        if (obj instanceof FlutterNativeTemplateFontStyle) {
                            byteArrayOutputStream.write(-105);
                            r52 = (FlutterNativeTemplateFontStyle) obj;
                        } else if (obj instanceof FlutterNativeTemplateType) {
                            byteArrayOutputStream.write(-104);
                            r52 = (FlutterNativeTemplateType) obj;
                        } else if (obj instanceof FlutterNativeTemplateTextStyle) {
                            byteArrayOutputStream.write(-106);
                            FlutterNativeTemplateTextStyle flutterNativeTemplateTextStyle = (FlutterNativeTemplateTextStyle) obj;
                            writeValue(byteArrayOutputStream, flutterNativeTemplateTextStyle.getTextColor());
                            writeValue(byteArrayOutputStream, flutterNativeTemplateTextStyle.getBackgroundColor());
                            writeValue(byteArrayOutputStream, flutterNativeTemplateTextStyle.getFontStyle());
                            size = flutterNativeTemplateTextStyle.getSize();
                        } else {
                            if (!(obj instanceof ColorDrawable)) {
                                super.writeValue(byteArrayOutputStream, obj);
                                return;
                            }
                            byteArrayOutputStream.write(-103);
                            int color = ((ColorDrawable) obj).getColor();
                            writeValue(byteArrayOutputStream, Integer.valueOf(Color.alpha(color)));
                            writeValue(byteArrayOutputStream, Integer.valueOf(Color.red(color)));
                            writeValue(byteArrayOutputStream, Integer.valueOf(Color.green(color)));
                            blue = Color.blue(color);
                            size = Integer.valueOf(blue);
                        }
                        blue = r52.ordinal();
                        size = Integer.valueOf(blue);
                    }
                }
                writeValue(byteArrayOutputStream, size);
            }
            byteArrayOutputStream.write(-127);
            FlutterAdRequest flutterAdRequest2 = (FlutterAdRequest) obj;
            writeValue(byteArrayOutputStream, flutterAdRequest2.getKeywords());
            writeValue(byteArrayOutputStream, flutterAdRequest2.getContentUrl());
            writeValue(byteArrayOutputStream, flutterAdRequest2.getNonPersonalizedAds());
            writeValue(byteArrayOutputStream, flutterAdRequest2.getNeighboringContentUrls());
            httpTimeoutMillis = flutterAdRequest2.getHttpTimeoutMillis();
            flutterAdRequest = flutterAdRequest2;
        }
        writeValue(byteArrayOutputStream, httpTimeoutMillis);
        writeValue(byteArrayOutputStream, flutterAdRequest.getMediationExtrasIdentifier());
        writeValue(byteArrayOutputStream, flutterAdRequest.getAdMobExtras());
        size = flutterAdRequest.getMediationExtras();
        writeValue(byteArrayOutputStream, size);
    }
}
