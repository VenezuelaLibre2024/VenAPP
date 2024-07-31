.class final Lio/grpc/internal/f1$o$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/f1$o;->c(Lvi/y0$g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lvi/y0$g;

.field final synthetic b:Lio/grpc/internal/f1$o;


# direct methods
.method constructor <init>(Lio/grpc/internal/f1$o;Lvi/y0$g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lio/grpc/internal/f1$o$b;->b:Lio/grpc/internal/f1$o;

    iput-object p2, p0, Lio/grpc/internal/f1$o$b;->a:Lvi/y0$g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 10

    iget-object v0, p0, Lio/grpc/internal/f1$o$b;->b:Lio/grpc/internal/f1$o;

    iget-object v0, v0, Lio/grpc/internal/f1$o;->c:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->c0(Lio/grpc/internal/f1;)Lvi/y0;

    move-result-object v0

    iget-object v1, p0, Lio/grpc/internal/f1$o$b;->b:Lio/grpc/internal/f1$o;

    iget-object v1, v1, Lio/grpc/internal/f1$o;->b:Lvi/y0;

    if-eq v0, v1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lio/grpc/internal/f1$o$b;->a:Lvi/y0$g;

    invoke-virtual {v0}, Lvi/y0$g;->a()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lio/grpc/internal/f1$o$b;->b:Lio/grpc/internal/f1$o;

    iget-object v1, v1, Lio/grpc/internal/f1$o;->c:Lio/grpc/internal/f1;

    invoke-static {v1}, Lio/grpc/internal/f1;->z(Lio/grpc/internal/f1;)Lvi/f;

    move-result-object v1

    sget-object v2, Lvi/f$a;->DEBUG:Lvi/f$a;

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    iget-object v5, p0, Lio/grpc/internal/f1$o$b;->a:Lvi/y0$g;

    invoke-virtual {v5}, Lvi/y0$g;->b()Lvi/a;

    move-result-object v5

    const/4 v6, 0x1

    aput-object v5, v3, v6

    const-string v5, "Resolved address: {0}, config={1}"

    invoke-virtual {v1, v2, v5, v3}, Lvi/f;->b(Lvi/f$a;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lio/grpc/internal/f1$o$b;->b:Lio/grpc/internal/f1$o;

    iget-object v1, v1, Lio/grpc/internal/f1$o;->c:Lio/grpc/internal/f1;

    invoke-static {v1}, Lio/grpc/internal/f1;->d0(Lio/grpc/internal/f1;)Lio/grpc/internal/f1$q;

    move-result-object v1

    sget-object v3, Lio/grpc/internal/f1$q;->SUCCESS:Lio/grpc/internal/f1$q;

    if-eq v1, v3, :cond_1

    iget-object v1, p0, Lio/grpc/internal/f1$o$b;->b:Lio/grpc/internal/f1$o;

    iget-object v1, v1, Lio/grpc/internal/f1$o;->c:Lio/grpc/internal/f1;

    invoke-static {v1}, Lio/grpc/internal/f1;->z(Lio/grpc/internal/f1;)Lvi/f;

    move-result-object v1

    sget-object v5, Lvi/f$a;->INFO:Lvi/f$a;

    new-array v7, v6, [Ljava/lang/Object;

    aput-object v0, v7, v4

    const-string v8, "Address resolved: {0}"

    invoke-virtual {v1, v5, v8, v7}, Lvi/f;->b(Lvi/f$a;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lio/grpc/internal/f1$o$b;->b:Lio/grpc/internal/f1$o;

    iget-object v1, v1, Lio/grpc/internal/f1$o;->c:Lio/grpc/internal/f1;

    invoke-static {v1, v3}, Lio/grpc/internal/f1;->e0(Lio/grpc/internal/f1;Lio/grpc/internal/f1$q;)Lio/grpc/internal/f1$q;

    :cond_1
    iget-object v1, p0, Lio/grpc/internal/f1$o$b;->b:Lio/grpc/internal/f1$o;

    iget-object v1, v1, Lio/grpc/internal/f1$o;->c:Lio/grpc/internal/f1;

    const/4 v3, 0x0

    invoke-static {v1, v3}, Lio/grpc/internal/f1;->g0(Lio/grpc/internal/f1;Lio/grpc/internal/k;)Lio/grpc/internal/k;

    iget-object v1, p0, Lio/grpc/internal/f1$o$b;->a:Lvi/y0$g;

    invoke-virtual {v1}, Lvi/y0$g;->c()Lvi/y0$c;

    move-result-object v1

    iget-object v5, p0, Lio/grpc/internal/f1$o$b;->a:Lvi/y0$g;

    invoke-virtual {v5}, Lvi/y0$g;->b()Lvi/a;

    move-result-object v5

    sget-object v7, Lvi/e0;->a:Lvi/a$c;

    invoke-virtual {v5, v7}, Lvi/a;->b(Lvi/a$c;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lvi/e0;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lvi/y0$c;->c()Ljava/lang/Object;

    move-result-object v7

    if-eqz v7, :cond_2

    invoke-virtual {v1}, Lvi/y0$c;->c()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lio/grpc/internal/i1;

    goto :goto_0

    :cond_2
    move-object v7, v3

    :goto_0
    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lvi/y0$c;->d()Lvi/g1;

    move-result-object v8

    goto :goto_1

    :cond_3
    move-object v8, v3

    :goto_1
    iget-object v9, p0, Lio/grpc/internal/f1$o$b;->b:Lio/grpc/internal/f1$o;

    iget-object v9, v9, Lio/grpc/internal/f1$o;->c:Lio/grpc/internal/f1;

    invoke-static {v9}, Lio/grpc/internal/f1;->h0(Lio/grpc/internal/f1;)Z

    move-result v9

    if-nez v9, :cond_7

    if-eqz v7, :cond_4

    iget-object v1, p0, Lio/grpc/internal/f1$o$b;->b:Lio/grpc/internal/f1$o;

    iget-object v1, v1, Lio/grpc/internal/f1$o;->c:Lio/grpc/internal/f1;

    invoke-static {v1}, Lio/grpc/internal/f1;->z(Lio/grpc/internal/f1;)Lvi/f;

    move-result-object v1

    sget-object v2, Lvi/f$a;->INFO:Lvi/f$a;

    const-string v3, "Service config from name resolver discarded by channel settings"

    invoke-virtual {v1, v2, v3}, Lvi/f;->a(Lvi/f$a;Ljava/lang/String;)V

    :cond_4
    iget-object v1, p0, Lio/grpc/internal/f1$o$b;->b:Lio/grpc/internal/f1$o;

    iget-object v1, v1, Lio/grpc/internal/f1$o;->c:Lio/grpc/internal/f1;

    invoke-static {v1}, Lio/grpc/internal/f1;->i0(Lio/grpc/internal/f1;)Lio/grpc/internal/i1;

    move-result-object v1

    if-nez v1, :cond_5

    invoke-static {}, Lio/grpc/internal/f1;->j0()Lio/grpc/internal/i1;

    move-result-object v1

    goto :goto_2

    :cond_5
    iget-object v1, p0, Lio/grpc/internal/f1$o$b;->b:Lio/grpc/internal/f1$o;

    iget-object v1, v1, Lio/grpc/internal/f1$o;->c:Lio/grpc/internal/f1;

    invoke-static {v1}, Lio/grpc/internal/f1;->i0(Lio/grpc/internal/f1;)Lio/grpc/internal/i1;

    move-result-object v1

    :goto_2
    if-eqz v5, :cond_6

    iget-object v2, p0, Lio/grpc/internal/f1$o$b;->b:Lio/grpc/internal/f1$o;

    iget-object v2, v2, Lio/grpc/internal/f1$o;->c:Lio/grpc/internal/f1;

    invoke-static {v2}, Lio/grpc/internal/f1;->z(Lio/grpc/internal/f1;)Lvi/f;

    move-result-object v2

    sget-object v3, Lvi/f$a;->INFO:Lvi/f$a;

    const-string v4, "Config selector from name resolver discarded by channel settings"

    invoke-virtual {v2, v3, v4}, Lvi/f;->a(Lvi/f$a;Ljava/lang/String;)V

    :cond_6
    iget-object v2, p0, Lio/grpc/internal/f1$o$b;->b:Lio/grpc/internal/f1$o;

    iget-object v2, v2, Lio/grpc/internal/f1$o;->c:Lio/grpc/internal/f1;

    invoke-static {v2}, Lio/grpc/internal/f1;->k0(Lio/grpc/internal/f1;)Lio/grpc/internal/f1$p;

    move-result-object v2

    invoke-virtual {v1}, Lio/grpc/internal/i1;->c()Lvi/e0;

    move-result-object v3

    invoke-virtual {v2, v3}, Lio/grpc/internal/f1$p;->n(Lvi/e0;)V

    goto/16 :goto_7

    :cond_7
    if-eqz v7, :cond_9

    iget-object v1, p0, Lio/grpc/internal/f1$o$b;->b:Lio/grpc/internal/f1$o;

    iget-object v1, v1, Lio/grpc/internal/f1$o;->c:Lio/grpc/internal/f1;

    invoke-static {v1}, Lio/grpc/internal/f1;->k0(Lio/grpc/internal/f1;)Lio/grpc/internal/f1$p;

    move-result-object v1

    if-eqz v5, :cond_8

    invoke-virtual {v1, v5}, Lio/grpc/internal/f1$p;->n(Lvi/e0;)V

    invoke-virtual {v7}, Lio/grpc/internal/i1;->c()Lvi/e0;

    move-result-object v1

    if-eqz v1, :cond_d

    iget-object v1, p0, Lio/grpc/internal/f1$o$b;->b:Lio/grpc/internal/f1$o;

    iget-object v1, v1, Lio/grpc/internal/f1$o;->c:Lio/grpc/internal/f1;

    invoke-static {v1}, Lio/grpc/internal/f1;->z(Lio/grpc/internal/f1;)Lvi/f;

    move-result-object v1

    const-string v3, "Method configs in service config will be discarded due to presence ofconfig-selector"

    goto :goto_3

    :cond_8
    invoke-virtual {v7}, Lio/grpc/internal/i1;->c()Lvi/e0;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/grpc/internal/f1$p;->n(Lvi/e0;)V

    goto :goto_4

    :cond_9
    iget-object v2, p0, Lio/grpc/internal/f1$o$b;->b:Lio/grpc/internal/f1$o;

    iget-object v2, v2, Lio/grpc/internal/f1$o;->c:Lio/grpc/internal/f1;

    invoke-static {v2}, Lio/grpc/internal/f1;->i0(Lio/grpc/internal/f1;)Lio/grpc/internal/i1;

    move-result-object v2

    if-eqz v2, :cond_a

    iget-object v1, p0, Lio/grpc/internal/f1$o$b;->b:Lio/grpc/internal/f1$o;

    iget-object v1, v1, Lio/grpc/internal/f1$o;->c:Lio/grpc/internal/f1;

    invoke-static {v1}, Lio/grpc/internal/f1;->i0(Lio/grpc/internal/f1;)Lio/grpc/internal/i1;

    move-result-object v7

    iget-object v1, p0, Lio/grpc/internal/f1$o$b;->b:Lio/grpc/internal/f1$o;

    iget-object v1, v1, Lio/grpc/internal/f1$o;->c:Lio/grpc/internal/f1;

    invoke-static {v1}, Lio/grpc/internal/f1;->k0(Lio/grpc/internal/f1;)Lio/grpc/internal/f1$p;

    move-result-object v1

    invoke-virtual {v7}, Lio/grpc/internal/i1;->c()Lvi/e0;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/grpc/internal/f1$p;->n(Lvi/e0;)V

    iget-object v1, p0, Lio/grpc/internal/f1$o$b;->b:Lio/grpc/internal/f1$o;

    iget-object v1, v1, Lio/grpc/internal/f1$o;->c:Lio/grpc/internal/f1;

    invoke-static {v1}, Lio/grpc/internal/f1;->z(Lio/grpc/internal/f1;)Lvi/f;

    move-result-object v1

    sget-object v2, Lvi/f$a;->INFO:Lvi/f$a;

    const-string v3, "Received no service config, using default service config"

    :goto_3
    invoke-virtual {v1, v2, v3}, Lvi/f;->a(Lvi/f$a;Ljava/lang/String;)V

    goto :goto_4

    :cond_a
    if-eqz v8, :cond_c

    iget-object v2, p0, Lio/grpc/internal/f1$o$b;->b:Lio/grpc/internal/f1$o;

    iget-object v2, v2, Lio/grpc/internal/f1$o;->c:Lio/grpc/internal/f1;

    invoke-static {v2}, Lio/grpc/internal/f1;->l0(Lio/grpc/internal/f1;)Z

    move-result v2

    if-nez v2, :cond_b

    iget-object v0, p0, Lio/grpc/internal/f1$o$b;->b:Lio/grpc/internal/f1$o;

    iget-object v0, v0, Lio/grpc/internal/f1$o;->c:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->z(Lio/grpc/internal/f1;)Lvi/f;

    move-result-object v0

    sget-object v2, Lvi/f$a;->INFO:Lvi/f$a;

    const-string v3, "Fallback to error due to invalid first service config without default config"

    invoke-virtual {v0, v2, v3}, Lvi/f;->a(Lvi/f$a;Ljava/lang/String;)V

    iget-object v0, p0, Lio/grpc/internal/f1$o$b;->b:Lio/grpc/internal/f1$o;

    invoke-virtual {v1}, Lvi/y0$c;->d()Lvi/g1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/grpc/internal/f1$o;->b(Lvi/g1;)V

    return-void

    :cond_b
    iget-object v1, p0, Lio/grpc/internal/f1$o$b;->b:Lio/grpc/internal/f1$o;

    iget-object v1, v1, Lio/grpc/internal/f1$o;->c:Lio/grpc/internal/f1;

    invoke-static {v1}, Lio/grpc/internal/f1;->q(Lio/grpc/internal/f1;)Lio/grpc/internal/i1;

    move-result-object v7

    goto :goto_4

    :cond_c
    invoke-static {}, Lio/grpc/internal/f1;->j0()Lio/grpc/internal/i1;

    move-result-object v7

    iget-object v1, p0, Lio/grpc/internal/f1$o$b;->b:Lio/grpc/internal/f1$o;

    iget-object v1, v1, Lio/grpc/internal/f1$o;->c:Lio/grpc/internal/f1;

    invoke-static {v1}, Lio/grpc/internal/f1;->k0(Lio/grpc/internal/f1;)Lio/grpc/internal/f1$p;

    move-result-object v1

    invoke-virtual {v1, v3}, Lio/grpc/internal/f1$p;->n(Lvi/e0;)V

    :cond_d
    :goto_4
    iget-object v1, p0, Lio/grpc/internal/f1$o$b;->b:Lio/grpc/internal/f1$o;

    iget-object v1, v1, Lio/grpc/internal/f1$o;->c:Lio/grpc/internal/f1;

    invoke-static {v1}, Lio/grpc/internal/f1;->q(Lio/grpc/internal/f1;)Lio/grpc/internal/i1;

    move-result-object v1

    invoke-virtual {v7, v1}, Lio/grpc/internal/i1;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    iget-object v1, p0, Lio/grpc/internal/f1$o$b;->b:Lio/grpc/internal/f1$o;

    iget-object v1, v1, Lio/grpc/internal/f1$o;->c:Lio/grpc/internal/f1;

    invoke-static {v1}, Lio/grpc/internal/f1;->z(Lio/grpc/internal/f1;)Lvi/f;

    move-result-object v1

    sget-object v2, Lvi/f$a;->INFO:Lvi/f$a;

    new-array v3, v6, [Ljava/lang/Object;

    invoke-static {}, Lio/grpc/internal/f1;->j0()Lio/grpc/internal/i1;

    move-result-object v5

    if-ne v7, v5, :cond_e

    const-string v5, " to empty"

    goto :goto_5

    :cond_e
    const-string v5, ""

    :goto_5
    aput-object v5, v3, v4

    const-string v4, "Service config changed{0}"

    invoke-virtual {v1, v2, v4, v3}, Lvi/f;->b(Lvi/f$a;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lio/grpc/internal/f1$o$b;->b:Lio/grpc/internal/f1$o;

    iget-object v1, v1, Lio/grpc/internal/f1$o;->c:Lio/grpc/internal/f1;

    invoke-static {v1, v7}, Lio/grpc/internal/f1;->r(Lio/grpc/internal/f1;Lio/grpc/internal/i1;)Lio/grpc/internal/i1;

    :cond_f
    :try_start_0
    iget-object v1, p0, Lio/grpc/internal/f1$o$b;->b:Lio/grpc/internal/f1$o;

    iget-object v1, v1, Lio/grpc/internal/f1$o;->c:Lio/grpc/internal/f1;

    invoke-static {v1, v6}, Lio/grpc/internal/f1;->m0(Lio/grpc/internal/f1;Z)Z
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_6

    :catch_0
    move-exception v1

    sget-object v2, Lio/grpc/internal/f1;->n0:Ljava/util/logging/Logger;

    sget-object v3, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "["

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lio/grpc/internal/f1$o$b;->b:Lio/grpc/internal/f1$o;

    iget-object v5, v5, Lio/grpc/internal/f1$o;->c:Lio/grpc/internal/f1;

    invoke-virtual {v5}, Lio/grpc/internal/f1;->e()Lvi/i0;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, "] Unexpected exception from parsing service config"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4, v1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_6
    move-object v1, v7

    :goto_7
    iget-object v2, p0, Lio/grpc/internal/f1$o$b;->a:Lvi/y0$g;

    invoke-virtual {v2}, Lvi/y0$g;->b()Lvi/a;

    move-result-object v2

    iget-object v3, p0, Lio/grpc/internal/f1$o$b;->b:Lio/grpc/internal/f1$o;

    iget-object v4, v3, Lio/grpc/internal/f1$o;->a:Lio/grpc/internal/f1$n;

    iget-object v3, v3, Lio/grpc/internal/f1$o;->c:Lio/grpc/internal/f1;

    invoke-static {v3}, Lio/grpc/internal/f1;->q0(Lio/grpc/internal/f1;)Lio/grpc/internal/f1$n;

    move-result-object v3

    if-ne v4, v3, :cond_11

    invoke-virtual {v2}, Lvi/a;->d()Lvi/a$b;

    move-result-object v2

    sget-object v3, Lvi/e0;->a:Lvi/a$c;

    invoke-virtual {v2, v3}, Lvi/a$b;->c(Lvi/a$c;)Lvi/a$b;

    move-result-object v2

    invoke-virtual {v1}, Lio/grpc/internal/i1;->d()Ljava/util/Map;

    move-result-object v3

    if-eqz v3, :cond_10

    sget-object v4, Lvi/p0;->b:Lvi/a$c;

    invoke-virtual {v2, v4, v3}, Lvi/a$b;->d(Lvi/a$c;Ljava/lang/Object;)Lvi/a$b;

    move-result-object v3

    invoke-virtual {v3}, Lvi/a$b;->a()Lvi/a;

    :cond_10
    invoke-virtual {v2}, Lvi/a$b;->a()Lvi/a;

    move-result-object v2

    iget-object v3, p0, Lio/grpc/internal/f1$o$b;->b:Lio/grpc/internal/f1$o;

    iget-object v3, v3, Lio/grpc/internal/f1$o;->a:Lio/grpc/internal/f1$n;

    iget-object v3, v3, Lio/grpc/internal/f1$n;->a:Lio/grpc/internal/j$b;

    invoke-static {}, Lvi/p0$g;->d()Lvi/p0$g$a;

    move-result-object v4

    invoke-virtual {v4, v0}, Lvi/p0$g$a;->b(Ljava/util/List;)Lvi/p0$g$a;

    move-result-object v0

    invoke-virtual {v0, v2}, Lvi/p0$g$a;->c(Lvi/a;)Lvi/p0$g$a;

    move-result-object v0

    invoke-virtual {v1}, Lio/grpc/internal/i1;->e()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvi/p0$g$a;->d(Ljava/lang/Object;)Lvi/p0$g$a;

    move-result-object v0

    invoke-virtual {v0}, Lvi/p0$g$a;->a()Lvi/p0$g;

    move-result-object v0

    invoke-virtual {v3, v0}, Lio/grpc/internal/j$b;->d(Lvi/p0$g;)Z

    move-result v0

    if-nez v0, :cond_11

    iget-object v0, p0, Lio/grpc/internal/f1$o$b;->b:Lio/grpc/internal/f1$o;

    invoke-static {v0}, Lio/grpc/internal/f1$o;->d(Lio/grpc/internal/f1$o;)V

    :cond_11
    return-void
.end method
