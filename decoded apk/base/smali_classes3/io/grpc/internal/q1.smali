.class final Lio/grpc/internal/q1;
.super Lvi/p0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/grpc/internal/q1$d;,
        Lio/grpc/internal/q1$c;
    }
.end annotation


# instance fields
.field private final c:Lvi/p0$d;

.field private d:Lvi/p0$h;


# direct methods
.method constructor <init>(Lvi/p0$d;)V
    .locals 1

    invoke-direct {p0}, Lvi/p0;-><init>()V

    const-string v0, "helper"

    invoke-static {p1, v0}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lvi/p0$d;

    iput-object p1, p0, Lio/grpc/internal/q1;->c:Lvi/p0$d;

    return-void
.end method

.method static synthetic f(Lio/grpc/internal/q1;Lvi/p0$h;Lvi/q;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/grpc/internal/q1;->h(Lvi/p0$h;Lvi/q;)V

    return-void
.end method

.method static synthetic g(Lio/grpc/internal/q1;)Lvi/p0$d;
    .locals 0

    iget-object p0, p0, Lio/grpc/internal/q1;->c:Lvi/p0$d;

    return-object p0
.end method

.method private h(Lvi/p0$h;Lvi/q;)V
    .locals 3

    invoke-virtual {p2}, Lvi/q;->c()Lvi/p;

    move-result-object v0

    sget-object v1, Lvi/p;->SHUTDOWN:Lvi/p;

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p2}, Lvi/q;->c()Lvi/p;

    move-result-object v1

    sget-object v2, Lvi/p;->TRANSIENT_FAILURE:Lvi/p;

    if-eq v1, v2, :cond_1

    invoke-virtual {p2}, Lvi/q;->c()Lvi/p;

    move-result-object v1

    sget-object v2, Lvi/p;->IDLE:Lvi/p;

    if-ne v1, v2, :cond_2

    :cond_1
    iget-object v1, p0, Lio/grpc/internal/q1;->c:Lvi/p0$d;

    invoke-virtual {v1}, Lvi/p0$d;->e()V

    :cond_2
    sget-object v1, Lio/grpc/internal/q1$b;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x1

    if-eq v1, v2, :cond_6

    const/4 v2, 0x2

    if-eq v1, v2, :cond_5

    const/4 v2, 0x3

    if-eq v1, v2, :cond_4

    const/4 p1, 0x4

    if-ne v1, p1, :cond_3

    new-instance p1, Lio/grpc/internal/q1$c;

    invoke-virtual {p2}, Lvi/q;->d()Lvi/g1;

    move-result-object p2

    invoke-static {p2}, Lvi/p0$e;->f(Lvi/g1;)Lvi/p0$e;

    move-result-object p2

    invoke-direct {p1, p2}, Lio/grpc/internal/q1$c;-><init>(Lvi/p0$e;)V

    goto :goto_1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unsupported state:"

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p2, Lio/grpc/internal/q1$c;

    invoke-static {p1}, Lvi/p0$e;->h(Lvi/p0$h;)Lvi/p0$e;

    move-result-object p1

    invoke-direct {p2, p1}, Lio/grpc/internal/q1$c;-><init>(Lvi/p0$e;)V

    goto :goto_0

    :cond_5
    new-instance p1, Lio/grpc/internal/q1$c;

    invoke-static {}, Lvi/p0$e;->g()Lvi/p0$e;

    move-result-object p2

    invoke-direct {p1, p2}, Lio/grpc/internal/q1$c;-><init>(Lvi/p0$e;)V

    goto :goto_1

    :cond_6
    new-instance p2, Lio/grpc/internal/q1$d;

    invoke-direct {p2, p0, p1}, Lio/grpc/internal/q1$d;-><init>(Lio/grpc/internal/q1;Lvi/p0$h;)V

    :goto_0
    move-object p1, p2

    :goto_1
    iget-object p2, p0, Lio/grpc/internal/q1;->c:Lvi/p0$d;

    invoke-virtual {p2, v0, p1}, Lvi/p0$d;->f(Lvi/p;Lvi/p0$i;)V

    return-void
.end method


# virtual methods
.method public a(Lvi/p0$g;)Z
    .locals 4

    invoke-virtual {p1}, Lvi/p0$g;->a()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v0, Lvi/g1;->u:Lvi/g1;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "NameResolver returned no usable address. addrs="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lvi/p0$g;->a()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", attrs="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lvi/p0$g;->b()Lvi/a;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lvi/g1;->r(Ljava/lang/String;)Lvi/g1;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/grpc/internal/q1;->c(Lvi/g1;)V

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object p1, p0, Lio/grpc/internal/q1;->d:Lvi/p0$h;

    if-nez p1, :cond_1

    iget-object p1, p0, Lio/grpc/internal/q1;->c:Lvi/p0$d;

    invoke-static {}, Lvi/p0$b;->c()Lvi/p0$b$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lvi/p0$b$a;->d(Ljava/util/List;)Lvi/p0$b$a;

    move-result-object v0

    invoke-virtual {v0}, Lvi/p0$b$a;->b()Lvi/p0$b;

    move-result-object v0

    invoke-virtual {p1, v0}, Lvi/p0$d;->a(Lvi/p0$b;)Lvi/p0$h;

    move-result-object p1

    new-instance v0, Lio/grpc/internal/q1$a;

    invoke-direct {v0, p0, p1}, Lio/grpc/internal/q1$a;-><init>(Lio/grpc/internal/q1;Lvi/p0$h;)V

    invoke-virtual {p1, v0}, Lvi/p0$h;->g(Lvi/p0$j;)V

    iput-object p1, p0, Lio/grpc/internal/q1;->d:Lvi/p0$h;

    iget-object v0, p0, Lio/grpc/internal/q1;->c:Lvi/p0$d;

    sget-object v1, Lvi/p;->CONNECTING:Lvi/p;

    new-instance v2, Lio/grpc/internal/q1$c;

    invoke-static {p1}, Lvi/p0$e;->h(Lvi/p0$h;)Lvi/p0$e;

    move-result-object v3

    invoke-direct {v2, v3}, Lio/grpc/internal/q1$c;-><init>(Lvi/p0$e;)V

    invoke-virtual {v0, v1, v2}, Lvi/p0$d;->f(Lvi/p;Lvi/p0$i;)V

    invoke-virtual {p1}, Lvi/p0$h;->e()V

    goto :goto_0

    :cond_1
    invoke-virtual {p1, v0}, Lvi/p0$h;->h(Ljava/util/List;)V

    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public c(Lvi/g1;)V
    .locals 3

    iget-object v0, p0, Lio/grpc/internal/q1;->d:Lvi/p0$h;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lvi/p0$h;->f()V

    const/4 v0, 0x0

    iput-object v0, p0, Lio/grpc/internal/q1;->d:Lvi/p0$h;

    :cond_0
    iget-object v0, p0, Lio/grpc/internal/q1;->c:Lvi/p0$d;

    sget-object v1, Lvi/p;->TRANSIENT_FAILURE:Lvi/p;

    new-instance v2, Lio/grpc/internal/q1$c;

    invoke-static {p1}, Lvi/p0$e;->f(Lvi/g1;)Lvi/p0$e;

    move-result-object p1

    invoke-direct {v2, p1}, Lio/grpc/internal/q1$c;-><init>(Lvi/p0$e;)V

    invoke-virtual {v0, v1, v2}, Lvi/p0$d;->f(Lvi/p;Lvi/p0$i;)V

    return-void
.end method

.method public e()V
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/q1;->d:Lvi/p0$h;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lvi/p0$h;->f()V

    :cond_0
    return-void
.end method
