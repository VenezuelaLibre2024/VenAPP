.class public Lcom/google/firebase/auth/FirebaseAuthRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic lambda$getComponents$0(Lpc/e0;Lpc/e0;Lpc/e0;Lpc/e0;Lpc/e0;Lpc/d;)Lcom/google/firebase/auth/FirebaseAuth;
    .locals 10

    const-class v0, Lzb/g;

    invoke-interface {p5, v0}, Lpc/d;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lzb/g;

    const-class v0, Ljc/b;

    invoke-interface {p5, v0}, Lpc/d;->f(Ljava/lang/Class;)Lee/b;

    move-result-object v3

    const-class v0, Lod/i;

    invoke-interface {p5, v0}, Lpc/d;->f(Ljava/lang/Class;)Lee/b;

    move-result-object v4

    new-instance v0, Loc/a2;

    invoke-interface {p5, p0}, Lpc/d;->e(Lpc/e0;)Ljava/lang/Object;

    move-result-object p0

    move-object v5, p0

    check-cast v5, Ljava/util/concurrent/Executor;

    invoke-interface {p5, p1}, Lpc/d;->e(Lpc/e0;)Ljava/lang/Object;

    move-result-object p0

    move-object v6, p0

    check-cast v6, Ljava/util/concurrent/Executor;

    invoke-interface {p5, p2}, Lpc/d;->e(Lpc/e0;)Ljava/lang/Object;

    move-result-object p0

    move-object v7, p0

    check-cast v7, Ljava/util/concurrent/Executor;

    invoke-interface {p5, p3}, Lpc/d;->e(Lpc/e0;)Ljava/lang/Object;

    move-result-object p0

    move-object v8, p0

    check-cast v8, Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {p5, p4}, Lpc/d;->e(Lpc/e0;)Ljava/lang/Object;

    move-result-object p0

    move-object v9, p0

    check-cast v9, Ljava/util/concurrent/Executor;

    move-object v1, v0

    invoke-direct/range {v1 .. v9}, Loc/a2;-><init>(Lzb/g;Lee/b;Lee/b;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 11
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lpc/c<",
            "*>;>;"
        }
    .end annotation

    const-class v0, Ldc/a;

    const-class v1, Ljava/util/concurrent/Executor;

    invoke-static {v0, v1}, Lpc/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lpc/e0;

    move-result-object v3

    const-class v0, Ldc/b;

    invoke-static {v0, v1}, Lpc/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lpc/e0;

    move-result-object v4

    const-class v0, Ldc/c;

    invoke-static {v0, v1}, Lpc/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lpc/e0;

    move-result-object v5

    const-class v2, Ljava/util/concurrent/ScheduledExecutorService;

    invoke-static {v0, v2}, Lpc/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lpc/e0;

    move-result-object v6

    const-class v0, Ldc/d;

    invoke-static {v0, v1}, Lpc/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lpc/e0;

    move-result-object v7

    const/4 v0, 0x3

    new-array v0, v0, [Lpc/c;

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/Class;

    const-class v8, Loc/b;

    const/4 v9, 0x0

    aput-object v8, v2, v9

    const-class v8, Lcom/google/firebase/auth/FirebaseAuth;

    invoke-static {v8, v2}, Lpc/c;->d(Ljava/lang/Class;[Ljava/lang/Class;)Lpc/c$b;

    move-result-object v2

    const-class v8, Lzb/g;

    invoke-static {v8}, Lpc/q;->j(Ljava/lang/Class;)Lpc/q;

    move-result-object v8

    invoke-virtual {v2, v8}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v2

    const-class v8, Lod/i;

    invoke-static {v8}, Lpc/q;->l(Ljava/lang/Class;)Lpc/q;

    move-result-object v8

    invoke-virtual {v2, v8}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v2

    invoke-static {v3}, Lpc/q;->k(Lpc/e0;)Lpc/q;

    move-result-object v8

    invoke-virtual {v2, v8}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v2

    invoke-static {v4}, Lpc/q;->k(Lpc/e0;)Lpc/q;

    move-result-object v8

    invoke-virtual {v2, v8}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v2

    invoke-static {v5}, Lpc/q;->k(Lpc/e0;)Lpc/q;

    move-result-object v8

    invoke-virtual {v2, v8}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v2

    invoke-static {v6}, Lpc/q;->k(Lpc/e0;)Lpc/q;

    move-result-object v8

    invoke-virtual {v2, v8}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v2

    invoke-static {v7}, Lpc/q;->k(Lpc/e0;)Lpc/q;

    move-result-object v8

    invoke-virtual {v2, v8}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v2

    const-class v8, Ljc/b;

    invoke-static {v8}, Lpc/q;->i(Ljava/lang/Class;)Lpc/q;

    move-result-object v8

    invoke-virtual {v2, v8}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v8

    new-instance v10, Lcom/google/firebase/auth/j1;

    move-object v2, v10

    invoke-direct/range {v2 .. v7}, Lcom/google/firebase/auth/j1;-><init>(Lpc/e0;Lpc/e0;Lpc/e0;Lpc/e0;Lpc/e0;)V

    invoke-virtual {v8, v10}, Lpc/c$b;->f(Lpc/g;)Lpc/c$b;

    move-result-object v2

    invoke-virtual {v2}, Lpc/c$b;->d()Lpc/c;

    move-result-object v2

    aput-object v2, v0, v9

    invoke-static {}, Lod/h;->a()Lpc/c;

    move-result-object v2

    aput-object v2, v0, v1

    const-string v1, "fire-auth"

    const-string v2, "22.3.0"

    invoke-static {v1, v2}, Lye/h;->b(Ljava/lang/String;Ljava/lang/String;)Lpc/c;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
