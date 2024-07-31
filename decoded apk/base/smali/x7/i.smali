.class public Lx7/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv7/v0;
.implements Lv7/w0;
.implements Ls8/e0$b;
.implements Ls8/e0$f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx7/i$a;,
        Lx7/i$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lx7/j;",
        ">",
        "Ljava/lang/Object;",
        "Lv7/v0;",
        "Lv7/w0;",
        "Ls8/e0$b<",
        "Lx7/f;",
        ">;",
        "Ls8/e0$f;"
    }
.end annotation


# instance fields
.field private A:Lx7/f;

.field private B:Lt6/u1;

.field private C:Lx7/i$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx7/i$b<",
            "TT;>;"
        }
    .end annotation
.end field

.field private D:J

.field private E:J

.field private F:I

.field private G:Lx7/a;

.field H:Z

.field public final a:I

.field private final b:[I

.field private final c:[Lt6/u1;

.field private final d:[Z

.field private final e:Lx7/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private final f:Lv7/w0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv7/w0$a<",
            "Lx7/i<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field private final r:Lv7/h0$a;

.field private final s:Ls8/d0;

.field private final t:Ls8/e0;

.field private final u:Lx7/h;

.field private final v:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lx7/a;",
            ">;"
        }
    .end annotation
.end field

.field private final w:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lx7/a;",
            ">;"
        }
    .end annotation
.end field

.field private final x:Lv7/u0;

.field private final y:[Lv7/u0;

.field private final z:Lx7/c;


# direct methods
.method public constructor <init>(I[I[Lt6/u1;Lx7/j;Lv7/w0$a;Ls8/b;JLx6/v;Lx6/u$a;Ls8/d0;Lv7/h0$a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I[I[",
            "Lt6/u1;",
            "TT;",
            "Lv7/w0$a<",
            "Lx7/i<",
            "TT;>;>;",
            "Ls8/b;",
            "J",
            "Lx6/v;",
            "Lx6/u$a;",
            "Ls8/d0;",
            "Lv7/h0$a;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lx7/i;->a:I

    const/4 v0, 0x0

    if-nez p2, :cond_0

    new-array p2, v0, [I

    :cond_0
    iput-object p2, p0, Lx7/i;->b:[I

    if-nez p3, :cond_1

    new-array p3, v0, [Lt6/u1;

    :cond_1
    iput-object p3, p0, Lx7/i;->c:[Lt6/u1;

    iput-object p4, p0, Lx7/i;->e:Lx7/j;

    iput-object p5, p0, Lx7/i;->f:Lv7/w0$a;

    iput-object p12, p0, Lx7/i;->r:Lv7/h0$a;

    iput-object p11, p0, Lx7/i;->s:Ls8/d0;

    new-instance p3, Ls8/e0;

    const-string p4, "ChunkSampleStream"

    invoke-direct {p3, p4}, Ls8/e0;-><init>(Ljava/lang/String;)V

    iput-object p3, p0, Lx7/i;->t:Ls8/e0;

    new-instance p3, Lx7/h;

    invoke-direct {p3}, Lx7/h;-><init>()V

    iput-object p3, p0, Lx7/i;->u:Lx7/h;

    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    iput-object p3, p0, Lx7/i;->v:Ljava/util/ArrayList;

    invoke-static {p3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p3

    iput-object p3, p0, Lx7/i;->w:Ljava/util/List;

    array-length p2, p2

    new-array p3, p2, [Lv7/u0;

    iput-object p3, p0, Lx7/i;->y:[Lv7/u0;

    new-array p3, p2, [Z

    iput-object p3, p0, Lx7/i;->d:[Z

    add-int/lit8 p3, p2, 0x1

    new-array p4, p3, [I

    new-array p3, p3, [Lv7/u0;

    invoke-static {p6, p9, p10}, Lv7/u0;->k(Ls8/b;Lx6/v;Lx6/u$a;)Lv7/u0;

    move-result-object p5

    iput-object p5, p0, Lx7/i;->x:Lv7/u0;

    aput p1, p4, v0

    aput-object p5, p3, v0

    :goto_0
    if-ge v0, p2, :cond_2

    invoke-static {p6}, Lv7/u0;->l(Ls8/b;)Lv7/u0;

    move-result-object p1

    iget-object p5, p0, Lx7/i;->y:[Lv7/u0;

    aput-object p1, p5, v0

    add-int/lit8 p5, v0, 0x1

    aput-object p1, p3, p5

    iget-object p1, p0, Lx7/i;->b:[I

    aget p1, p1, v0

    aput p1, p4, p5

    move v0, p5

    goto :goto_0

    :cond_2
    new-instance p1, Lx7/c;

    invoke-direct {p1, p4, p3}, Lx7/c;-><init>([I[Lv7/u0;)V

    iput-object p1, p0, Lx7/i;->z:Lx7/c;

    iput-wide p7, p0, Lx7/i;->D:J

    iput-wide p7, p0, Lx7/i;->E:J

    return-void
.end method

.method private A(I)V
    .locals 2

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lx7/i;->N(II)I

    move-result p1

    iget v1, p0, Lx7/i;->F:I

    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    move-result p1

    if-lez p1, :cond_0

    iget-object v1, p0, Lx7/i;->v:Ljava/util/ArrayList;

    invoke-static {v1, v0, p1}, Lt8/r0;->N0(Ljava/util/List;II)V

    iget v0, p0, Lx7/i;->F:I

    sub-int/2addr v0, p1

    iput v0, p0, Lx7/i;->F:I

    :cond_0
    return-void
.end method

.method private B(I)V
    .locals 7

    iget-object v0, p0, Lx7/i;->t:Ls8/e0;

    invoke-virtual {v0}, Ls8/e0;->j()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lt8/a;->g(Z)V

    iget-object v0, p0, Lx7/i;->v:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    :goto_0
    const/4 v1, -0x1

    if-ge p1, v0, :cond_1

    invoke-direct {p0, p1}, Lx7/i;->F(I)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    move p1, v1

    :goto_1
    if-ne p1, v1, :cond_2

    return-void

    :cond_2
    invoke-direct {p0}, Lx7/i;->E()Lx7/a;

    move-result-object v0

    iget-wide v5, v0, Lx7/f;->h:J

    invoke-direct {p0, p1}, Lx7/i;->C(I)Lx7/a;

    move-result-object p1

    iget-object v0, p0, Lx7/i;->v:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-wide v0, p0, Lx7/i;->E:J

    iput-wide v0, p0, Lx7/i;->D:J

    :cond_3
    const/4 v0, 0x0

    iput-boolean v0, p0, Lx7/i;->H:Z

    iget-object v1, p0, Lx7/i;->r:Lv7/h0$a;

    iget v2, p0, Lx7/i;->a:I

    iget-wide v3, p1, Lx7/f;->g:J

    invoke-virtual/range {v1 .. v6}, Lv7/h0$a;->D(IJJ)V

    return-void
.end method

.method private C(I)Lx7/a;
    .locals 3

    iget-object v0, p0, Lx7/i;->v:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx7/a;

    iget-object v1, p0, Lx7/i;->v:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-static {v1, p1, v2}, Lt8/r0;->N0(Ljava/util/List;II)V

    iget p1, p0, Lx7/i;->F:I

    iget-object v1, p0, Lx7/i;->v:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-static {p1, v1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Lx7/i;->F:I

    iget-object p1, p0, Lx7/i;->x:Lv7/u0;

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Lx7/a;->i(I)I

    move-result v2

    invoke-virtual {p1, v2}, Lv7/u0;->u(I)V

    iget-object p1, p0, Lx7/i;->y:[Lv7/u0;

    array-length v2, p1

    if-ge v1, v2, :cond_0

    aget-object p1, p1, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private E()Lx7/a;
    .locals 2

    iget-object v0, p0, Lx7/i;->v:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx7/a;

    return-object v0
.end method

.method private F(I)Z
    .locals 5

    iget-object v0, p0, Lx7/i;->v:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx7/a;

    iget-object v0, p0, Lx7/i;->x:Lv7/u0;

    invoke-virtual {v0}, Lv7/u0;->C()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Lx7/a;->i(I)I

    move-result v2

    const/4 v3, 0x1

    if-le v0, v2, :cond_0

    return v3

    :cond_0
    move v0, v1

    :cond_1
    iget-object v2, p0, Lx7/i;->y:[Lv7/u0;

    array-length v4, v2

    if-ge v0, v4, :cond_2

    aget-object v2, v2, v0

    invoke-virtual {v2}, Lv7/u0;->C()I

    move-result v2

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p1, v0}, Lx7/a;->i(I)I

    move-result v4

    if-le v2, v4, :cond_1

    return v3

    :cond_2
    return v1
.end method

.method private G(Lx7/f;)Z
    .locals 0

    instance-of p1, p1, Lx7/a;

    return p1
.end method

.method private I()V
    .locals 3

    iget-object v0, p0, Lx7/i;->x:Lv7/u0;

    invoke-virtual {v0}, Lv7/u0;->C()I

    move-result v0

    iget v1, p0, Lx7/i;->F:I

    add-int/lit8 v1, v1, -0x1

    invoke-direct {p0, v0, v1}, Lx7/i;->N(II)I

    move-result v0

    :goto_0
    iget v1, p0, Lx7/i;->F:I

    if-gt v1, v0, :cond_0

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lx7/i;->F:I

    invoke-direct {p0, v1}, Lx7/i;->J(I)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private J(I)V
    .locals 8

    iget-object v0, p0, Lx7/i;->v:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx7/a;

    iget-object v7, p1, Lx7/f;->d:Lt6/u1;

    iget-object v0, p0, Lx7/i;->B:Lt6/u1;

    invoke-virtual {v7, v0}, Lt6/u1;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lx7/i;->r:Lv7/h0$a;

    iget v1, p0, Lx7/i;->a:I

    iget v3, p1, Lx7/f;->e:I

    iget-object v4, p1, Lx7/f;->f:Ljava/lang/Object;

    iget-wide v5, p1, Lx7/f;->g:J

    move-object v2, v7

    invoke-virtual/range {v0 .. v6}, Lv7/h0$a;->i(ILt6/u1;ILjava/lang/Object;J)V

    :cond_0
    iput-object v7, p0, Lx7/i;->B:Lt6/u1;

    return-void
.end method

.method private N(II)I
    .locals 2

    :cond_0
    add-int/lit8 p2, p2, 0x1

    iget-object v0, p0, Lx7/i;->v:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p2, v0, :cond_1

    iget-object v0, p0, Lx7/i;->v:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx7/a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lx7/a;->i(I)I

    move-result v0

    if-le v0, p1, :cond_0

    add-int/lit8 p2, p2, -0x1

    return p2

    :cond_1
    iget-object p1, p0, Lx7/i;->v:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    return p1
.end method

.method private Q()V
    .locals 4

    iget-object v0, p0, Lx7/i;->x:Lv7/u0;

    invoke-virtual {v0}, Lv7/u0;->V()V

    iget-object v0, p0, Lx7/i;->y:[Lv7/u0;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lv7/u0;->V()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method static synthetic u(Lx7/i;)Lx7/a;
    .locals 0

    iget-object p0, p0, Lx7/i;->G:Lx7/a;

    return-object p0
.end method

.method static synthetic v(Lx7/i;)[Z
    .locals 0

    iget-object p0, p0, Lx7/i;->d:[Z

    return-object p0
.end method

.method static synthetic w(Lx7/i;)[I
    .locals 0

    iget-object p0, p0, Lx7/i;->b:[I

    return-object p0
.end method

.method static synthetic x(Lx7/i;)[Lt6/u1;
    .locals 0

    iget-object p0, p0, Lx7/i;->c:[Lt6/u1;

    return-object p0
.end method

.method static synthetic y(Lx7/i;)J
    .locals 2

    iget-wide v0, p0, Lx7/i;->E:J

    return-wide v0
.end method

.method static synthetic z(Lx7/i;)Lv7/h0$a;
    .locals 0

    iget-object p0, p0, Lx7/i;->r:Lv7/h0$a;

    return-object p0
.end method


# virtual methods
.method public D()Lx7/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lx7/i;->e:Lx7/j;

    return-object v0
.end method

.method H()Z
    .locals 4

    iget-wide v0, p0, Lx7/i;->D:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public K(Lx7/f;JJZ)V
    .locals 15

    move-object v0, p0

    move-object/from16 v1, p1

    const/4 v2, 0x0

    iput-object v2, v0, Lx7/i;->A:Lx7/f;

    iput-object v2, v0, Lx7/i;->G:Lx7/a;

    new-instance v2, Lv7/u;

    iget-wide v4, v1, Lx7/f;->a:J

    iget-object v6, v1, Lx7/f;->b:Ls8/n;

    invoke-virtual/range {p1 .. p1}, Lx7/f;->f()Landroid/net/Uri;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lx7/f;->e()Ljava/util/Map;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Lx7/f;->a()J

    move-result-wide v13

    move-object v3, v2

    move-wide/from16 v9, p2

    move-wide/from16 v11, p4

    invoke-direct/range {v3 .. v14}, Lv7/u;-><init>(JLs8/n;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    iget-object v3, v0, Lx7/i;->s:Ls8/d0;

    iget-wide v4, v1, Lx7/f;->a:J

    invoke-interface {v3, v4, v5}, Ls8/d0;->c(J)V

    iget-object v3, v0, Lx7/i;->r:Lv7/h0$a;

    iget v5, v1, Lx7/f;->c:I

    iget v6, v0, Lx7/i;->a:I

    iget-object v7, v1, Lx7/f;->d:Lt6/u1;

    iget v8, v1, Lx7/f;->e:I

    iget-object v9, v1, Lx7/f;->f:Ljava/lang/Object;

    iget-wide v10, v1, Lx7/f;->g:J

    iget-wide v12, v1, Lx7/f;->h:J

    move-object v4, v2

    invoke-virtual/range {v3 .. v13}, Lv7/h0$a;->r(Lv7/u;IILt6/u1;ILjava/lang/Object;JJ)V

    if-nez p6, :cond_2

    invoke-virtual {p0}, Lx7/i;->H()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-direct {p0}, Lx7/i;->Q()V

    goto :goto_0

    :cond_0
    invoke-direct/range {p0 .. p1}, Lx7/i;->G(Lx7/f;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, v0, Lx7/i;->v:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-direct {p0, v1}, Lx7/i;->C(I)Lx7/a;

    iget-object v1, v0, Lx7/i;->v:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-wide v1, v0, Lx7/i;->E:J

    iput-wide v1, v0, Lx7/i;->D:J

    :cond_1
    :goto_0
    iget-object v1, v0, Lx7/i;->f:Lv7/w0$a;

    invoke-interface {v1, p0}, Lv7/w0$a;->a(Lv7/w0;)V

    :cond_2
    return-void
.end method

.method public L(Lx7/f;JJ)V
    .locals 15

    move-object v0, p0

    move-object/from16 v1, p1

    const/4 v2, 0x0

    iput-object v2, v0, Lx7/i;->A:Lx7/f;

    iget-object v2, v0, Lx7/i;->e:Lx7/j;

    invoke-interface {v2, v1}, Lx7/j;->i(Lx7/f;)V

    new-instance v2, Lv7/u;

    iget-wide v4, v1, Lx7/f;->a:J

    iget-object v6, v1, Lx7/f;->b:Ls8/n;

    invoke-virtual/range {p1 .. p1}, Lx7/f;->f()Landroid/net/Uri;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lx7/f;->e()Ljava/util/Map;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Lx7/f;->a()J

    move-result-wide v13

    move-object v3, v2

    move-wide/from16 v9, p2

    move-wide/from16 v11, p4

    invoke-direct/range {v3 .. v14}, Lv7/u;-><init>(JLs8/n;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    iget-object v3, v0, Lx7/i;->s:Ls8/d0;

    iget-wide v4, v1, Lx7/f;->a:J

    invoke-interface {v3, v4, v5}, Ls8/d0;->c(J)V

    iget-object v3, v0, Lx7/i;->r:Lv7/h0$a;

    iget v5, v1, Lx7/f;->c:I

    iget v6, v0, Lx7/i;->a:I

    iget-object v7, v1, Lx7/f;->d:Lt6/u1;

    iget v8, v1, Lx7/f;->e:I

    iget-object v9, v1, Lx7/f;->f:Ljava/lang/Object;

    iget-wide v10, v1, Lx7/f;->g:J

    iget-wide v12, v1, Lx7/f;->h:J

    move-object v4, v2

    invoke-virtual/range {v3 .. v13}, Lv7/h0$a;->u(Lv7/u;IILt6/u1;ILjava/lang/Object;JJ)V

    iget-object v1, v0, Lx7/i;->f:Lv7/w0$a;

    invoke-interface {v1, p0}, Lv7/w0$a;->a(Lv7/w0;)V

    return-void
.end method

.method public M(Lx7/f;JJLjava/io/IOException;I)Ls8/e0$c;
    .locals 30

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual/range {p1 .. p1}, Lx7/f;->a()J

    move-result-wide v12

    invoke-direct/range {p0 .. p1}, Lx7/i;->G(Lx7/f;)Z

    move-result v14

    iget-object v2, v0, Lx7/i;->v:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v15, 0x1

    add-int/lit8 v10, v2, -0x1

    const-wide/16 v2, 0x0

    cmp-long v2, v12, v2

    const/4 v11, 0x0

    if-eqz v2, :cond_1

    if-eqz v14, :cond_1

    invoke-direct {v0, v10}, Lx7/i;->F(I)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    move v8, v11

    goto :goto_1

    :cond_1
    :goto_0
    move v8, v15

    :goto_1
    new-instance v9, Lv7/u;

    iget-wide v3, v1, Lx7/f;->a:J

    iget-object v5, v1, Lx7/f;->b:Ls8/n;

    invoke-virtual/range {p1 .. p1}, Lx7/f;->f()Landroid/net/Uri;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Lx7/f;->e()Ljava/util/Map;

    move-result-object v7

    move-object v2, v9

    move v15, v8

    move/from16 v17, v14

    move-object v14, v9

    move-wide/from16 v8, p2

    move/from16 v29, v10

    move-wide/from16 v10, p4

    invoke-direct/range {v2 .. v13}, Lv7/u;-><init>(JLs8/n;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    new-instance v2, Lv7/x;

    iget v3, v1, Lx7/f;->c:I

    iget v4, v0, Lx7/i;->a:I

    iget-object v5, v1, Lx7/f;->d:Lt6/u1;

    iget v6, v1, Lx7/f;->e:I

    iget-object v7, v1, Lx7/f;->f:Ljava/lang/Object;

    iget-wide v8, v1, Lx7/f;->g:J

    invoke-static {v8, v9}, Lt8/r0;->a1(J)J

    move-result-wide v24

    iget-wide v8, v1, Lx7/f;->h:J

    invoke-static {v8, v9}, Lt8/r0;->a1(J)J

    move-result-wide v26

    move-object/from16 v18, v2

    move/from16 v19, v3

    move/from16 v20, v4

    move-object/from16 v21, v5

    move/from16 v22, v6

    move-object/from16 v23, v7

    invoke-direct/range {v18 .. v27}, Lv7/x;-><init>(IILt6/u1;ILjava/lang/Object;JJ)V

    new-instance v3, Ls8/d0$c;

    move-object/from16 v4, p6

    move/from16 v5, p7

    invoke-direct {v3, v14, v2, v4, v5}, Ls8/d0$c;-><init>(Lv7/u;Lv7/x;Ljava/io/IOException;I)V

    iget-object v2, v0, Lx7/i;->e:Lx7/j;

    iget-object v5, v0, Lx7/i;->s:Ls8/d0;

    invoke-interface {v2, v1, v15, v3, v5}, Lx7/j;->g(Lx7/f;ZLs8/d0$c;Ls8/d0;)Z

    move-result v2

    if-eqz v2, :cond_4

    if-eqz v15, :cond_3

    sget-object v2, Ls8/e0;->f:Ls8/e0$c;

    if-eqz v17, :cond_5

    move/from16 v6, v29

    invoke-direct {v0, v6}, Lx7/i;->C(I)Lx7/a;

    move-result-object v6

    if-ne v6, v1, :cond_2

    const/4 v11, 0x1

    goto :goto_2

    :cond_2
    const/4 v11, 0x0

    :goto_2
    invoke-static {v11}, Lt8/a;->g(Z)V

    iget-object v6, v0, Lx7/i;->v:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_5

    iget-wide v6, v0, Lx7/i;->E:J

    iput-wide v6, v0, Lx7/i;->D:J

    goto :goto_3

    :cond_3
    const-string v2, "ChunkSampleStream"

    const-string v6, "Ignoring attempt to cancel non-cancelable load."

    invoke-static {v2, v6}, Lt8/s;->i(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    const/4 v2, 0x0

    :cond_5
    :goto_3
    if-nez v2, :cond_7

    iget-object v2, v0, Lx7/i;->s:Ls8/d0;

    invoke-interface {v2, v3}, Ls8/d0;->d(Ls8/d0$c;)J

    move-result-wide v2

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v6, v2, v6

    if-eqz v6, :cond_6

    const/4 v6, 0x0

    invoke-static {v6, v2, v3}, Ls8/e0;->h(ZJ)Ls8/e0$c;

    move-result-object v2

    goto :goto_4

    :cond_6
    sget-object v2, Ls8/e0;->g:Ls8/e0$c;

    :cond_7
    :goto_4
    invoke-virtual {v2}, Ls8/e0$c;->c()Z

    move-result v3

    const/4 v6, 0x1

    xor-int/2addr v3, v6

    iget-object v6, v0, Lx7/i;->r:Lv7/h0$a;

    iget v7, v1, Lx7/f;->c:I

    iget v8, v0, Lx7/i;->a:I

    iget-object v9, v1, Lx7/f;->d:Lt6/u1;

    iget v10, v1, Lx7/f;->e:I

    iget-object v11, v1, Lx7/f;->f:Ljava/lang/Object;

    iget-wide v12, v1, Lx7/f;->g:J

    iget-wide v4, v1, Lx7/f;->h:J

    move-object/from16 v16, v6

    move-object/from16 v17, v14

    move/from16 v18, v7

    move/from16 v19, v8

    move-object/from16 v20, v9

    move/from16 v21, v10

    move-object/from16 v22, v11

    move-wide/from16 v23, v12

    move-wide/from16 v25, v4

    move-object/from16 v27, p6

    move/from16 v28, v3

    invoke-virtual/range {v16 .. v28}, Lv7/h0$a;->w(Lv7/u;IILt6/u1;ILjava/lang/Object;JJLjava/io/IOException;Z)V

    if-eqz v3, :cond_8

    const/4 v3, 0x0

    iput-object v3, v0, Lx7/i;->A:Lx7/f;

    iget-object v3, v0, Lx7/i;->s:Ls8/d0;

    iget-wide v4, v1, Lx7/f;->a:J

    invoke-interface {v3, v4, v5}, Ls8/d0;->c(J)V

    iget-object v1, v0, Lx7/i;->f:Lv7/w0$a;

    invoke-interface {v1, v0}, Lv7/w0$a;->a(Lv7/w0;)V

    :cond_8
    return-object v2
.end method

.method public O()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lx7/i;->P(Lx7/i$b;)V

    return-void
.end method

.method public P(Lx7/i$b;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx7/i$b<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lx7/i;->C:Lx7/i$b;

    iget-object p1, p0, Lx7/i;->x:Lv7/u0;

    invoke-virtual {p1}, Lv7/u0;->R()V

    iget-object p1, p0, Lx7/i;->y:[Lv7/u0;

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p1, v1

    invoke-virtual {v2}, Lv7/u0;->R()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lx7/i;->t:Ls8/e0;

    invoke-virtual {p1, p0}, Ls8/e0;->m(Ls8/e0$f;)V

    return-void
.end method

.method public R(J)V
    .locals 8

    iput-wide p1, p0, Lx7/i;->E:J

    invoke-virtual {p0}, Lx7/i;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    iput-wide p1, p0, Lx7/i;->D:J

    return-void

    :cond_0
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, Lx7/i;->v:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_3

    iget-object v2, p0, Lx7/i;->v:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lx7/a;

    iget-wide v3, v2, Lx7/f;->g:J

    cmp-long v3, v3, p1

    if-nez v3, :cond_1

    iget-wide v4, v2, Lx7/a;->k:J

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v4, v6

    if-nez v4, :cond_1

    goto :goto_2

    :cond_1
    if-lez v3, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    const/4 v2, 0x0

    :goto_2
    const/4 v1, 0x1

    if-eqz v2, :cond_4

    iget-object v3, p0, Lx7/i;->x:Lv7/u0;

    invoke-virtual {v2, v0}, Lx7/a;->i(I)I

    move-result v2

    invoke-virtual {v3, v2}, Lv7/u0;->Y(I)Z

    move-result v2

    goto :goto_4

    :cond_4
    iget-object v2, p0, Lx7/i;->x:Lv7/u0;

    invoke-virtual {p0}, Lx7/i;->b()J

    move-result-wide v3

    cmp-long v3, p1, v3

    if-gez v3, :cond_5

    move v3, v1

    goto :goto_3

    :cond_5
    move v3, v0

    :goto_3
    invoke-virtual {v2, p1, p2, v3}, Lv7/u0;->Z(JZ)Z

    move-result v2

    :goto_4
    if-eqz v2, :cond_6

    iget-object v2, p0, Lx7/i;->x:Lv7/u0;

    invoke-virtual {v2}, Lv7/u0;->C()I

    move-result v2

    invoke-direct {p0, v2, v0}, Lx7/i;->N(II)I

    move-result v2

    iput v2, p0, Lx7/i;->F:I

    iget-object v2, p0, Lx7/i;->y:[Lv7/u0;

    array-length v3, v2

    :goto_5
    if-ge v0, v3, :cond_9

    aget-object v4, v2, v0

    invoke-virtual {v4, p1, p2, v1}, Lv7/u0;->Z(JZ)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_5

    :cond_6
    iput-wide p1, p0, Lx7/i;->D:J

    iput-boolean v0, p0, Lx7/i;->H:Z

    iget-object p1, p0, Lx7/i;->v:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    iput v0, p0, Lx7/i;->F:I

    iget-object p1, p0, Lx7/i;->t:Ls8/e0;

    invoke-virtual {p1}, Ls8/e0;->j()Z

    move-result p1

    if-eqz p1, :cond_8

    iget-object p1, p0, Lx7/i;->x:Lv7/u0;

    invoke-virtual {p1}, Lv7/u0;->r()V

    iget-object p1, p0, Lx7/i;->y:[Lv7/u0;

    array-length p2, p1

    :goto_6
    if-ge v0, p2, :cond_7

    aget-object v1, p1, v0

    invoke-virtual {v1}, Lv7/u0;->r()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_6

    :cond_7
    iget-object p1, p0, Lx7/i;->t:Ls8/e0;

    invoke-virtual {p1}, Ls8/e0;->f()V

    goto :goto_7

    :cond_8
    iget-object p1, p0, Lx7/i;->t:Ls8/e0;

    invoke-virtual {p1}, Ls8/e0;->g()V

    invoke-direct {p0}, Lx7/i;->Q()V

    :cond_9
    :goto_7
    return-void
.end method

.method public S(JI)Lx7/i$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JI)",
            "Lx7/i<",
            "TT;>.a;"
        }
    .end annotation

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lx7/i;->y:[Lv7/u0;

    array-length v1, v1

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lx7/i;->b:[I

    aget v1, v1, v0

    if-ne v1, p3, :cond_0

    iget-object p3, p0, Lx7/i;->d:[Z

    aget-boolean p3, p3, v0

    const/4 v1, 0x1

    xor-int/2addr p3, v1

    invoke-static {p3}, Lt8/a;->g(Z)V

    iget-object p3, p0, Lx7/i;->d:[Z

    aput-boolean v1, p3, v0

    iget-object p3, p0, Lx7/i;->y:[Lv7/u0;

    aget-object p3, p3, v0

    invoke-virtual {p3, p1, p2, v1}, Lv7/u0;->Z(JZ)Z

    new-instance p1, Lx7/i$a;

    iget-object p2, p0, Lx7/i;->y:[Lv7/u0;

    aget-object p2, p2, v0

    invoke-direct {p1, p0, p0, p2, v0}, Lx7/i$a;-><init>(Lx7/i;Lx7/i;Lv7/u0;I)V

    return-object p1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public a()V
    .locals 1

    iget-object v0, p0, Lx7/i;->t:Ls8/e0;

    invoke-virtual {v0}, Ls8/e0;->a()V

    iget-object v0, p0, Lx7/i;->x:Lv7/u0;

    invoke-virtual {v0}, Lv7/u0;->N()V

    iget-object v0, p0, Lx7/i;->t:Ls8/e0;

    invoke-virtual {v0}, Ls8/e0;->j()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lx7/i;->e:Lx7/j;

    invoke-interface {v0}, Lx7/j;->a()V

    :cond_0
    return-void
.end method

.method public b()J
    .locals 2

    invoke-virtual {p0}, Lx7/i;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lx7/i;->D:J

    return-wide v0

    :cond_0
    iget-boolean v0, p0, Lx7/i;->H:Z

    if-eqz v0, :cond_1

    const-wide/high16 v0, -0x8000000000000000L

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lx7/i;->E()Lx7/a;

    move-result-object v0

    iget-wide v0, v0, Lx7/f;->h:J

    :goto_0
    return-wide v0
.end method

.method public c(JLt6/u3;)J
    .locals 1

    iget-object v0, p0, Lx7/i;->e:Lx7/j;

    invoke-interface {v0, p1, p2, p3}, Lx7/j;->c(JLt6/u3;)J

    move-result-wide p1

    return-wide p1
.end method

.method public d()Z
    .locals 2

    invoke-virtual {p0}, Lx7/i;->H()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lx7/i;->x:Lv7/u0;

    iget-boolean v1, p0, Lx7/i;->H:Z

    invoke-virtual {v0, v1}, Lv7/u0;->K(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public e(J)Z
    .locals 23

    move-object/from16 v0, p0

    iget-boolean v1, v0, Lx7/i;->H:Z

    const/4 v2, 0x0

    if-nez v1, :cond_8

    iget-object v1, v0, Lx7/i;->t:Ls8/e0;

    invoke-virtual {v1}, Ls8/e0;->j()Z

    move-result v1

    if-nez v1, :cond_8

    iget-object v1, v0, Lx7/i;->t:Ls8/e0;

    invoke-virtual {v1}, Ls8/e0;->i()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_3

    :cond_0
    invoke-virtual/range {p0 .. p0}, Lx7/i;->H()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    iget-wide v4, v0, Lx7/i;->D:J

    goto :goto_0

    :cond_1
    iget-object v3, v0, Lx7/i;->w:Ljava/util/List;

    invoke-direct/range {p0 .. p0}, Lx7/i;->E()Lx7/a;

    move-result-object v4

    iget-wide v4, v4, Lx7/f;->h:J

    :goto_0
    move-object v11, v3

    move-wide v9, v4

    iget-object v6, v0, Lx7/i;->e:Lx7/j;

    iget-object v12, v0, Lx7/i;->u:Lx7/h;

    move-wide/from16 v7, p1

    invoke-interface/range {v6 .. v12}, Lx7/j;->j(JJLjava/util/List;Lx7/h;)V

    iget-object v3, v0, Lx7/i;->u:Lx7/h;

    iget-boolean v4, v3, Lx7/h;->b:Z

    iget-object v5, v3, Lx7/h;->a:Lx7/f;

    invoke-virtual {v3}, Lx7/h;->a()V

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v3, 0x1

    if-eqz v4, :cond_2

    iput-wide v6, v0, Lx7/i;->D:J

    iput-boolean v3, v0, Lx7/i;->H:Z

    return v3

    :cond_2
    if-nez v5, :cond_3

    return v2

    :cond_3
    iput-object v5, v0, Lx7/i;->A:Lx7/f;

    invoke-direct {v0, v5}, Lx7/i;->G(Lx7/f;)Z

    move-result v4

    if-eqz v4, :cond_6

    move-object v4, v5

    check-cast v4, Lx7/a;

    if-eqz v1, :cond_5

    iget-wide v8, v4, Lx7/f;->g:J

    iget-wide v10, v0, Lx7/i;->D:J

    cmp-long v1, v8, v10

    if-eqz v1, :cond_4

    iget-object v1, v0, Lx7/i;->x:Lv7/u0;

    invoke-virtual {v1, v10, v11}, Lv7/u0;->b0(J)V

    iget-object v1, v0, Lx7/i;->y:[Lv7/u0;

    array-length v8, v1

    :goto_1
    if-ge v2, v8, :cond_4

    aget-object v9, v1, v2

    iget-wide v10, v0, Lx7/i;->D:J

    invoke-virtual {v9, v10, v11}, Lv7/u0;->b0(J)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_4
    iput-wide v6, v0, Lx7/i;->D:J

    :cond_5
    iget-object v1, v0, Lx7/i;->z:Lx7/c;

    invoke-virtual {v4, v1}, Lx7/a;->k(Lx7/c;)V

    iget-object v1, v0, Lx7/i;->v:Ljava/util/ArrayList;

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_6
    instance-of v1, v5, Lx7/m;

    if-eqz v1, :cond_7

    move-object v1, v5

    check-cast v1, Lx7/m;

    iget-object v2, v0, Lx7/i;->z:Lx7/c;

    invoke-virtual {v1, v2}, Lx7/m;->g(Lx7/g$b;)V

    :cond_7
    :goto_2
    iget-object v1, v0, Lx7/i;->t:Ls8/e0;

    iget-object v2, v0, Lx7/i;->s:Ls8/d0;

    iget v4, v5, Lx7/f;->c:I

    invoke-interface {v2, v4}, Ls8/d0;->a(I)I

    move-result v2

    invoke-virtual {v1, v5, v0, v2}, Ls8/e0;->n(Ls8/e0$e;Ls8/e0$b;I)J

    move-result-wide v10

    iget-object v12, v0, Lx7/i;->r:Lv7/h0$a;

    new-instance v13, Lv7/u;

    iget-wide v7, v5, Lx7/f;->a:J

    iget-object v9, v5, Lx7/f;->b:Ls8/n;

    move-object v6, v13

    invoke-direct/range {v6 .. v11}, Lv7/u;-><init>(JLs8/n;J)V

    iget v14, v5, Lx7/f;->c:I

    iget v15, v0, Lx7/i;->a:I

    iget-object v1, v5, Lx7/f;->d:Lt6/u1;

    iget v2, v5, Lx7/f;->e:I

    iget-object v4, v5, Lx7/f;->f:Ljava/lang/Object;

    iget-wide v6, v5, Lx7/f;->g:J

    iget-wide v8, v5, Lx7/f;->h:J

    move-object/from16 v16, v1

    move/from16 v17, v2

    move-object/from16 v18, v4

    move-wide/from16 v19, v6

    move-wide/from16 v21, v8

    invoke-virtual/range {v12 .. v22}, Lv7/h0$a;->A(Lv7/u;IILt6/u1;ILjava/lang/Object;JJ)V

    return v3

    :cond_8
    :goto_3
    return v2
.end method

.method public f()J
    .locals 4

    iget-boolean v0, p0, Lx7/i;->H:Z

    if-eqz v0, :cond_0

    const-wide/high16 v0, -0x8000000000000000L

    return-wide v0

    :cond_0
    invoke-virtual {p0}, Lx7/i;->H()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-wide v0, p0, Lx7/i;->D:J

    return-wide v0

    :cond_1
    iget-wide v0, p0, Lx7/i;->E:J

    invoke-direct {p0}, Lx7/i;->E()Lx7/a;

    move-result-object v2

    invoke-virtual {v2}, Lx7/n;->h()Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_0

    :cond_2
    iget-object v2, p0, Lx7/i;->v:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x1

    if-le v2, v3, :cond_3

    iget-object v2, p0, Lx7/i;->v:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x2

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lx7/a;

    goto :goto_0

    :cond_3
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_4

    iget-wide v2, v2, Lx7/f;->h:J

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    :cond_4
    iget-object v2, p0, Lx7/i;->x:Lv7/u0;

    invoke-virtual {v2}, Lv7/u0;->z()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    return-wide v0
.end method

.method public g(J)V
    .locals 3

    iget-object v0, p0, Lx7/i;->t:Ls8/e0;

    invoke-virtual {v0}, Ls8/e0;->i()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {p0}, Lx7/i;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lx7/i;->t:Ls8/e0;

    invoke-virtual {v0}, Ls8/e0;->j()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lx7/i;->A:Lx7/f;

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx7/f;

    invoke-direct {p0, v0}, Lx7/i;->G(Lx7/f;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lx7/i;->v:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-direct {p0, v1}, Lx7/i;->F(I)Z

    move-result v1

    if-eqz v1, :cond_1

    return-void

    :cond_1
    iget-object v1, p0, Lx7/i;->e:Lx7/j;

    iget-object v2, p0, Lx7/i;->w:Ljava/util/List;

    invoke-interface {v1, p1, p2, v0, v2}, Lx7/j;->d(JLx7/f;Ljava/util/List;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lx7/i;->t:Ls8/e0;

    invoke-virtual {p1}, Ls8/e0;->f()V

    invoke-direct {p0, v0}, Lx7/i;->G(Lx7/f;)Z

    move-result p1

    if-eqz p1, :cond_2

    check-cast v0, Lx7/a;

    iput-object v0, p0, Lx7/i;->G:Lx7/a;

    :cond_2
    return-void

    :cond_3
    iget-object v0, p0, Lx7/i;->e:Lx7/j;

    iget-object v1, p0, Lx7/i;->w:Ljava/util/List;

    invoke-interface {v0, p1, p2, v1}, Lx7/j;->h(JLjava/util/List;)I

    move-result p1

    iget-object p2, p0, Lx7/i;->v:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-ge p1, p2, :cond_4

    invoke-direct {p0, p1}, Lx7/i;->B(I)V

    :cond_4
    :goto_0
    return-void
.end method

.method public bridge synthetic h(Ls8/e0$e;JJLjava/io/IOException;I)Ls8/e0$c;
    .locals 0

    check-cast p1, Lx7/f;

    invoke-virtual/range {p0 .. p7}, Lx7/i;->M(Lx7/f;JJLjava/io/IOException;I)Ls8/e0$c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic i(Ls8/e0$e;JJZ)V
    .locals 0

    check-cast p1, Lx7/f;

    invoke-virtual/range {p0 .. p6}, Lx7/i;->K(Lx7/f;JJZ)V

    return-void
.end method

.method public isLoading()Z
    .locals 1

    iget-object v0, p0, Lx7/i;->t:Ls8/e0;

    invoke-virtual {v0}, Ls8/e0;->j()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic m(Ls8/e0$e;JJ)V
    .locals 0

    check-cast p1, Lx7/f;

    invoke-virtual/range {p0 .. p5}, Lx7/i;->L(Lx7/f;JJ)V

    return-void
.end method

.method public n()V
    .locals 4

    iget-object v0, p0, Lx7/i;->x:Lv7/u0;

    invoke-virtual {v0}, Lv7/u0;->T()V

    iget-object v0, p0, Lx7/i;->y:[Lv7/u0;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lv7/u0;->T()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lx7/i;->e:Lx7/j;

    invoke-interface {v0}, Lx7/j;->release()V

    iget-object v0, p0, Lx7/i;->C:Lx7/i$b;

    if-eqz v0, :cond_1

    invoke-interface {v0, p0}, Lx7/i$b;->d(Lx7/i;)V

    :cond_1
    return-void
.end method

.method public p(J)I
    .locals 3

    invoke-virtual {p0}, Lx7/i;->H()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lx7/i;->x:Lv7/u0;

    iget-boolean v2, p0, Lx7/i;->H:Z

    invoke-virtual {v0, p1, p2, v2}, Lv7/u0;->E(JZ)I

    move-result p1

    iget-object p2, p0, Lx7/i;->G:Lx7/a;

    if-eqz p2, :cond_1

    invoke-virtual {p2, v1}, Lx7/a;->i(I)I

    move-result p2

    iget-object v0, p0, Lx7/i;->x:Lv7/u0;

    invoke-virtual {v0}, Lv7/u0;->C()I

    move-result v0

    sub-int/2addr p2, v0

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    :cond_1
    iget-object p2, p0, Lx7/i;->x:Lv7/u0;

    invoke-virtual {p2, p1}, Lv7/u0;->e0(I)V

    invoke-direct {p0}, Lx7/i;->I()V

    return p1
.end method

.method public q(Lt6/v1;Lw6/g;I)I
    .locals 3

    invoke-virtual {p0}, Lx7/i;->H()Z

    move-result v0

    const/4 v1, -0x3

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lx7/i;->G:Lx7/a;

    if-eqz v0, :cond_1

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lx7/a;->i(I)I

    move-result v0

    iget-object v2, p0, Lx7/i;->x:Lv7/u0;

    invoke-virtual {v2}, Lv7/u0;->C()I

    move-result v2

    if-gt v0, v2, :cond_1

    return v1

    :cond_1
    invoke-direct {p0}, Lx7/i;->I()V

    iget-object v0, p0, Lx7/i;->x:Lv7/u0;

    iget-boolean v1, p0, Lx7/i;->H:Z

    invoke-virtual {v0, p1, p2, p3, v1}, Lv7/u0;->S(Lt6/v1;Lw6/g;IZ)I

    move-result p1

    return p1
.end method

.method public s(JZ)V
    .locals 4

    invoke-virtual {p0}, Lx7/i;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lx7/i;->x:Lv7/u0;

    invoke-virtual {v0}, Lv7/u0;->x()I

    move-result v0

    iget-object v1, p0, Lx7/i;->x:Lv7/u0;

    const/4 v2, 0x1

    invoke-virtual {v1, p1, p2, p3, v2}, Lv7/u0;->q(JZZ)V

    iget-object p1, p0, Lx7/i;->x:Lv7/u0;

    invoke-virtual {p1}, Lv7/u0;->x()I

    move-result p1

    if-le p1, v0, :cond_1

    iget-object p2, p0, Lx7/i;->x:Lv7/u0;

    invoke-virtual {p2}, Lv7/u0;->y()J

    move-result-wide v0

    const/4 p2, 0x0

    :goto_0
    iget-object v2, p0, Lx7/i;->y:[Lv7/u0;

    array-length v3, v2

    if-ge p2, v3, :cond_1

    aget-object v2, v2, p2

    iget-object v3, p0, Lx7/i;->d:[Z

    aget-boolean v3, v3, p2

    invoke-virtual {v2, v0, v1, p3, v3}, Lv7/u0;->q(JZZ)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_1
    invoke-direct {p0, p1}, Lx7/i;->A(I)V

    return-void
.end method
