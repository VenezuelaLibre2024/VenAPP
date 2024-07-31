.class public final Lt6/d4$c;
.super Lt6/d4;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt6/d4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field private final f:Lcom/google/common/collect/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/collect/w<",
            "Lt6/d4$d;",
            ">;"
        }
    .end annotation
.end field

.field private final r:Lcom/google/common/collect/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/collect/w<",
            "Lt6/d4$b;",
            ">;"
        }
    .end annotation
.end field

.field private final s:[I

.field private final t:[I


# direct methods
.method public constructor <init>(Lcom/google/common/collect/w;Lcom/google/common/collect/w;[I)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/collect/w<",
            "Lt6/d4$d;",
            ">;",
            "Lcom/google/common/collect/w<",
            "Lt6/d4$b;",
            ">;[I)V"
        }
    .end annotation

    invoke-direct {p0}, Lt6/d4;-><init>()V

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    array-length v1, p3

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    invoke-static {v0}, Lt8/a;->a(Z)V

    iput-object p1, p0, Lt6/d4$c;->f:Lcom/google/common/collect/w;

    iput-object p2, p0, Lt6/d4$c;->r:Lcom/google/common/collect/w;

    iput-object p3, p0, Lt6/d4$c;->s:[I

    array-length p1, p3

    new-array p1, p1, [I

    iput-object p1, p0, Lt6/d4$c;->t:[I

    :goto_1
    array-length p1, p3

    if-ge v2, p1, :cond_1

    iget-object p1, p0, Lt6/d4$c;->t:[I

    aget p2, p3, v2

    aput v2, p1, p2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method


# virtual methods
.method public f(Z)I
    .locals 1

    invoke-virtual {p0}, Lt6/d4;->v()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    const/4 v0, 0x0

    if-eqz p1, :cond_1

    iget-object p1, p0, Lt6/d4$c;->s:[I

    aget v0, p1, v0

    :cond_1
    return v0
.end method

.method public g(Ljava/lang/Object;)I
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public h(Z)I
    .locals 1

    invoke-virtual {p0}, Lt6/d4;->v()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    if-eqz p1, :cond_1

    iget-object p1, p0, Lt6/d4$c;->s:[I

    invoke-virtual {p0}, Lt6/d4$c;->u()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    aget p1, p1, v0

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lt6/d4$c;->u()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    :goto_0
    return p1
.end method

.method public j(IIZ)I
    .locals 2

    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    return p1

    :cond_0
    invoke-virtual {p0, p3}, Lt6/d4$c;->h(Z)I

    move-result v1

    if-ne p1, v1, :cond_2

    const/4 p1, 0x2

    if-ne p2, p1, :cond_1

    invoke-virtual {p0, p3}, Lt6/d4$c;->f(Z)I

    move-result p1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    :goto_0
    return p1

    :cond_2
    if-eqz p3, :cond_3

    iget-object p2, p0, Lt6/d4$c;->s:[I

    iget-object p3, p0, Lt6/d4$c;->t:[I

    aget p1, p3, p1

    add-int/2addr p1, v0

    aget p1, p2, p1

    goto :goto_1

    :cond_3
    add-int/2addr p1, v0

    :goto_1
    return p1
.end method

.method public l(ILt6/d4$b;Z)Lt6/d4$b;
    .locals 10

    iget-object p3, p0, Lt6/d4$c;->r:Lcom/google/common/collect/w;

    invoke-interface {p3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lt6/d4$b;

    iget-object v1, p1, Lt6/d4$b;->a:Ljava/lang/Object;

    iget-object v2, p1, Lt6/d4$b;->b:Ljava/lang/Object;

    iget v3, p1, Lt6/d4$b;->c:I

    iget-wide v4, p1, Lt6/d4$b;->d:J

    iget-wide v6, p1, Lt6/d4$b;->e:J

    invoke-static {p1}, Lt6/d4$b;->c(Lt6/d4$b;)Lw7/c;

    move-result-object v8

    iget-boolean v9, p1, Lt6/d4$b;->f:Z

    move-object v0, p2

    invoke-virtual/range {v0 .. v9}, Lt6/d4$b;->w(Ljava/lang/Object;Ljava/lang/Object;IJJLw7/c;Z)Lt6/d4$b;

    return-object p2
.end method

.method public n()I
    .locals 1

    iget-object v0, p0, Lt6/d4$c;->r:Lcom/google/common/collect/w;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    return v0
.end method

.method public q(IIZ)I
    .locals 2

    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    return p1

    :cond_0
    invoke-virtual {p0, p3}, Lt6/d4$c;->f(Z)I

    move-result v1

    if-ne p1, v1, :cond_2

    const/4 p1, 0x2

    if-ne p2, p1, :cond_1

    invoke-virtual {p0, p3}, Lt6/d4$c;->h(Z)I

    move-result p1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    :goto_0
    return p1

    :cond_2
    if-eqz p3, :cond_3

    iget-object p2, p0, Lt6/d4$c;->s:[I

    iget-object p3, p0, Lt6/d4$c;->t:[I

    aget p1, p3, p1

    sub-int/2addr p1, v0

    aget p1, p2, p1

    goto :goto_1

    :cond_3
    sub-int/2addr p1, v0

    :goto_1
    return p1
.end method

.method public r(I)Ljava/lang/Object;
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public t(ILt6/d4$d;J)Lt6/d4$d;
    .locals 22

    move-object/from16 v15, p2

    move-object/from16 v0, p2

    move-object/from16 v13, p0

    iget-object v1, v13, Lt6/d4$c;->f:Lcom/google/common/collect/w;

    move/from16 v2, p1

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v14, v1

    check-cast v14, Lt6/d4$d;

    iget-object v1, v14, Lt6/d4$d;->a:Ljava/lang/Object;

    iget-object v2, v14, Lt6/d4$d;->c:Lt6/c2;

    iget-object v3, v14, Lt6/d4$d;->d:Ljava/lang/Object;

    iget-wide v4, v14, Lt6/d4$d;->e:J

    iget-wide v6, v14, Lt6/d4$d;->f:J

    iget-wide v8, v14, Lt6/d4$d;->r:J

    iget-boolean v10, v14, Lt6/d4$d;->s:Z

    iget-boolean v11, v14, Lt6/d4$d;->t:Z

    iget-object v12, v14, Lt6/d4$d;->v:Lt6/c2$g;

    move-object/from16 p3, v0

    move-object/from16 p1, v1

    iget-wide v0, v14, Lt6/d4$d;->x:J

    move-object/from16 p4, v2

    move-object v2, v14

    move-wide v13, v0

    iget-wide v0, v2, Lt6/d4$d;->y:J

    move-wide v15, v0

    iget v0, v2, Lt6/d4$d;->z:I

    move/from16 v17, v0

    iget v0, v2, Lt6/d4$d;->A:I

    move/from16 v18, v0

    iget-wide v0, v2, Lt6/d4$d;->B:J

    move-wide/from16 v19, v0

    move-object/from16 v1, p1

    move-object/from16 v0, p3

    move-object/from16 v21, v2

    move-object/from16 v2, p4

    invoke-virtual/range {v0 .. v20}, Lt6/d4$d;->j(Ljava/lang/Object;Lt6/c2;Ljava/lang/Object;JJJZZLt6/c2$g;JJIIJ)Lt6/d4$d;

    move-object/from16 v1, v21

    iget-boolean v0, v1, Lt6/d4$d;->w:Z

    move-object/from16 v1, p2

    iput-boolean v0, v1, Lt6/d4$d;->w:Z

    return-object v1
.end method

.method public u()I
    .locals 1

    iget-object v0, p0, Lt6/d4$c;->f:Lcom/google/common/collect/w;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    return v0
.end method
