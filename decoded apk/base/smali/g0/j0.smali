.class public final synthetic Lg0/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La0/a;


# instance fields
.field public final synthetic a:Lg0/n0;

.field public final synthetic b:Lg0/n0$a;

.field public final synthetic c:I

.field public final synthetic d:Landroid/util/Size;

.field public final synthetic e:Landroid/graphics/Rect;

.field public final synthetic f:I

.field public final synthetic g:Z

.field public final synthetic h:Landroidx/camera/core/impl/c0;


# direct methods
.method public synthetic constructor <init>(Lg0/n0;Lg0/n0$a;ILandroid/util/Size;Landroid/graphics/Rect;IZLandroidx/camera/core/impl/c0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg0/j0;->a:Lg0/n0;

    iput-object p2, p0, Lg0/j0;->b:Lg0/n0$a;

    iput p3, p0, Lg0/j0;->c:I

    iput-object p4, p0, Lg0/j0;->d:Landroid/util/Size;

    iput-object p5, p0, Lg0/j0;->e:Landroid/graphics/Rect;

    iput p6, p0, Lg0/j0;->f:I

    iput-boolean p7, p0, Lg0/j0;->g:Z

    iput-object p8, p0, Lg0/j0;->h:Landroidx/camera/core/impl/c0;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Lcom/google/common/util/concurrent/f;
    .locals 9

    iget-object v0, p0, Lg0/j0;->a:Lg0/n0;

    iget-object v1, p0, Lg0/j0;->b:Lg0/n0$a;

    iget v2, p0, Lg0/j0;->c:I

    iget-object v3, p0, Lg0/j0;->d:Landroid/util/Size;

    iget-object v4, p0, Lg0/j0;->e:Landroid/graphics/Rect;

    iget v5, p0, Lg0/j0;->f:I

    iget-boolean v6, p0, Lg0/j0;->g:Z

    iget-object v7, p0, Lg0/j0;->h:Landroidx/camera/core/impl/c0;

    move-object v8, p1

    check-cast v8, Landroid/view/Surface;

    invoke-static/range {v0 .. v8}, Lg0/n0;->b(Lg0/n0;Lg0/n0$a;ILandroid/util/Size;Landroid/graphics/Rect;IZLandroidx/camera/core/impl/c0;Landroid/view/Surface;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    return-object p1
.end method
