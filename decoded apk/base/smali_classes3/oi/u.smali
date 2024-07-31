.class public final Loi/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;


# instance fields
.field private final a:Landroid/app/Activity;

.field private final b:Loi/d;

.field private final c:Loi/x;

.field private final d:Lok/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lok/l<",
            "Lio/flutter/plugin/common/PluginRegistry$RequestPermissionsResultListener;",
            "Lck/v;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lok/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lok/l<",
            "Ljava/util/List<",
            "+",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;>;",
            "Lck/v;",
            ">;"
        }
    .end annotation
.end field

.field private f:Lio/flutter/plugin/common/MethodChannel$Result;

.field private final r:Lok/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lok/r<",
            "Ljava/util/List<",
            "+",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;>;[B",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Lck/v;",
            ">;"
        }
    .end annotation
.end field

.field private final s:Lok/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lok/l<",
            "Ljava/lang/String;",
            "Lck/v;",
            ">;"
        }
    .end annotation
.end field

.field private t:Lio/flutter/plugin/common/MethodChannel;

.field private u:Loi/s;

.field private final v:Lok/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lok/l<",
            "Ljava/lang/Integer;",
            "Lck/v;",
            ">;"
        }
    .end annotation
.end field

.field private final w:Lok/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lok/l<",
            "Ljava/lang/Double;",
            "Lck/v;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/app/Activity;Loi/d;Lio/flutter/plugin/common/BinaryMessenger;Loi/x;Lok/l;Lio/flutter/view/TextureRegistry;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Loi/d;",
            "Lio/flutter/plugin/common/BinaryMessenger;",
            "Loi/x;",
            "Lok/l<",
            "-",
            "Lio/flutter/plugin/common/PluginRegistry$RequestPermissionsResultListener;",
            "Lck/v;",
            ">;",
            "Lio/flutter/view/TextureRegistry;",
            ")V"
        }
    .end annotation

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "barcodeHandler"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "binaryMessenger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "permissions"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "addPermissionListener"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textureRegistry"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Loi/u;->a:Landroid/app/Activity;

    iput-object p2, p0, Loi/u;->b:Loi/d;

    iput-object p4, p0, Loi/u;->c:Loi/x;

    iput-object p5, p0, Loi/u;->d:Lok/l;

    new-instance p2, Loi/u$a;

    invoke-direct {p2, p0}, Loi/u$a;-><init>(Loi/u;)V

    iput-object p2, p0, Loi/u;->e:Lok/l;

    new-instance p2, Loi/u$b;

    invoke-direct {p2, p0}, Loi/u$b;-><init>(Loi/u;)V

    iput-object p2, p0, Loi/u;->r:Lok/r;

    new-instance p4, Loi/u$c;

    invoke-direct {p4, p0}, Loi/u$c;-><init>(Loi/u;)V

    iput-object p4, p0, Loi/u;->s:Lok/l;

    new-instance p5, Loi/u$g;

    invoke-direct {p5, p0}, Loi/u$g;-><init>(Loi/u;)V

    iput-object p5, p0, Loi/u;->v:Lok/l;

    new-instance p5, Loi/u$h;

    invoke-direct {p5, p0}, Loi/u$h;-><init>(Loi/u;)V

    iput-object p5, p0, Loi/u;->w:Lok/l;

    new-instance p5, Lio/flutter/plugin/common/MethodChannel;

    const-string v0, "dev.steenbakker.mobile_scanner/scanner/method"

    invoke-direct {p5, p3, v0}, Lio/flutter/plugin/common/MethodChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V

    iput-object p5, p0, Loi/u;->t:Lio/flutter/plugin/common/MethodChannel;

    invoke-static {p5}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-virtual {p5, p0}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    new-instance p3, Loi/s;

    invoke-direct {p3, p1, p6, p2, p4}, Loi/s;-><init>(Landroid/app/Activity;Lio/flutter/view/TextureRegistry;Lok/r;Lok/l;)V

    iput-object p3, p0, Loi/u;->u:Loi/s;

    return-void
.end method

.method public static final synthetic a(Loi/u;)Lio/flutter/plugin/common/MethodChannel$Result;
    .locals 0

    iget-object p0, p0, Loi/u;->f:Lio/flutter/plugin/common/MethodChannel$Result;

    return-object p0
.end method

.method public static final synthetic b(Loi/u;)Loi/d;
    .locals 0

    iget-object p0, p0, Loi/u;->b:Loi/d;

    return-object p0
.end method

.method public static final synthetic c(Loi/u;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 0

    iput-object p1, p0, Loi/u;->f:Lio/flutter/plugin/common/MethodChannel$Result;

    return-void
.end method

.method private final d(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 1

    iput-object p2, p0, Loi/u;->f:Lio/flutter/plugin/common/MethodChannel$Result;

    new-instance p2, Ljava/io/File;

    iget-object p1, p1, Lio/flutter/plugin/common/MethodCall;->arguments:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {p2}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object p1

    iget-object p2, p0, Loi/u;->u:Loi/s;

    invoke-static {p2}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-static {p1}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    iget-object v0, p0, Loi/u;->e:Lok/l;

    invoke-virtual {p2, p1, v0}, Loi/s;->w(Landroid/net/Uri;Lok/l;)V

    return-void
.end method

.method private final f(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Loi/u;->u:Loi/s;

    invoke-static {v1}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-virtual {v1}, Loi/s;->I()V

    invoke-interface {p1, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V
    :try_end_0
    .catch Loi/d0; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v1, "MobileScanner"

    const-string v2, "Called resetScale() while stopped!"

    invoke-interface {p1, v1, v2, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method private final g(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 5

    const-string v0, "MobileScanner"

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Loi/u;->u:Loi/s;

    invoke-static {v2}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    iget-object p1, p1, Lio/flutter/plugin/common/MethodCall;->arguments:Ljava/lang/Object;

    const-string v3, "null cannot be cast to non-null type kotlin.Double"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/n;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Double;

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Loi/s;->K(D)V

    invoke-interface {p2, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V
    :try_end_0
    .catch Loi/d0; {:try_start_0 .. :try_end_0} :catch_1
    .catch Loi/c0; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    const-string p1, "Scale should be within 0 and 1"

    goto :goto_0

    :catch_1
    const-string p1, "Called setScale() while stopped!"

    :goto_0
    invoke-interface {p2, v0, p1, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_1
    return-void
.end method

.method private final h(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-string v3, "torch"

    invoke-virtual {v1, v3}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    const/4 v4, 0x0

    if-nez v3, :cond_0

    move v9, v4

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    move v9, v3

    :goto_0
    const-string v3, "facing"

    invoke-virtual {v1, v3}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    if-nez v3, :cond_1

    move v3, v4

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    :goto_1
    const-string v5, "formats"

    invoke-virtual {v1, v5}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    const-string v6, "returnImage"

    invoke-virtual {v1, v6}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    if-nez v6, :cond_2

    move v7, v4

    goto :goto_2

    :cond_2
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    move v7, v6

    :goto_2
    const-string v6, "speed"

    invoke-virtual {v1, v6}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    const/4 v8, 0x1

    if-nez v6, :cond_3

    move v6, v8

    goto :goto_3

    :cond_3
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    :goto_3
    const-string v10, "timeout"

    invoke-virtual {v1, v10}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Integer;

    if-nez v10, :cond_4

    const/16 v10, 0xfa

    goto :goto_4

    :cond_4
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v10

    :goto_4
    const-string v11, "cameraResolution"

    invoke-virtual {v1, v11}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/List;

    const-string v12, "useNewCameraSelector"

    invoke-virtual {v1, v12}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    if-nez v1, :cond_5

    move/from16 v18, v4

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    move/from16 v18, v1

    :goto_5
    const/4 v1, 0x0

    if-eqz v11, :cond_6

    new-instance v12, Landroid/util/Size;

    invoke-interface {v11, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Number;

    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    move-result v13

    invoke-interface {v11, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Number;

    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    move-result v11

    invoke-direct {v12, v13, v11}, Landroid/util/Size;-><init>(II)V

    move-object/from16 v17, v12

    goto :goto_6

    :cond_6
    move-object/from16 v17, v1

    :goto_6
    if-eqz v5, :cond_9

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_7
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_7

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Number;

    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    move-result v11

    sget-object v12, Lpi/a;->Companion:Lpi/a$a;

    invoke-virtual {v12, v11}, Lpi/a$a;->a(I)Lpi/a;

    move-result-object v11

    invoke-virtual {v11}, Lpi/a;->h()I

    move-result v11

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v1, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_7
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v5

    if-ne v5, v8, :cond_8

    new-instance v5, Lvf/b$a;

    invoke-direct {v5}, Lvf/b$a;-><init>()V

    invoke-static {v1}, Ldk/p;->G(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    new-array v11, v4, [I

    invoke-virtual {v5, v1, v11}, Lvf/b$a;->b(I[I)Lvf/b$a;

    move-result-object v1

    goto :goto_8

    :cond_8
    new-instance v5, Lvf/b$a;

    invoke-direct {v5}, Lvf/b$a;-><init>()V

    invoke-static {v1}, Ldk/p;->G(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Number;

    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    move-result v11

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v12

    invoke-interface {v1, v8, v12}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-static {v1}, Ldk/p;->e0(Ljava/util/Collection;)[I

    move-result-object v1

    array-length v12, v1

    invoke-static {v1, v12}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v1

    invoke-virtual {v5, v11, v1}, Lvf/b$a;->b(I[I)Lvf/b$a;

    move-result-object v1

    :goto_8
    invoke-virtual {v1}, Lvf/b$a;->a()Lvf/b;

    move-result-object v1

    :cond_9
    if-nez v3, :cond_a

    sget-object v3, Lw/p;->b:Lw/p;

    goto :goto_9

    :cond_a
    sget-object v3, Lw/p;->c:Lw/p;

    :goto_9
    invoke-static {v3}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-static {}, Lpi/b;->values()[Lpi/b;

    move-result-object v5

    array-length v11, v5

    move v12, v4

    :goto_a
    if-ge v12, v11, :cond_d

    aget-object v13, v5, v12

    invoke-virtual {v13}, Lpi/b;->h()I

    move-result v14

    if-ne v14, v6, :cond_b

    move v14, v8

    goto :goto_b

    :cond_b
    move v14, v4

    :goto_b
    if-eqz v14, :cond_c

    iget-object v5, v0, Loi/u;->u:Loi/s;

    invoke-static {v5}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    iget-object v11, v0, Loi/u;->v:Lok/l;

    iget-object v12, v0, Loi/u;->w:Lok/l;

    new-instance v4, Loi/u$e;

    invoke-direct {v4, v2}, Loi/u$e;-><init>(Lio/flutter/plugin/common/MethodChannel$Result;)V

    new-instance v14, Loi/u$f;

    invoke-direct {v14, v2}, Loi/u$f;-><init>(Lio/flutter/plugin/common/MethodChannel$Result;)V

    move-object/from16 p1, v14

    int-to-long v14, v10

    move-object v6, v1

    move-object v8, v3

    move-object v10, v13

    move-object v13, v4

    move-wide v1, v14

    move-object/from16 v14, p1

    move-wide v15, v1

    invoke-virtual/range {v5 .. v18}, Loi/s;->M(Lvf/b;ZLw/p;ZLpi/b;Lok/l;Lok/l;Lok/l;Lok/l;JLandroid/util/Size;Z)V

    return-void

    :cond_c
    add-int/lit8 v12, v12, 0x1

    goto :goto_a

    :cond_d
    new-instance v1, Ljava/util/NoSuchElementException;

    const-string v2, "Array contains no element matching the predicate."

    invoke-direct {v1, v2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method private final i(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Loi/u;->u:Loi/s;

    invoke-static {v1}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-virtual {v1}, Loi/s;->S()V

    invoke-interface {p1, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V
    :try_end_0
    .catch Loi/b; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-interface {p1, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method private final j(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    iget-object v0, p0, Loi/u;->u:Loi/s;

    invoke-static {v0}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    iget-object p1, p1, Lio/flutter/plugin/common/MethodCall;->arguments:Ljava/lang/Object;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v0, p1}, Loi/s;->T(Z)V

    const/4 p1, 0x0

    invoke-interface {p2, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void
.end method

.method private final k(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    iget-object v0, p0, Loi/u;->u:Loi/s;

    invoke-static {v0}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    const-string v1, "rect"

    invoke-virtual {p1, v1}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-virtual {v0, p1}, Loi/s;->L(Ljava/util/List;)V

    const/4 p1, 0x0

    invoke-interface {p2, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final e(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V
    .locals 2

    const-string v0, "activityPluginBinding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Loi/u;->t:Lio/flutter/plugin/common/MethodChannel;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    :cond_0
    iput-object v1, p0, Loi/u;->t:Lio/flutter/plugin/common/MethodChannel;

    iput-object v1, p0, Loi/u;->u:Loi/s;

    iget-object v0, p0, Loi/u;->c:Loi/x;

    invoke-virtual {v0}, Loi/x;->c()Lio/flutter/plugin/common/PluginRegistry$RequestPermissionsResultListener;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {p1, v0}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->removeRequestPermissionsResultListener(Lio/flutter/plugin/common/PluginRegistry$RequestPermissionsResultListener;)V

    :cond_1
    return-void
.end method

.method public onMethodCall(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 3

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "result"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Loi/u;->u:Loi/s;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Called "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, Lio/flutter/plugin/common/MethodCall;->method:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " before initializing."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    const-string v1, "MobileScanner"

    invoke-interface {p2, v1, p1, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p1, Lio/flutter/plugin/common/MethodCall;->method:Ljava/lang/String;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v1, "updateScanWindow"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_0

    :cond_1
    invoke-direct {p0, p1, p2}, Loi/u;->k(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_1

    :sswitch_1
    const-string v1, "setScale"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_0

    :cond_2
    invoke-direct {p0, p1, p2}, Loi/u;->g(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_1

    :sswitch_2
    const-string p1, "request"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto/16 :goto_0

    :cond_3
    iget-object p1, p0, Loi/u;->c:Loi/x;

    iget-object v0, p0, Loi/u;->a:Landroid/app/Activity;

    iget-object v1, p0, Loi/u;->d:Lok/l;

    new-instance v2, Loi/u$d;

    invoke-direct {v2, p2}, Loi/u$d;-><init>(Lio/flutter/plugin/common/MethodChannel$Result;)V

    invoke-virtual {p1, v0, v1, v2}, Loi/x;->e(Landroid/app/Activity;Lok/l;Loi/x$b;)V

    goto :goto_1

    :sswitch_3
    const-string v1, "torch"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    invoke-direct {p0, p1, p2}, Loi/u;->j(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto :goto_1

    :sswitch_4
    const-string p1, "state"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    iget-object p1, p0, Loi/u;->c:Loi/x;

    iget-object v0, p0, Loi/u;->a:Landroid/app/Activity;

    invoke-virtual {p1, v0}, Loi/x;->d(Landroid/app/Activity;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p2, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    goto :goto_1

    :sswitch_5
    const-string v1, "start"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    :cond_5
    invoke-direct {p0, p1, p2}, Loi/u;->h(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto :goto_1

    :sswitch_6
    const-string v1, "analyzeImage"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_0

    :cond_6
    invoke-direct {p0, p1, p2}, Loi/u;->d(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto :goto_1

    :sswitch_7
    const-string p1, "stop"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto :goto_0

    :cond_7
    invoke-direct {p0, p2}, Loi/u;->i(Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto :goto_1

    :sswitch_8
    const-string p1, "resetScale"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    goto :goto_0

    :cond_8
    invoke-direct {p0, p2}, Loi/u;->f(Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto :goto_1

    :cond_9
    :goto_0
    invoke-interface {p2}, Lio/flutter/plugin/common/MethodChannel$Result;->notImplemented()V

    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x649d0ac5 -> :sswitch_8
        0x360802 -> :sswitch_7
        0xfecb6f -> :sswitch_6
        0x68ac462 -> :sswitch_5
        0x68ac491 -> :sswitch_4
        0x696d3fc -> :sswitch_3
        0x414ef28f -> :sswitch_2
        0x53aeca08 -> :sswitch_1
        0x78a16a76 -> :sswitch_0
    .end sparse-switch
.end method
