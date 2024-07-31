.class public abstract Landroidx/camera/core/impl/b2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/impl/b2$a;
    }
.end annotation


# static fields
.field public static final a:Landroid/util/Range;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroid/util/Range;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1, v1}, Landroid/util/Range;-><init>(Ljava/lang/Comparable;Ljava/lang/Comparable;)V

    sput-object v0, Landroidx/camera/core/impl/b2;->a:Landroid/util/Range;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/util/Size;)Landroidx/camera/core/impl/b2$a;
    .locals 1

    new-instance v0, Landroidx/camera/core/impl/h$b;

    invoke-direct {v0}, Landroidx/camera/core/impl/h$b;-><init>()V

    invoke-virtual {v0, p0}, Landroidx/camera/core/impl/h$b;->e(Landroid/util/Size;)Landroidx/camera/core/impl/b2$a;

    move-result-object p0

    sget-object v0, Landroidx/camera/core/impl/b2;->a:Landroid/util/Range;

    invoke-virtual {p0, v0}, Landroidx/camera/core/impl/b2$a;->c(Landroid/util/Range;)Landroidx/camera/core/impl/b2$a;

    move-result-object p0

    sget-object v0, Lw/y;->d:Lw/y;

    invoke-virtual {p0, v0}, Landroidx/camera/core/impl/b2$a;->b(Lw/y;)Landroidx/camera/core/impl/b2$a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract b()Lw/y;
.end method

.method public abstract c()Landroid/util/Range;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end method

.method public abstract d()Landroidx/camera/core/impl/n0;
.end method

.method public abstract e()Landroid/util/Size;
.end method

.method public abstract f()Landroidx/camera/core/impl/b2$a;
.end method
