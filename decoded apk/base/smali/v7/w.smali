.class public final Lv7/w;
.super Lv7/h1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv7/w$b;,
        Lv7/w$a;
    }
.end annotation


# instance fields
.field private A:Lv7/w$a;

.field private B:Lv7/v;

.field private C:Z

.field private D:Z

.field private E:Z

.field private final x:Z

.field private final y:Lt6/d4$d;

.field private final z:Lt6/d4$b;


# direct methods
.method public constructor <init>(Lv7/a0;Z)V
    .locals 1

    invoke-direct {p0, p1}, Lv7/h1;-><init>(Lv7/a0;)V

    const/4 v0, 0x1

    if-eqz p2, :cond_0

    invoke-interface {p1}, Lv7/a0;->o()Z

    move-result p2

    if-eqz p2, :cond_0

    move p2, v0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    iput-boolean p2, p0, Lv7/w;->x:Z

    new-instance p2, Lt6/d4$d;

    invoke-direct {p2}, Lt6/d4$d;-><init>()V

    iput-object p2, p0, Lv7/w;->y:Lt6/d4$d;

    new-instance p2, Lt6/d4$b;

    invoke-direct {p2}, Lt6/d4$b;-><init>()V

    iput-object p2, p0, Lv7/w;->z:Lt6/d4$b;

    invoke-interface {p1}, Lv7/a0;->p()Lt6/d4;

    move-result-object p2

    if-eqz p2, :cond_1

    const/4 p1, 0x0

    invoke-static {p2, p1, p1}, Lv7/w$a;->A(Lt6/d4;Ljava/lang/Object;Ljava/lang/Object;)Lv7/w$a;

    move-result-object p1

    iput-object p1, p0, Lv7/w;->A:Lv7/w$a;

    iput-boolean v0, p0, Lv7/w;->E:Z

    goto :goto_1

    :cond_1
    invoke-interface {p1}, Lv7/a0;->d()Lt6/c2;

    move-result-object p1

    invoke-static {p1}, Lv7/w$a;->z(Lt6/c2;)Lv7/w$a;

    move-result-object p1

    iput-object p1, p0, Lv7/w;->A:Lv7/w$a;

    :goto_1
    return-void
.end method

.method private X(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lv7/w;->A:Lv7/w$a;

    invoke-static {v0}, Lv7/w$a;->x(Lv7/w$a;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lv7/w;->A:Lv7/w$a;

    invoke-static {v0}, Lv7/w$a;->x(Lv7/w$a;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lv7/w$a;->t:Ljava/lang/Object;

    :cond_0
    return-object p1
.end method

.method private Y(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lv7/w;->A:Lv7/w$a;

    invoke-static {v0}, Lv7/w$a;->x(Lv7/w$a;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v0, Lv7/w$a;->t:Ljava/lang/Object;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lv7/w;->A:Lv7/w$a;

    invoke-static {p1}, Lv7/w$a;->x(Lv7/w$a;)Ljava/lang/Object;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method private a0(J)V
    .locals 5

    iget-object v0, p0, Lv7/w;->B:Lv7/v;

    iget-object v1, p0, Lv7/w;->A:Lv7/w$a;

    iget-object v2, v0, Lv7/v;->a:Lv7/a0$b;

    iget-object v2, v2, Lv7/z;->a:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Lv7/w$a;->g(Ljava/lang/Object;)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    return-void

    :cond_0
    iget-object v2, p0, Lv7/w;->A:Lv7/w$a;

    iget-object v3, p0, Lv7/w;->z:Lt6/d4$b;

    invoke-virtual {v2, v1, v3}, Lt6/d4;->k(ILt6/d4$b;)Lt6/d4$b;

    move-result-object v1

    iget-wide v1, v1, Lt6/d4$b;->d:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v3, v1, v3

    if-eqz v3, :cond_1

    cmp-long v3, p1, v1

    if-ltz v3, :cond_1

    const-wide/16 p1, 0x1

    sub-long/2addr v1, p1

    const-wide/16 p1, 0x0

    invoke-static {p1, p2, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    :cond_1
    invoke-virtual {v0, p1, p2}, Lv7/v;->u(J)V

    return-void
.end method


# virtual methods
.method public E()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lv7/w;->D:Z

    iput-boolean v0, p0, Lv7/w;->C:Z

    invoke-super {p0}, Lv7/g;->E()V

    return-void
.end method

.method protected N(Lv7/a0$b;)Lv7/a0$b;
    .locals 1

    iget-object v0, p1, Lv7/z;->a:Ljava/lang/Object;

    invoke-direct {p0, v0}, Lv7/w;->X(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Lv7/a0$b;->c(Ljava/lang/Object;)Lv7/a0$b;

    move-result-object p1

    return-object p1
.end method

.method protected T(Lt6/d4;)V
    .locals 14

    iget-boolean v0, p0, Lv7/w;->D:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lv7/w;->A:Lv7/w$a;

    invoke-virtual {v0, p1}, Lv7/w$a;->y(Lt6/d4;)Lv7/w$a;

    move-result-object p1

    iput-object p1, p0, Lv7/w;->A:Lv7/w$a;

    iget-object p1, p0, Lv7/w;->B:Lv7/v;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lv7/v;->m()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lv7/w;->a0(J)V

    goto/16 :goto_3

    :cond_0
    invoke-virtual {p1}, Lt6/d4;->v()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lv7/w;->E:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lv7/w;->A:Lv7/w$a;

    invoke-virtual {v0, p1}, Lv7/w$a;->y(Lt6/d4;)Lv7/w$a;

    move-result-object p1

    goto :goto_0

    :cond_1
    sget-object v0, Lt6/d4$d;->C:Ljava/lang/Object;

    sget-object v1, Lv7/w$a;->t:Ljava/lang/Object;

    invoke-static {p1, v0, v1}, Lv7/w$a;->A(Lt6/d4;Ljava/lang/Object;Ljava/lang/Object;)Lv7/w$a;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lv7/w;->A:Lv7/w$a;

    goto/16 :goto_3

    :cond_2
    iget-object v0, p0, Lv7/w;->y:Lt6/d4$d;

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Lt6/d4;->s(ILt6/d4$d;)Lt6/d4$d;

    iget-object v0, p0, Lv7/w;->y:Lt6/d4$d;

    invoke-virtual {v0}, Lt6/d4$d;->f()J

    move-result-wide v2

    iget-object v0, p0, Lv7/w;->y:Lt6/d4$d;

    iget-object v0, v0, Lt6/d4$d;->a:Ljava/lang/Object;

    iget-object v4, p0, Lv7/w;->B:Lv7/v;

    if-eqz v4, :cond_3

    invoke-virtual {v4}, Lv7/v;->n()J

    move-result-wide v4

    iget-object v6, p0, Lv7/w;->A:Lv7/w$a;

    iget-object v7, p0, Lv7/w;->B:Lv7/v;

    iget-object v7, v7, Lv7/v;->a:Lv7/a0$b;

    iget-object v7, v7, Lv7/z;->a:Ljava/lang/Object;

    iget-object v8, p0, Lv7/w;->z:Lt6/d4$b;

    invoke-virtual {v6, v7, v8}, Lt6/d4;->m(Ljava/lang/Object;Lt6/d4$b;)Lt6/d4$b;

    iget-object v6, p0, Lv7/w;->z:Lt6/d4$b;

    invoke-virtual {v6}, Lt6/d4$b;->r()J

    move-result-wide v6

    add-long/2addr v6, v4

    iget-object v4, p0, Lv7/w;->A:Lv7/w$a;

    iget-object v5, p0, Lv7/w;->y:Lt6/d4$d;

    invoke-virtual {v4, v1, v5}, Lt6/d4;->s(ILt6/d4$d;)Lt6/d4$d;

    move-result-object v1

    invoke-virtual {v1}, Lt6/d4$d;->f()J

    move-result-wide v4

    cmp-long v1, v6, v4

    if-eqz v1, :cond_3

    move-wide v12, v6

    goto :goto_1

    :cond_3
    move-wide v12, v2

    :goto_1
    iget-object v9, p0, Lv7/w;->y:Lt6/d4$d;

    iget-object v10, p0, Lv7/w;->z:Lt6/d4$b;

    const/4 v11, 0x0

    move-object v8, p1

    invoke-virtual/range {v8 .. v13}, Lt6/d4;->o(Lt6/d4$d;Lt6/d4$b;IJ)Landroid/util/Pair;

    move-result-object v1

    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    iget-boolean v1, p0, Lv7/w;->E:Z

    if-eqz v1, :cond_4

    iget-object v0, p0, Lv7/w;->A:Lv7/w$a;

    invoke-virtual {v0, p1}, Lv7/w$a;->y(Lt6/d4;)Lv7/w$a;

    move-result-object p1

    goto :goto_2

    :cond_4
    invoke-static {p1, v0, v2}, Lv7/w$a;->A(Lt6/d4;Ljava/lang/Object;Ljava/lang/Object;)Lv7/w$a;

    move-result-object p1

    :goto_2
    iput-object p1, p0, Lv7/w;->A:Lv7/w$a;

    iget-object p1, p0, Lv7/w;->B:Lv7/v;

    if-eqz p1, :cond_5

    invoke-direct {p0, v3, v4}, Lv7/w;->a0(J)V

    iget-object p1, p1, Lv7/v;->a:Lv7/a0$b;

    iget-object v0, p1, Lv7/z;->a:Ljava/lang/Object;

    invoke-direct {p0, v0}, Lv7/w;->Y(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Lv7/a0$b;->c(Ljava/lang/Object;)Lv7/a0$b;

    move-result-object p1

    goto :goto_4

    :cond_5
    :goto_3
    const/4 p1, 0x0

    :goto_4
    const/4 v0, 0x1

    iput-boolean v0, p0, Lv7/w;->E:Z

    iput-boolean v0, p0, Lv7/w;->D:Z

    iget-object v0, p0, Lv7/w;->A:Lv7/w$a;

    invoke-virtual {p0, v0}, Lv7/a;->D(Lt6/d4;)V

    if-eqz p1, :cond_6

    iget-object v0, p0, Lv7/w;->B:Lv7/v;

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv7/v;

    invoke-virtual {v0, p1}, Lv7/v;->d(Lv7/a0$b;)V

    :cond_6
    return-void
.end method

.method public V()V
    .locals 1

    iget-boolean v0, p0, Lv7/w;->x:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lv7/w;->C:Z

    invoke-virtual {p0}, Lv7/h1;->U()V

    :cond_0
    return-void
.end method

.method public W(Lv7/a0$b;Ls8/b;J)Lv7/v;
    .locals 1

    new-instance v0, Lv7/v;

    invoke-direct {v0, p1, p2, p3, p4}, Lv7/v;-><init>(Lv7/a0$b;Ls8/b;J)V

    iget-object p2, p0, Lv7/h1;->v:Lv7/a0;

    invoke-virtual {v0, p2}, Lv7/v;->w(Lv7/a0;)V

    iget-boolean p2, p0, Lv7/w;->D:Z

    if-eqz p2, :cond_0

    iget-object p2, p1, Lv7/z;->a:Ljava/lang/Object;

    invoke-direct {p0, p2}, Lv7/w;->Y(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p2}, Lv7/a0$b;->c(Ljava/lang/Object;)Lv7/a0$b;

    move-result-object p1

    invoke-virtual {v0, p1}, Lv7/v;->d(Lv7/a0$b;)V

    goto :goto_0

    :cond_0
    iput-object v0, p0, Lv7/w;->B:Lv7/v;

    iget-boolean p1, p0, Lv7/w;->C:Z

    if-nez p1, :cond_1

    const/4 p1, 0x1

    iput-boolean p1, p0, Lv7/w;->C:Z

    invoke-virtual {p0}, Lv7/h1;->U()V

    :cond_1
    :goto_0
    return-object v0
.end method

.method public Z()Lt6/d4;
    .locals 1

    iget-object v0, p0, Lv7/w;->A:Lv7/w$a;

    return-object v0
.end method

.method public bridge synthetic e(Lv7/a0$b;Ls8/b;J)Lv7/y;
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, Lv7/w;->W(Lv7/a0$b;Ls8/b;J)Lv7/v;

    move-result-object p1

    return-object p1
.end method

.method public l(Lv7/y;)V
    .locals 1

    move-object v0, p1

    check-cast v0, Lv7/v;

    invoke-virtual {v0}, Lv7/v;->v()V

    iget-object v0, p0, Lv7/w;->B:Lv7/v;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lv7/w;->B:Lv7/v;

    :cond_0
    return-void
.end method

.method public n()V
    .locals 0

    return-void
.end method
