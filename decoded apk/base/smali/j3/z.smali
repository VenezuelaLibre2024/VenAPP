.class Lj3/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj3/f;
.implements Lj3/f$a;


# instance fields
.field private final a:Lj3/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj3/g<",
            "*>;"
        }
    .end annotation
.end field

.field private final b:Lj3/f$a;

.field private volatile c:I

.field private volatile d:Lj3/c;

.field private volatile e:Ljava/lang/Object;

.field private volatile f:Ln3/o$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln3/o$a<",
            "*>;"
        }
    .end annotation
.end field

.field private volatile r:Lj3/d;


# direct methods
.method constructor <init>(Lj3/g;Lj3/f$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj3/g<",
            "*>;",
            "Lj3/f$a;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj3/z;->a:Lj3/g;

    iput-object p2, p0, Lj3/z;->b:Lj3/f$a;

    return-void
.end method

.method private c(Ljava/lang/Object;)Z
    .locals 11

    const-string v0, "SourceGenerator"

    invoke-static {}, Lc4/g;->b()J

    move-result-wide v1

    const/4 v3, 0x0

    :try_start_0
    iget-object v4, p0, Lj3/z;->a:Lj3/g;

    invoke-virtual {v4, p1}, Lj3/g;->o(Ljava/lang/Object;)Lcom/bumptech/glide/load/data/e;

    move-result-object v4

    invoke-interface {v4}, Lcom/bumptech/glide/load/data/e;->a()Ljava/lang/Object;

    move-result-object v5

    iget-object v6, p0, Lj3/z;->a:Lj3/g;

    invoke-virtual {v6, v5}, Lj3/g;->q(Ljava/lang/Object;)Lh3/d;

    move-result-object v6

    new-instance v7, Lj3/e;

    iget-object v8, p0, Lj3/z;->a:Lj3/g;

    invoke-virtual {v8}, Lj3/g;->k()Lh3/h;

    move-result-object v8

    invoke-direct {v7, v6, v5, v8}, Lj3/e;-><init>(Lh3/d;Ljava/lang/Object;Lh3/h;)V

    new-instance v5, Lj3/d;

    iget-object v8, p0, Lj3/z;->f:Ln3/o$a;

    iget-object v8, v8, Ln3/o$a;->a:Lh3/f;

    iget-object v9, p0, Lj3/z;->a:Lj3/g;

    invoke-virtual {v9}, Lj3/g;->p()Lh3/f;

    move-result-object v9

    invoke-direct {v5, v8, v9}, Lj3/d;-><init>(Lh3/f;Lh3/f;)V

    iget-object v8, p0, Lj3/z;->a:Lj3/g;

    invoke-virtual {v8}, Lj3/g;->d()Ll3/a;

    move-result-object v8

    invoke-interface {v8, v5, v7}, Ll3/a;->a(Lh3/f;Ll3/a$b;)V

    const/4 v7, 0x2

    invoke-static {v0, v7}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const-string v9, ", data: "

    if-eqz v7, :cond_0

    :try_start_1
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "Finished encoding source to cache, key: "

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v10, ", encoder: "

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, ", duration: "

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v1, v2}, Lc4/g;->a(J)D

    move-result-wide v1

    invoke-virtual {v7, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    invoke-interface {v8, v5}, Ll3/a;->b(Lh3/f;)Ljava/io/File;

    move-result-object v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    iput-object v5, p0, Lj3/z;->r:Lj3/d;

    new-instance p1, Lj3/c;

    iget-object v0, p0, Lj3/z;->f:Ln3/o$a;

    iget-object v0, v0, Ln3/o$a;->a:Lh3/f;

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lj3/z;->a:Lj3/g;

    invoke-direct {p1, v0, v1, p0}, Lj3/c;-><init>(Ljava/util/List;Lj3/g;Lj3/f$a;)V

    iput-object p1, p0, Lj3/z;->d:Lj3/c;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    iget-object p1, p0, Lj3/z;->f:Ln3/o$a;

    iget-object p1, p1, Ln3/o$a;->c:Lcom/bumptech/glide/load/data/d;

    invoke-interface {p1}, Lcom/bumptech/glide/load/data/d;->b()V

    return v2

    :cond_1
    const/4 v1, 0x3

    :try_start_2
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Attempt to write: "

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lj3/z;->r:Lj3/d;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly..."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :cond_2
    :try_start_3
    iget-object p1, p0, Lj3/z;->b:Lj3/f$a;

    iget-object v0, p0, Lj3/z;->f:Ln3/o$a;

    iget-object v5, v0, Ln3/o$a;->a:Lh3/f;

    invoke-interface {v4}, Lcom/bumptech/glide/load/data/e;->a()Ljava/lang/Object;

    move-result-object v6

    iget-object v0, p0, Lj3/z;->f:Ln3/o$a;

    iget-object v7, v0, Ln3/o$a;->c:Lcom/bumptech/glide/load/data/d;

    iget-object v0, p0, Lj3/z;->f:Ln3/o$a;

    iget-object v0, v0, Ln3/o$a;->c:Lcom/bumptech/glide/load/data/d;

    invoke-interface {v0}, Lcom/bumptech/glide/load/data/d;->d()Lh3/a;

    move-result-object v8

    iget-object v0, p0, Lj3/z;->f:Ln3/o$a;

    iget-object v9, v0, Ln3/o$a;->a:Lh3/f;

    move-object v4, p1

    invoke-interface/range {v4 .. v9}, Lj3/f$a;->b(Lh3/f;Ljava/lang/Object;Lcom/bumptech/glide/load/data/d;Lh3/a;Lh3/f;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    return v3

    :catchall_0
    move-exception p1

    move v3, v2

    goto :goto_0

    :catchall_1
    move-exception p1

    :goto_0
    if-nez v3, :cond_3

    iget-object v0, p0, Lj3/z;->f:Ln3/o$a;

    iget-object v0, v0, Ln3/o$a;->c:Lcom/bumptech/glide/load/data/d;

    invoke-interface {v0}, Lcom/bumptech/glide/load/data/d;->b()V

    :cond_3
    throw p1
.end method

.method private d()Z
    .locals 2

    iget v0, p0, Lj3/z;->c:I

    iget-object v1, p0, Lj3/z;->a:Lj3/g;

    invoke-virtual {v1}, Lj3/g;->g()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private h(Ln3/o$a;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln3/o$a<",
            "*>;)V"
        }
    .end annotation

    iget-object v0, p0, Lj3/z;->f:Ln3/o$a;

    iget-object v0, v0, Ln3/o$a;->c:Lcom/bumptech/glide/load/data/d;

    iget-object v1, p0, Lj3/z;->a:Lj3/g;

    invoke-virtual {v1}, Lj3/g;->l()Lcom/bumptech/glide/g;

    move-result-object v1

    new-instance v2, Lj3/z$a;

    invoke-direct {v2, p0, p1}, Lj3/z$a;-><init>(Lj3/z;Ln3/o$a;)V

    invoke-interface {v0, v1, v2}, Lcom/bumptech/glide/load/data/d;->e(Lcom/bumptech/glide/g;Lcom/bumptech/glide/load/data/d$a;)V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 5

    iget-object v0, p0, Lj3/z;->e:Ljava/lang/Object;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lj3/z;->e:Ljava/lang/Object;

    iput-object v1, p0, Lj3/z;->e:Ljava/lang/Object;

    :try_start_0
    invoke-direct {p0, v0}, Lj3/z;->c(Ljava/lang/Object;)Z

    move-result v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v0, :cond_0

    return v2

    :catch_0
    move-exception v0

    const/4 v3, 0x3

    const-string v4, "SourceGenerator"

    invoke-static {v4, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v3, "Failed to properly rewind or write data to cache"

    invoke-static {v4, v3, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    iget-object v0, p0, Lj3/z;->d:Lj3/c;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lj3/z;->d:Lj3/c;

    invoke-virtual {v0}, Lj3/c;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    return v2

    :cond_1
    iput-object v1, p0, Lj3/z;->d:Lj3/c;

    iput-object v1, p0, Lj3/z;->f:Ln3/o$a;

    const/4 v0, 0x0

    :cond_2
    :goto_0
    if-nez v0, :cond_4

    invoke-direct {p0}, Lj3/z;->d()Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Lj3/z;->a:Lj3/g;

    invoke-virtual {v1}, Lj3/g;->g()Ljava/util/List;

    move-result-object v1

    iget v3, p0, Lj3/z;->c:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Lj3/z;->c:I

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln3/o$a;

    iput-object v1, p0, Lj3/z;->f:Ln3/o$a;

    iget-object v1, p0, Lj3/z;->f:Ln3/o$a;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lj3/z;->a:Lj3/g;

    invoke-virtual {v1}, Lj3/g;->e()Lj3/j;

    move-result-object v1

    iget-object v3, p0, Lj3/z;->f:Ln3/o$a;

    iget-object v3, v3, Ln3/o$a;->c:Lcom/bumptech/glide/load/data/d;

    invoke-interface {v3}, Lcom/bumptech/glide/load/data/d;->d()Lh3/a;

    move-result-object v3

    invoke-virtual {v1, v3}, Lj3/j;->c(Lh3/a;)Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, Lj3/z;->a:Lj3/g;

    iget-object v3, p0, Lj3/z;->f:Ln3/o$a;

    iget-object v3, v3, Ln3/o$a;->c:Lcom/bumptech/glide/load/data/d;

    invoke-interface {v3}, Lcom/bumptech/glide/load/data/d;->a()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v1, v3}, Lj3/g;->u(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_3
    iget-object v0, p0, Lj3/z;->f:Ln3/o$a;

    invoke-direct {p0, v0}, Lj3/z;->h(Ln3/o$a;)V

    move v0, v2

    goto :goto_0

    :cond_4
    return v0
.end method

.method public b(Lh3/f;Ljava/lang/Object;Lcom/bumptech/glide/load/data/d;Lh3/a;Lh3/f;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh3/f;",
            "Ljava/lang/Object;",
            "Lcom/bumptech/glide/load/data/d<",
            "*>;",
            "Lh3/a;",
            "Lh3/f;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lj3/z;->b:Lj3/f$a;

    iget-object p4, p0, Lj3/z;->f:Ln3/o$a;

    iget-object p4, p4, Ln3/o$a;->c:Lcom/bumptech/glide/load/data/d;

    invoke-interface {p4}, Lcom/bumptech/glide/load/data/d;->d()Lh3/a;

    move-result-object v4

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p1

    invoke-interface/range {v0 .. v5}, Lj3/f$a;->b(Lh3/f;Ljava/lang/Object;Lcom/bumptech/glide/load/data/d;Lh3/a;Lh3/f;)V

    return-void
.end method

.method public cancel()V
    .locals 1

    iget-object v0, p0, Lj3/z;->f:Ln3/o$a;

    if-eqz v0, :cond_0

    iget-object v0, v0, Ln3/o$a;->c:Lcom/bumptech/glide/load/data/d;

    invoke-interface {v0}, Lcom/bumptech/glide/load/data/d;->cancel()V

    :cond_0
    return-void
.end method

.method e(Ln3/o$a;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln3/o$a<",
            "*>;)Z"
        }
    .end annotation

    iget-object v0, p0, Lj3/z;->f:Ln3/o$a;

    if-eqz v0, :cond_0

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method f(Ln3/o$a;Ljava/lang/Object;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln3/o$a<",
            "*>;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lj3/z;->a:Lj3/g;

    invoke-virtual {v0}, Lj3/g;->e()Lj3/j;

    move-result-object v0

    if-eqz p2, :cond_0

    iget-object v1, p1, Ln3/o$a;->c:Lcom/bumptech/glide/load/data/d;

    invoke-interface {v1}, Lcom/bumptech/glide/load/data/d;->d()Lh3/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lj3/j;->c(Lh3/a;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p2, p0, Lj3/z;->e:Ljava/lang/Object;

    iget-object p1, p0, Lj3/z;->b:Lj3/f$a;

    invoke-interface {p1}, Lj3/f$a;->l()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lj3/z;->b:Lj3/f$a;

    iget-object v1, p1, Ln3/o$a;->a:Lh3/f;

    iget-object v3, p1, Ln3/o$a;->c:Lcom/bumptech/glide/load/data/d;

    invoke-interface {v3}, Lcom/bumptech/glide/load/data/d;->d()Lh3/a;

    move-result-object v4

    iget-object v5, p0, Lj3/z;->r:Lj3/d;

    move-object v2, p2

    invoke-interface/range {v0 .. v5}, Lj3/f$a;->b(Lh3/f;Ljava/lang/Object;Lcom/bumptech/glide/load/data/d;Lh3/a;Lh3/f;)V

    :goto_0
    return-void
.end method

.method g(Ln3/o$a;Ljava/lang/Exception;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln3/o$a<",
            "*>;",
            "Ljava/lang/Exception;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lj3/z;->b:Lj3/f$a;

    iget-object v1, p0, Lj3/z;->r:Lj3/d;

    iget-object p1, p1, Ln3/o$a;->c:Lcom/bumptech/glide/load/data/d;

    invoke-interface {p1}, Lcom/bumptech/glide/load/data/d;->d()Lh3/a;

    move-result-object v2

    invoke-interface {v0, v1, p2, p1, v2}, Lj3/f$a;->i(Lh3/f;Ljava/lang/Exception;Lcom/bumptech/glide/load/data/d;Lh3/a;)V

    return-void
.end method

.method public i(Lh3/f;Ljava/lang/Exception;Lcom/bumptech/glide/load/data/d;Lh3/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh3/f;",
            "Ljava/lang/Exception;",
            "Lcom/bumptech/glide/load/data/d<",
            "*>;",
            "Lh3/a;",
            ")V"
        }
    .end annotation

    iget-object p4, p0, Lj3/z;->b:Lj3/f$a;

    iget-object v0, p0, Lj3/z;->f:Ln3/o$a;

    iget-object v0, v0, Ln3/o$a;->c:Lcom/bumptech/glide/load/data/d;

    invoke-interface {v0}, Lcom/bumptech/glide/load/data/d;->d()Lh3/a;

    move-result-object v0

    invoke-interface {p4, p1, p2, p3, v0}, Lj3/f$a;->i(Lh3/f;Ljava/lang/Exception;Lcom/bumptech/glide/load/data/d;Lh3/a;)V

    return-void
.end method

.method public l()V
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
