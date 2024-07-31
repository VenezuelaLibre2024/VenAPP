.class public final Lio/grpc/internal/f0;
.super Lio/grpc/internal/n1;
.source "SourceFile"


# instance fields
.field private b:Z

.field private final c:Lvi/g1;

.field private final d:Lio/grpc/internal/r$a;

.field private final e:[Lvi/k;


# direct methods
.method public constructor <init>(Lvi/g1;Lio/grpc/internal/r$a;[Lvi/k;)V
    .locals 2

    invoke-direct {p0}, Lio/grpc/internal/n1;-><init>()V

    invoke-virtual {p1}, Lvi/g1;->p()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "error must not be OK"

    invoke-static {v0, v1}, Leb/o;->e(ZLjava/lang/Object;)V

    iput-object p1, p0, Lio/grpc/internal/f0;->c:Lvi/g1;

    iput-object p2, p0, Lio/grpc/internal/f0;->d:Lio/grpc/internal/r$a;

    iput-object p3, p0, Lio/grpc/internal/f0;->e:[Lvi/k;

    return-void
.end method

.method public constructor <init>(Lvi/g1;[Lvi/k;)V
    .locals 1

    sget-object v0, Lio/grpc/internal/r$a;->PROCESSED:Lio/grpc/internal/r$a;

    invoke-direct {p0, p1, v0, p2}, Lio/grpc/internal/f0;-><init>(Lvi/g1;Lio/grpc/internal/r$a;[Lvi/k;)V

    return-void
.end method


# virtual methods
.method public m(Lio/grpc/internal/w0;)V
    .locals 2

    const-string v0, "error"

    iget-object v1, p0, Lio/grpc/internal/f0;->c:Lvi/g1;

    invoke-virtual {p1, v0, v1}, Lio/grpc/internal/w0;->b(Ljava/lang/String;Ljava/lang/Object;)Lio/grpc/internal/w0;

    move-result-object p1

    const-string v0, "progress"

    iget-object v1, p0, Lio/grpc/internal/f0;->d:Lio/grpc/internal/r$a;

    invoke-virtual {p1, v0, v1}, Lio/grpc/internal/w0;->b(Ljava/lang/String;Ljava/lang/Object;)Lio/grpc/internal/w0;

    return-void
.end method

.method public o(Lio/grpc/internal/r;)V
    .locals 5

    iget-boolean v0, p0, Lio/grpc/internal/f0;->b:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    const-string v2, "already started"

    invoke-static {v0, v2}, Leb/o;->v(ZLjava/lang/Object;)V

    iput-boolean v1, p0, Lio/grpc/internal/f0;->b:Z

    iget-object v0, p0, Lio/grpc/internal/f0;->e:[Lvi/k;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    iget-object v4, p0, Lio/grpc/internal/f0;->c:Lvi/g1;

    invoke-virtual {v3, v4}, Lvi/j1;->i(Lvi/g1;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/grpc/internal/f0;->c:Lvi/g1;

    iget-object v1, p0, Lio/grpc/internal/f0;->d:Lio/grpc/internal/r$a;

    new-instance v2, Lvi/w0;

    invoke-direct {v2}, Lvi/w0;-><init>()V

    invoke-interface {p1, v0, v1, v2}, Lio/grpc/internal/r;->d(Lvi/g1;Lio/grpc/internal/r$a;Lvi/w0;)V

    return-void
.end method
