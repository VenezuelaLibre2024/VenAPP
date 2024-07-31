.class public final Lg8/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg8/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg8/g$b;
    }
.end annotation


# instance fields
.field private final a:Lg8/c;

.field private final b:Lg8/n;

.field private final c:Ljava/util/Deque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Deque<",
            "Lg8/o;",
            ">;"
        }
    .end annotation
.end field

.field private d:I

.field private e:Z


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lg8/c;

    invoke-direct {v0}, Lg8/c;-><init>()V

    iput-object v0, p0, Lg8/g;->a:Lg8/c;

    new-instance v0, Lg8/n;

    invoke-direct {v0}, Lg8/n;-><init>()V

    iput-object v0, p0, Lg8/g;->b:Lg8/n;

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Lg8/g;->c:Ljava/util/Deque;

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    const/4 v2, 0x2

    if-ge v1, v2, :cond_0

    iget-object v2, p0, Lg8/g;->c:Ljava/util/Deque;

    new-instance v3, Lg8/g$a;

    invoke-direct {v3, p0}, Lg8/g$a;-><init>(Lg8/g;)V

    invoke-interface {v2, v3}, Ljava/util/Deque;->addFirst(Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iput v0, p0, Lg8/g;->d:I

    return-void
.end method

.method static synthetic e(Lg8/g;Lg8/o;)V
    .locals 0

    invoke-direct {p0, p1}, Lg8/g;->i(Lg8/o;)V

    return-void
.end method

.method private i(Lg8/o;)V
    .locals 3

    iget-object v0, p0, Lg8/g;->c:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->size()I

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-ge v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lt8/a;->g(Z)V

    iget-object v0, p0, Lg8/g;->c:Ljava/util/Deque;

    invoke-interface {v0, p1}, Ljava/util/Deque;->contains(Ljava/lang/Object;)Z

    move-result v0

    xor-int/2addr v0, v2

    invoke-static {v0}, Lt8/a;->a(Z)V

    invoke-virtual {p1}, Lg8/o;->n()V

    iget-object v0, p0, Lg8/g;->c:Ljava/util/Deque;

    invoke-interface {v0, p1}, Ljava/util/Deque;->addFirst(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a(J)V
    .locals 0

    return-void
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lg8/g;->g()Lg8/o;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lg8/n;

    invoke-virtual {p0, p1}, Lg8/g;->h(Lg8/n;)V

    return-void
.end method

.method public bridge synthetic d()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lg8/g;->f()Lg8/n;

    move-result-object v0

    return-object v0
.end method

.method public f()Lg8/n;
    .locals 2

    iget-boolean v0, p0, Lg8/g;->e:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-static {v0}, Lt8/a;->g(Z)V

    iget v0, p0, Lg8/g;->d:I

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iput v1, p0, Lg8/g;->d:I

    iget-object v0, p0, Lg8/g;->b:Lg8/n;

    return-object v0
.end method

.method public flush()V
    .locals 1

    iget-boolean v0, p0, Lg8/g;->e:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lt8/a;->g(Z)V

    iget-object v0, p0, Lg8/g;->b:Lg8/n;

    invoke-virtual {v0}, Lw6/g;->n()V

    const/4 v0, 0x0

    iput v0, p0, Lg8/g;->d:I

    return-void
.end method

.method public g()Lg8/o;
    .locals 7

    iget-boolean v0, p0, Lg8/g;->e:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lt8/a;->g(Z)V

    iget v0, p0, Lg8/g;->d:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lg8/g;->c:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lg8/g;->c:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->removeFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg8/o;

    iget-object v1, p0, Lg8/g;->b:Lg8/n;

    invoke-virtual {v1}, Lw6/a;->s()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lw6/a;->m(I)V

    goto :goto_0

    :cond_1
    new-instance v4, Lg8/g$b;

    iget-object v1, p0, Lg8/g;->b:Lg8/n;

    iget-wide v2, v1, Lw6/g;->e:J

    iget-object v5, p0, Lg8/g;->a:Lg8/c;

    iget-object v1, v1, Lw6/g;->c:Ljava/nio/ByteBuffer;

    invoke-static {v1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    invoke-virtual {v5, v1}, Lg8/c;->a([B)Lcom/google/common/collect/w;

    move-result-object v1

    invoke-direct {v4, v2, v3, v1}, Lg8/g$b;-><init>(JLcom/google/common/collect/w;)V

    iget-object v1, p0, Lg8/g;->b:Lg8/n;

    iget-wide v2, v1, Lw6/g;->e:J

    const-wide/16 v5, 0x0

    move-object v1, v0

    invoke-virtual/range {v1 .. v6}, Lg8/o;->y(JLg8/i;J)V

    :goto_0
    iget-object v1, p0, Lg8/g;->b:Lg8/n;

    invoke-virtual {v1}, Lw6/g;->n()V

    const/4 v1, 0x0

    iput v1, p0, Lg8/g;->d:I

    return-object v0

    :cond_2
    :goto_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public h(Lg8/n;)V
    .locals 3

    iget-boolean v0, p0, Lg8/g;->e:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-static {v0}, Lt8/a;->g(Z)V

    iget v0, p0, Lg8/g;->d:I

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    invoke-static {v0}, Lt8/a;->g(Z)V

    iget-object v0, p0, Lg8/g;->b:Lg8/n;

    if-ne v0, p1, :cond_1

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    invoke-static {v1}, Lt8/a;->a(Z)V

    const/4 p1, 0x2

    iput p1, p0, Lg8/g;->d:I

    return-void
.end method

.method public release()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lg8/g;->e:Z

    return-void
.end method
