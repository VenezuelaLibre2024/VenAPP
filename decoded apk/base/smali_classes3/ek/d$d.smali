.class public Lek/d$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lek/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final a:Lek/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lek/d<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field private b:I

.field private c:I


# direct methods
.method public constructor <init>(Lek/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lek/d<",
            "TK;TV;>;)V"
        }
    .end annotation

    const-string v0, "map"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lek/d$d;->a:Lek/d;

    const/4 p1, -0x1

    iput p1, p0, Lek/d$d;->c:I

    invoke-virtual {p0}, Lek/d$d;->e()V

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lek/d$d;->b:I

    return v0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lek/d$d;->c:I

    return v0
.end method

.method public final d()Lek/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lek/d<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Lek/d$d;->a:Lek/d;

    return-object v0
.end method

.method public final e()V
    .locals 2

    :goto_0
    iget v0, p0, Lek/d$d;->b:I

    iget-object v1, p0, Lek/d$d;->a:Lek/d;

    invoke-static {v1}, Lek/d;->d(Lek/d;)I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Lek/d$d;->a:Lek/d;

    invoke-static {v0}, Lek/d;->e(Lek/d;)[I

    move-result-object v0

    iget v1, p0, Lek/d$d;->b:I

    aget v0, v0, v1

    if-gez v0, :cond_0

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lek/d$d;->b:I

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final f(I)V
    .locals 0

    iput p1, p0, Lek/d$d;->b:I

    return-void
.end method

.method public final g(I)V
    .locals 0

    iput p1, p0, Lek/d$d;->c:I

    return-void
.end method

.method public final hasNext()Z
    .locals 2

    iget v0, p0, Lek/d$d;->b:I

    iget-object v1, p0, Lek/d$d;->a:Lek/d;

    invoke-static {v1}, Lek/d;->d(Lek/d;)I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final remove()V
    .locals 3

    iget v0, p0, Lek/d$d;->c:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    iget-object v0, p0, Lek/d$d;->a:Lek/d;

    invoke-virtual {v0}, Lek/d;->l()V

    iget-object v0, p0, Lek/d$d;->a:Lek/d;

    iget v2, p0, Lek/d$d;->c:I

    invoke-static {v0, v2}, Lek/d;->g(Lek/d;I)V

    iput v1, p0, Lek/d$d;->c:I

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Call next() before removing element from the iterator."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
