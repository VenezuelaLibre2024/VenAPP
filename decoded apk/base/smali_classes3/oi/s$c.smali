.class public final Loi/s$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/hardware/display/DisplayManager$DisplayListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Loi/s;->M(Lvf/b;ZLw/p;ZLpi/b;Lok/l;Lok/l;Lok/l;Lok/l;JLandroid/util/Size;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Landroid/util/Size;

.field final synthetic c:Landroidx/camera/core/f$c;

.field final synthetic d:Loi/s;


# direct methods
.method constructor <init>(ZLandroid/util/Size;Landroidx/camera/core/f$c;Loi/s;)V
    .locals 0

    iput-boolean p1, p0, Loi/s$c;->a:Z

    iput-object p2, p0, Loi/s$c;->b:Landroid/util/Size;

    iput-object p3, p0, Loi/s$c;->c:Landroidx/camera/core/f$c;

    iput-object p4, p0, Loi/s$c;->d:Loi/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDisplayAdded(I)V
    .locals 0

    return-void
.end method

.method public onDisplayChanged(I)V
    .locals 3

    iget-boolean p1, p0, Loi/s$c;->a:Z

    if-eqz p1, :cond_0

    new-instance p1, Lh0/c$a;

    invoke-direct {p1}, Lh0/c$a;-><init>()V

    new-instance v0, Lh0/d;

    iget-object v1, p0, Loi/s$c;->b:Landroid/util/Size;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lh0/d;-><init>(Landroid/util/Size;I)V

    invoke-virtual {p1, v0}, Lh0/c$a;->e(Lh0/d;)Lh0/c$a;

    iget-object v0, p0, Loi/s$c;->c:Landroidx/camera/core/f$c;

    invoke-virtual {p1}, Lh0/c$a;->a()Lh0/c;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/camera/core/f$c;->j(Lh0/c;)Landroidx/camera/core/f$c;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/camera/core/f$c;->c()Landroidx/camera/core/f;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Loi/s$c;->c:Landroidx/camera/core/f$c;

    iget-object v0, p0, Loi/s$c;->d:Loi/s;

    iget-object v1, p0, Loi/s$c;->b:Landroid/util/Size;

    invoke-static {v0, v1}, Loi/s;->r(Loi/s;Landroid/util/Size;)Landroid/util/Size;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/camera/core/f$c;->o(Landroid/util/Size;)Landroidx/camera/core/f$c;

    :goto_0
    return-void
.end method

.method public onDisplayRemoved(I)V
    .locals 0

    return-void
.end method
