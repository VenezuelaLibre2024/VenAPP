.class public final Lmi/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/embedding/engine/plugins/FlutterPlugin;
.implements Lio/flutter/embedding/engine/plugins/activity/ActivityAware;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmi/c$a;
    }
.end annotation


# static fields
.field public static final d:Lmi/c$a;


# instance fields
.field private a:Lmi/b;

.field private b:Lmi/d;

.field private c:Lio/flutter/plugin/common/MethodChannel;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lmi/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lmi/c$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lmi/c;->d:Lmi/c$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAttachedToActivity(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V
    .locals 2

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lmi/c;->b:Lmi/d;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "manager"

    invoke-static {v0}, Lkotlin/jvm/internal/n;->p(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    invoke-interface {p1, v0}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->addActivityResultListener(Lio/flutter/plugin/common/PluginRegistry$ActivityResultListener;)V

    iget-object v0, p0, Lmi/c;->a:Lmi/b;

    if-nez v0, :cond_1

    const-string v0, "share"

    invoke-static {v0}, Lkotlin/jvm/internal/n;->p(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v1, v0

    :goto_0
    invoke-interface {p1}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->getActivity()Landroid/app/Activity;

    move-result-object p1

    invoke-virtual {v1, p1}, Lmi/b;->m(Landroid/app/Activity;)V

    return-void
.end method

.method public onAttachedToEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
    .locals 4

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/flutter/plugin/common/MethodChannel;

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    move-result-object v1

    const-string v2, "dev.fluttercommunity.plus/share"

    invoke-direct {v0, v1, v2}, Lio/flutter/plugin/common/MethodChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V

    iput-object v0, p0, Lmi/c;->c:Lio/flutter/plugin/common/MethodChannel;

    new-instance v0, Lmi/d;

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "getApplicationContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lmi/d;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lmi/c;->b:Lmi/d;

    invoke-virtual {v0}, Lmi/d;->b()V

    new-instance v0, Lmi/b;

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lmi/c;->b:Lmi/d;

    const-string v2, "manager"

    const/4 v3, 0x0

    if-nez v1, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/n;->p(Ljava/lang/String;)V

    move-object v1, v3

    :cond_0
    invoke-direct {v0, p1, v3, v1}, Lmi/b;-><init>(Landroid/content/Context;Landroid/app/Activity;Lmi/d;)V

    iput-object v0, p0, Lmi/c;->a:Lmi/b;

    new-instance p1, Lmi/a;

    iget-object v1, p0, Lmi/c;->b:Lmi/d;

    if-nez v1, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/n;->p(Ljava/lang/String;)V

    move-object v1, v3

    :cond_1
    invoke-direct {p1, v0, v1}, Lmi/a;-><init>(Lmi/b;Lmi/d;)V

    iget-object v0, p0, Lmi/c;->c:Lio/flutter/plugin/common/MethodChannel;

    if-nez v0, :cond_2

    const-string v0, "methodChannel"

    invoke-static {v0}, Lkotlin/jvm/internal/n;->p(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    move-object v3, v0

    :goto_0
    invoke-virtual {v3, p1}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    return-void
.end method

.method public onDetachedFromActivity()V
    .locals 2

    iget-object v0, p0, Lmi/c;->a:Lmi/b;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "share"

    invoke-static {v0}, Lkotlin/jvm/internal/n;->p(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    invoke-virtual {v0, v1}, Lmi/b;->m(Landroid/app/Activity;)V

    return-void
.end method

.method public onDetachedFromActivityForConfigChanges()V
    .locals 0

    invoke-virtual {p0}, Lmi/c;->onDetachedFromActivity()V

    return-void
.end method

.method public onDetachedFromEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lmi/c;->b:Lmi/d;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    const-string p1, "manager"

    invoke-static {p1}, Lkotlin/jvm/internal/n;->p(Ljava/lang/String;)V

    move-object p1, v0

    :cond_0
    invoke-virtual {p1}, Lmi/d;->a()V

    iget-object p1, p0, Lmi/c;->c:Lio/flutter/plugin/common/MethodChannel;

    if-nez p1, :cond_1

    const-string p1, "methodChannel"

    invoke-static {p1}, Lkotlin/jvm/internal/n;->p(Ljava/lang/String;)V

    move-object p1, v0

    :cond_1
    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    return-void
.end method

.method public onReattachedToActivityForConfigChanges(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lmi/c;->onAttachedToActivity(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V

    return-void
.end method
