.class Lj3/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj3/f;
.implements Lcom/bumptech/glide/load/data/d$a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lj3/f;",
        "Lcom/bumptech/glide/load/data/d$a<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lj3/f$a;

.field private final b:Lj3/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj3/g<",
            "*>;"
        }
    .end annotation
.end field

.field private c:I

.field private d:I

.field private e:Lh3/f;

.field private f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ln3/o<",
            "Ljava/io/File;",
            "*>;>;"
        }
    .end annotation
.end field

.field private r:I

.field private volatile s:Ln3/o$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln3/o$a<",
            "*>;"
        }
    .end annotation
.end field

.field private t:Ljava/io/File;

.field private u:Lj3/x;


# direct methods
.method constructor <init>(Lj3/g;Lj3/f$a;)V
    .locals 1
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

    const/4 v0, -0x1

    iput v0, p0, Lj3/w;->d:I

    iput-object p1, p0, Lj3/w;->b:Lj3/g;

    iput-object p2, p0, Lj3/w;->a:Lj3/f$a;

    return-void
.end method

.method private b()Z
    .locals 2

    iget v0, p0, Lj3/w;->r:I

    iget-object v1, p0, Lj3/w;->f:Ljava/util/List;

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


# virtual methods
.method public a()Z
    .locals 14

    const-string v0, "ResourceCacheGenerator.startNext"

    invoke-static {v0}, Ld4/b;->a(Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lj3/w;->b:Lj3/g;

    invoke-virtual {v0}, Lj3/g;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-static {}, Ld4/b;->e()V

    return v2

    :cond_0
    :try_start_1
    iget-object v1, p0, Lj3/w;->b:Lj3/g;

    invoke-virtual {v1}, Lj3/g;->m()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_2

    const-class v0, Ljava/io/File;

    iget-object v1, p0, Lj3/w;->b:Lj3/g;

    invoke-virtual {v1}, Lj3/g;->r()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_1

    invoke-static {}, Ld4/b;->e()V

    return v2

    :cond_1
    :try_start_2
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed to find any load path from "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lj3/w;->b:Lj3/g;

    invoke-virtual {v2}, Lj3/g;->i()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lj3/w;->b:Lj3/g;

    invoke-virtual {v2}, Lj3/g;->r()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    iget-object v3, p0, Lj3/w;->f:Ljava/util/List;

    const/4 v4, 0x1

    if-eqz v3, :cond_6

    invoke-direct {p0}, Lj3/w;->b()Z

    move-result v3

    if-nez v3, :cond_3

    goto :goto_2

    :cond_3
    const/4 v0, 0x0

    iput-object v0, p0, Lj3/w;->s:Ln3/o$a;

    :cond_4
    :goto_1
    if-nez v2, :cond_5

    invoke-direct {p0}, Lj3/w;->b()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lj3/w;->f:Ljava/util/List;

    iget v1, p0, Lj3/w;->r:I

    add-int/lit8 v3, v1, 0x1

    iput v3, p0, Lj3/w;->r:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln3/o;

    iget-object v1, p0, Lj3/w;->t:Ljava/io/File;

    iget-object v3, p0, Lj3/w;->b:Lj3/g;

    invoke-virtual {v3}, Lj3/g;->t()I

    move-result v3

    iget-object v5, p0, Lj3/w;->b:Lj3/g;

    invoke-virtual {v5}, Lj3/g;->f()I

    move-result v5

    iget-object v6, p0, Lj3/w;->b:Lj3/g;

    invoke-virtual {v6}, Lj3/g;->k()Lh3/h;

    move-result-object v6

    invoke-interface {v0, v1, v3, v5, v6}, Ln3/o;->b(Ljava/lang/Object;IILh3/h;)Ln3/o$a;

    move-result-object v0

    iput-object v0, p0, Lj3/w;->s:Ln3/o$a;

    iget-object v0, p0, Lj3/w;->s:Ln3/o$a;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lj3/w;->b:Lj3/g;

    iget-object v1, p0, Lj3/w;->s:Ln3/o$a;

    iget-object v1, v1, Ln3/o$a;->c:Lcom/bumptech/glide/load/data/d;

    invoke-interface {v1}, Lcom/bumptech/glide/load/data/d;->a()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lj3/g;->u(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lj3/w;->s:Ln3/o$a;

    iget-object v0, v0, Ln3/o$a;->c:Lcom/bumptech/glide/load/data/d;

    iget-object v1, p0, Lj3/w;->b:Lj3/g;

    invoke-virtual {v1}, Lj3/g;->l()Lcom/bumptech/glide/g;

    move-result-object v1

    invoke-interface {v0, v1, p0}, Lcom/bumptech/glide/load/data/d;->e(Lcom/bumptech/glide/g;Lcom/bumptech/glide/load/data/d$a;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move v2, v4

    goto :goto_1

    :cond_5
    invoke-static {}, Ld4/b;->e()V

    return v2

    :cond_6
    :goto_2
    :try_start_3
    iget v3, p0, Lj3/w;->d:I

    add-int/2addr v3, v4

    iput v3, p0, Lj3/w;->d:I

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v5

    if-lt v3, v5, :cond_8

    iget v3, p0, Lj3/w;->c:I

    add-int/2addr v3, v4

    iput v3, p0, Lj3/w;->c:I

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-lt v3, v4, :cond_7

    invoke-static {}, Ld4/b;->e()V

    return v2

    :cond_7
    :try_start_4
    iput v2, p0, Lj3/w;->d:I

    :cond_8
    iget v3, p0, Lj3/w;->c:I

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lh3/f;

    iget v4, p0, Lj3/w;->d:I

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    move-object v11, v4

    check-cast v11, Ljava/lang/Class;

    iget-object v4, p0, Lj3/w;->b:Lj3/g;

    invoke-virtual {v4, v11}, Lj3/g;->s(Ljava/lang/Class;)Lh3/l;

    move-result-object v10

    new-instance v13, Lj3/x;

    iget-object v4, p0, Lj3/w;->b:Lj3/g;

    invoke-virtual {v4}, Lj3/g;->b()Lk3/b;

    move-result-object v5

    iget-object v4, p0, Lj3/w;->b:Lj3/g;

    invoke-virtual {v4}, Lj3/g;->p()Lh3/f;

    move-result-object v7

    iget-object v4, p0, Lj3/w;->b:Lj3/g;

    invoke-virtual {v4}, Lj3/g;->t()I

    move-result v8

    iget-object v4, p0, Lj3/w;->b:Lj3/g;

    invoke-virtual {v4}, Lj3/g;->f()I

    move-result v9

    iget-object v4, p0, Lj3/w;->b:Lj3/g;

    invoke-virtual {v4}, Lj3/g;->k()Lh3/h;

    move-result-object v12

    move-object v4, v13

    move-object v6, v3

    invoke-direct/range {v4 .. v12}, Lj3/x;-><init>(Lk3/b;Lh3/f;Lh3/f;IILh3/l;Ljava/lang/Class;Lh3/h;)V

    iput-object v13, p0, Lj3/w;->u:Lj3/x;

    iget-object v4, p0, Lj3/w;->b:Lj3/g;

    invoke-virtual {v4}, Lj3/g;->d()Ll3/a;

    move-result-object v4

    iget-object v5, p0, Lj3/w;->u:Lj3/x;

    invoke-interface {v4, v5}, Ll3/a;->b(Lh3/f;)Ljava/io/File;

    move-result-object v4

    iput-object v4, p0, Lj3/w;->t:Ljava/io/File;

    if-eqz v4, :cond_2

    iput-object v3, p0, Lj3/w;->e:Lh3/f;

    iget-object v3, p0, Lj3/w;->b:Lj3/g;

    invoke-virtual {v3, v4}, Lj3/g;->j(Ljava/io/File;)Ljava/util/List;

    move-result-object v3

    iput-object v3, p0, Lj3/w;->f:Ljava/util/List;

    iput v2, p0, Lj3/w;->r:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    invoke-static {}, Ld4/b;->e()V

    throw v0
.end method

.method public c(Ljava/lang/Exception;)V
    .locals 4

    iget-object v0, p0, Lj3/w;->a:Lj3/f$a;

    iget-object v1, p0, Lj3/w;->u:Lj3/x;

    iget-object v2, p0, Lj3/w;->s:Ln3/o$a;

    iget-object v2, v2, Ln3/o$a;->c:Lcom/bumptech/glide/load/data/d;

    sget-object v3, Lh3/a;->RESOURCE_DISK_CACHE:Lh3/a;

    invoke-interface {v0, v1, p1, v2, v3}, Lj3/f$a;->i(Lh3/f;Ljava/lang/Exception;Lcom/bumptech/glide/load/data/d;Lh3/a;)V

    return-void
.end method

.method public cancel()V
    .locals 1

    iget-object v0, p0, Lj3/w;->s:Ln3/o$a;

    if-eqz v0, :cond_0

    iget-object v0, v0, Ln3/o$a;->c:Lcom/bumptech/glide/load/data/d;

    invoke-interface {v0}, Lcom/bumptech/glide/load/data/d;->cancel()V

    :cond_0
    return-void
.end method

.method public f(Ljava/lang/Object;)V
    .locals 6

    iget-object v0, p0, Lj3/w;->a:Lj3/f$a;

    iget-object v1, p0, Lj3/w;->e:Lh3/f;

    iget-object v2, p0, Lj3/w;->s:Ln3/o$a;

    iget-object v3, v2, Ln3/o$a;->c:Lcom/bumptech/glide/load/data/d;

    sget-object v4, Lh3/a;->RESOURCE_DISK_CACHE:Lh3/a;

    iget-object v5, p0, Lj3/w;->u:Lj3/x;

    move-object v2, p1

    invoke-interface/range {v0 .. v5}, Lj3/f$a;->b(Lh3/f;Ljava/lang/Object;Lcom/bumptech/glide/load/data/d;Lh3/a;Lh3/f;)V

    return-void
.end method