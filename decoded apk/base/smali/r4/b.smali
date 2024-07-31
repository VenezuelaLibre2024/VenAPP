.class public final Lr4/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr4/b$a;
    }
.end annotation


# static fields
.field public static final m:Lr4/b$a;

.field private static final n:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lr4/a;

.field private final b:Lr4/a;

.field private final c:Lr4/a;

.field private final d:Lr4/a;

.field private final e:Lr4/a;

.field private final f:Lr4/a;

.field private final g:Lr4/a;

.field private final h:Lr4/a;

.field private final i:Lr4/a;

.field private final j:Lr4/a;

.field private final k:Lr4/a;

.field private final l:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lr4/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lr4/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lr4/b$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lr4/b;->m:Lr4/b$a;

    const/4 v0, 0x7

    new-array v0, v0, [Lck/m;

    const-string v1, "embedding.weight"

    const-string v2, "embed.weight"

    invoke-static {v1, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "dense1.weight"

    const-string v2, "fc1.weight"

    invoke-static {v1, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "dense2.weight"

    const-string v2, "fc2.weight"

    invoke-static {v1, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "dense3.weight"

    const-string v2, "fc3.weight"

    invoke-static {v1, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "dense1.bias"

    const-string v2, "fc1.bias"

    invoke-static {v1, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "dense2.bias"

    const-string v2, "fc2.bias"

    invoke-static {v1, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "dense3.bias"

    const-string v2, "fc3.bias"

    invoke-static {v1, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/4 v2, 0x6

    aput-object v1, v0, v2

    invoke-static {v0}, Ldk/h0;->j([Lck/m;)Ljava/util/HashMap;

    move-result-object v0

    sput-object v0, Lr4/b;->n:Ljava/util/Map;

    return-void
.end method

.method private constructor <init>(Ljava/util/Map;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lr4/a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "embed.weight"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "Required value was null."

    if-eqz v0, :cond_d

    check-cast v0, Lr4/a;

    iput-object v0, p0, Lr4/b;->a:Lr4/a;

    sget-object v0, Lr4/i;->a:Lr4/i;

    const-string v0, "convs.0.weight"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_c

    check-cast v0, Lr4/a;

    invoke-static {v0}, Lr4/i;->l(Lr4/a;)Lr4/a;

    move-result-object v0

    iput-object v0, p0, Lr4/b;->b:Lr4/a;

    const-string v0, "convs.1.weight"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_b

    check-cast v0, Lr4/a;

    invoke-static {v0}, Lr4/i;->l(Lr4/a;)Lr4/a;

    move-result-object v0

    iput-object v0, p0, Lr4/b;->c:Lr4/a;

    const-string v0, "convs.2.weight"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_a

    check-cast v0, Lr4/a;

    invoke-static {v0}, Lr4/i;->l(Lr4/a;)Lr4/a;

    move-result-object v0

    iput-object v0, p0, Lr4/b;->d:Lr4/a;

    const-string v0, "convs.0.bias"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_9

    check-cast v0, Lr4/a;

    iput-object v0, p0, Lr4/b;->e:Lr4/a;

    const-string v0, "convs.1.bias"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_8

    check-cast v0, Lr4/a;

    iput-object v0, p0, Lr4/b;->f:Lr4/a;

    const-string v0, "convs.2.bias"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_7

    check-cast v0, Lr4/a;

    iput-object v0, p0, Lr4/b;->g:Lr4/a;

    const-string v0, "fc1.weight"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_6

    check-cast v0, Lr4/a;

    invoke-static {v0}, Lr4/i;->k(Lr4/a;)Lr4/a;

    move-result-object v0

    iput-object v0, p0, Lr4/b;->h:Lr4/a;

    const-string v0, "fc2.weight"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_5

    check-cast v0, Lr4/a;

    invoke-static {v0}, Lr4/i;->k(Lr4/a;)Lr4/a;

    move-result-object v0

    iput-object v0, p0, Lr4/b;->i:Lr4/a;

    const-string v0, "fc1.bias"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_4

    check-cast v0, Lr4/a;

    iput-object v0, p0, Lr4/b;->j:Lr4/a;

    const-string v0, "fc2.bias"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_3

    check-cast v0, Lr4/a;

    iput-object v0, p0, Lr4/b;->k:Lr4/a;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lr4/b;->l:Ljava/util/Map;

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    sget-object v1, Lr4/f$a;->MTML_INTEGRITY_DETECT:Lr4/f$a;

    invoke-virtual {v1}, Lr4/f$a;->h()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lr4/f$a;->MTML_APP_EVENT_PREDICTION:Lr4/f$a;

    invoke-virtual {v1}, Lr4/f$a;->h()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Ldk/o0;->i([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, ".weight"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v3, ".bias"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lr4/a;

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lr4/a;

    if-eqz v3, :cond_1

    invoke-static {v3}, Lr4/i;->k(Lr4/a;)Lr4/a;

    move-result-object v3

    iget-object v5, p0, Lr4/b;->l:Ljava/util/Map;

    invoke-interface {v5, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    if-eqz v4, :cond_0

    iget-object v2, p0, Lr4/b;->l:Ljava/util/Map;

    invoke-interface {v2, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_d
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public synthetic constructor <init>(Ljava/util/Map;Lkotlin/jvm/internal/g;)V
    .locals 0

    invoke-direct {p0, p1}, Lr4/b;-><init>(Ljava/util/Map;)V

    return-void
.end method

.method public static final synthetic a()Ljava/util/Map;
    .locals 3

    const-class v0, Lr4/b;

    invoke-static {v0}, La5/a;->d(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return-object v2

    :cond_0
    :try_start_0
    sget-object v0, Lr4/b;->n:Ljava/util/Map;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    move-exception v1

    invoke-static {v1, v0}, La5/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-object v2
.end method


# virtual methods
.method public final b(Lr4/a;[Ljava/lang/String;Ljava/lang/String;)Lr4/a;
    .locals 7

    invoke-static {p0}, La5/a;->d(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    :try_start_0
    const-string v0, "dense"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "texts"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "task"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lr4/i;->a:Lr4/i;

    iget-object v0, p0, Lr4/b;->a:Lr4/a;

    const/16 v2, 0x80

    invoke-static {p2, v2, v0}, Lr4/i;->e([Ljava/lang/String;ILr4/a;)Lr4/a;

    move-result-object p2

    iget-object v0, p0, Lr4/b;->b:Lr4/a;

    invoke-static {p2, v0}, Lr4/i;->c(Lr4/a;Lr4/a;)Lr4/a;

    move-result-object p2

    iget-object v0, p0, Lr4/b;->e:Lr4/a;

    invoke-static {p2, v0}, Lr4/i;->a(Lr4/a;Lr4/a;)V

    invoke-static {p2}, Lr4/i;->i(Lr4/a;)V

    iget-object v0, p0, Lr4/b;->c:Lr4/a;

    invoke-static {p2, v0}, Lr4/i;->c(Lr4/a;Lr4/a;)Lr4/a;

    move-result-object v0

    iget-object v2, p0, Lr4/b;->f:Lr4/a;

    invoke-static {v0, v2}, Lr4/i;->a(Lr4/a;Lr4/a;)V

    invoke-static {v0}, Lr4/i;->i(Lr4/a;)V

    const/4 v2, 0x2

    invoke-static {v0, v2}, Lr4/i;->g(Lr4/a;I)Lr4/a;

    move-result-object v0

    iget-object v3, p0, Lr4/b;->d:Lr4/a;

    invoke-static {v0, v3}, Lr4/i;->c(Lr4/a;Lr4/a;)Lr4/a;

    move-result-object v3

    iget-object v4, p0, Lr4/b;->g:Lr4/a;

    invoke-static {v3, v4}, Lr4/i;->a(Lr4/a;Lr4/a;)V

    invoke-static {v3}, Lr4/i;->i(Lr4/a;)V

    const/4 v4, 0x1

    invoke-virtual {p2, v4}, Lr4/a;->b(I)I

    move-result v5

    invoke-static {p2, v5}, Lr4/i;->g(Lr4/a;I)Lr4/a;

    move-result-object p2

    invoke-virtual {v0, v4}, Lr4/a;->b(I)I

    move-result v5

    invoke-static {v0, v5}, Lr4/i;->g(Lr4/a;I)Lr4/a;

    move-result-object v0

    invoke-virtual {v3, v4}, Lr4/a;->b(I)I

    move-result v5

    invoke-static {v3, v5}, Lr4/i;->g(Lr4/a;I)Lr4/a;

    move-result-object v3

    invoke-static {p2, v4}, Lr4/i;->f(Lr4/a;I)V

    invoke-static {v0, v4}, Lr4/i;->f(Lr4/a;I)V

    invoke-static {v3, v4}, Lr4/i;->f(Lr4/a;I)V

    const/4 v5, 0x4

    new-array v5, v5, [Lr4/a;

    const/4 v6, 0x0

    aput-object p2, v5, v6

    aput-object v0, v5, v4

    aput-object v3, v5, v2

    const/4 p2, 0x3

    aput-object p1, v5, p2

    invoke-static {v5}, Lr4/i;->b([Lr4/a;)Lr4/a;

    move-result-object p1

    iget-object p2, p0, Lr4/b;->h:Lr4/a;

    iget-object v0, p0, Lr4/b;->j:Lr4/a;

    invoke-static {p1, p2, v0}, Lr4/i;->d(Lr4/a;Lr4/a;Lr4/a;)Lr4/a;

    move-result-object p1

    invoke-static {p1}, Lr4/i;->i(Lr4/a;)V

    iget-object p2, p0, Lr4/b;->i:Lr4/a;

    iget-object v0, p0, Lr4/b;->k:Lr4/a;

    invoke-static {p1, p2, v0}, Lr4/i;->d(Lr4/a;Lr4/a;Lr4/a;)Lr4/a;

    move-result-object p1

    invoke-static {p1}, Lr4/i;->i(Lr4/a;)V

    iget-object p2, p0, Lr4/b;->l:Ljava/util/Map;

    const-string v0, ".weight"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lr4/a;

    iget-object v0, p0, Lr4/b;->l:Ljava/util/Map;

    const-string v2, ".bias"

    invoke-static {p3, v2}, Lkotlin/jvm/internal/n;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-interface {v0, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lr4/a;

    if-eqz p2, :cond_2

    if-nez p3, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {p1, p2, p3}, Lr4/i;->d(Lr4/a;Lr4/a;Lr4/a;)Lr4/a;

    move-result-object p1

    invoke-static {p1}, Lr4/i;->j(Lr4/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :cond_2
    :goto_0
    return-object v1

    :catchall_0
    move-exception p1

    invoke-static {p1, p0}, La5/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-object v1
.end method
