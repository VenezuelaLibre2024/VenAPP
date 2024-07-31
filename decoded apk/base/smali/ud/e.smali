.class public Lud/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lud/e$a;,
        Lud/e$b;
    }
.end annotation


# instance fields
.field private final a:Lcom/bumptech/glide/k;

.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Lz3/a;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/bumptech/glide/k;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lud/e;->b:Ljava/util/Map;

    iput-object p1, p0, Lud/e;->a:Lcom/bumptech/glide/k;

    return-void
.end method

.method static synthetic a(Lud/e;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lud/e;->b:Ljava/util/Map;

    return-object p0
.end method


# virtual methods
.method public b(Ljava/lang/Class;)V
    .locals 3

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Lud/e;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lud/e;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lz3/a;

    if-eqz v1, :cond_0

    iget-object v2, p0, Lud/e;->a:Lcom/bumptech/glide/k;

    invoke-virtual {v2, v1}, Lcom/bumptech/glide/k;->m(Lz3/d;)V

    goto :goto_0

    :cond_1
    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public c(Ljava/lang/String;)Lud/e$b;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Starting Downloading Image : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lud/m;->a(Ljava/lang/String;)V

    new-instance v0, Ln3/h;

    new-instance v1, Ln3/k$a;

    invoke-direct {v1}, Ln3/k$a;-><init>()V

    const-string v2, "Accept"

    const-string v3, "image/*"

    invoke-virtual {v1, v2, v3}, Ln3/k$a;->a(Ljava/lang/String;Ljava/lang/String;)Ln3/k$a;

    move-result-object v1

    invoke-virtual {v1}, Ln3/k$a;->c()Ln3/k;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Ln3/h;-><init>(Ljava/lang/String;Ln3/i;)V

    iget-object p1, p0, Lud/e;->a:Lcom/bumptech/glide/k;

    invoke-virtual {p1, v0}, Lcom/bumptech/glide/k;->q(Ljava/lang/Object;)Lcom/bumptech/glide/j;

    move-result-object p1

    sget-object v0, Lh3/b;->PREFER_ARGB_8888:Lh3/b;

    invoke-virtual {p1, v0}, Ly3/a;->g(Lh3/b;)Ly3/a;

    move-result-object p1

    check-cast p1, Lcom/bumptech/glide/j;

    new-instance v0, Lud/e$b;

    invoke-direct {v0, p0, p1}, Lud/e$b;-><init>(Lud/e;Lcom/bumptech/glide/j;)V

    return-object v0
.end method
