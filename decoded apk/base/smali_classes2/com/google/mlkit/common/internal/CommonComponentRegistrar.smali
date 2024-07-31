.class public Lcom/google/mlkit/common/internal/CommonComponentRegistrar;
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


# virtual methods
.method public final getComponents()Ljava/util/List;
    .locals 12

    sget-object v0, Lcom/google/mlkit/common/sdkinternal/n;->b:Lpc/c;

    const-class v1, Luf/b;

    invoke-static {v1}, Lpc/c;->c(Ljava/lang/Class;)Lpc/c$b;

    move-result-object v1

    const-class v2, Lcom/google/mlkit/common/sdkinternal/i;

    invoke-static {v2}, Lpc/q;->j(Ljava/lang/Class;)Lpc/q;

    move-result-object v3

    invoke-virtual {v1, v3}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v1

    sget-object v3, Lrf/a;->a:Lrf/a;

    invoke-virtual {v1, v3}, Lpc/c$b;->f(Lpc/g;)Lpc/c$b;

    move-result-object v1

    invoke-virtual {v1}, Lpc/c$b;->d()Lpc/c;

    move-result-object v1

    const-class v3, Lcom/google/mlkit/common/sdkinternal/j;

    invoke-static {v3}, Lpc/c;->c(Ljava/lang/Class;)Lpc/c$b;

    move-result-object v4

    sget-object v5, Lrf/b;->a:Lrf/b;

    invoke-virtual {v4, v5}, Lpc/c$b;->f(Lpc/g;)Lpc/c$b;

    move-result-object v4

    invoke-virtual {v4}, Lpc/c$b;->d()Lpc/c;

    move-result-object v4

    const-class v5, Ltf/c;

    invoke-static {v5}, Lpc/c;->c(Ljava/lang/Class;)Lpc/c$b;

    move-result-object v5

    const-class v6, Ltf/c$a;

    invoke-static {v6}, Lpc/q;->n(Ljava/lang/Class;)Lpc/q;

    move-result-object v7

    invoke-virtual {v5, v7}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v5

    sget-object v7, Lrf/c;->a:Lrf/c;

    invoke-virtual {v5, v7}, Lpc/c$b;->f(Lpc/g;)Lpc/c$b;

    move-result-object v5

    invoke-virtual {v5}, Lpc/c$b;->d()Lpc/c;

    move-result-object v5

    const-class v7, Lcom/google/mlkit/common/sdkinternal/d;

    invoke-static {v7}, Lpc/c;->c(Ljava/lang/Class;)Lpc/c$b;

    move-result-object v7

    invoke-static {v3}, Lpc/q;->l(Ljava/lang/Class;)Lpc/q;

    move-result-object v3

    invoke-virtual {v7, v3}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v3

    sget-object v7, Lrf/d;->a:Lrf/d;

    invoke-virtual {v3, v7}, Lpc/c$b;->f(Lpc/g;)Lpc/c$b;

    move-result-object v3

    invoke-virtual {v3}, Lpc/c$b;->d()Lpc/c;

    move-result-object v7

    const-class v3, Lcom/google/mlkit/common/sdkinternal/a;

    invoke-static {v3}, Lpc/c;->c(Ljava/lang/Class;)Lpc/c$b;

    move-result-object v8

    sget-object v9, Lrf/e;->a:Lrf/e;

    invoke-virtual {v8, v9}, Lpc/c$b;->f(Lpc/g;)Lpc/c$b;

    move-result-object v8

    invoke-virtual {v8}, Lpc/c$b;->d()Lpc/c;

    move-result-object v8

    const-class v9, Lcom/google/mlkit/common/sdkinternal/b;

    invoke-static {v9}, Lpc/c;->c(Ljava/lang/Class;)Lpc/c$b;

    move-result-object v9

    invoke-static {v3}, Lpc/q;->j(Ljava/lang/Class;)Lpc/q;

    move-result-object v3

    invoke-virtual {v9, v3}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v3

    sget-object v9, Lrf/f;->a:Lrf/f;

    invoke-virtual {v3, v9}, Lpc/c$b;->f(Lpc/g;)Lpc/c$b;

    move-result-object v3

    invoke-virtual {v3}, Lpc/c$b;->d()Lpc/c;

    move-result-object v9

    const-class v3, Lsf/a;

    invoke-static {v3}, Lpc/c;->c(Ljava/lang/Class;)Lpc/c$b;

    move-result-object v10

    invoke-static {v2}, Lpc/q;->j(Ljava/lang/Class;)Lpc/q;

    move-result-object v2

    invoke-virtual {v10, v2}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v2

    sget-object v10, Lrf/g;->a:Lrf/g;

    invoke-virtual {v2, v10}, Lpc/c$b;->f(Lpc/g;)Lpc/c$b;

    move-result-object v2

    invoke-virtual {v2}, Lpc/c$b;->d()Lpc/c;

    move-result-object v10

    invoke-static {v6}, Lpc/c;->m(Ljava/lang/Class;)Lpc/c$b;

    move-result-object v2

    invoke-static {v3}, Lpc/q;->l(Ljava/lang/Class;)Lpc/q;

    move-result-object v3

    invoke-virtual {v2, v3}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v2

    sget-object v3, Lrf/h;->a:Lrf/h;

    invoke-virtual {v2, v3}, Lpc/c$b;->f(Lpc/g;)Lpc/c$b;

    move-result-object v2

    invoke-virtual {v2}, Lpc/c$b;->d()Lpc/c;

    move-result-object v11

    move-object v2, v4

    move-object v3, v5

    move-object v4, v7

    move-object v5, v8

    move-object v6, v9

    move-object v7, v10

    move-object v8, v11

    invoke-static/range {v0 .. v8}, Lcom/google/android/gms/internal/mlkit_common/zzar;->zzi(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_common/zzar;

    move-result-object v0

    return-object v0
.end method
