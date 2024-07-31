.class public final synthetic Lyh/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lio/flutter/plugin/common/MethodCall;

.field public final synthetic b:Lyh/i;

.field public final synthetic c:Lio/flutter/plugin/common/MethodChannel$Result;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugin/common/MethodCall;Lyh/i;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyh/z;->a:Lio/flutter/plugin/common/MethodCall;

    iput-object p2, p0, Lyh/z;->b:Lyh/i;

    iput-object p3, p0, Lyh/z;->c:Lio/flutter/plugin/common/MethodChannel$Result;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lyh/z;->a:Lio/flutter/plugin/common/MethodCall;

    iget-object v1, p0, Lyh/z;->b:Lyh/i;

    iget-object v2, p0, Lyh/z;->c:Lio/flutter/plugin/common/MethodChannel$Result;

    invoke-static {v0, v1, v2}, Lyh/b0;->h(Lio/flutter/plugin/common/MethodCall;Lyh/i;Lio/flutter/plugin/common/MethodChannel$Result;)V

    return-void
.end method
