.class public final Loi/x$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Loi/x$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Loi/x;->e(Landroid/app/Activity;Lok/l;Loi/x$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Loi/x;

.field final synthetic b:Loi/x$b;


# direct methods
.method constructor <init>(Loi/x;Loi/x$b;)V
    .locals 0

    iput-object p1, p0, Loi/x$c;->a:Loi/x;

    iput-object p2, p0, Loi/x$c;->b:Loi/x$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Loi/x$c;->a:Loi/x;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Loi/x;->b(Loi/x;Z)V

    iget-object v0, p0, Loi/x$c;->a:Loi/x;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Loi/x;->a(Loi/x;Lio/flutter/plugin/common/PluginRegistry$RequestPermissionsResultListener;)V

    iget-object v0, p0, Loi/x$c;->b:Loi/x$b;

    invoke-interface {v0, p1, p2}, Loi/x$b;->onResult(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
