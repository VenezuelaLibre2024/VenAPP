.class public final Lt5/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt5/b$a;
    }
.end annotation


# static fields
.field public static final d:Lt5/b$a;

.field private static final e:Ljava/util/concurrent/ExecutorService;


# instance fields
.field private final a:Landroid/content/Context;

.field private b:Z

.field private final c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ly3/d<",
            "Landroid/graphics/Bitmap;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lt5/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lt5/b$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lt5/b;->d:Lt5/b$a;

    const/4 v0, 0x5

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lt5/b;->e:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt5/b;->a:Landroid/content/Context;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lt5/b;->c:Ljava/util/ArrayList;

    return-void
.end method

.method public static synthetic a(Ly3/d;)V
    .locals 0

    invoke-static {p0}, Lt5/b;->x(Ly3/d;)V

    return-void
.end method

.method private final n()Lx5/e;
    .locals 2

    iget-boolean v0, p0, Lt5/b;->b:Z

    if-nez v0, :cond_1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lx5/a;->b:Lx5/a;

    goto :goto_1

    :cond_1
    :goto_0
    sget-object v0, Lx5/d;->b:Lx5/d;

    :goto_1
    return-object v0
.end method

.method private static final x(Ly3/d;)V
    .locals 1

    const-string v0, "$cacheFuture"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/util/concurrent/Future;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-interface {p0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    invoke-static {p0}, Lb6/a;->b(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public final A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lv5/a;
    .locals 6

    const-string v0, "path"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "desc"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-direct {p0}, Lt5/b;->n()Lx5/e;

    move-result-object v0

    iget-object v1, p0, Lt5/b;->a:Landroid/content/Context;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-interface/range {v0 .. v5}, Lx5/e;->C(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lv5/a;

    move-result-object p1

    return-object p1
.end method

.method public final B(Z)V
    .locals 0

    iput-boolean p1, p0, Lt5/b;->b:Z

    return-void
.end method

.method public final b(Ljava/lang/String;Lb6/e;)V
    .locals 2

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resultHandler"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lt5/b;->n()Lx5/e;

    move-result-object v0

    iget-object v1, p0, Lt5/b;->a:Landroid/content/Context;

    invoke-interface {v0, v1, p1}, Lx5/e;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p2, p1}, Lb6/e;->g(Ljava/lang/Object;)V

    return-void
.end method

.method public final c()V
    .locals 3

    iget-object v0, p0, Lt5/b;->c:Ljava/util/ArrayList;

    invoke-static {v0}, Ldk/p;->f0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lt5/b;->c:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly3/d;

    iget-object v2, p0, Lt5/b;->a:Landroid/content/Context;

    invoke-static {v2}, Lcom/bumptech/glide/b;->u(Landroid/content/Context;)Lcom/bumptech/glide/k;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/bumptech/glide/k;->m(Lz3/d;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final d()V
    .locals 2

    sget-object v0, La6/a;->a:La6/a;

    iget-object v1, p0, Lt5/b;->a:Landroid/content/Context;

    invoke-virtual {v0, v1}, La6/a;->a(Landroid/content/Context;)V

    invoke-direct {p0}, Lt5/b;->n()Lx5/e;

    move-result-object v0

    iget-object v1, p0, Lt5/b;->a:Landroid/content/Context;

    invoke-interface {v0, v1}, Lx5/e;->u(Landroid/content/Context;)V

    return-void
.end method

.method public final e(Ljava/lang/String;Ljava/lang/String;Lb6/e;)V
    .locals 3

    const-string v0, "assetId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "galleryId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resultHandler"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    :try_start_0
    invoke-direct {p0}, Lt5/b;->n()Lx5/e;

    move-result-object v1

    iget-object v2, p0, Lt5/b;->a:Landroid/content/Context;

    invoke-interface {v1, v2, p1, p2}, Lx5/e;->o(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lv5/a;

    move-result-object p1

    if-nez p1, :cond_0

    invoke-virtual {p3, v0}, Lb6/e;->g(Ljava/lang/Object;)V

    return-void

    :cond_0
    sget-object p2, Lx5/c;->a:Lx5/c;

    invoke-virtual {p2, p1}, Lx5/c;->a(Lv5/a;)Ljava/util/Map;

    move-result-object p1

    invoke-virtual {p3, p1}, Lb6/e;->g(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-static {p1}, Lb6/a;->b(Ljava/lang/Object;)V

    invoke-virtual {p3, v0}, Lb6/e;->g(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public final f(Ljava/lang/String;)Lv5/a;
    .locals 7

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lt5/b;->n()Lx5/e;

    move-result-object v1

    iget-object v2, p0, Lt5/b;->a:Landroid/content/Context;

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v3, p1

    invoke-static/range {v1 .. v6}, Lx5/e$b;->f(Lx5/e;Landroid/content/Context;Ljava/lang/String;ZILjava/lang/Object;)Lv5/a;

    move-result-object p1

    return-object p1
.end method

.method public final g(Ljava/lang/String;ILw5/e;)Lv5/b;
    .locals 10

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "option"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "isAll"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-direct {p0}, Lt5/b;->n()Lx5/e;

    move-result-object p1

    iget-object v0, p0, Lt5/b;->a:Landroid/content/Context;

    invoke-interface {p1, v0, p2, p3}, Lx5/e;->w(Landroid/content/Context;ILw5/e;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    goto :goto_1

    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    move v4, v0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv5/b;

    invoke-virtual {v0}, Lv5/b;->a()I

    move-result v0

    add-int/2addr v4, v0

    goto :goto_0

    :cond_1
    new-instance p1, Lv5/b;

    const-string v2, "isAll"

    const-string v3, "Recent"

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/16 v8, 0x20

    const/4 v9, 0x0

    move-object v1, p1

    move v5, p2

    invoke-direct/range {v1 .. v9}, Lv5/b;-><init>(Ljava/lang/String;Ljava/lang/String;IIZLjava/lang/Long;ILkotlin/jvm/internal/g;)V

    invoke-virtual {p3}, Lw5/e;->a()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-direct {p0}, Lt5/b;->n()Lx5/e;

    move-result-object p2

    iget-object p3, p0, Lt5/b;->a:Landroid/content/Context;

    invoke-interface {p2, p3, p1}, Lx5/e;->i(Landroid/content/Context;Lv5/b;)V

    :cond_2
    :goto_1
    return-object p1

    :cond_3
    invoke-direct {p0}, Lt5/b;->n()Lx5/e;

    move-result-object v0

    iget-object v1, p0, Lt5/b;->a:Landroid/content/Context;

    invoke-interface {v0, v1, p1, p2, p3}, Lx5/e;->D(Landroid/content/Context;Ljava/lang/String;ILw5/e;)Lv5/b;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p3}, Lw5/e;->a()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-direct {p0}, Lt5/b;->n()Lx5/e;

    move-result-object p2

    iget-object p3, p0, Lt5/b;->a:Landroid/content/Context;

    invoke-interface {p2, p3, p1}, Lx5/e;->i(Landroid/content/Context;Lv5/b;)V

    :cond_4
    return-object p1
.end method

.method public final h(Lb6/e;Lw5/e;I)V
    .locals 2

    const-string v0, "resultHandler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "option"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lt5/b;->n()Lx5/e;

    move-result-object v0

    iget-object v1, p0, Lt5/b;->a:Landroid/content/Context;

    invoke-interface {v0, v1, p2, p3}, Lx5/e;->F(Landroid/content/Context;Lw5/e;I)I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Lb6/e;->g(Ljava/lang/Object;)V

    return-void
.end method

.method public final i(Ljava/lang/String;IIILw5/e;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "III",
            "Lw5/e;",
            ")",
            "Ljava/util/List<",
            "Lv5/a;",
            ">;"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "option"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "isAll"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, ""

    :cond_0
    move-object v2, p1

    invoke-direct {p0}, Lt5/b;->n()Lx5/e;

    move-result-object v0

    iget-object v1, p0, Lt5/b;->a:Landroid/content/Context;

    move v3, p3

    move v4, p4

    move v5, p2

    move-object v6, p5

    invoke-interface/range {v0 .. v6}, Lx5/e;->y(Landroid/content/Context;Ljava/lang/String;IIILw5/e;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final j(Ljava/lang/String;IIILw5/e;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "III",
            "Lw5/e;",
            ")",
            "Ljava/util/List<",
            "Lv5/a;",
            ">;"
        }
    .end annotation

    const-string v0, "galleryId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "option"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "isAll"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, ""

    :cond_0
    move-object v2, p1

    invoke-direct {p0}, Lt5/b;->n()Lx5/e;

    move-result-object v0

    iget-object v1, p0, Lt5/b;->a:Landroid/content/Context;

    move v3, p3

    move v4, p4

    move v5, p2

    move-object v6, p5

    invoke-interface/range {v0 .. v6}, Lx5/e;->a(Landroid/content/Context;Ljava/lang/String;IIILw5/e;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final k(IZZLw5/e;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IZZ",
            "Lw5/e;",
            ")",
            "Ljava/util/List<",
            "Lv5/b;",
            ">;"
        }
    .end annotation

    const-string v0, "option"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p3, :cond_0

    invoke-direct {p0}, Lt5/b;->n()Lx5/e;

    move-result-object p2

    iget-object p3, p0, Lt5/b;->a:Landroid/content/Context;

    invoke-interface {p2, p3, p1, p4}, Lx5/e;->j(Landroid/content/Context;ILw5/e;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-direct {p0}, Lt5/b;->n()Lx5/e;

    move-result-object p3

    iget-object v0, p0, Lt5/b;->a:Landroid/content/Context;

    invoke-interface {p3, v0, p1, p4}, Lx5/e;->w(Landroid/content/Context;ILw5/e;)Ljava/util/List;

    move-result-object p3

    if-nez p2, :cond_1

    return-object p3

    :cond_1
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    const/4 p4, 0x0

    move v3, p4

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lv5/b;

    invoke-virtual {p4}, Lv5/b;->a()I

    move-result p4

    add-int/2addr v3, p4

    goto :goto_0

    :cond_2
    new-instance p2, Lv5/b;

    const-string v1, "isAll"

    const-string v2, "Recent"

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/16 v7, 0x20

    const/4 v8, 0x0

    move-object v0, p2

    move v4, p1

    invoke-direct/range {v0 .. v8}, Lv5/b;-><init>(Ljava/lang/String;Ljava/lang/String;IIZLjava/lang/Long;ILkotlin/jvm/internal/g;)V

    invoke-static {p2}, Ldk/p;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    check-cast p3, Ljava/lang/Iterable;

    invoke-static {p1, p3}, Ldk/p;->R(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final l(Lb6/e;Lw5/e;III)V
    .locals 7

    const-string v0, "resultHandler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "option"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lt5/b;->n()Lx5/e;

    move-result-object v1

    iget-object v2, p0, Lt5/b;->a:Landroid/content/Context;

    move-object v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    invoke-interface/range {v1 .. v6}, Lx5/e;->s(Landroid/content/Context;Lw5/e;III)Ljava/util/List;

    move-result-object p2

    sget-object p3, Lx5/c;->a:Lx5/c;

    invoke-virtual {p3, p2}, Lx5/c;->b(Ljava/util/List;)Ljava/util/Map;

    move-result-object p2

    invoke-virtual {p1, p2}, Lb6/e;->g(Ljava/lang/Object;)V

    return-void
.end method

.method public final m(Lb6/e;)V
    .locals 2

    const-string v0, "resultHandler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lt5/b;->n()Lx5/e;

    move-result-object v0

    iget-object v1, p0, Lt5/b;->a:Landroid/content/Context;

    invoke-interface {v0, v1}, Lx5/e;->t(Landroid/content/Context;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb6/e;->g(Ljava/lang/Object;)V

    return-void
.end method

.method public final o(Ljava/lang/String;ZLb6/e;)V
    .locals 2

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resultHandler"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lt5/b;->n()Lx5/e;

    move-result-object v0

    iget-object v1, p0, Lt5/b;->a:Landroid/content/Context;

    invoke-interface {v0, v1, p1, p2}, Lx5/e;->B(Landroid/content/Context;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Lb6/e;->g(Ljava/lang/Object;)V

    return-void
.end method

.method public final p(Ljava/lang/String;)Ljava/util/Map;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lt5/b;->n()Lx5/e;

    move-result-object v0

    iget-object v1, p0, Lt5/b;->a:Landroid/content/Context;

    invoke-interface {v0, v1, p1}, Lx5/e;->E(Landroid/content/Context;Ljava/lang/String;)Landroidx/exifinterface/media/a;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroidx/exifinterface/media/a;->l()[D

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    const-string v0, "lng"

    const-string v1, "lat"

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-nez p1, :cond_1

    new-array p1, v2, [Lck/m;

    const-wide/16 v5, 0x0

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-static {v1, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    aput-object v1, p1, v4

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-static {v0, v1}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v0

    aput-object v0, p1, v3

    invoke-static {p1}, Ldk/h0;->k([Lck/m;)Ljava/util/Map;

    move-result-object p1

    goto :goto_1

    :cond_1
    new-array v2, v2, [Lck/m;

    aget-wide v5, p1, v4

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    invoke-static {v1, v5}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    aput-object v1, v2, v4

    aget-wide v4, p1, v3

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-static {v0, p1}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object p1

    aput-object p1, v2, v3

    invoke-static {v2}, Ldk/h0;->k([Lck/m;)Ljava/util/Map;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public final q(JI)Ljava/lang/String;
    .locals 2

    invoke-direct {p0}, Lt5/b;->n()Lx5/e;

    move-result-object v0

    iget-object v1, p0, Lt5/b;->a:Landroid/content/Context;

    invoke-interface {v0, v1, p1, p2, p3}, Lx5/e;->H(Landroid/content/Context;JI)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final r(Ljava/lang/String;Lb6/e;Z)V
    .locals 7

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resultHandler"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lt5/b;->n()Lx5/e;

    move-result-object v1

    iget-object v2, p0, Lt5/b;->a:Landroid/content/Context;

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v3, p1

    invoke-static/range {v1 .. v6}, Lx5/e$b;->f(Lx5/e;Landroid/content/Context;Ljava/lang/String;ZILjava/lang/Object;)Lv5/a;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v2, "The asset not found"

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v1, p2

    invoke-static/range {v1 .. v6}, Lb6/e;->j(Lb6/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void

    :cond_0
    :try_start_0
    invoke-direct {p0}, Lt5/b;->n()Lx5/e;

    move-result-object v1

    iget-object v2, p0, Lt5/b;->a:Landroid/content/Context;

    invoke-interface {v1, v2, v0, p3}, Lx5/e;->n(Landroid/content/Context;Lv5/a;Z)[B

    move-result-object p3

    invoke-virtual {p2, p3}, Lb6/e;->g(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p3

    invoke-direct {p0}, Lt5/b;->n()Lx5/e;

    move-result-object v0

    iget-object v1, p0, Lt5/b;->a:Landroid/content/Context;

    invoke-interface {v0, v1, p1}, Lx5/e;->x(Landroid/content/Context;Ljava/lang/String;)V

    const-string p1, "202"

    const-string v0, "get originBytes error"

    invoke-virtual {p2, p1, v0, p3}, Lb6/e;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public final s(Ljava/lang/String;Lv5/d;Lb6/e;)V
    .locals 19

    move-object/from16 v1, p0

    move-object/from16 v8, p1

    move-object/from16 v15, p3

    const-string v0, "id"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "option"

    move-object/from16 v9, p2

    invoke-static {v9, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resultHandler"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p2 .. p2}, Lv5/d;->e()I

    move-result v14

    invoke-virtual/range {p2 .. p2}, Lv5/d;->c()I

    move-result v13

    invoke-virtual/range {p2 .. p2}, Lv5/d;->d()I

    move-result v0

    invoke-virtual/range {p2 .. p2}, Lv5/d;->a()Landroid/graphics/Bitmap$CompressFormat;

    move-result-object v16

    invoke-virtual/range {p2 .. p2}, Lv5/d;->b()J

    move-result-wide v17

    :try_start_0
    invoke-direct/range {p0 .. p0}, Lt5/b;->n()Lx5/e;

    move-result-object v2

    iget-object v3, v1, Lt5/b;->a:Landroid/content/Context;

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object/from16 v4, p1

    invoke-static/range {v2 .. v7}, Lx5/e$b;->f(Lx5/e;Landroid/content/Context;Ljava/lang/String;ZILjava/lang/Object;)Lv5/a;

    move-result-object v11

    if-nez v11, :cond_0

    const-string v3, "The asset not found!"

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object/from16 v2, p3

    invoke-static/range {v2 .. v7}, Lb6/e;->j(Lb6/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void

    :cond_0
    sget-object v2, La6/a;->a:La6/a;

    iget-object v10, v1, Lt5/b;->a:Landroid/content/Context;

    invoke-virtual/range {p2 .. p2}, Lv5/d;->e()I

    move-result v12

    invoke-virtual/range {p2 .. p2}, Lv5/d;->c()I

    move-result v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-object v9, v2

    move v2, v13

    move v13, v3

    move v3, v14

    move-object/from16 v14, v16

    move-object v4, v15

    move v15, v0

    move-wide/from16 v16, v17

    move-object/from16 v18, p3

    :try_start_1
    invoke-virtual/range {v9 .. v18}, La6/a;->b(Landroid/content/Context;Lv5/a;IILandroid/graphics/Bitmap$CompressFormat;IJLb6/e;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    move v2, v13

    move v3, v14

    move-object v4, v15

    :goto_0
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "get "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, " thumbnail error, width : "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ", height: "

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "PhotoManager"

    invoke-static {v3, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    invoke-direct/range {p0 .. p0}, Lt5/b;->n()Lx5/e;

    move-result-object v2

    iget-object v3, v1, Lt5/b;->a:Landroid/content/Context;

    invoke-interface {v2, v3, v8}, Lx5/e;->x(Landroid/content/Context;Ljava/lang/String;)V

    const-string v2, "201"

    const-string v3, "get thumb error"

    invoke-virtual {v4, v2, v3, v0}, Lb6/e;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_1
    return-void
.end method

.method public final t(Ljava/lang/String;)Landroid/net/Uri;
    .locals 7

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lt5/b;->n()Lx5/e;

    move-result-object v1

    iget-object v2, p0, Lt5/b;->a:Landroid/content/Context;

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v3, p1

    invoke-static/range {v1 .. v6}, Lx5/e$b;->f(Lx5/e;Landroid/content/Context;Ljava/lang/String;ZILjava/lang/Object;)Lv5/a;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lv5/a;->n()Landroid/net/Uri;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final u(Ljava/lang/String;Ljava/lang/String;Lb6/e;)V
    .locals 3

    const-string v0, "assetId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "albumId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resultHandler"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    :try_start_0
    invoke-direct {p0}, Lt5/b;->n()Lx5/e;

    move-result-object v1

    iget-object v2, p0, Lt5/b;->a:Landroid/content/Context;

    invoke-interface {v1, v2, p1, p2}, Lx5/e;->G(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lv5/a;

    move-result-object p1

    if-nez p1, :cond_0

    invoke-virtual {p3, v0}, Lb6/e;->g(Ljava/lang/Object;)V

    return-void

    :cond_0
    sget-object p2, Lx5/c;->a:Lx5/c;

    invoke-virtual {p2, p1}, Lx5/c;->a(Lv5/a;)Ljava/util/Map;

    move-result-object p1

    invoke-virtual {p3, p1}, Lb6/e;->g(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-static {p1}, Lb6/a;->b(Ljava/lang/Object;)V

    invoke-virtual {p3, v0}, Lb6/e;->g(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public final v(Lb6/e;)V
    .locals 2

    const-string v0, "resultHandler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lt5/b;->n()Lx5/e;

    move-result-object v0

    iget-object v1, p0, Lt5/b;->a:Landroid/content/Context;

    invoke-interface {v0, v1}, Lx5/e;->e(Landroid/content/Context;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb6/e;->g(Ljava/lang/Object;)V

    return-void
.end method

.method public final w(Ljava/util/List;Lv5/d;Lb6/e;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lv5/d;",
            "Lb6/e;",
            ")V"
        }
    .end annotation

    const-string v0, "ids"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "option"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resultHandler"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lt5/b;->n()Lx5/e;

    move-result-object v0

    iget-object v1, p0, Lt5/b;->a:Landroid/content/Context;

    invoke-interface {v0, v1, p1}, Lx5/e;->m(Landroid/content/Context;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    sget-object v1, La6/a;->a:La6/a;

    iget-object v2, p0, Lt5/b;->a:Landroid/content/Context;

    invoke-virtual {v1, v2, v0, p2}, La6/a;->c(Landroid/content/Context;Ljava/lang/String;Lv5/d;)Ly3/d;

    move-result-object v0

    iget-object v1, p0, Lt5/b;->c:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p3, p1}, Lb6/e;->g(Ljava/lang/Object;)V

    iget-object p1, p0, Lt5/b;->c:Ljava/util/ArrayList;

    invoke-static {p1}, Ldk/p;->f0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ly3/d;

    sget-object p3, Lt5/b;->e:Ljava/util/concurrent/ExecutorService;

    new-instance v0, Lt5/a;

    invoke-direct {v0, p2}, Lt5/a;-><init>(Ly3/d;)V

    invoke-interface {p3, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_1

    :cond_1
    return-void
.end method

.method public final y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lv5/a;
    .locals 7

    const-string v0, "path"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lt5/b;->n()Lx5/e;

    move-result-object v1

    iget-object v2, p0, Lt5/b;->a:Landroid/content/Context;

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-interface/range {v1 .. v6}, Lx5/e;->l(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lv5/a;

    move-result-object p1

    return-object p1
.end method

.method public final z([BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lv5/a;
    .locals 7

    const-string v0, "image"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lt5/b;->n()Lx5/e;

    move-result-object v1

    iget-object v2, p0, Lt5/b;->a:Landroid/content/Context;

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-interface/range {v1 .. v6}, Lx5/e;->f(Landroid/content/Context;[BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lv5/a;

    move-result-object p1

    return-object p1
.end method
