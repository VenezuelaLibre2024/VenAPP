.class public final Lsh/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/embedding/engine/plugins/FlutterPlugin;
.implements Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;
.implements Lio/flutter/embedding/engine/plugins/activity/ActivityAware;


# instance fields
.field private a:Lio/flutter/plugin/common/MethodChannel;

.field private b:Landroid/media/MediaRecorder;

.field private c:Landroid/app/Activity;

.field private d:Lsh/b;

.field private e:Ljava/lang/String;

.field private f:I

.field private r:I

.field private s:I

.field private t:Ljava/lang/Integer;

.field private u:Landroid/content/Context;

.field private v:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lsh/a;",
            ">;"
        }
    .end annotation
.end field

.field private w:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lsh/i;",
            ">;"
        }
    .end annotation
.end field

.field private x:Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0xac44

    iput v0, p0, Lsh/c;->s:I

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lsh/c;->v:Ljava/util/Map;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lsh/c;->w:Ljava/util/Map;

    return-void
.end method

.method public static final synthetic a(Lsh/c;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lsh/c;->w:Ljava/util/Map;

    return-object p0
.end method

.method private final b(Lio/flutter/plugin/common/MethodChannel$Result;IIILjava/lang/Integer;)V
    .locals 13

    move-object v0, p0

    const-string v1, "AudioWaveforms"

    :try_start_0
    new-instance v2, Landroid/media/MediaRecorder;

    invoke-direct {v2}, Landroid/media/MediaRecorder;-><init>()V

    iput-object v2, v0, Lsh/c;->b:Landroid/media/MediaRecorder;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v2, "Failed to initialise Recorder"

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    iget-object v2, v0, Lsh/c;->e:Ljava/lang/String;

    const-string v3, "audioRecorder"

    const/4 v4, 0x0

    if-nez v2, :cond_2

    iget-object v2, v0, Lsh/c;->c:Landroid/app/Activity;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v2

    goto :goto_1

    :cond_0
    move-object v2, v4

    :goto_1
    new-instance v5, Ljava/text/SimpleDateFormat;

    const-string v6, "dd-MM-yy-hh-mm-ss"

    sget-object v7, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v5, v6, v7}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v6, Ljava/util/Date;

    invoke-direct {v6}, Ljava/util/Date;-><init>()V

    invoke-virtual {v5, v6}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v5

    :try_start_1
    const-string v6, ".m4a"

    invoke-static {v5, v6, v2}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lsh/c;->e:Ljava/lang/String;

    iget-object v2, v0, Lsh/c;->d:Lsh/b;

    if-nez v2, :cond_1

    invoke-static {v3}, Lkotlin/jvm/internal/n;->p(Ljava/lang/String;)V

    move-object v5, v4

    goto :goto_2

    :cond_1
    move-object v5, v2

    :goto_2
    iget-object v6, v0, Lsh/c;->e:Ljava/lang/String;

    invoke-static {v6}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    iget-object v8, v0, Lsh/c;->b:Landroid/media/MediaRecorder;

    move-object v7, p1

    move v9, p2

    move/from16 v10, p3

    move/from16 v11, p4

    move-object/from16 v12, p5

    invoke-virtual/range {v5 .. v12}, Lsh/b;->f(Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;Landroid/media/MediaRecorder;IIILjava/lang/Integer;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_4

    :catch_1
    const-string v2, "Failed to create file"

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_4

    :cond_2
    iget-object v1, v0, Lsh/c;->d:Lsh/b;

    if-nez v1, :cond_3

    invoke-static {v3}, Lkotlin/jvm/internal/n;->p(Ljava/lang/String;)V

    move-object v5, v4

    goto :goto_3

    :cond_3
    move-object v5, v1

    :goto_3
    iget-object v6, v0, Lsh/c;->e:Ljava/lang/String;

    invoke-static {v6}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    iget-object v8, v0, Lsh/c;->b:Landroid/media/MediaRecorder;

    move-object v7, p1

    move v9, p2

    move/from16 v10, p3

    move/from16 v11, p4

    move-object/from16 v12, p5

    invoke-virtual/range {v5 .. v12}, Lsh/b;->f(Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;Landroid/media/MediaRecorder;IIILjava/lang/Integer;)V

    :goto_4
    return-void
.end method

.method private final c(Ljava/lang/String;ILjava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 11

    if-nez p3, :cond_0

    const-string p1, "Path cant be null"

    const-string p2, ""

    const-string p3, "AudioWaveforms"

    invoke-interface {p4, p3, p1, p2}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p0, Lsh/c;->w:Ljava/util/Map;

    iget-object v1, p0, Lsh/c;->u:Landroid/content/Context;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    const-string v1, "applicationContext"

    invoke-static {v1}, Lkotlin/jvm/internal/n;->p(Ljava/lang/String;)V

    move-object v10, v2

    goto :goto_0

    :cond_1
    move-object v10, v1

    :goto_0
    iget-object v1, p0, Lsh/c;->a:Lio/flutter/plugin/common/MethodChannel;

    if-nez v1, :cond_2

    const-string v1, "channel"

    invoke-static {v1}, Lkotlin/jvm/internal/n;->p(Ljava/lang/String;)V

    move-object v7, v2

    goto :goto_1

    :cond_2
    move-object v7, v1

    :goto_1
    new-instance v9, Lsh/c$a;

    invoke-direct {v9, p4, p0, p1}, Lsh/c$a;-><init>(Lio/flutter/plugin/common/MethodChannel$Result;Lsh/c;Ljava/lang/String;)V

    new-instance v1, Lsh/i;

    move-object v3, v1

    move-object v4, p3

    move v5, p2

    move-object v6, p1

    move-object v8, p4

    invoke-direct/range {v3 .. v10}, Lsh/i;-><init>(Ljava/lang/String;ILjava/lang/String;Lio/flutter/plugin/common/MethodChannel;Lio/flutter/plugin/common/MethodChannel$Result;Lsh/e;Landroid/content/Context;)V

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, Lsh/c;->w:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lsh/i;

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Lsh/i;->y()V

    :cond_3
    iget-object p2, p0, Lsh/c;->w:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lsh/i;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lsh/i;->z()V

    :cond_4
    return-void
.end method

.method private final d(Ljava/lang/Integer;)Lsh/h;
    .locals 2

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    sget-object p1, Lsh/h;->High:Lsh/h;

    return-object p1

    :cond_1
    :goto_0
    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_3

    sget-object p1, Lsh/h;->Medium:Lsh/h;

    return-object p1

    :cond_3
    :goto_1
    sget-object p1, Lsh/h;->Low:Lsh/h;

    return-object p1
.end method

.method private final e(Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Lsh/c;->v:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_2

    new-instance v0, Lsh/a;

    iget-object v1, p0, Lsh/c;->u:Landroid/content/Context;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    const-string v1, "applicationContext"

    invoke-static {v1}, Lkotlin/jvm/internal/n;->p(Ljava/lang/String;)V

    move-object v1, v2

    :cond_0
    iget-object v3, p0, Lsh/c;->a:Lio/flutter/plugin/common/MethodChannel;

    if-nez v3, :cond_1

    const-string v3, "channel"

    invoke-static {v3}, Lkotlin/jvm/internal/n;->p(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v2, v3

    :goto_0
    invoke-direct {v0, v1, v2, p1}, Lsh/a;-><init>(Landroid/content/Context;Lio/flutter/plugin/common/MethodChannel;Ljava/lang/String;)V

    iget-object v1, p0, Lsh/c;->v:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-void
.end method


# virtual methods
.method public onAttachedToActivity(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->getActivity()Landroid/app/Activity;

    move-result-object v0

    iput-object v0, p0, Lsh/c;->c:Landroid/app/Activity;

    iput-object p1, p0, Lsh/c;->x:Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;

    invoke-static {p1}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    iget-object v0, p0, Lsh/c;->d:Lsh/b;

    if-nez v0, :cond_0

    const-string v0, "audioRecorder"

    invoke-static {v0}, Lkotlin/jvm/internal/n;->p(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-interface {p1, v0}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->addRequestPermissionsResultListener(Lio/flutter/plugin/common/PluginRegistry$RequestPermissionsResultListener;)V

    return-void
.end method

.method public onAttachedToEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
    .locals 3

    const-string v0, "flutterPluginBinding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/flutter/plugin/common/MethodChannel;

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    move-result-object v1

    const-string v2, "simform_audio_waveforms_plugin/methods"

    invoke-direct {v0, v1, v2}, Lio/flutter/plugin/common/MethodChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V

    iput-object v0, p0, Lsh/c;->a:Lio/flutter/plugin/common/MethodChannel;

    invoke-virtual {v0, p0}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    new-instance v0, Lsh/b;

    invoke-direct {v0}, Lsh/b;-><init>()V

    iput-object v0, p0, Lsh/c;->d:Lsh/b;

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "getApplicationContext(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lsh/c;->u:Landroid/content/Context;

    return-void
.end method

.method public onDetachedFromActivity()V
    .locals 3

    iget-object v0, p0, Lsh/c;->b:Landroid/media/MediaRecorder;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/media/MediaRecorder;->release()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lsh/c;->b:Landroid/media/MediaRecorder;

    iget-object v1, p0, Lsh/c;->v:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->clear()V

    iget-object v1, p0, Lsh/c;->w:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->clear()V

    iput-object v0, p0, Lsh/c;->c:Landroid/app/Activity;

    iget-object v1, p0, Lsh/c;->x:Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;

    if-eqz v1, :cond_2

    invoke-static {v1}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    iget-object v2, p0, Lsh/c;->d:Lsh/b;

    if-nez v2, :cond_1

    const-string v2, "audioRecorder"

    invoke-static {v2}, Lkotlin/jvm/internal/n;->p(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v0, v2

    :goto_0
    invoke-interface {v1, v0}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->removeRequestPermissionsResultListener(Lio/flutter/plugin/common/PluginRegistry$RequestPermissionsResultListener;)V

    :cond_2
    return-void
.end method

.method public onDetachedFromActivityForConfigChanges()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lsh/c;->c:Landroid/app/Activity;

    return-void
.end method

.method public onDetachedFromEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lsh/c;->a:Lio/flutter/plugin/common/MethodChannel;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    const-string p1, "channel"

    invoke-static {p1}, Lkotlin/jvm/internal/n;->p(Ljava/lang/String;)V

    move-object p1, v0

    :cond_0
    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    return-void
.end method

.method public onMethodCall(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 11

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "result"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Lio/flutter/plugin/common/MethodCall;->method:Ljava/lang/String;

    if-eqz v0, :cond_28

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const-string v2, "volume"

    const/4 v3, 0x0

    const-string v4, "path"

    const-string v5, "audioRecorder"

    const-string v6, ""

    const-string v7, "Player key can\'t be null"

    const-string v8, "AudioWaveforms"

    const-string v9, "playerKey"

    const/4 v10, 0x0

    sparse-switch v1, :sswitch_data_0

    goto/16 :goto_c

    :sswitch_0
    const-string v1, "setRate"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_c

    :cond_0
    const-string v0, "rate"

    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {p1, v9}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_27

    iget-object v1, p0, Lsh/c;->v:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lsh/a;

    if-eqz p1, :cond_29

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    double-to-float v0, v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v10

    :cond_1
    invoke-virtual {p1, v10, p2}, Lsh/a;->p(Ljava/lang/Float;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_d

    :sswitch_1
    const-string v1, "initRecorder"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_c

    :cond_2
    invoke-virtual {p1, v4}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lsh/c;->e:Ljava/lang/String;

    const-string v0, "encoder"

    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0

    :cond_3
    move v0, v3

    :goto_0
    iput v0, p0, Lsh/c;->f:I

    const-string v0, "outputFormat"

    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    :cond_4
    iput v3, p0, Lsh/c;->r:I

    const-string v0, "sampleRate"

    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_1

    :cond_5
    const v0, 0xac44

    :goto_1
    iput v0, p0, Lsh/c;->s:I

    const-string v0, "bitRate"

    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Ljava/lang/Integer;

    iput-object v5, p0, Lsh/c;->t:Ljava/lang/Integer;

    iget v2, p0, Lsh/c;->f:I

    iget v3, p0, Lsh/c;->r:I

    iget v4, p0, Lsh/c;->s:I

    move-object v0, p0

    move-object v1, p2

    invoke-direct/range {v0 .. v5}, Lsh/c;->b(Lio/flutter/plugin/common/MethodChannel$Result;IIILjava/lang/Integer;)V

    goto/16 :goto_d

    :sswitch_2
    const-string v1, "preparePlayer"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto/16 :goto_c

    :cond_6
    invoke-virtual {p1, v4}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1, v2}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Double;

    invoke-virtual {p1, v9}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v3, "updateFrequency"

    invoke-virtual {p1, v3}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-eqz v2, :cond_27

    invoke-direct {p0, v2}, Lsh/c;->e(Ljava/lang/String;)V

    iget-object v3, p0, Lsh/c;->v:Ljava/util/Map;

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lsh/a;

    if-eqz v2, :cond_29

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    double-to-float v1, v3

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v10

    :cond_7
    invoke-direct {p0, p1}, Lsh/c;->d(Ljava/lang/Integer;)Lsh/h;

    move-result-object p1

    invoke-virtual {v2, p2, v0, v10, p1}, Lsh/a;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Ljava/lang/Float;Lsh/h;)V

    goto/16 :goto_d

    :sswitch_3
    const-string p1, "resumeRecording"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    goto/16 :goto_c

    :cond_8
    iget-object p1, p0, Lsh/c;->d:Lsh/b;

    if-nez p1, :cond_9

    invoke-static {v5}, Lkotlin/jvm/internal/n;->p(Ljava/lang/String;)V

    goto :goto_2

    :cond_9
    move-object v10, p1

    :goto_2
    iget-object p1, p0, Lsh/c;->b:Landroid/media/MediaRecorder;

    invoke-virtual {v10, p2, p1}, Lsh/b;->i(Lio/flutter/plugin/common/MethodChannel$Result;Landroid/media/MediaRecorder;)V

    goto/16 :goto_d

    :sswitch_4
    const-string p1, "checkPermission"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    goto/16 :goto_c

    :cond_a
    iget-object p1, p0, Lsh/c;->d:Lsh/b;

    if-nez p1, :cond_b

    invoke-static {v5}, Lkotlin/jvm/internal/n;->p(Ljava/lang/String;)V

    goto :goto_3

    :cond_b
    move-object v10, p1

    :goto_3
    iget-object p1, p0, Lsh/c;->c:Landroid/app/Activity;

    new-instance v0, Lsh/c$b;

    invoke-direct {v0, p2}, Lsh/c$b;-><init>(Lio/flutter/plugin/common/MethodChannel$Result;)V

    invoke-virtual {v10, p2, p1, v0}, Lsh/b;->a(Lio/flutter/plugin/common/MethodChannel$Result;Landroid/app/Activity;Lsh/g;)V

    goto/16 :goto_d

    :sswitch_5
    const-string v1, "setVolume"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    goto/16 :goto_c

    :cond_c
    invoke-virtual {p1, v2}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {p1, v9}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_27

    iget-object v1, p0, Lsh/c;->v:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lsh/a;

    if-eqz p1, :cond_29

    if-eqz v0, :cond_d

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    double-to-float v0, v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v10

    :cond_d
    invoke-virtual {p1, v10, p2}, Lsh/a;->q(Ljava/lang/Float;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_d

    :sswitch_6
    const-string v1, "startRecording"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    goto/16 :goto_c

    :cond_e
    const-string v0, "useLegacyNormalization"

    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    if-eqz p1, :cond_f

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    :cond_f
    iget-object p1, p0, Lsh/c;->d:Lsh/b;

    if-nez p1, :cond_10

    invoke-static {v5}, Lkotlin/jvm/internal/n;->p(Ljava/lang/String;)V

    goto :goto_4

    :cond_10
    move-object v10, p1

    :goto_4
    iget-object p1, p0, Lsh/c;->b:Landroid/media/MediaRecorder;

    invoke-virtual {v10, p2, p1, v3}, Lsh/b;->j(Lio/flutter/plugin/common/MethodChannel$Result;Landroid/media/MediaRecorder;Z)V

    goto/16 :goto_d

    :sswitch_7
    const-string v1, "getDuration"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_11

    goto/16 :goto_c

    :cond_11
    const-string v0, "durationType"

    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_12

    goto :goto_5

    :cond_12
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_13

    sget-object v0, Lsh/d;->Current:Lsh/d;

    goto :goto_6

    :cond_13
    :goto_5
    sget-object v0, Lsh/d;->Max:Lsh/d;

    :goto_6
    invoke-virtual {p1, v9}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_27

    iget-object v1, p0, Lsh/c;->v:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lsh/a;

    if-eqz p1, :cond_29

    invoke-virtual {p1, p2, v0}, Lsh/a;->k(Lio/flutter/plugin/common/MethodChannel$Result;Lsh/d;)V

    goto/16 :goto_d

    :sswitch_8
    const-string v1, "extractWaveformData"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_14

    goto/16 :goto_c

    :cond_14
    invoke-virtual {p1, v9}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1, v4}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "noOfSamples"

    invoke-virtual {p1, v2}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-eqz v0, :cond_27

    if-eqz p1, :cond_15

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_7

    :cond_15
    const/16 p1, 0x64

    :goto_7
    invoke-direct {p0, v0, p1, v1, p2}, Lsh/c;->c(Ljava/lang/String;ILjava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_d

    :sswitch_9
    const-string v1, "seekTo"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_16

    goto/16 :goto_c

    :cond_16
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_18

    const-string v0, "progress"

    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {p1, v9}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_27

    iget-object v1, p0, Lsh/c;->v:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lsh/a;

    if-eqz p1, :cond_29

    if-eqz v0, :cond_17

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v0, v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    :cond_17
    invoke-virtual {p1, p2, v10}, Lsh/a;->o(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Long;)V

    goto/16 :goto_d

    :cond_18
    const-string p1, "Minimum android O is required for seekTo function to works"

    invoke-static {v8, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_d

    :sswitch_a
    const-string p1, "stopRecording"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_19

    goto/16 :goto_c

    :cond_19
    iget-object p1, p0, Lsh/c;->d:Lsh/b;

    if-nez p1, :cond_1a

    invoke-static {v5}, Lkotlin/jvm/internal/n;->p(Ljava/lang/String;)V

    move-object p1, v10

    :cond_1a
    iget-object v0, p0, Lsh/c;->b:Landroid/media/MediaRecorder;

    iget-object v1, p0, Lsh/c;->e:Ljava/lang/String;

    invoke-static {v1}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-virtual {p1, p2, v0, v1}, Lsh/b;->k(Lio/flutter/plugin/common/MethodChannel$Result;Landroid/media/MediaRecorder;Ljava/lang/String;)V

    iput-object v10, p0, Lsh/c;->b:Landroid/media/MediaRecorder;

    goto/16 :goto_d

    :sswitch_b
    const-string v1, "releasePlayer"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1b

    goto/16 :goto_c

    :cond_1b
    invoke-virtual {p1, v9}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iget-object v0, p0, Lsh/c;->v:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lsh/a;

    if-eqz p1, :cond_29

    invoke-virtual {p1, p2}, Lsh/a;->n(Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_d

    :sswitch_c
    const-string p1, "stopAllPlayers"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1c

    goto/16 :goto_c

    :cond_1c
    iget-object p1, p0, Lsh/c;->v:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1e

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lsh/c;->v:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lsh/a;

    if-eqz v1, :cond_1d

    invoke-virtual {v1, p2}, Lsh/a;->t(Lio/flutter/plugin/common/MethodChannel$Result;)V

    :cond_1d
    iget-object v1, p0, Lsh/c;->v:Ljava/util/Map;

    invoke-interface {v1, v0, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_8

    :cond_1e
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p2, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    goto/16 :goto_d

    :sswitch_d
    const-string p1, "pauseRecording"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1f

    goto/16 :goto_c

    :cond_1f
    iget-object p1, p0, Lsh/c;->d:Lsh/b;

    if-nez p1, :cond_20

    invoke-static {v5}, Lkotlin/jvm/internal/n;->p(Ljava/lang/String;)V

    goto :goto_9

    :cond_20
    move-object v10, p1

    :goto_9
    iget-object p1, p0, Lsh/c;->b:Landroid/media/MediaRecorder;

    invoke-virtual {v10, p2, p1}, Lsh/b;->h(Lio/flutter/plugin/common/MethodChannel$Result;Landroid/media/MediaRecorder;)V

    goto/16 :goto_d

    :sswitch_e
    const-string v1, "stopPlayer"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_21

    goto/16 :goto_c

    :cond_21
    invoke-virtual {p1, v9}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_27

    iget-object v0, p0, Lsh/c;->v:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lsh/a;

    if-eqz p1, :cond_29

    invoke-virtual {p1, p2}, Lsh/a;->t(Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_d

    :sswitch_f
    const-string p1, "getDecibel"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_22

    goto/16 :goto_c

    :cond_22
    iget-object p1, p0, Lsh/c;->d:Lsh/b;

    if-nez p1, :cond_23

    invoke-static {v5}, Lkotlin/jvm/internal/n;->p(Ljava/lang/String;)V

    goto :goto_a

    :cond_23
    move-object v10, p1

    :goto_a
    iget-object p1, p0, Lsh/c;->b:Landroid/media/MediaRecorder;

    invoke-virtual {v10, p2, p1}, Lsh/b;->b(Lio/flutter/plugin/common/MethodChannel$Result;Landroid/media/MediaRecorder;)V

    goto :goto_d

    :sswitch_10
    const-string v1, "pausePlayer"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_24

    goto :goto_c

    :cond_24
    invoke-virtual {p1, v9}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_27

    iget-object v0, p0, Lsh/c;->v:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lsh/a;

    if-eqz p1, :cond_29

    invoke-virtual {p1, p2}, Lsh/a;->l(Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto :goto_d

    :sswitch_11
    const-string v1, "startPlayer"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_25

    goto :goto_c

    :cond_25
    const-string v0, "finishMode"

    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {p1, v9}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_27

    iget-object v1, p0, Lsh/c;->v:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lsh/a;

    if-eqz p1, :cond_29

    if-eqz v0, :cond_26

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_b

    :cond_26
    const/4 v0, 0x2

    :goto_b
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lsh/a;->r(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Integer;)V

    goto :goto_d

    :cond_27
    invoke-interface {p2, v8, v7, v6}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_d

    :cond_28
    :goto_c
    invoke-interface {p2}, Lio/flutter/plugin/common/MethodChannel$Result;->notImplemented()V

    :cond_29
    :goto_d
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x74d2061d -> :sswitch_11
        -0x71372389 -> :sswitch_10
        -0x6645d9b4 -> :sswitch_f
        -0x55fffa7d -> :sswitch_e
        -0x54c13365 -> :sswitch_d
        -0x4f99bd8d -> :sswitch_c
        -0x498db238 -> :sswitch_b
        -0x3caf87f1 -> :sswitch_a
        -0x3603e4ed -> :sswitch_9
        -0x21b9058 -> :sswitch_8
        0x51e8b0a -> :sswitch_7
        0x2619a7af -> :sswitch_6
        0x27f73e1c -> :sswitch_5
        0x28e6dcf7 -> :sswitch_4
        0x4246b844 -> :sswitch_3
        0x427772c8 -> :sswitch_2
        0x577a61ee -> :sswitch_1
        0x764f7c62 -> :sswitch_0
    .end sparse-switch
.end method

.method public onReattachedToActivityForConfigChanges(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->getActivity()Landroid/app/Activity;

    move-result-object p1

    iput-object p1, p0, Lsh/c;->c:Landroid/app/Activity;

    return-void
.end method
