.class public Lcom/google/firebase/remoteconfig/RemoteConfigRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-rc"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lpc/e0;Lpc/d;)Lcom/google/firebase/remoteconfig/c;
    .locals 0

    invoke-static {p0, p1}, Lcom/google/firebase/remoteconfig/RemoteConfigRegistrar;->lambda$getComponents$0(Lpc/e0;Lpc/d;)Lcom/google/firebase/remoteconfig/c;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic lambda$getComponents$0(Lpc/e0;Lpc/d;)Lcom/google/firebase/remoteconfig/c;
    .locals 8

    new-instance v7, Lcom/google/firebase/remoteconfig/c;

    const-class v0, Landroid/content/Context;

    invoke-interface {p1, v0}, Lpc/d;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/content/Context;

    invoke-interface {p1, p0}, Lpc/d;->e(Lpc/e0;)Ljava/lang/Object;

    move-result-object p0

    move-object v2, p0

    check-cast v2, Ljava/util/concurrent/ScheduledExecutorService;

    const-class p0, Lzb/g;

    invoke-interface {p1, p0}, Lpc/d;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Lzb/g;

    const-class p0, Lfe/f;

    invoke-interface {p1, p0}, Lpc/d;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Lfe/f;

    const-class p0, Lcom/google/firebase/abt/component/a;

    invoke-interface {p1, p0}, Lpc/d;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/firebase/abt/component/a;

    const-string v0, "frc"

    invoke-virtual {p0, v0}, Lcom/google/firebase/abt/component/a;->b(Ljava/lang/String;)Lac/c;

    move-result-object v5

    const-class p0, Lcc/a;

    invoke-interface {p1, p0}, Lpc/d;->f(Ljava/lang/Class;)Lee/b;

    move-result-object v6

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/google/firebase/remoteconfig/c;-><init>(Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;Lzb/g;Lfe/f;Lac/c;Lee/b;)V

    return-object v7
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

    const-class v0, Ldc/b;

    const-class v1, Ljava/util/concurrent/ScheduledExecutorService;

    invoke-static {v0, v1}, Lpc/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lpc/e0;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Lpc/c;

    const/4 v2, 0x1

    new-array v3, v2, [Ljava/lang/Class;

    const-class v4, Lbf/a;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const-class v4, Lcom/google/firebase/remoteconfig/c;

    invoke-static {v4, v3}, Lpc/c;->d(Ljava/lang/Class;[Ljava/lang/Class;)Lpc/c$b;

    move-result-object v3

    const-string v4, "fire-rc"

    invoke-virtual {v3, v4}, Lpc/c$b;->h(Ljava/lang/String;)Lpc/c$b;

    move-result-object v3

    const-class v6, Landroid/content/Context;

    invoke-static {v6}, Lpc/q;->j(Ljava/lang/Class;)Lpc/q;

    move-result-object v6

    invoke-virtual {v3, v6}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v3

    invoke-static {v0}, Lpc/q;->k(Lpc/e0;)Lpc/q;

    move-result-object v6

    invoke-virtual {v3, v6}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v3

    const-class v6, Lzb/g;

    invoke-static {v6}, Lpc/q;->j(Ljava/lang/Class;)Lpc/q;

    move-result-object v6

    invoke-virtual {v3, v6}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v3

    const-class v6, Lfe/f;

    invoke-static {v6}, Lpc/q;->j(Ljava/lang/Class;)Lpc/q;

    move-result-object v6

    invoke-virtual {v3, v6}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v3

    const-class v6, Lcom/google/firebase/abt/component/a;

    invoke-static {v6}, Lpc/q;->j(Ljava/lang/Class;)Lpc/q;

    move-result-object v6

    invoke-virtual {v3, v6}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v3

    const-class v6, Lcc/a;

    invoke-static {v6}, Lpc/q;->i(Ljava/lang/Class;)Lpc/q;

    move-result-object v6

    invoke-virtual {v3, v6}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v3

    new-instance v6, Lze/q;

    invoke-direct {v6, v0}, Lze/q;-><init>(Lpc/e0;)V

    invoke-virtual {v3, v6}, Lpc/c$b;->f(Lpc/g;)Lpc/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lpc/c$b;->e()Lpc/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lpc/c$b;->d()Lpc/c;

    move-result-object v0

    aput-object v0, v1, v5

    const-string v0, "21.6.0"

    invoke-static {v4, v0}, Lye/h;->b(Ljava/lang/String;Ljava/lang/String;)Lpc/c;

    move-result-object v0

    aput-object v0, v1, v2

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
