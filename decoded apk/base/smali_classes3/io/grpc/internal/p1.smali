.class final Lio/grpc/internal/p1;
.super Lvi/s0;
.source "SourceFile"

# interfaces
.implements Lvi/h0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lvi/s0;",
        "Lvi/h0<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field private static final h:Ljava/util/logging/Logger;


# instance fields
.field private a:Lio/grpc/internal/x0;

.field private final b:Lvi/i0;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/util/concurrent/Executor;

.field private final e:Ljava/util/concurrent/ScheduledExecutorService;

.field private final f:Lio/grpc/internal/m;

.field private final g:Lio/grpc/internal/p$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lio/grpc/internal/p1;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lio/grpc/internal/p1;->h:Ljava/util/logging/Logger;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/p1;->c:Ljava/lang/String;

    return-object v0
.end method

.method public e()Lvi/i0;
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/p1;->b:Lvi/i0;

    return-object v0
.end method

.method public h(Lvi/x0;Lvi/c;)Lvi/g;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<RequestT:",
            "Ljava/lang/Object;",
            "ResponseT:",
            "Ljava/lang/Object;",
            ">(",
            "Lvi/x0<",
            "TRequestT;TResponseT;>;",
            "Lvi/c;",
            ")",
            "Lvi/g<",
            "TRequestT;TResponseT;>;"
        }
    .end annotation

    new-instance v8, Lio/grpc/internal/p;

    invoke-virtual {p2}, Lvi/c;->e()Ljava/util/concurrent/Executor;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lio/grpc/internal/p1;->d:Ljava/util/concurrent/Executor;

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lvi/c;->e()Ljava/util/concurrent/Executor;

    move-result-object v0

    :goto_0
    move-object v2, v0

    iget-object v4, p0, Lio/grpc/internal/p1;->g:Lio/grpc/internal/p$e;

    iget-object v5, p0, Lio/grpc/internal/p1;->e:Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v6, p0, Lio/grpc/internal/p1;->f:Lio/grpc/internal/m;

    const/4 v7, 0x0

    move-object v0, v8

    move-object v1, p1

    move-object v3, p2

    invoke-direct/range {v0 .. v7}, Lio/grpc/internal/p;-><init>(Lvi/x0;Ljava/util/concurrent/Executor;Lvi/c;Lio/grpc/internal/p$e;Ljava/util/concurrent/ScheduledExecutorService;Lio/grpc/internal/m;Lvi/e0;)V

    return-object v8
.end method

.method i()Lio/grpc/internal/x0;
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/p1;->a:Lio/grpc/internal/x0;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    invoke-static {p0}, Leb/i;->c(Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    iget-object v1, p0, Lio/grpc/internal/p1;->b:Lvi/i0;

    invoke-virtual {v1}, Lvi/i0;->d()J

    move-result-wide v1

    const-string v3, "logId"

    invoke-virtual {v0, v3, v1, v2}, Leb/i$b;->c(Ljava/lang/String;J)Leb/i$b;

    move-result-object v0

    const-string v1, "authority"

    iget-object v2, p0, Lio/grpc/internal/p1;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Leb/i$b;->d(Ljava/lang/String;Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    invoke-virtual {v0}, Leb/i$b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
