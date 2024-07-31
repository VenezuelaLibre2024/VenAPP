.class Ljh/g$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljh/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljh/g;


# direct methods
.method constructor <init>(Ljh/g;)V
    .locals 0

    iput-object p1, p0, Ljh/g$d;->a:Ljh/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    :try_start_0
    invoke-static {}, Ljh/g;->d()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Closing camera"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Ljh/g$d;->a:Ljh/g;

    invoke-static {v0}, Ljh/g;->e(Ljh/g;)Ljh/h;

    move-result-object v0

    invoke-virtual {v0}, Ljh/h;->v()V

    iget-object v0, p0, Ljh/g$d;->a:Ljh/g;

    invoke-static {v0}, Ljh/g;->e(Ljh/g;)Ljh/h;

    move-result-object v0

    invoke-virtual {v0}, Ljh/h;->d()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-static {}, Ljh/g;->d()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Failed to close camera"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    iget-object v0, p0, Ljh/g$d;->a:Ljh/g;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Ljh/g;->j(Ljh/g;Z)Z

    iget-object v0, p0, Ljh/g$d;->a:Ljh/g;

    invoke-static {v0}, Ljh/g;->g(Ljh/g;)Landroid/os/Handler;

    move-result-object v0

    sget v1, Lig/k;->c:I

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    iget-object v0, p0, Ljh/g$d;->a:Ljh/g;

    invoke-static {v0}, Ljh/g;->k(Ljh/g;)Ljh/k;

    move-result-object v0

    invoke-virtual {v0}, Ljh/k;->b()V

    return-void
.end method
