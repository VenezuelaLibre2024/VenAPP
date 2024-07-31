.class final Lio/flutter/plugins/googlemaps/GoogleMapInitializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsa/g;
.implements Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;


# static fields
.field private static initializationResult:Lio/flutter/plugin/common/MethodChannel$Result;


# instance fields
.field private final context:Landroid/content/Context;

.field private final methodChannel:Lio/flutter/plugin/common/MethodChannel;

.field private rendererInitialized:Z


# direct methods
.method constructor <init>(Landroid/content/Context;Lio/flutter/plugin/common/BinaryMessenger;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapInitializer;->rendererInitialized:Z

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapInitializer;->context:Landroid/content/Context;

    new-instance p1, Lio/flutter/plugin/common/MethodChannel;

    const-string v0, "plugins.flutter.dev/google_maps_android_initializer"

    invoke-direct {p1, p2, v0}, Lio/flutter/plugin/common/MethodChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapInitializer;->methodChannel:Lio/flutter/plugin/common/MethodChannel;

    invoke-virtual {p1, p0}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    return-void
.end method

.method private initializeWithPreferredRenderer(Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    iget-boolean v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapInitializer;->rendererInitialized:Z

    const/4 v1, 0x0

    if-nez v0, :cond_4

    sget-object v0, Lio/flutter/plugins/googlemaps/GoogleMapInitializer;->initializationResult:Lio/flutter/plugin/common/MethodChannel$Result;

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    sput-object p2, Lio/flutter/plugins/googlemaps/GoogleMapInitializer;->initializationResult:Lio/flutter/plugin/common/MethodChannel$Result;

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p2

    const/4 v0, -0x1

    sparse-switch p2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string p2, "default"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x2

    goto :goto_0

    :sswitch_1
    const-string p2, "legacy"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x1

    goto :goto_0

    :sswitch_2
    const-string p2, "latest"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    packed-switch v0, :pswitch_data_0

    sget-object p1, Lio/flutter/plugins/googlemaps/GoogleMapInitializer;->initializationResult:Lio/flutter/plugin/common/MethodChannel$Result;

    const-string p2, "Invalid renderer type"

    const-string v0, "Renderer initialization called with invalid renderer type"

    invoke-interface {p1, p2, v0, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    sput-object v1, Lio/flutter/plugins/googlemaps/GoogleMapInitializer;->initializationResult:Lio/flutter/plugin/common/MethodChannel$Result;

    goto :goto_3

    :pswitch_0
    invoke-virtual {p0, v1}, Lio/flutter/plugins/googlemaps/GoogleMapInitializer;->initializeWithRendererRequest(Lsa/e$a;)V

    goto :goto_3

    :pswitch_1
    sget-object p1, Lsa/e$a;->LEGACY:Lsa/e$a;

    goto :goto_1

    :pswitch_2
    sget-object p1, Lsa/e$a;->LATEST:Lsa/e$a;

    :goto_1
    invoke-virtual {p0, p1}, Lio/flutter/plugins/googlemaps/GoogleMapInitializer;->initializeWithRendererRequest(Lsa/e$a;)V

    goto :goto_3

    :cond_4
    :goto_2
    const-string p1, "Renderer already initialized"

    const-string v0, "Renderer initialization called multiple times"

    invoke-interface {p2, p1, v0, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_3
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x42277079 -> :sswitch_2
        -0x41f50c37 -> :sswitch_1
        0x5c13d641 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public initializeWithRendererRequest(Lsa/e$a;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapInitializer;->context:Landroid/content/Context;

    invoke-static {v0, p1, p0}, Lsa/e;->b(Landroid/content/Context;Lsa/e$a;Lsa/g;)I

    return-void
.end method

.method public onMapsSdkInitialized(Lsa/e$a;)V
    .locals 3

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapInitializer;->rendererInitialized:Z

    sget-object v1, Lio/flutter/plugins/googlemaps/GoogleMapInitializer;->initializationResult:Lio/flutter/plugin/common/MethodChannel$Result;

    if-eqz v1, :cond_2

    sget-object v1, Lio/flutter/plugins/googlemaps/GoogleMapInitializer$1;->$SwitchMap$com$google$android$gms$maps$MapsInitializer$Renderer:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v1, p1

    const/4 v1, 0x0

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    sget-object p1, Lio/flutter/plugins/googlemaps/GoogleMapInitializer;->initializationResult:Lio/flutter/plugin/common/MethodChannel$Result;

    const-string v0, "Unknown renderer type"

    const-string v2, "Initialized with unknown renderer type"

    invoke-interface {p1, v0, v2, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    sget-object p1, Lio/flutter/plugins/googlemaps/GoogleMapInitializer;->initializationResult:Lio/flutter/plugin/common/MethodChannel$Result;

    const-string v0, "legacy"

    goto :goto_0

    :cond_1
    sget-object p1, Lio/flutter/plugins/googlemaps/GoogleMapInitializer;->initializationResult:Lio/flutter/plugin/common/MethodChannel$Result;

    const-string v0, "latest"

    :goto_0
    invoke-interface {p1, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    :goto_1
    sput-object v1, Lio/flutter/plugins/googlemaps/GoogleMapInitializer;->initializationResult:Lio/flutter/plugin/common/MethodChannel$Result;

    :cond_2
    return-void
.end method

.method public onMethodCall(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    iget-object v0, p1, Lio/flutter/plugin/common/MethodCall;->method:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    const-string v1, "initializer#preferRenderer"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p2}, Lio/flutter/plugin/common/MethodChannel$Result;->notImplemented()V

    goto :goto_0

    :cond_0
    const-string v0, "value"

    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-direct {p0, p1, p2}, Lio/flutter/plugins/googlemaps/GoogleMapInitializer;->initializeWithPreferredRenderer(Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;)V

    :goto_0
    return-void
.end method
