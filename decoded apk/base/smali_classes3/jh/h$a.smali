.class final Ljh/h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/hardware/Camera$PreviewCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljh/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field private a:Ljh/p;

.field private b:Lih/p;

.field final synthetic c:Ljh/h;


# direct methods
.method public constructor <init>(Ljh/h;)V
    .locals 0

    iput-object p1, p0, Ljh/h$a;->c:Ljh/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljh/p;)V
    .locals 0

    iput-object p1, p0, Ljh/h$a;->a:Ljh/p;

    return-void
.end method

.method public b(Lih/p;)V
    .locals 0

    iput-object p1, p0, Ljh/h$a;->b:Lih/p;

    return-void
.end method

.method public onPreviewFrame([BLandroid/hardware/Camera;)V
    .locals 8

    iget-object v0, p0, Ljh/h$a;->b:Lih/p;

    iget-object v1, p0, Ljh/h$a;->a:Ljh/p;

    if-eqz v0, :cond_2

    if-eqz v1, :cond_2

    if-eqz p1, :cond_1

    :try_start_0
    invoke-virtual {p2}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object p2

    invoke-virtual {p2}, Landroid/hardware/Camera$Parameters;->getPreviewFormat()I

    move-result v6

    new-instance p2, Lih/q;

    iget v4, v0, Lih/p;->a:I

    iget v5, v0, Lih/p;->b:I

    iget-object v0, p0, Ljh/h$a;->c:Ljh/h;

    invoke-virtual {v0}, Ljh/h;->f()I

    move-result v7

    move-object v2, p2

    move-object v3, p1

    invoke-direct/range {v2 .. v7}, Lih/q;-><init>([BIIII)V

    iget-object p1, p0, Ljh/h$a;->c:Ljh/h;

    invoke-static {p1}, Ljh/h;->a(Ljh/h;)Landroid/hardware/Camera$CameraInfo;

    move-result-object p1

    iget p1, p1, Landroid/hardware/Camera$CameraInfo;->facing:I

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    invoke-virtual {p2, v0}, Lih/q;->e(Z)V

    :cond_0
    invoke-interface {v1, p2}, Ljh/p;->a(Lih/q;)V

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "No preview data received"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    invoke-static {}, Ljh/h;->b()Ljava/lang/String;

    move-result-object p2

    const-string v0, "Camera preview failed"

    invoke-static {p2, v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1

    :cond_2
    invoke-static {}, Ljh/h;->b()Ljava/lang/String;

    move-result-object p1

    const-string p2, "Got preview callback, but no handler or resolution available"

    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz v1, :cond_3

    new-instance p1, Ljava/lang/Exception;

    const-string p2, "No resolution available"

    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    :goto_1
    invoke-interface {v1, p1}, Ljh/p;->b(Ljava/lang/Exception;)V

    :cond_3
    :goto_2
    return-void
.end method
