.class Lo2/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li4/r0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo2/a;->a(Landroid/app/Activity;Lio/flutter/plugin/common/MethodChannel$Result;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lio/flutter/plugin/common/MethodChannel$Result;

.field final synthetic b:Lo2/a;


# direct methods
.method constructor <init>(Lo2/a;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lo2/a$a;->b:Lo2/a;

    iput-object p2, p0, Lo2/a$a;->a:Lio/flutter/plugin/common/MethodChannel$Result;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    iget-object v0, p0, Lo2/a$a;->a:Lio/flutter/plugin/common/MethodChannel$Result;

    const-string v1, "User has cancelled login with facebook"

    const/4 v2, 0x0

    const-string v3, "CANCELLED"

    invoke-interface {v0, v3, v1, v2}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public b(Li4/a;)V
    .locals 1

    invoke-static {p1}, Lo2/a;->b(Li4/a;)Ljava/util/HashMap;

    move-result-object p1

    iget-object v0, p0, Lo2/a$a;->a:Lio/flutter/plugin/common/MethodChannel$Result;

    invoke-interface {v0, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void
.end method

.method public c(Ljava/lang/Exception;)V
    .locals 3

    iget-object v0, p0, Lo2/a$a;->a:Lio/flutter/plugin/common/MethodChannel$Result;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    const-string v2, "FAILED"

    invoke-interface {v0, v2, p1, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
