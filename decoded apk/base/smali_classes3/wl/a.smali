.class public final Lwl/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lql/v;


# instance fields
.field private final a:Lql/n;


# direct methods
.method public constructor <init>(Lql/n;)V
    .locals 1

    const-string v0, "cookieJar"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwl/a;->a:Lql/n;

    return-void
.end method

.method private final b(Ljava/util/List;)Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lql/m;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    add-int/lit8 v3, v1, 0x1

    if-gez v1, :cond_0

    invoke-static {}, Ldk/p;->q()V

    :cond_0
    check-cast v2, Lql/m;

    if-lez v1, :cond_1

    const-string v1, "; "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    invoke-virtual {v2}, Lql/m;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x3d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lql/m;->n()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move v1, v3

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "StringBuilder().apply(builderAction).toString()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method


# virtual methods
.method public a(Lql/v$a;)Lql/c0;
    .locals 12

    const-string v0, "chain"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lql/v$a;->o()Lql/a0;

    move-result-object v0

    invoke-virtual {v0}, Lql/a0;->h()Lql/a0$a;

    move-result-object v1

    invoke-virtual {v0}, Lql/a0;->a()Lql/b0;

    move-result-object v2

    const-string v3, "Content-Type"

    const-wide/16 v4, -0x1

    const-string v6, "Content-Length"

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lql/b0;->b()Lql/w;

    move-result-object v7

    if-eqz v7, :cond_0

    invoke-virtual {v7}, Lql/w;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v3, v7}, Lql/a0$a;->d(Ljava/lang/String;Ljava/lang/String;)Lql/a0$a;

    :cond_0
    invoke-virtual {v2}, Lql/b0;->a()J

    move-result-wide v7

    cmp-long v2, v7, v4

    const-string v9, "Transfer-Encoding"

    if-eqz v2, :cond_1

    invoke-static {v7, v8}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v6, v2}, Lql/a0$a;->d(Ljava/lang/String;Ljava/lang/String;)Lql/a0$a;

    invoke-virtual {v1, v9}, Lql/a0$a;->j(Ljava/lang/String;)Lql/a0$a;

    goto :goto_0

    :cond_1
    const-string v2, "chunked"

    invoke-virtual {v1, v9, v2}, Lql/a0$a;->d(Ljava/lang/String;Ljava/lang/String;)Lql/a0$a;

    invoke-virtual {v1, v6}, Lql/a0$a;->j(Ljava/lang/String;)Lql/a0$a;

    :cond_2
    :goto_0
    const-string v2, "Host"

    invoke-virtual {v0, v2}, Lql/a0;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-nez v7, :cond_3

    invoke-virtual {v0}, Lql/a0;->i()Lql/u;

    move-result-object v7

    invoke-static {v7, v8, v9, v10}, Lrl/d;->R(Lql/u;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v2, v7}, Lql/a0$a;->d(Ljava/lang/String;Ljava/lang/String;)Lql/a0$a;

    :cond_3
    const-string v2, "Connection"

    invoke-virtual {v0, v2}, Lql/a0;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_4

    const-string v7, "Keep-Alive"

    invoke-virtual {v1, v2, v7}, Lql/a0$a;->d(Ljava/lang/String;Ljava/lang/String;)Lql/a0$a;

    :cond_4
    const-string v2, "Accept-Encoding"

    invoke-virtual {v0, v2}, Lql/a0;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v11, "gzip"

    if-nez v7, :cond_5

    const-string v7, "Range"

    invoke-virtual {v0, v7}, Lql/a0;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_5

    invoke-virtual {v1, v2, v11}, Lql/a0$a;->d(Ljava/lang/String;Ljava/lang/String;)Lql/a0$a;

    move v8, v9

    :cond_5
    iget-object v2, p0, Lwl/a;->a:Lql/n;

    invoke-virtual {v0}, Lql/a0;->i()Lql/u;

    move-result-object v7

    invoke-interface {v2, v7}, Lql/n;->a(Lql/u;)Ljava/util/List;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Ljava/util/Collection;

    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    move-result v7

    xor-int/2addr v7, v9

    if-eqz v7, :cond_6

    const-string v7, "Cookie"

    invoke-direct {p0, v2}, Lwl/a;->b(Ljava/util/List;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v7, v2}, Lql/a0$a;->d(Ljava/lang/String;Ljava/lang/String;)Lql/a0$a;

    :cond_6
    const-string v2, "User-Agent"

    invoke-virtual {v0, v2}, Lql/a0;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_7

    const-string v7, "okhttp/4.11.0"

    invoke-virtual {v1, v2, v7}, Lql/a0$a;->d(Ljava/lang/String;Ljava/lang/String;)Lql/a0$a;

    :cond_7
    invoke-virtual {v1}, Lql/a0$a;->b()Lql/a0;

    move-result-object v1

    invoke-interface {p1, v1}, Lql/v$a;->a(Lql/a0;)Lql/c0;

    move-result-object p1

    iget-object v1, p0, Lwl/a;->a:Lql/n;

    invoke-virtual {v0}, Lql/a0;->i()Lql/u;

    move-result-object v2

    invoke-virtual {p1}, Lql/c0;->o()Lql/t;

    move-result-object v7

    invoke-static {v1, v2, v7}, Lwl/e;->f(Lql/n;Lql/u;Lql/t;)V

    invoke-virtual {p1}, Lql/c0;->B()Lql/c0$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lql/c0$a;->s(Lql/a0;)Lql/c0$a;

    move-result-object v0

    if-eqz v8, :cond_8

    const-string v1, "Content-Encoding"

    const/4 v2, 0x2

    invoke-static {p1, v1, v10, v2, v10}, Lql/c0;->n(Lql/c0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v11, v7, v9}, Lxk/g;->r(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v7

    if-eqz v7, :cond_8

    invoke-static {p1}, Lwl/e;->b(Lql/c0;)Z

    move-result v7

    if-eqz v7, :cond_8

    invoke-virtual {p1}, Lql/c0;->a()Lql/d0;

    move-result-object v7

    if-eqz v7, :cond_8

    new-instance v8, Ldm/i;

    invoke-virtual {v7}, Lql/d0;->f()Ldm/d;

    move-result-object v7

    invoke-direct {v8, v7}, Ldm/i;-><init>(Ldm/x;)V

    invoke-virtual {p1}, Lql/c0;->o()Lql/t;

    move-result-object v7

    invoke-virtual {v7}, Lql/t;->k()Lql/t$a;

    move-result-object v7

    invoke-virtual {v7, v1}, Lql/t$a;->g(Ljava/lang/String;)Lql/t$a;

    move-result-object v1

    invoke-virtual {v1, v6}, Lql/t$a;->g(Ljava/lang/String;)Lql/t$a;

    move-result-object v1

    invoke-virtual {v1}, Lql/t$a;->e()Lql/t;

    move-result-object v1

    invoke-virtual {v0, v1}, Lql/c0$a;->l(Lql/t;)Lql/c0$a;

    invoke-static {p1, v3, v10, v2, v10}, Lql/c0;->n(Lql/c0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance v1, Lwl/h;

    invoke-static {v8}, Ldm/l;->b(Ldm/x;)Ldm/d;

    move-result-object v2

    invoke-direct {v1, p1, v4, v5, v2}, Lwl/h;-><init>(Ljava/lang/String;JLdm/d;)V

    invoke-virtual {v0, v1}, Lql/c0$a;->b(Lql/d0;)Lql/c0$a;

    :cond_8
    invoke-virtual {v0}, Lql/c0$a;->c()Lql/c0;

    move-result-object p1

    return-object p1
.end method
