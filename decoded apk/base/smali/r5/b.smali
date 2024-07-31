.class public final Lr5/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/embedding/engine/plugins/FlutterPlugin;
.implements Lio/flutter/embedding/engine/plugins/activity/ActivityAware;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr5/b$a;
    }
.end annotation


# static fields
.field public static final e:Lr5/b$a;


# instance fields
.field private a:Lt5/g;

.field private final b:Ly5/c;

.field private c:Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;

.field private d:Lio/flutter/plugin/common/PluginRegistry$RequestPermissionsResultListener;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lr5/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lr5/b$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lr5/b;->e:Lr5/b$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ly5/c;

    invoke-direct {v0}, Ly5/c;-><init>()V

    iput-object v0, p0, Lr5/b;->b:Ly5/c;

    return-void
.end method

.method private final a(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V
    .locals 2

    iget-object v0, p0, Lr5/b;->c:Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;

    if-eqz v0, :cond_0

    invoke-direct {p0, v0}, Lr5/b;->c(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V

    :cond_0
    iput-object p1, p0, Lr5/b;->c:Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;

    iget-object v0, p0, Lr5/b;->a:Lt5/g;

    if-eqz v0, :cond_1

    invoke-interface {p1}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v0, v1}, Lt5/g;->f(Landroid/app/Activity;)V

    :cond_1
    invoke-direct {p0, p1}, Lr5/b;->b(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V

    return-void
.end method

.method private final b(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V
    .locals 2

    sget-object v0, Lr5/b;->e:Lr5/b$a;

    iget-object v1, p0, Lr5/b;->b:Ly5/c;

    invoke-virtual {v0, v1}, Lr5/b$a;->b(Ly5/c;)Lio/flutter/plugin/common/PluginRegistry$RequestPermissionsResultListener;

    move-result-object v0

    iput-object v0, p0, Lr5/b;->d:Lio/flutter/plugin/common/PluginRegistry$RequestPermissionsResultListener;

    invoke-interface {p1, v0}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->addRequestPermissionsResultListener(Lio/flutter/plugin/common/PluginRegistry$RequestPermissionsResultListener;)V

    iget-object v0, p0, Lr5/b;->a:Lt5/g;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lt5/g;->g()Lt5/e;

    move-result-object v0

    invoke-interface {p1, v0}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->addActivityResultListener(Lio/flutter/plugin/common/PluginRegistry$ActivityResultListener;)V

    :cond_0
    return-void
.end method

.method private final c(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V
    .locals 1

    iget-object v0, p0, Lr5/b;->d:Lio/flutter/plugin/common/PluginRegistry$RequestPermissionsResultListener;

    if-eqz v0, :cond_0

    invoke-interface {p1, v0}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->removeRequestPermissionsResultListener(Lio/flutter/plugin/common/PluginRegistry$RequestPermissionsResultListener;)V

    :cond_0
    iget-object v0, p0, Lr5/b;->a:Lt5/g;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lt5/g;->g()Lt5/e;

    move-result-object v0

    invoke-interface {p1, v0}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->removeActivityResultListener(Lio/flutter/plugin/common/PluginRegistry$ActivityResultListener;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public onAttachedToActivity(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lr5/b;->a(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V

    return-void
.end method

.method public onAttachedToEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
    .locals 6

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lt5/g;

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "getApplicationContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    move-result-object v2

    const-string v3, "getBinaryMessenger(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    iget-object v5, p0, Lr5/b;->b:Ly5/c;

    invoke-direct {v0, v1, v2, v4, v5}, Lt5/g;-><init>(Landroid/content/Context;Lio/flutter/plugin/common/BinaryMessenger;Landroid/app/Activity;Ly5/c;)V

    sget-object v1, Lr5/b;->e:Lr5/b$a;

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v0, p1}, Lr5/b$a;->d(Lt5/g;Lio/flutter/plugin/common/BinaryMessenger;)V

    iput-object v0, p0, Lr5/b;->a:Lt5/g;

    return-void
.end method

.method public onDetachedFromActivity()V
    .locals 2

    iget-object v0, p0, Lr5/b;->c:Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;

    if-eqz v0, :cond_0

    invoke-direct {p0, v0}, Lr5/b;->c(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V

    :cond_0
    iget-object v0, p0, Lr5/b;->a:Lt5/g;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0, v1}, Lt5/g;->f(Landroid/app/Activity;)V

    :cond_1
    iput-object v1, p0, Lr5/b;->c:Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;

    return-void
.end method

.method public onDetachedFromActivityForConfigChanges()V
    .locals 2

    iget-object v0, p0, Lr5/b;->a:Lt5/g;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lt5/g;->f(Landroid/app/Activity;)V

    :cond_0
    return-void
.end method

.method public onDetachedFromEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lr5/b;->a:Lt5/g;

    return-void
.end method

.method public onReattachedToActivityForConfigChanges(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lr5/b;->a(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V

    return-void
.end method
