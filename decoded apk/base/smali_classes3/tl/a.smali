.class public final Ltl/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lql/v;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltl/a$a;
    }
.end annotation


# static fields
.field public static final a:Ltl/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ltl/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ltl/a$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Ltl/a;->a:Ltl/a$a;

    return-void
.end method

.method public constructor <init>(Lql/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lql/v$a;)Lql/c0;
    .locals 6

    const-string v0, "chain"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lql/v$a;->call()Lql/e;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    new-instance v3, Ltl/b$b;

    invoke-interface {p1}, Lql/v$a;->o()Lql/a0;

    move-result-object v4

    const/4 v5, 0x0

    invoke-direct {v3, v1, v2, v4, v5}, Ltl/b$b;-><init>(JLql/a0;Lql/c0;)V

    invoke-virtual {v3}, Ltl/b$b;->b()Ltl/b;

    move-result-object v1

    invoke-virtual {v1}, Ltl/b;->b()Lql/a0;

    move-result-object v2

    invoke-virtual {v1}, Ltl/b;->a()Lql/c0;

    move-result-object v1

    instance-of v3, v0, Lvl/e;

    if-eqz v3, :cond_0

    move-object v3, v0

    check-cast v3, Lvl/e;

    goto :goto_0

    :cond_0
    move-object v3, v5

    :goto_0
    if-nez v3, :cond_1

    move-object v3, v5

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Lvl/e;->m()Lql/r;

    move-result-object v3

    :goto_1
    if-nez v3, :cond_2

    sget-object v3, Lql/r;->b:Lql/r;

    :cond_2
    if-nez v2, :cond_3

    if-nez v1, :cond_3

    new-instance v1, Lql/c0$a;

    invoke-direct {v1}, Lql/c0$a;-><init>()V

    invoke-interface {p1}, Lql/v$a;->o()Lql/a0;

    move-result-object p1

    invoke-virtual {v1, p1}, Lql/c0$a;->s(Lql/a0;)Lql/c0$a;

    move-result-object p1

    sget-object v1, Lql/z;->HTTP_1_1:Lql/z;

    invoke-virtual {p1, v1}, Lql/c0$a;->q(Lql/z;)Lql/c0$a;

    move-result-object p1

    const/16 v1, 0x1f8

    invoke-virtual {p1, v1}, Lql/c0$a;->g(I)Lql/c0$a;

    move-result-object p1

    const-string v1, "Unsatisfiable Request (only-if-cached)"

    invoke-virtual {p1, v1}, Lql/c0$a;->n(Ljava/lang/String;)Lql/c0$a;

    move-result-object p1

    sget-object v1, Lrl/d;->c:Lql/d0;

    invoke-virtual {p1, v1}, Lql/c0$a;->b(Lql/d0;)Lql/c0$a;

    move-result-object p1

    const-wide/16 v1, -0x1

    invoke-virtual {p1, v1, v2}, Lql/c0$a;->t(J)Lql/c0$a;

    move-result-object p1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {p1, v1, v2}, Lql/c0$a;->r(J)Lql/c0$a;

    move-result-object p1

    invoke-virtual {p1}, Lql/c0$a;->c()Lql/c0;

    move-result-object p1

    invoke-virtual {v3, v0, p1}, Lql/r;->z(Lql/e;Lql/c0;)V

    return-object p1

    :cond_3
    if-nez v2, :cond_4

    invoke-static {v1}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lql/c0;->B()Lql/c0$a;

    move-result-object p1

    sget-object v2, Ltl/a;->a:Ltl/a$a;

    invoke-static {v2, v1}, Ltl/a$a;->b(Ltl/a$a;Lql/c0;)Lql/c0;

    move-result-object v1

    invoke-virtual {p1, v1}, Lql/c0$a;->d(Lql/c0;)Lql/c0$a;

    move-result-object p1

    invoke-virtual {p1}, Lql/c0$a;->c()Lql/c0;

    move-result-object p1

    invoke-virtual {v3, v0, p1}, Lql/r;->b(Lql/e;Lql/c0;)V

    return-object p1

    :cond_4
    if-eqz v1, :cond_5

    invoke-virtual {v3, v0, v1}, Lql/r;->a(Lql/e;Lql/c0;)V

    :cond_5
    :try_start_0
    invoke-interface {p1, v2}, Lql/v$a;->a(Lql/a0;)Lql/c0;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_a

    const/4 v0, 0x0

    if-nez p1, :cond_6

    goto :goto_2

    :cond_6
    invoke-virtual {p1}, Lql/c0;->g()I

    move-result v2

    const/16 v3, 0x130

    if-ne v2, v3, :cond_7

    const/4 v0, 0x1

    :cond_7
    :goto_2
    if-nez v0, :cond_9

    invoke-virtual {v1}, Lql/c0;->a()Lql/d0;

    move-result-object v0

    if-nez v0, :cond_8

    goto :goto_3

    :cond_8
    invoke-static {v0}, Lrl/d;->m(Ljava/io/Closeable;)V

    goto :goto_3

    :cond_9
    invoke-virtual {v1}, Lql/c0;->B()Lql/c0$a;

    move-result-object v0

    sget-object v2, Ltl/a;->a:Ltl/a$a;

    invoke-virtual {v1}, Lql/c0;->o()Lql/t;

    move-result-object v3

    invoke-virtual {p1}, Lql/c0;->o()Lql/t;

    move-result-object v4

    invoke-static {v2, v3, v4}, Ltl/a$a;->a(Ltl/a$a;Lql/t;Lql/t;)Lql/t;

    move-result-object v3

    invoke-virtual {v0, v3}, Lql/c0$a;->l(Lql/t;)Lql/c0$a;

    move-result-object v0

    invoke-virtual {p1}, Lql/c0;->Q()J

    move-result-wide v3

    invoke-virtual {v0, v3, v4}, Lql/c0$a;->t(J)Lql/c0$a;

    move-result-object v0

    invoke-virtual {p1}, Lql/c0;->I()J

    move-result-wide v3

    invoke-virtual {v0, v3, v4}, Lql/c0$a;->r(J)Lql/c0$a;

    move-result-object v0

    invoke-static {v2, v1}, Ltl/a$a;->b(Ltl/a$a;Lql/c0;)Lql/c0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lql/c0$a;->d(Lql/c0;)Lql/c0$a;

    move-result-object v0

    invoke-static {v2, p1}, Ltl/a$a;->b(Ltl/a$a;Lql/c0;)Lql/c0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lql/c0$a;->o(Lql/c0;)Lql/c0$a;

    move-result-object v0

    invoke-virtual {v0}, Lql/c0$a;->c()Lql/c0;

    invoke-virtual {p1}, Lql/c0;->a()Lql/d0;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lql/d0;->close()V

    invoke-static {v5}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    throw v5

    :cond_a
    :goto_3
    invoke-static {p1}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lql/c0;->B()Lql/c0$a;

    move-result-object v0

    sget-object v2, Ltl/a;->a:Ltl/a$a;

    invoke-static {v2, v1}, Ltl/a$a;->b(Ltl/a$a;Lql/c0;)Lql/c0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lql/c0$a;->d(Lql/c0;)Lql/c0$a;

    move-result-object v0

    invoke-static {v2, p1}, Ltl/a$a;->b(Ltl/a$a;Lql/c0;)Lql/c0;

    move-result-object p1

    invoke-virtual {v0, p1}, Lql/c0$a;->o(Lql/c0;)Lql/c0$a;

    move-result-object p1

    invoke-virtual {p1}, Lql/c0$a;->c()Lql/c0;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    throw p1
.end method
