.class public final Lv7/e;
.super Lv7/h1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv7/e$a;,
        Lv7/e$b;
    }
.end annotation


# instance fields
.field private final A:Z

.field private final B:Z

.field private final C:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lv7/d;",
            ">;"
        }
    .end annotation
.end field

.field private final D:Lt6/d4$d;

.field private E:Lv7/e$a;

.field private F:Lv7/e$b;

.field private G:J

.field private H:J

.field private final x:J

.field private final y:J

.field private final z:Z


# direct methods
.method public constructor <init>(Lv7/a0;JJZZZ)V
    .locals 2

    invoke-static {p1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lv7/a0;

    invoke-direct {p0, p1}, Lv7/h1;-><init>(Lv7/a0;)V

    const-wide/16 v0, 0x0

    cmp-long p1, p2, v0

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Lt8/a;->a(Z)V

    iput-wide p2, p0, Lv7/e;->x:J

    iput-wide p4, p0, Lv7/e;->y:J

    iput-boolean p6, p0, Lv7/e;->z:Z

    iput-boolean p7, p0, Lv7/e;->A:Z

    iput-boolean p8, p0, Lv7/e;->B:Z

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lv7/e;->C:Ljava/util/ArrayList;

    new-instance p1, Lt6/d4$d;

    invoke-direct {p1}, Lt6/d4$d;-><init>()V

    iput-object p1, p0, Lv7/e;->D:Lt6/d4$d;

    return-void
.end method

.method private W(Lt6/d4;)V
    .locals 15

    move-object v1, p0

    iget-object v0, v1, Lv7/e;->D:Lt6/d4$d;

    const/4 v2, 0x0

    move-object/from16 v4, p1

    invoke-virtual {v4, v2, v0}, Lt6/d4;->s(ILt6/d4$d;)Lt6/d4$d;

    iget-object v0, v1, Lv7/e;->D:Lt6/d4$d;

    invoke-virtual {v0}, Lt6/d4$d;->h()J

    move-result-wide v5

    iget-object v0, v1, Lv7/e;->E:Lv7/e$a;

    const-wide/high16 v7, -0x8000000000000000L

    if-eqz v0, :cond_2

    iget-object v0, v1, Lv7/e;->C:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    iget-boolean v0, v1, Lv7/e;->A:Z

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    iget-wide v9, v1, Lv7/e;->G:J

    sub-long/2addr v9, v5

    iget-wide v11, v1, Lv7/e;->y:J

    cmp-long v0, v11, v7

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    iget-wide v7, v1, Lv7/e;->H:J

    sub-long/2addr v7, v5

    :goto_0
    move-wide v5, v9

    goto :goto_4

    :cond_2
    :goto_1
    iget-wide v9, v1, Lv7/e;->x:J

    iget-wide v11, v1, Lv7/e;->y:J

    iget-boolean v0, v1, Lv7/e;->B:Z

    if-eqz v0, :cond_3

    iget-object v0, v1, Lv7/e;->D:Lt6/d4$d;

    invoke-virtual {v0}, Lt6/d4$d;->f()J

    move-result-wide v13

    add-long/2addr v9, v13

    add-long/2addr v11, v13

    :cond_3
    add-long v13, v5, v9

    iput-wide v13, v1, Lv7/e;->G:J

    iget-wide v13, v1, Lv7/e;->y:J

    cmp-long v0, v13, v7

    if-nez v0, :cond_4

    goto :goto_2

    :cond_4
    add-long v7, v5, v11

    :goto_2
    iput-wide v7, v1, Lv7/e;->H:J

    iget-object v0, v1, Lv7/e;->C:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    move v3, v2

    :goto_3
    if-ge v3, v0, :cond_5

    iget-object v5, v1, Lv7/e;->C:Ljava/util/ArrayList;

    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lv7/d;

    iget-wide v6, v1, Lv7/e;->G:J

    iget-wide v13, v1, Lv7/e;->H:J

    invoke-virtual {v5, v6, v7, v13, v14}, Lv7/d;->u(JJ)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_5
    move-wide v5, v9

    move-wide v7, v11

    :goto_4
    :try_start_0
    new-instance v0, Lv7/e$a;

    move-object v3, v0

    move-object/from16 v4, p1

    invoke-direct/range {v3 .. v8}, Lv7/e$a;-><init>(Lt6/d4;JJ)V

    iput-object v0, v1, Lv7/e;->E:Lv7/e$a;
    :try_end_0
    .catch Lv7/e$b; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {p0, v0}, Lv7/a;->D(Lt6/d4;)V

    return-void

    :catch_0
    move-exception v0

    iput-object v0, v1, Lv7/e;->F:Lv7/e$b;

    :goto_5
    iget-object v0, v1, Lv7/e;->C:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v2, v0, :cond_6

    iget-object v0, v1, Lv7/e;->C:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv7/d;

    iget-object v3, v1, Lv7/e;->F:Lv7/e$b;

    invoke-virtual {v0, v3}, Lv7/d;->p(Lv7/e$b;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_6
    return-void
.end method


# virtual methods
.method protected E()V
    .locals 1

    invoke-super {p0}, Lv7/g;->E()V

    const/4 v0, 0x0

    iput-object v0, p0, Lv7/e;->F:Lv7/e$b;

    iput-object v0, p0, Lv7/e;->E:Lv7/e$a;

    return-void
.end method

.method protected T(Lt6/d4;)V
    .locals 1

    iget-object v0, p0, Lv7/e;->F:Lv7/e$b;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0, p1}, Lv7/e;->W(Lt6/d4;)V

    return-void
.end method

.method public e(Lv7/a0$b;Ls8/b;J)Lv7/y;
    .locals 8

    new-instance v7, Lv7/d;

    iget-object v0, p0, Lv7/h1;->v:Lv7/a0;

    invoke-interface {v0, p1, p2, p3, p4}, Lv7/a0;->e(Lv7/a0$b;Ls8/b;J)Lv7/y;

    move-result-object v1

    iget-boolean v2, p0, Lv7/e;->z:Z

    iget-wide v3, p0, Lv7/e;->G:J

    iget-wide v5, p0, Lv7/e;->H:J

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lv7/d;-><init>(Lv7/y;ZJJ)V

    iget-object p1, p0, Lv7/e;->C:Ljava/util/ArrayList;

    invoke-virtual {p1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v7
.end method

.method public l(Lv7/y;)V
    .locals 1

    iget-object v0, p0, Lv7/e;->C:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Lt8/a;->g(Z)V

    iget-object v0, p0, Lv7/h1;->v:Lv7/a0;

    check-cast p1, Lv7/d;

    iget-object p1, p1, Lv7/d;->a:Lv7/y;

    invoke-interface {v0, p1}, Lv7/a0;->l(Lv7/y;)V

    iget-object p1, p0, Lv7/e;->C:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-boolean p1, p0, Lv7/e;->A:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Lv7/e;->E:Lv7/e$a;

    invoke-static {p1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lv7/e$a;

    iget-object p1, p1, Lv7/s;->f:Lt6/d4;

    invoke-direct {p0, p1}, Lv7/e;->W(Lt6/d4;)V

    :cond_0
    return-void
.end method

.method public n()V
    .locals 1

    iget-object v0, p0, Lv7/e;->F:Lv7/e$b;

    if-nez v0, :cond_0

    invoke-super {p0}, Lv7/g;->n()V

    return-void

    :cond_0
    throw v0
.end method
