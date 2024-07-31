.class Lio/flutter/plugins/googlemobileads/AdMessageCodec;
.super Lio/flutter/plugin/common/StandardMessageCodec;
.source "SourceFile"


# static fields
.field static final synthetic $assertionsDisabled:Z = false

.field private static final VALUE_ADAPTER_RESPONSE_INFO:B = -0x73t

.field private static final VALUE_ADAPTER_STATUS:B = -0x78t

.field private static final VALUE_ADMANAGER_AD_REQUEST:B = -0x7at

.field private static final VALUE_AD_ERROR:B = -0x75t

.field private static final VALUE_AD_REQUEST:B = -0x7ft

.field private static final VALUE_AD_SIZE:B = -0x80t

.field private static final VALUE_ANCHORED_ADAPTIVE_BANNER_AD_SIZE:B = -0x72t

.field private static final VALUE_COLOR:B = -0x67t

.field private static final VALUE_FLUID_AD_SIZE:B = -0x7et

.field private static final VALUE_INITIALIZATION_STATE:B = -0x79t

.field private static final VALUE_INITIALIZATION_STATUS:B = -0x77t

.field private static final VALUE_INLINE_ADAPTIVE_BANNER_AD_SIZE:B = -0x6et

.field private static final VALUE_LOAD_AD_ERROR:B = -0x7bt

.field private static final VALUE_MEDIATION_EXTRAS:B = -0x66t

.field private static final VALUE_NATIVE_AD_OPTIONS:B = -0x70t

.field private static final VALUE_NATIVE_TEMPLATE_FONT_STYLE:B = -0x69t

.field private static final VALUE_NATIVE_TEMPLATE_STYLE:B = -0x6bt

.field private static final VALUE_NATIVE_TEMPLATE_TEXT_STYLE:B = -0x6at

.field private static final VALUE_NATIVE_TEMPLATE_TYPE:B = -0x68t

.field private static final VALUE_REQUEST_CONFIGURATION_PARAMS:B = -0x6ct

.field private static final VALUE_RESPONSE_INFO:B = -0x74t

.field private static final VALUE_REWARD_ITEM:B = -0x7ct

.field private static final VALUE_SERVER_SIDE_VERIFICATION_OPTIONS:B = -0x76t

.field private static final VALUE_SMART_BANNER_AD_SIZE:B = -0x71t

.field private static final VALUE_VIDEO_OPTIONS:B = -0x6ft


# instance fields
.field final adSizeFactory:Lio/flutter/plugins/googlemobileads/FlutterAdSize$AdSizeFactory;

.field context:Landroid/content/Context;

.field private mediationNetworkExtrasProvider:Lio/flutter/plugins/googlemobileads/MediationNetworkExtrasProvider;

.field private final requestAgentProvider:Lio/flutter/plugins/googlemobileads/FlutterRequestAgentProvider;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Lio/flutter/plugins/googlemobileads/FlutterAdSize$AdSizeFactory;Lio/flutter/plugins/googlemobileads/FlutterRequestAgentProvider;)V
    .locals 0

    invoke-direct {p0}, Lio/flutter/plugin/common/StandardMessageCodec;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->context:Landroid/content/Context;

    iput-object p2, p0, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->adSizeFactory:Lio/flutter/plugins/googlemobileads/FlutterAdSize$AdSizeFactory;

    iput-object p3, p0, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->requestAgentProvider:Lio/flutter/plugins/googlemobileads/FlutterRequestAgentProvider;

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Lio/flutter/plugins/googlemobileads/FlutterRequestAgentProvider;)V
    .locals 0

    invoke-direct {p0}, Lio/flutter/plugin/common/StandardMessageCodec;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->context:Landroid/content/Context;

    new-instance p1, Lio/flutter/plugins/googlemobileads/FlutterAdSize$AdSizeFactory;

    invoke-direct {p1}, Lio/flutter/plugins/googlemobileads/FlutterAdSize$AdSizeFactory;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->adSizeFactory:Lio/flutter/plugins/googlemobileads/FlutterAdSize$AdSizeFactory;

    iput-object p2, p0, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->requestAgentProvider:Lio/flutter/plugins/googlemobileads/FlutterRequestAgentProvider;

    return-void
.end method

.method private static booleanValueOf(Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    check-cast p0, Ljava/lang/Boolean;

    return-object p0
.end method


# virtual methods
.method protected readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    const-string v2, "FlutterMediationExtras"

    packed-switch p1, :pswitch_data_0

    :pswitch_0
    invoke-super/range {p0 .. p2}, Lio/flutter/plugin/common/StandardMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v1

    return-object v1

    :pswitch_1
    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    invoke-virtual {v0, v3, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v4

    invoke-virtual {v0, v4, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    :try_start_0
    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/flutter/plugins/googlemobileads/FlutterMediationExtras;

    invoke-virtual {v4, v1}, Lio/flutter/plugins/googlemobileads/FlutterMediationExtras;->setMediationExtras(Ljava/util/Map;)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v4

    :catch_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Unable to instantiate class "

    goto :goto_0

    :catch_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Illegal Access to "

    goto :goto_0

    :catch_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Class not found: "

    :goto_0
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v1, 0x0

    return-object v1

    :pswitch_2
    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v2

    invoke-virtual {v0, v2, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    invoke-virtual {v0, v3, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v4

    invoke-virtual {v0, v4, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v5

    invoke-virtual {v0, v5, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    new-instance v5, Landroid/graphics/drawable/ColorDrawable;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v2, v3, v4, v1}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    invoke-direct {v5, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    return-object v5

    :pswitch_3
    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v2

    invoke-virtual {v0, v2, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v1}, Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateType;->fromIntValue(I)Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateType;

    move-result-object v1

    return-object v1

    :pswitch_4
    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v2

    invoke-virtual {v0, v2, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v1}, Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateFontStyle;->fromIntValue(I)Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateFontStyle;

    move-result-object v1

    return-object v1

    :pswitch_5
    new-instance v2, Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateTextStyle;

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    invoke-virtual {v0, v3, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/graphics/drawable/ColorDrawable;

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v4

    invoke-virtual {v0, v4, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/graphics/drawable/ColorDrawable;

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v5

    invoke-virtual {v0, v5, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateFontStyle;

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v6

    invoke-virtual {v0, v6, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Double;

    invoke-direct {v2, v3, v4, v5, v1}, Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateTextStyle;-><init>(Landroid/graphics/drawable/ColorDrawable;Landroid/graphics/drawable/ColorDrawable;Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateFontStyle;Ljava/lang/Double;)V

    return-object v2

    :pswitch_6
    new-instance v2, Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateStyle;

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    invoke-virtual {v0, v3, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v3

    move-object v7, v3

    check-cast v7, Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateType;

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    invoke-virtual {v0, v3, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v3

    move-object v8, v3

    check-cast v8, Landroid/graphics/drawable/ColorDrawable;

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    invoke-virtual {v0, v3, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v3

    move-object v9, v3

    check-cast v9, Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateTextStyle;

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    invoke-virtual {v0, v3, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v3

    move-object v10, v3

    check-cast v10, Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateTextStyle;

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    invoke-virtual {v0, v3, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v3

    move-object v11, v3

    check-cast v11, Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateTextStyle;

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    invoke-virtual {v0, v3, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v1

    move-object v12, v1

    check-cast v12, Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateTextStyle;

    move-object v6, v2

    invoke-direct/range {v6 .. v12}, Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateStyle;-><init>(Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateType;Landroid/graphics/drawable/ColorDrawable;Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateTextStyle;Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateTextStyle;Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateTextStyle;Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateTextStyle;)V

    return-object v2

    :pswitch_7
    new-instance v2, Lx8/y$a;

    invoke-direct {v2}, Lx8/y$a;-><init>()V

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    invoke-virtual {v0, v3, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2, v3}, Lx8/y$a;->b(Ljava/lang/String;)Lx8/y$a;

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    invoke-virtual {v0, v3, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v2, v3}, Lx8/y$a;->c(I)Lx8/y$a;

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    invoke-virtual {v0, v3, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v2, v3}, Lx8/y$a;->d(I)Lx8/y$a;

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    invoke-virtual {v0, v3, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-virtual {v2, v1}, Lx8/y$a;->e(Ljava/util/List;)Lx8/y$a;

    invoke-virtual {v2}, Lx8/y$a;->a()Lx8/y;

    move-result-object v1

    return-object v1

    :pswitch_8
    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v2

    invoke-virtual {v0, v2, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    invoke-virtual {v0, v3, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v3

    move-object v9, v3

    check-cast v9, Ljava/lang/Integer;

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    invoke-virtual {v0, v3, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Ljava/lang/Integer;

    new-instance v1, Lio/flutter/plugins/googlemobileads/FlutterAdSize$InlineAdaptiveBannerAdSize;

    iget-object v5, v0, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->adSizeFactory:Lio/flutter/plugins/googlemobileads/FlutterAdSize$AdSizeFactory;

    iget-object v6, v0, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->context:Landroid/content/Context;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    move-object v4, v1

    invoke-direct/range {v4 .. v9}, Lio/flutter/plugins/googlemobileads/FlutterAdSize$InlineAdaptiveBannerAdSize;-><init>(Lio/flutter/plugins/googlemobileads/FlutterAdSize$AdSizeFactory;Landroid/content/Context;ILjava/lang/Integer;Ljava/lang/Integer;)V

    return-object v1

    :pswitch_9
    new-instance v2, Lio/flutter/plugins/googlemobileads/FlutterVideoOptions;

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    invoke-virtual {v0, v3, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v4

    invoke-virtual {v0, v4, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v5

    invoke-virtual {v0, v5, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-direct {v2, v3, v4, v1}, Lio/flutter/plugins/googlemobileads/FlutterVideoOptions;-><init>(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    return-object v2

    :pswitch_a
    new-instance v2, Lio/flutter/plugins/googlemobileads/FlutterNativeAdOptions;

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    invoke-virtual {v0, v3, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v3

    move-object v6, v3

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    invoke-virtual {v0, v3, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v3

    move-object v7, v3

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    invoke-virtual {v0, v3, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v3

    move-object v8, v3

    check-cast v8, Lio/flutter/plugins/googlemobileads/FlutterVideoOptions;

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    invoke-virtual {v0, v3, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v3

    move-object v9, v3

    check-cast v9, Ljava/lang/Boolean;

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    invoke-virtual {v0, v3, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v3

    move-object v10, v3

    check-cast v10, Ljava/lang/Boolean;

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    invoke-virtual {v0, v3, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Ljava/lang/Boolean;

    move-object v5, v2

    invoke-direct/range {v5 .. v11}, Lio/flutter/plugins/googlemobileads/FlutterNativeAdOptions;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Lio/flutter/plugins/googlemobileads/FlutterVideoOptions;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    return-object v2

    :pswitch_b
    new-instance v1, Lio/flutter/plugins/googlemobileads/FlutterAdSize$SmartBannerAdSize;

    invoke-direct {v1}, Lio/flutter/plugins/googlemobileads/FlutterAdSize$SmartBannerAdSize;-><init>()V

    return-object v1

    :pswitch_c
    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v2

    invoke-virtual {v0, v2, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    invoke-virtual {v0, v3, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    new-instance v3, Lio/flutter/plugins/googlemobileads/FlutterAdSize$AnchoredAdaptiveBannerAdSize;

    iget-object v4, v0, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->context:Landroid/content/Context;

    iget-object v5, v0, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->adSizeFactory:Lio/flutter/plugins/googlemobileads/FlutterAdSize$AdSizeFactory;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-direct {v3, v4, v5, v2, v1}, Lio/flutter/plugins/googlemobileads/FlutterAdSize$AnchoredAdaptiveBannerAdSize;-><init>(Landroid/content/Context;Lio/flutter/plugins/googlemobileads/FlutterAdSize$AdSizeFactory;Ljava/lang/String;I)V

    return-object v3

    :pswitch_d
    new-instance v2, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterAdapterResponseInfo;

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    invoke-virtual {v0, v3, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v3

    move-object v7, v3

    check-cast v7, Ljava/lang/String;

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    invoke-virtual {v0, v3, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    invoke-virtual {v0, v3, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v3

    move-object v10, v3

    check-cast v10, Ljava/lang/String;

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    invoke-virtual {v0, v3, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v3

    move-object v11, v3

    check-cast v11, Ljava/util/Map;

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    invoke-virtual {v0, v3, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v3

    move-object v12, v3

    check-cast v12, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterAdError;

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    invoke-virtual {v0, v3, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v3

    move-object v13, v3

    check-cast v13, Ljava/lang/String;

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    invoke-virtual {v0, v3, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v3

    move-object v14, v3

    check-cast v14, Ljava/lang/String;

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    invoke-virtual {v0, v3, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v3

    move-object v15, v3

    check-cast v15, Ljava/lang/String;

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    invoke-virtual {v0, v3, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v16, v1

    check-cast v16, Ljava/lang/String;

    move-object v6, v2

    invoke-direct/range {v6 .. v16}, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterAdapterResponseInfo;-><init>(Ljava/lang/String;JLjava/lang/String;Ljava/util/Map;Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterAdError;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    :pswitch_e
    new-instance v2, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterResponseInfo;

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    invoke-virtual {v0, v3, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v18, v3

    check-cast v18, Ljava/lang/String;

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    invoke-virtual {v0, v3, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v19, v3

    check-cast v19, Ljava/lang/String;

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    invoke-virtual {v0, v3, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v20, v3

    check-cast v20, Ljava/util/List;

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    invoke-virtual {v0, v3, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v21, v3

    check-cast v21, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterAdapterResponseInfo;

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    invoke-virtual {v0, v3, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v22, v1

    check-cast v22, Ljava/util/Map;

    move-object/from16 v17, v2

    invoke-direct/range {v17 .. v22}, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterResponseInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterAdapterResponseInfo;Ljava/util/Map;)V

    return-object v2

    :pswitch_f
    new-instance v2, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterAdError;

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    invoke-virtual {v0, v3, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v4

    invoke-virtual {v0, v4, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v5

    invoke-virtual {v0, v5, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-direct {v2, v3, v4, v1}, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterAdError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    return-object v2

    :pswitch_10
    new-instance v2, Lio/flutter/plugins/googlemobileads/FlutterServerSideVerificationOptions;

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    invoke-virtual {v0, v3, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v4

    invoke-virtual {v0, v4, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-direct {v2, v3, v1}, Lio/flutter/plugins/googlemobileads/FlutterServerSideVerificationOptions;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    :pswitch_11
    new-instance v2, Lio/flutter/plugins/googlemobileads/FlutterInitializationStatus;

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    invoke-virtual {v0, v3, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    invoke-direct {v2, v1}, Lio/flutter/plugins/googlemobileads/FlutterInitializationStatus;-><init>(Ljava/util/Map;)V

    return-object v2

    :pswitch_12
    new-instance v2, Lio/flutter/plugins/googlemobileads/FlutterAdapterStatus;

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    invoke-virtual {v0, v3, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/flutter/plugins/googlemobileads/FlutterAdapterStatus$AdapterInitializationState;

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v4

    invoke-virtual {v0, v4, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v5

    invoke-virtual {v0, v5, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-direct {v2, v3, v4, v1}, Lio/flutter/plugins/googlemobileads/FlutterAdapterStatus;-><init>(Lio/flutter/plugins/googlemobileads/FlutterAdapterStatus$AdapterInitializationState;Ljava/lang/String;Ljava/lang/Number;)V

    return-object v2

    :pswitch_13
    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v2

    invoke-virtual {v0, v2, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    const-string v2, "ready"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "notReady"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    sget-object v1, Lio/flutter/plugins/googlemobileads/FlutterAdapterStatus$AdapterInitializationState;->NOT_READY:Lio/flutter/plugins/googlemobileads/FlutterAdapterStatus$AdapterInitializationState;

    return-object v1

    :cond_0
    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const-string v1, "Unable to handle state: %s"

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_1
    sget-object v1, Lio/flutter/plugins/googlemobileads/FlutterAdapterStatus$AdapterInitializationState;->READY:Lio/flutter/plugins/googlemobileads/FlutterAdapterStatus$AdapterInitializationState;

    return-object v1

    :pswitch_14
    new-instance v2, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest$Builder;

    invoke-direct {v2}, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest$Builder;-><init>()V

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    invoke-virtual {v0, v3, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-virtual {v2, v3}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;->setKeywords(Ljava/util/List;)Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    invoke-virtual {v0, v3, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2, v3}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;->setContentUrl(Ljava/lang/String;)Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    invoke-virtual {v0, v3, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map;

    invoke-virtual {v2, v3}, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest$Builder;->setCustomTargeting(Ljava/util/Map;)Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest$Builder;

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    invoke-virtual {v0, v3, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map;

    invoke-virtual {v2, v3}, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest$Builder;->setCustomTargetingLists(Ljava/util/Map;)Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest$Builder;

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    invoke-virtual {v0, v3, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v2, v3}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;->setNonPersonalizedAds(Ljava/lang/Boolean;)Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    invoke-virtual {v0, v3, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-virtual {v2, v3}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;->setNeighboringContentUrls(Ljava/util/List;)Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    invoke-virtual {v0, v3, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v2, v3}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;->setHttpTimeoutMillis(Ljava/lang/Integer;)Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    invoke-virtual {v0, v3, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2, v3}, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest$Builder;->setPublisherProvidedId(Ljava/lang/String;)Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest$Builder;

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    invoke-virtual {v0, v3, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2, v3}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;->setMediationNetworkExtrasIdentifier(Ljava/lang/String;)Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;

    iget-object v3, v0, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->mediationNetworkExtrasProvider:Lio/flutter/plugins/googlemobileads/MediationNetworkExtrasProvider;

    invoke-virtual {v2, v3}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;->setMediationNetworkExtrasProvider(Lio/flutter/plugins/googlemobileads/MediationNetworkExtrasProvider;)Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    invoke-virtual {v0, v3, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map;

    invoke-virtual {v2, v3}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;->setAdMobExtras(Ljava/util/Map;)Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;

    iget-object v3, v0, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->requestAgentProvider:Lio/flutter/plugins/googlemobileads/FlutterRequestAgentProvider;

    invoke-virtual {v3}, Lio/flutter/plugins/googlemobileads/FlutterRequestAgentProvider;->getRequestAgent()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;->setRequestAgent(Ljava/lang/String;)Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    invoke-virtual {v0, v3, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-virtual {v2, v1}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;->setMediationExtras(Ljava/util/List;)Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;

    invoke-virtual {v2}, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest$Builder;->build()Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;

    move-result-object v1

    return-object v1

    :pswitch_15
    new-instance v2, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterLoadAdError;

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    invoke-virtual {v0, v3, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v4

    invoke-virtual {v0, v4, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v5

    invoke-virtual {v0, v5, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v6

    invoke-virtual {v0, v6, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterResponseInfo;

    invoke-direct {v2, v3, v4, v5, v1}, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterLoadAdError;-><init>(ILjava/lang/String;Ljava/lang/String;Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterResponseInfo;)V

    return-object v2

    :pswitch_16
    new-instance v2, Lio/flutter/plugins/googlemobileads/FlutterRewardedAd$FlutterRewardItem;

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    invoke-virtual {v0, v3, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v4

    invoke-virtual {v0, v4, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-direct {v2, v3, v1}, Lio/flutter/plugins/googlemobileads/FlutterRewardedAd$FlutterRewardItem;-><init>(Ljava/lang/Integer;Ljava/lang/String;)V

    return-object v2

    :pswitch_17
    new-instance v1, Lio/flutter/plugins/googlemobileads/FlutterAdSize$FluidAdSize;

    invoke-direct {v1}, Lio/flutter/plugins/googlemobileads/FlutterAdSize$FluidAdSize;-><init>()V

    return-object v1

    :pswitch_18
    new-instance v2, Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;

    invoke-direct {v2}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;-><init>()V

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    invoke-virtual {v0, v3, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-virtual {v2, v3}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;->setKeywords(Ljava/util/List;)Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;

    move-result-object v2

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    invoke-virtual {v0, v3, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2, v3}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;->setContentUrl(Ljava/lang/String;)Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;

    move-result-object v2

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    invoke-virtual {v0, v3, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->booleanValueOf(Ljava/lang/Object;)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v2, v3}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;->setNonPersonalizedAds(Ljava/lang/Boolean;)Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;

    move-result-object v2

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    invoke-virtual {v0, v3, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-virtual {v2, v3}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;->setNeighboringContentUrls(Ljava/util/List;)Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;

    move-result-object v2

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    invoke-virtual {v0, v3, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v2, v3}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;->setHttpTimeoutMillis(Ljava/lang/Integer;)Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;

    move-result-object v2

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    invoke-virtual {v0, v3, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2, v3}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;->setMediationNetworkExtrasIdentifier(Ljava/lang/String;)Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;

    move-result-object v2

    iget-object v3, v0, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->mediationNetworkExtrasProvider:Lio/flutter/plugins/googlemobileads/MediationNetworkExtrasProvider;

    invoke-virtual {v2, v3}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;->setMediationNetworkExtrasProvider(Lio/flutter/plugins/googlemobileads/MediationNetworkExtrasProvider;)Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;

    move-result-object v2

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    invoke-virtual {v0, v3, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map;

    invoke-virtual {v2, v3}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;->setAdMobExtras(Ljava/util/Map;)Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;

    move-result-object v2

    iget-object v3, v0, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->requestAgentProvider:Lio/flutter/plugins/googlemobileads/FlutterRequestAgentProvider;

    invoke-virtual {v3}, Lio/flutter/plugins/googlemobileads/FlutterRequestAgentProvider;->getRequestAgent()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;->setRequestAgent(Ljava/lang/String;)Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;

    move-result-object v2

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    invoke-virtual {v0, v3, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-virtual {v2, v1}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;->setMediationExtras(Ljava/util/List;)Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;

    move-result-object v1

    invoke-virtual {v1}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;->build()Lio/flutter/plugins/googlemobileads/FlutterAdRequest;

    move-result-object v1

    return-object v1

    :pswitch_19
    new-instance v2, Lio/flutter/plugins/googlemobileads/FlutterAdSize;

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    invoke-virtual {v0, v3, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v4

    invoke-virtual {v0, v4, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-direct {v2, v3, v1}, Lio/flutter/plugins/googlemobileads/FlutterAdSize;-><init>(II)V

    return-object v2

    nop

    :pswitch_data_0
    .packed-switch -0x80
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_0
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method setContext(Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->context:Landroid/content/Context;

    return-void
.end method

.method setMediationNetworkExtrasProvider(Lio/flutter/plugins/googlemobileads/MediationNetworkExtrasProvider;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->mediationNetworkExtrasProvider:Lio/flutter/plugins/googlemobileads/MediationNetworkExtrasProvider;

    return-void
.end method

.method protected writeAdSize(Ljava/io/ByteArrayOutputStream;Lio/flutter/plugins/googlemobileads/FlutterAdSize;)V
    .locals 1

    instance-of v0, p2, Lio/flutter/plugins/googlemobileads/FlutterAdSize$InlineAdaptiveBannerAdSize;

    if-eqz v0, :cond_0

    check-cast p2, Lio/flutter/plugins/googlemobileads/FlutterAdSize$InlineAdaptiveBannerAdSize;

    const/16 v0, -0x6e

    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    iget v0, p2, Lio/flutter/plugins/googlemobileads/FlutterAdSize;->width:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    iget-object v0, p2, Lio/flutter/plugins/googlemobileads/FlutterAdSize$InlineAdaptiveBannerAdSize;->maxHeight:Ljava/lang/Integer;

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    iget-object p2, p2, Lio/flutter/plugins/googlemobileads/FlutterAdSize$InlineAdaptiveBannerAdSize;->orientation:Ljava/lang/Integer;

    :goto_0
    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    goto :goto_3

    :cond_0
    instance-of v0, p2, Lio/flutter/plugins/googlemobileads/FlutterAdSize$AnchoredAdaptiveBannerAdSize;

    if-eqz v0, :cond_1

    const/16 v0, -0x72

    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    check-cast p2, Lio/flutter/plugins/googlemobileads/FlutterAdSize$AnchoredAdaptiveBannerAdSize;

    iget-object v0, p2, Lio/flutter/plugins/googlemobileads/FlutterAdSize$AnchoredAdaptiveBannerAdSize;->orientation:Ljava/lang/String;

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    iget p2, p2, Lio/flutter/plugins/googlemobileads/FlutterAdSize;->width:I

    :goto_1
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    goto :goto_0

    :cond_1
    instance-of v0, p2, Lio/flutter/plugins/googlemobileads/FlutterAdSize$SmartBannerAdSize;

    if-eqz v0, :cond_2

    const/16 p2, -0x71

    :goto_2
    invoke-virtual {p1, p2}, Ljava/io/ByteArrayOutputStream;->write(I)V

    goto :goto_3

    :cond_2
    instance-of v0, p2, Lio/flutter/plugins/googlemobileads/FlutterAdSize$FluidAdSize;

    if-eqz v0, :cond_3

    const/16 p2, -0x7e

    goto :goto_2

    :cond_3
    const/16 v0, -0x80

    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    iget v0, p2, Lio/flutter/plugins/googlemobileads/FlutterAdSize;->width:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    iget p2, p2, Lio/flutter/plugins/googlemobileads/FlutterAdSize;->height:I

    goto :goto_1

    :goto_3
    return-void
.end method

.method protected writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V
    .locals 3

    instance-of v0, p2, Lio/flutter/plugins/googlemobileads/FlutterAdSize;

    if-eqz v0, :cond_0

    check-cast p2, Lio/flutter/plugins/googlemobileads/FlutterAdSize;

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeAdSize(Ljava/io/ByteArrayOutputStream;Lio/flutter/plugins/googlemobileads/FlutterAdSize;)V

    goto/16 :goto_5

    :cond_0
    instance-of v0, p2, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;

    if-eqz v0, :cond_1

    const/16 v0, -0x7a

    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    check-cast p2, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;

    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->getKeywords()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->getContentUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;->getCustomTargeting()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;->getCustomTargetingLists()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->getNonPersonalizedAds()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->getNeighboringContentUrls()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->getHttpTimeoutMillis()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;->getPublisherProvidedId()Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->getMediationExtrasIdentifier()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->getAdMobExtras()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->getMediationExtras()Ljava/util/List;

    move-result-object p2

    :goto_1
    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_1
    instance-of v0, p2, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;

    if-eqz v0, :cond_2

    const/16 v0, -0x7f

    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    check-cast p2, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;

    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->getKeywords()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->getContentUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->getNonPersonalizedAds()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->getNeighboringContentUrls()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->getHttpTimeoutMillis()Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :cond_2
    instance-of v0, p2, Lio/flutter/plugins/googlemobileads/FlutterMediationExtras;

    if-eqz v0, :cond_3

    const/16 v0, -0x66

    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    check-cast p2, Lio/flutter/plugins/googlemobileads/FlutterMediationExtras;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    iget-object p2, p2, Lio/flutter/plugins/googlemobileads/FlutterMediationExtras;->extras:Ljava/util/Map;

    goto :goto_1

    :cond_3
    instance-of v0, p2, Lio/flutter/plugins/googlemobileads/FlutterRewardedAd$FlutterRewardItem;

    if-eqz v0, :cond_4

    const/16 v0, -0x7c

    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    check-cast p2, Lio/flutter/plugins/googlemobileads/FlutterRewardedAd$FlutterRewardItem;

    iget-object v0, p2, Lio/flutter/plugins/googlemobileads/FlutterRewardedAd$FlutterRewardItem;->amount:Ljava/lang/Integer;

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    iget-object p2, p2, Lio/flutter/plugins/googlemobileads/FlutterRewardedAd$FlutterRewardItem;->type:Ljava/lang/String;

    goto :goto_1

    :cond_4
    instance-of v0, p2, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterAdapterResponseInfo;

    if-eqz v0, :cond_5

    const/16 v0, -0x73

    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    check-cast p2, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterAdapterResponseInfo;

    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterAdapterResponseInfo;->getAdapterClassName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterAdapterResponseInfo;->getLatencyMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterAdapterResponseInfo;->getDescription()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterAdapterResponseInfo;->getAdUnitMapping()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterAdapterResponseInfo;->getError()Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterAdError;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterAdapterResponseInfo;->getAdSourceName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterAdapterResponseInfo;->getAdSourceId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterAdapterResponseInfo;->getAdSourceInstanceName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterAdapterResponseInfo;->getAdSourceInstanceId()Ljava/lang/String;

    move-result-object p2

    goto/16 :goto_1

    :cond_5
    instance-of v0, p2, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterResponseInfo;

    if-eqz v0, :cond_6

    const/16 v0, -0x74

    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    check-cast p2, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterResponseInfo;

    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterResponseInfo;->getResponseId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterResponseInfo;->getMediationAdapterClassName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterResponseInfo;->getAdapterResponses()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterResponseInfo;->getLoadedAdapterResponseInfo()Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterAdapterResponseInfo;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterResponseInfo;->getResponseExtras()Ljava/util/Map;

    move-result-object p2

    goto/16 :goto_1

    :cond_6
    instance-of v0, p2, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterLoadAdError;

    if-eqz v0, :cond_7

    const/16 v0, -0x7b

    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    check-cast p2, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterLoadAdError;

    iget v0, p2, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterLoadAdError;->code:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    iget-object v0, p2, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterLoadAdError;->domain:Ljava/lang/String;

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    iget-object v0, p2, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterLoadAdError;->message:Ljava/lang/String;

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    iget-object p2, p2, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterLoadAdError;->responseInfo:Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterResponseInfo;

    goto/16 :goto_1

    :cond_7
    instance-of v0, p2, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterAdError;

    if-eqz v0, :cond_8

    const/16 v0, -0x75

    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    check-cast p2, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterAdError;

    iget v0, p2, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterAdError;->code:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    iget-object v0, p2, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterAdError;->domain:Ljava/lang/String;

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    iget-object p2, p2, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterAdError;->message:Ljava/lang/String;

    goto/16 :goto_1

    :cond_8
    instance-of v0, p2, Lio/flutter/plugins/googlemobileads/FlutterAdapterStatus$AdapterInitializationState;

    if-eqz v0, :cond_b

    const/16 v0, -0x79

    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    check-cast p2, Lio/flutter/plugins/googlemobileads/FlutterAdapterStatus$AdapterInitializationState;

    sget-object v0, Lio/flutter/plugins/googlemobileads/AdMessageCodec$1;->$SwitchMap$io$flutter$plugins$googlemobileads$FlutterAdapterStatus$AdapterInitializationState:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_a

    const/4 v2, 0x2

    if-ne v0, v2, :cond_9

    const-string p2, "ready"

    :goto_2
    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void

    :cond_9
    new-array p1, v1, [Ljava/lang/Object;

    const/4 v0, 0x0

    aput-object p2, p1, v0

    const-string p2, "Unable to handle state: %s"

    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_a
    const-string p2, "notReady"

    goto :goto_2

    :cond_b
    instance-of v0, p2, Lio/flutter/plugins/googlemobileads/FlutterAdapterStatus;

    if-eqz v0, :cond_c

    const/16 v0, -0x78

    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    check-cast p2, Lio/flutter/plugins/googlemobileads/FlutterAdapterStatus;

    iget-object v0, p2, Lio/flutter/plugins/googlemobileads/FlutterAdapterStatus;->state:Lio/flutter/plugins/googlemobileads/FlutterAdapterStatus$AdapterInitializationState;

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    iget-object v0, p2, Lio/flutter/plugins/googlemobileads/FlutterAdapterStatus;->description:Ljava/lang/String;

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    iget-object p2, p2, Lio/flutter/plugins/googlemobileads/FlutterAdapterStatus;->latency:Ljava/lang/Number;

    goto/16 :goto_1

    :cond_c
    instance-of v0, p2, Lio/flutter/plugins/googlemobileads/FlutterInitializationStatus;

    if-eqz v0, :cond_d

    const/16 v0, -0x77

    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    check-cast p2, Lio/flutter/plugins/googlemobileads/FlutterInitializationStatus;

    iget-object p2, p2, Lio/flutter/plugins/googlemobileads/FlutterInitializationStatus;->adapterStatuses:Ljava/util/Map;

    goto/16 :goto_1

    :cond_d
    instance-of v0, p2, Lio/flutter/plugins/googlemobileads/FlutterServerSideVerificationOptions;

    if-eqz v0, :cond_e

    const/16 v0, -0x76

    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    check-cast p2, Lio/flutter/plugins/googlemobileads/FlutterServerSideVerificationOptions;

    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterServerSideVerificationOptions;->getUserId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterServerSideVerificationOptions;->getCustomData()Ljava/lang/String;

    move-result-object p2

    goto/16 :goto_1

    :cond_e
    instance-of v0, p2, Lio/flutter/plugins/googlemobileads/FlutterNativeAdOptions;

    if-eqz v0, :cond_f

    const/16 v0, -0x70

    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    check-cast p2, Lio/flutter/plugins/googlemobileads/FlutterNativeAdOptions;

    iget-object v0, p2, Lio/flutter/plugins/googlemobileads/FlutterNativeAdOptions;->adChoicesPlacement:Ljava/lang/Integer;

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    iget-object v0, p2, Lio/flutter/plugins/googlemobileads/FlutterNativeAdOptions;->mediaAspectRatio:Ljava/lang/Integer;

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    iget-object v0, p2, Lio/flutter/plugins/googlemobileads/FlutterNativeAdOptions;->videoOptions:Lio/flutter/plugins/googlemobileads/FlutterVideoOptions;

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    iget-object v0, p2, Lio/flutter/plugins/googlemobileads/FlutterNativeAdOptions;->requestCustomMuteThisAd:Ljava/lang/Boolean;

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    iget-object v0, p2, Lio/flutter/plugins/googlemobileads/FlutterNativeAdOptions;->shouldRequestMultipleImages:Ljava/lang/Boolean;

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    iget-object p2, p2, Lio/flutter/plugins/googlemobileads/FlutterNativeAdOptions;->shouldReturnUrlsForImageAssets:Ljava/lang/Boolean;

    goto/16 :goto_1

    :cond_f
    instance-of v0, p2, Lx8/y;

    if-eqz v0, :cond_10

    const/16 v0, -0x6c

    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    check-cast p2, Lx8/y;

    invoke-virtual {p2}, Lx8/y;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    invoke-virtual {p2}, Lx8/y;->c()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    invoke-virtual {p2}, Lx8/y;->d()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    invoke-virtual {p2}, Lx8/y;->e()Ljava/util/List;

    move-result-object p2

    goto/16 :goto_1

    :cond_10
    instance-of v0, p2, Lio/flutter/plugins/googlemobileads/FlutterVideoOptions;

    if-eqz v0, :cond_11

    const/16 v0, -0x6f

    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    check-cast p2, Lio/flutter/plugins/googlemobileads/FlutterVideoOptions;

    iget-object v0, p2, Lio/flutter/plugins/googlemobileads/FlutterVideoOptions;->clickToExpandRequested:Ljava/lang/Boolean;

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    iget-object v0, p2, Lio/flutter/plugins/googlemobileads/FlutterVideoOptions;->customControlsRequested:Ljava/lang/Boolean;

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    iget-object p2, p2, Lio/flutter/plugins/googlemobileads/FlutterVideoOptions;->startMuted:Ljava/lang/Boolean;

    goto/16 :goto_1

    :cond_11
    instance-of v0, p2, Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateStyle;

    if-eqz v0, :cond_12

    const/16 v0, -0x6b

    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    check-cast p2, Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateStyle;

    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateStyle;->getTemplateType()Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateType;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateStyle;->getMainBackgroundColor()Landroid/graphics/drawable/ColorDrawable;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateStyle;->getCallToActionStyle()Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateTextStyle;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateStyle;->getPrimaryTextStyle()Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateTextStyle;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateStyle;->getSecondaryTextStyle()Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateTextStyle;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateStyle;->getTertiaryTextStyle()Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateTextStyle;

    move-result-object p2

    goto/16 :goto_1

    :cond_12
    instance-of v0, p2, Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateFontStyle;

    if-eqz v0, :cond_13

    const/16 v0, -0x69

    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    check-cast p2, Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateFontStyle;

    :goto_3
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    :goto_4
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    goto/16 :goto_1

    :cond_13
    instance-of v0, p2, Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateType;

    if-eqz v0, :cond_14

    const/16 v0, -0x68

    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    check-cast p2, Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateType;

    goto :goto_3

    :cond_14
    instance-of v0, p2, Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateTextStyle;

    if-eqz v0, :cond_15

    const/16 v0, -0x6a

    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    check-cast p2, Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateTextStyle;

    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateTextStyle;->getTextColor()Landroid/graphics/drawable/ColorDrawable;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateTextStyle;->getBackgroundColor()Landroid/graphics/drawable/ColorDrawable;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateTextStyle;->getFontStyle()Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateFontStyle;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateTextStyle;->getSize()Ljava/lang/Float;

    move-result-object p2

    goto/16 :goto_1

    :cond_15
    instance-of v0, p2, Landroid/graphics/drawable/ColorDrawable;

    if-eqz v0, :cond_16

    const/16 v0, -0x67

    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    check-cast p2, Landroid/graphics/drawable/ColorDrawable;

    invoke-virtual {p2}, Landroid/graphics/drawable/ColorDrawable;->getColor()I

    move-result p2

    invoke-static {p2}, Landroid/graphics/Color;->alpha(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    invoke-static {p2}, Landroid/graphics/Color;->red(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    invoke-static {p2}, Landroid/graphics/Color;->green(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    invoke-static {p2}, Landroid/graphics/Color;->blue(I)I

    move-result p2

    goto :goto_4

    :cond_16
    invoke-super {p0, p1, p2}, Lio/flutter/plugin/common/StandardMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    :goto_5
    return-void
.end method
