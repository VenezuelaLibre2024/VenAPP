.class public final synthetic Lb0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/core/util/a;


# instance fields
.field public final synthetic a:Landroid/view/Surface;

.field public final synthetic b:Landroid/graphics/SurfaceTexture;


# direct methods
.method public synthetic constructor <init>(Landroid/view/Surface;Landroid/graphics/SurfaceTexture;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb0/d;->a:Landroid/view/Surface;

    iput-object p2, p0, Lb0/d;->b:Landroid/graphics/SurfaceTexture;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lb0/d;->a:Landroid/view/Surface;

    iget-object v1, p0, Lb0/d;->b:Landroid/graphics/SurfaceTexture;

    check-cast p1, Lw/i1$g;

    invoke-static {v0, v1, p1}, Lb0/e;->k(Landroid/view/Surface;Landroid/graphics/SurfaceTexture;Lw/i1$g;)V

    return-void
.end method
