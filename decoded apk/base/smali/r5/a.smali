.class public final synthetic Lr5/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugin/common/PluginRegistry$RequestPermissionsResultListener;


# instance fields
.field public final synthetic a:Ly5/c;


# direct methods
.method public synthetic constructor <init>(Ly5/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr5/a;->a:Ly5/c;

    return-void
.end method


# virtual methods
.method public final onRequestPermissionsResult(I[Ljava/lang/String;[I)Z
    .locals 1

    iget-object v0, p0, Lr5/a;->a:Ly5/c;

    invoke-static {v0, p1, p2, p3}, Lr5/b$a;->a(Ly5/c;I[Ljava/lang/String;[I)Z

    move-result p1

    return p1
.end method
