.class public final synthetic Lw/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/e$a;


# instance fields
.field public final synthetic a:Landroidx/camera/core/o;

.field public final synthetic b:Landroidx/camera/core/o;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/o;Landroidx/camera/core/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw/j0;->a:Landroidx/camera/core/o;

    iput-object p2, p0, Lw/j0;->b:Landroidx/camera/core/o;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/camera/core/o;)V
    .locals 2

    iget-object v0, p0, Lw/j0;->a:Landroidx/camera/core/o;

    iget-object v1, p0, Lw/j0;->b:Landroidx/camera/core/o;

    invoke-static {v0, v1, p1}, Landroidx/camera/core/ImageProcessingUtil;->a(Landroidx/camera/core/o;Landroidx/camera/core/o;Landroidx/camera/core/o;)V

    return-void
.end method
