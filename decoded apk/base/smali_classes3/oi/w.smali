.class public final synthetic Loi/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ljava/lang/Exception;

.field public final synthetic b:Lio/flutter/plugin/common/MethodChannel$Result;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Exception;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Loi/w;->a:Ljava/lang/Exception;

    iput-object p2, p0, Loi/w;->b:Lio/flutter/plugin/common/MethodChannel$Result;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Loi/w;->a:Ljava/lang/Exception;

    iget-object v1, p0, Loi/w;->b:Lio/flutter/plugin/common/MethodChannel$Result;

    invoke-static {v0, v1}, Loi/u$f;->a(Ljava/lang/Exception;Lio/flutter/plugin/common/MethodChannel$Result;)V

    return-void
.end method
