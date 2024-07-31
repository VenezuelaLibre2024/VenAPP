.class public final Lio/grpc/internal/a2;
.super Lvi/y0$h;
.source "SourceFile"


# instance fields
.field private final a:Z

.field private final b:I

.field private final c:I

.field private final d:Lio/grpc/internal/j;


# direct methods
.method public constructor <init>(ZIILio/grpc/internal/j;)V
    .locals 0

    invoke-direct {p0}, Lvi/y0$h;-><init>()V

    iput-boolean p1, p0, Lio/grpc/internal/a2;->a:Z

    iput p2, p0, Lio/grpc/internal/a2;->b:I

    iput p3, p0, Lio/grpc/internal/a2;->c:I

    const-string p1, "autoLoadBalancerFactory"

    invoke-static {p4, p1}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/grpc/internal/j;

    iput-object p1, p0, Lio/grpc/internal/a2;->d:Lio/grpc/internal/j;

    return-void
.end method


# virtual methods
.method public a(Ljava/util/Map;)Lvi/y0$c;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "*>;)",
            "Lvi/y0$c;"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lio/grpc/internal/a2;->d:Lio/grpc/internal/j;

    invoke-virtual {v0, p1}, Lio/grpc/internal/j;->f(Ljava/util/Map;)Lvi/y0$c;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lvi/y0$c;->d()Lvi/g1;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lvi/y0$c;->d()Lvi/g1;

    move-result-object p1

    invoke-static {p1}, Lvi/y0$c;->b(Lvi/g1;)Lvi/y0$c;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {v0}, Lvi/y0$c;->c()Ljava/lang/Object;

    move-result-object v0

    :goto_0
    iget-boolean v1, p0, Lio/grpc/internal/a2;->a:Z

    iget v2, p0, Lio/grpc/internal/a2;->b:I

    iget v3, p0, Lio/grpc/internal/a2;->c:I

    invoke-static {p1, v1, v2, v3, v0}, Lio/grpc/internal/i1;->b(Ljava/util/Map;ZIILjava/lang/Object;)Lio/grpc/internal/i1;

    move-result-object p1

    invoke-static {p1}, Lvi/y0$c;->a(Ljava/lang/Object;)Lvi/y0$c;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    sget-object v0, Lvi/g1;->h:Lvi/g1;

    const-string v1, "failed to parse service config"

    invoke-virtual {v0, v1}, Lvi/g1;->r(Ljava/lang/String;)Lvi/g1;

    move-result-object v0

    invoke-virtual {v0, p1}, Lvi/g1;->q(Ljava/lang/Throwable;)Lvi/g1;

    move-result-object p1

    invoke-static {p1}, Lvi/y0$c;->b(Lvi/g1;)Lvi/y0$c;

    move-result-object p1

    return-object p1
.end method
