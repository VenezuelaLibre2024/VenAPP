.class public final Lv7/q0;
.super Lv7/a;
.source "SourceFile"

# interfaces
.implements Lv7/p0$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv7/q0$b;
    }
.end annotation


# instance fields
.field private A:J

.field private B:Z

.field private C:Z

.field private D:Ls8/m0;

.field private final s:Lt6/c2;

.field private final t:Lt6/c2$h;

.field private final u:Ls8/j$a;

.field private final v:Lv7/k0$a;

.field private final w:Lx6/v;

.field private final x:Ls8/d0;

.field private final y:I

.field private z:Z


# direct methods
.method private constructor <init>(Lt6/c2;Ls8/j$a;Lv7/k0$a;Lx6/v;Ls8/d0;I)V
    .locals 1

    invoke-direct {p0}, Lv7/a;-><init>()V

    iget-object v0, p1, Lt6/c2;->b:Lt6/c2$h;

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt6/c2$h;

    iput-object v0, p0, Lv7/q0;->t:Lt6/c2$h;

    iput-object p1, p0, Lv7/q0;->s:Lt6/c2;

    iput-object p2, p0, Lv7/q0;->u:Ls8/j$a;

    iput-object p3, p0, Lv7/q0;->v:Lv7/k0$a;

    iput-object p4, p0, Lv7/q0;->w:Lx6/v;

    iput-object p5, p0, Lv7/q0;->x:Ls8/d0;

    iput p6, p0, Lv7/q0;->y:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lv7/q0;->z:Z

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lv7/q0;->A:J

    return-void
.end method

.method synthetic constructor <init>(Lt6/c2;Ls8/j$a;Lv7/k0$a;Lx6/v;Ls8/d0;ILv7/q0$a;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Lv7/q0;-><init>(Lt6/c2;Ls8/j$a;Lv7/k0$a;Lx6/v;Ls8/d0;I)V

    return-void
.end method

.method private F()V
    .locals 9

    new-instance v8, Lv7/y0;

    iget-wide v1, p0, Lv7/q0;->A:J

    iget-boolean v3, p0, Lv7/q0;->B:Z

    const/4 v4, 0x0

    iget-boolean v5, p0, Lv7/q0;->C:Z

    const/4 v6, 0x0

    iget-object v7, p0, Lv7/q0;->s:Lt6/c2;

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lv7/y0;-><init>(JZZZLjava/lang/Object;Lt6/c2;)V

    iget-boolean v0, p0, Lv7/q0;->z:Z

    if-eqz v0, :cond_0

    new-instance v0, Lv7/q0$a;

    invoke-direct {v0, p0, v8}, Lv7/q0$a;-><init>(Lv7/q0;Lt6/d4;)V

    move-object v8, v0

    :cond_0
    invoke-virtual {p0, v8}, Lv7/a;->D(Lt6/d4;)V

    return-void
.end method


# virtual methods
.method protected C(Ls8/m0;)V
    .locals 2

    iput-object p1, p0, Lv7/q0;->D:Ls8/m0;

    iget-object p1, p0, Lv7/q0;->w:Lx6/v;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Looper;

    invoke-virtual {p0}, Lv7/a;->A()Lu6/m3;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lx6/v;->b(Landroid/os/Looper;Lu6/m3;)V

    iget-object p1, p0, Lv7/q0;->w:Lx6/v;

    invoke-interface {p1}, Lx6/v;->a()V

    invoke-direct {p0}, Lv7/q0;->F()V

    return-void
.end method

.method protected E()V
    .locals 1

    iget-object v0, p0, Lv7/q0;->w:Lx6/v;

    invoke-interface {v0}, Lx6/v;->release()V

    return-void
.end method

.method public d()Lt6/c2;
    .locals 1

    iget-object v0, p0, Lv7/q0;->s:Lt6/c2;

    return-object v0
.end method

.method public e(Lv7/a0$b;Ls8/b;J)Lv7/y;
    .locals 14

    move-object v12, p0

    iget-object v0, v12, Lv7/q0;->u:Ls8/j$a;

    invoke-interface {v0}, Ls8/j$a;->a()Ls8/j;

    move-result-object v2

    iget-object v0, v12, Lv7/q0;->D:Ls8/m0;

    if-eqz v0, :cond_0

    invoke-interface {v2, v0}, Ls8/j;->l(Ls8/m0;)V

    :cond_0
    new-instance v13, Lv7/p0;

    iget-object v0, v12, Lv7/q0;->t:Lt6/c2$h;

    iget-object v1, v0, Lt6/c2$h;->a:Landroid/net/Uri;

    iget-object v0, v12, Lv7/q0;->v:Lv7/k0$a;

    invoke-virtual {p0}, Lv7/a;->A()Lu6/m3;

    move-result-object v3

    invoke-interface {v0, v3}, Lv7/k0$a;->a(Lu6/m3;)Lv7/k0;

    move-result-object v3

    iget-object v4, v12, Lv7/q0;->w:Lx6/v;

    invoke-virtual {p0, p1}, Lv7/a;->u(Lv7/a0$b;)Lx6/u$a;

    move-result-object v5

    iget-object v6, v12, Lv7/q0;->x:Ls8/d0;

    invoke-virtual {p0, p1}, Lv7/a;->w(Lv7/a0$b;)Lv7/h0$a;

    move-result-object v7

    iget-object v0, v12, Lv7/q0;->t:Lt6/c2$h;

    iget-object v10, v0, Lt6/c2$h;->e:Ljava/lang/String;

    iget v11, v12, Lv7/q0;->y:I

    move-object v0, v13

    move-object v8, p0

    move-object/from16 v9, p2

    invoke-direct/range {v0 .. v11}, Lv7/p0;-><init>(Landroid/net/Uri;Ls8/j;Lv7/k0;Lx6/v;Lx6/u$a;Ls8/d0;Lv7/h0$a;Lv7/p0$b;Ls8/b;Ljava/lang/String;I)V

    return-object v13
.end method

.method public k(JZZ)V
    .locals 2

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    iget-wide p1, p0, Lv7/q0;->A:J

    :cond_0
    iget-boolean v0, p0, Lv7/q0;->z:Z

    if-nez v0, :cond_1

    iget-wide v0, p0, Lv7/q0;->A:J

    cmp-long v0, v0, p1

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lv7/q0;->B:Z

    if-ne v0, p3, :cond_1

    iget-boolean v0, p0, Lv7/q0;->C:Z

    if-ne v0, p4, :cond_1

    return-void

    :cond_1
    iput-wide p1, p0, Lv7/q0;->A:J

    iput-boolean p3, p0, Lv7/q0;->B:Z

    iput-boolean p4, p0, Lv7/q0;->C:Z

    const/4 p1, 0x0

    iput-boolean p1, p0, Lv7/q0;->z:Z

    invoke-direct {p0}, Lv7/q0;->F()V

    return-void
.end method

.method public l(Lv7/y;)V
    .locals 0

    check-cast p1, Lv7/p0;

    invoke-virtual {p1}, Lv7/p0;->e0()V

    return-void
.end method

.method public n()V
    .locals 0

    return-void
.end method
