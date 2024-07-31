.class Lj3/c;
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
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lh3/f;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lj3/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj3/g<",
            "*>;"
        }
    .end annotation
.end field

.field private final c:Lj3/f$a;

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

    invoke-virtual {p1}, Lj3/g;->c()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0, p1, p2}, Lj3/c;-><init>(Ljava/util/List;Lj3/g;Lj3/f$a;)V

    return-void
.end method

.method constructor <init>(Ljava/util/List;Lj3/g;Lj3/f$a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lh3/f;",
            ">;",
            "Lj3/g<",
            "*>;",
            "Lj3/f$a;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lj3/c;->d:I

    iput-object p1, p0, Lj3/c;->a:Ljava/util/List;

    iput-object p2, p0, Lj3/c;->b:Lj3/g;

    iput-object p3, p0, Lj3/c;->c:Lj3/f$a;

    return-void
.end method

.method private b()Z
    .locals 2

    iget v0, p0, Lj3/c;->r:I

    iget-object v1, p0, Lj3/c;->f:Ljava/util/List;

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
    .locals 7

    const-string v0, "DataCacheGenerator.startNext"

    invoke-static {v0}, Ld4/b;->a(Ljava/lang/String;)V

    :cond_0
    :goto_0
    :try_start_0
    iget-object v0, p0, Lj3/c;->f:Ljava/util/List;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_4

    invoke-direct {p0}, Lj3/c;->b()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_2

    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lj3/c;->s:Ln3/o$a;

    :cond_2
    :goto_1
    if-nez v1, :cond_3

    invoke-direct {p0}, Lj3/c;->b()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lj3/c;->f:Ljava/util/List;

    iget v3, p0, Lj3/c;->r:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Lj3/c;->r:I

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln3/o;

    iget-object v3, p0, Lj3/c;->t:Ljava/io/File;

    iget-object v4, p0, Lj3/c;->b:Lj3/g;

    invoke-virtual {v4}, Lj3/g;->t()I

    move-result v4

    iget-object v5, p0, Lj3/c;->b:Lj3/g;

    invoke-virtual {v5}, Lj3/g;->f()I

    move-result v5

    iget-object v6, p0, Lj3/c;->b:Lj3/g;

    invoke-virtual {v6}, Lj3/g;->k()Lh3/h;

    move-result-object v6

    invoke-interface {v0, v3, v4, v5, v6}, Ln3/o;->b(Ljava/lang/Object;IILh3/h;)Ln3/o$a;

    move-result-object v0

    iput-object v0, p0, Lj3/c;->s:Ln3/o$a;

    iget-object v0, p0, Lj3/c;->s:Ln3/o$a;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lj3/c;->b:Lj3/g;

    iget-object v3, p0, Lj3/c;->s:Ln3/o$a;

    iget-object v3, v3, Ln3/o$a;->c:Lcom/bumptech/glide/load/data/d;

    invoke-interface {v3}, Lcom/bumptech/glide/load/data/d;->a()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v0, v3}, Lj3/g;->u(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lj3/c;->s:Ln3/o$a;

    iget-object v0, v0, Ln3/o$a;->c:Lcom/bumptech/glide/load/data/d;

    iget-object v1, p0, Lj3/c;->b:Lj3/g;

    invoke-virtual {v1}, Lj3/g;->l()Lcom/bumptech/glide/g;

    move-result-object v1

    invoke-interface {v0, v1, p0}, Lcom/bumptech/glide/load/data/d;->e(Lcom/bumptech/glide/g;Lcom/bumptech/glide/load/data/d$a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move v1, v2

    goto :goto_1

    :cond_3
    invoke-static {}, Ld4/b;->e()V

    return v1

    :cond_4
    :goto_2
    :try_start_1
    iget v0, p0, Lj3/c;->d:I

    add-int/2addr v0, v2

    iput v0, p0, Lj3/c;->d:I

    iget-object v2, p0, Lj3/c;->a:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-lt v0, v2, :cond_5

    invoke-static {}, Ld4/b;->e()V

    return v1

    :cond_5
    :try_start_2
    iget-object v0, p0, Lj3/c;->a:Ljava/util/List;

    iget v2, p0, Lj3/c;->d:I

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh3/f;

    new-instance v2, Lj3/d;

    iget-object v3, p0, Lj3/c;->b:Lj3/g;

    invoke-virtual {v3}, Lj3/g;->p()Lh3/f;

    move-result-object v3

    invoke-direct {v2, v0, v3}, Lj3/d;-><init>(Lh3/f;Lh3/f;)V

    iget-object v3, p0, Lj3/c;->b:Lj3/g;

    invoke-virtual {v3}, Lj3/g;->d()Ll3/a;

    move-result-object v3

    invoke-interface {v3, v2}, Ll3/a;->b(Lh3/f;)Ljava/io/File;

    move-result-object v2

    iput-object v2, p0, Lj3/c;->t:Ljava/io/File;

    if-eqz v2, :cond_0

    iput-object v0, p0, Lj3/c;->e:Lh3/f;

    iget-object v0, p0, Lj3/c;->b:Lj3/g;

    invoke-virtual {v0, v2}, Lj3/g;->j(Ljava/io/File;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lj3/c;->f:Ljava/util/List;

    iput v1, p0, Lj3/c;->r:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    invoke-static {}, Ld4/b;->e()V

    throw v0
.end method

.method public c(Ljava/lang/Exception;)V
    .locals 4

    iget-object v0, p0, Lj3/c;->c:Lj3/f$a;

    iget-object v1, p0, Lj3/c;->e:Lh3/f;

    iget-object v2, p0, Lj3/c;->s:Ln3/o$a;

    iget-object v2, v2, Ln3/o$a;->c:Lcom/bumptech/glide/load/data/d;

    sget-object v3, Lh3/a;->DATA_DISK_CACHE:Lh3/a;

    invoke-interface {v0, v1, p1, v2, v3}, Lj3/f$a;->i(Lh3/f;Ljava/lang/Exception;Lcom/bumptech/glide/load/data/d;Lh3/a;)V

    return-void
.end method

.method public cancel()V
    .locals 1

    iget-object v0, p0, Lj3/c;->s:Ln3/o$a;

    if-eqz v0, :cond_0

    iget-object v0, v0, Ln3/o$a;->c:Lcom/bumptech/glide/load/data/d;

    invoke-interface {v0}, Lcom/bumptech/glide/load/data/d;->cancel()V

    :cond_0
    return-void
.end method

.method public f(Ljava/lang/Object;)V
    .locals 6

    iget-object v0, p0, Lj3/c;->c:Lj3/f$a;

    iget-object v1, p0, Lj3/c;->e:Lh3/f;

    iget-object v2, p0, Lj3/c;->s:Ln3/o$a;

    iget-object v3, v2, Ln3/o$a;->c:Lcom/bumptech/glide/load/data/d;

    sget-object v4, Lh3/a;->DATA_DISK_CACHE:Lh3/a;

    iget-object v5, p0, Lj3/c;->e:Lh3/f;

    move-object v2, p1

    invoke-interface/range {v0 .. v5}, Lj3/f$a;->b(Lh3/f;Ljava/lang/Object;Lcom/bumptech/glide/load/data/d;Lh3/a;Lh3/f;)V

    return-void
.end method
