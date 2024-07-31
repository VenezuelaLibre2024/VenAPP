.class Lio/grpc/internal/q0$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/grpc/internal/s;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/q0;->j(Lvi/p0$e;Z)Lio/grpc/internal/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lvi/k$a;

.field final synthetic b:Lio/grpc/internal/s;


# direct methods
.method constructor <init>(Lvi/k$a;Lio/grpc/internal/s;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/q0$f;->a:Lvi/k$a;

    iput-object p2, p0, Lio/grpc/internal/q0$f;->b:Lio/grpc/internal/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Lvi/x0;Lvi/w0;Lvi/c;[Lvi/k;)Lio/grpc/internal/q;
    .locals 4
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

    invoke-static {}, Lvi/k$b;->a()Lvi/k$b$a;

    move-result-object v0

    invoke-virtual {v0, p3}, Lvi/k$b$a;->b(Lvi/c;)Lvi/k$b$a;

    move-result-object v0

    invoke-virtual {v0}, Lvi/k$b$a;->a()Lvi/k$b;

    move-result-object v0

    iget-object v1, p0, Lio/grpc/internal/q0$f;->a:Lvi/k$a;

    invoke-virtual {v1, v0, p2}, Lvi/k$a;->a(Lvi/k$b;Lvi/w0;)Lvi/k;

    move-result-object v0

    array-length v1, p4

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    aget-object v1, p4, v1

    invoke-static {}, Lio/grpc/internal/q0;->a()Lvi/k;

    move-result-object v3

    if-ne v1, v3, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-string v3, "lb tracer already assigned"

    invoke-static {v1, v3}, Leb/o;->v(ZLjava/lang/Object;)V

    array-length v1, p4

    sub-int/2addr v1, v2

    aput-object v0, p4, v1

    iget-object v0, p0, Lio/grpc/internal/q0$f;->b:Lio/grpc/internal/s;

    invoke-interface {v0, p1, p2, p3, p4}, Lio/grpc/internal/s;->c(Lvi/x0;Lvi/w0;Lvi/c;[Lvi/k;)Lio/grpc/internal/q;

    move-result-object p1

    return-object p1
.end method

.method public e()Lvi/i0;
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/q0$f;->b:Lio/grpc/internal/s;

    invoke-interface {v0}, Lvi/n0;->e()Lvi/i0;

    move-result-object v0

    return-object v0
.end method
