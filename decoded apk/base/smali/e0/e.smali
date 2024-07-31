.class public Le0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-class v0, Ld0/i;

    invoke-static {v0}, Ld0/b;->a(Ljava/lang/Class;)Landroidx/camera/core/impl/s1;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Le0/e;->a:Z

    return-void
.end method

.method public static synthetic a(Le0/e;Landroidx/camera/core/impl/y1$e;Landroidx/camera/core/impl/y1$e;)I
    .locals 0

    invoke-direct {p0, p1, p2}, Le0/e;->c(Landroidx/camera/core/impl/y1$e;Landroidx/camera/core/impl/y1$e;)I

    move-result p0

    return p0
.end method

.method private b(Landroidx/camera/core/impl/r0;)I
    .locals 2

    invoke-virtual {p1}, Landroidx/camera/core/impl/r0;->g()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Landroid/media/MediaCodec;

    if-ne v0, v1, :cond_0

    const/4 p1, 0x2

    return p1

    :cond_0
    invoke-virtual {p1}, Landroidx/camera/core/impl/r0;->g()Ljava/lang/Class;

    move-result-object p1

    const-class v0, Landroidx/camera/core/s;

    if-ne p1, v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method private synthetic c(Landroidx/camera/core/impl/y1$e;Landroidx/camera/core/impl/y1$e;)I
    .locals 0

    invoke-virtual {p1}, Landroidx/camera/core/impl/y1$e;->e()Landroidx/camera/core/impl/r0;

    move-result-object p1

    invoke-direct {p0, p1}, Le0/e;->b(Landroidx/camera/core/impl/r0;)I

    move-result p1

    invoke-virtual {p2}, Landroidx/camera/core/impl/y1$e;->e()Landroidx/camera/core/impl/r0;

    move-result-object p2

    invoke-direct {p0, p2}, Le0/e;->b(Landroidx/camera/core/impl/r0;)I

    move-result p2

    sub-int/2addr p1, p2

    return p1
.end method


# virtual methods
.method public d(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/y1$e;",
            ">;)V"
        }
    .end annotation

    iget-boolean v0, p0, Le0/e;->a:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Le0/d;

    invoke-direct {v0, p0}, Le0/d;-><init>(Le0/e;)V

    invoke-static {p1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    return-void
.end method
