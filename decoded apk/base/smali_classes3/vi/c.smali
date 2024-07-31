.class public final Lvi/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvi/c$c;,
        Lvi/c$b;
    }
.end annotation


# static fields
.field public static final k:Lvi/c;


# instance fields
.field private final a:Lvi/t;

.field private final b:Ljava/util/concurrent/Executor;

.field private final c:Ljava/lang/String;

.field private final d:Lvi/b;

.field private final e:Ljava/lang/String;

.field private final f:[[Ljava/lang/Object;

.field private final g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lvi/k$a;",
            ">;"
        }
    .end annotation
.end field

.field private final h:Ljava/lang/Boolean;

.field private final i:Ljava/lang/Integer;

.field private final j:Ljava/lang/Integer;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lvi/c$b;

    invoke-direct {v0}, Lvi/c$b;-><init>()V

    const/4 v1, 0x2

    new-array v1, v1, [I

    fill-array-data v1, :array_0

    const-class v2, Ljava/lang/Object;

    invoke-static {v2, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [[Ljava/lang/Object;

    iput-object v1, v0, Lvi/c$b;->f:[[Ljava/lang/Object;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    iput-object v1, v0, Lvi/c$b;->g:Ljava/util/List;

    invoke-static {v0}, Lvi/c$b;->a(Lvi/c$b;)Lvi/c;

    move-result-object v0

    sput-object v0, Lvi/c;->k:Lvi/c;

    return-void

    :array_0
    .array-data 4
        0x0
        0x2
    .end array-data
.end method

.method private constructor <init>(Lvi/c$b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lvi/c$b;->a:Lvi/t;

    iput-object v0, p0, Lvi/c;->a:Lvi/t;

    iget-object v0, p1, Lvi/c$b;->b:Ljava/util/concurrent/Executor;

    iput-object v0, p0, Lvi/c;->b:Ljava/util/concurrent/Executor;

    iget-object v0, p1, Lvi/c$b;->c:Ljava/lang/String;

    iput-object v0, p0, Lvi/c;->c:Ljava/lang/String;

    iget-object v0, p1, Lvi/c$b;->d:Lvi/b;

    iput-object v0, p0, Lvi/c;->d:Lvi/b;

    iget-object v0, p1, Lvi/c$b;->e:Ljava/lang/String;

    iput-object v0, p0, Lvi/c;->e:Ljava/lang/String;

    iget-object v0, p1, Lvi/c$b;->f:[[Ljava/lang/Object;

    iput-object v0, p0, Lvi/c;->f:[[Ljava/lang/Object;

    iget-object v0, p1, Lvi/c$b;->g:Ljava/util/List;

    iput-object v0, p0, Lvi/c;->g:Ljava/util/List;

    iget-object v0, p1, Lvi/c$b;->h:Ljava/lang/Boolean;

    iput-object v0, p0, Lvi/c;->h:Ljava/lang/Boolean;

    iget-object v0, p1, Lvi/c$b;->i:Ljava/lang/Integer;

    iput-object v0, p0, Lvi/c;->i:Ljava/lang/Integer;

    iget-object p1, p1, Lvi/c$b;->j:Ljava/lang/Integer;

    iput-object p1, p0, Lvi/c;->j:Ljava/lang/Integer;

    return-void
.end method

.method synthetic constructor <init>(Lvi/c$b;Lvi/c$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lvi/c;-><init>(Lvi/c$b;)V

    return-void
.end method

.method private static k(Lvi/c;)Lvi/c$b;
    .locals 2

    new-instance v0, Lvi/c$b;

    invoke-direct {v0}, Lvi/c$b;-><init>()V

    iget-object v1, p0, Lvi/c;->a:Lvi/t;

    iput-object v1, v0, Lvi/c$b;->a:Lvi/t;

    iget-object v1, p0, Lvi/c;->b:Ljava/util/concurrent/Executor;

    iput-object v1, v0, Lvi/c$b;->b:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Lvi/c;->c:Ljava/lang/String;

    iput-object v1, v0, Lvi/c$b;->c:Ljava/lang/String;

    iget-object v1, p0, Lvi/c;->d:Lvi/b;

    iput-object v1, v0, Lvi/c$b;->d:Lvi/b;

    iget-object v1, p0, Lvi/c;->e:Ljava/lang/String;

    iput-object v1, v0, Lvi/c$b;->e:Ljava/lang/String;

    iget-object v1, p0, Lvi/c;->f:[[Ljava/lang/Object;

    iput-object v1, v0, Lvi/c$b;->f:[[Ljava/lang/Object;

    iget-object v1, p0, Lvi/c;->g:Ljava/util/List;

    iput-object v1, v0, Lvi/c$b;->g:Ljava/util/List;

    iget-object v1, p0, Lvi/c;->h:Ljava/lang/Boolean;

    iput-object v1, v0, Lvi/c$b;->h:Ljava/lang/Boolean;

    iget-object v1, p0, Lvi/c;->i:Ljava/lang/Integer;

    iput-object v1, v0, Lvi/c$b;->i:Ljava/lang/Integer;

    iget-object p0, p0, Lvi/c;->j:Ljava/lang/Integer;

    iput-object p0, v0, Lvi/c$b;->j:Ljava/lang/Integer;

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lvi/c;->c:Ljava/lang/String;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lvi/c;->e:Ljava/lang/String;

    return-object v0
.end method

.method public c()Lvi/b;
    .locals 1

    iget-object v0, p0, Lvi/c;->d:Lvi/b;

    return-object v0
.end method

.method public d()Lvi/t;
    .locals 1

    iget-object v0, p0, Lvi/c;->a:Lvi/t;

    return-object v0
.end method

.method public e()Ljava/util/concurrent/Executor;
    .locals 1

    iget-object v0, p0, Lvi/c;->b:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public f()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lvi/c;->i:Ljava/lang/Integer;

    return-object v0
.end method

.method public g()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lvi/c;->j:Ljava/lang/Integer;

    return-object v0
.end method

.method public h(Lvi/c$c;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lvi/c$c<",
            "TT;>;)TT;"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, Lvi/c;->f:[[Ljava/lang/Object;

    array-length v3, v2

    if-ge v1, v3, :cond_1

    aget-object v2, v2, v1

    aget-object v2, v2, v0

    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object p1, p0, Lvi/c;->f:[[Ljava/lang/Object;

    aget-object p1, p1, v1

    const/4 v0, 0x1

    aget-object p1, p1, v0

    return-object p1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    invoke-static {p1}, Lvi/c$c;->a(Lvi/c$c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public i()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lvi/k$a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lvi/c;->g:Ljava/util/List;

    return-object v0
.end method

.method public j()Z
    .locals 2

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iget-object v1, p0, Lvi/c;->h:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public l(Lvi/t;)Lvi/c;
    .locals 1

    invoke-static {p0}, Lvi/c;->k(Lvi/c;)Lvi/c$b;

    move-result-object v0

    iput-object p1, v0, Lvi/c$b;->a:Lvi/t;

    invoke-static {v0}, Lvi/c$b;->a(Lvi/c$b;)Lvi/c;

    move-result-object p1

    return-object p1
.end method

.method public m(JLjava/util/concurrent/TimeUnit;)Lvi/c;
    .locals 0

    invoke-static {p1, p2, p3}, Lvi/t;->b(JLjava/util/concurrent/TimeUnit;)Lvi/t;

    move-result-object p1

    invoke-virtual {p0, p1}, Lvi/c;->l(Lvi/t;)Lvi/c;

    move-result-object p1

    return-object p1
.end method

.method public n(Ljava/util/concurrent/Executor;)Lvi/c;
    .locals 1

    invoke-static {p0}, Lvi/c;->k(Lvi/c;)Lvi/c$b;

    move-result-object v0

    iput-object p1, v0, Lvi/c$b;->b:Ljava/util/concurrent/Executor;

    invoke-static {v0}, Lvi/c$b;->a(Lvi/c$b;)Lvi/c;

    move-result-object p1

    return-object p1
.end method

.method public o(I)Lvi/c;
    .locals 2

    if-ltz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "invalid maxsize %s"

    invoke-static {v0, v1, p1}, Leb/o;->h(ZLjava/lang/String;I)V

    invoke-static {p0}, Lvi/c;->k(Lvi/c;)Lvi/c$b;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v0, Lvi/c$b;->i:Ljava/lang/Integer;

    invoke-static {v0}, Lvi/c$b;->a(Lvi/c$b;)Lvi/c;

    move-result-object p1

    return-object p1
.end method

.method public p(I)Lvi/c;
    .locals 2

    if-ltz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "invalid maxsize %s"

    invoke-static {v0, v1, p1}, Leb/o;->h(ZLjava/lang/String;I)V

    invoke-static {p0}, Lvi/c;->k(Lvi/c;)Lvi/c$b;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v0, Lvi/c$b;->j:Ljava/lang/Integer;

    invoke-static {v0}, Lvi/c$b;->a(Lvi/c$b;)Lvi/c;

    move-result-object p1

    return-object p1
.end method

.method public q(Lvi/c$c;Ljava/lang/Object;)Lvi/c;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lvi/c$c<",
            "TT;>;TT;)",
            "Lvi/c;"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "value"

    invoke-static {p2, v0}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p0}, Lvi/c;->k(Lvi/c;)Lvi/c$b;

    move-result-object v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    iget-object v3, p0, Lvi/c;->f:[[Ljava/lang/Object;

    array-length v4, v3

    const/4 v5, -0x1

    if-ge v2, v4, :cond_1

    aget-object v3, v3, v2

    aget-object v3, v3, v1

    invoke-virtual {p1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    move v2, v5

    :goto_1
    iget-object v3, p0, Lvi/c;->f:[[Ljava/lang/Object;

    array-length v3, v3

    const/4 v4, 0x1

    if-ne v2, v5, :cond_2

    move v6, v4

    goto :goto_2

    :cond_2
    move v6, v1

    :goto_2
    add-int/2addr v3, v6

    const/4 v6, 0x2

    new-array v7, v6, [I

    aput v6, v7, v4

    aput v3, v7, v1

    const-class v3, Ljava/lang/Object;

    invoke-static {v3, v7}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [[Ljava/lang/Object;

    iput-object v3, v0, Lvi/c$b;->f:[[Ljava/lang/Object;

    iget-object v7, p0, Lvi/c;->f:[[Ljava/lang/Object;

    array-length v8, v7

    invoke-static {v7, v1, v3, v1, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    if-ne v2, v5, :cond_3

    iget-object v2, v0, Lvi/c$b;->f:[[Ljava/lang/Object;

    iget-object v3, p0, Lvi/c;->f:[[Ljava/lang/Object;

    array-length v3, v3

    new-array v5, v6, [Ljava/lang/Object;

    aput-object p1, v5, v1

    aput-object p2, v5, v4

    aput-object v5, v2, v3

    goto :goto_3

    :cond_3
    iget-object v3, v0, Lvi/c$b;->f:[[Ljava/lang/Object;

    new-array v5, v6, [Ljava/lang/Object;

    aput-object p1, v5, v1

    aput-object p2, v5, v4

    aput-object v5, v3, v2

    :goto_3
    invoke-static {v0}, Lvi/c$b;->a(Lvi/c$b;)Lvi/c;

    move-result-object p1

    return-object p1
.end method

.method public r(Lvi/k$a;)Lvi/c;
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lvi/c;->g:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v1, p0, Lvi/c;->g:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {p0}, Lvi/c;->k(Lvi/c;)Lvi/c$b;

    move-result-object p1

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p1, Lvi/c$b;->g:Ljava/util/List;

    invoke-static {p1}, Lvi/c$b;->a(Lvi/c$b;)Lvi/c;

    move-result-object p1

    return-object p1
.end method

.method public s()Lvi/c;
    .locals 2

    invoke-static {p0}, Lvi/c;->k(Lvi/c;)Lvi/c$b;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lvi/c$b;->h:Ljava/lang/Boolean;

    invoke-static {v0}, Lvi/c$b;->a(Lvi/c$b;)Lvi/c;

    move-result-object v0

    return-object v0
.end method

.method public t()Lvi/c;
    .locals 2

    invoke-static {p0}, Lvi/c;->k(Lvi/c;)Lvi/c$b;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lvi/c$b;->h:Ljava/lang/Boolean;

    invoke-static {v0}, Lvi/c$b;->a(Lvi/c$b;)Lvi/c;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Leb/i;->c(Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    const-string v1, "deadline"

    iget-object v2, p0, Lvi/c;->a:Lvi/t;

    invoke-virtual {v0, v1, v2}, Leb/i$b;->d(Ljava/lang/String;Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    const-string v1, "authority"

    iget-object v2, p0, Lvi/c;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Leb/i$b;->d(Ljava/lang/String;Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    const-string v1, "callCredentials"

    iget-object v2, p0, Lvi/c;->d:Lvi/b;

    invoke-virtual {v0, v1, v2}, Leb/i$b;->d(Ljava/lang/String;Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    iget-object v1, p0, Lvi/c;->b:Ljava/util/concurrent/Executor;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-string v2, "executor"

    invoke-virtual {v0, v2, v1}, Leb/i$b;->d(Ljava/lang/String;Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    const-string v1, "compressorName"

    iget-object v2, p0, Lvi/c;->e:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Leb/i$b;->d(Ljava/lang/String;Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    iget-object v1, p0, Lvi/c;->f:[[Ljava/lang/Object;

    invoke-static {v1}, Ljava/util/Arrays;->deepToString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "customOptions"

    invoke-virtual {v0, v2, v1}, Leb/i$b;->d(Ljava/lang/String;Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    const-string v1, "waitForReady"

    invoke-virtual {p0}, Lvi/c;->j()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Leb/i$b;->e(Ljava/lang/String;Z)Leb/i$b;

    move-result-object v0

    const-string v1, "maxInboundMessageSize"

    iget-object v2, p0, Lvi/c;->i:Ljava/lang/Integer;

    invoke-virtual {v0, v1, v2}, Leb/i$b;->d(Ljava/lang/String;Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    const-string v1, "maxOutboundMessageSize"

    iget-object v2, p0, Lvi/c;->j:Ljava/lang/Integer;

    invoke-virtual {v0, v1, v2}, Leb/i$b;->d(Ljava/lang/String;Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    const-string v1, "streamTracerFactories"

    iget-object v2, p0, Lvi/c;->g:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Leb/i$b;->d(Ljava/lang/String;Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    invoke-virtual {v0}, Leb/i$b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
