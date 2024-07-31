.class public final Lk2/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk2/o;


# instance fields
.field private final a:Lr1/u;

.field private final b:Lr1/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr1/i<",
            "Lk2/n;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lr1/u;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk2/p;->a:Lr1/u;

    new-instance v0, Lk2/p$a;

    invoke-direct {v0, p0, p1}, Lk2/p$a;-><init>(Lk2/p;Lr1/u;)V

    iput-object v0, p0, Lk2/p;->b:Lr1/i;

    return-void
.end method

.method public static c()Ljava/util/List;
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
.method public a(Lk2/n;)V
    .locals 1

    iget-object v0, p0, Lk2/p;->a:Lr1/u;

    invoke-virtual {v0}, Lr1/u;->d()V

    iget-object v0, p0, Lk2/p;->a:Lr1/u;

    invoke-virtual {v0}, Lr1/u;->e()V

    :try_start_0
    iget-object v0, p0, Lk2/p;->b:Lr1/i;

    invoke-virtual {v0, p1}, Lr1/i;->j(Ljava/lang/Object;)V

    iget-object p1, p0, Lk2/p;->a:Lr1/u;

    invoke-virtual {p1}, Lr1/u;->B()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lk2/p;->a:Lr1/u;

    invoke-virtual {p1}, Lr1/u;->i()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lk2/p;->a:Lr1/u;

    invoke-virtual {v0}, Lr1/u;->i()V

    throw p1
.end method

.method public b(Ljava/lang/String;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "SELECT name FROM workname WHERE work_spec_id=?"

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lr1/x;->e(Ljava/lang/String;I)Lr1/x;

    move-result-object v0

    if-nez p1, :cond_0

    invoke-virtual {v0, v1}, Lr1/x;->g1(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1, p1}, Lr1/x;->x0(ILjava/lang/String;)V

    :goto_0
    iget-object p1, p0, Lk2/p;->a:Lr1/u;

    invoke-virtual {p1}, Lr1/u;->d()V

    iget-object p1, p0, Lk2/p;->a:Lr1/u;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p1, v0, v1, v2}, Lt1/b;->b(Lr1/u;Lv1/l;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object p1

    :try_start_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-interface {p1}, Landroid/database/Cursor;->getCount()I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    :goto_1
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {p1, v1}, Landroid/database/Cursor;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_1

    move-object v4, v2

    goto :goto_2

    :cond_1
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    :goto_2
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :cond_2
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0}, Lr1/x;->i()V

    return-object v3

    :catchall_0
    move-exception v1

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0}, Lr1/x;->i()V

    throw v1
.end method
