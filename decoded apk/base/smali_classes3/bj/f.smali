.class public final Lbj/f;
.super Lvi/q0;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lvi/q0;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lvi/p0$d;)Lvi/p0;
    .locals 2

    new-instance v0, Lbj/e;

    sget-object v1, Lio/grpc/internal/k2;->a:Lio/grpc/internal/k2;

    invoke-direct {v0, p1, v1}, Lbj/e;-><init>(Lvi/p0$d;Lio/grpc/internal/k2;)V

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    const-string v0, "outlier_detection_experimental"

    return-object v0
.end method

.method public c()I
    .locals 1

    const/4 v0, 0x5

    return v0
.end method

.method public d()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public e(Ljava/util/Map;)Lvi/y0$c;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "*>;)",
            "Lvi/y0$c;"
        }
    .end annotation

    const-string v0, "interval"

    invoke-static {p1, v0}, Lio/grpc/internal/a1;->l(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    const-string v1, "baseEjectionTime"

    invoke-static {p1, v1}, Lio/grpc/internal/a1;->l(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "maxEjectionTime"

    invoke-static {p1, v2}, Lio/grpc/internal/a1;->l(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v2

    const-string v3, "maxEjectionPercentage"

    invoke-static {p1, v3}, Lio/grpc/internal/a1;->i(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v3

    new-instance v4, Lbj/e$g$a;

    invoke-direct {v4}, Lbj/e$g$a;-><init>()V

    if-eqz v0, :cond_0

    invoke-virtual {v4, v0}, Lbj/e$g$a;->e(Ljava/lang/Long;)Lbj/e$g$a;

    :cond_0
    if-eqz v1, :cond_1

    invoke-virtual {v4, v1}, Lbj/e$g$a;->b(Ljava/lang/Long;)Lbj/e$g$a;

    :cond_1
    if-eqz v2, :cond_2

    invoke-virtual {v4, v2}, Lbj/e$g$a;->g(Ljava/lang/Long;)Lbj/e$g$a;

    :cond_2
    if-eqz v3, :cond_3

    invoke-virtual {v4, v3}, Lbj/e$g$a;->f(Ljava/lang/Integer;)Lbj/e$g$a;

    :cond_3
    const-string v0, "successRateEjection"

    invoke-static {p1, v0}, Lio/grpc/internal/a1;->j(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    const-string v1, "requestVolume"

    const-string v2, "minimumHosts"

    const-string v3, "enforcementPercentage"

    if-eqz v0, :cond_8

    new-instance v5, Lbj/e$g$c$a;

    invoke-direct {v5}, Lbj/e$g$c$a;-><init>()V

    const-string v6, "stdevFactor"

    invoke-static {v0, v6}, Lio/grpc/internal/a1;->i(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v0, v3}, Lio/grpc/internal/a1;->i(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v0, v2}, Lio/grpc/internal/a1;->i(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v0, v1}, Lio/grpc/internal/a1;->i(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v6, :cond_4

    invoke-virtual {v5, v6}, Lbj/e$g$c$a;->e(Ljava/lang/Integer;)Lbj/e$g$c$a;

    :cond_4
    if-eqz v7, :cond_5

    invoke-virtual {v5, v7}, Lbj/e$g$c$a;->b(Ljava/lang/Integer;)Lbj/e$g$c$a;

    :cond_5
    if-eqz v8, :cond_6

    invoke-virtual {v5, v8}, Lbj/e$g$c$a;->c(Ljava/lang/Integer;)Lbj/e$g$c$a;

    :cond_6
    if-eqz v0, :cond_7

    invoke-virtual {v5, v0}, Lbj/e$g$c$a;->d(Ljava/lang/Integer;)Lbj/e$g$c$a;

    :cond_7
    invoke-virtual {v5}, Lbj/e$g$c$a;->a()Lbj/e$g$c;

    move-result-object v0

    invoke-virtual {v4, v0}, Lbj/e$g$a;->h(Lbj/e$g$c;)Lbj/e$g$a;

    :cond_8
    const-string v0, "failurePercentageEjection"

    invoke-static {p1, v0}, Lio/grpc/internal/a1;->j(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_d

    new-instance v5, Lbj/e$g$b$a;

    invoke-direct {v5}, Lbj/e$g$b$a;-><init>()V

    const-string v6, "threshold"

    invoke-static {v0, v6}, Lio/grpc/internal/a1;->i(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v0, v3}, Lio/grpc/internal/a1;->i(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v0, v2}, Lio/grpc/internal/a1;->i(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0, v1}, Lio/grpc/internal/a1;->i(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v6, :cond_9

    invoke-virtual {v5, v6}, Lbj/e$g$b$a;->e(Ljava/lang/Integer;)Lbj/e$g$b$a;

    :cond_9
    if-eqz v3, :cond_a

    invoke-virtual {v5, v3}, Lbj/e$g$b$a;->b(Ljava/lang/Integer;)Lbj/e$g$b$a;

    :cond_a
    if-eqz v2, :cond_b

    invoke-virtual {v5, v2}, Lbj/e$g$b$a;->c(Ljava/lang/Integer;)Lbj/e$g$b$a;

    :cond_b
    if-eqz v0, :cond_c

    invoke-virtual {v5, v0}, Lbj/e$g$b$a;->d(Ljava/lang/Integer;)Lbj/e$g$b$a;

    :cond_c
    invoke-virtual {v5}, Lbj/e$g$b$a;->a()Lbj/e$g$b;

    move-result-object v0

    invoke-virtual {v4, v0}, Lbj/e$g$a;->d(Lbj/e$g$b;)Lbj/e$g$a;

    :cond_d
    const-string v0, "childPolicy"

    invoke-static {p1, v0}, Lio/grpc/internal/a1;->f(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lio/grpc/internal/d2;->A(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_10

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_e

    goto :goto_0

    :cond_e
    invoke-static {}, Lvi/r0;->b()Lvi/r0;

    move-result-object p1

    invoke-static {v0, p1}, Lio/grpc/internal/d2;->y(Ljava/util/List;Lvi/r0;)Lvi/y0$c;

    move-result-object p1

    invoke-virtual {p1}, Lvi/y0$c;->d()Lvi/g1;

    move-result-object v0

    if-eqz v0, :cond_f

    return-object p1

    :cond_f
    invoke-virtual {p1}, Lvi/y0$c;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/grpc/internal/d2$b;

    invoke-virtual {v4, p1}, Lbj/e$g$a;->c(Lio/grpc/internal/d2$b;)Lbj/e$g$a;

    invoke-virtual {v4}, Lbj/e$g$a;->a()Lbj/e$g;

    move-result-object p1

    invoke-static {p1}, Lvi/y0$c;->a(Ljava/lang/Object;)Lvi/y0$c;

    move-result-object p1

    return-object p1

    :cond_10
    :goto_0
    sget-object v0, Lvi/g1;->t:Lvi/g1;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No child policy in outlier_detection_experimental LB policy: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lvi/g1;->r(Ljava/lang/String;)Lvi/g1;

    move-result-object p1

    invoke-static {p1}, Lvi/y0$c;->b(Lvi/g1;)Lvi/y0$c;

    move-result-object p1

    return-object p1
.end method
