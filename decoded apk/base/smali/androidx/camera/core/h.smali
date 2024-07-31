.class public final synthetic Landroidx/camera/core/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroidx/camera/core/i;

.field public final synthetic b:Landroidx/camera/core/o;

.field public final synthetic c:Landroid/graphics/Matrix;

.field public final synthetic d:Landroidx/camera/core/o;

.field public final synthetic e:Landroid/graphics/Rect;

.field public final synthetic f:Landroidx/camera/core/f$a;

.field public final synthetic r:Landroidx/concurrent/futures/c$a;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/i;Landroidx/camera/core/o;Landroid/graphics/Matrix;Landroidx/camera/core/o;Landroid/graphics/Rect;Landroidx/camera/core/f$a;Landroidx/concurrent/futures/c$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/h;->a:Landroidx/camera/core/i;

    iput-object p2, p0, Landroidx/camera/core/h;->b:Landroidx/camera/core/o;

    iput-object p3, p0, Landroidx/camera/core/h;->c:Landroid/graphics/Matrix;

    iput-object p4, p0, Landroidx/camera/core/h;->d:Landroidx/camera/core/o;

    iput-object p5, p0, Landroidx/camera/core/h;->e:Landroid/graphics/Rect;

    iput-object p6, p0, Landroidx/camera/core/h;->f:Landroidx/camera/core/f$a;

    iput-object p7, p0, Landroidx/camera/core/h;->r:Landroidx/concurrent/futures/c$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    iget-object v0, p0, Landroidx/camera/core/h;->a:Landroidx/camera/core/i;

    iget-object v1, p0, Landroidx/camera/core/h;->b:Landroidx/camera/core/o;

    iget-object v2, p0, Landroidx/camera/core/h;->c:Landroid/graphics/Matrix;

    iget-object v3, p0, Landroidx/camera/core/h;->d:Landroidx/camera/core/o;

    iget-object v4, p0, Landroidx/camera/core/h;->e:Landroid/graphics/Rect;

    iget-object v5, p0, Landroidx/camera/core/h;->f:Landroidx/camera/core/f$a;

    iget-object v6, p0, Landroidx/camera/core/h;->r:Landroidx/concurrent/futures/c$a;

    invoke-static/range {v0 .. v6}, Landroidx/camera/core/i;->c(Landroidx/camera/core/i;Landroidx/camera/core/o;Landroid/graphics/Matrix;Landroidx/camera/core/o;Landroid/graphics/Rect;Landroidx/camera/core/f$a;Landroidx/concurrent/futures/c$a;)V

    return-void
.end method
