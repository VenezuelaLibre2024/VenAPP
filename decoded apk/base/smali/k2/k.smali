.class public final Lk2/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk2/j;


# instance fields
.field private final a:Lr1/u;

.field private final b:Lr1/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr1/i<",
            "Lk2/i;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lr1/d0;

.field private final d:Lr1/d0;


# direct methods
.method public constructor <init>(Lr1/u;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk2/k;->a:Lr1/u;

    new-instance v0, Lk2/k$a;

    invoke-direct {v0, p0, p1}, Lk2/k$a;-><init>(Lk2/k;Lr1/u;)V

    iput-object v0, p0, Lk2/k;->b:Lr1/i;

    new-instance v0, Lk2/k$b;

    invoke-direct {v0, p0, p1}, Lk2/k$b;-><init>(Lk2/k;Lr1/u;)V

    iput-object v0, p0, Lk2/k;->c:Lr1/d0;

    new-instance v0, Lk2/k$c;

    invoke-direct {v0, p0, p1}, Lk2/k$c;-><init>(Lk2/k;Lr1/u;)V

    iput-object v0, p0, Lk2/k;->d:Lr1/d0;

    return-void
.end method

.method public static h()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Lk2/m;)V
    .locals 0

    invoke-static {p0, p1}, Lk2/j$a;->b(Lk2/j;Lk2/m;)V

    return-void
.end method

.method public b(Ljava/lang/String;I)Lk2/i;
    .locals 5

    const-string v0, "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lr1/x;->e(Ljava/lang/String;I)Lr1/x;

    move-result-object v0

    const/4 v2, 0x1

    if-nez p1, :cond_0

    invoke-virtual {v0, v2}, Lr1/x;->g1(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v2, p1}, Lr1/x;->x0(ILjava/lang/String;)V

    :goto_0
    int-to-long p1, p2

    invoke-virtual {v0, v1, p1, p2}, Lr1/x;->M0(IJ)V

    iget-object p1, p0, Lk2/k;->a:Lr1/u;

    invoke-virtual {p1}, Lr1/u;->d()V

    iget-object p1, p0, Lk2/k;->a:Lr1/u;

    const/4 p2, 0x0

    const/4 v1, 0x0

    invoke-static {p1, v0, p2, v1}, Lt1/b;->b(Lr1/u;Lv1/l;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object p1

    :try_start_0
    const-string p2, "work_spec_id"

    invoke-static {p1, p2}, Lt1/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result p2

    const-string v2, "generation"

    invoke-static {p1, v2}, Lt1/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v2

    const-string v3, "system_id"

    invoke-static {p1, v3}, Lt1/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v3

    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {p1, p2}, Landroid/database/Cursor;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {p1, p2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    :goto_1
    invoke-interface {p1, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result p2

    invoke-interface {p1, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v2

    new-instance v3, Lk2/i;

    invoke-direct {v3, v1, p2, v2}, Lk2/i;-><init>(Ljava/lang/String;II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v1, v3

    :cond_2
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0}, Lr1/x;->i()V

    return-object v1

    :catchall_0
    move-exception p2

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0}, Lr1/x;->i()V

    throw p2
.end method

.method public c(Lk2/i;)V
    .locals 1

    iget-object v0, p0, Lk2/k;->a:Lr1/u;

    invoke-virtual {v0}, Lr1/u;->d()V

    iget-object v0, p0, Lk2/k;->a:Lr1/u;

    invoke-virtual {v0}, Lr1/u;->e()V

    :try_start_0
    iget-object v0, p0, Lk2/k;->b:Lr1/i;

    invoke-virtual {v0, p1}, Lr1/i;->j(Ljava/lang/Object;)V

    iget-object p1, p0, Lk2/k;->a:Lr1/u;

    invoke-virtual {p1}, Lr1/u;->B()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lk2/k;->a:Lr1/u;

    invoke-virtual {p1}, Lr1/u;->i()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lk2/k;->a:Lr1/u;

    invoke-virtual {v0}, Lr1/u;->i()V

    throw p1
.end method

.method public d()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "SELECT DISTINCT work_spec_id FROM SystemIdInfo"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lr1/x;->e(Ljava/lang/String;I)Lr1/x;

    move-result-object v0

    iget-object v2, p0, Lk2/k;->a:Lr1/u;

    invoke-virtual {v2}, Lr1/u;->d()V

    iget-object v2, p0, Lk2/k;->a:Lr1/u;

    const/4 v3, 0x0

    invoke-static {v2, v0, v1, v3}, Lt1/b;->b(Lr1/u;Lv1/l;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object v2

    :try_start_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-interface {v2}, Landroid/database/Cursor;->getCount()I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    :goto_0
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v2, v1}, Landroid/database/Cursor;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_0

    move-object v5, v3

    goto :goto_1

    :cond_0
    invoke-interface {v2, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    :goto_1
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_1
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0}, Lr1/x;->i()V

    return-object v4

    :catchall_0
    move-exception v1

    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0}, Lr1/x;->i()V

    throw v1
.end method

.method public e(Lk2/m;)Lk2/i;
    .locals 0

    invoke-static {p0, p1}, Lk2/j$a;->a(Lk2/j;Lk2/m;)Lk2/i;

    move-result-object p1

    return-object p1
.end method

.method public f(Ljava/lang/String;I)V
    .locals 3

    iget-object v0, p0, Lk2/k;->a:Lr1/u;

    invoke-virtual {v0}, Lr1/u;->d()V

    iget-object v0, p0, Lk2/k;->c:Lr1/d0;

    invoke-virtual {v0}, Lr1/d0;->b()Lv1/m;

    move-result-object v0

    const/4 v1, 0x1

    if-nez p1, :cond_0

    invoke-interface {v0, v1}, Lv1/k;->g1(I)V

    goto :goto_0

    :cond_0
    invoke-interface {v0, v1, p1}, Lv1/k;->x0(ILjava/lang/String;)V

    :goto_0
    const/4 p1, 0x2

    int-to-long v1, p2

    invoke-interface {v0, p1, v1, v2}, Lv1/k;->M0(IJ)V

    iget-object p1, p0, Lk2/k;->a:Lr1/u;

    invoke-virtual {p1}, Lr1/u;->e()V

    :try_start_0
    invoke-interface {v0}, Lv1/m;->z()I

    iget-object p1, p0, Lk2/k;->a:Lr1/u;

    invoke-virtual {p1}, Lr1/u;->B()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lk2/k;->a:Lr1/u;

    invoke-virtual {p1}, Lr1/u;->i()V

    iget-object p1, p0, Lk2/k;->c:Lr1/d0;

    invoke-virtual {p1, v0}, Lr1/d0;->h(Lv1/m;)V

    return-void

    :catchall_0
    move-exception p1

    iget-object p2, p0, Lk2/k;->a:Lr1/u;

    invoke-virtual {p2}, Lr1/u;->i()V

    iget-object p2, p0, Lk2/k;->c:Lr1/d0;

    invoke-virtual {p2, v0}, Lr1/d0;->h(Lv1/m;)V

    throw p1
.end method

.method public g(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lk2/k;->a:Lr1/u;

    invoke-virtual {v0}, Lr1/u;->d()V

    iget-object v0, p0, Lk2/k;->d:Lr1/d0;

    invoke-virtual {v0}, Lr1/d0;->b()Lv1/m;

    move-result-object v0

    const/4 v1, 0x1

    if-nez p1, :cond_0

    invoke-interface {v0, v1}, Lv1/k;->g1(I)V

    goto :goto_0

    :cond_0
    invoke-interface {v0, v1, p1}, Lv1/k;->x0(ILjava/lang/String;)V

    :goto_0
    iget-object p1, p0, Lk2/k;->a:Lr1/u;

    invoke-virtual {p1}, Lr1/u;->e()V

    :try_start_0
    invoke-interface {v0}, Lv1/m;->z()I

    iget-object p1, p0, Lk2/k;->a:Lr1/u;

    invoke-virtual {p1}, Lr1/u;->B()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lk2/k;->a:Lr1/u;

    invoke-virtual {p1}, Lr1/u;->i()V

    iget-object p1, p0, Lk2/k;->d:Lr1/d0;

    invoke-virtual {p1, v0}, Lr1/d0;->h(Lv1/m;)V

    return-void

    :catchall_0
    move-exception p1

    iget-object v1, p0, Lk2/k;->a:Lr1/u;

    invoke-virtual {v1}, Lr1/u;->i()V

    iget-object v1, p0, Lk2/k;->d:Lr1/d0;

    invoke-virtual {v1, v0}, Lr1/d0;->h(Lv1/m;)V

    throw p1
.end method
