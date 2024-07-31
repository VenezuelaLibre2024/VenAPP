.class public Lhh/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;
.implements Lio/flutter/embedding/engine/plugins/FlutterPlugin;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhh/e$a;,
        Lhh/e$b;
    }
.end annotation


# instance fields
.field private a:Lio/flutter/plugin/common/MethodChannel;

.field private b:Lhh/a;

.field private c:Landroid/os/HandlerThread;

.field private d:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lhh/e;)Lhh/a;
    .locals 0

    iget-object p0, p0, Lhh/e;->b:Lhh/a;

    return-object p0
.end method

.method static synthetic b(Lhh/e;Lio/flutter/plugin/common/MethodCall;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, Lhh/e;->d(Lio/flutter/plugin/common/MethodCall;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic c(Lhh/e;Lio/flutter/plugin/common/MethodCall;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, Lhh/e;->e(Lio/flutter/plugin/common/MethodCall;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private d(Lio/flutter/plugin/common/MethodCall;)Ljava/lang/String;
    .locals 2

    iget-object p1, p1, Lio/flutter/plugin/common/MethodCall;->arguments:Ljava/lang/Object;

    check-cast p1, Ljava/util/Map;

    iget-object v0, p0, Lhh/e;->b:Lhh/a;

    const-string v1, "key"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v0, p1}, Lhh/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private e(Lio/flutter/plugin/common/MethodCall;)Ljava/lang/String;
    .locals 1

    iget-object p1, p1, Lio/flutter/plugin/common/MethodCall;->arguments:Ljava/lang/Object;

    check-cast p1, Ljava/util/Map;

    const-string v0, "value"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method


# virtual methods
.method public f(Lio/flutter/plugin/common/BinaryMessenger;Landroid/content/Context;)V
    .locals 2

    :try_start_0
    new-instance v0, Lhh/a;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-direct {v0, p2, v1}, Lhh/a;-><init>(Landroid/content/Context;Ljava/util/Map;)V

    iput-object v0, p0, Lhh/e;->b:Lhh/a;

    new-instance p2, Landroid/os/HandlerThread;

    const-string v0, "com.it_nomads.fluttersecurestorage.worker"

    invoke-direct {p2, v0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, Lhh/e;->c:Landroid/os/HandlerThread;

    invoke-virtual {p2}, Ljava/lang/Thread;->start()V

    new-instance p2, Landroid/os/Handler;

    iget-object v0, p0, Lhh/e;->c:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p2, p0, Lhh/e;->d:Landroid/os/Handler;

    new-instance p2, Lio/flutter/plugin/common/MethodChannel;

    const-string v0, "plugins.it_nomads.com/flutter_secure_storage"

    invoke-direct {p2, p1, v0}, Lio/flutter/plugin/common/MethodChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V

    iput-object p2, p0, Lhh/e;->a:Lio/flutter/plugin/common/MethodChannel;

    invoke-virtual {p2, p0}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string p2, "FlutterSecureStoragePl"

    const-string v0, "Registration failed"

    invoke-static {p2, v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    return-void
.end method

.method public onAttachedToEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
    .locals 1

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    move-result-object v0

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lhh/e;->f(Lio/flutter/plugin/common/BinaryMessenger;Landroid/content/Context;)V

    return-void
.end method

.method public onDetachedFromEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
    .locals 1

    iget-object p1, p0, Lhh/e;->a:Lio/flutter/plugin/common/MethodChannel;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    iget-object p1, p0, Lhh/e;->c:Landroid/os/HandlerThread;

    invoke-virtual {p1}, Landroid/os/HandlerThread;->quitSafely()Z

    iput-object v0, p0, Lhh/e;->c:Landroid/os/HandlerThread;

    iget-object p1, p0, Lhh/e;->a:Lio/flutter/plugin/common/MethodChannel;

    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    iput-object v0, p0, Lhh/e;->a:Lio/flutter/plugin/common/MethodChannel;

    :cond_0
    iput-object v0, p0, Lhh/e;->b:Lhh/a;

    return-void
.end method

.method public onMethodCall(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    new-instance v0, Lhh/e$a;

    invoke-direct {v0, p2}, Lhh/e$a;-><init>(Lio/flutter/plugin/common/MethodChannel$Result;)V

    iget-object p2, p0, Lhh/e;->d:Landroid/os/Handler;

    new-instance v1, Lhh/e$b;

    invoke-direct {v1, p0, p1, v0}, Lhh/e$b;-><init>(Lhh/e;Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V

    invoke-virtual {p2, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
