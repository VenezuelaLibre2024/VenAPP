.class final Lio/grpc/internal/q1$d;
.super Lvi/p0$i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/grpc/internal/q1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "d"
.end annotation


# instance fields
.field private final a:Lvi/p0$h;

.field private final b:Ljava/util/concurrent/atomic/AtomicBoolean;

.field final synthetic c:Lio/grpc/internal/q1;


# direct methods
.method constructor <init>(Lio/grpc/internal/q1;Lvi/p0$h;)V
    .locals 1

    iput-object p1, p0, Lio/grpc/internal/q1$d;->c:Lio/grpc/internal/q1;

    invoke-direct {p0}, Lvi/p0$i;-><init>()V

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lio/grpc/internal/q1$d;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    const-string p1, "subchannel"

    invoke-static {p2, p1}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lvi/p0$h;

    iput-object p1, p0, Lio/grpc/internal/q1$d;->a:Lvi/p0$h;

    return-void
.end method

.method static synthetic b(Lio/grpc/internal/q1$d;)Lvi/p0$h;
    .locals 0

    iget-object p0, p0, Lio/grpc/internal/q1$d;->a:Lvi/p0$h;

    return-object p0
.end method


# virtual methods
.method public a(Lvi/p0$f;)Lvi/p0$e;
    .locals 2

    iget-object p1, p0, Lio/grpc/internal/q1$d;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lio/grpc/internal/q1$d;->c:Lio/grpc/internal/q1;

    invoke-static {p1}, Lio/grpc/internal/q1;->g(Lio/grpc/internal/q1;)Lvi/p0$d;

    move-result-object p1

    invoke-virtual {p1}, Lvi/p0$d;->d()Lvi/k1;

    move-result-object p1

    new-instance v0, Lio/grpc/internal/q1$d$a;

    invoke-direct {v0, p0}, Lio/grpc/internal/q1$d$a;-><init>(Lio/grpc/internal/q1$d;)V

    invoke-virtual {p1, v0}, Lvi/k1;->execute(Ljava/lang/Runnable;)V

    :cond_0
    invoke-static {}, Lvi/p0$e;->g()Lvi/p0$e;

    move-result-object p1

    return-object p1
.end method
