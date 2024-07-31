.class final Lio/grpc/internal/f1$n;
.super Lvi/p0$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/grpc/internal/f1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "n"
.end annotation


# instance fields
.field a:Lio/grpc/internal/j$b;

.field final synthetic b:Lio/grpc/internal/f1;


# direct methods
.method private constructor <init>(Lio/grpc/internal/f1;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/f1$n;->b:Lio/grpc/internal/f1;

    invoke-direct {p0}, Lvi/p0$d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lio/grpc/internal/f1;Lio/grpc/internal/f1$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/grpc/internal/f1$n;-><init>(Lio/grpc/internal/f1;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lvi/p0$b;)Lvi/p0$h;
    .locals 0

    invoke-virtual {p0, p1}, Lio/grpc/internal/f1$n;->g(Lvi/p0$b;)Lio/grpc/internal/e;

    move-result-object p1

    return-object p1
.end method

.method public b()Lvi/f;
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/f1$n;->b:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->z(Lio/grpc/internal/f1;)Lvi/f;

    move-result-object v0

    return-object v0
.end method

.method public c()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/f1$n;->b:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->L(Lio/grpc/internal/f1;)Lio/grpc/internal/f1$r;

    move-result-object v0

    return-object v0
.end method

.method public d()Lvi/k1;
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/f1$n;->b:Lio/grpc/internal/f1;

    iget-object v0, v0, Lio/grpc/internal/f1;->s:Lvi/k1;

    return-object v0
.end method

.method public e()V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/f1$n;->b:Lio/grpc/internal/f1;

    iget-object v0, v0, Lio/grpc/internal/f1;->s:Lvi/k1;

    invoke-virtual {v0}, Lvi/k1;->e()V

    iget-object v0, p0, Lio/grpc/internal/f1$n;->b:Lio/grpc/internal/f1;

    iget-object v0, v0, Lio/grpc/internal/f1;->s:Lvi/k1;

    new-instance v1, Lio/grpc/internal/f1$n$a;

    invoke-direct {v1, p0}, Lio/grpc/internal/f1$n$a;-><init>(Lio/grpc/internal/f1$n;)V

    invoke-virtual {v0, v1}, Lvi/k1;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public f(Lvi/p;Lvi/p0$i;)V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/f1$n;->b:Lio/grpc/internal/f1;

    iget-object v0, v0, Lio/grpc/internal/f1;->s:Lvi/k1;

    invoke-virtual {v0}, Lvi/k1;->e()V

    const-string v0, "newState"

    invoke-static {p1, v0}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "newPicker"

    invoke-static {p2, v0}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lio/grpc/internal/f1$n;->b:Lio/grpc/internal/f1;

    iget-object v0, v0, Lio/grpc/internal/f1;->s:Lvi/k1;

    new-instance v1, Lio/grpc/internal/f1$n$b;

    invoke-direct {v1, p0, p2, p1}, Lio/grpc/internal/f1$n$b;-><init>(Lio/grpc/internal/f1$n;Lvi/p0$i;Lvi/p;)V

    invoke-virtual {v0, v1}, Lvi/k1;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public g(Lvi/p0$b;)Lio/grpc/internal/e;
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/f1$n;->b:Lio/grpc/internal/f1;

    iget-object v0, v0, Lio/grpc/internal/f1;->s:Lvi/k1;

    invoke-virtual {v0}, Lvi/k1;->e()V

    iget-object v0, p0, Lio/grpc/internal/f1$n;->b:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->Q(Lio/grpc/internal/f1;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "Channel is being terminated"

    invoke-static {v0, v1}, Leb/o;->v(ZLjava/lang/Object;)V

    new-instance v0, Lio/grpc/internal/f1$s;

    iget-object v1, p0, Lio/grpc/internal/f1$n;->b:Lio/grpc/internal/f1;

    invoke-direct {v0, v1, p1, p0}, Lio/grpc/internal/f1$s;-><init>(Lio/grpc/internal/f1;Lvi/p0$b;Lio/grpc/internal/f1$n;)V

    return-object v0
.end method
