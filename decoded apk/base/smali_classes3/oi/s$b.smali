.class final Loi/s$b;
.super Lkotlin/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lok/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Loi/s;-><init>(Landroid/app/Activity;Lio/flutter/view/TextureRegistry;Lok/r;Lok/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/o;",
        "Lok/l<",
        "Ljava/util/List<",
        "Lxf/a;",
        ">;",
        "Lck/v;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Loi/s;

.field final synthetic b:Landroidx/camera/core/o;

.field final synthetic c:Landroid/media/Image;


# direct methods
.method constructor <init>(Loi/s;Landroidx/camera/core/o;Landroid/media/Image;)V
    .locals 0

    iput-object p1, p0, Loi/s$b;->a:Loi/s;

    iput-object p2, p0, Loi/s$b;->b:Landroidx/camera/core/o;

    iput-object p3, p0, Loi/s$b;->c:Landroid/media/Image;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/o;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lxf/a;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Loi/s$b;->a:Loi/s;

    invoke-static {v0}, Loi/s;->o(Loi/s;)Lpi/b;

    move-result-object v0

    sget-object v1, Lpi/b;->NO_DUPLICATES:Lpi/b;

    if-ne v0, v1, :cond_3

    invoke-static {p1}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lxf/a;

    invoke-virtual {v2}, Lxf/a;->l()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v1}, Ldk/p;->Z(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Loi/s$b;->a:Loi/s;

    invoke-static {v1}, Loi/s;->p(Loi/s;)Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    return-void

    :cond_2
    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_3

    iget-object v1, p0, Loi/s$b;->a:Loi/s;

    invoke-static {v1, v0}, Loi/s;->v(Loi/s;Ljava/util/List;)V

    :cond_3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lxf/a;

    iget-object v2, p0, Loi/s$b;->a:Loi/s;

    invoke-virtual {v2}, Loi/s;->F()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Loi/s$b;->a:Loi/s;

    invoke-virtual {v2}, Loi/s;->F()Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-static {v1}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    iget-object v4, p0, Loi/s$b;->b:Landroidx/camera/core/o;

    const-string v5, "$imageProxy"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v3, v1, v4}, Loi/s;->t(Loi/s;Ljava/util/List;Lxf/a;Landroidx/camera/core/o;)Z

    move-result v2

    if-nez v2, :cond_5

    goto :goto_1

    :cond_4
    invoke-static {v1}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    :cond_5
    invoke-static {v1}, Loi/a0;->m(Lxf/a;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_6
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_9

    iget-object p1, p0, Loi/s$b;->a:Loi/s;

    invoke-static {p1}, Loi/s;->s(Loi/s;)Z

    move-result p1

    if-eqz p1, :cond_8

    iget-object p1, p0, Loi/s$b;->c:Landroid/media/Image;

    invoke-virtual {p1}, Landroid/media/Image;->getWidth()I

    move-result p1

    iget-object v1, p0, Loi/s$b;->c:Landroid/media/Image;

    invoke-virtual {v1}, Landroid/media/Image;->getHeight()I

    move-result v1

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {p1, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object p1

    new-instance v1, Lqi/b;

    iget-object v2, p0, Loi/s$b;->a:Loi/s;

    invoke-static {v2}, Loi/s;->m(Loi/s;)Landroid/app/Activity;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "getApplicationContext(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, v2}, Lqi/b;-><init>(Landroid/content/Context;)V

    iget-object v2, p0, Loi/s$b;->c:Landroid/media/Image;

    invoke-static {p1}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-virtual {v1, v2, p1}, Lqi/b;->b(Landroid/media/Image;Landroid/graphics/Bitmap;)V

    iget-object v1, p0, Loi/s$b;->a:Loi/s;

    invoke-static {v1}, Loi/s;->n(Loi/s;)Lw/i;

    move-result-object v2

    if-eqz v2, :cond_7

    invoke-interface {v2}, Lw/i;->b()Lw/o;

    move-result-object v2

    if-eqz v2, :cond_7

    invoke-interface {v2}, Lw/o;->a()I

    move-result v2

    int-to-float v2, v2

    goto :goto_2

    :cond_7
    const/high16 v2, 0x42b40000    # 90.0f

    :goto_2
    invoke-static {v1, p1, v2}, Loi/s;->u(Loi/s;Landroid/graphics/Bitmap;F)Landroid/graphics/Bitmap;

    move-result-object p1

    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v3, 0x64

    invoke-virtual {p1, v2, v3, v1}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    iget-object p1, p0, Loi/s$b;->a:Loi/s;

    invoke-static {p1}, Loi/s;->q(Loi/s;)Lok/r;

    move-result-object p1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {p1, v0, v1, v2, v3}, Lok/r;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_8
    iget-object p1, p0, Loi/s$b;->a:Loi/s;

    invoke-static {p1}, Loi/s;->q(Loi/s;)Lok/r;

    move-result-object p1

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1, v1, v1}, Lok/r;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_9
    :goto_3
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Loi/s$b;->a(Ljava/util/List;)V

    sget-object p1, Lck/v;->a:Lck/v;

    return-object p1
.end method
