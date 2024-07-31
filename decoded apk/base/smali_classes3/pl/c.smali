.class public final Lpl/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugin/platform/PlatformView;
.implements Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;
.implements Lio/flutter/plugin/common/PluginRegistry$RequestPermissionsResultListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpl/c$c;
    }
.end annotation


# static fields
.field public static final u:Lpl/c$c;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:I

.field private final c:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private d:Z

.field private e:Z

.field private f:Lpl/a;

.field private final r:Lio/flutter/plugin/common/MethodChannel;

.field private s:Lpl/g;

.field private final t:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpl/c$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpl/c$c;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lpl/c;->u:Lpl/c$c;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lio/flutter/plugin/common/BinaryMessenger;ILjava/util/HashMap;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lio/flutter/plugin/common/BinaryMessenger;",
            "I",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messenger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpl/c;->a:Landroid/content/Context;

    iput p3, p0, Lpl/c;->b:I

    iput-object p4, p0, Lpl/c;->c:Ljava/util/HashMap;

    new-instance p1, Lio/flutter/plugin/common/MethodChannel;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "net.touchcapture.qr.flutterqr/qrview_"

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-direct {p1, p2, p4}, Lio/flutter/plugin/common/MethodChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V

    iput-object p1, p0, Lpl/c;->r:Lio/flutter/plugin/common/MethodChannel;

    const p2, 0x1e9aed64

    add-int/2addr p3, p2

    iput p3, p0, Lpl/c;->t:I

    sget-object p2, Lpl/f;->a:Lpl/f;

    invoke-virtual {p2}, Lpl/f;->b()Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;

    move-result-object p3

    if-eqz p3, :cond_0

    invoke-interface {p3, p0}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->addRequestPermissionsResultListener(Lio/flutter/plugin/common/PluginRegistry$RequestPermissionsResultListener;)V

    :cond_0
    invoke-virtual {p1, p0}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    invoke-virtual {p2}, Lpl/f;->a()Landroid/app/Activity;

    move-result-object p1

    if-eqz p1, :cond_1

    new-instance p2, Lpl/c$a;

    invoke-direct {p2, p0}, Lpl/c$a;-><init>(Lpl/c;)V

    new-instance p3, Lpl/c$b;

    invoke-direct {p3, p0}, Lpl/c$b;-><init>(Lpl/c;)V

    invoke-static {p1, p2, p3}, Lpl/e;->a(Landroid/app/Activity;Lok/a;Lok/a;)Lpl/g;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lpl/c;->s:Lpl/g;

    return-void
.end method

.method private final A(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 3

    iget-object v0, p0, Lpl/c;->f:Lpl/a;

    if-nez v0, :cond_0

    invoke-direct {p0, p1}, Lpl/c;->f(Lio/flutter/plugin/common/MethodChannel$Result;)V

    return-void

    :cond_0
    invoke-direct {p0}, Lpl/c;->q()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-boolean v1, p0, Lpl/c;->d:Z

    xor-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Lcom/journeyapps/barcodescanner/a;->setTorch(Z)V

    iget-boolean v0, p0, Lpl/c;->d:Z

    xor-int/lit8 v0, v0, 0x1

    iput-boolean v0, p0, Lpl/c;->d:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p1, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    const-string v0, "This device doesn\'t support flash"

    const/4 v1, 0x0

    const-string v2, "404"

    invoke-interface {p1, v2, v0, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public static final synthetic a(Lpl/c;)V
    .locals 0

    invoke-direct {p0}, Lpl/c;->h()V

    return-void
.end method

.method public static final synthetic b(Lpl/c;)Lpl/a;
    .locals 0

    iget-object p0, p0, Lpl/c;->f:Lpl/a;

    return-object p0
.end method

.method public static final synthetic c(Lpl/c;)Lio/flutter/plugin/common/MethodChannel;
    .locals 0

    iget-object p0, p0, Lpl/c;->r:Lio/flutter/plugin/common/MethodChannel;

    return-object p0
.end method

.method public static final synthetic d(Lpl/c;)Z
    .locals 0

    invoke-direct {p0}, Lpl/c;->n()Z

    move-result p0

    return p0
.end method

.method public static final synthetic e(Lpl/c;)Z
    .locals 0

    iget-boolean p0, p0, Lpl/c;->e:Z

    return p0
.end method

.method private final f(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 3

    const-string v0, "No barcode view found"

    const/4 v1, 0x0

    const-string v2, "404"

    invoke-interface {p1, v2, v0, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method private final g(DDDLio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Lpl/c;->x(DDD)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p7, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void
.end method

.method private final h()V
    .locals 3

    invoke-direct {p0}, Lpl/c;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lpl/c;->r:Lio/flutter/plugin/common/MethodChannel;

    const-string v1, "onPermissionSet"

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugin/common/MethodChannel;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_0
    sget-object v0, Lpl/f;->a:Lpl/f;

    invoke-virtual {v0}, Lpl/f;->a()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v1, "android.permission.CAMERA"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Lpl/c;->t:I

    invoke-virtual {v0, v1, v2}, Landroid/app/Activity;->requestPermissions([Ljava/lang/String;I)V

    :cond_1
    return-void
.end method

.method private final i(D)I
    .locals 2

    iget-object v0, p0, Lpl/c;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    float-to-double v0, v0

    mul-double/2addr p1, v0

    double-to-int p1, p1

    return p1
.end method

.method private final j(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 4

    iget-object v0, p0, Lpl/c;->f:Lpl/a;

    if-nez v0, :cond_0

    invoke-direct {p0, p1}, Lpl/c;->f(Lio/flutter/plugin/common/MethodChannel$Result;)V

    return-void

    :cond_0
    invoke-virtual {v0}, Lcom/journeyapps/barcodescanner/BarcodeView;->u()V

    invoke-virtual {v0}, Lcom/journeyapps/barcodescanner/a;->getCameraSettings()Ljh/i;

    move-result-object v1

    invoke-virtual {v1}, Ljh/i;->b()I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljh/i;->i(I)V

    goto :goto_0

    :cond_1
    invoke-virtual {v1, v3}, Ljh/i;->i(I)V

    :goto_0
    invoke-virtual {v0}, Lcom/journeyapps/barcodescanner/a;->y()V

    invoke-virtual {v1}, Ljh/i;->b()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void
.end method

.method private final k(Ljava/util/List;Lio/flutter/plugin/common/MethodChannel$Result;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Lio/flutter/plugin/common/MethodChannel$Result;",
            ")",
            "Ljava/util/List<",
            "Ldg/a;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    :try_start_0
    check-cast p1, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p1, v2}, Ldk/p;->r(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-static {}, Ldg/a;->values()[Ldg/a;

    move-result-object v3

    aget-object v2, v3, v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    move-object v1, v0

    :cond_1
    if-nez v1, :cond_2

    invoke-static {}, Ldk/p;->j()Ljava/util/List;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :goto_1
    const-string v1, ""

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v1, p1, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {}, Ldk/p;->j()Ljava/util/List;

    move-result-object p1

    goto :goto_3

    :cond_2
    :goto_2
    move-object p1, v1

    :goto_3
    return-object p1
.end method

.method private final l(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 1

    iget-object v0, p0, Lpl/c;->f:Lpl/a;

    if-nez v0, :cond_0

    invoke-direct {p0, p1}, Lpl/c;->f(Lio/flutter/plugin/common/MethodChannel$Result;)V

    return-void

    :cond_0
    invoke-virtual {v0}, Lcom/journeyapps/barcodescanner/a;->getCameraSettings()Ljh/i;

    move-result-object v0

    invoke-virtual {v0}, Ljh/i;->b()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void
.end method

.method private final m(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 1

    iget-object v0, p0, Lpl/c;->f:Lpl/a;

    if-nez v0, :cond_0

    invoke-direct {p0, p1}, Lpl/c;->f(Lio/flutter/plugin/common/MethodChannel$Result;)V

    return-void

    :cond_0
    iget-boolean v0, p0, Lpl/c;->d:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p1, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void
.end method

.method private final n()Z
    .locals 2

    iget-object v0, p0, Lpl/c;->a:Landroid/content/Context;

    const-string v1, "android.permission.CAMERA"

    invoke-static {v0, v1}, Landroidx/core/content/a;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private final o(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 4

    const/4 v0, 0x4

    const/4 v1, 0x0

    :try_start_0
    new-array v0, v0, [Lck/m;

    const-string v2, "hasFrontCamera"

    invoke-direct {p0}, Lpl/c;->r()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v2, v3}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v0, v3

    const-string v2, "hasBackCamera"

    invoke-direct {p0}, Lpl/c;->p()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v2, v3}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v0, v3

    const-string v2, "hasFlash"

    invoke-direct {p0}, Lpl/c;->q()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v2, v3}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v0, v3

    const-string v2, "activeCamera"

    iget-object v3, p0, Lpl/c;->f:Lpl/a;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lcom/journeyapps/barcodescanner/a;->getCameraSettings()Ljh/i;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljh/i;->b()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    goto :goto_0

    :cond_0
    move-object v3, v1

    :goto_0
    invoke-static {v2, v3}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v0, v3

    invoke-static {v0}, Ldk/h0;->k([Lck/m;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {p1, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    const-string v2, ""

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v2, v0, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_1
    return-void
.end method

.method private final p()Z
    .locals 1

    const-string v0, "android.hardware.camera"

    invoke-direct {p0, v0}, Lpl/c;->s(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private final q()Z
    .locals 1

    const-string v0, "android.hardware.camera.flash"

    invoke-direct {p0, v0}, Lpl/c;->s(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private final r()Z
    .locals 1

    const-string v0, "android.hardware.camera.front"

    invoke-direct {p0, v0}, Lpl/c;->s(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private final s(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lpl/c;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method private final t()Lpl/a;
    .locals 4

    iget-object v0, p0, Lpl/c;->f:Lpl/a;

    if-nez v0, :cond_1

    new-instance v0, Lpl/a;

    sget-object v1, Lpl/f;->a:Lpl/f;

    invoke-virtual {v1}, Lpl/f;->a()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, Lpl/a;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lpl/c;->f:Lpl/a;

    new-instance v1, Lih/j;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v1, v3, v3, v3, v2}, Lih/j;-><init>(Ljava/util/Collection;Ljava/util/Map;Ljava/lang/String;I)V

    invoke-virtual {v0, v1}, Lcom/journeyapps/barcodescanner/BarcodeView;->setDecoderFactory(Lih/g;)V

    iget-object v1, p0, Lpl/c;->c:Ljava/util/HashMap;

    const-string v2, "cameraFacing"

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type kotlin.Int"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_2

    invoke-virtual {v0}, Lcom/journeyapps/barcodescanner/a;->getCameraSettings()Ljh/i;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1, v2}, Ljh/i;->i(I)V

    goto :goto_0

    :cond_1
    iget-boolean v1, p0, Lpl/c;->e:Z

    if-nez v1, :cond_2

    invoke-virtual {v0}, Lcom/journeyapps/barcodescanner/a;->y()V

    :cond_2
    :goto_0
    return-object v0
.end method

.method private final u(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    iget-object v0, p0, Lpl/c;->f:Lpl/a;

    if-nez v0, :cond_0

    invoke-direct {p0, p1}, Lpl/c;->f(Lio/flutter/plugin/common/MethodChannel$Result;)V

    return-void

    :cond_0
    invoke-virtual {v0}, Lcom/journeyapps/barcodescanner/a;->t()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    iput-boolean v1, p0, Lpl/c;->e:Z

    invoke-virtual {v0}, Lcom/journeyapps/barcodescanner/BarcodeView;->u()V

    :cond_1
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p1, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void
.end method

.method private final v(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    iget-object v0, p0, Lpl/c;->f:Lpl/a;

    if-nez v0, :cond_0

    invoke-direct {p0, p1}, Lpl/c;->f(Lio/flutter/plugin/common/MethodChannel$Result;)V

    return-void

    :cond_0
    invoke-virtual {v0}, Lcom/journeyapps/barcodescanner/a;->t()Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v1, 0x0

    iput-boolean v1, p0, Lpl/c;->e:Z

    invoke-virtual {v0}, Lcom/journeyapps/barcodescanner/a;->y()V

    :cond_1
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p1, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void
.end method

.method private final w(Z)V
    .locals 2

    iget-object v0, p0, Lpl/c;->f:Lpl/a;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Lcom/journeyapps/barcodescanner/BarcodeView;->u()V

    invoke-virtual {v0}, Lcom/journeyapps/barcodescanner/a;->getCameraSettings()Ljh/i;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljh/i;->j(Z)V

    invoke-virtual {v0}, Lcom/journeyapps/barcodescanner/a;->y()V

    return-void
.end method

.method private final x(DDD)V
    .locals 1

    iget-object v0, p0, Lpl/c;->f:Lpl/a;

    if-eqz v0, :cond_0

    invoke-direct {p0, p1, p2}, Lpl/c;->i(D)I

    move-result p1

    invoke-direct {p0, p3, p4}, Lpl/c;->i(D)I

    move-result p2

    invoke-direct {p0, p5, p6}, Lpl/c;->i(D)I

    move-result p3

    invoke-virtual {v0, p1, p2, p3}, Lpl/a;->O(III)V

    :cond_0
    return-void
.end method

.method private final y(Ljava/util/List;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Lio/flutter/plugin/common/MethodChannel$Result;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lpl/c;->h()V

    invoke-direct {p0, p1, p2}, Lpl/c;->k(Ljava/util/List;Lio/flutter/plugin/common/MethodChannel$Result;)Ljava/util/List;

    move-result-object p1

    iget-object p2, p0, Lpl/c;->f:Lpl/a;

    if-eqz p2, :cond_0

    new-instance v0, Lpl/c$d;

    invoke-direct {v0, p1, p0}, Lpl/c$d;-><init>(Ljava/util/List;Lpl/c;)V

    invoke-virtual {p2, v0}, Lcom/journeyapps/barcodescanner/BarcodeView;->I(Lih/a;)V

    :cond_0
    return-void
.end method

.method private final z()V
    .locals 1

    iget-object v0, p0, Lpl/c;->f:Lpl/a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/journeyapps/barcodescanner/BarcodeView;->N()V

    :cond_0
    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 1

    iget-object v0, p0, Lpl/c;->s:Lpl/g;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lpl/g;->a()V

    :cond_0
    sget-object v0, Lpl/f;->a:Lpl/f;

    invoke-virtual {v0}, Lpl/f;->b()Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0, p0}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->removeRequestPermissionsResultListener(Lio/flutter/plugin/common/PluginRegistry$RequestPermissionsResultListener;)V

    :cond_1
    iget-object v0, p0, Lpl/c;->f:Lpl/a;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/journeyapps/barcodescanner/BarcodeView;->u()V

    :cond_2
    const/4 v0, 0x0

    iput-object v0, p0, Lpl/c;->f:Lpl/a;

    return-void
.end method

.method public getView()Landroid/view/View;
    .locals 1

    invoke-direct {p0}, Lpl/c;->t()Lpl/a;

    move-result-object v0

    return-object v0
.end method

.method public onMethodCall(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 11

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "result"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Lio/flutter/plugin/common/MethodCall;->method:Ljava/lang/String;

    if-eqz v0, :cond_11

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    goto/16 :goto_1

    :sswitch_0
    const-string p1, "pauseCamera"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    goto/16 :goto_1

    :sswitch_1
    const-string p1, "getCameraInfo"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto/16 :goto_1

    :cond_0
    invoke-direct {p0, p2}, Lpl/c;->l(Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_2

    :sswitch_2
    const-string v1, "invertScan"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_1

    :cond_1
    const-string p2, "isInvertScan"

    invoke-virtual {p1, p2}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    if-nez p1, :cond_2

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :cond_2
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-direct {p0, p1}, Lpl/c;->w(Z)V

    goto/16 :goto_2

    :sswitch_3
    const-string p1, "stopScan"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto/16 :goto_1

    :cond_3
    invoke-direct {p0}, Lpl/c;->z()V

    goto/16 :goto_2

    :sswitch_4
    const-string p1, "requestPermissions"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto/16 :goto_1

    :cond_4
    invoke-direct {p0}, Lpl/c;->h()V

    goto/16 :goto_2

    :sswitch_5
    const-string p1, "resumeCamera"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto/16 :goto_1

    :cond_5
    invoke-direct {p0, p2}, Lpl/c;->v(Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_2

    :sswitch_6
    const-string p1, "flipCamera"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto/16 :goto_1

    :cond_6
    invoke-direct {p0, p2}, Lpl/c;->j(Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_2

    :sswitch_7
    const-string p1, "toggleFlash"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto/16 :goto_1

    :cond_7
    invoke-direct {p0, p2}, Lpl/c;->A(Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_2

    :sswitch_8
    const-string p1, "getFlashInfo"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    goto/16 :goto_1

    :cond_8
    invoke-direct {p0, p2}, Lpl/c;->m(Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_2

    :sswitch_9
    const-string v1, "changeScanArea"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto/16 :goto_1

    :cond_9
    const-string v0, "scanAreaWidth"

    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "Required value was null."

    if-eqz v0, :cond_c

    const-string v2, "requireNotNull(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    const-string v0, "scanAreaHeight"

    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_b

    invoke-static {v0, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v6

    const-string v0, "cutOutBottomOffset"

    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_a

    invoke-static {p1, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v8

    move-object v3, p0

    move-object v10, p2

    invoke-direct/range {v3 .. v10}, Lpl/c;->g(DDDLio/flutter/plugin/common/MethodChannel$Result;)V

    goto :goto_2

    :cond_a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :sswitch_a
    const-string p1, "stopCamera"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    goto :goto_1

    :cond_d
    invoke-direct {p0, p2}, Lpl/c;->u(Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto :goto_2

    :sswitch_b
    const-string p1, "getSystemFeatures"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_e

    goto :goto_1

    :cond_e
    invoke-direct {p0, p2}, Lpl/c;->o(Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto :goto_2

    :sswitch_c
    const-string v1, "startScan"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    goto :goto_1

    :cond_f
    iget-object p1, p1, Lio/flutter/plugin/common/MethodCall;->arguments:Ljava/lang/Object;

    instance-of v0, p1, Ljava/util/List;

    if-eqz v0, :cond_10

    check-cast p1, Ljava/util/List;

    goto :goto_0

    :cond_10
    const/4 p1, 0x0

    :goto_0
    invoke-direct {p0, p1, p2}, Lpl/c;->y(Ljava/util/List;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto :goto_2

    :cond_11
    :goto_1
    invoke-interface {p2}, Lio/flutter/plugin/common/MethodChannel$Result;->notImplemented()V

    :goto_2
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7eeb0201 -> :sswitch_c
        -0x7dc6177e -> :sswitch_b
        -0x6cc4d239 -> :sswitch_a
        -0x4621b386 -> :sswitch_9
        -0x44f93df8 -> :sswitch_8
        -0x27ddc704 -> :sswitch_7
        0x1a15e9f2 -> :sswitch_6
        0x3d2ee1b2 -> :sswitch_5
        0x637dca75 -> :sswitch_4
        0x6635719f -> :sswitch_3
        0x71397f73 -> :sswitch_2
        0x764d3969 -> :sswitch_1
        0x780404bb -> :sswitch_0
    .end sparse-switch
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)Z
    .locals 1

    const-string v0, "permissions"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "grantResults"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget p2, p0, Lpl/c;->t:I

    const/4 v0, 0x0

    if-eq p1, p2, :cond_0

    return v0

    :cond_0
    invoke-static {p3}, Ldk/i;->v([I)Ljava/lang/Integer;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-nez p1, :cond_2

    const/4 v0, 0x1

    :cond_2
    :goto_0
    iget-object p1, p0, Lpl/c;->r:Lio/flutter/plugin/common/MethodChannel;

    const-string p2, "onPermissionSet"

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Lio/flutter/plugin/common/MethodChannel;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    return v0
.end method
