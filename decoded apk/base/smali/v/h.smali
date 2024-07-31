.class public final Lv/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroidx/camera/camera2/internal/n0;


# direct methods
.method public constructor <init>(Landroidx/camera/camera2/internal/n0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv/h;->a:Landroidx/camera/camera2/internal/n0;

    return-void
.end method

.method public static a(Lw/o;)Lv/h;
    .locals 2

    check-cast p0, Landroidx/camera/core/impl/b0;

    invoke-interface {p0}, Landroidx/camera/core/impl/b0;->h()Landroidx/camera/core/impl/b0;

    move-result-object p0

    instance-of v0, p0, Landroidx/camera/camera2/internal/n0;

    const-string v1, "CameraInfo doesn\'t contain Camera2 implementation."

    invoke-static {v0, v1}, Landroidx/core/util/h;->b(ZLjava/lang/Object;)V

    check-cast p0, Landroidx/camera/camera2/internal/n0;

    invoke-virtual {p0}, Landroidx/camera/camera2/internal/n0;->k()Lv/h;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lv/h;->a:Landroidx/camera/camera2/internal/n0;

    invoke-virtual {v0}, Landroidx/camera/camera2/internal/n0;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
