.class public Ld3/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;


# static fields
.field private static final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:I

.field private final c:Le3/b;

.field private final d:Ljava/util/concurrent/Executor;

.field private final e:Ljava/util/concurrent/Executor;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "PUT"

    const-string v1, "PATCH"

    const-string v2, "POST"

    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Ld3/p;->f:Ljava/util/List;

    return-void
.end method

.method constructor <init>(Landroid/content/Context;ILe3/b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Ld3/p;->d:Ljava/util/concurrent/Executor;

    invoke-static {p1}, Landroidx/core/content/a;->getMainExecutor(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    move-result-object v0

    iput-object v0, p0, Ld3/p;->e:Ljava/util/concurrent/Executor;

    iput-object p1, p0, Ld3/p;->a:Landroid/content/Context;

    iput p2, p0, Ld3/p;->b:I

    iput-object p3, p0, Ld3/p;->c:Le3/b;

    return-void
.end method

.method public static synthetic a(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 0

    invoke-static {p0}, Ld3/p;->q(Lio/flutter/plugin/common/MethodChannel$Result;)V

    return-void
.end method

.method public static synthetic b(Ld3/p;Lf2/u;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ld3/p;->z(Lf2/u;Lio/flutter/plugin/common/MethodChannel$Result;)V

    return-void
.end method

.method public static synthetic c(Ld3/p;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 0

    invoke-direct {p0, p1}, Ld3/p;->r(Lio/flutter/plugin/common/MethodChannel$Result;)V

    return-void
.end method

.method public static synthetic d(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 0

    invoke-static {p0}, Ld3/p;->u(Lio/flutter/plugin/common/MethodChannel$Result;)V

    return-void
.end method

.method public static synthetic e(Ld3/p;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 0

    invoke-direct {p0, p1}, Ld3/p;->t(Lio/flutter/plugin/common/MethodChannel$Result;)V

    return-void
.end method

.method public static synthetic f(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 0

    invoke-static {p0}, Ld3/p;->s(Lio/flutter/plugin/common/MethodChannel$Result;)V

    return-void
.end method

.method public static synthetic g(Ld3/p;Lf2/u;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ld3/p;->x(Lf2/u;Lio/flutter/plugin/common/MethodChannel$Result;)V

    return-void
.end method

.method public static synthetic h(Ld3/p;Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ld3/p;->y(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic i(Ld3/p;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 0

    invoke-direct {p0, p1}, Ld3/p;->v(Lio/flutter/plugin/common/MethodChannel$Result;)V

    return-void
.end method

.method public static synthetic j(Ld3/p;Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ld3/p;->w(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;)V

    return-void
.end method

.method private k(Ld3/t;)Lf2/u;
    .locals 5

    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    new-instance v1, Landroidx/work/b$a;

    invoke-direct {v1}, Landroidx/work/b$a;-><init>()V

    invoke-virtual {p1}, Ld3/t;->g()Ljava/lang/String;

    move-result-object v2

    const-string v3, "url"

    invoke-virtual {v1, v3, v2}, Landroidx/work/b$a;->h(Ljava/lang/String;Ljava/lang/String;)Landroidx/work/b$a;

    move-result-object v1

    const-string v2, "method"

    invoke-virtual {p1}, Ld3/t;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroidx/work/b$a;->h(Ljava/lang/String;Ljava/lang/String;)Landroidx/work/b$a;

    move-result-object v1

    const-string v2, "requestTimeout"

    invoke-virtual {p1}, Ld3/t;->f()I

    move-result v3

    invoke-virtual {v1, v2, v3}, Landroidx/work/b$a;->f(Ljava/lang/String;I)Landroidx/work/b$a;

    move-result-object v1

    const-string v2, "binaryUpload"

    invoke-virtual {p1}, Ld3/t;->i()Z

    move-result v3

    invoke-virtual {v1, v2, v3}, Landroidx/work/b$a;->e(Ljava/lang/String;Z)Landroidx/work/b$a;

    move-result-object v1

    const-string v2, "tag"

    invoke-virtual {p1}, Ld3/t;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroidx/work/b$a;->h(Ljava/lang/String;Ljava/lang/String;)Landroidx/work/b$a;

    move-result-object v1

    invoke-virtual {p1}, Ld3/t;->a()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/gson/Gson;->r(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "files"

    invoke-virtual {v1, v3, v2}, Landroidx/work/b$a;->h(Ljava/lang/String;Ljava/lang/String;)Landroidx/work/b$a;

    invoke-virtual {p1}, Ld3/t;->b()Ljava/util/Map;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {p1}, Ld3/t;->b()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/gson/Gson;->r(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "headers"

    invoke-virtual {v1, v3, v2}, Landroidx/work/b$a;->h(Ljava/lang/String;Ljava/lang/String;)Landroidx/work/b$a;

    :cond_0
    invoke-virtual {p1}, Ld3/t;->d()Ljava/util/Map;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {p1}, Ld3/t;->d()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/gson/Gson;->r(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "data"

    invoke-virtual {v1, v2, v0}, Landroidx/work/b$a;->h(Ljava/lang/String;Ljava/lang/String;)Landroidx/work/b$a;

    :cond_1
    new-instance v0, Lf2/b$a;

    invoke-direct {v0}, Lf2/b$a;-><init>()V

    invoke-virtual {p1}, Ld3/t;->h()Z

    move-result p1

    if-eqz p1, :cond_2

    sget-object p1, Lf2/k;->CONNECTED:Lf2/k;

    goto :goto_0

    :cond_2
    sget-object p1, Lf2/k;->UNMETERED:Lf2/k;

    :goto_0
    invoke-virtual {v0, p1}, Lf2/b$a;->b(Lf2/k;)Lf2/b$a;

    move-result-object p1

    invoke-virtual {p1}, Lf2/b$a;->a()Lf2/b;

    move-result-object p1

    new-instance v0, Lf2/l$a;

    const-class v2, Lcom/bluechilli/flutteruploader/UploadWorker;

    invoke-direct {v0, v2}, Lf2/l$a;-><init>(Ljava/lang/Class;)V

    invoke-virtual {v0, p1}, Lf2/u$a;->j(Lf2/b;)Lf2/u$a;

    move-result-object p1

    check-cast p1, Lf2/l$a;

    const-string v0, "flutter_upload_task"

    invoke-virtual {p1, v0}, Lf2/u$a;->a(Ljava/lang/String;)Lf2/u$a;

    move-result-object p1

    check-cast p1, Lf2/l$a;

    sget-object v0, Lf2/a;->EXPONENTIAL:Lf2/a;

    const-wide/16 v2, 0x5

    sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v2, v3, v4}, Lf2/u$a;->i(Lf2/a;JLjava/util/concurrent/TimeUnit;)Lf2/u$a;

    move-result-object p1

    check-cast p1, Lf2/l$a;

    invoke-virtual {v1}, Landroidx/work/b$a;->a()Landroidx/work/b;

    move-result-object v0

    invoke-virtual {p1, v0}, Lf2/u$a;->l(Landroidx/work/b;)Lf2/u$a;

    move-result-object p1

    check-cast p1, Lf2/l$a;

    invoke-virtual {p1}, Lf2/u$a;->b()Lf2/u;

    move-result-object p1

    return-object p1
.end method

.method private l(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 1

    const-string v0, "taskId"

    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iget-object v0, p0, Ld3/p;->a:Landroid/content/Context;

    invoke-static {v0}, Lf2/t;->e(Landroid/content/Context;)Lf2/t;

    move-result-object v0

    invoke-static {p1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {v0, p1}, Lf2/t;->b(Ljava/util/UUID;)Lf2/m;

    move-result-object p1

    invoke-interface {p1}, Lf2/m;->getResult()Lcom/google/common/util/concurrent/f;

    move-result-object p1

    new-instance v0, Ld3/i;

    invoke-direct {v0, p0, p2}, Ld3/i;-><init>(Ld3/p;Lio/flutter/plugin/common/MethodChannel$Result;)V

    iget-object p2, p0, Ld3/p;->d:Ljava/util/concurrent/Executor;

    invoke-interface {p1, v0, p2}, Lcom/google/common/util/concurrent/f;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method private m(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 1

    iget-object p1, p0, Ld3/p;->a:Landroid/content/Context;

    invoke-static {p1}, Lf2/t;->e(Landroid/content/Context;)Lf2/t;

    move-result-object p1

    const-string v0, "flutter_upload_task"

    invoke-virtual {p1, v0}, Lf2/t;->a(Ljava/lang/String;)Lf2/m;

    move-result-object p1

    invoke-interface {p1}, Lf2/m;->getResult()Lcom/google/common/util/concurrent/f;

    move-result-object p1

    new-instance v0, Ld3/f;

    invoke-direct {v0, p0, p2}, Ld3/f;-><init>(Ld3/p;Lio/flutter/plugin/common/MethodChannel$Result;)V

    iget-object p2, p0, Ld3/p;->d:Ljava/util/concurrent/Executor;

    invoke-interface {p1, v0, p2}, Lcom/google/common/util/concurrent/f;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method private n(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 1

    iget-object p1, p0, Ld3/p;->a:Landroid/content/Context;

    invoke-static {p1}, Lf2/t;->e(Landroid/content/Context;)Lf2/t;

    move-result-object p1

    invoke-virtual {p1}, Lf2/t;->h()Lf2/m;

    move-result-object p1

    invoke-interface {p1}, Lf2/m;->getResult()Lcom/google/common/util/concurrent/f;

    move-result-object p1

    new-instance v0, Ld3/j;

    invoke-direct {v0, p0, p2}, Ld3/j;-><init>(Ld3/p;Lio/flutter/plugin/common/MethodChannel$Result;)V

    iget-object p2, p0, Ld3/p;->d:Ljava/util/concurrent/Executor;

    invoke-interface {p1, v0, p2}, Lcom/google/common/util/concurrent/f;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method private o(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 12

    const-string v0, "url"

    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    const-string v0, "method"

    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "files"

    invoke-virtual {p1, v1}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    const-string v3, "data"

    invoke-virtual {p1, v3}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    move-object v6, v3

    check-cast v6, Ljava/util/Map;

    const-string v3, "headers"

    invoke-virtual {p1, v3}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Ljava/util/Map;

    const-string v3, "tag"

    invoke-virtual {p1, v3}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    move-object v9, v3

    check-cast v9, Ljava/lang/String;

    const-string v3, "allowCellular"

    invoke-virtual {p1, v3}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    const/4 v3, 0x0

    if-nez p1, :cond_0

    const-string p1, "invalid_flag"

    const-string v0, "allowCellular must be set"

    invoke-interface {p2, p1, v0, v3}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_0
    if-nez v0, :cond_1

    const-string v0, "POST"

    :cond_1
    if-eqz v1, :cond_5

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_1

    :cond_2
    sget-object v4, Ld3/p;->f:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v4, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    const-string p1, "invalid_method"

    const-string v0, "Method must be either POST | PUT | PATCH"

    invoke-interface {p2, p1, v0, v3}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_3
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map;

    invoke-static {v3}, Ld3/c;->a(Ljava/util/Map;)Ld3/c;

    move-result-object v3

    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    new-instance v11, Ld3/t;

    iget v7, p0, Ld3/p;->b:I

    const/4 v8, 0x0

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v10

    move-object v1, v11

    move-object v3, v0

    invoke-direct/range {v1 .. v10}, Ld3/t;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;IZLjava/lang/String;Z)V

    invoke-direct {p0, v11}, Ld3/p;->k(Ld3/t;)Lf2/u;

    move-result-object p1

    iget-object v0, p0, Ld3/p;->a:Landroid/content/Context;

    invoke-static {v0}, Lf2/t;->e(Landroid/content/Context;)Lf2/t;

    move-result-object v0

    invoke-virtual {v0, p1}, Lf2/t;->c(Lf2/u;)Lf2/m;

    move-result-object v0

    invoke-interface {v0}, Lf2/m;->getResult()Lcom/google/common/util/concurrent/f;

    move-result-object v0

    new-instance v1, Ld3/g;

    invoke-direct {v1, p0, p1, p2}, Ld3/g;-><init>(Ld3/p;Lf2/u;Lio/flutter/plugin/common/MethodChannel$Result;)V

    iget-object p1, p0, Ld3/p;->d:Ljava/util/concurrent/Executor;

    invoke-interface {v0, v1, p1}, Lcom/google/common/util/concurrent/f;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void

    :cond_5
    :goto_1
    const-string p1, "invalid_call"

    const-string v0, "Invalid call parameters passed"

    invoke-interface {p2, p1, v0, v3}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method private p(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 12

    const-string v0, "url"

    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    const-string v0, "method"

    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "path"

    invoke-virtual {p1, v1}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v3, "headers"

    invoke-virtual {p1, v3}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Ljava/util/Map;

    const-string v3, "tag"

    invoke-virtual {p1, v3}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    move-object v9, v3

    check-cast v9, Ljava/lang/String;

    const-string v3, "allowCellular"

    invoke-virtual {p1, v3}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    const/4 v3, 0x0

    if-nez p1, :cond_0

    const-string p1, "invalid_flag"

    const-string v0, "allowCellular must be set"

    invoke-interface {p2, p1, v0, v3}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_0
    if-nez v0, :cond_1

    const-string v0, "POST"

    :cond_1
    if-nez v1, :cond_2

    const-string p1, "invalid_call"

    const-string v0, "Invalid call parameters passed"

    invoke-interface {p2, p1, v0, v3}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_2
    sget-object v4, Ld3/p;->f:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    const-string p1, "invalid_method"

    const-string v0, "Method must be either POST | PUT | PATCH"

    invoke-interface {p2, p1, v0, v3}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_3
    new-instance v11, Ld3/t;

    new-instance v3, Ld3/c;

    invoke-direct {v3, v1}, Ld3/c;-><init>(Ljava/lang/String;)V

    invoke-static {v3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v6

    iget v7, p0, Ld3/p;->b:I

    const/4 v8, 0x1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v10

    move-object v1, v11

    move-object v3, v0

    invoke-direct/range {v1 .. v10}, Ld3/t;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;IZLjava/lang/String;Z)V

    invoke-direct {p0, v11}, Ld3/p;->k(Ld3/t;)Lf2/u;

    move-result-object p1

    iget-object v0, p0, Ld3/p;->a:Landroid/content/Context;

    invoke-static {v0}, Lf2/t;->e(Landroid/content/Context;)Lf2/t;

    move-result-object v0

    invoke-virtual {v0, p1}, Lf2/t;->c(Lf2/u;)Lf2/m;

    move-result-object v0

    invoke-interface {v0}, Lf2/m;->getResult()Lcom/google/common/util/concurrent/f;

    move-result-object v0

    new-instance v1, Ld3/h;

    invoke-direct {v1, p0, p1, p2}, Ld3/h;-><init>(Ld3/p;Lf2/u;Lio/flutter/plugin/common/MethodChannel$Result;)V

    iget-object p1, p0, Ld3/p;->d:Ljava/util/concurrent/Executor;

    invoke-interface {v0, v1, p1}, Lcom/google/common/util/concurrent/f;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method private static synthetic q(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void
.end method

.method private synthetic r(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    iget-object v0, p0, Ld3/p;->e:Ljava/util/concurrent/Executor;

    new-instance v1, Ld3/m;

    invoke-direct {v1, p1}, Ld3/m;-><init>(Lio/flutter/plugin/common/MethodChannel$Result;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method private static synthetic s(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void
.end method

.method private synthetic t(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    iget-object v0, p0, Ld3/p;->e:Ljava/util/concurrent/Executor;

    new-instance v1, Ld3/n;

    invoke-direct {v1, p1}, Ld3/n;-><init>(Lio/flutter/plugin/common/MethodChannel$Result;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method private static synthetic u(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void
.end method

.method private synthetic v(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    iget-object v0, p0, Ld3/p;->c:Le3/b;

    invoke-interface {v0}, Le3/b;->a()V

    iget-object v0, p0, Ld3/p;->e:Ljava/util/concurrent/Executor;

    new-instance v1, Ld3/k;

    invoke-direct {v1, p1}, Ld3/k;-><init>(Lio/flutter/plugin/common/MethodChannel$Result;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method private synthetic w(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;)V
    .locals 2

    invoke-interface {p1, p2}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    iget-object p1, p0, Ld3/p;->c:Le3/b;

    sget v0, Ld3/s;->a:I

    const/4 v1, 0x0

    invoke-interface {p1, p2, v0, v1}, Le3/b;->e(Ljava/lang/String;II)V

    return-void
.end method

.method private synthetic x(Lf2/u;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    invoke-virtual {p1}, Lf2/u;->a()Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Ld3/p;->e:Ljava/util/concurrent/Executor;

    new-instance v1, Ld3/l;

    invoke-direct {v1, p0, p2, p1}, Ld3/l;-><init>(Ld3/p;Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method private synthetic y(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;)V
    .locals 2

    invoke-interface {p1, p2}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    iget-object p1, p0, Ld3/p;->c:Le3/b;

    sget v0, Ld3/s;->a:I

    const/4 v1, 0x0

    invoke-interface {p1, p2, v0, v1}, Le3/b;->e(Ljava/lang/String;II)V

    return-void
.end method

.method private synthetic z(Lf2/u;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    invoke-virtual {p1}, Lf2/u;->a()Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Ld3/p;->e:Ljava/util/concurrent/Executor;

    new-instance v1, Ld3/o;

    invoke-direct {v1, p0, p2, p1}, Ld3/o;-><init>(Ld3/p;Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method


# virtual methods
.method A(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 3

    const-string v0, "callbackHandle"

    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    if-eqz p1, :cond_0

    iget-object v0, p0, Ld3/p;->a:Landroid/content/Context;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-static {v0, p1}, Ld3/q;->c(Landroid/content/Context;Ljava/lang/Long;)V

    :cond_0
    const/4 p1, 0x0

    invoke-interface {p2, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void
.end method

.method public onMethodCall(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 3

    iget-object v0, p1, Lio/flutter/plugin/common/MethodCall;->method:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/4 v2, -0x1

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v1, "setBackgroundHandler"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x5

    goto :goto_0

    :sswitch_1
    const-string v1, "cancelAll"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x4

    goto :goto_0

    :sswitch_2
    const-string v1, "enqueueBinary"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v2, 0x3

    goto :goto_0

    :sswitch_3
    const-string v1, "clearUploads"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v2, 0x2

    goto :goto_0

    :sswitch_4
    const-string v1, "cancel"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    const/4 v2, 0x1

    goto :goto_0

    :sswitch_5
    const-string v1, "enqueue"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    :cond_5
    const/4 v2, 0x0

    :goto_0
    packed-switch v2, :pswitch_data_0

    invoke-interface {p2}, Lio/flutter/plugin/common/MethodChannel$Result;->notImplemented()V

    goto :goto_1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Ld3/p;->A(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto :goto_1

    :pswitch_1
    invoke-direct {p0, p1, p2}, Ld3/p;->m(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto :goto_1

    :pswitch_2
    invoke-direct {p0, p1, p2}, Ld3/p;->p(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto :goto_1

    :pswitch_3
    invoke-direct {p0, p1, p2}, Ld3/p;->n(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto :goto_1

    :pswitch_4
    invoke-direct {p0, p1, p2}, Ld3/p;->l(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto :goto_1

    :pswitch_5
    invoke-direct {p0, p1, p2}, Ld3/p;->o(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V

    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x5f0671f8 -> :sswitch_5
        -0x5185d186 -> :sswitch_4
        -0xeedac7b -> :sswitch_3
        0x14e3e029 -> :sswitch_2
        0x1c6788c7 -> :sswitch_1
        0x1e129dfa -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
