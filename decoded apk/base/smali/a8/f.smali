.class La8/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La8/f$c;,
        La8/f$a;,
        La8/f$d;,
        La8/f$e;,
        La8/f$b;
    }
.end annotation


# instance fields
.field private final a:La8/h;

.field private final b:Ls8/j;

.field private final c:Ls8/j;

.field private final d:La8/s;

.field private final e:[Landroid/net/Uri;

.field private final f:[Lt6/u1;

.field private final g:Lb8/l;

.field private final h:Lv7/d1;

.field private final i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lt6/u1;",
            ">;"
        }
    .end annotation
.end field

.field private final j:La8/e;

.field private final k:Lu6/m3;

.field private l:Z

.field private m:[B

.field private n:Ljava/io/IOException;

.field private o:Landroid/net/Uri;

.field private p:Z

.field private q:Lq8/r;

.field private r:J

.field private s:Z


# direct methods
.method public constructor <init>(La8/h;Lb8/l;[Landroid/net/Uri;[Lt6/u1;La8/g;Ls8/m0;La8/s;Ljava/util/List;Lu6/m3;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La8/h;",
            "Lb8/l;",
            "[",
            "Landroid/net/Uri;",
            "[",
            "Lt6/u1;",
            "La8/g;",
            "Ls8/m0;",
            "La8/s;",
            "Ljava/util/List<",
            "Lt6/u1;",
            ">;",
            "Lu6/m3;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La8/f;->a:La8/h;

    iput-object p2, p0, La8/f;->g:Lb8/l;

    iput-object p3, p0, La8/f;->e:[Landroid/net/Uri;

    iput-object p4, p0, La8/f;->f:[Lt6/u1;

    iput-object p7, p0, La8/f;->d:La8/s;

    iput-object p8, p0, La8/f;->i:Ljava/util/List;

    iput-object p9, p0, La8/f;->k:Lu6/m3;

    new-instance p1, La8/e;

    const/4 p2, 0x4

    invoke-direct {p1, p2}, La8/e;-><init>(I)V

    iput-object p1, p0, La8/f;->j:La8/e;

    sget-object p1, Lt8/r0;->f:[B

    iput-object p1, p0, La8/f;->m:[B

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, La8/f;->r:J

    const/4 p1, 0x1

    invoke-interface {p5, p1}, La8/g;->a(I)Ls8/j;

    move-result-object p1

    iput-object p1, p0, La8/f;->b:Ls8/j;

    if-eqz p6, :cond_0

    invoke-interface {p1, p6}, Ls8/j;->l(Ls8/m0;)V

    :cond_0
    const/4 p1, 0x3

    invoke-interface {p5, p1}, La8/g;->a(I)Ls8/j;

    move-result-object p1

    iput-object p1, p0, La8/f;->c:Ls8/j;

    new-instance p1, Lv7/d1;

    invoke-direct {p1, p4}, Lv7/d1;-><init>([Lt6/u1;)V

    iput-object p1, p0, La8/f;->h:Lv7/d1;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    const/4 p2, 0x0

    :goto_0
    array-length p5, p3

    if-ge p2, p5, :cond_2

    aget-object p5, p4, p2

    iget p5, p5, Lt6/u1;->e:I

    and-int/lit16 p5, p5, 0x4000

    if-nez p5, :cond_1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p5

    invoke-virtual {p1, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_2
    new-instance p2, La8/f$d;

    iget-object p3, p0, La8/f;->h:Lv7/d1;

    invoke-static {p1}, Lhb/e;->l(Ljava/util/Collection;)[I

    move-result-object p1

    invoke-direct {p2, p3, p1}, La8/f$d;-><init>(Lv7/d1;[I)V

    iput-object p2, p0, La8/f;->q:Lq8/r;

    return-void
.end method

.method private static d(Lb8/g;Lb8/g$e;)Landroid/net/Uri;
    .locals 0

    if-eqz p1, :cond_1

    iget-object p1, p1, Lb8/g$e;->r:Ljava/lang/String;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p0, p0, Lb8/i;->a:Ljava/lang/String;

    invoke-static {p0, p1}, Lt8/p0;->e(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    return-object p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private f(La8/i;ZLb8/g;JJ)Landroid/util/Pair;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La8/i;",
            "Z",
            "Lb8/g;",
            "JJ)",
            "Landroid/util/Pair<",
            "Ljava/lang/Long;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x1

    const/4 v1, -0x1

    if-eqz p1, :cond_4

    if-eqz p2, :cond_0

    goto :goto_3

    :cond_0
    invoke-virtual {p1}, La8/i;->h()Z

    move-result p2

    if-eqz p2, :cond_3

    new-instance p2, Landroid/util/Pair;

    iget p3, p1, La8/i;->o:I

    if-ne p3, v1, :cond_1

    invoke-virtual {p1}, Lx7/n;->g()J

    move-result-wide p3

    goto :goto_0

    :cond_1
    iget-wide p3, p1, Lx7/n;->j:J

    :goto_0
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    iget p1, p1, La8/i;->o:I

    if-ne p1, v1, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v1, p1, 0x1

    :goto_1
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {p2, p3, p1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    new-instance p2, Landroid/util/Pair;

    iget-wide p3, p1, Lx7/n;->j:J

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    iget p1, p1, La8/i;->o:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {p2, p3, p1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_2
    return-object p2

    :cond_4
    :goto_3
    iget-wide v2, p3, Lb8/g;->u:J

    add-long/2addr v2, p4

    if-eqz p1, :cond_6

    iget-boolean p2, p0, La8/f;->p:Z

    if-eqz p2, :cond_5

    goto :goto_4

    :cond_5
    iget-wide p6, p1, Lx7/f;->g:J

    :cond_6
    :goto_4
    iget-boolean p2, p3, Lb8/g;->o:Z

    if-nez p2, :cond_7

    cmp-long p2, p6, v2

    if-ltz p2, :cond_7

    new-instance p1, Landroid/util/Pair;

    iget-wide p4, p3, Lb8/g;->k:J

    iget-object p2, p3, Lb8/g;->r:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    int-to-long p2, p2

    add-long/2addr p4, p2

    invoke-static {p4, p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-direct {p1, p2, p3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :cond_7
    sub-long/2addr p6, p4

    iget-object p2, p3, Lb8/g;->r:Ljava/util/List;

    invoke-static {p6, p7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p4

    iget-object p5, p0, La8/f;->g:Lb8/l;

    invoke-interface {p5}, Lb8/l;->j()Z

    move-result p5

    const/4 v2, 0x0

    if-eqz p5, :cond_9

    if-nez p1, :cond_8

    goto :goto_5

    :cond_8
    move p1, v2

    goto :goto_6

    :cond_9
    :goto_5
    move p1, v0

    :goto_6
    invoke-static {p2, p4, v0, p1}, Lt8/r0;->f(Ljava/util/List;Ljava/lang/Comparable;ZZ)I

    move-result p1

    int-to-long p4, p1

    iget-wide v3, p3, Lb8/g;->k:J

    add-long/2addr p4, v3

    if-ltz p1, :cond_d

    iget-object p2, p3, Lb8/g;->r:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb8/g$d;

    iget-wide v3, p1, Lb8/g$e;->e:J

    iget-wide v5, p1, Lb8/g$e;->c:J

    add-long/2addr v3, v5

    cmp-long p2, p6, v3

    if-gez p2, :cond_a

    iget-object p1, p1, Lb8/g$d;->x:Ljava/util/List;

    goto :goto_7

    :cond_a
    iget-object p1, p3, Lb8/g;->s:Ljava/util/List;

    :goto_7
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p2

    if-ge v2, p2, :cond_d

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lb8/g$b;

    iget-wide v3, p2, Lb8/g$e;->e:J

    iget-wide v5, p2, Lb8/g$e;->c:J

    add-long/2addr v3, v5

    cmp-long v0, p6, v3

    if-gez v0, :cond_c

    iget-boolean p2, p2, Lb8/g$b;->w:Z

    if-eqz p2, :cond_d

    iget-object p2, p3, Lb8/g;->s:Ljava/util/List;

    if-ne p1, p2, :cond_b

    const-wide/16 p1, 0x1

    goto :goto_8

    :cond_b
    const-wide/16 p1, 0x0

    :goto_8
    add-long/2addr p4, p1

    move v1, v2

    goto :goto_9

    :cond_c
    add-int/lit8 v2, v2, 0x1

    goto :goto_7

    :cond_d
    :goto_9
    new-instance p1, Landroid/util/Pair;

    invoke-static {p4, p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-direct {p1, p2, p3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method

.method private static g(Lb8/g;JI)La8/f$e;
    .locals 7

    iget-wide v0, p0, Lb8/g;->k:J

    sub-long v0, p1, v0

    long-to-int v0, v0

    iget-object v1, p0, Lb8/g;->r:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, -0x1

    if-ne v0, v1, :cond_2

    if-eq p3, v4, :cond_0

    goto :goto_0

    :cond_0
    move p3, v3

    :goto_0
    iget-object v0, p0, Lb8/g;->s:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p3, v0, :cond_1

    new-instance v2, La8/f$e;

    iget-object p0, p0, Lb8/g;->s:Ljava/util/List;

    invoke-interface {p0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lb8/g$e;

    invoke-direct {v2, p0, p1, p2, p3}, La8/f$e;-><init>(Lb8/g$e;JI)V

    :cond_1
    return-object v2

    :cond_2
    iget-object v1, p0, Lb8/g;->r:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb8/g$d;

    if-ne p3, v4, :cond_3

    new-instance p0, La8/f$e;

    invoke-direct {p0, v1, p1, p2, v4}, La8/f$e;-><init>(Lb8/g$e;JI)V

    return-object p0

    :cond_3
    iget-object v5, v1, Lb8/g$d;->x:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-ge p3, v5, :cond_4

    new-instance p0, La8/f$e;

    iget-object v0, v1, Lb8/g$d;->x:Ljava/util/List;

    invoke-interface {v0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb8/g$e;

    invoke-direct {p0, v0, p1, p2, p3}, La8/f$e;-><init>(Lb8/g$e;JI)V

    return-object p0

    :cond_4
    add-int/lit8 v0, v0, 0x1

    iget-object p3, p0, Lb8/g;->r:Ljava/util/List;

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p3

    const-wide/16 v5, 0x1

    if-ge v0, p3, :cond_5

    new-instance p3, La8/f$e;

    iget-object p0, p0, Lb8/g;->r:Ljava/util/List;

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lb8/g$e;

    add-long/2addr p1, v5

    invoke-direct {p3, p0, p1, p2, v4}, La8/f$e;-><init>(Lb8/g$e;JI)V

    return-object p3

    :cond_5
    iget-object p3, p0, Lb8/g;->s:Ljava/util/List;

    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result p3

    if-nez p3, :cond_6

    new-instance p3, La8/f$e;

    iget-object p0, p0, Lb8/g;->s:Ljava/util/List;

    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lb8/g$e;

    add-long/2addr p1, v5

    invoke-direct {p3, p0, p1, p2, v3}, La8/f$e;-><init>(Lb8/g$e;JI)V

    return-object p3

    :cond_6
    return-object v2
.end method

.method static i(Lb8/g;JI)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb8/g;",
            "JI)",
            "Ljava/util/List<",
            "Lb8/g$e;",
            ">;"
        }
    .end annotation

    iget-wide v0, p0, Lb8/g;->k:J

    sub-long/2addr p1, v0

    long-to-int p1, p1

    if-ltz p1, :cond_7

    iget-object p2, p0, Lb8/g;->r:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    if-ge p2, p1, :cond_0

    goto :goto_2

    :cond_0
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, p0, Lb8/g;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, -0x1

    if-ge p1, v0, :cond_4

    if-eq p3, v2, :cond_3

    iget-object v0, p0, Lb8/g;->r:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb8/g$d;

    if-nez p3, :cond_1

    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object v3, v0, Lb8/g$d;->x:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge p3, v3, :cond_2

    iget-object v0, v0, Lb8/g$d;->x:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-interface {v0, p3, v3}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p3

    invoke-interface {p2, p3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_2
    :goto_0
    add-int/lit8 p1, p1, 0x1

    :cond_3
    iget-object p3, p0, Lb8/g;->r:Ljava/util/List;

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p3, p1, v0}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    move p3, v1

    :cond_4
    iget-wide v3, p0, Lb8/g;->n:J

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, v3, v5

    if-eqz p1, :cond_6

    if-ne p3, v2, :cond_5

    goto :goto_1

    :cond_5
    move v1, p3

    :goto_1
    iget-object p1, p0, Lb8/g;->s:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-ge v1, p1, :cond_6

    iget-object p0, p0, Lb8/g;->s:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p1

    invoke-interface {p0, v1, p1}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p0

    invoke-interface {p2, p0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_6
    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_7
    :goto_2
    invoke-static {}, Lcom/google/common/collect/w;->v()Lcom/google/common/collect/w;

    move-result-object p0

    return-object p0
.end method

.method private l(Landroid/net/Uri;I)Lx7/f;
    .locals 7

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    iget-object v1, p0, La8/f;->j:La8/e;

    invoke-virtual {v1, p1}, La8/e;->c(Landroid/net/Uri;)[B

    move-result-object v1

    if-eqz v1, :cond_1

    iget-object p2, p0, La8/f;->j:La8/e;

    invoke-virtual {p2, p1, v1}, La8/e;->b(Landroid/net/Uri;[B)[B

    return-object v0

    :cond_1
    new-instance v0, Ls8/n$b;

    invoke-direct {v0}, Ls8/n$b;-><init>()V

    invoke-virtual {v0, p1}, Ls8/n$b;->i(Landroid/net/Uri;)Ls8/n$b;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ls8/n$b;->b(I)Ls8/n$b;

    move-result-object p1

    invoke-virtual {p1}, Ls8/n$b;->a()Ls8/n;

    move-result-object v2

    new-instance p1, La8/f$a;

    iget-object v1, p0, La8/f;->c:Ls8/j;

    iget-object v0, p0, La8/f;->f:[Lt6/u1;

    aget-object v3, v0, p2

    iget-object p2, p0, La8/f;->q:Lq8/r;

    invoke-interface {p2}, Lq8/r;->t()I

    move-result v4

    iget-object p2, p0, La8/f;->q:Lq8/r;

    invoke-interface {p2}, Lq8/r;->m()Ljava/lang/Object;

    move-result-object v5

    iget-object v6, p0, La8/f;->m:[B

    move-object v0, p1

    invoke-direct/range {v0 .. v6}, La8/f$a;-><init>(Ls8/j;Ls8/n;Lt6/u1;ILjava/lang/Object;[B)V

    return-object p1
.end method

.method private s(J)J
    .locals 5

    iget-wide v0, p0, La8/f;->r:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    if-eqz v4, :cond_1

    sub-long v2, v0, p1

    :cond_1
    return-wide v2
.end method

.method private w(Lb8/g;)V
    .locals 4

    iget-boolean v0, p1, Lb8/g;->o:Z

    if-eqz v0, :cond_0

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lb8/g;->e()J

    move-result-wide v0

    iget-object p1, p0, La8/f;->g:Lb8/l;

    invoke-interface {p1}, Lb8/l;->c()J

    move-result-wide v2

    sub-long/2addr v0, v2

    :goto_0
    iput-wide v0, p0, La8/f;->r:J

    return-void
.end method


# virtual methods
.method public a(La8/i;J)[Lx7/o;
    .locals 17

    move-object/from16 v8, p0

    move-object/from16 v9, p1

    if-nez v9, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    iget-object v0, v8, La8/f;->h:Lv7/d1;

    iget-object v1, v9, Lx7/f;->d:Lt6/u1;

    invoke-virtual {v0, v1}, Lv7/d1;->e(Lt6/u1;)I

    move-result v0

    :goto_0
    move v10, v0

    iget-object v0, v8, La8/f;->q:Lq8/r;

    invoke-interface {v0}, Lq8/u;->length()I

    move-result v11

    new-array v12, v11, [Lx7/o;

    const/4 v13, 0x0

    move v14, v13

    :goto_1
    if-ge v14, v11, :cond_3

    iget-object v0, v8, La8/f;->q:Lq8/r;

    invoke-interface {v0, v14}, Lq8/u;->b(I)I

    move-result v0

    iget-object v1, v8, La8/f;->e:[Landroid/net/Uri;

    aget-object v1, v1, v0

    iget-object v2, v8, La8/f;->g:Lb8/l;

    invoke-interface {v2, v1}, Lb8/l;->g(Landroid/net/Uri;)Z

    move-result v2

    if-nez v2, :cond_1

    sget-object v0, Lx7/o;->a:Lx7/o;

    aput-object v0, v12, v14

    move/from16 v16, v14

    goto :goto_3

    :cond_1
    iget-object v2, v8, La8/f;->g:Lb8/l;

    invoke-interface {v2, v1, v13}, Lb8/l;->o(Landroid/net/Uri;Z)Lb8/g;

    move-result-object v15

    invoke-static {v15}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-wide v1, v15, Lb8/g;->h:J

    iget-object v3, v8, La8/f;->g:Lb8/l;

    invoke-interface {v3}, Lb8/l;->c()J

    move-result-wide v3

    sub-long v6, v1, v3

    if-eq v0, v10, :cond_2

    const/4 v0, 0x1

    move v2, v0

    goto :goto_2

    :cond_2
    move v2, v13

    :goto_2
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v3, v15

    move-wide v4, v6

    move/from16 v16, v14

    move-wide v13, v6

    move-wide/from16 v6, p2

    invoke-direct/range {v0 .. v7}, La8/f;->f(La8/i;ZLb8/g;JJ)Landroid/util/Pair;

    move-result-object v0

    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    new-instance v3, La8/f$c;

    iget-object v4, v15, Lb8/i;->a:Ljava/lang/String;

    invoke-static {v15, v1, v2, v0}, La8/f;->i(Lb8/g;JI)Ljava/util/List;

    move-result-object v0

    invoke-direct {v3, v4, v13, v14, v0}, La8/f$c;-><init>(Ljava/lang/String;JLjava/util/List;)V

    aput-object v3, v12, v16

    :goto_3
    add-int/lit8 v14, v16, 0x1

    const/4 v13, 0x0

    goto :goto_1

    :cond_3
    return-object v12
.end method

.method public b(JLt6/u3;)J
    .locals 11

    iget-object v0, p0, La8/f;->q:Lq8/r;

    invoke-interface {v0}, Lq8/r;->h()I

    move-result v0

    iget-object v1, p0, La8/f;->e:[Landroid/net/Uri;

    array-length v2, v1

    const/4 v3, 0x1

    if-ge v0, v2, :cond_0

    const/4 v2, -0x1

    if-eq v0, v2, :cond_0

    iget-object v0, p0, La8/f;->g:Lb8/l;

    iget-object v2, p0, La8/f;->q:Lq8/r;

    invoke-interface {v2}, Lq8/r;->r()I

    move-result v2

    aget-object v1, v1, v2

    invoke-interface {v0, v1, v3}, Lb8/l;->o(Landroid/net/Uri;Z)Lb8/g;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_3

    iget-object v1, v0, Lb8/g;->r:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    iget-boolean v1, v0, Lb8/i;->c:Z

    if-nez v1, :cond_1

    goto :goto_2

    :cond_1
    iget-wide v1, v0, Lb8/g;->h:J

    iget-object v4, p0, La8/f;->g:Lb8/l;

    invoke-interface {v4}, Lb8/l;->c()J

    move-result-wide v4

    sub-long/2addr v1, v4

    sub-long v5, p1, v1

    iget-object p1, v0, Lb8/g;->r:Ljava/util/List;

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-static {p1, p2, v3, v3}, Lt8/r0;->f(Ljava/util/List;Ljava/lang/Comparable;ZZ)I

    move-result p1

    iget-object p2, v0, Lb8/g;->r:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lb8/g$d;

    iget-wide v7, p2, Lb8/g$e;->e:J

    iget-object p2, v0, Lb8/g;->r:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    sub-int/2addr p2, v3

    if-eq p1, p2, :cond_2

    iget-object p2, v0, Lb8/g;->r:Ljava/util/List;

    add-int/2addr p1, v3

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb8/g$d;

    iget-wide p1, p1, Lb8/g$e;->e:J

    move-wide v9, p1

    goto :goto_1

    :cond_2
    move-wide v9, v7

    :goto_1
    move-object v4, p3

    invoke-virtual/range {v4 .. v10}, Lt6/u3;->a(JJJ)J

    move-result-wide p1

    add-long/2addr p1, v1

    :cond_3
    :goto_2
    return-wide p1
.end method

.method public c(La8/i;)I
    .locals 8

    iget v0, p1, La8/i;->o:I

    const/4 v1, -0x1

    const/4 v2, 0x1

    if-ne v0, v1, :cond_0

    return v2

    :cond_0
    iget-object v0, p0, La8/f;->e:[Landroid/net/Uri;

    iget-object v1, p0, La8/f;->h:Lv7/d1;

    iget-object v3, p1, Lx7/f;->d:Lt6/u1;

    invoke-virtual {v1, v3}, Lv7/d1;->e(Lt6/u1;)I

    move-result v1

    aget-object v0, v0, v1

    iget-object v1, p0, La8/f;->g:Lb8/l;

    const/4 v3, 0x0

    invoke-interface {v1, v0, v3}, Lb8/l;->o(Landroid/net/Uri;Z)Lb8/g;

    move-result-object v0

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb8/g;

    iget-wide v4, p1, Lx7/n;->j:J

    iget-wide v6, v0, Lb8/g;->k:J

    sub-long/2addr v4, v6

    long-to-int v1, v4

    if-gez v1, :cond_1

    return v2

    :cond_1
    iget-object v4, v0, Lb8/g;->r:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v1, v4, :cond_2

    iget-object v4, v0, Lb8/g;->r:Ljava/util/List;

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb8/g$d;

    iget-object v1, v1, Lb8/g$d;->x:Ljava/util/List;

    goto :goto_0

    :cond_2
    iget-object v1, v0, Lb8/g;->s:Ljava/util/List;

    :goto_0
    iget v4, p1, La8/i;->o:I

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v5

    const/4 v6, 0x2

    if-lt v4, v5, :cond_3

    return v6

    :cond_3
    iget v4, p1, La8/i;->o:I

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb8/g$b;

    iget-boolean v4, v1, Lb8/g$b;->x:Z

    if-eqz v4, :cond_4

    return v3

    :cond_4
    iget-object v0, v0, Lb8/i;->a:Ljava/lang/String;

    iget-object v1, v1, Lb8/g$e;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Lt8/p0;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    iget-object p1, p1, Lx7/f;->b:Ls8/n;

    iget-object p1, p1, Ls8/n;->a:Landroid/net/Uri;

    invoke-static {v0, p1}, Lt8/r0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    goto :goto_1

    :cond_5
    move v2, v6

    :goto_1
    return v2
.end method

.method public e(JJLjava/util/List;ZLa8/f$b;)V
    .locals 31
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ",
            "Ljava/util/List<",
            "La8/i;",
            ">;Z",
            "La8/f$b;",
            ")V"
        }
    .end annotation

    move-object/from16 v8, p0

    move-wide/from16 v9, p3

    move-object/from16 v11, p7

    invoke-interface/range {p5 .. p5}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v15, 0x0

    goto :goto_0

    :cond_0
    invoke-static/range {p5 .. p5}, Lcom/google/common/collect/e0;->d(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La8/i;

    move-object v15, v0

    :goto_0
    const/4 v13, -0x1

    if-nez v15, :cond_1

    move v14, v13

    goto :goto_1

    :cond_1
    iget-object v0, v8, La8/f;->h:Lv7/d1;

    iget-object v1, v15, Lx7/f;->d:Lt6/u1;

    invoke-virtual {v0, v1}, Lv7/d1;->e(Lt6/u1;)I

    move-result v0

    move v14, v0

    :goto_1
    sub-long v0, v9, p1

    invoke-direct/range {p0 .. p2}, La8/f;->s(J)J

    move-result-wide v2

    if-eqz v15, :cond_2

    iget-boolean v4, v8, La8/f;->p:Z

    if-nez v4, :cond_2

    invoke-virtual {v15}, Lx7/f;->d()J

    move-result-wide v4

    sub-long/2addr v0, v4

    const-wide/16 v6, 0x0

    invoke-static {v6, v7, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v16, v2, v16

    if-eqz v16, :cond_2

    sub-long/2addr v2, v4

    invoke-static {v6, v7, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    :cond_2
    move-wide/from16 v19, v0

    move-wide/from16 v21, v2

    invoke-virtual {v8, v15, v9, v10}, La8/f;->a(La8/i;J)[Lx7/o;

    move-result-object v24

    iget-object v0, v8, La8/f;->q:Lq8/r;

    move-object/from16 v16, v0

    move-wide/from16 v17, p1

    move-object/from16 v23, p5

    invoke-interface/range {v16 .. v24}, Lq8/r;->g(JJJLjava/util/List;[Lx7/o;)V

    iget-object v0, v8, La8/f;->q:Lq8/r;

    invoke-interface {v0}, Lq8/r;->r()I

    move-result v6

    const/4 v7, 0x0

    const/4 v4, 0x1

    if-eq v14, v6, :cond_3

    move/from16 v16, v4

    goto :goto_2

    :cond_3
    move/from16 v16, v7

    :goto_2
    iget-object v0, v8, La8/f;->e:[Landroid/net/Uri;

    aget-object v5, v0, v6

    iget-object v0, v8, La8/f;->g:Lb8/l;

    invoke-interface {v0, v5}, Lb8/l;->g(Landroid/net/Uri;)Z

    move-result v0

    if-nez v0, :cond_4

    iput-object v5, v11, La8/f$b;->c:Landroid/net/Uri;

    iget-boolean v0, v8, La8/f;->s:Z

    iget-object v1, v8, La8/f;->o:Landroid/net/Uri;

    invoke-virtual {v5, v1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v1

    and-int/2addr v0, v1

    iput-boolean v0, v8, La8/f;->s:Z

    iput-object v5, v8, La8/f;->o:Landroid/net/Uri;

    return-void

    :cond_4
    iget-object v0, v8, La8/f;->g:Lb8/l;

    invoke-interface {v0, v5, v4}, Lb8/l;->o(Landroid/net/Uri;Z)Lb8/g;

    move-result-object v3

    invoke-static {v3}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean v0, v3, Lb8/i;->c:Z

    iput-boolean v0, v8, La8/f;->p:Z

    invoke-direct {v8, v3}, La8/f;->w(Lb8/g;)V

    iget-wide v0, v3, Lb8/g;->h:J

    iget-object v2, v8, La8/f;->g:Lb8/l;

    invoke-interface {v2}, Lb8/l;->c()J

    move-result-wide v17

    sub-long v17, v0, v17

    move-object/from16 v0, p0

    move-object v1, v15

    move/from16 v2, v16

    move-object/from16 p1, v3

    move v12, v4

    move-object/from16 v19, v5

    move-wide/from16 v4, v17

    move/from16 v21, v6

    move-wide/from16 v6, p3

    invoke-direct/range {v0 .. v7}, La8/f;->f(La8/i;ZLb8/g;JJ)Landroid/util/Pair;

    move-result-object v0

    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-wide v4, v3, Lb8/g;->k:J

    cmp-long v4, v1, v4

    if-gez v4, :cond_5

    if-eqz v15, :cond_5

    if-eqz v16, :cond_5

    iget-object v0, v8, La8/f;->e:[Landroid/net/Uri;

    aget-object v6, v0, v14

    iget-object v0, v8, La8/f;->g:Lb8/l;

    invoke-interface {v0, v6, v12}, Lb8/l;->o(Landroid/net/Uri;Z)Lb8/g;

    move-result-object v7

    invoke-static {v7}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-wide v0, v7, Lb8/g;->h:J

    iget-object v2, v8, La8/f;->g:Lb8/l;

    invoke-interface {v2}, Lb8/l;->c()J

    move-result-wide v2

    sub-long v16, v0, v2

    const/4 v2, 0x0

    move-object/from16 v0, p0

    move-object v1, v15

    move-object v3, v7

    move-wide/from16 v4, v16

    move-object/from16 v18, v6

    move-object/from16 v19, v7

    move-wide/from16 v6, p3

    invoke-direct/range {v0 .. v7}, La8/f;->f(La8/i;ZLb8/g;JJ)Landroid/util/Pair;

    move-result-object v0

    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    move v3, v14

    move-object/from16 v5, v18

    move-object/from16 v4, v19

    goto :goto_3

    :cond_5
    move-object v4, v3

    move-wide/from16 v16, v17

    move-object/from16 v5, v19

    move/from16 v3, v21

    :goto_3
    iget-wide v6, v4, Lb8/g;->k:J

    cmp-long v6, v1, v6

    if-gez v6, :cond_6

    new-instance v0, Lv7/b;

    invoke-direct {v0}, Lv7/b;-><init>()V

    iput-object v0, v8, La8/f;->n:Ljava/io/IOException;

    return-void

    :cond_6
    invoke-static {v4, v1, v2, v0}, La8/f;->g(Lb8/g;JI)La8/f$e;

    move-result-object v0

    if-nez v0, :cond_a

    iget-boolean v0, v4, Lb8/g;->o:Z

    if-nez v0, :cond_7

    iput-object v5, v11, La8/f$b;->c:Landroid/net/Uri;

    iget-boolean v0, v8, La8/f;->s:Z

    iget-object v1, v8, La8/f;->o:Landroid/net/Uri;

    invoke-virtual {v5, v1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v1

    and-int/2addr v0, v1

    iput-boolean v0, v8, La8/f;->s:Z

    iput-object v5, v8, La8/f;->o:Landroid/net/Uri;

    return-void

    :cond_7
    if-nez p6, :cond_9

    iget-object v0, v4, Lb8/g;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_8

    goto :goto_4

    :cond_8
    new-instance v0, La8/f$e;

    iget-object v1, v4, Lb8/g;->r:Ljava/util/List;

    invoke-static {v1}, Lcom/google/common/collect/e0;->d(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb8/g$e;

    iget-wide v6, v4, Lb8/g;->k:J

    iget-object v2, v4, Lb8/g;->r:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    int-to-long v9, v2

    add-long/2addr v6, v9

    const-wide/16 v9, 0x1

    sub-long/2addr v6, v9

    invoke-direct {v0, v1, v6, v7, v13}, La8/f$e;-><init>(Lb8/g$e;JI)V

    goto :goto_5

    :cond_9
    :goto_4
    iput-boolean v12, v11, La8/f$b;->b:Z

    return-void

    :cond_a
    :goto_5
    const/4 v1, 0x0

    iput-boolean v1, v8, La8/f;->s:Z

    const/4 v1, 0x0

    iput-object v1, v8, La8/f;->o:Landroid/net/Uri;

    iget-object v1, v0, La8/f$e;->a:Lb8/g$e;

    iget-object v1, v1, Lb8/g$e;->b:Lb8/g$d;

    invoke-static {v4, v1}, La8/f;->d(Lb8/g;Lb8/g$e;)Landroid/net/Uri;

    move-result-object v1

    invoke-direct {v8, v1, v3}, La8/f;->l(Landroid/net/Uri;I)Lx7/f;

    move-result-object v2

    iput-object v2, v11, La8/f$b;->a:Lx7/f;

    if-eqz v2, :cond_b

    return-void

    :cond_b
    iget-object v2, v0, La8/f$e;->a:Lb8/g$e;

    invoke-static {v4, v2}, La8/f;->d(Lb8/g;Lb8/g$e;)Landroid/net/Uri;

    move-result-object v2

    invoke-direct {v8, v2, v3}, La8/f;->l(Landroid/net/Uri;I)Lx7/f;

    move-result-object v6

    iput-object v6, v11, La8/f$b;->a:Lx7/f;

    if-eqz v6, :cond_c

    return-void

    :cond_c
    move-object/from16 p1, v15

    move-object/from16 p2, v5

    move-object/from16 p3, v4

    move-object/from16 p4, v0

    move-wide/from16 p5, v16

    invoke-static/range {p1 .. p6}, La8/i;->w(La8/i;Landroid/net/Uri;Lb8/g;La8/f$e;J)Z

    move-result v29

    if-eqz v29, :cond_d

    iget-boolean v6, v0, La8/f$e;->d:Z

    if-eqz v6, :cond_d

    return-void

    :cond_d
    iget-object v13, v8, La8/f;->a:La8/h;

    iget-object v14, v8, La8/f;->b:Ls8/j;

    iget-object v6, v8, La8/f;->f:[Lt6/u1;

    aget-object v3, v6, v3

    move-object v12, v15

    move-object v15, v3

    iget-object v3, v8, La8/f;->i:Ljava/util/List;

    move-object/from16 v21, v3

    iget-object v3, v8, La8/f;->q:Lq8/r;

    invoke-interface {v3}, Lq8/r;->t()I

    move-result v22

    iget-object v3, v8, La8/f;->q:Lq8/r;

    invoke-interface {v3}, Lq8/r;->m()Ljava/lang/Object;

    move-result-object v23

    iget-boolean v3, v8, La8/f;->l:Z

    move/from16 v24, v3

    iget-object v3, v8, La8/f;->d:La8/s;

    move-object/from16 v25, v3

    iget-object v3, v8, La8/f;->j:La8/e;

    invoke-virtual {v3, v2}, La8/e;->a(Landroid/net/Uri;)[B

    move-result-object v27

    iget-object v2, v8, La8/f;->j:La8/e;

    invoke-virtual {v2, v1}, La8/e;->a(Landroid/net/Uri;)[B

    move-result-object v28

    iget-object v1, v8, La8/f;->k:Lu6/m3;

    move-object/from16 v30, v1

    move-object/from16 v18, v4

    move-object/from16 v19, v0

    move-object/from16 v20, v5

    move-object/from16 v26, v12

    invoke-static/range {v13 .. v30}, La8/i;->j(La8/h;Ls8/j;Lt6/u1;JLb8/g;La8/f$e;Landroid/net/Uri;Ljava/util/List;ILjava/lang/Object;ZLa8/s;La8/i;[B[BZLu6/m3;)La8/i;

    move-result-object v0

    iput-object v0, v11, La8/f$b;->a:Lx7/f;

    return-void
.end method

.method public h(JLjava/util/List;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/List<",
            "+",
            "Lx7/n;",
            ">;)I"
        }
    .end annotation

    iget-object v0, p0, La8/f;->n:Ljava/io/IOException;

    if-nez v0, :cond_1

    iget-object v0, p0, La8/f;->q:Lq8/r;

    invoke-interface {v0}, Lq8/u;->length()I

    move-result v0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, La8/f;->q:Lq8/r;

    invoke-interface {v0, p1, p2, p3}, Lq8/r;->q(JLjava/util/List;)I

    move-result p1

    return p1

    :cond_1
    :goto_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p1

    return p1
.end method

.method public j()Lv7/d1;
    .locals 1

    iget-object v0, p0, La8/f;->h:Lv7/d1;

    return-object v0
.end method

.method public k()Lq8/r;
    .locals 1

    iget-object v0, p0, La8/f;->q:Lq8/r;

    return-object v0
.end method

.method public m(Lx7/f;J)Z
    .locals 2

    iget-object v0, p0, La8/f;->q:Lq8/r;

    iget-object v1, p0, La8/f;->h:Lv7/d1;

    iget-object p1, p1, Lx7/f;->d:Lt6/u1;

    invoke-virtual {v1, p1}, Lv7/d1;->e(Lt6/u1;)I

    move-result p1

    invoke-interface {v0, p1}, Lq8/u;->c(I)I

    move-result p1

    invoke-interface {v0, p1, p2, p3}, Lq8/r;->i(IJ)Z

    move-result p1

    return p1
.end method

.method public n()V
    .locals 2

    iget-object v0, p0, La8/f;->n:Ljava/io/IOException;

    if-nez v0, :cond_1

    iget-object v0, p0, La8/f;->o:Landroid/net/Uri;

    if-eqz v0, :cond_0

    iget-boolean v1, p0, La8/f;->s:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, La8/f;->g:Lb8/l;

    invoke-interface {v1, v0}, Lb8/l;->b(Landroid/net/Uri;)V

    :cond_0
    return-void

    :cond_1
    throw v0
.end method

.method public o(Landroid/net/Uri;)Z
    .locals 1

    iget-object v0, p0, La8/f;->e:[Landroid/net/Uri;

    invoke-static {v0, p1}, Lt8/r0;->s([Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public p(Lx7/f;)V
    .locals 2

    instance-of v0, p1, La8/f$a;

    if-eqz v0, :cond_0

    check-cast p1, La8/f$a;

    invoke-virtual {p1}, Lx7/l;->h()[B

    move-result-object v0

    iput-object v0, p0, La8/f;->m:[B

    iget-object v0, p0, La8/f;->j:La8/e;

    iget-object v1, p1, Lx7/f;->b:Ls8/n;

    iget-object v1, v1, Ls8/n;->a:Landroid/net/Uri;

    invoke-virtual {p1}, La8/f$a;->j()[B

    move-result-object p1

    invoke-static {p1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    invoke-virtual {v0, v1, p1}, La8/e;->b(Landroid/net/Uri;[B)[B

    :cond_0
    return-void
.end method

.method public q(Landroid/net/Uri;J)Z
    .locals 5

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, La8/f;->e:[Landroid/net/Uri;

    array-length v3, v2

    const/4 v4, -0x1

    if-ge v1, v3, :cond_1

    aget-object v2, v2, v1

    invoke-virtual {v2, p1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    move v1, v4

    :goto_1
    const/4 v2, 0x1

    if-ne v1, v4, :cond_2

    return v2

    :cond_2
    iget-object v3, p0, La8/f;->q:Lq8/r;

    invoke-interface {v3, v1}, Lq8/u;->c(I)I

    move-result v1

    if-ne v1, v4, :cond_3

    return v2

    :cond_3
    iget-boolean v3, p0, La8/f;->s:Z

    iget-object v4, p0, La8/f;->o:Landroid/net/Uri;

    invoke-virtual {p1, v4}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    iput-boolean v3, p0, La8/f;->s:Z

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v3, p2, v3

    if-eqz v3, :cond_4

    iget-object v3, p0, La8/f;->q:Lq8/r;

    invoke-interface {v3, v1, p2, p3}, Lq8/r;->i(IJ)Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, p0, La8/f;->g:Lb8/l;

    invoke-interface {v1, p1, p2, p3}, Lb8/l;->k(Landroid/net/Uri;J)Z

    move-result p1

    if-eqz p1, :cond_5

    :cond_4
    move v0, v2

    :cond_5
    return v0
.end method

.method public r()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, La8/f;->n:Ljava/io/IOException;

    return-void
.end method

.method public t(Z)V
    .locals 0

    iput-boolean p1, p0, La8/f;->l:Z

    return-void
.end method

.method public u(Lq8/r;)V
    .locals 0

    iput-object p1, p0, La8/f;->q:Lq8/r;

    return-void
.end method

.method public v(JLx7/f;Ljava/util/List;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lx7/f;",
            "Ljava/util/List<",
            "+",
            "Lx7/n;",
            ">;)Z"
        }
    .end annotation

    iget-object v0, p0, La8/f;->n:Ljava/io/IOException;

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, La8/f;->q:Lq8/r;

    invoke-interface {v0, p1, p2, p3, p4}, Lq8/r;->k(JLx7/f;Ljava/util/List;)Z

    move-result p1

    return p1
.end method
