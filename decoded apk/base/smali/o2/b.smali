.class Lo2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li4/o;
.implements Lio/flutter/plugin/common/PluginRegistry$ActivityResultListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Li4/o<",
        "Lcom/facebook/login/g0;",
        ">;",
        "Lio/flutter/plugin/common/PluginRegistry$ActivityResultListener;"
    }
.end annotation


# instance fields
.field private final a:Li4/m;

.field private b:Lio/flutter/plugin/common/MethodChannel$Result;


# direct methods
.method constructor <init>(Li4/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo2/b;->a:Li4/m;

    return-void
.end method


# virtual methods
.method public a(Li4/r;)V
    .locals 1

    const-string v0, "FAILED"

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lo2/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lo2/b;->b:Lio/flutter/plugin/common/MethodChannel$Result;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-interface {v0, p1, p2, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    iput-object v1, p0, Lo2/b;->b:Lio/flutter/plugin/common/MethodChannel$Result;

    :cond_0
    return-void
.end method

.method c(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lo2/b;->b:Lio/flutter/plugin/common/MethodChannel$Result;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lo2/b;->b:Lio/flutter/plugin/common/MethodChannel$Result;

    :cond_0
    return-void
.end method

.method public d(Lcom/facebook/login/g0;)V
    .locals 0

    invoke-virtual {p1}, Lcom/facebook/login/g0;->a()Li4/a;

    move-result-object p1

    invoke-static {p1}, Lo2/a;->b(Li4/a;)Ljava/util/HashMap;

    move-result-object p1

    invoke-virtual {p0, p1}, Lo2/b;->c(Ljava/lang/Object;)V

    return-void
.end method

.method e(Lio/flutter/plugin/common/MethodChannel$Result;)Z
    .locals 3

    iget-object v0, p0, Lo2/b;->b:Lio/flutter/plugin/common/MethodChannel$Result;

    if-eqz v0, :cond_0

    const-string v0, "The method login was called while another Facebook operation was in progress."

    const/4 v1, 0x0

    const-string v2, "OPERATION_IN_PROGRESS"

    invoke-interface {p1, v2, v0, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    const/4 p1, 0x0

    return p1

    :cond_0
    iput-object p1, p0, Lo2/b;->b:Lio/flutter/plugin/common/MethodChannel$Result;

    const/4 p1, 0x1

    return p1
.end method

.method public onActivityResult(IILandroid/content/Intent;)Z
    .locals 1

    iget-object v0, p0, Lo2/b;->a:Li4/m;

    invoke-interface {v0, p1, p2, p3}, Li4/m;->onActivityResult(IILandroid/content/Intent;)Z

    move-result p1

    return p1
.end method

.method public onCancel()V
    .locals 2

    const-string v0, "CANCELLED"

    const-string v1, "User has cancelled login with facebook"

    invoke-virtual {p0, v0, v1}, Lo2/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/facebook/login/g0;

    invoke-virtual {p0, p1}, Lo2/b;->d(Lcom/facebook/login/g0;)V

    return-void
.end method
