.class public final Lv7/a1;
.super Lv7/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv7/a1$b;
    }
.end annotation


# instance fields
.field private A:Ls8/m0;

.field private final s:Ls8/n;

.field private final t:Ls8/j$a;

.field private final u:Lt6/u1;

.field private final v:J

.field private final w:Ls8/d0;

.field private final x:Z

.field private final y:Lt6/d4;

.field private final z:Lt6/c2;


# direct methods
.method private constructor <init>(Ljava/lang/String;Lt6/c2$l;Ls8/j$a;JLs8/d0;ZLjava/lang/Object;)V
    .locals 10

    move-object v0, p0

    move-object v1, p2

    invoke-direct {p0}, Lv7/a;-><init>()V

    move-object v2, p3

    iput-object v2, v0, Lv7/a1;->t:Ls8/j$a;

    move-wide v2, p4

    iput-wide v2, v0, Lv7/a1;->v:J

    move-object/from16 v4, p6

    iput-object v4, v0, Lv7/a1;->w:Ls8/d0;

    move/from16 v4, p7

    iput-boolean v4, v0, Lv7/a1;->x:Z

    new-instance v4, Lt6/c2$c;

    invoke-direct {v4}, Lt6/c2$c;-><init>()V

    sget-object v5, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    invoke-virtual {v4, v5}, Lt6/c2$c;->g(Landroid/net/Uri;)Lt6/c2$c;

    move-result-object v4

    iget-object v5, v1, Lt6/c2$l;->a:Landroid/net/Uri;

    invoke-virtual {v5}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lt6/c2$c;->d(Ljava/lang/String;)Lt6/c2$c;

    move-result-object v4

    invoke-static {p2}, Lcom/google/common/collect/w;->w(Ljava/lang/Object;)Lcom/google/common/collect/w;

    move-result-object v5

    invoke-virtual {v4, v5}, Lt6/c2$c;->e(Ljava/util/List;)Lt6/c2$c;

    move-result-object v4

    move-object/from16 v5, p8

    invoke-virtual {v4, v5}, Lt6/c2$c;->f(Ljava/lang/Object;)Lt6/c2$c;

    move-result-object v4

    invoke-virtual {v4}, Lt6/c2$c;->a()Lt6/c2;

    move-result-object v8

    iput-object v8, v0, Lv7/a1;->z:Lt6/c2;

    new-instance v4, Lt6/u1$b;

    invoke-direct {v4}, Lt6/u1$b;-><init>()V

    iget-object v5, v1, Lt6/c2$l;->b:Ljava/lang/String;

    const-string v6, "text/x-unknown"

    invoke-static {v5, v6}, Leb/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v4, v5}, Lt6/u1$b;->g0(Ljava/lang/String;)Lt6/u1$b;

    move-result-object v4

    iget-object v5, v1, Lt6/c2$l;->c:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lt6/u1$b;->X(Ljava/lang/String;)Lt6/u1$b;

    move-result-object v4

    iget v5, v1, Lt6/c2$l;->d:I

    invoke-virtual {v4, v5}, Lt6/u1$b;->i0(I)Lt6/u1$b;

    move-result-object v4

    iget v5, v1, Lt6/c2$l;->e:I

    invoke-virtual {v4, v5}, Lt6/u1$b;->e0(I)Lt6/u1$b;

    move-result-object v4

    iget-object v5, v1, Lt6/c2$l;->f:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lt6/u1$b;->W(Ljava/lang/String;)Lt6/u1$b;

    move-result-object v4

    iget-object v5, v1, Lt6/c2$l;->g:Ljava/lang/String;

    if-eqz v5, :cond_0

    goto :goto_0

    :cond_0
    move-object v5, p1

    :goto_0
    invoke-virtual {v4, v5}, Lt6/u1$b;->U(Ljava/lang/String;)Lt6/u1$b;

    move-result-object v4

    invoke-virtual {v4}, Lt6/u1$b;->G()Lt6/u1;

    move-result-object v4

    iput-object v4, v0, Lv7/a1;->u:Lt6/u1;

    new-instance v4, Ls8/n$b;

    invoke-direct {v4}, Ls8/n$b;-><init>()V

    iget-object v1, v1, Lt6/c2$l;->a:Landroid/net/Uri;

    invoke-virtual {v4, v1}, Ls8/n$b;->i(Landroid/net/Uri;)Ls8/n$b;

    move-result-object v1

    const/4 v4, 0x1

    invoke-virtual {v1, v4}, Ls8/n$b;->b(I)Ls8/n$b;

    move-result-object v1

    invoke-virtual {v1}, Ls8/n$b;->a()Ls8/n;

    move-result-object v1

    iput-object v1, v0, Lv7/a1;->s:Ls8/n;

    new-instance v9, Lv7/y0;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, v9

    move-wide v2, p4

    invoke-direct/range {v1 .. v8}, Lv7/y0;-><init>(JZZZLjava/lang/Object;Lt6/c2;)V

    iput-object v9, v0, Lv7/a1;->y:Lt6/d4;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Lt6/c2$l;Ls8/j$a;JLs8/d0;ZLjava/lang/Object;Lv7/a1$a;)V
    .locals 0

    invoke-direct/range {p0 .. p8}, Lv7/a1;-><init>(Ljava/lang/String;Lt6/c2$l;Ls8/j$a;JLs8/d0;ZLjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method protected C(Ls8/m0;)V
    .locals 0

    iput-object p1, p0, Lv7/a1;->A:Ls8/m0;

    iget-object p1, p0, Lv7/a1;->y:Lt6/d4;

    invoke-virtual {p0, p1}, Lv7/a;->D(Lt6/d4;)V

    return-void
.end method

.method protected E()V
    .locals 0

    return-void
.end method

.method public d()Lt6/c2;
    .locals 1

    iget-object v0, p0, Lv7/a1;->z:Lt6/c2;

    return-object v0
.end method

.method public e(Lv7/a0$b;Ls8/b;J)Lv7/y;
    .locals 10

    new-instance p2, Lv7/z0;

    iget-object v1, p0, Lv7/a1;->s:Ls8/n;

    iget-object v2, p0, Lv7/a1;->t:Ls8/j$a;

    iget-object v3, p0, Lv7/a1;->A:Ls8/m0;

    iget-object v4, p0, Lv7/a1;->u:Lt6/u1;

    iget-wide v5, p0, Lv7/a1;->v:J

    iget-object v7, p0, Lv7/a1;->w:Ls8/d0;

    invoke-virtual {p0, p1}, Lv7/a;->w(Lv7/a0$b;)Lv7/h0$a;

    move-result-object v8

    iget-boolean v9, p0, Lv7/a1;->x:Z

    move-object v0, p2

    invoke-direct/range {v0 .. v9}, Lv7/z0;-><init>(Ls8/n;Ls8/j$a;Ls8/m0;Lt6/u1;JLs8/d0;Lv7/h0$a;Z)V

    return-object p2
.end method

.method public l(Lv7/y;)V
    .locals 0

    check-cast p1, Lv7/z0;

    invoke-virtual {p1}, Lv7/z0;->q()V

    return-void
.end method

.method public n()V
    .locals 0

    return-void
.end method
