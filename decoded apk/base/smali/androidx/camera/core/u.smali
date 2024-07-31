.class public final Landroidx/camera/core/u;
.super Landroidx/camera/core/e;
.source "SourceFile"


# instance fields
.field private final d:Ljava/lang/Object;

.field private final e:Lw/h0;

.field private f:Landroid/graphics/Rect;

.field private final r:I

.field private final s:I


# direct methods
.method public constructor <init>(Landroidx/camera/core/o;Landroid/util/Size;Lw/h0;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/core/e;-><init>(Landroidx/camera/core/o;)V

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/u;->d:Ljava/lang/Object;

    if-nez p2, :cond_0

    invoke-super {p0}, Landroidx/camera/core/e;->getWidth()I

    move-result p1

    iput p1, p0, Landroidx/camera/core/u;->r:I

    invoke-super {p0}, Landroidx/camera/core/e;->getHeight()I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Landroid/util/Size;->getWidth()I

    move-result p1

    iput p1, p0, Landroidx/camera/core/u;->r:I

    invoke-virtual {p2}, Landroid/util/Size;->getHeight()I

    move-result p1

    :goto_0
    iput p1, p0, Landroidx/camera/core/u;->s:I

    iput-object p3, p0, Landroidx/camera/core/u;->e:Lw/h0;

    return-void
.end method

.method constructor <init>(Landroidx/camera/core/o;Lw/h0;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, p2}, Landroidx/camera/core/u;-><init>(Landroidx/camera/core/o;Landroid/util/Size;Lw/h0;)V

    return-void
.end method


# virtual methods
.method public Z(Landroid/graphics/Rect;)V
    .locals 3

    if-eqz p1, :cond_1

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0, p1}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    invoke-virtual {p0}, Landroidx/camera/core/u;->getWidth()I

    move-result p1

    invoke-virtual {p0}, Landroidx/camera/core/u;->getHeight()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v2, p1, v1}, Landroid/graphics/Rect;->intersect(IIII)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {v0}, Landroid/graphics/Rect;->setEmpty()V

    :cond_0
    move-object p1, v0

    :cond_1
    iget-object v0, p0, Landroidx/camera/core/u;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Landroidx/camera/core/u;->f:Landroid/graphics/Rect;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public e1()Lw/h0;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/u;->e:Lw/h0;

    return-object v0
.end method

.method public getHeight()I
    .locals 1

    iget v0, p0, Landroidx/camera/core/u;->s:I

    return v0
.end method

.method public getWidth()I
    .locals 1

    iget v0, p0, Landroidx/camera/core/u;->r:I

    return v0
.end method
