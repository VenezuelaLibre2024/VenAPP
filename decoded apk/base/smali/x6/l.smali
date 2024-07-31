.class public final Lx6/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx6/x;


# instance fields
.field private final a:Ljava/lang/Object;

.field private b:Lt6/c2$f;

.field private c:Lx6/v;

.field private d:Ls8/j$a;

.field private e:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lx6/l;->a:Ljava/lang/Object;

    return-void
.end method

.method private b(Lt6/c2$f;)Lx6/v;
    .locals 4

    iget-object v0, p0, Lx6/l;->d:Ls8/j$a;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ls8/s$b;

    invoke-direct {v0}, Ls8/s$b;-><init>()V

    iget-object v1, p0, Lx6/l;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ls8/s$b;->e(Ljava/lang/String;)Ls8/s$b;

    move-result-object v0

    :goto_0
    new-instance v1, Lx6/j0;

    iget-object v2, p1, Lt6/c2$f;->c:Landroid/net/Uri;

    if-nez v2, :cond_1

    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_1
    iget-boolean v3, p1, Lt6/c2$f;->h:Z

    invoke-direct {v1, v2, v3, v0}, Lx6/j0;-><init>(Ljava/lang/String;ZLs8/j$a;)V

    iget-object v0, p1, Lt6/c2$f;->e:Lcom/google/common/collect/y;

    invoke-virtual {v0}, Lcom/google/common/collect/y;->g()Lcom/google/common/collect/a0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/collect/a0;->m()Lcom/google/common/collect/h1;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1, v3, v2}, Lx6/j0;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_2
    new-instance v0, Lx6/h$b;

    invoke-direct {v0}, Lx6/h$b;-><init>()V

    iget-object v2, p1, Lt6/c2$f;->a:Ljava/util/UUID;

    sget-object v3, Lx6/i0;->d:Lx6/b0$c;

    invoke-virtual {v0, v2, v3}, Lx6/h$b;->e(Ljava/util/UUID;Lx6/b0$c;)Lx6/h$b;

    move-result-object v0

    iget-boolean v2, p1, Lt6/c2$f;->f:Z

    invoke-virtual {v0, v2}, Lx6/h$b;->b(Z)Lx6/h$b;

    move-result-object v0

    iget-boolean v2, p1, Lt6/c2$f;->g:Z

    invoke-virtual {v0, v2}, Lx6/h$b;->c(Z)Lx6/h$b;

    move-result-object v0

    iget-object v2, p1, Lt6/c2$f;->j:Lcom/google/common/collect/w;

    invoke-static {v2}, Lhb/e;->l(Ljava/util/Collection;)[I

    move-result-object v2

    invoke-virtual {v0, v2}, Lx6/h$b;->d([I)Lx6/h$b;

    move-result-object v0

    invoke-virtual {v0, v1}, Lx6/h$b;->a(Lx6/l0;)Lx6/h;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1}, Lt6/c2$f;->c()[B

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lx6/h;->F(I[B)V

    return-object v0
.end method


# virtual methods
.method public a(Lt6/c2;)Lx6/v;
    .locals 2

    iget-object v0, p1, Lt6/c2;->b:Lt6/c2$h;

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p1, Lt6/c2;->b:Lt6/c2$h;

    iget-object p1, p1, Lt6/c2$h;->c:Lt6/c2$f;

    if-eqz p1, :cond_2

    sget v0, Lt8/r0;->a:I

    const/16 v1, 0x12

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lx6/l;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lx6/l;->b:Lt6/c2$f;

    invoke-static {p1, v1}, Lt8/r0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    iput-object p1, p0, Lx6/l;->b:Lt6/c2$f;

    invoke-direct {p0, p1}, Lx6/l;->b(Lt6/c2$f;)Lx6/v;

    move-result-object p1

    iput-object p1, p0, Lx6/l;->c:Lx6/v;

    :cond_1
    iget-object p1, p0, Lx6/l;->c:Lx6/v;

    invoke-static {p1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx6/v;

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_2
    :goto_0
    sget-object p1, Lx6/v;->a:Lx6/v;

    return-object p1
.end method
