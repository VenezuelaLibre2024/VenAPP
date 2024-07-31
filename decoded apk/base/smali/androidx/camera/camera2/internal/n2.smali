.class Landroidx/camera/camera2/internal/n2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/camera2/internal/n2$b;,
        Landroidx/camera/camera2/internal/n2$c;
    }
.end annotation


# instance fields
.field private a:Landroidx/camera/core/impl/r0;

.field private b:Landroidx/camera/core/impl/y1;

.field private final c:Landroidx/camera/camera2/internal/n2$b;

.field private final d:Landroid/util/Size;

.field private final e:Lt/s;

.field private final f:Landroidx/camera/camera2/internal/n2$c;


# direct methods
.method constructor <init>(Landroidx/camera/camera2/internal/compat/d0;Landroidx/camera/camera2/internal/c2;Landroidx/camera/camera2/internal/n2$c;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lt/s;

    invoke-direct {v0}, Lt/s;-><init>()V

    iput-object v0, p0, Landroidx/camera/camera2/internal/n2;->e:Lt/s;

    new-instance v0, Landroidx/camera/camera2/internal/n2$b;

    invoke-direct {v0}, Landroidx/camera/camera2/internal/n2$b;-><init>()V

    iput-object v0, p0, Landroidx/camera/camera2/internal/n2;->c:Landroidx/camera/camera2/internal/n2$b;

    iput-object p3, p0, Landroidx/camera/camera2/internal/n2;->f:Landroidx/camera/camera2/internal/n2$c;

    invoke-direct {p0, p1, p2}, Landroidx/camera/camera2/internal/n2;->f(Landroidx/camera/camera2/internal/compat/d0;Landroidx/camera/camera2/internal/c2;)Landroid/util/Size;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/camera2/internal/n2;->d:Landroid/util/Size;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "MeteringSession SurfaceTexture size: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "MeteringRepeating"

    invoke-static {p2, p1}, Lw/o0;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/camera/camera2/internal/n2;->d()Landroidx/camera/core/impl/y1;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/camera2/internal/n2;->b:Landroidx/camera/core/impl/y1;

    return-void
.end method

.method public static synthetic a(Landroid/util/Size;Landroid/util/Size;)I
    .locals 0

    invoke-static {p0, p1}, Landroidx/camera/camera2/internal/n2;->j(Landroid/util/Size;Landroid/util/Size;)I

    move-result p0

    return p0
.end method

.method public static synthetic b(Landroidx/camera/camera2/internal/n2;Landroidx/camera/core/impl/y1;Landroidx/camera/core/impl/y1$f;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/camera/camera2/internal/n2;->i(Landroidx/camera/core/impl/y1;Landroidx/camera/core/impl/y1$f;)V

    return-void
.end method

.method private f(Landroidx/camera/camera2/internal/compat/d0;Landroidx/camera/camera2/internal/c2;)Landroid/util/Size;
    .locals 11

    invoke-virtual {p1}, Landroidx/camera/camera2/internal/compat/d0;->b()Landroidx/camera/camera2/internal/compat/z0;

    move-result-object p1

    const/16 v0, 0x22

    invoke-virtual {p1, v0}, Landroidx/camera/camera2/internal/compat/z0;->b(I)[Landroid/util/Size;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    const-string p1, "MeteringRepeating"

    const-string p2, "Can not get output size list."

    invoke-static {p1, p2}, Lw/o0;->c(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Landroid/util/Size;

    invoke-direct {p1, v0, v0}, Landroid/util/Size;-><init>(II)V

    return-object p1

    :cond_0
    iget-object v1, p0, Landroidx/camera/camera2/internal/n2;->e:Lt/s;

    invoke-virtual {v1, p1}, Lt/s;->a([Landroid/util/Size;)[Landroid/util/Size;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    new-instance v2, Landroidx/camera/camera2/internal/m2;

    invoke-direct {v2}, Landroidx/camera/camera2/internal/m2;-><init>()V

    invoke-static {v1, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    invoke-virtual {p2}, Landroidx/camera/camera2/internal/c2;->f()Landroid/util/Size;

    move-result-object p2

    invoke-virtual {p2}, Landroid/util/Size;->getWidth()I

    move-result v2

    int-to-long v2, v2

    invoke-virtual {p2}, Landroid/util/Size;->getHeight()I

    move-result p2

    int-to-long v4, p2

    mul-long/2addr v2, v4

    const-wide/32 v4, 0x4b000

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    array-length p2, p1

    const/4 v4, 0x0

    move v5, v0

    :goto_0
    if-ge v5, p2, :cond_3

    aget-object v6, p1, v5

    invoke-virtual {v6}, Landroid/util/Size;->getWidth()I

    move-result v7

    int-to-long v7, v7

    invoke-virtual {v6}, Landroid/util/Size;->getHeight()I

    move-result v9

    int-to-long v9, v9

    mul-long/2addr v7, v9

    cmp-long v7, v7, v2

    if-nez v7, :cond_1

    return-object v6

    :cond_1
    if-lez v7, :cond_2

    if-eqz v4, :cond_3

    return-object v4

    :cond_2
    add-int/lit8 v5, v5, 0x1

    move-object v4, v6

    goto :goto_0

    :cond_3
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/util/Size;

    return-object p1
.end method

.method private synthetic i(Landroidx/camera/core/impl/y1;Landroidx/camera/core/impl/y1$f;)V
    .locals 0

    invoke-virtual {p0}, Landroidx/camera/camera2/internal/n2;->d()Landroidx/camera/core/impl/y1;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/camera2/internal/n2;->b:Landroidx/camera/core/impl/y1;

    iget-object p1, p0, Landroidx/camera/camera2/internal/n2;->f:Landroidx/camera/camera2/internal/n2$c;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Landroidx/camera/camera2/internal/n2$c;->a()V

    :cond_0
    return-void
.end method

.method private static synthetic j(Landroid/util/Size;Landroid/util/Size;)I
    .locals 4

    invoke-virtual {p0}, Landroid/util/Size;->getWidth()I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p0}, Landroid/util/Size;->getHeight()I

    move-result p0

    int-to-long v2, p0

    mul-long/2addr v0, v2

    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    move-result p0

    int-to-long v2, p0

    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    move-result p0

    int-to-long p0, p0

    mul-long/2addr v2, p0

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->signum(J)I

    move-result p0

    return p0
.end method


# virtual methods
.method c()V
    .locals 2

    const-string v0, "MeteringRepeating"

    const-string v1, "MeteringRepeating clear!"

    invoke-static {v0, v1}, Lw/o0;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/camera/camera2/internal/n2;->a:Landroidx/camera/core/impl/r0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/camera/core/impl/r0;->d()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/camera/camera2/internal/n2;->a:Landroidx/camera/core/impl/r0;

    return-void
.end method

.method d()Landroidx/camera/core/impl/y1;
    .locals 5

    new-instance v0, Landroid/graphics/SurfaceTexture;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroid/graphics/SurfaceTexture;-><init>(I)V

    iget-object v1, p0, Landroidx/camera/camera2/internal/n2;->d:Landroid/util/Size;

    invoke-virtual {v1}, Landroid/util/Size;->getWidth()I

    move-result v1

    iget-object v2, p0, Landroidx/camera/camera2/internal/n2;->d:Landroid/util/Size;

    invoke-virtual {v2}, Landroid/util/Size;->getHeight()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/SurfaceTexture;->setDefaultBufferSize(II)V

    new-instance v1, Landroid/view/Surface;

    invoke-direct {v1, v0}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    iget-object v2, p0, Landroidx/camera/camera2/internal/n2;->c:Landroidx/camera/camera2/internal/n2$b;

    iget-object v3, p0, Landroidx/camera/camera2/internal/n2;->d:Landroid/util/Size;

    invoke-static {v2, v3}, Landroidx/camera/core/impl/y1$b;->p(Landroidx/camera/core/impl/k2;Landroid/util/Size;)Landroidx/camera/core/impl/y1$b;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Landroidx/camera/core/impl/y1$b;->t(I)Landroidx/camera/core/impl/y1$b;

    new-instance v3, Landroidx/camera/core/impl/h1;

    invoke-direct {v3, v1}, Landroidx/camera/core/impl/h1;-><init>(Landroid/view/Surface;)V

    iput-object v3, p0, Landroidx/camera/camera2/internal/n2;->a:Landroidx/camera/core/impl/r0;

    invoke-virtual {v3}, Landroidx/camera/core/impl/r0;->k()Lcom/google/common/util/concurrent/f;

    move-result-object v3

    new-instance v4, Landroidx/camera/camera2/internal/n2$a;

    invoke-direct {v4, p0, v1, v0}, Landroidx/camera/camera2/internal/n2$a;-><init>(Landroidx/camera/camera2/internal/n2;Landroid/view/Surface;Landroid/graphics/SurfaceTexture;)V

    invoke-static {}, Lz/a;->a()Ljava/util/concurrent/Executor;

    move-result-object v0

    invoke-static {v3, v4, v0}, La0/f;->b(Lcom/google/common/util/concurrent/f;La0/c;Ljava/util/concurrent/Executor;)V

    iget-object v0, p0, Landroidx/camera/camera2/internal/n2;->a:Landroidx/camera/core/impl/r0;

    invoke-virtual {v2, v0}, Landroidx/camera/core/impl/y1$b;->l(Landroidx/camera/core/impl/r0;)Landroidx/camera/core/impl/y1$b;

    new-instance v0, Landroidx/camera/camera2/internal/l2;

    invoke-direct {v0, p0}, Landroidx/camera/camera2/internal/l2;-><init>(Landroidx/camera/camera2/internal/n2;)V

    invoke-virtual {v2, v0}, Landroidx/camera/core/impl/y1$b;->f(Landroidx/camera/core/impl/y1$c;)Landroidx/camera/core/impl/y1$b;

    invoke-virtual {v2}, Landroidx/camera/core/impl/y1$b;->o()Landroidx/camera/core/impl/y1;

    move-result-object v0

    return-object v0
.end method

.method e()Ljava/lang/String;
    .locals 1

    const-string v0, "MeteringRepeating"

    return-object v0
.end method

.method g()Landroidx/camera/core/impl/y1;
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/n2;->b:Landroidx/camera/core/impl/y1;

    return-object v0
.end method

.method h()Landroidx/camera/core/impl/k2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/camera/core/impl/k2<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/camera2/internal/n2;->c:Landroidx/camera/camera2/internal/n2$b;

    return-object v0
.end method
