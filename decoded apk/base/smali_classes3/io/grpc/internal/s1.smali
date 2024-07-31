.class public final Lio/grpc/internal/s1;
.super Lvi/p0$f;
.source "SourceFile"


# instance fields
.field private final a:Lvi/c;

.field private final b:Lvi/w0;

.field private final c:Lvi/x0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lvi/x0<",
            "**>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lvi/x0;Lvi/w0;Lvi/c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvi/x0<",
            "**>;",
            "Lvi/w0;",
            "Lvi/c;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lvi/p0$f;-><init>()V

    const-string v0, "method"

    invoke-static {p1, v0}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lvi/x0;

    iput-object p1, p0, Lio/grpc/internal/s1;->c:Lvi/x0;

    const-string p1, "headers"

    invoke-static {p2, p1}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lvi/w0;

    iput-object p1, p0, Lio/grpc/internal/s1;->b:Lvi/w0;

    const-string p1, "callOptions"

    invoke-static {p3, p1}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lvi/c;

    iput-object p1, p0, Lio/grpc/internal/s1;->a:Lvi/c;

    return-void
.end method


# virtual methods
.method public a()Lvi/c;
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/s1;->a:Lvi/c;

    return-object v0
.end method

.method public b()Lvi/w0;
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/s1;->b:Lvi/w0;

    return-object v0
.end method

.method public c()Lvi/x0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lvi/x0<",
            "**>;"
        }
    .end annotation

    iget-object v0, p0, Lio/grpc/internal/s1;->c:Lvi/x0;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    const-class v2, Lio/grpc/internal/s1;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Lio/grpc/internal/s1;

    iget-object v2, p0, Lio/grpc/internal/s1;->a:Lvi/c;

    iget-object v3, p1, Lio/grpc/internal/s1;->a:Lvi/c;

    invoke-static {v2, v3}, Leb/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lio/grpc/internal/s1;->b:Lvi/w0;

    iget-object v3, p1, Lio/grpc/internal/s1;->b:Lvi/w0;

    invoke-static {v2, v3}, Leb/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lio/grpc/internal/s1;->c:Lvi/x0;

    iget-object p1, p1, Lio/grpc/internal/s1;->c:Lvi/x0;

    invoke-static {v2, p1}, Leb/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v1

    :goto_0
    return v0

    :cond_3
    :goto_1
    return v1
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lio/grpc/internal/s1;->a:Lvi/c;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lio/grpc/internal/s1;->b:Lvi/w0;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, Lio/grpc/internal/s1;->c:Lvi/x0;

    aput-object v2, v0, v1

    invoke-static {v0}, Leb/k;->b([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "[method="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/grpc/internal/s1;->c:Lvi/x0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " headers="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/grpc/internal/s1;->b:Lvi/w0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " callOptions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/grpc/internal/s1;->a:Lvi/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
