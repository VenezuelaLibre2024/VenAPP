.class public Landroidx/camera/core/impl/x1;
.super Landroidx/camera/core/impl/a1;
.source "SourceFile"


# instance fields
.field private final b:Landroidx/camera/core/impl/b0;

.field private final c:Landroidx/camera/core/impl/w1;


# direct methods
.method public constructor <init>(Landroidx/camera/core/impl/b0;Landroidx/camera/core/impl/w1;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/core/impl/a1;-><init>(Landroidx/camera/core/impl/b0;)V

    iput-object p1, p0, Landroidx/camera/core/impl/x1;->b:Landroidx/camera/core/impl/b0;

    iput-object p2, p0, Landroidx/camera/core/impl/x1;->c:Landroidx/camera/core/impl/w1;

    return-void
.end method


# virtual methods
.method public d()Z
    .locals 4

    iget-object v0, p0, Landroidx/camera/core/impl/x1;->c:Landroidx/camera/core/impl/w1;

    const/4 v1, 0x1

    new-array v1, v1, [I

    const/4 v2, 0x5

    const/4 v3, 0x0

    aput v2, v1, v3

    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/w1;->l([I)Z

    move-result v0

    if-nez v0, :cond_0

    return v3

    :cond_0
    iget-object v0, p0, Landroidx/camera/core/impl/x1;->b:Landroidx/camera/core/impl/b0;

    invoke-interface {v0}, Lw/o;->d()Z

    move-result v0

    return v0
.end method

.method public g()Landroidx/lifecycle/LiveData;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/LiveData<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/core/impl/x1;->c:Landroidx/camera/core/impl/w1;

    const/4 v1, 0x1

    new-array v1, v1, [I

    const/4 v2, 0x6

    const/4 v3, 0x0

    aput v2, v1, v3

    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/w1;->l([I)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Landroidx/lifecycle/r;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/lifecycle/r;-><init>(Ljava/lang/Object;)V

    return-object v0

    :cond_0
    iget-object v0, p0, Landroidx/camera/core/impl/x1;->b:Landroidx/camera/core/impl/b0;

    invoke-interface {v0}, Lw/o;->g()Landroidx/lifecycle/LiveData;

    move-result-object v0

    return-object v0
.end method

.method public h()Landroidx/camera/core/impl/b0;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/impl/x1;->b:Landroidx/camera/core/impl/b0;

    return-object v0
.end method

.method public j()Landroidx/lifecycle/LiveData;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/LiveData<",
            "Lw/k1;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/core/impl/x1;->c:Landroidx/camera/core/impl/w1;

    const/4 v1, 0x1

    new-array v1, v1, [I

    const/4 v2, 0x0

    aput v2, v1, v2

    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/w1;->l([I)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Landroidx/lifecycle/r;

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v2, v2, v1}, Lb0/f;->e(FFFF)Lw/k1;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/lifecycle/r;-><init>(Ljava/lang/Object;)V

    return-object v0

    :cond_0
    iget-object v0, p0, Landroidx/camera/core/impl/x1;->b:Landroidx/camera/core/impl/b0;

    invoke-interface {v0}, Lw/o;->j()Landroidx/lifecycle/LiveData;

    move-result-object v0

    return-object v0
.end method
