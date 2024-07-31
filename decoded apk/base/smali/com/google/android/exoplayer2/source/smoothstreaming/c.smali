.class final Lcom/google/android/exoplayer2/source/smoothstreaming/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv7/y;
.implements Lv7/w0$a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lv7/y;",
        "Lv7/w0$a<",
        "Lx7/i<",
        "Lcom/google/android/exoplayer2/source/smoothstreaming/b;",
        ">;>;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/exoplayer2/source/smoothstreaming/b$a;

.field private final b:Ls8/m0;

.field private final c:Ls8/f0;

.field private final d:Lx6/v;

.field private final e:Lx6/u$a;

.field private final f:Ls8/d0;

.field private final r:Lv7/h0$a;

.field private final s:Ls8/b;

.field private final t:Lv7/f1;

.field private final u:Lv7/i;

.field private v:Lv7/y$a;

.field private w:Lf8/a;

.field private x:[Lx7/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lx7/i<",
            "Lcom/google/android/exoplayer2/source/smoothstreaming/b;",
            ">;"
        }
    .end annotation
.end field

.field private y:Lv7/w0;


# direct methods
.method public constructor <init>(Lf8/a;Lcom/google/android/exoplayer2/source/smoothstreaming/b$a;Ls8/m0;Lv7/i;Lx6/v;Lx6/u$a;Ls8/d0;Lv7/h0$a;Ls8/f0;Ls8/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->w:Lf8/a;

    iput-object p2, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->a:Lcom/google/android/exoplayer2/source/smoothstreaming/b$a;

    iput-object p3, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->b:Ls8/m0;

    iput-object p9, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->c:Ls8/f0;

    iput-object p5, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->d:Lx6/v;

    iput-object p6, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->e:Lx6/u$a;

    iput-object p7, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->f:Ls8/d0;

    iput-object p8, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->r:Lv7/h0$a;

    iput-object p10, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->s:Ls8/b;

    iput-object p4, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->u:Lv7/i;

    invoke-static {p1, p5}, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->m(Lf8/a;Lx6/v;)Lv7/f1;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->t:Lv7/f1;

    const/4 p1, 0x0

    invoke-static {p1}, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->n(I)[Lx7/i;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->x:[Lx7/i;

    invoke-interface {p4, p1}, Lv7/i;->a([Lv7/w0;)Lv7/w0;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->y:Lv7/w0;

    return-void
.end method

.method private d(Lq8/r;J)Lx7/i;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq8/r;",
            "J)",
            "Lx7/i<",
            "Lcom/google/android/exoplayer2/source/smoothstreaming/b;",
            ">;"
        }
    .end annotation

    move-object v13, p0

    iget-object v0, v13, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->t:Lv7/f1;

    invoke-interface/range {p1 .. p1}, Lq8/u;->d()Lv7/d1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lv7/f1;->d(Lv7/d1;)I

    move-result v0

    iget-object v2, v13, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->a:Lcom/google/android/exoplayer2/source/smoothstreaming/b$a;

    iget-object v3, v13, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->c:Ls8/f0;

    iget-object v4, v13, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->w:Lf8/a;

    iget-object v7, v13, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->b:Ls8/m0;

    move v5, v0

    move-object/from16 v6, p1

    invoke-interface/range {v2 .. v7}, Lcom/google/android/exoplayer2/source/smoothstreaming/b$a;->a(Ls8/f0;Lf8/a;ILq8/r;Ls8/m0;)Lcom/google/android/exoplayer2/source/smoothstreaming/b;

    move-result-object v4

    new-instance v14, Lx7/i;

    iget-object v1, v13, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->w:Lf8/a;

    iget-object v1, v1, Lf8/a;->f:[Lf8/a$b;

    aget-object v0, v1, v0

    iget v1, v0, Lf8/a$b;->a:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    iget-object v6, v13, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->s:Ls8/b;

    iget-object v9, v13, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->d:Lx6/v;

    iget-object v10, v13, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->e:Lx6/u$a;

    iget-object v11, v13, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->f:Ls8/d0;

    iget-object v12, v13, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->r:Lv7/h0$a;

    move-object v0, v14

    move-object v5, p0

    move-wide/from16 v7, p2

    invoke-direct/range {v0 .. v12}, Lx7/i;-><init>(I[I[Lt6/u1;Lx7/j;Lv7/w0$a;Ls8/b;JLx6/v;Lx6/u$a;Ls8/d0;Lv7/h0$a;)V

    return-object v14
.end method

.method private static m(Lf8/a;Lx6/v;)Lv7/f1;
    .locals 8

    iget-object v0, p0, Lf8/a;->f:[Lf8/a$b;

    array-length v0, v0

    new-array v0, v0, [Lv7/d1;

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    iget-object v3, p0, Lf8/a;->f:[Lf8/a$b;

    array-length v4, v3

    if-ge v2, v4, :cond_1

    aget-object v3, v3, v2

    iget-object v3, v3, Lf8/a$b;->j:[Lt6/u1;

    array-length v4, v3

    new-array v4, v4, [Lt6/u1;

    move v5, v1

    :goto_1
    array-length v6, v3

    if-ge v5, v6, :cond_0

    aget-object v6, v3, v5

    invoke-interface {p1, v6}, Lx6/v;->d(Lt6/u1;)I

    move-result v7

    invoke-virtual {v6, v7}, Lt6/u1;->d(I)Lt6/u1;

    move-result-object v6

    aput-object v6, v4, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_0
    new-instance v3, Lv7/d1;

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v5, v4}, Lv7/d1;-><init>(Ljava/lang/String;[Lt6/u1;)V

    aput-object v3, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    new-instance p0, Lv7/f1;

    invoke-direct {p0, v0}, Lv7/f1;-><init>([Lv7/d1;)V

    return-object p0
.end method

.method private static n(I)[Lx7/i;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)[",
            "Lx7/i<",
            "Lcom/google/android/exoplayer2/source/smoothstreaming/b;",
            ">;"
        }
    .end annotation

    new-array p0, p0, [Lx7/i;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic a(Lv7/w0;)V
    .locals 0

    check-cast p1, Lx7/i;

    invoke-virtual {p0, p1}, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->p(Lx7/i;)V

    return-void
.end method

.method public b()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->y:Lv7/w0;

    invoke-interface {v0}, Lv7/w0;->b()J

    move-result-wide v0

    return-wide v0
.end method

.method public c(JLt6/u3;)J
    .locals 6

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->x:[Lx7/i;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    iget v4, v3, Lx7/i;->a:I

    const/4 v5, 0x2

    if-ne v4, v5, :cond_0

    invoke-virtual {v3, p1, p2, p3}, Lx7/i;->c(JLt6/u3;)J

    move-result-wide p1

    return-wide p1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-wide p1
.end method

.method public e(J)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->y:Lv7/w0;

    invoke-interface {v0, p1, p2}, Lv7/w0;->e(J)Z

    move-result p1

    return p1
.end method

.method public f()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->y:Lv7/w0;

    invoke-interface {v0}, Lv7/w0;->f()J

    move-result-wide v0

    return-wide v0
.end method

.method public g(J)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->y:Lv7/w0;

    invoke-interface {v0, p1, p2}, Lv7/w0;->g(J)V

    return-void
.end method

.method public isLoading()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->y:Lv7/w0;

    invoke-interface {v0}, Lv7/w0;->isLoading()Z

    move-result v0

    return v0
.end method

.method public j(J)J
    .locals 4

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->x:[Lx7/i;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3, p1, p2}, Lx7/i;->R(J)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-wide p1
.end method

.method public k(Lv7/y$a;J)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->v:Lv7/y$a;

    invoke-interface {p1, p0}, Lv7/y$a;->h(Lv7/y;)V

    return-void
.end method

.method public l()J
    .locals 2

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    return-wide v0
.end method

.method public o()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->c:Ls8/f0;

    invoke-interface {v0}, Ls8/f0;->a()V

    return-void
.end method

.method public p(Lx7/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx7/i<",
            "Lcom/google/android/exoplayer2/source/smoothstreaming/b;",
            ">;)V"
        }
    .end annotation

    iget-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->v:Lv7/y$a;

    invoke-interface {p1, p0}, Lv7/w0$a;->a(Lv7/w0;)V

    return-void
.end method

.method public q()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->x:[Lx7/i;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lx7/i;->O()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->v:Lv7/y$a;

    return-void
.end method

.method public r()Lv7/f1;
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->t:Lv7/f1;

    return-object v0
.end method

.method public s(JZ)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->x:[Lx7/i;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3, p1, p2, p3}, Lx7/i;->s(JZ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public t([Lq8/r;[Z[Lv7/v0;[ZJ)J
    .locals 5

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_4

    aget-object v2, p3, v1

    if-eqz v2, :cond_2

    check-cast v2, Lx7/i;

    aget-object v3, p1, v1

    if-eqz v3, :cond_1

    aget-boolean v3, p2, v1

    if-nez v3, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v2}, Lx7/i;->D()Lx7/j;

    move-result-object v3

    check-cast v3, Lcom/google/android/exoplayer2/source/smoothstreaming/b;

    aget-object v4, p1, v1

    invoke-interface {v3, v4}, Lcom/google/android/exoplayer2/source/smoothstreaming/b;->b(Lq8/r;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_1
    :goto_1
    invoke-virtual {v2}, Lx7/i;->O()V

    const/4 v2, 0x0

    aput-object v2, p3, v1

    :cond_2
    :goto_2
    aget-object v2, p3, v1

    if-nez v2, :cond_3

    aget-object v2, p1, v1

    if-eqz v2, :cond_3

    invoke-direct {p0, v2, p5, p6}, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->d(Lq8/r;J)Lx7/i;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    aput-object v2, p3, v1

    const/4 v2, 0x1

    aput-boolean v2, p4, v1

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    invoke-static {p1}, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->n(I)[Lx7/i;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->x:[Lx7/i;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    iget-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->u:Lv7/i;

    iget-object p2, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->x:[Lx7/i;

    invoke-interface {p1, p2}, Lv7/i;->a([Lv7/w0;)Lv7/w0;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->y:Lv7/w0;

    return-wide p5
.end method

.method public u(Lf8/a;)V
    .locals 4

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->w:Lf8/a;

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->x:[Lx7/i;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lx7/i;->D()Lx7/j;

    move-result-object v3

    check-cast v3, Lcom/google/android/exoplayer2/source/smoothstreaming/b;

    invoke-interface {v3, p1}, Lcom/google/android/exoplayer2/source/smoothstreaming/b;->f(Lf8/a;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->v:Lv7/y$a;

    invoke-interface {p1, p0}, Lv7/w0$a;->a(Lv7/w0;)V

    return-void
.end method
