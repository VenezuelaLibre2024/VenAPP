.class public final Lyl/f$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyl/h$c;
.implements Lok/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lyl/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lyl/h$c;",
        "Lok/a<",
        "Lck/v;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lyl/h;

.field final synthetic b:Lyl/f;


# direct methods
.method public constructor <init>(Lyl/f;Lyl/h;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyl/h;",
            ")V"
        }
    .end annotation

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reader"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lyl/f$d;->b:Lyl/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lyl/f$d;->a:Lyl/h;

    return-void
.end method


# virtual methods
.method public a(ZIILjava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZII",
            "Ljava/util/List<",
            "Lyl/c;",
            ">;)V"
        }
    .end annotation

    const-string p3, "headerBlock"

    invoke-static {p4, p3}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p3, p0, Lyl/f$d;->b:Lyl/f;

    invoke-virtual {p3, p2}, Lyl/f;->Y0(I)Z

    move-result p3

    if-eqz p3, :cond_0

    iget-object p3, p0, Lyl/f$d;->b:Lyl/f;

    invoke-virtual {p3, p2, p4, p1}, Lyl/f;->R0(ILjava/util/List;Z)V

    return-void

    :cond_0
    iget-object p3, p0, Lyl/f$d;->b:Lyl/f;

    monitor-enter p3

    :try_start_0
    invoke-virtual {p3, p2}, Lyl/f;->v0(I)Lyl/i;

    move-result-object v0

    if-nez v0, :cond_4

    invoke-static {p3}, Lyl/f;->r(Lyl/f;)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_1

    monitor-exit p3

    return-void

    :cond_1
    :try_start_1
    invoke-virtual {p3}, Lyl/f;->a0()I

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-gt p2, v0, :cond_2

    monitor-exit p3

    return-void

    :cond_2
    :try_start_2
    rem-int/lit8 v0, p2, 0x2

    invoke-virtual {p3}, Lyl/f;->h0()I

    move-result v1

    rem-int/lit8 v1, v1, 0x2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-ne v0, v1, :cond_3

    monitor-exit p3

    return-void

    :cond_3
    :try_start_3
    invoke-static {p4}, Lrl/d;->P(Ljava/util/List;)Lql/t;

    move-result-object v5

    new-instance p4, Lyl/i;

    const/4 v3, 0x0

    move-object v0, p4

    move v1, p2

    move-object v2, p3

    move v4, p1

    invoke-direct/range {v0 .. v5}, Lyl/i;-><init>(ILyl/f;ZZLql/t;)V

    invoke-virtual {p3, p2}, Lyl/f;->c1(I)V

    invoke-virtual {p3}, Lyl/f;->z0()Ljava/util/Map;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, Lyl/f;->o(Lyl/f;)Lul/e;

    move-result-object p1

    invoke-virtual {p1}, Lul/e;->i()Lul/d;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3}, Lyl/f;->U()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, "] onStream"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    new-instance v0, Lyl/f$d$b;

    const/4 v1, 0x1

    invoke-direct {v0, p2, v1, p3, p4}, Lyl/f$d$b;-><init>(Ljava/lang/String;ZLyl/f;Lyl/i;)V

    const-wide/16 v1, 0x0

    invoke-virtual {p1, v0, v1, v2}, Lul/d;->i(Lul/a;J)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit p3

    return-void

    :cond_4
    :try_start_4
    sget-object p2, Lck/v;->a:Lck/v;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    monitor-exit p3

    invoke-static {p4}, Lrl/d;->P(Ljava/util/List;)Lql/t;

    move-result-object p2

    invoke-virtual {v0, p2, p1}, Lyl/i;->x(Lql/t;Z)V

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p3

    throw p1
.end method

.method public c(ILyl/b;)V
    .locals 1

    const-string v0, "errorCode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lyl/f$d;->b:Lyl/f;

    invoke-virtual {v0, p1}, Lyl/f;->Y0(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lyl/f$d;->b:Lyl/f;

    invoke-virtual {v0, p1, p2}, Lyl/f;->W0(ILyl/b;)V

    return-void

    :cond_0
    iget-object v0, p0, Lyl/f$d;->b:Lyl/f;

    invoke-virtual {v0, p1}, Lyl/f;->a1(I)Lyl/i;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p1, p2}, Lyl/i;->y(Lyl/b;)V

    :goto_0
    return-void
.end method

.method public d(IJ)V
    .locals 2

    if-nez p1, :cond_0

    iget-object p1, p0, Lyl/f$d;->b:Lyl/f;

    monitor-enter p1

    :try_start_0
    invoke-virtual {p1}, Lyl/f;->B0()J

    move-result-wide v0

    add-long/2addr v0, p2

    invoke-static {p1, v0, v1}, Lyl/f;->O(Lyl/f;J)V

    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    sget-object p2, Lck/v;->a:Lck/v;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p2

    monitor-exit p1

    throw p2

    :cond_0
    iget-object v0, p0, Lyl/f$d;->b:Lyl/f;

    invoke-virtual {v0, p1}, Lyl/f;->v0(I)Lyl/i;

    move-result-object p1

    if-eqz p1, :cond_1

    monitor-enter p1

    :try_start_1
    invoke-virtual {p1, p2, p3}, Lyl/i;->a(J)V

    sget-object p2, Lck/v;->a:Lck/v;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :goto_0
    monitor-exit p1

    goto :goto_1

    :catchall_1
    move-exception p2

    monitor-exit p1

    throw p2

    :cond_1
    :goto_1
    return-void
.end method

.method public f(ZLyl/m;)V
    .locals 9

    const-string v0, "settings"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lyl/f$d;->b:Lyl/f;

    invoke-static {v0}, Lyl/f;->q(Lyl/f;)Lul/d;

    move-result-object v0

    iget-object v1, p0, Lyl/f$d;->b:Lyl/f;

    invoke-virtual {v1}, Lyl/f;->U()Ljava/lang/String;

    move-result-object v1

    const-string v2, " applyAndAckSettings"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    new-instance v1, Lyl/f$d$d;

    move-object v3, v1

    move-object v6, p0

    move v7, p1

    move-object v8, p2

    invoke-direct/range {v3 .. v8}, Lyl/f$d$d;-><init>(Ljava/lang/String;ZLyl/f$d;ZLyl/m;)V

    const-wide/16 p1, 0x0

    invoke-virtual {v0, v1, p1, p2}, Lul/d;->i(Lul/a;J)V

    return-void
.end method

.method public g(ILyl/b;Ldm/e;)V
    .locals 3

    const-string v0, "errorCode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "debugData"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, Ldm/e;->B()I

    iget-object p2, p0, Lyl/f$d;->b:Lyl/f;

    monitor-enter p2

    :try_start_0
    invoke-virtual {p2}, Lyl/f;->z0()Ljava/util/Map;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p3

    const/4 v0, 0x0

    new-array v1, v0, [Lyl/i;

    invoke-interface {p3, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p3

    if-eqz p3, :cond_2

    const/4 v1, 0x1

    invoke-static {p2, v1}, Lyl/f;->I(Lyl/f;Z)V

    sget-object v1, Lck/v;->a:Lck/v;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p2

    check-cast p3, [Lyl/i;

    array-length p2, p3

    :cond_0
    :goto_0
    if-ge v0, p2, :cond_1

    aget-object v1, p3, v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v1}, Lyl/i;->j()I

    move-result v2

    if-le v2, p1, :cond_0

    invoke-virtual {v1}, Lyl/i;->t()Z

    move-result v2

    if-eqz v2, :cond_0

    sget-object v2, Lyl/b;->REFUSED_STREAM:Lyl/b;

    invoke-virtual {v1, v2}, Lyl/i;->y(Lyl/b;)V

    iget-object v2, p0, Lyl/f$d;->b:Lyl/f;

    invoke-virtual {v1}, Lyl/i;->j()I

    move-result v1

    invoke-virtual {v2, v1}, Lyl/f;->a1(I)Lyl/i;

    goto :goto_0

    :cond_1
    return-void

    :cond_2
    :try_start_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p3, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"

    invoke-direct {p1, p3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    monitor-exit p2

    throw p1
.end method

.method public h(ZII)V
    .locals 8

    if-eqz p1, :cond_3

    iget-object p1, p0, Lyl/f$d;->b:Lyl/f;

    monitor-enter p1

    const/4 p3, 0x1

    const-wide/16 v0, 0x1

    if-eq p2, p3, :cond_2

    const/4 p3, 0x2

    if-eq p2, p3, :cond_1

    const/4 p3, 0x3

    if-eq p2, p3, :cond_0

    :goto_0
    :try_start_0
    sget-object p2, Lck/v;->a:Lck/v;

    goto :goto_1

    :cond_0
    invoke-static {p1}, Lyl/f;->b(Lyl/f;)J

    move-result-wide p2

    add-long/2addr p2, v0

    invoke-static {p1, p2, p3}, Lyl/f;->y(Lyl/f;J)V

    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    goto :goto_0

    :cond_1
    invoke-static {p1}, Lyl/f;->g(Lyl/f;)J

    move-result-wide p2

    add-long/2addr p2, v0

    invoke-static {p1, p2, p3}, Lyl/f;->B(Lyl/f;J)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lyl/f;->j(Lyl/f;)J

    move-result-wide p2

    add-long/2addr p2, v0

    invoke-static {p1, p2, p3}, Lyl/f;->H(Lyl/f;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    monitor-exit p1

    goto :goto_2

    :catchall_0
    move-exception p2

    monitor-exit p1

    throw p2

    :cond_3
    iget-object p1, p0, Lyl/f$d;->b:Lyl/f;

    invoke-static {p1}, Lyl/f;->q(Lyl/f;)Lul/d;

    move-result-object p1

    iget-object v0, p0, Lyl/f$d;->b:Lyl/f;

    invoke-virtual {v0}, Lyl/f;->U()Ljava/lang/String;

    move-result-object v0

    const-string v1, " ping"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    iget-object v5, p0, Lyl/f$d;->b:Lyl/f;

    const/4 v4, 0x1

    new-instance v0, Lyl/f$d$c;

    move-object v2, v0

    move v6, p2

    move v7, p3

    invoke-direct/range {v2 .. v7}, Lyl/f$d$c;-><init>(Ljava/lang/String;ZLyl/f;II)V

    const-wide/16 p2, 0x0

    invoke-virtual {p1, v0, p2, p3}, Lul/d;->i(Lul/a;J)V

    :goto_2
    return-void
.end method

.method public i(ZILdm/d;I)V
    .locals 2

    const-string v0, "source"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lyl/f$d;->b:Lyl/f;

    invoke-virtual {v0, p2}, Lyl/f;->Y0(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lyl/f$d;->b:Lyl/f;

    invoke-virtual {v0, p2, p3, p4, p1}, Lyl/f;->L0(ILdm/d;IZ)V

    return-void

    :cond_0
    iget-object v0, p0, Lyl/f$d;->b:Lyl/f;

    invoke-virtual {v0, p2}, Lyl/f;->v0(I)Lyl/i;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object p1, p0, Lyl/f$d;->b:Lyl/f;

    sget-object v0, Lyl/b;->PROTOCOL_ERROR:Lyl/b;

    invoke-virtual {p1, p2, v0}, Lyl/f;->C1(ILyl/b;)V

    iget-object p1, p0, Lyl/f$d;->b:Lyl/f;

    int-to-long v0, p4

    invoke-virtual {p1, v0, v1}, Lyl/f;->x1(J)V

    invoke-interface {p3, v0, v1}, Ldm/d;->skip(J)V

    return-void

    :cond_1
    invoke-virtual {v0, p3, p4}, Lyl/i;->w(Ldm/d;I)V

    if-eqz p1, :cond_2

    sget-object p1, Lrl/d;->b:Lql/t;

    const/4 p2, 0x1

    invoke-virtual {v0, p1, p2}, Lyl/i;->x(Lql/t;Z)V

    :cond_2
    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lyl/f$d;->p()V

    sget-object v0, Lck/v;->a:Lck/v;

    return-object v0
.end method

.method public j(IILjava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/List<",
            "Lyl/c;",
            ">;)V"
        }
    .end annotation

    const-string p1, "requestHeaders"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lyl/f$d;->b:Lyl/f;

    invoke-virtual {p1, p2, p3}, Lyl/f;->T0(ILjava/util/List;)V

    return-void
.end method

.method public k()V
    .locals 0

    return-void
.end method

.method public l(IIIZ)V
    .locals 0

    return-void
.end method

.method public final o(ZLyl/m;)V
    .locals 11

    const-string v0, "settings"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkotlin/jvm/internal/x;

    invoke-direct {v0}, Lkotlin/jvm/internal/x;-><init>()V

    iget-object v1, p0, Lyl/f$d;->b:Lyl/f;

    invoke-virtual {v1}, Lyl/f;->F0()Lyl/j;

    move-result-object v1

    iget-object v2, p0, Lyl/f$d;->b:Lyl/f;

    monitor-enter v1

    :try_start_0
    monitor-enter v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    invoke-virtual {v2}, Lyl/f;->j0()Lyl/m;

    move-result-object v3

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lyl/m;

    invoke-direct {p1}, Lyl/m;-><init>()V

    invoke-virtual {p1, v3}, Lyl/m;->g(Lyl/m;)V

    invoke-virtual {p1, p2}, Lyl/m;->g(Lyl/m;)V

    move-object p2, p1

    :goto_0
    iput-object p2, v0, Lkotlin/jvm/internal/x;->a:Ljava/lang/Object;

    invoke-virtual {p2}, Lyl/m;->c()I

    move-result p1

    int-to-long p1, p1

    invoke-virtual {v3}, Lyl/m;->c()I

    move-result v3

    int-to-long v3, v3

    sub-long/2addr p1, v3

    const-wide/16 v3, 0x0

    cmp-long v5, p1, v3

    const/4 v6, 0x0

    if-eqz v5, :cond_3

    invoke-virtual {v2}, Lyl/f;->z0()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Map;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lyl/f;->z0()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v5

    new-array v7, v6, [Lyl/i;

    invoke-interface {v5, v7}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_2

    check-cast v5, [Lyl/i;

    goto :goto_2

    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_1
    const/4 v5, 0x0

    :goto_2
    iget-object v7, v0, Lkotlin/jvm/internal/x;->a:Ljava/lang/Object;

    check-cast v7, Lyl/m;

    invoke-virtual {v2, v7}, Lyl/f;->q1(Lyl/m;)V

    invoke-static {v2}, Lyl/f;->n(Lyl/f;)Lul/d;

    move-result-object v7

    invoke-virtual {v2}, Lyl/f;->U()Ljava/lang/String;

    move-result-object v8

    const-string v9, " onSettings"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/n;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    new-instance v9, Lyl/f$d$a;

    const/4 v10, 0x1

    invoke-direct {v9, v8, v10, v2, v0}, Lyl/f$d$a;-><init>(Ljava/lang/String;ZLyl/f;Lkotlin/jvm/internal/x;)V

    invoke-virtual {v7, v9, v3, v4}, Lul/d;->i(Lul/a;J)V

    sget-object v3, Lck/v;->a:Lck/v;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :try_start_3
    invoke-virtual {v2}, Lyl/f;->F0()Lyl/j;

    move-result-object v3

    iget-object v0, v0, Lkotlin/jvm/internal/x;->a:Ljava/lang/Object;

    check-cast v0, Lyl/m;

    invoke-virtual {v3, v0}, Lyl/j;->a(Lyl/m;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_3

    :catch_0
    move-exception v0

    :try_start_4
    invoke-static {v2, v0}, Lyl/f;->a(Lyl/f;Ljava/io/IOException;)V

    :goto_3
    sget-object v0, Lck/v;->a:Lck/v;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    monitor-exit v1

    if-eqz v5, :cond_4

    array-length v0, v5

    :goto_4
    if-ge v6, v0, :cond_4

    aget-object v1, v5, v6

    add-int/lit8 v6, v6, 0x1

    monitor-enter v1

    :try_start_5
    invoke-virtual {v1, p1, p2}, Lyl/i;->a(J)V

    sget-object v2, Lck/v;->a:Lck/v;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    monitor-exit v1

    goto :goto_4

    :catchall_0
    move-exception p1

    monitor-exit v1

    throw p1

    :cond_4
    return-void

    :catchall_1
    move-exception p1

    :try_start_6
    monitor-exit v2

    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catchall_2
    move-exception p1

    monitor-exit v1

    throw p1
.end method

.method public p()V
    .locals 5

    sget-object v0, Lyl/b;->INTERNAL_ERROR:Lyl/b;

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lyl/f$d;->a:Lyl/h;

    invoke-virtual {v2, p0}, Lyl/h;->e(Lyl/h$c;)V

    :goto_0
    iget-object v2, p0, Lyl/f$d;->a:Lyl/h;

    const/4 v3, 0x0

    invoke-virtual {v2, v3, p0}, Lyl/h;->b(ZLyl/h$c;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    sget-object v2, Lyl/b;->NO_ERROR:Lyl/b;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    sget-object v0, Lyl/b;->CANCEL:Lyl/b;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    iget-object v3, p0, Lyl/f$d;->b:Lyl/f;

    invoke-virtual {v3, v2, v0, v1}, Lyl/f;->Q(Lyl/b;Lyl/b;Ljava/io/IOException;)V

    goto :goto_2

    :catch_0
    move-exception v1

    goto :goto_1

    :catchall_0
    move-exception v3

    move-object v2, v0

    goto :goto_3

    :catch_1
    move-exception v1

    move-object v2, v0

    :goto_1
    :try_start_2
    sget-object v0, Lyl/b;->PROTOCOL_ERROR:Lyl/b;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    iget-object v2, p0, Lyl/f$d;->b:Lyl/f;

    invoke-virtual {v2, v0, v0, v1}, Lyl/f;->Q(Lyl/b;Lyl/b;Ljava/io/IOException;)V

    :goto_2
    iget-object v0, p0, Lyl/f$d;->a:Lyl/h;

    invoke-static {v0}, Lrl/d;->m(Ljava/io/Closeable;)V

    return-void

    :catchall_1
    move-exception v3

    :goto_3
    iget-object v4, p0, Lyl/f$d;->b:Lyl/f;

    invoke-virtual {v4, v2, v0, v1}, Lyl/f;->Q(Lyl/b;Lyl/b;Ljava/io/IOException;)V

    iget-object v0, p0, Lyl/f$d;->a:Lyl/h;

    invoke-static {v0}, Lrl/d;->m(Ljava/io/Closeable;)V

    throw v3
.end method
