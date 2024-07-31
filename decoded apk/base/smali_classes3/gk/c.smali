.class public final Lgk/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgk/f;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgk/c$a;
    }
.end annotation


# instance fields
.field private final a:Lgk/f;

.field private final b:Lgk/f$b;


# direct methods
.method public constructor <init>(Lgk/f;Lgk/f$b;)V
    .locals 1

    const-string v0, "left"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "element"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgk/c;->a:Lgk/f;

    iput-object p2, p0, Lgk/c;->b:Lgk/f$b;

    return-void
.end method

.method private final c(Lgk/f$b;)Z
    .locals 1

    invoke-interface {p1}, Lgk/f$b;->getKey()Lgk/f$c;

    move-result-object v0

    invoke-virtual {p0, v0}, Lgk/c;->b(Lgk/f$c;)Lgk/f$b;

    move-result-object v0

    invoke-static {v0, p1}, Lkotlin/jvm/internal/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method private final d(Lgk/c;)Z
    .locals 1

    :goto_0
    iget-object v0, p1, Lgk/c;->b:Lgk/f$b;

    invoke-direct {p0, v0}, Lgk/c;->c(Lgk/f$b;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object p1, p1, Lgk/c;->a:Lgk/f;

    instance-of v0, p1, Lgk/c;

    if-eqz v0, :cond_1

    check-cast p1, Lgk/c;

    goto :goto_0

    :cond_1
    const-string v0, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lgk/f$b;

    invoke-direct {p0, p1}, Lgk/c;->c(Lgk/f$b;)Z

    move-result p1

    return p1
.end method

.method private final h()I
    .locals 3

    const/4 v0, 0x2

    move-object v1, p0

    :goto_0
    iget-object v1, v1, Lgk/c;->a:Lgk/f;

    instance-of v2, v1, Lgk/c;

    if-eqz v2, :cond_0

    check-cast v1, Lgk/c;

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    :goto_1
    if-nez v1, :cond_1

    return v0

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method private final writeReplace()Ljava/lang/Object;
    .locals 5

    invoke-direct {p0}, Lgk/c;->h()I

    move-result v0

    new-array v1, v0, [Lgk/f;

    new-instance v2, Lkotlin/jvm/internal/w;

    invoke-direct {v2}, Lkotlin/jvm/internal/w;-><init>()V

    sget-object v3, Lck/v;->a:Lck/v;

    new-instance v4, Lgk/c$c;

    invoke-direct {v4, v1, v2}, Lgk/c$c;-><init>([Lgk/f;Lkotlin/jvm/internal/w;)V

    invoke-virtual {p0, v3, v4}, Lgk/c;->z0(Ljava/lang/Object;Lok/p;)Ljava/lang/Object;

    iget v2, v2, Lkotlin/jvm/internal/w;->a:I

    if-ne v2, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    new-instance v0, Lgk/c$a;

    invoke-direct {v0, v1}, Lgk/c$a;-><init>([Lgk/f;)V

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Check failed."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public Q(Lgk/f$c;)Lgk/f;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgk/f$c<",
            "*>;)",
            "Lgk/f;"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lgk/c;->b:Lgk/f$b;

    invoke-interface {v0, p1}, Lgk/f$b;->b(Lgk/f$c;)Lgk/f$b;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lgk/c;->a:Lgk/f;

    return-object p1

    :cond_0
    iget-object v0, p0, Lgk/c;->a:Lgk/f;

    invoke-interface {v0, p1}, Lgk/f;->Q(Lgk/f$c;)Lgk/f;

    move-result-object p1

    iget-object v0, p0, Lgk/c;->a:Lgk/f;

    if-ne p1, v0, :cond_1

    move-object p1, p0

    goto :goto_0

    :cond_1
    sget-object v0, Lgk/g;->a:Lgk/g;

    if-ne p1, v0, :cond_2

    iget-object p1, p0, Lgk/c;->b:Lgk/f$b;

    goto :goto_0

    :cond_2
    new-instance v0, Lgk/c;

    iget-object v1, p0, Lgk/c;->b:Lgk/f$b;

    invoke-direct {v0, p1, v1}, Lgk/c;-><init>(Lgk/f;Lgk/f$b;)V

    move-object p1, v0

    :goto_0
    return-object p1
.end method

.method public U(Lgk/f;)Lgk/f;
    .locals 0

    invoke-static {p0, p1}, Lgk/f$a;->a(Lgk/f;Lgk/f;)Lgk/f;

    move-result-object p1

    return-object p1
.end method

.method public b(Lgk/f$c;)Lgk/f$b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Lgk/f$b;",
            ">(",
            "Lgk/f$c<",
            "TE;>;)TE;"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    :goto_0
    iget-object v1, v0, Lgk/c;->b:Lgk/f$b;

    invoke-interface {v1, p1}, Lgk/f$b;->b(Lgk/f$c;)Lgk/f$b;

    move-result-object v1

    if-eqz v1, :cond_0

    return-object v1

    :cond_0
    iget-object v0, v0, Lgk/c;->a:Lgk/f;

    instance-of v1, v0, Lgk/c;

    if-eqz v1, :cond_1

    check-cast v0, Lgk/c;

    goto :goto_0

    :cond_1
    invoke-interface {v0, p1}, Lgk/f;->b(Lgk/f$c;)Lgk/f$b;

    move-result-object p1

    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-eq p0, p1, :cond_1

    instance-of v0, p1, Lgk/c;

    if-eqz v0, :cond_0

    check-cast p1, Lgk/c;

    invoke-direct {p1}, Lgk/c;->h()I

    move-result v0

    invoke-direct {p0}, Lgk/c;->h()I

    move-result v1

    if-ne v0, v1, :cond_0

    invoke-direct {p1, p0}, Lgk/c;->d(Lgk/c;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lgk/c;->a:Lgk/f;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iget-object v1, p0, Lgk/c;->b:Lgk/f$b;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x5b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ""

    sget-object v2, Lgk/c$b;->a:Lgk/c$b;

    invoke-virtual {p0, v1, v2}, Lgk/c;->z0(Ljava/lang/Object;Lok/p;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public z0(Ljava/lang/Object;Lok/p;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(TR;",
            "Lok/p<",
            "-TR;-",
            "Lgk/f$b;",
            "+TR;>;)TR;"
        }
    .end annotation

    const-string v0, "operation"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lgk/c;->a:Lgk/f;

    invoke-interface {v0, p1, p2}, Lgk/f;->z0(Ljava/lang/Object;Lok/p;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lgk/c;->b:Lgk/f$b;

    invoke-interface {p2, p1, v0}, Lok/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
