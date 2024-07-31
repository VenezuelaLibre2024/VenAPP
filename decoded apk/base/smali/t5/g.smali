.class public final Lt5/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt5/g$b;
    }
.end annotation


# static fields
.field public static final s:Lt5/g$b;

.field private static final t:Ljava/util/concurrent/ThreadPoolExecutor;


# instance fields
.field private final a:Landroid/content/Context;

.field private b:Landroid/app/Activity;

.field private final c:Ly5/c;

.field private final d:Lt5/e;

.field private final e:Lt5/f;

.field private final f:Lt5/b;

.field private r:Z


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lt5/g$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lt5/g$b;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lt5/g;->s:Lt5/g$b;

    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    const/16 v3, 0x8

    const v4, 0x7fffffff

    const-wide/16 v5, 0x1

    sget-object v7, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    new-instance v8, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v8}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    move-object v2, v0

    invoke-direct/range {v2 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    sput-object v0, Lt5/g;->t:Ljava/util/concurrent/ThreadPoolExecutor;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lio/flutter/plugin/common/BinaryMessenger;Landroid/app/Activity;Ly5/c;)V
    .locals 1

    const-string v0, "applicationContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messenger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "permissionsUtils"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt5/g;->a:Landroid/content/Context;

    iput-object p3, p0, Lt5/g;->b:Landroid/app/Activity;

    iput-object p4, p0, Lt5/g;->c:Ly5/c;

    new-instance p3, Lt5/g$a;

    invoke-direct {p3}, Lt5/g$a;-><init>()V

    invoke-virtual {p4, p3}, Ly5/c;->l(Ly5/b;)V

    new-instance p3, Lt5/e;

    iget-object p4, p0, Lt5/g;->b:Landroid/app/Activity;

    invoke-direct {p3, p1, p4}, Lt5/e;-><init>(Landroid/content/Context;Landroid/app/Activity;)V

    iput-object p3, p0, Lt5/g;->d:Lt5/e;

    new-instance p3, Lt5/f;

    new-instance p4, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p4, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-direct {p3, p1, p2, p4}, Lt5/f;-><init>(Landroid/content/Context;Lio/flutter/plugin/common/BinaryMessenger;Landroid/os/Handler;)V

    iput-object p3, p0, Lt5/g;->e:Lt5/f;

    new-instance p2, Lt5/b;

    invoke-direct {p2, p1}, Lt5/b;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lt5/g;->f:Lt5/b;

    return-void
.end method

.method public static final synthetic a(Lt5/g;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lt5/g;->a:Landroid/content/Context;

    return-object p0
.end method

.method public static final synthetic b(Lt5/g;)Ly5/c;
    .locals 0

    iget-object p0, p0, Lt5/g;->c:Ly5/c;

    return-object p0
.end method

.method public static final synthetic c(Lt5/g;)Lt5/b;
    .locals 0

    iget-object p0, p0, Lt5/g;->f:Lt5/b;

    return-object p0
.end method

.method public static final synthetic d()Ljava/util/concurrent/ThreadPoolExecutor;
    .locals 1

    sget-object v0, Lt5/g;->t:Ljava/util/concurrent/ThreadPoolExecutor;

    return-object v0
.end method

.method public static final synthetic e(Lt5/g;Lb6/e;Z)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lt5/g;->k(Lb6/e;Z)V

    return-void
.end method

.method private final h(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)I
    .locals 0

    invoke-virtual {p1, p2}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    return p1
.end method

.method private final i(Lio/flutter/plugin/common/MethodCall;)Lw5/e;
    .locals 1

    const-string v0, "option"

    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    check-cast p1, Ljava/util/Map;

    sget-object v0, Lx5/c;->a:Lx5/c;

    invoke-virtual {v0, p1}, Lx5/c;->e(Ljava/util/Map;)Lw5/e;

    move-result-object p1

    return-object p1
.end method

.method private final j(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p1, p2}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method private final k(Lb6/e;Z)V
    .locals 22

    move-object/from16 v1, p0

    move-object/from16 v3, p1

    move/from16 v0, p2

    invoke-virtual/range {p1 .. p1}, Lb6/e;->d()Lio/flutter/plugin/common/MethodCall;

    move-result-object v2

    iget-object v4, v2, Lio/flutter/plugin/common/MethodCall;->method:Ljava/lang/String;

    if-eqz v4, :cond_2c

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v5

    const-string v8, "deleteWithIds failed"

    const-string v9, "save image error"

    const-string v10, "assetId"

    const-string v11, "option"

    const-string v12, "end"

    const-string v13, "start"

    const-string v14, "path"

    const-string v15, "relativePath"

    const-string v6, "desc"

    const-string v7, "title"

    move-object/from16 v18, v9

    const-string v9, "ids"

    move-object/from16 v19, v15

    const-string v15, "type"

    move-object/from16 v20, v6

    const-string v6, ""

    move-object/from16 v21, v6

    const-string v6, "id"

    sparse-switch v5, :sswitch_data_0

    goto/16 :goto_c

    :sswitch_0
    const-string v0, "getThumb"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_c

    :cond_0
    invoke-virtual {v2, v6}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v2, v11}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    check-cast v2, Ljava/util/Map;

    sget-object v4, Lv5/d;->f:Lv5/d$a;

    invoke-virtual {v4, v2}, Lv5/d$a;->a(Ljava/util/Map;)Lv5/d;

    move-result-object v2

    iget-object v4, v1, Lt5/g;->f:Lt5/b;

    invoke-virtual {v4, v0, v2, v3}, Lt5/b;->s(Ljava/lang/String;Lv5/d;Lb6/e;)V

    goto/16 :goto_d

    :sswitch_1
    const-string v0, "getAssetCount"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_c

    :cond_1
    invoke-direct {v1, v2}, Lt5/g;->i(Lio/flutter/plugin/common/MethodCall;)Lw5/e;

    move-result-object v0

    invoke-direct {v1, v2, v15}, Lt5/g;->h(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)I

    move-result v2

    iget-object v4, v1, Lt5/g;->f:Lt5/b;

    invoke-virtual {v4, v3, v0, v2}, Lt5/b;->h(Lb6/e;Lw5/e;I)V

    goto/16 :goto_d

    :sswitch_2
    const-string v0, "copyAsset"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_c

    :cond_2
    invoke-virtual {v2, v10}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/String;

    const-string v4, "galleryId"

    invoke-virtual {v2, v4}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    check-cast v2, Ljava/lang/String;

    iget-object v4, v1, Lt5/g;->f:Lt5/b;

    invoke-virtual {v4, v0, v2, v3}, Lt5/b;->e(Ljava/lang/String;Ljava/lang/String;Lb6/e;)V

    goto/16 :goto_d

    :sswitch_3
    const-string v0, "getAssetPathList"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto/16 :goto_c

    :cond_3
    invoke-virtual {v2, v15}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    const-string v4, "hasAll"

    invoke-virtual {v2, v4}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    invoke-direct {v1, v2}, Lt5/g;->i(Lio/flutter/plugin/common/MethodCall;)Lw5/e;

    move-result-object v5

    const-string v6, "onlyAll"

    invoke-virtual {v2, v6}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    iget-object v6, v1, Lt5/g;->f:Lt5/b;

    invoke-virtual {v6, v0, v4, v2, v5}, Lt5/b;->k(IZZLw5/e;)Ljava/util/List;

    move-result-object v0

    sget-object v2, Lx5/c;->a:Lx5/c;

    :goto_0
    invoke-virtual {v2, v0}, Lx5/c;->c(Ljava/util/List;)Ljava/util/Map;

    move-result-object v0

    goto/16 :goto_9

    :sswitch_4
    const-string v0, "getMediaUrl"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto/16 :goto_c

    :cond_4
    invoke-virtual {v2, v6}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v2, v15}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    iget-object v4, v1, Lt5/g;->f:Lt5/b;

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v5

    invoke-virtual {v4, v5, v6, v2}, Lt5/b;->q(JI)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_9

    :sswitch_5
    const-string v0, "deleteWithIds"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto/16 :goto_c

    :cond_5
    :try_start_0
    invoke-virtual {v2, v9}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    check-cast v0, Ljava/util/List;

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1e

    if-lt v2, v4, :cond_7

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v0, v4}, Ldk/p;->r(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    iget-object v5, v1, Lt5/g;->f:Lt5/b;

    invoke-virtual {v5, v4}, Lt5/b;->t(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_6
    invoke-static {v2}, Ldk/p;->f0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    iget-object v2, v1, Lt5/g;->d:Lt5/e;

    invoke-virtual {v2, v0, v3}, Lt5/e;->c(Ljava/util/List;Lb6/e;)V

    goto/16 :goto_d

    :cond_7
    iget-object v2, v1, Lt5/g;->d:Lt5/e;

    invoke-virtual {v2, v0}, Lt5/e;->b(Ljava/util/List;)V

    invoke-virtual {v3, v0}, Lb6/e;->g(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    goto/16 :goto_d

    :sswitch_6
    const-string v5, "getOriginBytes"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_8

    goto/16 :goto_c

    :cond_8
    invoke-virtual {v2, v6}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    check-cast v2, Ljava/lang/String;

    iget-object v4, v1, Lt5/g;->f:Lt5/b;

    invoke-virtual {v4, v2, v3, v0}, Lt5/b;->r(Ljava/lang/String;Lb6/e;Z)V

    goto/16 :goto_d

    :sswitch_7
    const-string v0, "cancelCacheRequests"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto/16 :goto_c

    :cond_9
    iget-object v0, v1, Lt5/g;->f:Lt5/b;

    invoke-virtual {v0}, Lt5/b;->c()V

    :cond_a
    :goto_2
    const/4 v2, 0x0

    invoke-virtual {v3, v2}, Lb6/e;->g(Ljava/lang/Object;)V

    goto/16 :goto_d

    :sswitch_8
    const-string v0, "assetExists"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    goto/16 :goto_c

    :cond_b
    invoke-virtual {v2, v6}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/String;

    iget-object v2, v1, Lt5/g;->f:Lt5/b;

    invoke-virtual {v2, v0, v3}, Lt5/b;->b(Ljava/lang/String;Lb6/e;)V

    goto/16 :goto_d

    :sswitch_9
    const-string v0, "getAssetsByRange"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    goto/16 :goto_c

    :cond_c
    invoke-direct {v1, v2}, Lt5/g;->i(Lio/flutter/plugin/common/MethodCall;)Lw5/e;

    move-result-object v4

    invoke-direct {v1, v2, v13}, Lt5/g;->h(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)I

    move-result v5

    invoke-direct {v1, v2, v12}, Lt5/g;->h(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)I

    move-result v6

    invoke-direct {v1, v2, v15}, Lt5/g;->h(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)I

    move-result v7

    iget-object v2, v1, Lt5/g;->f:Lt5/b;

    move-object/from16 v3, p1

    invoke-virtual/range {v2 .. v7}, Lt5/b;->l(Lb6/e;Lw5/e;III)V

    goto/16 :goto_d

    :sswitch_a
    const-string v0, "fetchEntityProperties"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    goto/16 :goto_c

    :cond_d
    invoke-virtual {v2, v6}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/String;

    iget-object v2, v1, Lt5/g;->f:Lt5/b;

    invoke-virtual {v2, v0}, Lt5/b;->f(Ljava/lang/String;)Lv5/a;

    move-result-object v0

    if-eqz v0, :cond_e

    sget-object v2, Lx5/c;->a:Lx5/c;

    invoke-virtual {v2, v0}, Lx5/c;->a(Lv5/a;)Ljava/util/Map;

    move-result-object v6

    goto :goto_3

    :cond_e
    const/4 v6, 0x0

    :goto_3
    invoke-virtual {v3, v6}, Lb6/e;->g(Ljava/lang/Object;)V

    goto/16 :goto_d

    :sswitch_b
    const-string v0, "saveVideo"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    goto/16 :goto_c

    :cond_f
    :try_start_1
    invoke-virtual {v2, v14}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v2, v7}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    check-cast v4, Ljava/lang/String;

    move-object/from16 v5, v20

    invoke-virtual {v2, v5}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    if-nez v5, :cond_10

    move-object/from16 v5, v21

    :cond_10
    move-object/from16 v6, v19

    invoke-virtual {v2, v6}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_11

    move-object/from16 v6, v21

    goto :goto_4

    :cond_11
    move-object v6, v2

    :goto_4
    iget-object v2, v1, Lt5/g;->f:Lt5/b;

    invoke-virtual {v2, v0, v4, v5, v6}, Lt5/b;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lv5/a;

    move-result-object v0

    if-nez v0, :cond_12

    const/4 v2, 0x0

    invoke-virtual {v3, v2}, Lb6/e;->g(Ljava/lang/Object;)V

    return-void

    :cond_12
    sget-object v2, Lx5/c;->a:Lx5/c;

    invoke-virtual {v2, v0}, Lx5/c;->a(Lv5/a;)Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v3, v0}, Lb6/e;->g(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_d

    :catch_0
    move-exception v0

    const-string v2, "save video error"

    invoke-static {v2, v0}, Lb6/a;->c(Ljava/lang/Object;Ljava/lang/Throwable;)V

    goto/16 :goto_2

    :sswitch_c
    move-object/from16 v6, v19

    move-object/from16 v5, v20

    const-string v0, "saveImage"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_13

    goto/16 :goto_c

    :cond_13
    :try_start_2
    const-string v0, "image"

    invoke-virtual {v2, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    check-cast v0, [B

    invoke-virtual {v2, v7}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    if-nez v4, :cond_14

    move-object/from16 v4, v21

    :cond_14
    invoke-virtual {v2, v5}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    if-nez v5, :cond_15

    move-object/from16 v5, v21

    :cond_15
    invoke-virtual {v2, v6}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_16

    move-object/from16 v6, v21

    goto :goto_5

    :cond_16
    move-object v6, v2

    :goto_5
    iget-object v2, v1, Lt5/g;->f:Lt5/b;

    invoke-virtual {v2, v0, v4, v5, v6}, Lt5/b;->z([BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lv5/a;

    move-result-object v0

    if-nez v0, :cond_17

    const/4 v2, 0x0

    invoke-virtual {v3, v2}, Lb6/e;->g(Ljava/lang/Object;)V

    return-void

    :cond_17
    sget-object v2, Lx5/c;->a:Lx5/c;

    invoke-virtual {v2, v0}, Lx5/c;->a(Lv5/a;)Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v3, v0}, Lb6/e;->g(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto/16 :goto_d

    :catch_1
    move-exception v0

    move-object/from16 v8, v18

    goto/16 :goto_b

    :sswitch_d
    const-string v0, "fetchPathProperties"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_18

    goto/16 :goto_c

    :cond_18
    invoke-virtual {v2, v6}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v2, v15}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-direct {v1, v2}, Lt5/g;->i(Lio/flutter/plugin/common/MethodCall;)Lw5/e;

    move-result-object v2

    iget-object v5, v1, Lt5/g;->f:Lt5/b;

    invoke-virtual {v5, v0, v4, v2}, Lt5/b;->g(Ljava/lang/String;ILw5/e;)Lv5/b;

    move-result-object v0

    if-eqz v0, :cond_a

    sget-object v2, Lx5/c;->a:Lx5/c;

    invoke-static {v0}, Ldk/p;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto/16 :goto_0

    :sswitch_e
    const-string v0, "moveAssetToPath"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_19

    goto/16 :goto_c

    :cond_19
    invoke-virtual {v2, v10}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/String;

    const-string v4, "albumId"

    invoke-virtual {v2, v4}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    check-cast v2, Ljava/lang/String;

    iget-object v4, v1, Lt5/g;->f:Lt5/b;

    invoke-virtual {v4, v0, v2, v3}, Lt5/b;->u(Ljava/lang/String;Ljava/lang/String;Lb6/e;)V

    goto/16 :goto_d

    :sswitch_f
    const-string v5, "getFullFile"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1a

    goto/16 :goto_c

    :cond_1a
    invoke-virtual {v2, v6}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    check-cast v4, Ljava/lang/String;

    if-nez v0, :cond_1b

    const/4 v0, 0x0

    goto :goto_6

    :cond_1b
    const-string v0, "isOrigin"

    invoke-virtual {v2, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    :goto_6
    iget-object v2, v1, Lt5/g;->f:Lt5/b;

    invoke-virtual {v2, v4, v0, v3}, Lt5/b;->o(Ljava/lang/String;ZLb6/e;)V

    goto/16 :goto_d

    :sswitch_10
    const-string v0, "requestCacheAssetsThumb"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1c

    goto/16 :goto_c

    :cond_1c
    invoke-virtual {v2, v9}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    check-cast v0, Ljava/util/List;

    invoke-virtual {v2, v11}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    check-cast v2, Ljava/util/Map;

    sget-object v4, Lv5/d;->f:Lv5/d$a;

    invoke-virtual {v4, v2}, Lv5/d$a;->a(Ljava/util/Map;)Lv5/d;

    move-result-object v2

    iget-object v4, v1, Lt5/g;->f:Lt5/b;

    invoke-virtual {v4, v0, v2, v3}, Lt5/b;->w(Ljava/util/List;Lv5/d;Lb6/e;)V

    goto/16 :goto_d

    :sswitch_11
    const-string v0, "moveToTrash"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1d

    goto/16 :goto_c

    :cond_1d
    :try_start_3
    invoke-virtual {v2, v9}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    check-cast v0, Ljava/util/List;

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1e

    if-lt v2, v4, :cond_1f

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v0, v4}, Ldk/p;->r(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    iget-object v5, v1, Lt5/g;->f:Lt5/b;

    invoke-virtual {v5, v4}, Lt5/b;->t(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_1e
    invoke-static {v2}, Ldk/p;->f0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    iget-object v2, v1, Lt5/g;->d:Lt5/e;

    invoke-virtual {v2, v0, v3}, Lt5/e;->f(Ljava/util/List;Lb6/e;)V

    goto/16 :goto_d

    :cond_1f
    const-string v0, "The API 29 or lower have not the IS_TRASHED row in MediaStore."

    invoke-static {v0}, Lb6/a;->b(Ljava/lang/Object;)V

    const-string v0, "The api not support 29 or lower."

    new-instance v2, Ljava/lang/UnsupportedOperationException;

    const-string v4, "The api cannot be used in 29 or lower."

    invoke-direct {v2, v4}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    move-object/from16 v9, v21

    invoke-virtual {v3, v0, v9, v2}, Lb6/e;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    goto/16 :goto_d

    :catch_2
    move-exception v0

    invoke-static {v8, v0}, Lb6/a;->c(Ljava/lang/Object;Ljava/lang/Throwable;)V

    const-string v0, "deleteWithIds failed"

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object/from16 v2, p1

    move-object v3, v0

    invoke-static/range {v2 .. v7}, Lb6/e;->j(Lb6/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    goto/16 :goto_d

    :sswitch_12
    const-string v0, "notify"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_20

    goto/16 :goto_c

    :cond_20
    invoke-virtual {v2, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_21

    iget-object v0, v1, Lt5/g;->e:Lt5/f;

    invoke-virtual {v0}, Lt5/f;->f()V

    goto/16 :goto_2

    :cond_21
    iget-object v0, v1, Lt5/g;->e:Lt5/f;

    invoke-virtual {v0}, Lt5/f;->g()V

    goto/16 :goto_2

    :sswitch_13
    const-string v0, "getAssetListRange"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_22

    goto/16 :goto_c

    :cond_22
    invoke-direct {v1, v2, v6}, Lt5/g;->j(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    invoke-direct {v1, v2, v15}, Lt5/g;->h(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)I

    move-result v18

    invoke-direct {v1, v2, v13}, Lt5/g;->h(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)I

    move-result v19

    invoke-direct {v1, v2, v12}, Lt5/g;->h(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)I

    move-result v20

    invoke-direct {v1, v2}, Lt5/g;->i(Lio/flutter/plugin/common/MethodCall;)Lw5/e;

    move-result-object v21

    iget-object v0, v1, Lt5/g;->f:Lt5/b;

    move-object/from16 v16, v0

    invoke-virtual/range {v16 .. v21}, Lt5/b;->j(Ljava/lang/String;IIILw5/e;)Ljava/util/List;

    move-result-object v0

    goto :goto_8

    :sswitch_14
    const-string v0, "getAssetListPaged"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_23

    goto/16 :goto_c

    :cond_23
    invoke-virtual {v2, v6}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v2, v15}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v6

    const-string v0, "page"

    invoke-virtual {v2, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v7

    const-string v0, "size"

    invoke-virtual {v2, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v8

    invoke-direct {v1, v2}, Lt5/g;->i(Lio/flutter/plugin/common/MethodCall;)Lw5/e;

    move-result-object v9

    iget-object v4, v1, Lt5/g;->f:Lt5/b;

    invoke-virtual/range {v4 .. v9}, Lt5/b;->i(Ljava/lang/String;IIILw5/e;)Ljava/util/List;

    move-result-object v0

    :goto_8
    sget-object v2, Lx5/c;->a:Lx5/c;

    invoke-virtual {v2, v0}, Lx5/c;->b(Ljava/util/List;)Ljava/util/Map;

    move-result-object v0

    goto :goto_9

    :sswitch_15
    const-string v0, "getLatLngAndroidQ"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_24

    goto/16 :goto_c

    :cond_24
    invoke-virtual {v2, v6}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/String;

    iget-object v2, v1, Lt5/g;->f:Lt5/b;

    invoke-virtual {v2, v0}, Lt5/b;->p(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    :goto_9
    invoke-virtual {v3, v0}, Lb6/e;->g(Ljava/lang/Object;)V

    goto/16 :goto_d

    :sswitch_16
    const-string v0, "getColumnNames"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_25

    goto/16 :goto_c

    :cond_25
    iget-object v0, v1, Lt5/g;->f:Lt5/b;

    invoke-virtual {v0, v3}, Lt5/b;->m(Lb6/e;)V

    goto/16 :goto_d

    :sswitch_17
    const-string v0, "removeNoExistsAssets"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_26

    goto :goto_c

    :cond_26
    iget-object v0, v1, Lt5/g;->f:Lt5/b;

    invoke-virtual {v0, v3}, Lt5/b;->v(Lb6/e;)V

    goto :goto_d

    :sswitch_18
    move-object/from16 v8, v18

    move-object/from16 v6, v19

    move-object/from16 v5, v20

    move-object/from16 v9, v21

    const-string v0, "saveImageWithPath"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_27

    goto :goto_c

    :cond_27
    :try_start_4
    invoke-virtual {v2, v14}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v2, v7}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    if-nez v4, :cond_28

    move-object v4, v9

    :cond_28
    invoke-virtual {v2, v5}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    if-nez v5, :cond_29

    move-object v5, v9

    :cond_29
    invoke-virtual {v2, v6}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_2a

    move-object v6, v9

    goto :goto_a

    :cond_2a
    move-object v6, v2

    :goto_a
    iget-object v2, v1, Lt5/g;->f:Lt5/b;

    invoke-virtual {v2, v0, v4, v5, v6}, Lt5/b;->y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lv5/a;

    move-result-object v0

    if-nez v0, :cond_2b

    const/4 v2, 0x0

    invoke-virtual {v3, v2}, Lb6/e;->g(Ljava/lang/Object;)V

    return-void

    :cond_2b
    sget-object v2, Lx5/c;->a:Lx5/c;

    invoke-virtual {v2, v0}, Lx5/c;->a(Lv5/a;)Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v3, v0}, Lb6/e;->g(Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    goto :goto_d

    :catch_3
    move-exception v0

    :goto_b
    invoke-static {v8, v0}, Lb6/a;->c(Ljava/lang/Object;Ljava/lang/Throwable;)V

    goto/16 :goto_2

    :cond_2c
    :goto_c
    invoke-virtual/range {p1 .. p1}, Lb6/e;->e()V

    :goto_d
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x7ace45f7 -> :sswitch_18
        -0x6ae40afc -> :sswitch_17
        -0x58e2ffa4 -> :sswitch_16
        -0x4c7d6c22 -> :sswitch_15
        -0x4593ae63 -> :sswitch_14
        -0x457764db -> :sswitch_13
        -0x3df868b7 -> :sswitch_12
        -0x3d9b9794 -> :sswitch_11
        -0x38872c20 -> :sswitch_10
        -0x34d615df -> :sswitch_f
        -0x255e5c41 -> :sswitch_e
        -0x90ed76e -> :sswitch_d
        0x9c05dde -> :sswitch_c
        0xa75c8fe -> :sswitch_b
        0x1378a450 -> :sswitch_a
        0x2538d26d -> :sswitch_9
        0x3317d76c -> :sswitch_8
        0x39fda90c -> :sswitch_7
        0x3f5cefaf -> :sswitch_6
        0x4490dbe7 -> :sswitch_5
        0x46296061 -> :sswitch_4
        0x51f509bd -> :sswitch_3
        0x5817ac7b -> :sswitch_2
        0x6ba583f5 -> :sswitch_1
        0x75315820 -> :sswitch_0
    .end sparse-switch
.end method

.method private final l(Lb6/e;)V
    .locals 4

    invoke-virtual {p1}, Lb6/e;->d()Lio/flutter/plugin/common/MethodCall;

    move-result-object v0

    iget-object v1, v0, Lio/flutter/plugin/common/MethodCall;->method:Ljava/lang/String;

    if-eqz v1, :cond_8

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    const/4 v3, 0x1

    sparse-switch v2, :sswitch_data_0

    goto/16 :goto_3

    :sswitch_0
    const-string v0, "releaseMemoryCache"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto/16 :goto_3

    :sswitch_1
    const-string v0, "openSetting"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_3

    :cond_0
    iget-object v0, p0, Lt5/g;->c:Ly5/c;

    iget-object v1, p0, Lt5/g;->b:Landroid/app/Activity;

    invoke-virtual {v0, v1}, Ly5/c;->c(Landroid/content/Context;)V

    goto :goto_1

    :sswitch_2
    const-string v0, "clearFileCache"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_3

    :cond_1
    iget-object v0, p0, Lt5/g;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/bumptech/glide/b;->d(Landroid/content/Context;)Lcom/bumptech/glide/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bumptech/glide/b;->c()V

    sget-object v0, Lt5/g;->s:Lt5/g$b;

    new-instance v1, Lt5/g$c;

    invoke-direct {v1, p0, p1}, Lt5/g$c;-><init>(Lt5/g;Lb6/e;)V

    invoke-virtual {v0, v1}, Lt5/g$b;->b(Lok/a;)V

    goto :goto_3

    :sswitch_3
    const-string v2, "ignorePermissionCheck"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_3

    :cond_2
    const-string v1, "ignore"

    invoke-virtual {v0, v1}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lt5/g;->r:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_2

    :sswitch_4
    const-string v2, "log"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    sget-object v1, Lb6/a;->a:Lb6/a;

    invoke-virtual {v0}, Lio/flutter/plugin/common/MethodCall;->arguments()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    if-nez v0, :cond_4

    const/4 v0, 0x0

    goto :goto_0

    :cond_4
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    :goto_0
    invoke-virtual {v1, v0}, Lb6/a;->g(Z)V

    goto :goto_1

    :sswitch_5
    const-string v0, "forceOldApi"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_3

    :cond_5
    iget-object v0, p0, Lt5/g;->f:Lt5/b;

    invoke-virtual {v0, v3}, Lt5/b;->B(Z)V

    :cond_6
    :goto_1
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_2

    :sswitch_6
    const-string v0, "systemVersion"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_3

    :cond_7
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    :goto_2
    invoke-virtual {p1, v0}, Lb6/e;->g(Ljava/lang/Object;)V

    :cond_8
    :goto_3
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x721bc057 -> :sswitch_6
        -0x22b656c2 -> :sswitch_5
        0x1a344 -> :sswitch_4
        0x43de9447 -> :sswitch_3
        0x5be80799 -> :sswitch_2
        0x6aa3b8a6 -> :sswitch_1
        0x7279007a -> :sswitch_0
    .end sparse-switch
.end method

.method private final m(Lb6/e;)V
    .locals 2

    sget-object v0, Lt5/g;->s:Lt5/g$b;

    new-instance v1, Lt5/g$d;

    invoke-direct {v1, p0, p1}, Lt5/g$d;-><init>(Lt5/g;Lb6/e;)V

    invoke-virtual {v0, v1}, Lt5/g$b;->b(Lok/a;)V

    return-void
.end method

.method private final n(Lb6/e;)V
    .locals 4

    invoke-virtual {p1}, Lb6/e;->d()Lio/flutter/plugin/common/MethodCall;

    move-result-object v0

    iget-object v1, v0, Lio/flutter/plugin/common/MethodCall;->method:Ljava/lang/String;

    const-string v2, "requestPermissionExtend"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const-string v3, "type"

    if-eqz v2, :cond_0

    const-string v1, "androidPermission"

    invoke-virtual {v0, v1}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type kotlin.Int"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const-string v2, "mediaLocation"

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v2, "null cannot be cast to non-null type kotlin.Boolean"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/n;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iget-object v2, p0, Lt5/g;->c:Ly5/c;

    iget-object v3, p0, Lt5/g;->b:Landroid/app/Activity;

    invoke-virtual {v2, v3}, Ly5/c;->m(Landroid/app/Activity;)Ly5/c;

    move-result-object v2

    new-instance v3, Lt5/g$e;

    invoke-direct {v3, p1, p0, v1, v0}, Lt5/g$e;-><init>(Lb6/e;Lt5/g;IZ)V

    invoke-virtual {v2, v3}, Ly5/c;->j(Ly5/b;)Ly5/c;

    move-result-object p1

    iget-object v2, p0, Lt5/g;->a:Landroid/content/Context;

    invoke-virtual {p1, v2, v1, v0}, Ly5/c;->h(Landroid/content/Context;IZ)Ly5/c;

    goto :goto_0

    :cond_0
    const-string v2, "presentLimited"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0, v3}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    iget-object v1, p0, Lt5/g;->c:Ly5/c;

    invoke-virtual {v1, v0, p1}, Ly5/c;->g(ILb6/e;)V

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final f(Landroid/app/Activity;)V
    .locals 1

    iput-object p1, p0, Lt5/g;->b:Landroid/app/Activity;

    iget-object v0, p0, Lt5/g;->d:Lt5/e;

    invoke-virtual {v0, p1}, Lt5/e;->a(Landroid/app/Activity;)V

    return-void
.end method

.method public final g()Lt5/e;
    .locals 1

    iget-object v0, p0, Lt5/g;->d:Lt5/e;

    return-object v0
.end method

.method public onMethodCall(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "result"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lb6/e;

    invoke-direct {v0, p2, p1}, Lb6/e;-><init>(Lio/flutter/plugin/common/MethodChannel$Result;Lio/flutter/plugin/common/MethodCall;)V

    iget-object p1, p1, Lio/flutter/plugin/common/MethodCall;->method:Ljava/lang/String;

    sget-object p2, Ls5/b;->a:Ls5/b$a;

    invoke-static {p1}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-virtual {p2, p1}, Ls5/b$a;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0, v0}, Lt5/g;->l(Lb6/e;)V

    return-void

    :cond_0
    invoke-virtual {p2, p1}, Ls5/b$a;->b(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-direct {p0, v0}, Lt5/g;->n(Lb6/e;)V

    return-void

    :cond_1
    iget-boolean p1, p0, Lt5/g;->r:Z

    invoke-direct {p0, v0}, Lt5/g;->m(Lb6/e;)V

    return-void
.end method
