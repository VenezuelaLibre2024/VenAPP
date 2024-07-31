.class final Lio/grpc/internal/f1$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/grpc/internal/p$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/grpc/internal/f1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "g"
.end annotation


# instance fields
.field final synthetic a:Lio/grpc/internal/f1;


# direct methods
.method private constructor <init>(Lio/grpc/internal/f1;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/f1$g;->a:Lio/grpc/internal/f1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lio/grpc/internal/f1;Lio/grpc/internal/f1$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/grpc/internal/f1$g;-><init>(Lio/grpc/internal/f1;)V

    return-void
.end method

.method static synthetic b(Lio/grpc/internal/f1$g;Lvi/p0$f;)Lio/grpc/internal/s;
    .locals 0

    invoke-direct {p0, p1}, Lio/grpc/internal/f1$g;->c(Lvi/p0$f;)Lio/grpc/internal/s;

    move-result-object p0

    return-object p0
.end method

.method private c(Lvi/p0$f;)Lio/grpc/internal/s;
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/f1$g;->a:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->m(Lio/grpc/internal/f1;)Lvi/p0$i;

    move-result-object v0

    iget-object v1, p0, Lio/grpc/internal/f1$g;->a:Lio/grpc/internal/f1;

    invoke-static {v1}, Lio/grpc/internal/f1;->n(Lio/grpc/internal/f1;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    :goto_0
    iget-object p1, p0, Lio/grpc/internal/f1$g;->a:Lio/grpc/internal/f1;

    invoke-static {p1}, Lio/grpc/internal/f1;->o(Lio/grpc/internal/f1;)Lio/grpc/internal/a0;

    move-result-object p1

    return-object p1

    :cond_1
    if-nez v0, :cond_2

    iget-object p1, p0, Lio/grpc/internal/f1$g;->a:Lio/grpc/internal/f1;

    iget-object p1, p1, Lio/grpc/internal/f1;->s:Lvi/k1;

    new-instance v0, Lio/grpc/internal/f1$g$a;

    invoke-direct {v0, p0}, Lio/grpc/internal/f1$g$a;-><init>(Lio/grpc/internal/f1$g;)V

    invoke-virtual {p1, v0}, Lvi/k1;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_2
    invoke-virtual {v0, p1}, Lvi/p0$i;->a(Lvi/p0$f;)Lvi/p0$e;

    move-result-object v0

    invoke-virtual {p1}, Lvi/p0$f;->a()Lvi/c;

    move-result-object p1

    invoke-virtual {p1}, Lvi/c;->j()Z

    move-result p1

    invoke-static {v0, p1}, Lio/grpc/internal/q0;->j(Lvi/p0$e;Z)Lio/grpc/internal/s;

    move-result-object p1

    if-eqz p1, :cond_0

    return-object p1
.end method


# virtual methods
.method public a(Lvi/x0;Lvi/c;Lvi/w0;Lvi/r;)Lio/grpc/internal/q;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvi/x0<",
            "**>;",
            "Lvi/c;",
            "Lvi/w0;",
            "Lvi/r;",
            ")",
            "Lio/grpc/internal/q;"
        }
    .end annotation

    iget-object v0, p0, Lio/grpc/internal/f1$g;->a:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->p(Lio/grpc/internal/f1;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lio/grpc/internal/s1;

    invoke-direct {v0, p1, p3, p2}, Lio/grpc/internal/s1;-><init>(Lvi/x0;Lvi/w0;Lvi/c;)V

    invoke-direct {p0, v0}, Lio/grpc/internal/f1$g;->c(Lvi/p0$f;)Lio/grpc/internal/s;

    move-result-object v0

    invoke-virtual {p4}, Lvi/r;->b()Lvi/r;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {p2, p3, v2, v2}, Lio/grpc/internal/q0;->f(Lvi/c;Lvi/w0;IZ)[Lvi/k;

    move-result-object v2

    :try_start_0
    invoke-interface {v0, p1, p3, p2, v2}, Lio/grpc/internal/s;->c(Lvi/x0;Lvi/w0;Lvi/c;[Lvi/k;)Lio/grpc/internal/q;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p4, v1}, Lvi/r;->f(Lvi/r;)V

    return-object p1

    :catchall_0
    move-exception p1

    invoke-virtual {p4, v1}, Lvi/r;->f(Lvi/r;)V

    throw p1

    :cond_0
    iget-object v0, p0, Lio/grpc/internal/f1$g;->a:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->q(Lio/grpc/internal/f1;)Lio/grpc/internal/i1;

    move-result-object v0

    invoke-virtual {v0}, Lio/grpc/internal/i1;->g()Lio/grpc/internal/y1$c0;

    move-result-object v8

    sget-object v0, Lio/grpc/internal/i1$b;->g:Lvi/c$c;

    invoke-virtual {p2, v0}, Lvi/c;->h(Lvi/c$c;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/grpc/internal/i1$b;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    move-object v6, v1

    goto :goto_0

    :cond_1
    iget-object v2, v0, Lio/grpc/internal/i1$b;->e:Lio/grpc/internal/z1;

    move-object v6, v2

    :goto_0
    if-nez v0, :cond_2

    move-object v7, v1

    goto :goto_1

    :cond_2
    iget-object v0, v0, Lio/grpc/internal/i1$b;->f:Lio/grpc/internal/s0;

    move-object v7, v0

    :goto_1
    new-instance v0, Lio/grpc/internal/f1$g$b;

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p3

    move-object v5, p2

    move-object v9, p4

    invoke-direct/range {v1 .. v9}, Lio/grpc/internal/f1$g$b;-><init>(Lio/grpc/internal/f1$g;Lvi/x0;Lvi/w0;Lvi/c;Lio/grpc/internal/z1;Lio/grpc/internal/s0;Lio/grpc/internal/y1$c0;Lvi/r;)V

    return-object v0
.end method
