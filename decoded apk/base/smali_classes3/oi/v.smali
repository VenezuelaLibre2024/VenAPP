.class public final synthetic Loi/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lio/flutter/plugin/common/MethodChannel$Result;

.field public final synthetic b:Lpi/c;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugin/common/MethodChannel$Result;Lpi/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Loi/v;->a:Lio/flutter/plugin/common/MethodChannel$Result;

    iput-object p2, p0, Loi/v;->b:Lpi/c;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Loi/v;->a:Lio/flutter/plugin/common/MethodChannel$Result;

    iget-object v1, p0, Loi/v;->b:Lpi/c;

    invoke-static {v0, v1}, Loi/u$e;->a(Lio/flutter/plugin/common/MethodChannel$Result;Lpi/c;)V

    return-void
.end method
