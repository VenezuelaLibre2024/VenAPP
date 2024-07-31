.class public final Lcom/google/firebase/ktx/FirebaseCommonKtxRegistrar;
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


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lpc/c<",
            "*>;>;"
        }
    .end annotation

    const/4 v0, 0x4

    new-array v0, v0, [Lpc/c;

    const-class v1, Ldc/a;

    const-class v2, Lzk/h0;

    invoke-static {v1, v2}, Lpc/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lpc/e0;

    move-result-object v3

    invoke-static {v3}, Lpc/c;->e(Lpc/e0;)Lpc/c$b;

    move-result-object v3

    const-class v4, Ljava/util/concurrent/Executor;

    invoke-static {v1, v4}, Lpc/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lpc/e0;

    move-result-object v1

    invoke-static {v1}, Lpc/q;->k(Lpc/e0;)Lpc/q;

    move-result-object v1

    invoke-virtual {v3, v1}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v1

    sget-object v3, Lcom/google/firebase/ktx/FirebaseCommonKtxRegistrar$a;->a:Lcom/google/firebase/ktx/FirebaseCommonKtxRegistrar$a;

    invoke-virtual {v1, v3}, Lpc/c$b;->f(Lpc/g;)Lpc/c$b;

    move-result-object v1

    invoke-virtual {v1}, Lpc/c$b;->d()Lpc/c;

    move-result-object v1

    const-string v3, "builder(Qualified.qualif\u2026cher()\n    }\n    .build()"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x0

    aput-object v1, v0, v5

    const-class v1, Ldc/c;

    invoke-static {v1, v2}, Lpc/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lpc/e0;

    move-result-object v5

    invoke-static {v5}, Lpc/c;->e(Lpc/e0;)Lpc/c$b;

    move-result-object v5

    invoke-static {v1, v4}, Lpc/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lpc/e0;

    move-result-object v1

    invoke-static {v1}, Lpc/q;->k(Lpc/e0;)Lpc/q;

    move-result-object v1

    invoke-virtual {v5, v1}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v1

    sget-object v5, Lcom/google/firebase/ktx/FirebaseCommonKtxRegistrar$b;->a:Lcom/google/firebase/ktx/FirebaseCommonKtxRegistrar$b;

    invoke-virtual {v1, v5}, Lpc/c$b;->f(Lpc/g;)Lpc/c$b;

    move-result-object v1

    invoke-virtual {v1}, Lpc/c$b;->d()Lpc/c;

    move-result-object v1

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x1

    aput-object v1, v0, v5

    const-class v1, Ldc/b;

    invoke-static {v1, v2}, Lpc/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lpc/e0;

    move-result-object v5

    invoke-static {v5}, Lpc/c;->e(Lpc/e0;)Lpc/c$b;

    move-result-object v5

    invoke-static {v1, v4}, Lpc/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lpc/e0;

    move-result-object v1

    invoke-static {v1}, Lpc/q;->k(Lpc/e0;)Lpc/q;

    move-result-object v1

    invoke-virtual {v5, v1}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v1

    sget-object v5, Lcom/google/firebase/ktx/FirebaseCommonKtxRegistrar$c;->a:Lcom/google/firebase/ktx/FirebaseCommonKtxRegistrar$c;

    invoke-virtual {v1, v5}, Lpc/c$b;->f(Lpc/g;)Lpc/c$b;

    move-result-object v1

    invoke-virtual {v1}, Lpc/c$b;->d()Lpc/c;

    move-result-object v1

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x2

    aput-object v1, v0, v5

    const-class v1, Ldc/d;

    invoke-static {v1, v2}, Lpc/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lpc/e0;

    move-result-object v2

    invoke-static {v2}, Lpc/c;->e(Lpc/e0;)Lpc/c$b;

    move-result-object v2

    invoke-static {v1, v4}, Lpc/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lpc/e0;

    move-result-object v1

    invoke-static {v1}, Lpc/q;->k(Lpc/e0;)Lpc/q;

    move-result-object v1

    invoke-virtual {v2, v1}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v1

    sget-object v2, Lcom/google/firebase/ktx/FirebaseCommonKtxRegistrar$d;->a:Lcom/google/firebase/ktx/FirebaseCommonKtxRegistrar$d;

    invoke-virtual {v1, v2}, Lpc/c$b;->f(Lpc/g;)Lpc/c$b;

    move-result-object v1

    invoke-virtual {v1}, Lpc/c$b;->d()Lpc/c;

    move-result-object v1

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x3

    aput-object v1, v0, v2

    invoke-static {v0}, Ldk/p;->l([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
