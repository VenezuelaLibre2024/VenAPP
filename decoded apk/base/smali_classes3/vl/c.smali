.class public final Lvl/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvl/c$a;,
        Lvl/c$b;
    }
.end annotation


# instance fields
.field private final a:Lvl/e;

.field private final b:Lql/r;

.field private final c:Lvl/d;

.field private final d:Lwl/d;

.field private e:Z

.field private f:Z

.field private final g:Lvl/f;


# direct methods
.method public constructor <init>(Lvl/e;Lql/r;Lvl/d;Lwl/d;)V
    .locals 1

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "finder"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "codec"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvl/c;->a:Lvl/e;

    iput-object p2, p0, Lvl/c;->b:Lql/r;

    iput-object p3, p0, Lvl/c;->c:Lvl/d;

    iput-object p4, p0, Lvl/c;->d:Lwl/d;

    invoke-interface {p4}, Lwl/d;->b()Lvl/f;

    move-result-object p1

    iput-object p1, p0, Lvl/c;->g:Lvl/f;

    return-void
.end method

.method private final t(Ljava/io/IOException;)V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lvl/c;->f:Z

    iget-object v0, p0, Lvl/c;->c:Lvl/d;

    invoke-virtual {v0, p1}, Lvl/d;->h(Ljava/io/IOException;)V

    iget-object v0, p0, Lvl/c;->d:Lwl/d;

    invoke-interface {v0}, Lwl/d;->b()Lvl/f;

    move-result-object v0

    iget-object v1, p0, Lvl/c;->a:Lvl/e;

    invoke-virtual {v0, v1, p1}, Lvl/f;->G(Lvl/e;Ljava/io/IOException;)V

    return-void
.end method


# virtual methods
.method public final a(JZZLjava/io/IOException;)Ljava/io/IOException;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/io/IOException;",
            ">(JZZTE;)TE;"
        }
    .end annotation

    if-eqz p5, :cond_0

    invoke-direct {p0, p5}, Lvl/c;->t(Ljava/io/IOException;)V

    :cond_0
    if-eqz p4, :cond_2

    iget-object v0, p0, Lvl/c;->b:Lql/r;

    iget-object v1, p0, Lvl/c;->a:Lvl/e;

    if-eqz p5, :cond_1

    invoke-virtual {v0, v1, p5}, Lql/r;->r(Lql/e;Ljava/io/IOException;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v0, v1, p1, p2}, Lql/r;->p(Lql/e;J)V

    :cond_2
    :goto_0
    if-eqz p3, :cond_4

    if-eqz p5, :cond_3

    iget-object p1, p0, Lvl/c;->b:Lql/r;

    iget-object p2, p0, Lvl/c;->a:Lvl/e;

    invoke-virtual {p1, p2, p5}, Lql/r;->w(Lql/e;Ljava/io/IOException;)V

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lvl/c;->b:Lql/r;

    iget-object v1, p0, Lvl/c;->a:Lvl/e;

    invoke-virtual {v0, v1, p1, p2}, Lql/r;->u(Lql/e;J)V

    :cond_4
    :goto_1
    iget-object p1, p0, Lvl/c;->a:Lvl/e;

    invoke-virtual {p1, p0, p4, p3, p5}, Lvl/e;->u(Lvl/c;ZZLjava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    return-object p1
.end method

.method public final b()V
    .locals 1

    iget-object v0, p0, Lvl/c;->d:Lwl/d;

    invoke-interface {v0}, Lwl/d;->cancel()V

    return-void
.end method

.method public final c(Lql/a0;Z)Ldm/v;
    .locals 3

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-boolean p2, p0, Lvl/c;->e:Z

    invoke-virtual {p1}, Lql/a0;->a()Lql/b0;

    move-result-object p2

    invoke-static {p2}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-virtual {p2}, Lql/b0;->a()J

    move-result-wide v0

    iget-object p2, p0, Lvl/c;->b:Lql/r;

    iget-object v2, p0, Lvl/c;->a:Lvl/e;

    invoke-virtual {p2, v2}, Lql/r;->q(Lql/e;)V

    iget-object p2, p0, Lvl/c;->d:Lwl/d;

    invoke-interface {p2, p1, v0, v1}, Lwl/d;->d(Lql/a0;J)Ldm/v;

    move-result-object p1

    new-instance p2, Lvl/c$a;

    invoke-direct {p2, p0, p1, v0, v1}, Lvl/c$a;-><init>(Lvl/c;Ldm/v;J)V

    return-object p2
.end method

.method public final d()V
    .locals 3

    iget-object v0, p0, Lvl/c;->d:Lwl/d;

    invoke-interface {v0}, Lwl/d;->cancel()V

    iget-object v0, p0, Lvl/c;->a:Lvl/e;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, p0, v1, v1, v2}, Lvl/e;->u(Lvl/c;ZZLjava/io/IOException;)Ljava/io/IOException;

    return-void
.end method

.method public final e()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lvl/c;->d:Lwl/d;

    invoke-interface {v0}, Lwl/d;->a()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lvl/c;->b:Lql/r;

    iget-object v2, p0, Lvl/c;->a:Lvl/e;

    invoke-virtual {v1, v2, v0}, Lql/r;->r(Lql/e;Ljava/io/IOException;)V

    invoke-direct {p0, v0}, Lvl/c;->t(Ljava/io/IOException;)V

    throw v0
.end method

.method public final f()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lvl/c;->d:Lwl/d;

    invoke-interface {v0}, Lwl/d;->f()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lvl/c;->b:Lql/r;

    iget-object v2, p0, Lvl/c;->a:Lvl/e;

    invoke-virtual {v1, v2, v0}, Lql/r;->r(Lql/e;Ljava/io/IOException;)V

    invoke-direct {p0, v0}, Lvl/c;->t(Ljava/io/IOException;)V

    throw v0
.end method

.method public final g()Lvl/e;
    .locals 1

    iget-object v0, p0, Lvl/c;->a:Lvl/e;

    return-object v0
.end method

.method public final h()Lvl/f;
    .locals 1

    iget-object v0, p0, Lvl/c;->g:Lvl/f;

    return-object v0
.end method

.method public final i()Lql/r;
    .locals 1

    iget-object v0, p0, Lvl/c;->b:Lql/r;

    return-object v0
.end method

.method public final j()Lvl/d;
    .locals 1

    iget-object v0, p0, Lvl/c;->c:Lvl/d;

    return-object v0
.end method

.method public final k()Z
    .locals 1

    iget-boolean v0, p0, Lvl/c;->f:Z

    return v0
.end method

.method public final l()Z
    .locals 2

    iget-object v0, p0, Lvl/c;->c:Lvl/d;

    invoke-virtual {v0}, Lvl/d;->d()Lql/a;

    move-result-object v0

    invoke-virtual {v0}, Lql/a;->l()Lql/u;

    move-result-object v0

    invoke-virtual {v0}, Lql/u;->h()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lvl/c;->g:Lvl/f;

    invoke-virtual {v1}, Lvl/f;->z()Lql/e0;

    move-result-object v1

    invoke-virtual {v1}, Lql/e0;->a()Lql/a;

    move-result-object v1

    invoke-virtual {v1}, Lql/a;->l()Lql/u;

    move-result-object v1

    invoke-virtual {v1}, Lql/u;->h()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final m()Z
    .locals 1

    iget-boolean v0, p0, Lvl/c;->e:Z

    return v0
.end method

.method public final n()V
    .locals 1

    iget-object v0, p0, Lvl/c;->d:Lwl/d;

    invoke-interface {v0}, Lwl/d;->b()Lvl/f;

    move-result-object v0

    invoke-virtual {v0}, Lvl/f;->y()V

    return-void
.end method

.method public final o()V
    .locals 4

    iget-object v0, p0, Lvl/c;->a:Lvl/e;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {v0, p0, v3, v1, v2}, Lvl/e;->u(Lvl/c;ZZLjava/io/IOException;)Ljava/io/IOException;

    return-void
.end method

.method public final p(Lql/c0;)Lql/d0;
    .locals 4

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    const-string v0, "Content-Type"

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v0, v2, v1, v2}, Lql/c0;->n(Lql/c0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lvl/c;->d:Lwl/d;

    invoke-interface {v1, p1}, Lwl/d;->c(Lql/c0;)J

    move-result-wide v1

    iget-object v3, p0, Lvl/c;->d:Lwl/d;

    invoke-interface {v3, p1}, Lwl/d;->h(Lql/c0;)Ldm/x;

    move-result-object p1

    new-instance v3, Lvl/c$b;

    invoke-direct {v3, p0, p1, v1, v2}, Lvl/c$b;-><init>(Lvl/c;Ldm/x;J)V

    new-instance p1, Lwl/h;

    invoke-static {v3}, Ldm/l;->b(Ldm/x;)Ldm/d;

    move-result-object v3

    invoke-direct {p1, v0, v1, v2, v3}, Lwl/h;-><init>(Ljava/lang/String;JLdm/d;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    iget-object v0, p0, Lvl/c;->b:Lql/r;

    iget-object v1, p0, Lvl/c;->a:Lvl/e;

    invoke-virtual {v0, v1, p1}, Lql/r;->w(Lql/e;Ljava/io/IOException;)V

    invoke-direct {p0, p1}, Lvl/c;->t(Ljava/io/IOException;)V

    throw p1
.end method

.method public final q(Z)Lql/c0$a;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lvl/c;->d:Lwl/d;

    invoke-interface {v0, p1}, Lwl/d;->e(Z)Lql/c0$a;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1, p0}, Lql/c0$a;->m(Lvl/c;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-object p1

    :catch_0
    move-exception p1

    iget-object v0, p0, Lvl/c;->b:Lql/r;

    iget-object v1, p0, Lvl/c;->a:Lvl/e;

    invoke-virtual {v0, v1, p1}, Lql/r;->w(Lql/e;Ljava/io/IOException;)V

    invoke-direct {p0, p1}, Lvl/c;->t(Ljava/io/IOException;)V

    throw p1
.end method

.method public final r(Lql/c0;)V
    .locals 2

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lvl/c;->b:Lql/r;

    iget-object v1, p0, Lvl/c;->a:Lvl/e;

    invoke-virtual {v0, v1, p1}, Lql/r;->x(Lql/e;Lql/c0;)V

    return-void
.end method

.method public final s()V
    .locals 2

    iget-object v0, p0, Lvl/c;->b:Lql/r;

    iget-object v1, p0, Lvl/c;->a:Lvl/e;

    invoke-virtual {v0, v1}, Lql/r;->y(Lql/e;)V

    return-void
.end method

.method public final u(Lql/a0;)V
    .locals 2

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lvl/c;->b:Lql/r;

    iget-object v1, p0, Lvl/c;->a:Lvl/e;

    invoke-virtual {v0, v1}, Lql/r;->t(Lql/e;)V

    iget-object v0, p0, Lvl/c;->d:Lwl/d;

    invoke-interface {v0, p1}, Lwl/d;->g(Lql/a0;)V

    iget-object v0, p0, Lvl/c;->b:Lql/r;

    iget-object v1, p0, Lvl/c;->a:Lvl/e;

    invoke-virtual {v0, v1, p1}, Lql/r;->s(Lql/e;Lql/a0;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object v0, p0, Lvl/c;->b:Lql/r;

    iget-object v1, p0, Lvl/c;->a:Lvl/e;

    invoke-virtual {v0, v1, p1}, Lql/r;->r(Lql/e;Ljava/io/IOException;)V

    invoke-direct {p0, p1}, Lvl/c;->t(Ljava/io/IOException;)V

    throw p1
.end method
