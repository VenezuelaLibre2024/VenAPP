.class Lj3/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj3/f$a;
.implements Ljava/lang/Runnable;
.implements Ljava/lang/Comparable;
.implements Ld4/a$f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj3/h$h;,
        Lj3/h$g;,
        Lj3/h$e;,
        Lj3/h$b;,
        Lj3/h$d;,
        Lj3/h$f;,
        Lj3/h$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lj3/f$a;",
        "Ljava/lang/Runnable;",
        "Ljava/lang/Comparable<",
        "Lj3/h<",
        "*>;>;",
        "Ld4/a$f;"
    }
.end annotation


# instance fields
.field private A:Lj3/h$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj3/h$b<",
            "TR;>;"
        }
    .end annotation
.end field

.field private B:I

.field private C:Lj3/h$h;

.field private D:Lj3/h$g;

.field private E:J

.field private F:Z

.field private G:Ljava/lang/Object;

.field private H:Ljava/lang/Thread;

.field private I:Lh3/f;

.field private J:Lh3/f;

.field private K:Ljava/lang/Object;

.field private L:Lh3/a;

.field private M:Lcom/bumptech/glide/load/data/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/load/data/d<",
            "*>;"
        }
    .end annotation
.end field

.field private volatile N:Lj3/f;

.field private volatile O:Z

.field private volatile P:Z

.field private Q:Z

.field private final a:Lj3/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj3/g<",
            "TR;>;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ld4/c;

.field private final d:Lj3/h$e;

.field private final e:Landroidx/core/util/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/core/util/e<",
            "Lj3/h<",
            "*>;>;"
        }
    .end annotation
.end field

.field private final f:Lj3/h$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj3/h$d<",
            "*>;"
        }
    .end annotation
.end field

.field private final r:Lj3/h$f;

.field private s:Lcom/bumptech/glide/d;

.field private t:Lh3/f;

.field private u:Lcom/bumptech/glide/g;

.field private v:Lj3/n;

.field private w:I

.field private x:I

.field private y:Lj3/j;

.field private z:Lh3/h;


# direct methods
.method constructor <init>(Lj3/h$e;Landroidx/core/util/e;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj3/h$e;",
            "Landroidx/core/util/e<",
            "Lj3/h<",
            "*>;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lj3/g;

    invoke-direct {v0}, Lj3/g;-><init>()V

    iput-object v0, p0, Lj3/h;->a:Lj3/g;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lj3/h;->b:Ljava/util/List;

    invoke-static {}, Ld4/c;->a()Ld4/c;

    move-result-object v0

    iput-object v0, p0, Lj3/h;->c:Ld4/c;

    new-instance v0, Lj3/h$d;

    invoke-direct {v0}, Lj3/h$d;-><init>()V

    iput-object v0, p0, Lj3/h;->f:Lj3/h$d;

    new-instance v0, Lj3/h$f;

    invoke-direct {v0}, Lj3/h$f;-><init>()V

    iput-object v0, p0, Lj3/h;->r:Lj3/h$f;

    iput-object p1, p0, Lj3/h;->d:Lj3/h$e;

    iput-object p2, p0, Lj3/h;->e:Landroidx/core/util/e;

    return-void
.end method

.method private A()V
    .locals 3

    invoke-direct {p0}, Lj3/h;->K()V

    new-instance v0, Lj3/q;

    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Lj3/h;->b:Ljava/util/List;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const-string v2, "Failed to load resource"

    invoke-direct {v0, v2, v1}, Lj3/q;-><init>(Ljava/lang/String;Ljava/util/List;)V

    iget-object v1, p0, Lj3/h;->A:Lj3/h$b;

    invoke-interface {v1, v0}, Lj3/h$b;->c(Lj3/q;)V

    invoke-direct {p0}, Lj3/h;->C()V

    return-void
.end method

.method private B()V
    .locals 1

    iget-object v0, p0, Lj3/h;->r:Lj3/h$f;

    invoke-virtual {v0}, Lj3/h$f;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lj3/h;->F()V

    :cond_0
    return-void
.end method

.method private C()V
    .locals 1

    iget-object v0, p0, Lj3/h;->r:Lj3/h$f;

    invoke-virtual {v0}, Lj3/h$f;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lj3/h;->F()V

    :cond_0
    return-void
.end method

.method private F()V
    .locals 4

    iget-object v0, p0, Lj3/h;->r:Lj3/h$f;

    invoke-virtual {v0}, Lj3/h$f;->e()V

    iget-object v0, p0, Lj3/h;->f:Lj3/h$d;

    invoke-virtual {v0}, Lj3/h$d;->a()V

    iget-object v0, p0, Lj3/h;->a:Lj3/g;

    invoke-virtual {v0}, Lj3/g;->a()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lj3/h;->O:Z

    const/4 v1, 0x0

    iput-object v1, p0, Lj3/h;->s:Lcom/bumptech/glide/d;

    iput-object v1, p0, Lj3/h;->t:Lh3/f;

    iput-object v1, p0, Lj3/h;->z:Lh3/h;

    iput-object v1, p0, Lj3/h;->u:Lcom/bumptech/glide/g;

    iput-object v1, p0, Lj3/h;->v:Lj3/n;

    iput-object v1, p0, Lj3/h;->A:Lj3/h$b;

    iput-object v1, p0, Lj3/h;->C:Lj3/h$h;

    iput-object v1, p0, Lj3/h;->N:Lj3/f;

    iput-object v1, p0, Lj3/h;->H:Ljava/lang/Thread;

    iput-object v1, p0, Lj3/h;->I:Lh3/f;

    iput-object v1, p0, Lj3/h;->K:Ljava/lang/Object;

    iput-object v1, p0, Lj3/h;->L:Lh3/a;

    iput-object v1, p0, Lj3/h;->M:Lcom/bumptech/glide/load/data/d;

    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lj3/h;->E:J

    iput-boolean v0, p0, Lj3/h;->P:Z

    iput-object v1, p0, Lj3/h;->G:Ljava/lang/Object;

    iget-object v0, p0, Lj3/h;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lj3/h;->e:Landroidx/core/util/e;

    invoke-interface {v0, p0}, Landroidx/core/util/e;->a(Ljava/lang/Object;)Z

    return-void
.end method

.method private G(Lj3/h$g;)V
    .locals 0

    iput-object p1, p0, Lj3/h;->D:Lj3/h$g;

    iget-object p1, p0, Lj3/h;->A:Lj3/h$b;

    invoke-interface {p1, p0}, Lj3/h$b;->d(Lj3/h;)V

    return-void
.end method

.method private H()V
    .locals 3

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iput-object v0, p0, Lj3/h;->H:Ljava/lang/Thread;

    invoke-static {}, Lc4/g;->b()J

    move-result-wide v0

    iput-wide v0, p0, Lj3/h;->E:J

    const/4 v0, 0x0

    :cond_0
    iget-boolean v1, p0, Lj3/h;->P:Z

    if-nez v1, :cond_1

    iget-object v1, p0, Lj3/h;->N:Lj3/f;

    if-eqz v1, :cond_1

    iget-object v0, p0, Lj3/h;->N:Lj3/f;

    invoke-interface {v0}, Lj3/f;->a()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v1, p0, Lj3/h;->C:Lj3/h$h;

    invoke-direct {p0, v1}, Lj3/h;->s(Lj3/h$h;)Lj3/h$h;

    move-result-object v1

    iput-object v1, p0, Lj3/h;->C:Lj3/h$h;

    invoke-direct {p0}, Lj3/h;->r()Lj3/f;

    move-result-object v1

    iput-object v1, p0, Lj3/h;->N:Lj3/f;

    iget-object v1, p0, Lj3/h;->C:Lj3/h$h;

    sget-object v2, Lj3/h$h;->SOURCE:Lj3/h$h;

    if-ne v1, v2, :cond_0

    sget-object v0, Lj3/h$g;->SWITCH_TO_SOURCE_SERVICE:Lj3/h$g;

    invoke-direct {p0, v0}, Lj3/h;->G(Lj3/h$g;)V

    return-void

    :cond_1
    iget-object v1, p0, Lj3/h;->C:Lj3/h$h;

    sget-object v2, Lj3/h$h;->FINISHED:Lj3/h$h;

    if-eq v1, v2, :cond_2

    iget-boolean v1, p0, Lj3/h;->P:Z

    if-eqz v1, :cond_3

    :cond_2
    if-nez v0, :cond_3

    invoke-direct {p0}, Lj3/h;->A()V

    :cond_3
    return-void
.end method

.method private I(Ljava/lang/Object;Lh3/a;Lj3/t;)Lj3/v;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Data:",
            "Ljava/lang/Object;",
            "ResourceType:",
            "Ljava/lang/Object;",
            ">(TData;",
            "Lh3/a;",
            "Lj3/t<",
            "TData;TResourceType;TR;>;)",
            "Lj3/v<",
            "TR;>;"
        }
    .end annotation

    invoke-direct {p0, p2}, Lj3/h;->t(Lh3/a;)Lh3/h;

    move-result-object v2

    iget-object v0, p0, Lj3/h;->s:Lcom/bumptech/glide/d;

    invoke-virtual {v0}, Lcom/bumptech/glide/d;->h()Lcom/bumptech/glide/h;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/h;->l(Ljava/lang/Object;)Lcom/bumptech/glide/load/data/e;

    move-result-object p1

    :try_start_0
    iget v3, p0, Lj3/h;->w:I

    iget v4, p0, Lj3/h;->x:I

    new-instance v5, Lj3/h$c;

    invoke-direct {v5, p0, p2}, Lj3/h$c;-><init>(Lj3/h;Lh3/a;)V

    move-object v0, p3

    move-object v1, p1

    invoke-virtual/range {v0 .. v5}, Lj3/t;->a(Lcom/bumptech/glide/load/data/e;Lh3/h;IILj3/i$a;)Lj3/v;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p1}, Lcom/bumptech/glide/load/data/e;->b()V

    return-object p2

    :catchall_0
    move-exception p2

    invoke-interface {p1}, Lcom/bumptech/glide/load/data/e;->b()V

    throw p2
.end method

.method private J()V
    .locals 3

    sget-object v0, Lj3/h$a;->a:[I

    iget-object v1, p0, Lj3/h;->D:Lj3/h$g;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    invoke-direct {p0}, Lj3/h;->q()V

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unrecognized run reason: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lj3/h;->D:Lj3/h$g;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    sget-object v0, Lj3/h$h;->INITIALIZE:Lj3/h$h;

    invoke-direct {p0, v0}, Lj3/h;->s(Lj3/h$h;)Lj3/h$h;

    move-result-object v0

    iput-object v0, p0, Lj3/h;->C:Lj3/h$h;

    invoke-direct {p0}, Lj3/h;->r()Lj3/f;

    move-result-object v0

    iput-object v0, p0, Lj3/h;->N:Lj3/f;

    :cond_2
    invoke-direct {p0}, Lj3/h;->H()V

    :goto_0
    return-void
.end method

.method private K()V
    .locals 3

    iget-object v0, p0, Lj3/h;->c:Ld4/c;

    invoke-virtual {v0}, Ld4/c;->c()V

    iget-boolean v0, p0, Lj3/h;->O:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    iget-object v0, p0, Lj3/h;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lj3/h;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    sub-int/2addr v2, v1

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    :goto_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Already notified"

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_1
    iput-boolean v1, p0, Lj3/h;->O:Z

    return-void
.end method

.method private o(Lcom/bumptech/glide/load/data/d;Ljava/lang/Object;Lh3/a;)Lj3/v;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Data:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/bumptech/glide/load/data/d<",
            "*>;TData;",
            "Lh3/a;",
            ")",
            "Lj3/v<",
            "TR;>;"
        }
    .end annotation

    if-nez p2, :cond_0

    invoke-interface {p1}, Lcom/bumptech/glide/load/data/d;->b()V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    :try_start_0
    invoke-static {}, Lc4/g;->b()J

    move-result-wide v0

    invoke-direct {p0, p2, p3}, Lj3/h;->p(Ljava/lang/Object;Lh3/a;)Lj3/v;

    move-result-object p2

    const-string p3, "DecodeJob"

    const/4 v2, 0x2

    invoke-static {p3, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p3

    if-eqz p3, :cond_1

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Decoded result "

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p0, p3, v0, v1}, Lj3/h;->w(Ljava/lang/String;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    invoke-interface {p1}, Lcom/bumptech/glide/load/data/d;->b()V

    return-object p2

    :catchall_0
    move-exception p2

    invoke-interface {p1}, Lcom/bumptech/glide/load/data/d;->b()V

    throw p2
.end method

.method private p(Ljava/lang/Object;Lh3/a;)Lj3/v;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Data:",
            "Ljava/lang/Object;",
            ">(TData;",
            "Lh3/a;",
            ")",
            "Lj3/v<",
            "TR;>;"
        }
    .end annotation

    iget-object v0, p0, Lj3/h;->a:Lj3/g;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lj3/g;->h(Ljava/lang/Class;)Lj3/t;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lj3/h;->I(Ljava/lang/Object;Lh3/a;Lj3/t;)Lj3/v;

    move-result-object p1

    return-object p1
.end method

.method private q()V
    .locals 4

    const-string v0, "DecodeJob"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lj3/h;->E:J

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "data: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lj3/h;->K:Ljava/lang/Object;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ", cache key: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lj3/h;->I:Lh3/f;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ", fetcher: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lj3/h;->M:Lcom/bumptech/glide/load/data/d;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "Retrieved data"

    invoke-direct {p0, v3, v0, v1, v2}, Lj3/h;->x(Ljava/lang/String;JLjava/lang/String;)V

    :cond_0
    :try_start_0
    iget-object v0, p0, Lj3/h;->M:Lcom/bumptech/glide/load/data/d;

    iget-object v1, p0, Lj3/h;->K:Ljava/lang/Object;

    iget-object v2, p0, Lj3/h;->L:Lh3/a;

    invoke-direct {p0, v0, v1, v2}, Lj3/h;->o(Lcom/bumptech/glide/load/data/d;Ljava/lang/Object;Lh3/a;)Lj3/v;

    move-result-object v0
    :try_end_0
    .catch Lj3/q; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v1, p0, Lj3/h;->J:Lh3/f;

    iget-object v2, p0, Lj3/h;->L:Lh3/a;

    invoke-virtual {v0, v1, v2}, Lj3/q;->i(Lh3/f;Lh3/a;)V

    iget-object v1, p0, Lj3/h;->b:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    iget-object v1, p0, Lj3/h;->L:Lh3/a;

    iget-boolean v2, p0, Lj3/h;->Q:Z

    invoke-direct {p0, v0, v1, v2}, Lj3/h;->z(Lj3/v;Lh3/a;Z)V

    goto :goto_1

    :cond_1
    invoke-direct {p0}, Lj3/h;->H()V

    :goto_1
    return-void
.end method

.method private r()Lj3/f;
    .locals 3

    sget-object v0, Lj3/h$a;->b:[I

    iget-object v1, p0, Lj3/h;->C:Lj3/h$h;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unrecognized stage: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lj3/h;->C:Lj3/h$h;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Lj3/z;

    iget-object v1, p0, Lj3/h;->a:Lj3/g;

    invoke-direct {v0, v1, p0}, Lj3/z;-><init>(Lj3/g;Lj3/f$a;)V

    return-object v0

    :cond_2
    new-instance v0, Lj3/c;

    iget-object v1, p0, Lj3/h;->a:Lj3/g;

    invoke-direct {v0, v1, p0}, Lj3/c;-><init>(Lj3/g;Lj3/f$a;)V

    return-object v0

    :cond_3
    new-instance v0, Lj3/w;

    iget-object v1, p0, Lj3/h;->a:Lj3/g;

    invoke-direct {v0, v1, p0}, Lj3/w;-><init>(Lj3/g;Lj3/f$a;)V

    return-object v0
.end method

.method private s(Lj3/h$h;)Lj3/h$h;
    .locals 3

    sget-object v0, Lj3/h$a;->b:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_5

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_2

    const/4 v1, 0x5

    if-ne v0, v1, :cond_1

    iget-object p1, p0, Lj3/h;->y:Lj3/j;

    invoke-virtual {p1}, Lj3/j;->b()Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lj3/h$h;->RESOURCE_CACHE:Lj3/h$h;

    goto :goto_0

    :cond_0
    sget-object p1, Lj3/h$h;->RESOURCE_CACHE:Lj3/h$h;

    invoke-direct {p0, p1}, Lj3/h;->s(Lj3/h$h;)Lj3/h$h;

    move-result-object p1

    :goto_0
    return-object p1

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unrecognized stage: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    sget-object p1, Lj3/h$h;->FINISHED:Lj3/h$h;

    return-object p1

    :cond_3
    iget-boolean p1, p0, Lj3/h;->F:Z

    if-eqz p1, :cond_4

    sget-object p1, Lj3/h$h;->FINISHED:Lj3/h$h;

    goto :goto_1

    :cond_4
    sget-object p1, Lj3/h$h;->SOURCE:Lj3/h$h;

    :goto_1
    return-object p1

    :cond_5
    iget-object p1, p0, Lj3/h;->y:Lj3/j;

    invoke-virtual {p1}, Lj3/j;->a()Z

    move-result p1

    if-eqz p1, :cond_6

    sget-object p1, Lj3/h$h;->DATA_CACHE:Lj3/h$h;

    goto :goto_2

    :cond_6
    sget-object p1, Lj3/h$h;->DATA_CACHE:Lj3/h$h;

    invoke-direct {p0, p1}, Lj3/h;->s(Lj3/h$h;)Lj3/h$h;

    move-result-object p1

    :goto_2
    return-object p1
.end method

.method private t(Lh3/a;)Lh3/h;
    .locals 3

    iget-object v0, p0, Lj3/h;->z:Lh3/h;

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1a

    if-ge v1, v2, :cond_0

    return-object v0

    :cond_0
    sget-object v1, Lh3/a;->RESOURCE_DISK_CACHE:Lh3/a;

    if-eq p1, v1, :cond_2

    iget-object p1, p0, Lj3/h;->a:Lj3/g;

    invoke-virtual {p1}, Lj3/g;->x()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p1, 0x1

    :goto_1
    sget-object v1, Lq3/q;->j:Lh3/g;

    invoke-virtual {v0, v1}, Lh3/h;->c(Lh3/g;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_3

    if-eqz p1, :cond_4

    :cond_3
    return-object v0

    :cond_4
    new-instance v0, Lh3/h;

    invoke-direct {v0}, Lh3/h;-><init>()V

    iget-object v2, p0, Lj3/h;->z:Lh3/h;

    invoke-virtual {v0, v2}, Lh3/h;->d(Lh3/h;)V

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lh3/h;->f(Lh3/g;Ljava/lang/Object;)Lh3/h;

    return-object v0
.end method

.method private u()I
    .locals 1

    iget-object v0, p0, Lj3/h;->u:Lcom/bumptech/glide/g;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    return v0
.end method

.method private w(Ljava/lang/String;J)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lj3/h;->x(Ljava/lang/String;JLjava/lang/String;)V

    return-void
.end method

.method private x(Ljava/lang/String;JLjava/lang/String;)V
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " in "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2, p3}, Lc4/g;->a(J)D

    move-result-wide p1

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string p1, ", load key: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lj3/h;->v:Lj3/n;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    if-eqz p4, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, ", "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string p1, ""

    :goto_0
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", thread: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "DecodeJob"

    invoke-static {p2, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method private y(Lj3/v;Lh3/a;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj3/v<",
            "TR;>;",
            "Lh3/a;",
            "Z)V"
        }
    .end annotation

    invoke-direct {p0}, Lj3/h;->K()V

    iget-object v0, p0, Lj3/h;->A:Lj3/h$b;

    invoke-interface {v0, p1, p2, p3}, Lj3/h$b;->b(Lj3/v;Lh3/a;Z)V

    return-void
.end method

.method private z(Lj3/v;Lh3/a;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj3/v<",
            "TR;>;",
            "Lh3/a;",
            "Z)V"
        }
    .end annotation

    const-string v0, "DecodeJob.notifyEncodeAndRelease"

    invoke-static {v0}, Ld4/b;->a(Ljava/lang/String;)V

    :try_start_0
    instance-of v0, p1, Lj3/r;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lj3/r;

    invoke-interface {v0}, Lj3/r;->initialize()V

    :cond_0
    iget-object v0, p0, Lj3/h;->f:Lj3/h$d;

    invoke-virtual {v0}, Lj3/h$d;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1}, Lj3/u;->b(Lj3/v;)Lj3/u;

    move-result-object p1

    move-object v0, p1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-direct {p0, p1, p2, p3}, Lj3/h;->y(Lj3/v;Lh3/a;Z)V

    sget-object p1, Lj3/h$h;->ENCODE:Lj3/h$h;

    iput-object p1, p0, Lj3/h;->C:Lj3/h$h;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object p1, p0, Lj3/h;->f:Lj3/h$d;

    invoke-virtual {p1}, Lj3/h$d;->c()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lj3/h;->f:Lj3/h$d;

    iget-object p2, p0, Lj3/h;->d:Lj3/h$e;

    iget-object p3, p0, Lj3/h;->z:Lh3/h;

    invoke-virtual {p1, p2, p3}, Lj3/h$d;->b(Lj3/h$e;Lh3/h;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_2
    if-eqz v0, :cond_3

    :try_start_2
    invoke-virtual {v0}, Lj3/u;->d()V

    :cond_3
    invoke-direct {p0}, Lj3/h;->B()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    invoke-static {}, Ld4/b;->e()V

    return-void

    :catchall_0
    move-exception p1

    if-eqz v0, :cond_4

    :try_start_3
    invoke-virtual {v0}, Lj3/u;->d()V

    :cond_4
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p1

    invoke-static {}, Ld4/b;->e()V

    throw p1
.end method


# virtual methods
.method D(Lh3/a;Lj3/v;)Lj3/v;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Z:",
            "Ljava/lang/Object;",
            ">(",
            "Lh3/a;",
            "Lj3/v<",
            "TZ;>;)",
            "Lj3/v<",
            "TZ;>;"
        }
    .end annotation

    invoke-interface {p2}, Lj3/v;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    sget-object v0, Lh3/a;->RESOURCE_DISK_CACHE:Lh3/a;

    const/4 v1, 0x0

    if-eq p1, v0, :cond_0

    iget-object v0, p0, Lj3/h;->a:Lj3/g;

    invoke-virtual {v0, v8}, Lj3/g;->s(Ljava/lang/Class;)Lh3/l;

    move-result-object v0

    iget-object v2, p0, Lj3/h;->s:Lcom/bumptech/glide/d;

    iget v3, p0, Lj3/h;->w:I

    iget v4, p0, Lj3/h;->x:I

    invoke-interface {v0, v2, p2, v3, v4}, Lh3/l;->a(Landroid/content/Context;Lj3/v;II)Lj3/v;

    move-result-object v2

    move-object v7, v0

    move-object v0, v2

    goto :goto_0

    :cond_0
    move-object v0, p2

    move-object v7, v1

    :goto_0
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-interface {p2}, Lj3/v;->q()V

    :cond_1
    iget-object p2, p0, Lj3/h;->a:Lj3/g;

    invoke-virtual {p2, v0}, Lj3/g;->w(Lj3/v;)Z

    move-result p2

    if-eqz p2, :cond_2

    iget-object p2, p0, Lj3/h;->a:Lj3/g;

    invoke-virtual {p2, v0}, Lj3/g;->n(Lj3/v;)Lh3/k;

    move-result-object v1

    iget-object p2, p0, Lj3/h;->z:Lh3/h;

    invoke-interface {v1, p2}, Lh3/k;->a(Lh3/h;)Lh3/c;

    move-result-object p2

    goto :goto_1

    :cond_2
    sget-object p2, Lh3/c;->NONE:Lh3/c;

    :goto_1
    move-object v10, v1

    iget-object v1, p0, Lj3/h;->a:Lj3/g;

    iget-object v2, p0, Lj3/h;->I:Lh3/f;

    invoke-virtual {v1, v2}, Lj3/g;->y(Lh3/f;)Z

    move-result v1

    const/4 v2, 0x1

    xor-int/2addr v1, v2

    iget-object v3, p0, Lj3/h;->y:Lj3/j;

    invoke-virtual {v3, v1, p1, p2}, Lj3/j;->d(ZLh3/a;Lh3/c;)Z

    move-result p1

    if-eqz p1, :cond_6

    if-eqz v10, :cond_5

    sget-object p1, Lj3/h$a;->c:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget p1, p1, v1

    if-eq p1, v2, :cond_4

    const/4 v1, 0x2

    if-ne p1, v1, :cond_3

    new-instance p1, Lj3/x;

    iget-object p2, p0, Lj3/h;->a:Lj3/g;

    invoke-virtual {p2}, Lj3/g;->b()Lk3/b;

    move-result-object v2

    iget-object v3, p0, Lj3/h;->I:Lh3/f;

    iget-object v4, p0, Lj3/h;->t:Lh3/f;

    iget v5, p0, Lj3/h;->w:I

    iget v6, p0, Lj3/h;->x:I

    iget-object v9, p0, Lj3/h;->z:Lh3/h;

    move-object v1, p1

    invoke-direct/range {v1 .. v9}, Lj3/x;-><init>(Lk3/b;Lh3/f;Lh3/f;IILh3/l;Ljava/lang/Class;Lh3/h;)V

    goto :goto_2

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown strategy: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Lj3/d;

    iget-object p2, p0, Lj3/h;->I:Lh3/f;

    iget-object v1, p0, Lj3/h;->t:Lh3/f;

    invoke-direct {p1, p2, v1}, Lj3/d;-><init>(Lh3/f;Lh3/f;)V

    :goto_2
    invoke-static {v0}, Lj3/u;->b(Lj3/v;)Lj3/u;

    move-result-object v0

    iget-object p2, p0, Lj3/h;->f:Lj3/h$d;

    invoke-virtual {p2, p1, v10, v0}, Lj3/h$d;->d(Lh3/f;Lh3/k;Lj3/u;)V

    goto :goto_3

    :cond_5
    new-instance p1, Lcom/bumptech/glide/h$d;

    invoke-interface {v0}, Lj3/v;->get()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/bumptech/glide/h$d;-><init>(Ljava/lang/Class;)V

    throw p1

    :cond_6
    :goto_3
    return-object v0
.end method

.method E(Z)V
    .locals 1

    iget-object v0, p0, Lj3/h;->r:Lj3/h$f;

    invoke-virtual {v0, p1}, Lj3/h$f;->d(Z)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lj3/h;->F()V

    :cond_0
    return-void
.end method

.method L()Z
    .locals 2

    sget-object v0, Lj3/h$h;->INITIALIZE:Lj3/h$h;

    invoke-direct {p0, v0}, Lj3/h;->s(Lj3/h$h;)Lj3/h$h;

    move-result-object v0

    sget-object v1, Lj3/h$h;->RESOURCE_CACHE:Lj3/h$h;

    if-eq v0, v1, :cond_1

    sget-object v1, Lj3/h$h;->DATA_CACHE:Lj3/h$h;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public b(Lh3/f;Ljava/lang/Object;Lcom/bumptech/glide/load/data/d;Lh3/a;Lh3/f;)V
    .locals 0
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

    iput-object p1, p0, Lj3/h;->I:Lh3/f;

    iput-object p2, p0, Lj3/h;->K:Ljava/lang/Object;

    iput-object p3, p0, Lj3/h;->M:Lcom/bumptech/glide/load/data/d;

    iput-object p4, p0, Lj3/h;->L:Lh3/a;

    iput-object p5, p0, Lj3/h;->J:Lh3/f;

    iget-object p2, p0, Lj3/h;->a:Lj3/g;

    invoke-virtual {p2}, Lj3/g;->c()Ljava/util/List;

    move-result-object p2

    const/4 p3, 0x0

    invoke-interface {p2, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    if-eq p1, p2, :cond_0

    const/4 p3, 0x1

    :cond_0
    iput-boolean p3, p0, Lj3/h;->Q:Z

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    iget-object p2, p0, Lj3/h;->H:Ljava/lang/Thread;

    if-eq p1, p2, :cond_1

    sget-object p1, Lj3/h$g;->DECODE_DATA:Lj3/h$g;

    invoke-direct {p0, p1}, Lj3/h;->G(Lj3/h$g;)V

    goto :goto_0

    :cond_1
    const-string p1, "DecodeJob.decodeFromRetrievedData"

    invoke-static {p1}, Ld4/b;->a(Ljava/lang/String;)V

    :try_start_0
    invoke-direct {p0}, Lj3/h;->q()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Ld4/b;->e()V

    :goto_0
    return-void

    :catchall_0
    move-exception p1

    invoke-static {}, Ld4/b;->e()V

    throw p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lj3/h;

    invoke-virtual {p0, p1}, Lj3/h;->n(Lj3/h;)I

    move-result p1

    return p1
.end method

.method public h()Ld4/c;
    .locals 1

    iget-object v0, p0, Lj3/h;->c:Ld4/c;

    return-object v0
.end method

.method public i(Lh3/f;Ljava/lang/Exception;Lcom/bumptech/glide/load/data/d;Lh3/a;)V
    .locals 2
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

    invoke-interface {p3}, Lcom/bumptech/glide/load/data/d;->b()V

    new-instance v0, Lj3/q;

    const-string v1, "Fetching data failed"

    invoke-direct {v0, v1, p2}, Lj3/q;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-interface {p3}, Lcom/bumptech/glide/load/data/d;->a()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {v0, p1, p4, p2}, Lj3/q;->j(Lh3/f;Lh3/a;Ljava/lang/Class;)V

    iget-object p1, p0, Lj3/h;->b:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    iget-object p2, p0, Lj3/h;->H:Ljava/lang/Thread;

    if-eq p1, p2, :cond_0

    sget-object p1, Lj3/h$g;->SWITCH_TO_SOURCE_SERVICE:Lj3/h$g;

    invoke-direct {p0, p1}, Lj3/h;->G(Lj3/h$g;)V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lj3/h;->H()V

    :goto_0
    return-void
.end method

.method public l()V
    .locals 1

    sget-object v0, Lj3/h$g;->SWITCH_TO_SOURCE_SERVICE:Lj3/h$g;

    invoke-direct {p0, v0}, Lj3/h;->G(Lj3/h$g;)V

    return-void
.end method

.method public m()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lj3/h;->P:Z

    iget-object v0, p0, Lj3/h;->N:Lj3/f;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lj3/f;->cancel()V

    :cond_0
    return-void
.end method

.method public n(Lj3/h;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj3/h<",
            "*>;)I"
        }
    .end annotation

    invoke-direct {p0}, Lj3/h;->u()I

    move-result v0

    invoke-direct {p1}, Lj3/h;->u()I

    move-result v1

    sub-int/2addr v0, v1

    if-nez v0, :cond_0

    iget v0, p0, Lj3/h;->B:I

    iget p1, p1, Lj3/h;->B:I

    sub-int/2addr v0, p1

    :cond_0
    return v0
.end method

.method public run()V
    .locals 5

    const-string v0, "DecodeJob"

    iget-object v1, p0, Lj3/h;->D:Lj3/h$g;

    iget-object v2, p0, Lj3/h;->G:Ljava/lang/Object;

    const-string v3, "DecodeJob#run(reason=%s, model=%s)"

    invoke-static {v3, v1, v2}, Ld4/b;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v1, p0, Lj3/h;->M:Lcom/bumptech/glide/load/data/d;

    :try_start_0
    iget-boolean v2, p0, Lj3/h;->P:Z

    if-eqz v2, :cond_1

    invoke-direct {p0}, Lj3/h;->A()V
    :try_end_0
    .catch Lj3/b; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lcom/bumptech/glide/load/data/d;->b()V

    :cond_0
    invoke-static {}, Ld4/b;->e()V

    return-void

    :cond_1
    :try_start_1
    invoke-direct {p0}, Lj3/h;->J()V
    :try_end_1
    .catch Lj3/b; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v1, :cond_2

    invoke-interface {v1}, Lcom/bumptech/glide/load/data/d;->b()V

    :cond_2
    invoke-static {}, Ld4/b;->e()V

    return-void

    :catchall_0
    move-exception v2

    const/4 v3, 0x3

    :try_start_2
    invoke-static {v0, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v3

    if-eqz v3, :cond_3

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "DecodeJob threw unexpectedly, isCancelled: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v4, p0, Lj3/h;->P:Z

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v4, ", stage: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lj3/h;->C:Lj3/h$h;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_3
    iget-object v0, p0, Lj3/h;->C:Lj3/h$h;

    sget-object v3, Lj3/h$h;->ENCODE:Lj3/h$h;

    if-eq v0, v3, :cond_4

    iget-object v0, p0, Lj3/h;->b:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-direct {p0}, Lj3/h;->A()V

    :cond_4
    iget-boolean v0, p0, Lj3/h;->P:Z

    if-nez v0, :cond_5

    throw v2

    :cond_5
    throw v2

    :catch_0
    move-exception v0

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception v0

    if-eqz v1, :cond_6

    invoke-interface {v1}, Lcom/bumptech/glide/load/data/d;->b()V

    :cond_6
    invoke-static {}, Ld4/b;->e()V

    throw v0
.end method

.method v(Lcom/bumptech/glide/d;Ljava/lang/Object;Lj3/n;Lh3/f;IILjava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/g;Lj3/j;Ljava/util/Map;ZZZLh3/h;Lj3/h$b;I)Lj3/h;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/d;",
            "Ljava/lang/Object;",
            "Lj3/n;",
            "Lh3/f;",
            "II",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "TR;>;",
            "Lcom/bumptech/glide/g;",
            "Lj3/j;",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Lh3/l<",
            "*>;>;ZZZ",
            "Lh3/h;",
            "Lj3/h$b<",
            "TR;>;I)",
            "Lj3/h<",
            "TR;>;"
        }
    .end annotation

    move-object/from16 v0, p0

    iget-object v1, v0, Lj3/h;->a:Lj3/g;

    iget-object v15, v0, Lj3/h;->d:Lj3/h$e;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p4

    move/from16 v5, p5

    move/from16 v6, p6

    move-object/from16 v7, p10

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p15

    move-object/from16 v12, p11

    move/from16 v13, p12

    move/from16 v14, p13

    invoke-virtual/range {v1 .. v15}, Lj3/g;->v(Lcom/bumptech/glide/d;Ljava/lang/Object;Lh3/f;IILj3/j;Ljava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/g;Lh3/h;Ljava/util/Map;ZZLj3/h$e;)V

    move-object/from16 v1, p1

    iput-object v1, v0, Lj3/h;->s:Lcom/bumptech/glide/d;

    move-object/from16 v1, p4

    iput-object v1, v0, Lj3/h;->t:Lh3/f;

    move-object/from16 v1, p9

    iput-object v1, v0, Lj3/h;->u:Lcom/bumptech/glide/g;

    move-object/from16 v1, p3

    iput-object v1, v0, Lj3/h;->v:Lj3/n;

    move/from16 v1, p5

    iput v1, v0, Lj3/h;->w:I

    move/from16 v1, p6

    iput v1, v0, Lj3/h;->x:I

    move-object/from16 v1, p10

    iput-object v1, v0, Lj3/h;->y:Lj3/j;

    move/from16 v1, p14

    iput-boolean v1, v0, Lj3/h;->F:Z

    move-object/from16 v1, p15

    iput-object v1, v0, Lj3/h;->z:Lh3/h;

    move-object/from16 v1, p16

    iput-object v1, v0, Lj3/h;->A:Lj3/h$b;

    move/from16 v1, p17

    iput v1, v0, Lj3/h;->B:I

    sget-object v1, Lj3/h$g;->INITIALIZE:Lj3/h$g;

    iput-object v1, v0, Lj3/h;->D:Lj3/h$g;

    move-object/from16 v1, p2

    iput-object v1, v0, Lj3/h;->G:Ljava/lang/Object;

    return-object v0
.end method
