.class Lio/grpc/internal/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/grpc/internal/s;


# instance fields
.field final a:Lvi/g1;

.field private final b:Lio/grpc/internal/r$a;


# direct methods
.method constructor <init>(Lvi/g1;Lio/grpc/internal/r$a;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lvi/g1;->p()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "error must not be OK"

    invoke-static {v0, v1}, Leb/o;->e(ZLjava/lang/Object;)V

    iput-object p1, p0, Lio/grpc/internal/g0;->a:Lvi/g1;

    iput-object p2, p0, Lio/grpc/internal/g0;->b:Lio/grpc/internal/r$a;

    return-void
.end method


# virtual methods
.method public c(Lvi/x0;Lvi/w0;Lvi/c;[Lvi/k;)Lio/grpc/internal/q;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvi/x0<",
            "**>;",
            "Lvi/w0;",
            "Lvi/c;",
            "[",
            "Lvi/k;",
            ")",
            "Lio/grpc/internal/q;"
        }
    .end annotation

    new-instance p1, Lio/grpc/internal/f0;

    iget-object p2, p0, Lio/grpc/internal/g0;->a:Lvi/g1;

    iget-object p3, p0, Lio/grpc/internal/g0;->b:Lio/grpc/internal/r$a;

    invoke-direct {p1, p2, p3, p4}, Lio/grpc/internal/f0;-><init>(Lvi/g1;Lio/grpc/internal/r$a;[Lvi/k;)V

    return-object p1
.end method

.method public e()Lvi/i0;
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Not a real transport"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
