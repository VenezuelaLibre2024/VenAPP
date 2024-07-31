.class public Lcom/google/firebase/appcheck/debug/FirebaseAppCheckDebugRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lpc/e0;Lpc/e0;Lpc/e0;Lpc/d;)Lgc/e;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/google/firebase/appcheck/debug/FirebaseAppCheckDebugRegistrar;->b(Lpc/e0;Lpc/e0;Lpc/e0;Lpc/d;)Lgc/e;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic b(Lpc/e0;Lpc/e0;Lpc/e0;Lpc/d;)Lgc/e;
    .locals 7

    new-instance v6, Lgc/e;

    const-class v0, Lzb/g;

    invoke-interface {p3, v0}, Lpc/d;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lzb/g;

    const-class v0, Lfc/c;

    invoke-interface {p3, v0}, Lpc/d;->f(Ljava/lang/Class;)Lee/b;

    move-result-object v2

    invoke-interface {p3, p0}, Lpc/d;->e(Lpc/e0;)Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Ljava/util/concurrent/Executor;

    invoke-interface {p3, p1}, Lpc/d;->e(Lpc/e0;)Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Ljava/util/concurrent/Executor;

    invoke-interface {p3, p2}, Lpc/d;->e(Lpc/e0;)Ljava/lang/Object;

    move-result-object p0

    move-object v5, p0

    check-cast v5, Ljava/util/concurrent/Executor;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lgc/e;-><init>(Lzb/g;Lee/b;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)V

    return-object v6
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lpc/c<",
            "*>;>;"
        }
    .end annotation

    const-class v0, Ldc/c;

    const-class v1, Ljava/util/concurrent/Executor;

    invoke-static {v0, v1}, Lpc/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lpc/e0;

    move-result-object v0

    const-class v2, Ldc/a;

    invoke-static {v2, v1}, Lpc/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lpc/e0;

    move-result-object v2

    const-class v3, Ldc/b;

    invoke-static {v3, v1}, Lpc/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lpc/e0;

    move-result-object v1

    const/4 v3, 0x2

    new-array v3, v3, [Lpc/c;

    const-class v4, Lgc/e;

    invoke-static {v4}, Lpc/c;->c(Ljava/lang/Class;)Lpc/c$b;

    move-result-object v4

    const-string v5, "fire-app-check-debug"

    invoke-virtual {v4, v5}, Lpc/c$b;->h(Ljava/lang/String;)Lpc/c$b;

    move-result-object v4

    const-class v6, Lzb/g;

    invoke-static {v6}, Lpc/q;->j(Ljava/lang/Class;)Lpc/q;

    move-result-object v6

    invoke-virtual {v4, v6}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v4

    const-class v6, Lfc/c;

    invoke-static {v6}, Lpc/q;->i(Ljava/lang/Class;)Lpc/q;

    move-result-object v6

    invoke-virtual {v4, v6}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v4

    invoke-static {v0}, Lpc/q;->k(Lpc/e0;)Lpc/q;

    move-result-object v6

    invoke-virtual {v4, v6}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v4

    invoke-static {v2}, Lpc/q;->k(Lpc/e0;)Lpc/q;

    move-result-object v6

    invoke-virtual {v4, v6}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v4

    invoke-static {v1}, Lpc/q;->k(Lpc/e0;)Lpc/q;

    move-result-object v6

    invoke-virtual {v4, v6}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v4

    new-instance v6, Lfc/b;

    invoke-direct {v6, v0, v2, v1}, Lfc/b;-><init>(Lpc/e0;Lpc/e0;Lpc/e0;)V

    invoke-virtual {v4, v6}, Lpc/c$b;->f(Lpc/g;)Lpc/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lpc/c$b;->d()Lpc/c;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v3, v1

    const-string v0, "17.1.1"

    invoke-static {v5, v0}, Lye/h;->b(Ljava/lang/String;Ljava/lang/String;)Lpc/c;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v3, v1

    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
