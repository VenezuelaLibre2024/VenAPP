.class public final synthetic Lc3/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc3/q$b;


# instance fields
.field public final synthetic a:Lio/flutter/plugin/common/MethodChannel$Result;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc3/f;->a:Lio/flutter/plugin/common/MethodChannel$Result;

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Map;)V
    .locals 1

    iget-object v0, p0, Lc3/f;->a:Lio/flutter/plugin/common/MethodChannel$Result;

    invoke-interface {v0, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void
.end method
