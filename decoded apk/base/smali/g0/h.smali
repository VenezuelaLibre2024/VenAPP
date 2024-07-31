.class public final synthetic Lg0/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/core/util/a;


# instance fields
.field public final synthetic a:Lg0/u;

.field public final synthetic b:Landroid/graphics/SurfaceTexture;

.field public final synthetic c:Landroid/view/Surface;


# direct methods
.method public synthetic constructor <init>(Lg0/u;Landroid/graphics/SurfaceTexture;Landroid/view/Surface;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg0/h;->a:Lg0/u;

    iput-object p2, p0, Lg0/h;->b:Landroid/graphics/SurfaceTexture;

    iput-object p3, p0, Lg0/h;->c:Landroid/view/Surface;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lg0/h;->a:Lg0/u;

    iget-object v1, p0, Lg0/h;->b:Landroid/graphics/SurfaceTexture;

    iget-object v2, p0, Lg0/h;->c:Landroid/view/Surface;

    check-cast p1, Lw/i1$g;

    invoke-static {v0, v1, v2, p1}, Lg0/u;->j(Lg0/u;Landroid/graphics/SurfaceTexture;Landroid/view/Surface;Lw/i1$g;)V

    return-void
.end method
