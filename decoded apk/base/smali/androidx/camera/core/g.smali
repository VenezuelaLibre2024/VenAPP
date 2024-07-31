.class public final synthetic Landroidx/camera/core/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/concurrent/futures/c$c;


# instance fields
.field public final synthetic a:Landroidx/camera/core/i;

.field public final synthetic b:Ljava/util/concurrent/Executor;

.field public final synthetic c:Landroidx/camera/core/o;

.field public final synthetic d:Landroid/graphics/Matrix;

.field public final synthetic e:Landroidx/camera/core/o;

.field public final synthetic f:Landroid/graphics/Rect;

.field public final synthetic g:Landroidx/camera/core/f$a;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/i;Ljava/util/concurrent/Executor;Landroidx/camera/core/o;Landroid/graphics/Matrix;Landroidx/camera/core/o;Landroid/graphics/Rect;Landroidx/camera/core/f$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/g;->a:Landroidx/camera/core/i;

    iput-object p2, p0, Landroidx/camera/core/g;->b:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Landroidx/camera/core/g;->c:Landroidx/camera/core/o;

    iput-object p4, p0, Landroidx/camera/core/g;->d:Landroid/graphics/Matrix;

    iput-object p5, p0, Landroidx/camera/core/g;->e:Landroidx/camera/core/o;

    iput-object p6, p0, Landroidx/camera/core/g;->f:Landroid/graphics/Rect;

    iput-object p7, p0, Landroidx/camera/core/g;->g:Landroidx/camera/core/f$a;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Landroidx/camera/core/g;->a:Landroidx/camera/core/i;

    iget-object v1, p0, Landroidx/camera/core/g;->b:Ljava/util/concurrent/Executor;

    iget-object v2, p0, Landroidx/camera/core/g;->c:Landroidx/camera/core/o;

    iget-object v3, p0, Landroidx/camera/core/g;->d:Landroid/graphics/Matrix;

    iget-object v4, p0, Landroidx/camera/core/g;->e:Landroidx/camera/core/o;

    iget-object v5, p0, Landroidx/camera/core/g;->f:Landroid/graphics/Rect;

    iget-object v6, p0, Landroidx/camera/core/g;->g:Landroidx/camera/core/f$a;

    move-object v7, p1

    invoke-static/range {v0 .. v7}, Landroidx/camera/core/i;->b(Landroidx/camera/core/i;Ljava/util/concurrent/Executor;Landroidx/camera/core/o;Landroid/graphics/Matrix;Landroidx/camera/core/o;Landroid/graphics/Rect;Landroidx/camera/core/f$a;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
