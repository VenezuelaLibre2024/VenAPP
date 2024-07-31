.class abstract Lio/grpc/internal/m0;
.super Lvi/y0;
.source "SourceFile"


# instance fields
.field private final a:Lvi/y0;


# direct methods
.method constructor <init>(Lvi/y0;)V
    .locals 1

    invoke-direct {p0}, Lvi/y0;-><init>()V

    const-string v0, "delegate can not be null"

    invoke-static {p1, v0}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lio/grpc/internal/m0;->a:Lvi/y0;

    return-void
.end method


# virtual methods
.method public b()V
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/m0;->a:Lvi/y0;

    invoke-virtual {v0}, Lvi/y0;->b()V

    return-void
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/m0;->a:Lvi/y0;

    invoke-virtual {v0}, Lvi/y0;->c()V

    return-void
.end method

.method public d(Lvi/y0$e;)V
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/m0;->a:Lvi/y0;

    invoke-virtual {v0, p1}, Lvi/y0;->d(Lvi/y0$e;)V

    return-void
.end method

.method public e(Lvi/y0$f;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lio/grpc/internal/m0;->a:Lvi/y0;

    invoke-virtual {v0, p1}, Lvi/y0;->e(Lvi/y0$f;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Leb/i;->c(Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    const-string v1, "delegate"

    iget-object v2, p0, Lio/grpc/internal/m0;->a:Lvi/y0;

    invoke-virtual {v0, v1, v2}, Leb/i$b;->d(Ljava/lang/String;Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    invoke-virtual {v0}, Leb/i$b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
